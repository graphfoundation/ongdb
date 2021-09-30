package io.github.onograph.server.security;

import com.github.benmanes.caffeine.cache.Ticker;
import io.github.onograph.config.Security;
import io.github.onograph.config.SettingsDeclarationEnterpriseInteralImpl;
import io.github.onograph.dbms.GdbReplicator;
import io.github.onograph.kernel.api.security.DefaultAuthManager;
import io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl;
import io.github.onograph.server.security.auth.AuthManagerEnterpriseRealmsImpl;
import io.github.onograph.server.security.auth.AuthPrivilegeManager;
import io.github.onograph.server.security.auth.CacheCaffeineImpl;
import io.github.onograph.server.security.auth.ClusteringAuthManager;
import io.github.onograph.server.security.auth.EnterpriseDefaultLdapRealm;
import io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures;
import io.github.onograph.server.security.auth.FileRoleService;
import io.github.onograph.server.security.auth.LocalAuthManager;
import io.github.onograph.server.security.auth.RoleService;
import io.github.onograph.server.security.auth.UserCoreEnterpriseAuthProcedures;
import io.github.onograph.server.security.auth.module.AuthApiPlugin;
import io.github.onograph.server.security.auth.module.AuthenticationAuthApiLifecycle;
import io.github.onograph.server.security.auth.module.AuthorizationAuthApiLifecycle;
import io.github.onograph.server.security.auth.module.AuthorizingRealmPluginImpl;
import io.github.onograph.server.security.systemgraph.AuthorizingRealmSystemImpl;
import io.github.onograph.server.security.systemgraph.DefaultSecuritySystemGraphComponent;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.Realm;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.configuration.connectors.BoltConnectorInternalSettings;
import org.neo4j.cypher.internal.cache.CaffeineCacheFactory;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.dbms.DatabaseManagementSystemSettings;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.api.security.SecurityModule;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.DefaultDatabaseResolver;
import org.neo4j.kernel.internal.event.GlobalTransactionEventListeners;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.auth.CommunitySecurityModule;
import org.neo4j.server.security.auth.FileUserRepository;
import org.neo4j.server.security.auth.UserRepository;
import org.neo4j.server.security.systemgraph.SystemGraphRealmHelper;
import org.neo4j.service.Services;
import org.neo4j.time.Clocks;


public class SecurityModuleEnterpriseImpl extends SecurityModule {


  public static final String OPRO_DST_NAME = io.github.onograph.TokenConstants.OPERATOR_AUTH;


  private static final String RLX_DST_NAME = io.github.onograph.TokenConstants.ROLES;


  private static final String STD_ADI_DST_NAME = io.github.onograph.TokenConstants.ADMIN__INI;


  private final CaffeineCacheFactory caffeineCacheFactory;


  private final Config config;


  private final DefaultDatabaseResolver defaultDatabaseResolver;


  private final DefaultSecurityLog defaultSecurityLog;


  private final DefaultSecuritySystemGraphComponent defaultSecuritySystemGraphComponent;


  private final Dependencies dependencies;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final GlobalTransactionEventListeners globalTransactionEventListeners;


  private final Log log;


  private final LogProvider logProvider;


  private AuthManager ciAuthManager;


  private DefaultAuthManager defaultAuthManager;


  private AuthManager lobcAuthManager;


  private SecureHasher secureHasher;


  private Settings settings;


  public SecurityModuleEnterpriseImpl(CaffeineCacheFactory _caffeineCacheFactory, Config _config,
      DefaultDatabaseResolver _defaultDatabaseResolver, DefaultSecurityLog _defaultSecurityLog,
      DefaultSecuritySystemGraphComponent defaultSecuritySystemGraphComponent,
      Dependencies _dependencies, FileSystemAbstraction _fileSystemAbstraction,
      GlobalTransactionEventListeners _globalTransactionEventListeners, LogProvider _logProvider) {
    this.defaultSecurityLog = _defaultSecurityLog;
    this.config = _config;
    this.dependencies = _dependencies;
    this.globalTransactionEventListeners = _globalTransactionEventListeners;
    this.logProvider = _logProvider;
    this.log = _logProvider.getLog(this.getClass());
    this.defaultSecuritySystemGraphComponent = defaultSecuritySystemGraphComponent;
    this.caffeineCacheFactory = _caffeineCacheFactory;
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.defaultDatabaseResolver = _defaultDatabaseResolver;
  }


