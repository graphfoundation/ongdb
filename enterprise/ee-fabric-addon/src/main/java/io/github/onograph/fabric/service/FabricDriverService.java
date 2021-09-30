package io.github.onograph.fabric.service;


import org.neo4j.configuration.GraphDatabaseSettings.DriverApi;
import org.neo4j.driver.Config;
import org.neo4j.driver.internal.security.SecurityPlan;
import org.neo4j.fabric.executor.Location.Remote;


public interface FabricDriverService {


  Config cracfForLo(Remote _remote);


  SecurityPlan cresrplForLo(Remote _remote);


  DriverApi gedvaGraphDatabaseSettingsDriverApi(Remote _remote);
}
