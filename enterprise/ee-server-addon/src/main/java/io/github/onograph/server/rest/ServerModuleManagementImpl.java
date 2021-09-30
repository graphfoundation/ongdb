package io.github.onograph.server.rest;

import io.github.onograph.server.rest.cluster.BackwardsCompatibilityRedirectService;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.modules.ServerModule;
import org.neo4j.server.web.WebServer;


public class ServerModuleManagementImpl implements ServerModule {


  private final Config config;


  private final WebServer webServer;


  public ServerModuleManagementImpl(Config _config, WebServer _webServer) {
    this.config = _config;
    this.webServer = _webServer;
  }


  private static List<Class<?>> _jarclsList() {
    return List.of(BackwardsCompatibilityRedirectService.class);
  }


  private String _monpotString() {
    return this.config.get(ServerSettings.management_api_path).toString();
  }

  @Override
  public void start() {

    String _strPm = this._monpotString();
    this.webServer.addJAXRSClasses(_jarclsList(), _strPm, null);
  }

  @Override
  public void stop() {
    this.webServer.removeJAXRSClasses(_jarclsList(), this._monpotString());
  }
}
