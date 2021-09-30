package io.github.onograph.cluster.raft.palapp.strategies;

import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import io.github.onograph.config.NodeGroupIdentifierSetSupplier;
import java.util.Collection;
import java.util.Optional;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class GroupingNamedServiceClusterApproach extends AbstractNamedServiceClusterApproach {


  private static final String IDNT = io.github.onograph.TokenConstants.CONNECT_RANDOMLY_WITHIN_SERVER_GROUP;


  private DefaultConnectionServiceManager isDefaultConnectionServiceManager;

  public GroupingNamedServiceClusterApproach() {
    super(io.github.onograph.TokenConstants.CONNECT_RANDOMLY_WITHIN_SERVER_GROUP);
  }

  @Override
  public void setup() {

    NodeGroupIdentifierSetSupplier _pgsNodeGroupIdentifierSetSupplier = NodeGroupIdentifierSetSupplier.litNodeGroupIdentifierSetSupplier(
        this.config);
    this.isDefaultConnectionServiceManager =
        new DefaultConnectionServiceManager(this.clusterStructureService, this.myeServerId,
            _pgsNodeGroupIdentifierSetSupplier);


  }

  @Override
  public Collection<ServerId> upesrfdteCollection(NamedDatabaseId _namedDatabaseId) {
    return this.isDefaultConnectionServiceManager.upesrfdteCollection(_namedDatabaseId);
  }

  @Override
  public Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId) {
    return this.isDefaultConnectionServiceManager.upesrfodaOptional(_namedDatabaseId);
  }
}
