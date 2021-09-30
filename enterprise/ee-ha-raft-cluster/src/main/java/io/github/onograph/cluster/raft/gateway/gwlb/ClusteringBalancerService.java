package io.github.onograph.cluster.raft.gateway.gwlb;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import org.neo4j.annotations.service.Service;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.config.Configuration;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


@Service
public interface ClusteringBalancerService extends BalancerService {


  void iniForClClLoCo(ClusterStructureService _clusterStructureService,
      ClusterLeader _clusterLeader, LogProvider _logProvider, Config _config) throws Throwable;


  default boolean isSfgpi() {
    return false;
  }


  String plgneString();


  void vaitForCoLo(Configuration _configuration, Log _log);
}
