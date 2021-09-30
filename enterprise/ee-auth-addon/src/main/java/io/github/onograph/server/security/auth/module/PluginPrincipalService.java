package io.github.onograph.server.security.auth.module;

import java.io.Serializable;


public interface PluginPrincipalService extends Serializable {


  static PluginPrincipalService ofPluginPrincipalService(Object usrPrcpl) {
    return () ->
    {
      return usrPrcpl;
    };
  }


  Object getPrincipal();
}