  private static SecurityContextEnterpriseImpl _aseesetSecurityContextEnterpriseImpl(
      SecurityContext _securityContext) {
    if (_securityContext instanceof SecurityContextEnterpriseImpl) {
      return (SecurityContextEnterpriseImpl) _securityContext;
    } else {

      String _strVr00 = SecurityContextEnterpriseImpl.class.getName();

      throw new RuntimeException("*** Error: 26a892f7-5767-4204-85af-e09c5d54d97b");
    }
  }


  private static CacheManager _crecemgCacheManager(CaffeineCacheFactory _caffeineCacheFactory,
      Config _config) {

    long _lgT = _config.get(Security.settingAuhctDuration).toMillis();

    boolean _isLttu = _config.get(Security.settingAuasBoolean);

    int _iCm = _config.get(Security.settingAuaaaInteger);
    return new CacheCaffeineImpl.CacheManagerImpl(_caffeineCacheFactory, _iCm, _isLttu, _lgT,
        Ticker.systemTicker());
  }


  private static List<AuthorizingRealmPluginImpl> _crepirlList(Config _config,
      DefaultSecurityLog _defaultSecurityLog, SecureHasher _secureHasher, Settings settings) {

    List<AuthorizingRealmPluginImpl> _listRpaAuthorizingRealmPluginImpl = new ArrayList();

    Set<Class> _setEcClass = new HashSet();

    Iterator _iterator;

    AuthorizingRealmPluginImpl _rpAuthorizingRealmPluginImpl;
    if (settings.plnaea && settings.plnaot) {
      _iterator = Services.loadAll(AuthApiPlugin.class).iterator();

      while (_iterator.hasNext()) {

        AuthApiPlugin _authApiPlugin = (AuthApiPlugin) _iterator.next();
        _rpAuthorizingRealmPluginImpl =
            new AuthorizingRealmPluginImpl(_defaultSecurityLog, Clocks.systemClock(), _config,
                _authApiPlugin, _secureHasher);
        _listRpaAuthorizingRealmPluginImpl.add(_rpAuthorizingRealmPluginImpl);
      }
    }

    if (settings.plnaea) {
      for (_iterator = Services.loadAll(AuthenticationAuthApiLifecycle.class).iterator();
          _iterator.hasNext();
          _listRpaAuthorizingRealmPluginImpl.add(_rpAuthorizingRealmPluginImpl)) {

        AuthenticationAuthApiLifecycle _puiAuthenticationAuthApiLifecycle = (AuthenticationAuthApiLifecycle) _iterator.next();
        if (settings.plnaot
            && _puiAuthenticationAuthApiLifecycle instanceof AuthorizationAuthApiLifecycle) {
          _rpAuthorizingRealmPluginImpl =
              new AuthorizingRealmPluginImpl(_defaultSecurityLog, Clocks.systemClock(), _config,
                  _puiAuthenticationAuthApiLifecycle,
                  (AuthorizationAuthApiLifecycle) _puiAuthenticationAuthApiLifecycle,
                  _secureHasher);
          _setEcClass.add(_puiAuthenticationAuthApiLifecycle.getClass());
        } else {
          _rpAuthorizingRealmPluginImpl =
              new AuthorizingRealmPluginImpl(_defaultSecurityLog, Clocks.systemClock(), _config,
                  _puiAuthenticationAuthApiLifecycle, null,
                  _secureHasher);
        }
      }
    }

    if (settings.plnaot) {
      _iterator = Services.loadAll(AuthorizationAuthApiLifecycle.class).iterator();

      while (_iterator.hasNext()) {

        AuthorizationAuthApiLifecycle _puiAuthorizationAuthApiLifecycle = (AuthorizationAuthApiLifecycle) _iterator.next();
        if (!_setEcClass.contains(_puiAuthorizationAuthApiLifecycle.getClass())) {
          _listRpaAuthorizingRealmPluginImpl
              .add(
                  new AuthorizingRealmPluginImpl(_defaultSecurityLog, Clocks.systemClock(), _config,
                      null, _puiAuthorizationAuthApiLifecycle,
                      _secureHasher));
        }
      }
    }

    _iterator = settings.setPlnapdString.iterator();

    while (_iterator.hasNext()) {

      String _strNrp = (String) _iterator.next();
      if (_listRpaAuthorizingRealmPluginImpl.stream().noneMatch((r) ->
      {
        return r.getName().equals(_strNrp);
      })) {
        throw _ilacfaIllegalArgumentException(
            String.format(io.github.onograph.I18N.format(
                    "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.format"),
                _strNrp));
      }
    }

    List<AuthorizingRealmPluginImpl> _listRamAuthorizingRealmPluginImpl = _listRpaAuthorizingRealmPluginImpl.stream()
        .filter((realm) ->
        {
          return settings.setPlnapdString.contains(
              realm.getName());
        })
        .collect(Collectors.toList());

    boolean _isRam = settings.isOnplant() && _listRamAuthorizingRealmPluginImpl.stream()
        .noneMatch(AuthorizingRealmPluginImpl::isCaati);

    boolean _isRam2 = settings.isOnplari() && _listRamAuthorizingRealmPluginImpl.stream()
        .noneMatch(AuthorizingRealmPluginImpl::isCaahi);
    if (!_isRam && !_isRam2) {
      return _listRamAuthorizingRealmPluginImpl;
    } else {

      String _strPm =
          _isRam && _isRam2 ? io.github.onograph.I18N.format(
              "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.var")
              : (_isRam ? io.github.onograph.TokenConstants.AUTHENTICATION
                  : io.github.onograph.TokenConstants.AUTHORIZATION);
      throw _ilacfaIllegalArgumentException(
          String.format(io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.format2"),
              _strPm));
    }
  }


