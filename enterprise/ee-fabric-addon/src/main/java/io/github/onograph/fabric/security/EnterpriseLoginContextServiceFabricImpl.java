package io.github.onograph.fabric.security;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl;
import java.util.Set;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;


public class EnterpriseLoginContextServiceFabricImpl extends DefaultLoginContext {


  private final DefaultLoginContext clwDefaultLoginContext;


  public EnterpriseLoginContextServiceFabricImpl(AuthSubjectFabricImpl _authSubjectFabricImpl,
      DefaultLoginContext _clwDefaultLoginContext) {
    super(_authSubjectFabricImpl, _clwDefaultLoginContext.connectionInfo());
    this.clwDefaultLoginContext = _clwDefaultLoginContext;
  }

  @Override
  public SecurityContextEnterpriseImpl authorize(IdLookup _idLookup, String gdbName,
      AbstractSecurityLog _abstractSecurityLog) {
    return this.clwDefaultLoginContext.authorize(_idLookup, gdbName, _abstractSecurityLog);
  }

  @Override
  public Set<String> roeSet() {
    return this.clwDefaultLoginContext.roeSet();
  }
}
