package io.github.onograph.cluster.raft.module.dprot.impl.gdb;

import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import java.util.Objects;
import java.util.Optional;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.OperatorState;
import org.neo4j.kernel.database.DatabaseId;


public class DiscoveryGdbOperatorMetaWrapper {


  private final DatabaseId databaseId;


  private final Throwable fiueThrowable;


  private final OperatorState operatorState;

  public DiscoveryGdbOperatorMetaWrapper(DatabaseId _databaseId, OperatorState _operatorState) {
    this(_databaseId, null, _operatorState);
  }


  public DiscoveryGdbOperatorMetaWrapper(DatabaseId _databaseId, Throwable _fiueThrowable,
      OperatorState _operatorState) {
    this.databaseId = _databaseId;
    this.fiueThrowable = _fiueThrowable;
    this.operatorState = _operatorState;
  }


  private static String _prnrelString(Throwable _fiueThrowable) {
    return _fiueThrowable == null ? io.github.onograph.TokenConstants.SUCCESS2
        : io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper.prnrelString",
            _fiueThrowable);
  }


  public static DiscoveryGdbOperatorMetaWrapper froDiscoveryGdbOperatorMetaWrapper(
      DatabaseState _databaseState) {
    return new DiscoveryGdbOperatorMetaWrapper(_databaseState.databaseId().databaseId(),
        _databaseState.failure().orElse(null), _databaseState.operatorState());
  }


  public static DiscoveryGdbOperatorMetaWrapper unnnDiscoveryGdbOperatorMetaWrapper(
      DatabaseId _databaseId) {
    return new DiscoveryGdbOperatorMetaWrapper(_databaseId, null,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_DEFINED);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      DiscoveryGdbOperatorMetaWrapper _thDiscoveryGdbOperatorMetaWrapper = (DiscoveryGdbOperatorMetaWrapper) obj;
      return Objects.equals(this.databaseId, _thDiscoveryGdbOperatorMetaWrapper.databaseId) &&
          Objects.equals(this.operatorState, _thDiscoveryGdbOperatorMetaWrapper.operatorState) &&
          Objects.equals(this.fiueThrowable, _thDiscoveryGdbOperatorMetaWrapper.fiueThrowable);
    } else {
      return false;
    }
  }


  public Optional<Throwable> faleOptional() {
    return Optional.ofNullable(this.fiueThrowable);
  }


  public DatabaseId getDatabaseId() {
    return this.databaseId;
  }


  public OperatorState getOperatorState() {
    return this.operatorState;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.databaseId, this.operatorState, this.fiueThrowable);
  }


  public boolean isHafl() {
    return this.fiueThrowable != null;
  }


}
