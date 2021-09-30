package io.github.onograph.server.security.auth.module;


public interface PrincipalServiceDefaultImpl extends PluginPrincipalService {


  static PrincipalServiceDefaultImpl ofPluginPrincipalService(final byte[] credsObj,
      final Object usrPrcpl) {
    return new PrincipalServiceDefaultImpl() {
      @Override
      public byte[] crdtl() {
        return credsObj;
      }

      @Override
      public Object getPrincipal() {
        return usrPrcpl;
      }
    };
  }


  byte[] crdtl();

  @Override
  Object getPrincipal();
}
