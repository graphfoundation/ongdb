package io.github.onograph.server.security.auth.module;

import java.util.Collection;


public interface AuthorizationAuthApiLifecycle extends AuthApiLifecycle {


  RolesProvider auhiRolesProvider(
      Collection<PrincipalAuthProviderWrapper> _collectionVPrincipalAuthProviderWrapper);


  String name();


  class AuthApiConnector extends AuthApiLifecycleImpl implements AuthorizationAuthApiLifecycle {

    @Override
    public RolesProvider auhiRolesProvider(
        Collection<PrincipalAuthProviderWrapper> _collectionPicplPrincipalAuthProviderWrapper) {
      return null;
    }

    @Override
    public String name() {
      return this.getClass().getName();
    }
  }


  final class PrincipalAuthProviderWrapper {


    private final String strPoie;


    private final Object usrPrcpl;


    public PrincipalAuthProviderWrapper(String _strPoie, Object usrPrcpl) {
      this.strPoie = _strPoie;
      this.usrPrcpl = usrPrcpl;
    }


    public String getStrPoie() {
      return this.strPoie;
    }


    public Object getUsrPrcpl() {
      return this.usrPrcpl;
    }
  }
}
