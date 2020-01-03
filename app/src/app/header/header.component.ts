import { Component, OnInit } from '@angular/core';
import {ViewEncapsulation} from '@angular/core';
import {JwksValidationHandler, OAuthService} from 'angular-oauth2-oidc';
import {authConfig} from '../config/oAuth.config';
import {ActivatedRoute} from '@angular/router';
import {ContactService} from '../services/contact.service';
import {User} from '../model/user.model';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
  encapsulation: ViewEncapsulation.Emulated
})
export class HeaderComponent implements OnInit {

  private fragment: any;

  connectedUser: User;

  constructor(private oauthService: OAuthService, private contactService: ContactService, private route: ActivatedRoute) {
    this.configure();
  }

  ngOnInit() {
    this.route.fragment.subscribe(fragment => {
      this.fragment = fragment;
      this.contactService.getConnectedUser().subscribe(user => {
        this.connectedUser = user;
      });
      console.log('********* Id_token: ' + this.oauthService.getIdToken());
      console.log('********* Access_token: ' + this.oauthService.getAccessToken());
      console.log('********* Granted scope: ' + this.oauthService.getGrantedScopes());
      console.log('********* Valid access_token: ' + this.oauthService.hasValidAccessToken());
    });
  }

  private configure() {
    this.oauthService.configure(authConfig);
    this.oauthService.tokenValidationHandler = new JwksValidationHandler();
    this.oauthService.loadDiscoveryDocumentAndTryLogin();
    this.oauthService.setupAutomaticSilentRefresh();
  }

  login(){
    this.oauthService.initImplicitFlow();
  }

  logout(){
    this.oauthService.logOut();
    this.connectedUser = undefined;
  }

  public get name() {
    if (this.connectedUser !== undefined){
      return this.connectedUser.name;
    }
    return undefined;
  }

  public get picture() {
   if (this.connectedUser !== undefined){
     return this.connectedUser.picture;
   }
   return undefined;
  }

  public get isAuthenticated(){
    return this.oauthService.hasValidAccessToken();
  }

}
