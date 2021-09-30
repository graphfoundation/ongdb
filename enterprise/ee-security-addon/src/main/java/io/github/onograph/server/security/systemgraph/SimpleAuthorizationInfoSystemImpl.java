package io.github.onograph.server.security.systemgraph;

import java.util.Set;
import org.apache.shiro.authz.SimpleAuthorizationInfo;


public class SimpleAuthorizationInfoSystemImpl extends SimpleAuthorizationInfo {


  private final String uname;

  SimpleAuthorizationInfoSystemImpl(String uname) {
    this.uname = uname;
  }


  public SimpleAuthorizationInfoSystemImpl(Set<String> _setRnString, String uname) {
    super(_setRnString);
    this.uname = uname;
  }


  public String getUname() {
    return this.uname;
  }
}
