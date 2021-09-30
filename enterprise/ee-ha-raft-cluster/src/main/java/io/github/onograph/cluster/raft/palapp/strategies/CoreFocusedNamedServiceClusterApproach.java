package io.github.onograph.cluster.raft.palapp.strategies;

import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class CoreFocusedNamedServiceClusterApproach extends AbstractNamedServiceClusterApproach {


  static final String IDNT = io.github.onograph.TokenConstants.CONNECT_TO_RANDOM_CORE_SERVER;

  public CoreFocusedNamedServiceClusterApproach() {
    super(io.github.onograph.TokenConstants.CONNECT_TO_RANDOM_CORE_SERVER);
  }


  private Stream<ServerId> _chStream(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {

    DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure = this.clusterStructureService.cotogfdaDatabaseCoreClusterStructure(
        _namedDatabaseId);
    if (_tcDatabaseCoreClusterStructure.sevsMap().isEmpty()) {

      throw new NamedServiceApproachException("*** Error:  6f570e73-6737-4f25-a702-7289f29f7aeb");
    } else {

      ArrayList<ServerId> _arrayListSresServerId = new ArrayList(
          _tcDatabaseCoreClusterStructure.sevsMap().keySet());
      Collections.shuffle(_arrayListSresServerId);
      return _arrayListSresServerId.stream();
    }
  }

  @Override
  public Collection<ServerId> upesrfdteCollection(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {
    return this._chStream(_namedDatabaseId).collect(Collectors.toList());
  }

  @Override
  public Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {
    return this._chStream(_namedDatabaseId).findFirst();
  }
}