  private static UserRepository _gedfariUserRepository(Config _config,
      FileSystemAbstraction _fileSystemAbstraction, LogProvider _logProvider) {
    return new FileUserRepository(_fileSystemAbstraction,
        _gerpoflPath(_config, io.github.onograph.TokenConstants.ADMIN__INI), _logProvider);
  }


  private static UserRepository _geoeruriUserRepository(Config _config,
      FileSystemAbstraction _fileSystemAbstraction, LogProvider _logProvider) {
    return new FileUserRepository(_fileSystemAbstraction,
        _gerpoflPath(_config, io.github.onograph.TokenConstants.OPERATOR_AUTH), _logProvider);
  }


  private static RoleService _gerlrorRoleService(Config _config,
      FileSystemAbstraction _fileSystemAbstraction, LogProvider _logProvider) {
    return new FileRoleService(_fileSystemAbstraction, _logProvider,
        _gerpoflPath(_config, io.github.onograph.TokenConstants.ROLES));
  }


  private static Path _gerpoflPath(Config _config, String _strNf) {

    Path _psaPath = _config.get(DatabaseManagementSystemSettings.auth_store_directory);
    return _psaPath.resolve(_strNf);
  }


  private static Settings _gevlesucgSecurityModuleEnterpriseImplSettings(Config _config) {

    Settings settings = new Settings(_config);
    settings.vait();
    return settings;
  }


  private static IllegalArgumentException _ilacfaIllegalArgumentException(String m) {
    return new IllegalArgumentException("*** Error: 657857b5-0e8a-46d2-ac20-6593cdb86972");
  }


  private static List<Realm> _setoratreList(List<Realm> _listRaRealm, List<String> _listRcString) {

    List<Realm> _listRaoRealm = new ArrayList(_listRcString.size());

    Iterator _iterator = _listRcString.iterator();

    while (true) {
      while (_iterator.hasNext()) {

        String _strCrn = (String) _iterator.next();

        Iterator _iterator2 = _listRaRealm.iterator();

        while (_iterator2.hasNext()) {

          Realm _realm = (Realm) _iterator2.next();
          if (_strCrn.equals(_realm.getName())) {
            _listRaoRealm.add(_realm);
            break;
          }
        }
      }

      return _listRaoRealm;
    }
  }


