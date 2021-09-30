package io.github.onograph.fabric;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl;
import java.util.Set;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.fabric.executor.FabricDatabaseAccess;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.AccessMode.Static;
import org.neo4j.internal.kernel.api.security.LoginContext;
import org.neo4j.kernel.impl.api.security.RestrictedAccessMode;


public class FabricDatabaseAccessEnterpriseImpl implements FabricDatabaseAccess {


  private final FabricDatabaseManager fabricDatabaseManager;

  public FabricDatabaseAccessEnterpriseImpl(FabricDatabaseManager _fabricDatabaseManager) {
    this.fabricDatabaseManager = _fabricDatabaseManager;
  }


  private LoginContext _wrelictLoginContext(LoginContext _coLoginContext) {
    return new DefaultLoginContextImpl((DefaultLoginContext) _coLoginContext);
  }

  @Override
  public LoginContext maybeRestrictLoginContext(LoginContext _coLoginContext, String gdbName) {

    boolean _isDfci = this.fabricDatabaseManager.isFabricDatabase(gdbName);
    return _isDfci ? this._wrelictLoginContext(_coLoginContext) : _coLoginContext;
  }


  private static class DefaultLoginContextImpl extends DefaultLoginContext {


    private final DefaultLoginContext inrDefaultLoginContext;

    private DefaultLoginContextImpl(DefaultLoginContext _inrDefaultLoginContext) {
      super(_inrDefaultLoginContext.subject(), _inrDefaultLoginContext.connectionInfo());
      this.inrDefaultLoginContext = _inrDefaultLoginContext;
    }

    @Override
    public SecurityContextEnterpriseImpl authorize(IdLookup _idLookup, String gdbName,
        AbstractSecurityLog _abstractSecurityLog) {

      SecurityContextEnterpriseImpl _csoSecurityContextEnterpriseImpl = this.inrDefaultLoginContext.authorize(
          _idLookup, gdbName, _abstractSecurityLog);

      RestrictedAccessMode _restrictedAccessMode = new RestrictedAccessMode(
          _csoSecurityContextEnterpriseImpl.mode(), Static.ACCESS);
      return new SecurityContextEnterpriseImpl((action) ->
      {
        return false;
      }, this.subject(), this.connectionInfo(), _restrictedAccessMode, this.roeSet(), gdbName);
    }

    @Override
    public Set<String> roeSet() {
      return this.inrDefaultLoginContext.roeSet();
    }
  }
}
