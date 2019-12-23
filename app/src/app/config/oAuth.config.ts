import { AuthConfig } from 'angular-oauth2-oidc';

export const authConfig: AuthConfig = {

  // Url of the Identity Provider
  issuer: 'https://accounts.google.com',

  // URL of the SPA to redirect the user to after login
  redirectUri: window.location.origin + '/app/home',

  // The SPA's id. The SPA is registerd with this id at the auth-server
  clientId: '497106959400-5p40k73qr0na15oos3k1aikqi7l22fcm.apps.googleusercontent.com',

  // set the scope for the permissions the client should request
  // The first three are defined by OIDC. Also provide user sepecific
  scope: 'openid profile email',

  showDebugInformation: true,

  strictDiscoveryDocumentValidation: false
}
