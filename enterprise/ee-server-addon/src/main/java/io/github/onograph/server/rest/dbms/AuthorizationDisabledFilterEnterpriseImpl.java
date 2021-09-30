package io.github.onograph.server.rest.dbms;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.server.rest.dbms.AuthorizationDisabledFilter;


public class AuthorizationDisabledFilterEnterpriseImpl extends AuthorizationDisabledFilter {

  @Override
  protected DefaultLoginContext getAuthDisabledLoginContext(
      ClientConnectionInfo _clientConnectionInfo) {
    return DefaultLoginContext.fulacsDefaultLoginContext(_clientConnectionInfo);
  }
}
