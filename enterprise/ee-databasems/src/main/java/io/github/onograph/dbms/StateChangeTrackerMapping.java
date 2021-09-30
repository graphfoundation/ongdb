package io.github.onograph.dbms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.kernel.database.NamedDatabaseId;


final class StateChangeTrackerMapping {


  private final Map<Pair<OperatorStateEnterpriseTypeImpl, OperatorStateEnterpriseTypeImpl>, StateChange[]> flowMap;

  private StateChangeTrackerMapping(
      Map<Pair<OperatorStateEnterpriseTypeImpl, OperatorStateEnterpriseTypeImpl>, StateChange[]> _flowMap) {
    this.flowMap = _flowMap;
  }


  public static FlowFactory bulrStateChangeTrackerMappingFlowFactory() {
    return new FlowFactory();
  }


  private Stream<StateChange.TransSetup> _lokStream(FlowChecker _louFlowChecker) {
    if (!Objects.equals(_louFlowChecker.cretDatabaseStateEnterpriseImpl.databaseId(),
        _louFlowChecker.dsrdDatabaseStateEnterpriseImpl.databaseId())) {

      Stream<StateChange.TransSetup> _streamDcTransSetup =
          this._prrtnofcsStream(_louFlowChecker.cretDatabaseStateEnterpriseImpl.operatorState(),
              OperatorStateEnterpriseTypeImpl.SETI_D,
              _louFlowChecker.cretDatabaseStateEnterpriseImpl.databaseId());

      Stream<StateChange.TransSetup> _streamNcTransSetup =
          this._prrtnofcsStream(OperatorStateEnterpriseTypeImpl.SETI_IS,
              _louFlowChecker.dsrdDatabaseStateEnterpriseImpl.operatorState(),
              _louFlowChecker.dsrdDatabaseStateEnterpriseImpl.databaseId());
      return Stream.concat(_streamDcTransSetup, _streamNcTransSetup);
    } else {
      return this._prrtnofcsStream(_louFlowChecker.cretDatabaseStateEnterpriseImpl.operatorState(),
          _louFlowChecker.dsrdDatabaseStateEnterpriseImpl.operatorState(),
          _louFlowChecker.cretDatabaseStateEnterpriseImpl.databaseId());
    }
  }


  private Stream<StateChange.TransSetup> _prrtnofcsStream(
      OperatorStateEnterpriseTypeImpl _cretOperatorStateEnterpriseTypeImpl,
      OperatorStateEnterpriseTypeImpl _dsrdOperatorStateEnterpriseTypeImpl,
      NamedDatabaseId _namedDatabaseId) {
    if (_cretOperatorStateEnterpriseTypeImpl == _dsrdOperatorStateEnterpriseTypeImpl) {
      return Stream.empty();
    } else if (_cretOperatorStateEnterpriseTypeImpl == OperatorStateEnterpriseTypeImpl.SETI_D) {

      throw new IllegalArgumentException("*** Error: a869f38c-38f6-4b82-8194-1a50af34df8f");
    } else {

      StateChange[] _tastoStateChangeArray = this.flowMap.get(
          Pair.of(_cretOperatorStateEnterpriseTypeImpl, _dsrdOperatorStateEnterpriseTypeImpl));
      if (_tastoStateChangeArray == null) {

        throw new IllegalArgumentException("*** Error: f1b7b3d4-98f5-479f-b8a5-dfa81bc4c206");
      } else {
        return Arrays.stream(_tastoStateChangeArray).map((tn) ->
        {
          return tn.prpeStateChangeTransSetup(_namedDatabaseId);
        });
      }
    }
  }


  public StateChangeTrackerMapping exewhStateChangeTrackerMapping(
      StateChangeTrackerMapping _ohrStateChangeTrackerMapping) {

    HashMap<Pair<OperatorStateEnterpriseTypeImpl, OperatorStateEnterpriseTypeImpl>, StateChange[]> _mergedMap = new HashMap(
        this.flowMap);
    _mergedMap.putAll(_ohrStateChangeTrackerMapping.flowMap);
    return new StateChangeTrackerMapping(_mergedMap);
  }


  FlowChecker frmcrnStateChangeTrackerMappingFlowChecker(
      DatabaseStateEnterpriseImpl _cretDatabaseStateEnterpriseImpl) {
    return new FlowChecker(_cretDatabaseStateEnterpriseImpl);
  }


  public interface CreateOrNext {


    StateChangeTrackerMapping bulStateChangeTrackerMapping();


    ReqsTargetTrans froStateChangeTrackerMappingReqsTargetTrans(
        OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl,
        OperatorStateEnterpriseTypeImpl... _operatorStateEnterpriseTypeImplArray);
  }


  public interface ReqPref {


    Stream<StateChange.TransSetup> toderStream(
        DatabaseStateEnterpriseImpl _databaseStateEnterpriseImpl);
  }


  public interface ReqsSourceTrans {


    ReqsTargetTrans froStateChangeTrackerMappingReqsTargetTrans(
        OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl,
        OperatorStateEnterpriseTypeImpl... _operatorStateEnterpriseTypeImplArray);
  }


  public interface ReqsTargetTrans {