  public static DefaultSecuritySystemGraphComponent cresrcoeDefaultSecuritySystemGraphComponent(
      Config _config, DefaultSecurityLog _defaultSecurityLog,
      FileSystemAbstraction _fileSystemAbstraction, LogProvider _logProvider) {

    RoleService _rrmRoleService = _gerlrorRoleService(_config, _fileSystemAbstraction,
        _logProvider);

    UserRepository _radUserRepository = _gedfariUserRepository(_config, _fileSystemAbstraction,
        _logProvider);
    return new DefaultSecuritySystemGraphComponent(_defaultSecurityLog, _config, _radUserRepository,
        _rrmRoleService);
  }


  public static Path geoerurifPath(Config _config) {
    return _gerpoflPath(_config, io.github.onograph.TokenConstants.OPERATOR_AUTH);
  }


  static List<String> meantanahaList(List<String> _listApString, List<String> _listPaString) {

    Deque<String> _dequeDaString = new ArrayDeque(_listPaString);

    List<String> _listPaString2 = new ArrayList();

    Iterator _iterator = _listApString.iterator();

    while (true) {
      while (_iterator.hasNext()) {

        String _strPa = (String) _iterator.next();
        if (_listPaString2.contains(_strPa)) {
          throw _ilacfaIllegalArgumentException(io.github.onograph.I18N.format(
              "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.ilacfaIllegalArgumentException"));
        }

        if (!_dequeDaString.contains(_strPa)) {
          _listPaString2.add(_strPa);
        } else {
          while (!_dequeDaString.isEmpty()) {

            String _strT = _dequeDaString.pop();
            _listPaString2.add(_strT);
            if (_strPa.equals(_strT)) {
              break;
            }
          }
        }
      }

      _listPaString2.addAll(_dequeDaString);
      return _listPaString2;
    }
  }


  private AuthorizingRealmSystemImpl _cresegprlAuthorizingRealmSystemImpl(
      AuthenticationStrategy _authenticationStrategy,
      Supplier<GraphDatabaseService> _supplierSsGraphDatabaseService) {
    return new AuthorizingRealmSystemImpl(_authenticationStrategy, this.caffeineCacheFactory,
        this.defaultSecuritySystemGraphComponent,
        this.settings.naeaea,
        this.settings.naeaot,
        new SystemGraphRealmHelper(_supplierSsGraphDatabaseService, this.secureHasher));
  }

  @Override
  public AuthManager authManager() {
    return this.defaultAuthManager;
  }

  @Override
  public AuthManager inClusterAuthManager() {
    return this.ciAuthManager;
  }

  @Override
  public AuthManager loopbackAuthManager() {
    return this.lobcAuthManager;
  }


