package io.github.onograph.dbms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.kernel.database.NamedDatabaseId;


public class StateChange {


  private final Consumer<NamedDatabaseId> consumerFcNamedDatabaseId;


  private final Consumer<NamedDatabaseId> consumerFtNamedDatabaseId;


  private final OperatorStateEnterpriseTypeImpl sefOperatorStateEnterpriseTypeImpl;


  private final OperatorStateEnterpriseTypeImpl sesOperatorStateEnterpriseTypeImpl;


  private final Set<OperatorStateEnterpriseTypeImpl> setSsvOperatorStateEnterpriseTypeImpl;


  private StateChange(Consumer<NamedDatabaseId> _consumerFcNamedDatabaseId,
      Consumer<NamedDatabaseId> _consumerFtNamedDatabaseId,
      OperatorStateEnterpriseTypeImpl _sefOperatorStateEnterpriseTypeImpl,
      OperatorStateEnterpriseTypeImpl _sesOperatorStateEnterpriseTypeImpl,
      Set<OperatorStateEnterpriseTypeImpl> _setSsvOperatorStateEnterpriseTypeImpl) {
    this.consumerFcNamedDatabaseId = _consumerFcNamedDatabaseId;
    this.consumerFtNamedDatabaseId = _consumerFtNamedDatabaseId;
    this.sefOperatorStateEnterpriseTypeImpl = _sefOperatorStateEnterpriseTypeImpl;
    this.sesOperatorStateEnterpriseTypeImpl = _sesOperatorStateEnterpriseTypeImpl;
    this.setSsvOperatorStateEnterpriseTypeImpl = _setSsvOperatorStateEnterpriseTypeImpl;
  }


  static Transitioner froStateChangeTransitioner(
      OperatorStateEnterpriseTypeImpl _svOperatorStateEnterpriseTypeImpl,
      OperatorStateEnterpriseTypeImpl... _svaOperatorStateEnterpriseTypeImplArray) {

    Set<OperatorStateEnterpriseTypeImpl> _setSvaOperatorStateEnterpriseTypeImpl =
        Stream.concat(Stream.of(_svOperatorStateEnterpriseTypeImpl),
                Arrays.stream(_svaOperatorStateEnterpriseTypeImplArray))
            .collect(Collectors.toSet());
    return new TransitionManagerFactory(_setSvaOperatorStateEnterpriseTypeImpl);
  }


  static void vaitForOpOpIt(OperatorStateEnterpriseTypeImpl _frOperatorStateEnterpriseTypeImpl,
      Iterator<StateChange> _iteratorSqecStateChange,
      OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl) {

    OperatorStateEnterpriseTypeImpl _peiuOperatorStateEnterpriseTypeImpl;

    StateChange _neStateChange;
    for (_peiuOperatorStateEnterpriseTypeImpl = _frOperatorStateEnterpriseTypeImpl;
        _iteratorSqecStateChange.hasNext();
        _peiuOperatorStateEnterpriseTypeImpl = _neStateChange.sesOperatorStateEnterpriseTypeImpl) {
      _neStateChange = _iteratorSqecStateChange.next();
      if (!_neStateChange.setSsvOperatorStateEnterpriseTypeImpl.contains(
          _peiuOperatorStateEnterpriseTypeImpl)) {

        throw new IllegalArgumentException("*** Error: e65c0350-8237-42a3-bf5e-4580b80cd26f");
      }
    }

    if (_peiuOperatorStateEnterpriseTypeImpl != _operatorStateEnterpriseTypeImpl) {

      throw new IllegalArgumentException("*** Error: 36e27408-6408-4839-b834-79ff7c087caa");
    }
  }


  TransSetup prpeStateChangeTransSetup(NamedDatabaseId _namedDatabaseId) {
    return new TransSetup(_namedDatabaseId, this);
  }


  interface FailureDoer {


    StateChange onFailure(Consumer<NamedDatabaseId> _consumerVarNamedDatabaseId,
        OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl);
  }


