package io.github.onograph.dbms;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.scheduler.JobScheduler;


public class DbmsStateFacadeClusterImpl extends DbmsStateResolverFacade {


  private final ClusterSimpleStorageFacade fssClusterSimpleStorageFacade;


  private final LogProvider logProvider;


  DbmsStateFacadeClusterImpl(Config _config,
      ClusterSimpleStorageFacade _fssClusterSimpleStorageFacade, JobScheduler _jobScheduler,
      LogProvider _logProvider, StateChangeTrackerMapping _ttStateChangeTrackerMapping) {
    super(_config, _jobScheduler, _logProvider, _ttStateChangeTrackerMapping);
    this.logProvider = _logProvider;
    this.fssClusterSimpleStorageFacade = _fssClusterSimpleStorageFacade;
  }


  private DatabaseLogProvider _daalgpiDatabaseLogProvider(NamedDatabaseId _namedDatabaseId) {
    return new DatabaseLogProvider(_namedDatabaseId, this.logProvider);
  }


  private Optional<ConsensusMemberGroupId> _reraifdteOptional(
      DatabaseLogProvider _databaseLogProvider, NamedDatabaseId _namedDatabaseId) {

    String gdbName = _namedDatabaseId.name();

    SimpleStorage<ConsensusMemberGroupId> _simpleStorageSirConsensusMemberGroupId =
        this.fssClusterSimpleStorageFacade.crergrSimpleStorage(_databaseLogProvider, gdbName);
    if (!_simpleStorageSirConsensusMemberGroupId.exists()) {
      return Optional.empty();
    } else {
      try {
        return Optional.ofNullable(_simpleStorageSirConsensusMemberGroupId.readState());
      } catch (

          IOException _iOException) {

        throw new DatabaseManagementException("*** Error: b3d8f30c-8bbb-42dd-9fdd-54c9268d1a4d");
      }
    }
  }

  @Override
  protected DatabaseStateEnterpriseImpl inaroeerDatabaseStateEnterpriseImpl(
      NamedDatabaseId _namedDatabaseId) {

    Optional<ConsensusMemberGroupId> _optionalOirConsensusMemberGroupId =
        this._reraifdteOptional(this._daalgpiDatabaseLogProvider(_namedDatabaseId),
            _namedDatabaseId);
    if (_optionalOirConsensusMemberGroupId.isPresent()) {

      ConsensusMemberGroupId _irConsensusMemberGroupId = _optionalOirConsensusMemberGroupId.get();

      NamedDatabaseId _idpNamedDatabaseId = DatabaseIdFactory.from(_namedDatabaseId.name(),
          _irConsensusMemberGroupId.uuid());
      if (!Objects.equals(_namedDatabaseId, _idpNamedDatabaseId)) {

        return new DatabaseStateEnterpriseImpl(_idpNamedDatabaseId,
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN);
      }
    }

    return DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(_namedDatabaseId);
  }
}