    RequiresTrans toStateChangeTrackerMappingRequiresTrans(
        OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl);
  }


  public interface RequiresTrans {


    CreateOrNext donoiStateChangeTrackerMappingCreateOrNext();


    CreateOrNext dotrsStateChangeTrackerMappingCreateOrNext(StateChange... _stateChangeArray);
  }


  public static class FlowFactory
      implements ReqsSourceTrans, ReqsTargetTrans, RequiresTrans, CreateOrNext {


    private final Map<Pair<OperatorStateEnterpriseTypeImpl, OperatorStateEnterpriseTypeImpl>, StateChange[]> flowMap = new HashMap();


    private OperatorStateEnterpriseTypeImpl operatorStateEnterpriseTypeImpl;


    private Set<OperatorStateEnterpriseTypeImpl> setFosOperatorStateEnterpriseTypeImpl;


    private StateChange[] tastoStateChangeArray;

    private FlowFactory() {
    }


    private void _stpoet() {
      if (this.setFosOperatorStateEnterpriseTypeImpl != null
          && !this.setFosOperatorStateEnterpriseTypeImpl.isEmpty() &&
          this.operatorStateEnterpriseTypeImpl != null && this.tastoStateChangeArray != null) {
        this.setFosOperatorStateEnterpriseTypeImpl.forEach((from) ->
        {
          this.flowMap.put(Pair.of(from, this.operatorStateEnterpriseTypeImpl),
              this.tastoStateChangeArray);
        });
      } else if (this.setFosOperatorStateEnterpriseTypeImpl != null
          || this.operatorStateEnterpriseTypeImpl != null || this.tastoStateChangeArray != null) {

        throw new IllegalStateException("*** Error:  4a786975-ec23-4bee-adb5-449404c9c84c");
      }
    }

    @Override
    public StateChangeTrackerMapping bulStateChangeTrackerMapping() {
      this._stpoet();
      return new StateChangeTrackerMapping(this.flowMap);
    }

    @Override
    public CreateOrNext donoiStateChangeTrackerMappingCreateOrNext() {

      StateChange _nStateChange =
          StateChange.froStateChangeTransitioner(
                  this.setFosOperatorStateEnterpriseTypeImpl.iterator().next()).onStep((ignored) ->
              {
              })
              .onSuccess(this.operatorStateEnterpriseTypeImpl)
              .onFailure((ignored) ->
              {
              }, this.operatorStateEnterpriseTypeImpl);
      this.tastoStateChangeArray = new StateChange[]{_nStateChange};
      return this;
    }

    @Override
    public CreateOrNext dotrsStateChangeTrackerMappingCreateOrNext(
        StateChange... _tastoStateChangeArray) {
      this.setFosOperatorStateEnterpriseTypeImpl.forEach((from) ->
      {
        StateChange.vaitForOpOpIt(from, Arrays.stream(_tastoStateChangeArray).iterator(),
            this.operatorStateEnterpriseTypeImpl);
      });
      this.tastoStateChangeArray = _tastoStateChangeArray;
      return this;
    }

    @Override
    public ReqsTargetTrans froStateChangeTrackerMappingReqsTargetTrans(
        OperatorStateEnterpriseTypeImpl _frOperatorStateEnterpriseTypeImpl,
        OperatorStateEnterpriseTypeImpl... _faOperatorStateEnterpriseTypeImplArray) {
      this._stpoet();
      this.setFosOperatorStateEnterpriseTypeImpl =
          Stream.concat(Stream.of(_frOperatorStateEnterpriseTypeImpl),
                  Arrays.stream(_faOperatorStateEnterpriseTypeImplArray))
              .collect(Collectors.toSet());
      return this;
    }

    @Override
    public RequiresTrans toStateChangeTrackerMappingRequiresTrans(
        OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl) {
      this.operatorStateEnterpriseTypeImpl = _operatorStateEnterpriseTypeImpl;
      return this;
    }
  }


  class FlowChecker implements ReqPref {


    private final DatabaseStateEnterpriseImpl cretDatabaseStateEnterpriseImpl;


    private DatabaseStateEnterpriseImpl dsrdDatabaseStateEnterpriseImpl;

    private FlowChecker(DatabaseStateEnterpriseImpl _cretDatabaseStateEnterpriseImpl) {
      Objects.requireNonNull(_cretDatabaseStateEnterpriseImpl, io.github.onograph.I18N.format(
          "io.github.onograph.dbms.StateChangeTrackerMapping.FlowChecker.requireNonNull"));
      this.cretDatabaseStateEnterpriseImpl = _cretDatabaseStateEnterpriseImpl;
    }

    @Override
    public Stream<StateChange.TransSetup> toderStream(
        DatabaseStateEnterpriseImpl _dsrdDatabaseStateEnterpriseImpl) {
      Objects.requireNonNull(_dsrdDatabaseStateEnterpriseImpl, io.github.onograph.I18N.format(
          "io.github.onograph.dbms.StateChangeTrackerMapping.FlowChecker.requireNonNull2"));
      this.dsrdDatabaseStateEnterpriseImpl = _dsrdDatabaseStateEnterpriseImpl;
      return StateChangeTrackerMapping.this._lokStream(this);
    }
  }
}
