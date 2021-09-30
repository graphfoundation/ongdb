package io.github.onograph.dbms;

import io.github.onograph.dbms.gdb.AbstractMultipleGdbDatabaseManager;
import java.util.Objects;
import java.util.function.Consumer;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;


class ReconcilerFlowManager {


  static final Consumer<NamedDatabaseId> consumerNohgNamedDatabaseId = (ignored) ->
  {
  };


  private final AbstractMultipleGdbDatabaseManager<? extends DatabaseContext> abstractMultipleGdbDatabaseManagerMdDatabaseContext;


  private final HealthMonitorService healthMonitorService;

  ReconcilerFlowManager(
      AbstractMultipleGdbDatabaseManager<? extends DatabaseContext> _abstractMultipleGdbDatabaseManagerMdDatabaseContext,
      HealthMonitorService healthMonitorService) {
    this.abstractMultipleGdbDatabaseManagerMdDatabaseContext = _abstractMultipleGdbDatabaseManagerMdDatabaseContext;
    this.healthMonitorService = healthMonitorService;
  }


  private static StateChange _craftyStateChange(
      AbstractMultipleGdbDatabaseManager<? extends DatabaseContext> _abstractMultipleGdbDatabaseManagerMdDatabaseContext) {

    StateChange.Transitioner _transitioner =
        StateChange.froStateChangeTransitioner(OperatorStateEnterpriseTypeImpl.SETI_D,
            OperatorStateEnterpriseTypeImpl.SETI_IS);
    Objects.requireNonNull(_abstractMultipleGdbDatabaseManagerMdDatabaseContext);
    return _transitioner.onStep(
            _abstractMultipleGdbDatabaseManagerMdDatabaseContext::createDatabase)
        .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .onFailure(consumerNohgNamedDatabaseId, OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN);
  }


  private static StateChange _drpfcrStateChange(
      AbstractMultipleGdbDatabaseManager<? extends DatabaseContext> _abstractMultipleGdbDatabaseManagerMdDatabaseContext,
      boolean _isDd) {

    OperatorStateEnterpriseTypeImpl _ssOperatorStateEnterpriseTypeImpl =
        _isDd ? OperatorStateEnterpriseTypeImpl.SETI_DD : OperatorStateEnterpriseTypeImpl.SETI_D;

    Consumer<NamedDatabaseId> _consumerVr00NamedDatabaseId;
    if (_isDd) {
      Objects.requireNonNull(_abstractMultipleGdbDatabaseManagerMdDatabaseContext);
      _consumerVr00NamedDatabaseId = _abstractMultipleGdbDatabaseManagerMdDatabaseContext::drdasdpdForNa;
    } else {
      Objects.requireNonNull(_abstractMultipleGdbDatabaseManagerMdDatabaseContext);
      _consumerVr00NamedDatabaseId = _abstractMultipleGdbDatabaseManagerMdDatabaseContext::dropDatabase;
    }

    Consumer<NamedDatabaseId> _consumerTastoNamedDatabaseId = _consumerVr00NamedDatabaseId;
    return StateChange.froStateChangeTransitioner(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .onStep(_consumerTastoNamedDatabaseId).onSuccess(_ssOperatorStateEnterpriseTypeImpl)
        .onFailure(consumerNohgNamedDatabaseId, OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN);
  }


  private static StateChange _prrdpfoStateChange(
      AbstractMultipleGdbDatabaseManager<? extends DatabaseContext> _abstractMultipleGdbDatabaseManagerMdDatabaseContext) {

    Consumer<NamedDatabaseId> _consumerTastoNamedDatabaseId = (id) ->
    {
      _abstractMultipleGdbDatabaseManagerMdDatabaseContext.getDatabaseContext(id)
          .map(DatabaseContext::database).ifPresent(Database::prepareToDrop);
    };

    StateChange.FailureDoer _failureDoer =
        StateChange.froStateChangeTransitioner(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
            .onStep(_consumerTastoNamedDatabaseId)
            .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_RUNNING);
    Objects.requireNonNull(_abstractMultipleGdbDatabaseManagerMdDatabaseContext);
    return _failureDoer.onFailure(
        _abstractMultipleGdbDatabaseManagerMdDatabaseContext::stopDatabase,
        OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN);
  }


  private static StateChange _reeqaemeftStateChange(HealthMonitorService healthMonitorService) {

    StateChange.Transitioner _transitioner = StateChange.froStateChangeTransitioner(
        OperatorStateEnterpriseTypeImpl.SETI_QT);
    Objects.requireNonNull(healthMonitorService);
    return _transitioner.onStep(healthMonitorService::reeqaemeForNa)
        .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_D)
        .onFailure(consumerNohgNamedDatabaseId, OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN);
  }


