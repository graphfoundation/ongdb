package io.github.onograph.server.security.auth.module;

import java.io.Serializable;
import java.util.Collection;


public interface RolesProvider extends Serializable {


  static RolesProvider ofRolesProvider(Collection<String> _collectionRlsString) {
    return () ->
    {
      return _collectionRlsString;
    };
  }


  Collection<String> roeCollection();
}
