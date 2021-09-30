package io.github.onograph.server.rest;

import io.github.onograph.server.rest.cluster.DbmsApi;
import io.github.onograph.server.rest.cluster.GdbClusterApi;
import java.util.List;
import org.neo4j.configuration.Config;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.modules.ServerModule;
import org.neo4j.server.web.WebServer;


public class ServerModuleClusterImpl implements ServerModule {


  private final List<Class<?>> listCrjdClass;


  private final List<Class<?>> listDjrcClass;


  private final String strPmd;


  private final String strPmd2;


  private final WebServer webServer;


  public ServerModuleClusterImpl(Config _config, WebServer _webServer) {
    this.webServer = _webServer;
    this.strPmd = _config.get(ServerSettings.db_api_path).toString();
    this.listDjrcClass = List.of(GdbClusterApi.class);
    this.strPmd2 = io.github.onograph.TokenConstants.P___DBMS;
    this.listCrjdClass = List.of(DbmsApi.class);
  }

  @Override
  public void start() {
    this.webServer.addJAXRSClasses(this.listDjrcClass, this.strPmd, null);
    this.webServer.addJAXRSClasses(this.listCrjdClass, this.strPmd2, null);
  }

  @Override
  public void stop() {
    this.webServer.removeJAXRSClasses(this.listDjrcClass, this.strPmd);
    this.webServer.removeJAXRSClasses(this.listCrjdClass, this.strPmd2);
  }
}
