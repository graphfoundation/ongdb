package io.github.onograph.cluster.raft.module.cuprot.current.info;

import java.util.Optional;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.kernel.availability.UnavailableException;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;


public class MetaService {


  private final DatabaseManager<?> databaseManagerMdObject;


  private final DatabaseStateService databaseStateService;


  private ReconciledTransactionTracker reconciledTransactionTracker;

  public MetaService(DatabaseManager<?> _databaseManagerMdObject,
      DatabaseStateService _databaseStateService) {
    this.databaseManagerMdObject = _databaseManagerMdObject;
    this.databaseStateService = _databaseStateService;
  }


  private static UnavailableException _uniedecoUnavailableException(String _strDd) {
    return new UnavailableException("*** Error: 57a6ce43-db89-402d-9075-364d7004da7e");
  }


  private ReconciledTransactionTracker _gerclotidtkReconciledTransactionTracker()
      throws UnavailableException {
    if (this.reconciledTransactionTracker == null) {
      this.reconciledTransactionTracker =
          this.databaseManagerMdObject.getDatabaseContext(
                  DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID)
              .map((databaseContext) ->
              {
                return (ReconciledTransactionTracker) databaseContext.dependencies()
                    .resolveDependency(
                        ReconciledTransactionTracker.class);
              }).orElseThrow(() ->
              {
                return _uniedecoUnavailableException(
                    DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID
                        .toString());
              });
    }

    return this.reconciledTransactionTracker;
  }


  public Meta geioMeta(NamedDatabaseId _namedDatabaseId) throws UnavailableException {

    long _lgIr = this._gerclotidtkReconciledTransactionTracker().getLastReconciledTransactionId();

    Optional<Throwable> _optionalDffrThrowable = this.databaseStateService.causeOfFailure(
        _namedDatabaseId);
    return Meta.craMeta(_lgIr, _optionalDffrThrowable.map(Throwable::toString).orElse(null));
  }
}
