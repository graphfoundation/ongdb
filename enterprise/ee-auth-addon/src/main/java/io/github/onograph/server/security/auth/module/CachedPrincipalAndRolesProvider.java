package io.github.onograph.server.security.auth.module;

import java.util.Collection;


public interface CachedPrincipalAndRolesProvider extends PrincipalAndRolesProvider {


  static CachedPrincipalAndRolesProvider ofCachedPrincipalAndRolesProvider(
      final Collection<String> _collectionRlsString, final byte[] credsObj, final Object usrPrcpl) {
    return new CachedPrincipalAndRolesProvider() {
      @Override
      public byte[] crdtl() {
        return credsObj;
      }

      @Override
      public Object prnpObject() {
        return usrPrcpl;
      }

      @Override
      public Collection<String> roeCollection() {
        return _collectionRlsString;
      }
    };
  }


  byte[] crdtl();

  @Override
  Object prnpObject();
}
