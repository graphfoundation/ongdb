package io.github.onograph.server.security.auth.module;


public interface AuthenticationAuthApiLifecycle extends AuthApiLifecycle {


  PluginPrincipalService auhtaPluginPrincipalService(AuthenticationToken _authenticationToken)
      throws AuthException;


  String name();


  abstract class AuthApiConnector extends AuthApiLifecycleImpl implements
      AuthenticationAuthApiLifecycle {

    @Override
    public String name() {
      return this.getClass().getName();
    }
  }


  abstract class AuthApiConnectorWithHSH extends AuthApiLifecycleImpl implements
      AuthenticationAuthApiLifecycle {

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
