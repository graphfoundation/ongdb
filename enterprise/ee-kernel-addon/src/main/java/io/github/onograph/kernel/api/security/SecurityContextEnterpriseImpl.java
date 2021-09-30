package io.github.onograph.kernel.api.security;

import java.util.Collections;
import java.util.Set;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.kernel.api.security.AccessMode.Static;
import org.neo4j.internal.kernel.api.security.AdminAccessMode;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.SecurityContext;


public class SecurityContextEnterpriseImpl extends SecurityContext {


  public static final SecurityContextEnterpriseImpl AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;

  static {
    AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL = auhdslSecurityContextEnterpriseImpl(
        ClientConnectionInfo.EMBEDDED_CONNECTION, Static.FULL, null);
  }


  private final AdminAccessMode adminAccessMode;


  private final Set<String> setRlsString;


  public SecurityContextEnterpriseImpl(AdminAccessMode _adminAccessMode, AuthSubject _authSubject,
      ClientConnectionInfo _clientConnectionInfo, AccessMode mdstr, Set<String> _setRlsString,
      String _strDtbs) {
    super(_authSubject, mdstr, _clientConnectionInfo, _strDtbs);
    this.setRlsString = _setRlsString;
    this.adminAccessMode = _adminAccessMode;
  }


  public static SecurityContextEnterpriseImpl auhdslSecurityContextEnterpriseImpl(
      ClientConnectionInfo _clientConnectionInfo, AccessMode mdstr, String _strDtbs) {
    return new SecurityContextEnterpriseImpl(AdminAccessMode.FULL, AuthSubject.AUTH_DISABLED,
        _clientConnectionInfo, mdstr, Collections.emptySet(),
        _strDtbs) {
      @Override
      public boolean allowExecuteAdminProcedure(int _iIp) {
        return true;
      }

      @Override
      public boolean allowsAdminAction(AdminActionOnResource _adminActionOnResource) {
        return true;
      }

      @Override
      public String description() {
        return io.github.onograph.I18N.format(
            "io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.description",
            this.mode().name());
      }

      @Override
      public String toString() {
        return this.defaultString(io.github.onograph.TokenConstants.ENTERPRISE_AUTH_DISABLED);
      }

      @Override
      public SecurityContextEnterpriseImpl withMode(AccessMode mdstr) {
        return auhdslSecurityContextEnterpriseImpl(this.connectionInfo(), mdstr, this.database());
      }
    };
  }

  @Override
  public boolean allowExecuteAdminProcedure(int _iPi) {
    return this.mode.shouldBoostProcedure(_iPi);
  }

  @Override
  public boolean allowsAdminAction(AdminActionOnResource _adminActionOnResource) {
    return this.adminAccessMode.allows(_adminActionOnResource);
  }

  @Override
  public SecurityContextEnterpriseImpl authorize(IdLookup _idLookup, String gdbName,
      AbstractSecurityLog _abstractSecurityLog) {
    return this;
  }

  @Override
  public Set<String> roles() {
    return this.setRlsString;
  }

  @Override
  public SecurityContextEnterpriseImpl withMode(AdminAccessMode _adminAccessMode) {
    return new SecurityContextEnterpriseImpl(_adminAccessMode, this.subject, this.connectionInfo(),
        this.mode, this.setRlsString, this.database());
  }

  @Override
  public SecurityContextEnterpriseImpl withMode(AccessMode mdstr) {
    return new SecurityContextEnterpriseImpl(this.adminAccessMode, this.subject,
        this.connectionInfo(), mdstr, this.setRlsString, this.database());
  }
}
