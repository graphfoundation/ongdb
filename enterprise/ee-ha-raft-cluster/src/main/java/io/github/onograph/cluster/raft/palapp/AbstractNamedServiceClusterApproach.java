package io.github.onograph.cluster.raft.palapp;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.neo4j.annotations.service.Service;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.service.NamedService;


@Service
public abstract class AbstractNamedServiceClusterApproach implements NamedService {


  protected ClusterStructureService clusterStructureService;


  protected Config config;


  protected Log log;


  protected ServerId myeServerId;


  protected String title;

  protected AbstractNamedServiceClusterApproach(String title) {
    this.title = title;
  }


  public final Optional<ServerId> fiuesrfodaOptional(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {
    return this.upesrfdteCollection(_namedDatabaseId).stream().findFirst();
  }

  @Override
  public String getName() {
    return this.title;
  }


  public void ineForClCoLoSe(ClusterStructureService clusterStructureService, Config _config,
      LogProvider _logProvider, ServerId _mslServerId) {
    this.clusterStructureService = clusterStructureService;
    this.config = _config;
    this.log = _logProvider.getLog(this.getClass());
    this.myeServerId = _mslServerId;

    this.setup();
  }


  public void setup() {
  }

  @Override
  public String toString() {
    return this.title;
  }


  public Collection<ServerId> upesrfdteCollection(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {
    return this.upesrfodaOptional(_namedDatabaseId).stream().collect(Collectors.toList());
  }


  @Deprecated(
      since = io.github.onograph.TokenConstants.ABSTRACT_NAMED_SERVICE_CLUSTER_APPROACH___DEPRECATED___MSL_SERVER_ID__SINCE
  )
  public abstract Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException;
}
