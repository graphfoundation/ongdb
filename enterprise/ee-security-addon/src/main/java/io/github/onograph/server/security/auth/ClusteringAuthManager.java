package io.github.onograph.server.security.auth;

import io.github.onograph.kernel.api.security.DefaultAuthManager;
import io.github.onograph.kernel.api.security.DefaultLoginContext;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.database.DefaultDatabaseResolver;


public class ClusteringAuthManager extends DefaultAuthManager {


  public static final String ROE_MK = io.github.onograph.TokenConstants.ROLES;


  public static final String SCE = io.github.onograph.TokenConstants.IN_CLUSTER_TOKEN;


  private final AbstractSecurityLog abstractSecurityLog;


  private final DefaultDatabaseResolver defaultDatabaseResolver;


  private final boolean isLsl;


  private final AuthPrivilegeManager rpAuthPrivilegeManager;


  public ClusteringAuthManager(AbstractSecurityLog _abstractSecurityLog,
      DefaultDatabaseResolver _defaultDatabaseResolver, boolean _isLsl,
      AuthPrivilegeManager _rpAuthPrivilegeManager) {
    this.abstractSecurityLog = _abstractSecurityLog;
    this.defaultDatabaseResolver = _defaultDatabaseResolver;
    this.isLsl = _isLsl;
    this.rpAuthPrivilegeManager = _rpAuthPrivilegeManager;
  }


  private static void _astvdsmForMa(Map<String, Object> _mapTknso)
      throws InvalidAuthTokenException {

    String _strShm = AuthToken.safeCast(io.github.onograph.TokenConstants.SCHEME, _mapTknso);
    if (_strShm.equals(io.github.onograph.TokenConstants.NONE)) {
      throw AuthToken.invalidToken(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.ClusteringAuthManager.invalidToken"));
    } else if (!_strShm.equals(io.github.onograph.TokenConstants.IN_CLUSTER_TOKEN)) {
      throw AuthToken.invalidToken(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.ClusteringAuthManager.invalidToken2",
              _strShm));
    }
  }


  private static String _excurString(Map<String, Object> _mapTknso)
      throws InvalidAuthTokenException {
    return AuthToken.safeCast(io.github.onograph.TokenConstants.PRINCIPAL, _mapTknso);
  }


  private static Set<String> _exrtrlSet(Map<String, Object> _mapTknso)
      throws InvalidAuthTokenException {

    Map<String, Object> _mapPrmtrso = AuthToken.safeCastMap(
        io.github.onograph.TokenConstants.PARAMETERS, _mapTknso);

    Object _obRls = _mapPrmtrso.get(io.github.onograph.TokenConstants.ROLES);
    if (_obRls == null) {

      throw new InvalidAuthTokenException("*** Error:  cd9732a3-d28d-47a0-b0c1-085df049266d");
    } else if (!(_obRls instanceof List)) {

      throw new InvalidAuthTokenException("*** Error: 8e49c20e-7b89-4e57-9fdb-279e4d98e28f");
    } else {

      Set<String> _setRslString = new HashSet();

      Iterator _iterator = ((List) _obRls).iterator();

      while (_iterator.hasNext()) {

        Object r = _iterator.next();
        if (!(r instanceof String)) {

          throw new InvalidAuthTokenException("*** Error: 114fa2d6-1af5-40cd-a399-fd97a7ac4066");
        }

        _setRslString.add((String) r);
      }

      return _setRslString;
    }
  }

  @Override
  public void claauch() {
  }

  @Override
  public void clneac() {
  }

  @Override
  public List<Map<String, String>> gepiggatgcfList() {
    return this.rpAuthPrivilegeManager.gepiggatgcfList();
  }

  @Override
  public void log(String m, SecurityContext _securityContext) {

  }

  @Override
  public DefaultLoginContext login(Map<String, Object> _mapTaso,
      ClientConnectionInfo _clientConnectionInfo) throws InvalidAuthTokenException {
    try {
      _astvdsmForMa(_mapTaso);

      String uname = _excurString(_mapTaso);

      Set<String> _setRlsString = _exrtrlSet(_mapTaso);

      String _strUfdd = this.defaultDatabaseResolver.defaultDatabase(uname);

      EnterpriseLoginContextServiceClusteringImpl _enterpriseLoginContextServiceClusteringImpl =
          new EnterpriseLoginContextServiceClusteringImpl(_clientConnectionInfo, _strUfdd,
              _setRlsString, () ->
          {
            return this.rpAuthPrivilegeManager.gepvesHashSet(_setRlsString);
          }, uname);
      if (this.isLsl) {

      }

      return _enterpriseLoginContextServiceClusteringImpl;
    } catch (

        InvalidAuthTokenException _invalidAuthTokenException) {

      throw _invalidAuthTokenException;
    }
  }
}
