package io.github.onograph.server.security.auth;

import io.github.onograph.config.Security;
import io.github.onograph.kernel.api.security.DefaultAuthManager;
import io.github.onograph.kernel.api.security.DefaultLoginContext;
import io.github.onograph.server.security.systemgraph.AuthorizingRealmSystemImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SubjectDAO;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.CachingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.Initializable;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.security.AuthProviderFailedException;
import org.neo4j.graphdb.security.AuthProviderTimeoutException;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.database.DefaultDatabaseResolver;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthToken;


public class AuthManagerEnterpriseRealmsImpl extends DefaultAuthManager {


  private final AbstractSecurityLog abstractSecurityLog;


  private final CacheManager cacheManager;


  private final Collection<Realm> collectionRamRealm;


  private final DefaultDatabaseResolver defaultDatabaseResolver;


  private final DefaultSecurityManager defaultSecurityManager;


  private final boolean isLsl;


  private final AuthPrivilegeManager rpAuthPrivilegeManager;


  public AuthManagerEnterpriseRealmsImpl(AbstractSecurityLog _abstractSecurityLog,
      CacheManager _cacheManager, Collection<Realm> _collectionRamRealm, Config _config,
      DefaultDatabaseResolver _defaultDatabaseResolver,
      AuthPrivilegeManager _rpAuthPrivilegeManager) {
    this.collectionRamRealm = _collectionRamRealm;
    this.cacheManager = _cacheManager;
    this.defaultSecurityManager = new DefaultSecurityManager(_collectionRamRealm);
    this.abstractSecurityLog = _abstractSecurityLog;
    this.isLsl = _config.get(Security.settingSeigeleaBoolean);
    this.rpAuthPrivilegeManager = _rpAuthPrivilegeManager;
    this.defaultDatabaseResolver = _defaultDatabaseResolver;
    this.defaultSecurityManager.setSubjectFactory(new SubjectFactoryImpl());
    ((ModularRealmAuthenticator) this.defaultSecurityManager.getAuthenticator()).setAuthenticationStrategy(
        new EnterpriseAuthenticationStrategy());
    this.defaultSecurityManager.setSubjectDAO(_cresedaoSubjectDAO());
  }


