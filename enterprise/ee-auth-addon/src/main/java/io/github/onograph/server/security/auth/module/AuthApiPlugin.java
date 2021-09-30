package io.github.onograph.server.security.auth.module;


public interface AuthApiPlugin extends AuthApiLifecycle {


  PrincipalAndRolesProvider auntaarPrincipalAndRolesProvider(
      AuthenticationToken _authenticationToken) throws AuthException;


  String name();


  abstract class AuthApiConnector extends AuthApiLifecycleImpl implements AuthApiPlugin {

    @Override
    public String name() {
      return this.getClass().getName();
    }
  }


  abstract class AuthApiConnectorWithHSH extends AuthApiLifecycleImpl implements AuthApiPlugin {

    @Override
    public String name() {
      return this.getClass().getName();
    }

    @Override
    public void setup(AuthApi _opaAuthApi) {
      _opaAuthApi.seatiochend(true);
    }
  }
}
