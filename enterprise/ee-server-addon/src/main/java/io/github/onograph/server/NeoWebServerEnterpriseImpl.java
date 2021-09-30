package io.github.onograph.server;

import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.server.rest.DiscoverableURIService;
import io.github.onograph.server.rest.ServerModuleClusterImpl;
import io.github.onograph.server.rest.ServerModuleManagementImpl;
import io.github.onograph.server.rest.cluster.BackwardsCompatibilityRedirectService;
import io.github.onograph.server.rest.cluster.DbmsApi;
import io.github.onograph.server.rest.cluster.GdbClusterApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryPools;
import org.neo4j.server.CommunityNeoWebServer;
import org.neo4j.server.configuration.ConfigurableServerModules;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.modules.AuthorizationModule;
import org.neo4j.server.modules.DBMSModule;
import org.neo4j.server.modules.ServerModule;
import org.neo4j.server.rest.discovery.DiscoverableURIs;


public class NeoWebServerEnterpriseImpl extends CommunityNeoWebServer {

  public NeoWebServerEnterpriseImpl(Config _config,
      DatabaseManagementService _databaseManagementService, DbmsInfo _dbmsInfo,
      Dependencies _goaDependencies, MemoryPools _memoryPools, LogProvider _useLogProvider) {
    super(_databaseManagementService, _goaDependencies, _config, _useLogProvider, _dbmsInfo,
        _memoryPools);
  }

  @Override
  protected AuthorizationModule createAuthorizationModule() {
    return new AuthorizationModuleEnterpriseImpl(this.getConfig(), this.getUriWhitelist(),
        this.userLogProvider, this.authManagerSupplier,
        this.webServer);
  }

  @Override
  protected DBMSModule createDBMSModule() {

    Supplier<DiscoverableURIs> _supplierIrudDiscoverableURIs = () ->
    {
      return DiscoverableURIService.enpdvlurDiscoverableURIs(this.getConfig(),
          this.connectorPortRegister);
    };
    return new DBMSModule(this.webServer, this.getConfig(), _supplierIrudDiscoverableURIs,
        this.userLogProvider);
  }

  @Override
  protected Iterable<ServerModule> createServerModules() {

    Config _config = this.getConfig();

    Set<ConfigurableServerModules> _setMeConfigurableServerModules = _config.get(
        ServerSettings.http_enabled_modules);

    ArrayList<ServerModule> _arrayListMsServerModule = new ArrayList();
    if (_setMeConfigurableServerModules.contains(
        ConfigurableServerModules.ENTERPRISE_MANAGEMENT_ENDPOINTS)) {
      _arrayListMsServerModule.add(new ServerModuleClusterImpl(this.getConfig(), this.webServer));
      _arrayListMsServerModule.add(
          new ServerModuleManagementImpl(this.getConfig(), this.webServer));
    }

    Iterable<ServerModule> _iterableVr00ServerModule = super.createServerModules();
    Objects.requireNonNull(_arrayListMsServerModule);
    _iterableVr00ServerModule.forEach(_arrayListMsServerModule::add);
    return _arrayListMsServerModule;
  }

  @Override
  protected List<Pattern> getUriWhitelist() {

    ArrayList<Pattern> _arrayListRslPattern = new ArrayList(super.getUriWhitelist());
    if (!(Boolean) this.getConfig().get(SettingsDeclarationClusterImpl.settingStseeBoolean)) {
      _arrayListRslPattern.add(DbmsApi.dbclrupanPattern());
      _arrayListRslPattern.add(GdbClusterApi.daacuuptPattern(this.getConfig()));
      _arrayListRslPattern.add(
          BackwardsCompatibilityRedirectService.daalgclrupanPattern(this.getConfig()));
    }

    return _arrayListRslPattern;
  }
}
