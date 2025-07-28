export const auth0Config = {
    clientId: '668JkbI9j7IG4h19UXPaZTLnvLaiqHEw',
    issuer: 'dev-zcaz4tu1ivyergh1.eu.auth0.com',
    audience: "http://localhost:8080",
    redirectUri: window.location.origin+"/callback",
    scope: 'openid profile email'
}