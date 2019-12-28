import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot} from '@angular/router';
import {OAuthService} from 'angular-oauth2-oidc';
import {ToastrService} from 'ngx-toastr';

@Injectable()
export class AuthGuard implements CanActivate {

  constructor(private oauthService: OAuthService, private router: Router, private toastrService: ToastrService) {}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot, ): boolean {
    if (this.oauthService.hasValidIdToken()) {
      return true;
    }
    this.toastrService.warning('Vous devez vous connecter', 'Authentification');
    return false;
  }
}
