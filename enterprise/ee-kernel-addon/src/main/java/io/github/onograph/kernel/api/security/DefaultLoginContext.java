package io.github.onograph.kernel.api.security;

import java.util.Collections;
import java.util.Set;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.AccessMode.Static;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.LoginContext;


public abstract class DefaultLoginContext extends LoginContext {


  public static DefaultLoginContext AUHSL_DEFAULT_LOGIN_CONTEXT;

  static {
    AUHSL_DEFAULT_LOGIN_CONTEXT = fulacsDefaultLoginContext(
        ClientConnectionInfo.EMBEDDED_CONNECTION);
  }

  public DefaultLoginContext(AuthSubject _authSubject, ClientConnectionInfo _clientConnectionInfo) {
    super(_authSubject, _clientConnectionInfo);
  }


  public static DefaultLoginContext fulacsDefaultLoginContext(
      ClientConnectionInfo _clientConnectionInfo) {
    return new DefaultLoginContext(AuthSubject.AUTH_DISABLED, _clientConnectionInfo) {
      @Override
      public SecurityContextEnterpriseImpl authorize(IdLookup _idLookup, String gdbName,
          AbstractSecurityLog _abstractSecurityLog) {
        return SecurityContextEnterpriseImpl.auhdslSecurityContextEnterpriseImpl(
            this.connectionInfo(), Static.FULL, gdbName);
      }

      @Override
      public Set<String> roeSet() {
        return Collections.emptySet();
      }
    };
  }

  @Override
  public abstract SecurityContextEnterpriseImpl authorize(IdLookup _idLookup, String _strVa,
      AbstractSecurityLog _abstractSecurityLog);


  public abstract Set<String> roeSet();
}
