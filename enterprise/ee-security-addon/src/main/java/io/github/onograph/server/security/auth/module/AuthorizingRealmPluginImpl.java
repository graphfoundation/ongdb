package io.github.onograph.server.security.auth.module;

import io.github.onograph.server.security.auth.AuthorizationInfoSa;
import io.github.onograph.server.security.auth.Lifecycle;
import java.nio.file.Path;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.internal.Version;
import org.neo4j.server.security.auth.ShiroAuthToken;


public class AuthorizingRealmPluginImpl extends AuthorizingRealm implements Lifecycle,
    AuthorizationInfoSa {


  private final AbstractSecurityLog abstractSecurityLog;


  private final Clock clock;


  private final Config config;


  private final AuthApi opaAuthApi;


  private final SecureHasher secureHasher;


  private AuthApiPlugin paAuthApiPlugin;


  private AuthenticationAuthApiLifecycle paAuthenticationAuthApiLifecycle;


  private AuthorizationAuthApiLifecycle paAuthorizationAuthApiLifecycle;


  public AuthorizingRealmPluginImpl(AbstractSecurityLog _abstractSecurityLog, Clock _clock,
      Config _config, SecureHasher _secureHasher) {
    this.opaAuthApi = new AuthApiProcImpl();
    this.config = _config;
    this.clock = _clock;
    this.secureHasher = _secureHasher;
    this.abstractSecurityLog = _abstractSecurityLog;
    this.setCredentialsMatcher(new CredentialsMatcherImpl());
    this.setAuthenticationCachingEnabled(false);
    this.setAuthorizationCachingEnabled(true);
  }


  public AuthorizingRealmPluginImpl(AbstractSecurityLog _abstractSecurityLog, Clock _clock,
      Config _config, AuthenticationAuthApiLifecycle _paAuthenticationAuthApiLifecycle,
      AuthorizationAuthApiLifecycle _paAuthorizationAuthApiLifecycle, SecureHasher _secureHasher) {
    this(_abstractSecurityLog, _clock, _config, _secureHasher);
    this.paAuthenticationAuthApiLifecycle = _paAuthenticationAuthApiLifecycle;
    this.paAuthorizationAuthApiLifecycle = _paAuthorizationAuthApiLifecycle;
    this._revpgnm();
  }


  public AuthorizingRealmPluginImpl(AbstractSecurityLog _abstractSecurityLog, Clock _clock,
      Config _config, AuthApiPlugin _paAuthApiPlugin, SecureHasher _secureHasher) {
    this(_abstractSecurityLog, _clock, _config, _secureHasher);
    this.paAuthApiPlugin = _paAuthApiPlugin;
    this._revpgnm();
  }


  private static PrincipalServiceCredentialCachingImpl.AuthTokenComparer _gecscrtmeiprtPrincipalServiceCredentialCachingImplAuthTokenComparer(
      AuthenticationInfo _authenticationInfo) {
    return _authenticationInfo instanceof AuthenticationTokenCheckerService
        ? ((AuthenticationTokenCheckerService) _authenticationInfo).geceimarPrincipalServiceCredentialCachingImplAuthTokenComparer()
        : null;
  }


  private static Collection<AuthorizationAuthApiLifecycle.PrincipalAuthProviderWrapper> _gepiaapdcliCollection(
      PrincipalCollection _principalCollection) {

    Collection<AuthorizationAuthApiLifecycle.PrincipalAuthProviderWrapper> principalAuthProvWrapper = new ArrayList();

    Iterator _iterator = _principalCollection.getRealmNames().iterator();

    while (_iterator.hasNext()) {

      String _strRam = (String) _iterator.next();

      Iterator _iterator2 = _principalCollection.fromRealm(_strRam).iterator();

      while (_iterator2.hasNext()) {

        Object usrPrcpl = _iterator2.next();
        principalAuthProvWrapper.add(
            new AuthorizationAuthApiLifecycle.PrincipalAuthProviderWrapper(_strRam, usrPrcpl));
      }
    }

    return principalAuthProvWrapper;
  }


  private void _caariifForSh(
      ShiroAuthenticationInfoAllAuthImpl _iaShiroAuthenticationInfoAllAuthImpl) {

    Cache<Object, AuthorizationInfo> _cacheCaoa = this.getAuthorizationCache();

    Object k = this.getAuthorizationCacheKey(_iaShiroAuthenticationInfoAllAuthImpl.getPrincipals());
    _cacheCaoa.put(k, _iaShiroAuthenticationInfoAllAuthImpl);
  }


  private boolean _isSurshanrlForAu(AuthenticationToken _authenticationToken) {
    if (_authenticationToken instanceof ShiroAuthToken) {

      ShiroAuthToken _shiroAuthToken = (ShiroAuthToken) _authenticationToken;
      return _shiroAuthToken.supportsRealm(this.getName());
    } else {
      return false;
    }
  }


  private void _revpgnm() {

    String _strPn = null;
    if (this.paAuthApiPlugin != null) {
      _strPn = this.paAuthApiPlugin.name();
    } else if (this.paAuthenticationAuthApiLifecycle != null) {
      _strPn = this.paAuthenticationAuthApiLifecycle.name();
    } else if (this.paAuthorizationAuthApiLifecycle != null) {
      _strPn = this.paAuthorizationAuthApiLifecycle.name();
    }

    if (_strPn != null && !_strPn.isEmpty()) {
      this.setName(io.github.onograph.I18N.format(
          "io.github.onograph.server.security.auth.module.AuthorizingRealmPluginImpl.setName",
          _strPn));
    }
  }

  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken _authenticationToken)
      throws AuthenticationException {
    if (_authenticationToken instanceof ShiroAuthToken) {
      try {

        AuthenticationTokenEnterprisePluginImpl _tapAuthenticationTokenEnterprisePluginImpl =
            AuthenticationTokenEnterprisePluginImpl.crafmmpAuthenticationTokenEnterprisePluginImpl(
                ((ShiroAuthToken) _authenticationToken).getAuthTokenMap());

        ShiroAuthenticationInfoAuthenticationOnlyImpl _shiroAuthenticationInfoAuthenticationOnlyImpl;
        try {
          if (this.paAuthApiPlugin != null) {

            PrincipalAndRolesProvider _iaPrincipalAndRolesProvider =
                this.paAuthApiPlugin.auntaarPrincipalAndRolesProvider(
                    _tapAuthenticationTokenEnterprisePluginImpl);
            if (_iaPrincipalAndRolesProvider == null) {
              return null;
            }

            ShiroAuthenticationInfoAllAuthImpl _iapShiroAuthenticationInfoAllAuthImpl =
                ShiroAuthenticationInfoAllAuthImpl.creceShiroAuthenticationInfoAllAuthImpl(
                    _iaPrincipalAndRolesProvider, this.getName(),
                    this.secureHasher);
            this._caariifForSh(_iapShiroAuthenticationInfoAllAuthImpl);

            ShiroAuthenticationInfoAllAuthImpl _shiroAuthenticationInfoAllAuthImpl = _iapShiroAuthenticationInfoAllAuthImpl;
            return _shiroAuthenticationInfoAllAuthImpl;
          }

          if (this.paAuthenticationAuthApiLifecycle == null) {
            return null;
          }

          PluginPrincipalService _aiPluginPrincipalService =
              this.paAuthenticationAuthApiLifecycle.auhtaPluginPrincipalService(
                  _tapAuthenticationTokenEnterprisePluginImpl);
          if (_aiPluginPrincipalService == null) {
            return null;
          }

          _shiroAuthenticationInfoAuthenticationOnlyImpl =
              ShiroAuthenticationInfoAuthenticationOnlyImpl.creceShiroAuthenticationInfoAuthenticationOnlyImpl(
                  _aiPluginPrincipalService,
                  this.getName(),
                  this.secureHasher);
        } finally {
          _tapAuthenticationTokenEnterprisePluginImpl.clcns();
        }

        return _shiroAuthenticationInfoAuthenticationOnlyImpl;
      } catch (

          InvalidAuthTokenException | AuthException _exception) {
        throw new AuthenticationException(_exception.getMessage(), _exception.getCause());
      }
    } else {
      return null;
    }
  }

  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(
      PrincipalCollection _picplPrincipalCollection) {
    if (this.paAuthorizationAuthApiLifecycle != null) {

      RolesProvider _iaRolesProvider;
      try {
        _iaRolesProvider = this.paAuthorizationAuthApiLifecycle.auhiRolesProvider(
            _gepiaapdcliCollection(_picplPrincipalCollection));
      } catch (

          ExpiredAuthException _expiredAuthException) {

        throw new org.neo4j.graphdb.security.AuthorizationExpiredException(
            "*** Error: da9580dc-bd54-4421-ad33-865dd635239a", _expiredAuthException);
      }

      if (_iaRolesProvider != null) {
        return SimpleAuthorizationInfoPluginImpl.craSimpleAuthorizationInfoPluginImpl(
            _iaRolesProvider);
      }
    } else if (this.paAuthApiPlugin != null && !_picplPrincipalCollection.fromRealm(this.getName())
        .isEmpty()) {

      throw new org.neo4j.graphdb.security.AuthorizationExpiredException(
          "*** Error: 28a14d28-e927-46ae-af33-9611d60abc4b");
    }

    return null;
  }

  @Override
  public AuthorizationInfo geatznhAuthorizationInfo(PrincipalCollection _principalCollection) {
    return this.getAuthorizationInfo(_principalCollection);
  }

  @Override
  protected Object getAuthenticationCacheKey(AuthenticationToken _authenticationToken) {
    return _authenticationToken != null ? _authenticationToken.getPrincipal() : null;
  }

  @Override
  protected Object getAuthorizationCacheKey(PrincipalCollection _picplPrincipalCollection) {
    return this.getAvailablePrincipal(_picplPrincipalCollection);
  }


  public boolean isCaahi() {
    return this.paAuthApiPlugin != null || this.paAuthorizationAuthApiLifecycle != null;
  }


  public boolean isCaati() {
    return this.paAuthApiPlugin != null || this.paAuthenticationAuthApiLifecycle != null;
  }

  @Override
  public void setup() throws Exception {
    if (this.paAuthenticationAuthApiLifecycle != null) {
      this.paAuthenticationAuthApiLifecycle.setup(this.opaAuthApi);
    }

    if (this.paAuthorizationAuthApiLifecycle != null
        && this.paAuthorizationAuthApiLifecycle != this.paAuthenticationAuthApiLifecycle) {
      this.paAuthorizationAuthApiLifecycle.setup(this.opaAuthApi);
    }

    if (this.paAuthApiPlugin != null) {
      this.paAuthApiPlugin.setup(this.opaAuthApi);
    }
  }

  @Override
  public void shutdown() {
    if (this.paAuthenticationAuthApiLifecycle != null) {
      this.paAuthenticationAuthApiLifecycle.shutdown();
    }

    if (this.paAuthorizationAuthApiLifecycle != null
        && this.paAuthorizationAuthApiLifecycle != this.paAuthenticationAuthApiLifecycle) {
      this.paAuthorizationAuthApiLifecycle.shutdown();
    }

    if (this.paAuthApiPlugin != null) {
      this.paAuthApiPlugin.shutdown();
    }
  }

  @Override
  public void start() throws Exception {
    if (this.paAuthenticationAuthApiLifecycle != null) {
      this.paAuthenticationAuthApiLifecycle.start();
    }

    if (this.paAuthorizationAuthApiLifecycle != null
        && this.paAuthorizationAuthApiLifecycle != this.paAuthenticationAuthApiLifecycle) {
      this.paAuthorizationAuthApiLifecycle.start();
    }

    if (this.paAuthApiPlugin != null) {
      this.paAuthApiPlugin.start();
    }
  }

  @Override
  public void stop() throws Exception {
    if (this.paAuthenticationAuthApiLifecycle != null) {
      this.paAuthenticationAuthApiLifecycle.stop();
    }

    if (this.paAuthorizationAuthApiLifecycle != null
        && this.paAuthorizationAuthApiLifecycle != this.paAuthenticationAuthApiLifecycle) {
      this.paAuthorizationAuthApiLifecycle.stop();
    }

    if (this.paAuthApiPlugin != null) {
      this.paAuthApiPlugin.stop();
    }
  }

  @Override
  public boolean supports(AuthenticationToken _authenticationToken) {
    return this._isSurshanrlForAu(_authenticationToken);
  }


  private class AuthApiProcImpl implements AuthApi {


    private final Logger locLogger = new Logger() {


      private String authorizingRealmPluginName(String m) {

        String _strVr00 = AuthorizingRealmPluginImpl.this.getName();
        return io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.module.AuthorizingRealmPluginImpl.AuthApiProcImpl.authorizingRealmPluginName",
            _strVr00,
            m);
      }

      @Override
      public void deuForSt(String m) {

      }

      @Override
      public void eroForSt(String m) {

      }

      @Override
      public void infForSt(String m) {

      }

      @Override
      public boolean isDegeae() {
        return AuthorizingRealmPluginImpl.this.abstractSecurityLog.isDebugEnabled();
      }

      @Override
      public void warForSt(String m) {

      }
    };

    @Override
    public Clock clcClock() {
      return AuthorizingRealmPluginImpl.this.clock;
    }

    @Override
    public Logger logAuthApiLogger() {
      return this.locLogger;
    }

    @Override
    public Optional<Path> nejcngflOptional() {
      return Optional.empty();
    }

    @Override
    public Path nejhmPath() {
      return AuthorizingRealmPluginImpl.this.config.get(GraphDatabaseSettings.neo4j_home)
          .toAbsolutePath();
    }

    @Override
    public String nejvroString() {
      return Version.getNeo4jVersion();
    }

    @Override
    public void seatiochend(boolean _isEca) {
      AuthorizingRealmPluginImpl.this.setAuthenticationCachingEnabled(_isEca);
    }

    @Override
    public void seatznciea(boolean _isAce) {
      AuthorizingRealmPluginImpl.this.setAuthorizationCachingEnabled(_isAce);
    }
  }


  private class CredentialsMatcherImpl implements
      org.apache.shiro.authc.credential.CredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken _authenticationToken,
        AuthenticationInfo _authenticationInfo) {

      PrincipalServiceCredentialCachingImpl.AuthTokenComparer cfgAuthTokenComparer =
          AuthorizingRealmPluginImpl._gecscrtmeiprtPrincipalServiceCredentialCachingImplAuthTokenComparer(
              _authenticationInfo);
      if (cfgAuthTokenComparer != null) {

        Map _taMap = ((ShiroAuthToken) _authenticationToken).getAuthTokenMap();

        try {

          AuthenticationTokenEnterprisePluginImpl _taapAuthenticationTokenEnterprisePluginImpl =
              AuthenticationTokenEnterprisePluginImpl.crafmmpAuthenticationTokenEnterprisePluginImpl(
                  _taMap);

          boolean _isVr7 = false;

          boolean _isVar;
          try {
            _isVr7 = true;
            _isVar = cfgAuthTokenComparer.isAuthMatch(_taapAuthenticationTokenEnterprisePluginImpl);
            _isVr7 = false;
          } finally {
            if (_isVr7) {

              char[] _cCeetaArray = _taapAuthenticationTokenEnterprisePluginImpl.crdtl();
              if (_cCeetaArray != null) {
                Arrays.fill(_cCeetaArray, '\u0000');
              }
            }
          }

          char[] credsObj = _taapAuthenticationTokenEnterprisePluginImpl.crdtl();
          if (credsObj != null) {
            Arrays.fill(credsObj, '\u0000');
          }

          return _isVar;
        } catch (

            InvalidAuthTokenException _invalidAuthTokenException) {
          throw new AuthenticationException(_invalidAuthTokenException.getMessage());
        }
      } else if (_authenticationInfo.getCredentials() != null) {

        ShiroAuthTokenAddonImpl sat = ShiroAuthTokenAddonImpl.ofShiroAuthTokenAddonImpl(
            _authenticationToken);

        boolean _isVa;
        try {
          _isVa = AuthorizingRealmPluginImpl.this.secureHasher.getHashedCredentialsMatcher()
              .doCredentialsMatch(sat, _authenticationInfo);
        } finally {
          sat.clcns();
        }

        return _isVa;
      } else if (AuthorizingRealmPluginImpl.this.isAuthenticationCachingEnabled()) {

        return false;
      } else {
        return true;
      }
    }
  }
}
