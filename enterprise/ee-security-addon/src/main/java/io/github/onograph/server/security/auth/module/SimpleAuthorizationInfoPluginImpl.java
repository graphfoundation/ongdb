package io.github.onograph.server.security.auth.module;

import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.shiro.authz.SimpleAuthorizationInfo;


public class SimpleAuthorizationInfoPluginImpl extends SimpleAuthorizationInfo {

  private SimpleAuthorizationInfoPluginImpl(Set<String> _setRlsString) {
    super(_setRlsString);
  }


  public static SimpleAuthorizationInfoPluginImpl craSimpleAuthorizationInfoPluginImpl(
      RolesProvider _iaRolesProvider) {
    return new SimpleAuthorizationInfoPluginImpl(
        new LinkedHashSet(_iaRolesProvider.roeCollection()));
  }
}