  private static StateChange _seqaimrfayStateChange(
      AbstractMultipleGdbDatabaseManager<?> _abstractMultipleGdbDatabaseManagerMdObject,
      HealthMonitorService healthMonitorService) {
    return StateChange.froStateChangeTransitioner(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
            OperatorStateEnterpriseTypeImpl.SETI_BDS_FOR_CLN)
        .onStep((namedDatabaseId) ->
        {
          healthMonitorService.seqaimrForNa(
              namedDatabaseId);
          _abstractMultipleGdbDatabaseManagerMdObject.reedbcotForNa(
              namedDatabaseId);
        })
        .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_QT)
        .onFailure(consumerNohgNamedDatabaseId, OperatorStateEnterpriseTypeImpl.SETI_QT);
  }


  private static StateChange _stpfcrStateChange(
      AbstractMultipleGdbDatabaseManager<? extends DatabaseContext> _abstractMultipleGdbDatabaseManagerMdDatabaseContext) {

    StateChange.Transitioner _transitioner =
        StateChange.froStateChangeTransitioner(OperatorStateEnterpriseTypeImpl.SETI_RUNNING,
            OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS);
    Objects.requireNonNull(_abstractMultipleGdbDatabaseManagerMdDatabaseContext);
    return _transitioner.onStep(_abstractMultipleGdbDatabaseManagerMdDatabaseContext::stopDatabase)
        .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING)
        .onFailure(consumerNohgNamedDatabaseId, OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
  }


  private static StateChange _strfaoStateChange(
      AbstractMultipleGdbDatabaseManager<? extends DatabaseContext> _abstractMultipleGdbDatabaseManagerMdDatabaseContext) {

    StateChange.Transitioner _transitioner = StateChange.froStateChangeTransitioner(
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    Objects.requireNonNull(_abstractMultipleGdbDatabaseManagerMdDatabaseContext);
    return _transitioner.onStep(_abstractMultipleGdbDatabaseManagerMdDatabaseContext::startDatabase)
        .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_RUNNING)
        .onFailure(consumerNohgNamedDatabaseId, OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
  }


  private static StateChange _vaafcStateChange(
      AbstractMultipleGdbDatabaseManager<? extends DatabaseContext> _abstractMultipleGdbDatabaseManagerMdDatabaseContext) {

    StateChange.Transitioner _transitioner =
        StateChange.froStateChangeTransitioner(OperatorStateEnterpriseTypeImpl.SETI_D,
            OperatorStateEnterpriseTypeImpl.SETI_IS);
    Objects.requireNonNull(_abstractMultipleGdbDatabaseManagerMdDatabaseContext);
    return _transitioner.onStep(_abstractMultipleGdbDatabaseManagerMdDatabaseContext::vaadtectForNa)
        .onSuccess(OperatorStateEnterpriseTypeImpl.SETI_IS)
        .onFailure(consumerNohgNamedDatabaseId, OperatorStateEnterpriseTypeImpl.SETI_IS);
  }


  final StateChange craStateChange() {
    return _craftyStateChange(this.abstractMultipleGdbDatabaseManagerMdDatabaseContext);
  }


  final StateChange droStateChange() {
    return _drpfcrStateChange(this.abstractMultipleGdbDatabaseManagerMdDatabaseContext, false);
  }


  final StateChange drpdmdaStateChange() {
    return _drpfcrStateChange(this.abstractMultipleGdbDatabaseManagerMdDatabaseContext, true);
  }


  final StateChange prpedoStateChange() {
    return _prrdpfoStateChange(this.abstractMultipleGdbDatabaseManagerMdDatabaseContext);
  }


  final StateChange reeqaeStateChange() {
    return _reeqaemeftStateChange(this.healthMonitorService);
  }


  final StateChange seqrteStateChange() {
    return _seqaimrfayStateChange(this.abstractMultipleGdbDatabaseManagerMdDatabaseContext,
        this.healthMonitorService);
  }


  final StateChange stoStateChange() {
    return _stpfcrStateChange(this.abstractMultipleGdbDatabaseManagerMdDatabaseContext);
  }


  final StateChange strStateChange() {
    return _strfaoStateChange(this.abstractMultipleGdbDatabaseManagerMdDatabaseContext);
  }


  final StateChange vaitStateChange() {
    return _vaafcStateChange(this.abstractMultipleGdbDatabaseManagerMdDatabaseContext);
  }
}
