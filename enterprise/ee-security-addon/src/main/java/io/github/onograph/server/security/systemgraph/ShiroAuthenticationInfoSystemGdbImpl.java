package io.github.onograph.server.security.systemgraph;

import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;


public class ShiroAuthenticationInfoSystemGdbImpl extends ShiroAuthenticationInfo {


  private final User rUser;

  public ShiroAuthenticationInfoSystemGdbImpl(User _rUser, String realm) {
    super(new Neo4jPrincipal(_rUser.name(), _rUser.id()), realm, AuthenticationResult.FAILURE);
    this.rUser = _rUser;
  }


  User getRUser() {
    return this.rUser;
  }


  void seatioruForAu(AuthenticationResult _authenticationResult) {
    this.authenticationResult = _authenticationResult;
  }
}
