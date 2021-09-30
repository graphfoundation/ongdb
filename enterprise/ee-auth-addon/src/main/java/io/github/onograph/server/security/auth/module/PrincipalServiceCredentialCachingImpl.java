package io.github.onograph.server.security.auth.module;


public interface PrincipalServiceCredentialCachingImpl extends PluginPrincipalService {


  static PrincipalServiceCredentialCachingImpl ofPluginPrincipalService(
      final AuthTokenComparer authTokenComparer, final Object usrPrcpl) {
    return new PrincipalServiceCredentialCachingImpl() {
      @Override
      public AuthTokenComparer getAuthTokenComparer() {
        return authTokenComparer;
      }

      @Override
      public Object getPrincipal() {
        return usrPrcpl;
      }
    };
  }


  AuthTokenComparer getAuthTokenComparer();


  interface AuthTokenComparer {


    boolean isAuthMatch(AuthenticationToken _authenticationToken);
  }
}
