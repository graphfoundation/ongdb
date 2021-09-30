package io.github.onograph.dbms;

import io.github.onograph.dbms.gdb.ClusteredAbstractMultipleGdbDatabaseManager;
import java.util.Objects;
import java.util.function.Consumer;
import org.neo4j.kernel.database.NamedDatabaseId;


final class ReconcilerFlowManagerClusterImpl extends ReconcilerFlowManager {


  private final ClusteredAbstractMultipleGdbDatabaseManager clusteredAbstractMultipleGdbDatabaseManager;

  ReconcilerFlowManagerClusterImpl(
      ClusteredAbstractMultipleGdbDatabaseManager _clusteredAbstractMultipleGdbDatabaseManager,
      HealthMonitorService healthMonitorService) {
    super(_clusteredAbstractMultipleGdbDatabaseManager, healthMonitorService);
    this.clusteredAbstractMultipleGdbDatabaseManager = _clusteredAbstractMultipleGdbDatabaseManager;
  }


  private static StateChange _enedydbexStateChange(
      ClusteredAbstractMultipleGdbDatabaseManager _clusteredAbstractMultipleGdbDatabaseManager) {

    Consumer<NamedDatabaseId> _consumerFtNamedDatabaseId = (databaseId) ->
    {

      boolean _isEd = _clusteredAbstractMultipleGdbDatabaseManager.getDatabaseContext(databaseId)
          .isPresent();
      if (!_isEd) {
        _clusteredAbstractMultipleGdbDatabaseManager.createDatabase(databaseId);
      }
    };
    return StateChange.froStateChangeTransitioner(OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .onStep(_consumerFtNamedDatabaseId)
        .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .onFailure(ReconcilerFlowManager.consumerNohgNamedDatabaseId,
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN);
  }


  private static StateChange _stascfayStateChange(
      ClusteredAbstractMultipleGdbDatabaseManager _clusteredAbstractMultipleGdbDatabaseManager) {

    StateChange.Transitioner _transitioner = StateChange.froStateChangeTransitioner(
        OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS);
    Objects.requireNonNull(_clusteredAbstractMultipleGdbDatabaseManager);

    StateChange.FailureDoer _failureDoer =
        _transitioner.onStep(_clusteredAbstractMultipleGdbDatabaseManager::stdaatsocpForNa)
            .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_RUNNING);
    Objects.requireNonNull(_clusteredAbstractMultipleGdbDatabaseManager);
    return _failureDoer.onFailure(_clusteredAbstractMultipleGdbDatabaseManager::stopDatabase,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
  }


  private static StateChange _stbescfayStateChange(
      ClusteredAbstractMultipleGdbDatabaseManager _clusteredAbstractMultipleGdbDatabaseManager) {

    StateChange.Transitioner _transitioner = StateChange.froStateChangeTransitioner(
        OperatorStateEnterpriseTypeImpl.SETI_RUNNING);
    Objects.requireNonNull(_clusteredAbstractMultipleGdbDatabaseManager);

    StateChange.FailureDoer _failureDoer =
        _transitioner.onStep(_clusteredAbstractMultipleGdbDatabaseManager::stdasbosocpForNa)
            .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS);
    Objects.requireNonNull(_clusteredAbstractMultipleGdbDatabaseManager);
    return _failureDoer.onFailure(_clusteredAbstractMultipleGdbDatabaseManager::stopDatabase,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
  }


  StateChange _enedydbexStateChange() {
    return _enedydbexStateChange(this.clusteredAbstractMultipleGdbDatabaseManager);
  }


  StateChange stascStateChange() {
    return _stascfayStateChange(this.clusteredAbstractMultipleGdbDatabaseManager);
  }


  StateChange stbescStateChange() {
    return _stbescfayStateChange(this.clusteredAbstractMultipleGdbDatabaseManager);
  }
}