  private static void _astvdsmForSh(ShiroAuthToken _shiroAuthToken)
      throws InvalidAuthTokenException {

    String _strShm = _shiroAuthToken.getSchemeSilently();
    if (_strShm == null) {
      throw AuthToken.invalidToken(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl.invalidToken",
              _shiroAuthToken));
    } else if (_strShm.equals(io.github.onograph.TokenConstants.NONE)) {
      throw AuthToken.invalidToken(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl.invalidToken2",
              _shiroAuthToken));
    }
  }


  private static SubjectDAO _cresedaoSubjectDAO() {

    DefaultSubjectDAO _defaultSubjectDAO = new DefaultSubjectDAO();

    DefaultSessionStorageEvaluator _defaultSessionStorageEvaluator = new DefaultSessionStorageEvaluator();
    _defaultSessionStorageEvaluator.setSessionStorageEnabled(false);
    _defaultSubjectDAO.setSessionStorageEvaluator(_defaultSessionStorageEvaluator);
    return _defaultSubjectDAO;
  }

  @Override
  public void claauch() {

    Iterator _iterator = this.collectionRamRealm.iterator();

    while (_iterator.hasNext()) {

      Realm _realm = (Realm) _iterator.next();

      Cache _cache;
      if (_realm instanceof AuthenticatingRealm) {
        _cache = ((AuthenticatingRealm) _realm).getAuthenticationCache();
        if (_cache != null) {
          _cache.clear();
        }
      }

      if (_realm instanceof AuthorizingRealm) {
        _cache = ((AuthorizingRealm) _realm).getAuthorizationCache();
        if (_cache != null) {
          _cache.clear();
        }
      }
    }

    this.rpAuthPrivilegeManager.clcfrl();
    this.defaultDatabaseResolver.clearCache();
  }

  @Override
  public void clneac() {

    Iterator _iterator = this.collectionRamRealm.iterator();

    while (_iterator.hasNext()) {

      Realm _realm = (Realm) _iterator.next();
      if (_realm instanceof AuthorizingRealmSystemImpl) {

        AuthorizingRealmSystemImpl authorizingRealmSystemImpl = (AuthorizingRealmSystemImpl) _realm;

        Cache<Object, AuthenticationInfo> _cacheCaoa = authorizingRealmSystemImpl.getAuthenticationCache();
        if (_cacheCaoa != null) {
          _cacheCaoa.clear();
        }

        Cache<Object, AuthorizationInfo> _cacheCaoa2 = authorizingRealmSystemImpl.getAuthorizationCache();
        if (_cacheCaoa2 != null) {
          _cacheCaoa2.clear();
        }
      }
    }

    this.rpAuthPrivilegeManager.clcfrl();
  }


  Collection<AuthorizationInfo> geatzniCollection(PrincipalCollection _principalCollection) {

    List<AuthorizationInfo> _listLiAuthorizationInfo = new ArrayList(1);

    Optional<Neo4jPrincipal> _optionalPnmNeo4jPrincipal =
        _principalCollection.fromRealm(io.github.onograph.TokenConstants.NATIVE).stream()
            .findFirst();

    Object _obPem = _principalCollection.getPrimaryPrincipal();

    Iterator _iterator = this.collectionRamRealm.iterator();

    while (true) {

      Realm _realm;
      do {
        if (!_iterator.hasNext()) {
          return _listLiAuthorizationInfo;
        }

        _realm = (Realm) _iterator.next();
      }
      while (!(_realm instanceof AuthorizationInfoSa));

      AuthorizationInfo _authorizationInfo;
      if (_realm instanceof AuthorizingRealmSystemImpl && _optionalPnmNeo4jPrincipal.isEmpty()
          && _obPem != null) {

        String uname;
        if (_obPem instanceof Neo4jPrincipal) {
          uname = ((Neo4jPrincipal) _obPem).getUsername();
        } else {
          uname = _obPem.toString();
        }

        String _strI = ((AuthorizingRealmSystemImpl) _realm).geuriString(uname);
        _authorizationInfo = ((AuthorizationInfoSa) _realm)
            .geatznhAuthorizationInfo(
                new SimplePrincipalCollection(new Neo4jPrincipal(uname, _strI),
                    io.github.onograph.TokenConstants.LDAP));
      } else {
        _authorizationInfo = ((AuthorizationInfoSa) _realm).geatznhAuthorizationInfo(
            _principalCollection);
      }

      if (_authorizationInfo != null) {
        _listLiAuthorizationInfo.add(_authorizationInfo);
      }
    }
  }

  @Override
  public List<Map<String, String>> gepiggatgcfList() {
    return this.rpAuthPrivilegeManager.gepiggatgcfList();
  }


  Set<ElementEntitlementDTO> gepmsnSet(Set<String> _setRlsString) {
    return this.rpAuthPrivilegeManager.gepvesHashSet(_setRlsString);
  }

  @Override
  public void init() throws Exception {

    Iterator _iterator = this.collectionRamRealm.iterator();

    while (_iterator.hasNext()) {

      Realm _realm = (Realm) _iterator.next();
      if (!(_realm instanceof AuthorizingRealmSystemImpl)) {
        if (_realm instanceof Initializable) {
          ((Initializable) _realm).init();
        }

        if (_realm instanceof CachingRealm) {
          ((CachingRealm) _realm).setCacheManager(this.cacheManager);
        }

        if (_realm instanceof Lifecycle) {
          ((Lifecycle) _realm).setup();
        }
      }
    }

    this.rpAuthPrivilegeManager.inanscmeForCa(this.cacheManager);
  }

  @Override
  public void log(String m, SecurityContext _securityContext) {

  }

  @Override
  public DefaultLoginContext login(Map<String, Object> _mapTaso,
      ClientConnectionInfo _clientConnectionInfo) throws InvalidAuthTokenException {

    EnterpriseLoginContextServiceDefaultImpl _enterpriseLoginContextServiceDefaultImpl;
    try {

      ShiroAuthToken _shiroAuthToken = new ShiroAuthToken(_mapTaso);
      _astvdsmForSh(_shiroAuthToken);

      Object usrPrcpl = _shiroAuthToken.getPrincipal();

      String _strUt = usrPrcpl != null ? usrPrcpl.toString() : "";

      EnterpriseLoginContextServiceDefaultImpl _enterpriseLoginContextServiceDefaultImpl2;

      DelegatingSubjectImpl _ssDelegatingSubjectImpl;
      try {
        _ssDelegatingSubjectImpl = (DelegatingSubjectImpl) this.defaultSecurityManager.login(null,
            _shiroAuthToken);

        String defGdbName = this.defaultDatabaseResolver.defaultDatabase(
            _ssDelegatingSubjectImpl.getUname());
        _enterpriseLoginContextServiceDefaultImpl2 =
            new EnterpriseLoginContextServiceDefaultImpl(this, _clientConnectionInfo, defGdbName,
                _ssDelegatingSubjectImpl);

        AuthenticationResult _authenticationResult = _enterpriseLoginContextServiceDefaultImpl2.subject()
            .getAuthenticationResult();
        if (_authenticationResult == AuthenticationResult.SUCCESS) {
          if (this.isLsl) {

          }
        } else if (_authenticationResult == AuthenticationResult.PASSWORD_CHANGE_REQUIRED) {

        } else {

          String _strMe = (_enterpriseLoginContextServiceDefaultImpl2.subject()).geatioflmeeString();


        }

        (_enterpriseLoginContextServiceDefaultImpl2.subject()).clantin();
      } catch (

          UnsupportedTokenException _unsupportedTokenException) {

        Throwable _cueThrowable = _unsupportedTokenException.getCause();
        if (_cueThrowable instanceof InvalidAuthTokenException) {

          String _strVr00 = _cueThrowable.getMessage();

          throw new InvalidAuthTokenException("*** Error: 6e117822-506e-4df8-b664-bee91a58e523");
        }

        throw AuthToken.invalidToken(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl.invalidToken3",
                _shiroAuthToken));
      } catch (

          ExcessiveAttemptsException _excessiveAttemptsException) {
        _ssDelegatingSubjectImpl = new DelegatingSubjectImpl(AuthenticationResult.TOO_MANY_ATTEMPTS,
            this.defaultSecurityManager, _strUt);
        _enterpriseLoginContextServiceDefaultImpl2 =
            new EnterpriseLoginContextServiceDefaultImpl(this, _clientConnectionInfo,
                this.defaultDatabaseResolver.defaultDatabase(_strUt),
                _ssDelegatingSubjectImpl);


      } catch (

          AuthenticationException _authenticationException) {
        _ssDelegatingSubjectImpl = new DelegatingSubjectImpl(AuthenticationResult.FAILURE,
            this.defaultSecurityManager, _strUt);

        DefaultLoginContext _ceDefaultLoginContext =
            new EnterpriseLoginContextServiceDefaultImpl(this, _clientConnectionInfo,
                this.defaultDatabaseResolver.defaultDatabase(_strUt),
                _ssDelegatingSubjectImpl);

        Throwable _cueThrowable2;

        String _strMe2;

        String _strMc;
        if (_authenticationException.getCause() != null
            && _authenticationException.getCause() instanceof AuthProviderTimeoutException) {
          _cueThrowable2 = _authenticationException.getCause().getCause();
          _strMc = _cueThrowable2 != null && _cueThrowable2.getMessage() != null ? " ("
              + _cueThrowable2.getMessage() + ")" : "";
          _strMe2 = String.format(
              io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl.format"),
              _strMc);

          throw new AuthProviderTimeoutException(_authenticationException.getCause().getMessage(),
              _authenticationException.getCause());
        }

        if (_authenticationException.getCause() != null
            && _authenticationException.getCause() instanceof AuthProviderFailedException) {
          _cueThrowable2 = _authenticationException.getCause().getCause();
          _strMc = _cueThrowable2 != null && _cueThrowable2.getMessage() != null ? " ("
              + _cueThrowable2.getMessage() + ")" : "";
          _strMe2 = String.format(
              io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl.format2"),
              _strMc);

          throw new AuthProviderFailedException(_authenticationException.getCause().getMessage(),
              _authenticationException.getCause());
        }

        _enterpriseLoginContextServiceDefaultImpl2 = (EnterpriseLoginContextServiceDefaultImpl) _ceDefaultLoginContext;
        _cueThrowable2 = _authenticationException.getCause();

        Throwable _ccThrowable =
            _authenticationException.getCause() != null ? _authenticationException.getCause()
                .getCause() : null;
        _strMe2 = String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl.format3"),
            _cueThrowable2 != null && _cueThrowable2.getMessage() != null
                ? io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl.format4",
                _cueThrowable2.getMessage())
                : "",
            _ccThrowable != null && _ccThrowable.getMessage() != null
                ? io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl.format5",
                _ccThrowable.getMessage()) : "");


      }

      _enterpriseLoginContextServiceDefaultImpl = _enterpriseLoginContextServiceDefaultImpl2;
    } finally {
      AuthToken.clearCredentials(_mapTaso);
    }

    return _enterpriseLoginContextServiceDefaultImpl;
  }

  @Override
  public void shutdown() throws Exception {

    Iterator _iterator = this.collectionRamRealm.iterator();

    while (_iterator.hasNext()) {

      Realm _realm = (Realm) _iterator.next();
      if (_realm instanceof CachingRealm) {
        ((CachingRealm) _realm).setCacheManager(null);
      }

      if (_realm instanceof Lifecycle) {
        ((Lifecycle) _realm).shutdown();
      }
    }
  }

  @Override
  public void start() throws Exception {

    Iterator _iterator = this.collectionRamRealm.iterator();

    while (_iterator.hasNext()) {

      Realm _realm = (Realm) _iterator.next();
      if (!(_realm instanceof AuthorizingRealmSystemImpl) && _realm instanceof Lifecycle) {
        ((Lifecycle) _realm).start();
      }
    }

    this.rpAuthPrivilegeManager.str();
  }

  @Override
  public void stop() throws Exception {

    Iterator _iterator = this.collectionRamRealm.iterator();

    while (_iterator.hasNext()) {

      Realm _realm = (Realm) _iterator.next();
      if (_realm instanceof Lifecycle) {
        ((Lifecycle) _realm).stop();
      }
    }
  }
}
