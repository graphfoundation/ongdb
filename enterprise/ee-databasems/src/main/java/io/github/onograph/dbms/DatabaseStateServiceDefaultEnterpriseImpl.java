package io.github.onograph.dbms;

import io.github.onograph.dbms.gdb.AbstractMultipleGdbDatabaseManager;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DatabaseStateServiceDefaultEnterpriseImpl implements DatabaseStateService {


  private final AbstractMultipleGdbDatabaseManager<?> abstractMultipleGdbDatabaseManagerMdObject;


  private final DbmsStateResolverFacade rcnieDbmsStateResolverFacade;


  DatabaseStateServiceDefaultEnterpriseImpl(
      AbstractMultipleGdbDatabaseManager<?> _abstractMultipleGdbDatabaseManagerMdObject,
      DbmsStateResolverFacade _rcnieDbmsStateResolverFacade) {
    this.abstractMultipleGdbDatabaseManagerMdObject = _abstractMultipleGdbDatabaseManagerMdObject;
    this.rcnieDbmsStateResolverFacade = _rcnieDbmsStateResolverFacade;
  }


  private DatabaseStateEnterpriseImpl _sttoriiaDatabaseStateEnterpriseImpl(
      NamedDatabaseId _namedDatabaseId) {
    return this.rcnieDbmsStateResolverFacade.gercletodlDatabaseStateEnterpriseImpl(_namedDatabaseId,
        () ->
        {
          return DatabaseStateEnterpriseImpl.intlDatabaseStateEnterpriseImpl(_namedDatabaseId);
        });
  }


  private DatabaseStateEnterpriseImpl _sttorukwDatabaseStateEnterpriseImpl(
      NamedDatabaseId _namedDatabaseId) {
    return this.rcnieDbmsStateResolverFacade.gercletodlDatabaseStateEnterpriseImpl(_namedDatabaseId,
        () ->
        {
          return DatabaseStateEnterpriseImpl.unnnDatabaseStateEnterpriseImpl(_namedDatabaseId);
        });
  }

  @Override
  public Optional<Throwable> causeOfFailure(NamedDatabaseId _namedDatabaseId) {
    return this._sttorukwDatabaseStateEnterpriseImpl(_namedDatabaseId).failure();
  }

  @Override
  public Map<NamedDatabaseId, DatabaseState> stateOfAllDatabases() {
    return this.abstractMultipleGdbDatabaseManagerMdObject.registeredDatabases().keySet().stream()
        .map(this::_sttoriiaDatabaseStateEnterpriseImpl)
        .collect(Collectors.toUnmodifiableMap(DatabaseStateEnterpriseImpl::databaseId,
            Function.identity()));
  }

  @Override
  public DatabaseState stateOfDatabase(NamedDatabaseId _namedDatabaseId) {
    return this._sttorukwDatabaseStateEnterpriseImpl(_namedDatabaseId);
  }
}
