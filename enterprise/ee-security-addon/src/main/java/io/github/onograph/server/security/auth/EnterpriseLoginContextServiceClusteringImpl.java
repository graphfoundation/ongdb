package io.github.onograph.server.security.auth;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;


public class EnterpriseLoginContextServiceClusteringImpl extends DefaultLoginContext {


  private final String defGdbName;


  private final Set<String> setRlsString;


  private final Supplier<Set<ElementEntitlementDTO>> supplierSpSet;


  public EnterpriseLoginContextServiceClusteringImpl(ClientConnectionInfo _clientConnectionInfo,
      String defGdbName, Set<String> _setRlsString,
      Supplier<Set<ElementEntitlementDTO>> _supplierPsSet, String uname) {
    super(new AuthSubjectDefaultImpl(uname), _clientConnectionInfo);
    this.setRlsString = _setRlsString;
    this.defGdbName = defGdbName;
    this.supplierSpSet = _supplierPsSet;
  }

  @Override
  public SecurityContextEnterpriseImpl authorize(IdLookup _idLookup, String gdbName,
      AbstractSecurityLog _abstractSecurityLog) {

    AccessModeFactory _bmaAccessModeFactory = new AccessModeFactory(true, _idLookup,
        this.setRlsString, this.defGdbName, gdbName);

    Set<ElementEntitlementDTO> _setPiieeElementEntitlementDTO = this.supplierSpSet.get();

    AccessModeImpl mdstr = EnterpriseLoginContextServiceDefaultImpl
        ._modAccessModeImpl(_abstractSecurityLog, _bmaAccessModeFactory, this.defGdbName, gdbName,
            this, _setPiieeElementEntitlementDTO,
            this.setRlsString, this.subject().username());
    return new SecurityContextEnterpriseImpl(mdstr.getAdminAccessMode(), this.subject(),
        this.connectionInfo(), mdstr, mdstr.roles(), gdbName);
  }

  @Override
  public Set<String> roeSet() {
    return this.setRlsString;
  }


  private static class AuthSubjectDefaultImpl implements AuthSubject {


    private final AuthenticationResult authenticationResult;


    private final String uname;

    AuthSubjectDefaultImpl(String uname) {
      this.uname = uname;
      this.authenticationResult = AuthenticationResult.SUCCESS;
    }

    @Override
    public AuthenticationResult getAuthenticationResult() {
      return this.authenticationResult;
    }

    @Override
    public boolean hasUsername(String uname) {
      return Objects.equals(this.uname, uname);
    }

    @Override
    public String username() {
      return this.uname;
    }
  }
}
