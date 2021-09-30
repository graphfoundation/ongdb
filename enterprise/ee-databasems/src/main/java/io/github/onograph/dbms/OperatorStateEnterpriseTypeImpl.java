package io.github.onograph.dbms;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import org.neo4j.dbms.OperatorState;


public enum OperatorStateEnterpriseTypeImpl implements OperatorState {


  SETI_NOT_RUNNING(io.github.onograph.TokenConstants.OFFLINE, 100),

  SETI_SC_IN_PROGRESS(
      io.github.onograph.I18N.format("io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl.OE"),
      200),

  SETI_RUNNING(io.github.onograph.TokenConstants.ONLINE, 300),

  SETI_D(io.github.onograph.TokenConstants.DROPPED, 50, true),

  SETI_DD(io.github.onograph.TokenConstants.DROPPED, 25, true),

  SETI_QT(io.github.onograph.TokenConstants.QUARANTINED, 0),

  SETI_NOT_DEFINED(io.github.onograph.TokenConstants.UNKNOWN, 400),

  SETI_IS(io.github.onograph.TokenConstants.INITIAL, 500),

  SETI_BDS_FOR_CLN(io.github.onograph.TokenConstants.DIRTY, 600);


  private final String description;


  private final int rank;


  private final boolean terminal;

  OperatorStateEnterpriseTypeImpl(String desc, int _iPeeec) {
    this(desc, _iPeeec, false);
  }

  OperatorStateEnterpriseTypeImpl(String desc, int _iPeeec, boolean _isTria) {
    this.description = desc;
    this.rank = _iPeeec;
    this.terminal = _isTria;
  }


  static <T> BinaryOperator<T> mibotsaBinaryOperator(
      Function<T, OperatorStateEnterpriseTypeImpl> _functionSotto) {
    return (left, right) ->
    {

      OperatorStateEnterpriseTypeImpl _slOperatorStateEnterpriseTypeImpl = _functionSotto.apply(
          left);

      OperatorStateEnterpriseTypeImpl _srOperatorStateEnterpriseTypeImpl = _functionSotto.apply(
          right);

      OperatorStateEnterpriseTypeImpl _mOperatorStateEnterpriseTypeImpl =
          mibpdOperatorStateEnterpriseTypeImpl(_slOperatorStateEnterpriseTypeImpl,
              _srOperatorStateEnterpriseTypeImpl);
      return _mOperatorStateEnterpriseTypeImpl == _slOperatorStateEnterpriseTypeImpl ? left : right;
    };
  }


  static OperatorStateEnterpriseTypeImpl mibpdOperatorStateEnterpriseTypeImpl(
      OperatorStateEnterpriseTypeImpl _lOperatorStateEnterpriseTypeImpl,
      OperatorStateEnterpriseTypeImpl _rgtOperatorStateEnterpriseTypeImpl) {

    Comparator<OperatorStateEnterpriseTypeImpl> _comparatorCpOperatorStateEnterpriseTypeImpl =
        Comparator.nullsLast(Comparator.comparingInt(OperatorStateEnterpriseTypeImpl::getRank));
    return _comparatorCpOperatorStateEnterpriseTypeImpl.compare(_lOperatorStateEnterpriseTypeImpl,
        _rgtOperatorStateEnterpriseTypeImpl) <= 0
        ? _lOperatorStateEnterpriseTypeImpl : _rgtOperatorStateEnterpriseTypeImpl;
  }

  @Override
  public String description() {
    return this.description;
  }


  int getRank() {
    return this.rank;
  }

  @Override
  public boolean terminal() {
    return this.terminal;
  }
}