  DefaultAuthManager neahmneDefaultAuthManager(DefaultSecurityLog _defaultSecurityLog,
      Supplier<GraphDatabaseService> _supplierSsGraphDatabaseService) {
    this.settings = _gevlesucgSecurityModuleEnterpriseImplSettings(this.config);

    List<Realm> _listRamRealm = new ArrayList(this.settings.listAuhpodsString.size() + 1);

    SecureHasher _secureHasher = new SecureHasher();

    AuthenticationStrategy _authenticationStrategy = CommunitySecurityModule.createAuthenticationStrategy(
        this.config);

    AuthorizingRealmSystemImpl _riAuthorizingRealmSystemImpl =
        this._cresegprlAuthorizingRealmSystemImpl(_authenticationStrategy,
            _supplierSsGraphDatabaseService);
    _listRamRealm.add(_riAuthorizingRealmSystemImpl);
    if (this.settings.halapv) {
      _listRamRealm.add(
          new EnterpriseDefaultLdapRealm(_defaultSecurityLog, this.config, this.settings.ldauti,
              this.settings.ldauio, this.logProvider, _secureHasher));
    }

    if (!this.settings.setPlnapdString.isEmpty()) {
      _listRamRealm.addAll(
          _crepirlList(this.config, _defaultSecurityLog, _secureHasher, this.settings));
    }

    List<Realm> _listRaoRealm = _setoratreList(_listRamRealm, this.settings.listAuhpodsString);
    if (_listRaoRealm.isEmpty()) {
      throw _ilacfaIllegalArgumentException(io.github.onograph.I18N.format(
          "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.ilacfaIllegalArgumentException2"));
    } else {

      AuthPrivilegeManager _rpAuthPrivilegeManager = new AuthPrivilegeManager(
          _riAuthorizingRealmSystemImpl, this.config);

      Boolean _isSal = this.config.get(Security.settingSeigeleaBoolean);
      this.ciAuthManager = new ClusteringAuthManager(_defaultSecurityLog,
          this.defaultDatabaseResolver, _isSal, _rpAuthPrivilegeManager);
      if (this.config.get(BoltConnectorInternalSettings.enable_loopback_auth)) {
        this.lobcAuthManager =
            new LocalAuthManager(_defaultSecurityLog, _authenticationStrategy,
                _isSal,
                _geoeruriUserRepository(this.config, this.fileSystemAbstraction, this.logProvider));
      }

      return new AuthManagerEnterpriseRealmsImpl(_defaultSecurityLog,
          _crecemgCacheManager(this.caffeineCacheFactory, this.config), _listRaoRealm,
          this.config, this.defaultDatabaseResolver, _rpAuthPrivilegeManager);
    }
  }

