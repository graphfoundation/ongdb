package io.github.onograph.server.security.auth.module;

import java.io.Serializable;
import java.util.Collection;


public interface PrincipalAndRolesProvider extends Serializable {


  static PrincipalAndRolesProvider ofPrincipalAndRolesProvider(
      final Collection<String> _collectionRlsString, final Object usrPrcpl) {
    return new PrincipalAndRolesProvider() {
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


  Object prnpObject();


  Collection<String> roeCollection();
}