  interface SuccessDoer {


    FailureDoer onSuccess(OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl);
  }


  interface Transitioner {


    SuccessDoer onStep(Consumer<NamedDatabaseId> _consumerVarNamedDatabaseId);
  }


  static class TransSetup {


    private final NamedDatabaseId namedDatabaseId;


    private final StateChange tastoStateChange;

    private TransSetup(NamedDatabaseId _namedDatabaseId, StateChange _tastoStateChange) {
      this.namedDatabaseId = _namedDatabaseId;
      this.tastoStateChange = _tastoStateChange;
    }


    private DatabaseStateEnterpriseImpl _dotnoaiDatabaseStateEnterpriseImpl(
        Consumer<NamedDatabaseId> _consumerAtoNamedDatabaseId,
        OperatorStateEnterpriseTypeImpl _sesOperatorStateEnterpriseTypeImpl)
        throws StateChangeException {
      try {
        _consumerAtoNamedDatabaseId.accept(this.namedDatabaseId);
        return new DatabaseStateEnterpriseImpl(this.namedDatabaseId,
            _sesOperatorStateEnterpriseTypeImpl);
      } catch (

          Throwable _throwable) {

        DatabaseStateEnterpriseImpl _sfDatabaseStateEnterpriseImpl =
            new DatabaseStateEnterpriseImpl(this.namedDatabaseId,
                this.tastoStateChange.sefOperatorStateEnterpriseTypeImpl);
        throw new StateChangeException(_throwable, _sfDatabaseStateEnterpriseImpl);
      }
    }


    DatabaseStateEnterpriseImpl doclnDatabaseStateEnterpriseImpl() throws StateChangeException {
      return this._dotnoaiDatabaseStateEnterpriseImpl(
          this.tastoStateChange.consumerFcNamedDatabaseId,
          this.tastoStateChange.sefOperatorStateEnterpriseTypeImpl);
    }


    DatabaseStateEnterpriseImpl dotrsiDatabaseStateEnterpriseImpl() throws StateChangeException {
      return this._dotnoaiDatabaseStateEnterpriseImpl(
          this.tastoStateChange.consumerFtNamedDatabaseId,
          this.tastoStateChange.sesOperatorStateEnterpriseTypeImpl);
    }
  }


  private static class TransitionManagerFactory implements Transitioner, SuccessDoer, FailureDoer {


    private final Set<OperatorStateEnterpriseTypeImpl> setSvOperatorStateEnterpriseTypeImpl;


    private Consumer<NamedDatabaseId> consumerFtNamedDatabaseId;


    private OperatorStateEnterpriseTypeImpl seOperatorStateEnterpriseTypeImpl;

    private TransitionManagerFactory(
        Set<OperatorStateEnterpriseTypeImpl> _setSvOperatorStateEnterpriseTypeImpl) {
      this.setSvOperatorStateEnterpriseTypeImpl = _setSvOperatorStateEnterpriseTypeImpl;
    }

    @Override
    public StateChange onFailure(Consumer<NamedDatabaseId> _consumerFcNamedDatabaseId,
        OperatorStateEnterpriseTypeImpl _feOperatorStateEnterpriseTypeImpl) {
      return new StateChange(_consumerFcNamedDatabaseId, this.consumerFtNamedDatabaseId,
          _feOperatorStateEnterpriseTypeImpl,
          this.seOperatorStateEnterpriseTypeImpl, this.setSvOperatorStateEnterpriseTypeImpl);
    }

    @Override
    public SuccessDoer onStep(Consumer<NamedDatabaseId> _consumerFtNamedDatabaseId) {
      this.consumerFtNamedDatabaseId = _consumerFtNamedDatabaseId;
      return this;
    }

    @Override
    public FailureDoer onSuccess(
        OperatorStateEnterpriseTypeImpl _eOperatorStateEnterpriseTypeImpl) {
      this.seOperatorStateEnterpriseTypeImpl = _eOperatorStateEnterpriseTypeImpl;
      return this;
    }
  }
}