  @Override
  public void setup() {
    this.secureHasher = new SecureHasher();

    Supplier<GraphDatabaseService> _supplierSsGraphDatabaseService = () ->
    {

      DatabaseManager<?> _databaseManagerMdObject = (DatabaseManager) this.dependencies.resolveDependency(
          DatabaseManager.class);
      return _databaseManagerMdObject.getDatabaseContext(
          DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID).orElseThrow(() ->

      {
        return new RuntimeException(
            "*** Error:  9f9b1464-598e-4227-92b0-e638de23d18f");
      }).databaseFacade();
    };

    boolean _isCi = this.config.get(GraphDatabaseSettings.mode) == Mode.CORE
        || this.config.get(GraphDatabaseSettings.mode) == Mode.READ_REPLICA;
    this.defaultAuthManager = this.neahmneDefaultAuthManager(this.defaultSecurityLog,
        _supplierSsGraphDatabaseService);
    this.dependencies.satisfyDependency(this.defaultAuthManager);

    TransactionEventListenerAdapterEnterpriseSecurityImpl _ledTransactionEventListenerAdapterEnterpriseSecurityImpl =
        new TransactionEventListenerAdapterEnterpriseSecurityImpl(this.defaultAuthManager);
    if (_isCi) {

      GdbReplicator _rdesGdbReplicator =
          this.dependencies.resolveDependency(GdbReplicator.class);
      _rdesGdbReplicator.retlsrForNaGd(_ledTransactionEventListenerAdapterEnterpriseSecurityImpl,
          DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
    } else {
      this.globalTransactionEventListeners.registerTransactionEventListener(
          io.github.onograph.TokenConstants.SYSTEM,
          _ledTransactionEventListenerAdapterEnterpriseSecurityImpl);
    }

    GlobalProcedures _globalProcedures = this.dependencies.resolveDependency(
        GlobalProcedures.class);
    _globalProcedures.registerComponent(DefaultAuthManager.class, (ctx) ->
    {
      return this.defaultAuthManager;
    }, false);
    _globalProcedures.registerComponent(SecurityContextEnterpriseImpl.class, (ctx) ->
    {
      return _aseesetSecurityContextEnterpriseImpl(ctx.securityContext());
    }, true);
    if (this.settings.naeaee) {
      if (this.config.get(Security.settingAuntreList).size() <= 1 &&
          this.config.get(Security.settingAuriorList).size() <= 1) {
        registerProcedure(_globalProcedures, this.log, UserCoreEnterpriseAuthProcedures.class,
            null);
      } else {
        registerProcedure(_globalProcedures, this.log, UserCoreEnterpriseAuthProcedures.class,
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.registerProcedure"));
      }
    }

    registerProcedure(_globalProcedures, this.log,
        EnterpriseSecurityCoreEnterpriseAuthProcedures.class, null);
  }


  protected static class Settings {

    final boolean ldauio;

    final boolean ldauti;

    final List<String> listAuhpodsString;

    final List<String> listPlnaeapdString;

    final List<String> listPlnaotpreString;

    final boolean naeaea;

    final boolean naeaee;

    final boolean naeaot;

    final boolean plnaea;

    final boolean plnaot;

    final Set<String> setPlnapdString;


    private final boolean isAp;


    private final String strMap;


    boolean halapv;


    boolean hantpre;

    Settings(Config _config) {

      List<String> _listPaString = new ArrayList(_config.get(Security.settingAuntreList));

      List<String> _listPaString2 = new ArrayList(_config.get(Security.settingAuriorList));
      this.listAuhpodsString = SecurityModuleEnterpriseImpl.meantanahaList(_listPaString,
          _listPaString2);
      this.hantpre = _listPaString.contains(io.github.onograph.TokenConstants.NATIVE) ||
          _listPaString2.contains(io.github.onograph.TokenConstants.NATIVE);
      this.halapv = _listPaString.contains(io.github.onograph.TokenConstants.LDAP) ||
          _listPaString2.contains(io.github.onograph.TokenConstants.LDAP);
      this.listPlnaeapdString = _listPaString.stream().filter((r) ->
      {
        return r.startsWith(io.github.onograph.TokenConstants.PLUGIN_);
      }).collect(Collectors.toList());
      this.listPlnaotpreString = _listPaString2.stream().filter((r) ->
      {
        return r.startsWith(io.github.onograph.TokenConstants.PLUGIN_);
      }).collect(Collectors.toList());
      this.setPlnapdString = new HashSet();
      this.setPlnapdString.addAll(this.listPlnaeapdString);
      this.setPlnapdString.addAll(this.listPlnaotpreString);
      this.naeaea = _listPaString.contains(io.github.onograph.TokenConstants.NATIVE);
      this.naeaot = _listPaString2.contains(io.github.onograph.TokenConstants.NATIVE);
      this.naeaee = this.naeaea || this.naeaot;
      this.ldauti = _listPaString.contains(io.github.onograph.TokenConstants.LDAP);
      this.ldauio = _listPaString2.contains(io.github.onograph.TokenConstants.LDAP);
      this.plnaea = !this.listPlnaeapdString.isEmpty();
      this.plnaot = !this.listPlnaotpreString.isEmpty();
      this.isAp = _config.get(SettingsDeclarationEnterpriseInteralImpl.settingPrrvtznlBoolean);
      this.strMap = _config.get(SettingsDeclarationEnterpriseInteralImpl.settingPrrvtzninString);
    }


    boolean isOnplant() {
      return !this.naeaea && !this.ldauti && this.plnaea;
    }


    boolean isOnplari() {
      return !this.naeaot && !this.ldauio && this.plnaot;
    }


    protected void vait() {
      if (!this.naeaea && !this.ldauti && !this.plnaea) {
        throw SecurityModuleEnterpriseImpl._ilacfaIllegalArgumentException(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.Settings.ilacfaIllegalArgumentException"));
      } else if (!this.naeaot && !this.ldauio && !this.plnaot) {
        throw SecurityModuleEnterpriseImpl._ilacfaIllegalArgumentException(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.Settings.ilacfaIllegalArgumentException2"));
      } else if (this.isAp || this.strMap != null) {
        throw SecurityModuleEnterpriseImpl._ilacfaIllegalArgumentException(
            io.github.onograph.I18N.format(
                "io.github.onograph.server.security.SecurityModuleEnterpriseImpl.Settings.ilacfaIllegalArgumentException3"));
      }
    }
  }
}
