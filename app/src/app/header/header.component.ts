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
    });
  }

  private configure() {
    this.oauthService.configure(authConfig);
    this.oauthService.tokenValidationHandler = new JwksValidationHandler();
    this.oauthService.loadDiscoveryDocumentAndTryLogin();
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
    console.log(claims);
    return claims['name'];
  }

  public get picture() {
    const claims = this.oauthService.getIdentityClaims();
    if (!claims) { return null; }
    console.log(claims);
    return claims['picture'];
  }

}
