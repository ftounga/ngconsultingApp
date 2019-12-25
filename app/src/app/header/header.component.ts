import { Component, OnInit } from '@angular/core';
import {ViewEncapsulation} from '@angular/core';
import {JwksValidationHandler, OAuthService} from 'angular-oauth2-oidc';
import {authConfig} from '../config/oAuth.config';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
  encapsulation: ViewEncapsulation.Emulated
})
export class HeaderComponent implements OnInit {

  private fragment: any;

  constructor(private oauthService: OAuthService, private route: ActivatedRoute) {
    this.configure();
  }

  ngOnInit() {
    this.route.fragment.subscribe(fragment => {
      this.fragment = fragment;
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
  }

  public get name() {
    const claims = this.oauthService.getIdentityClaims();
    if (!claims) { return null; }
    return claims['name'];
  }

  public get picture() {
    const claims = this.oauthService.getIdentityClaims();
    if (!claims) { return null; }
    return claims['picture'];
  }

  public get isAuthenticated(){
    return this.oauthService.hasValidAccessToken();
  }

}
