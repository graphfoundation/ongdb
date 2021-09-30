package io.github.onograph.dbms;

import java.util.Objects;
import java.util.Optional;
import org.neo4j.dbms.DatabaseState;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DatabaseStateEnterpriseImpl implements DatabaseState {


  private final Throwable fiueThrowable;


  private final NamedDatabaseId namedDatabaseId;


  private final OperatorStateEnterpriseTypeImpl soOperatorStateEnterpriseTypeImpl;

  public DatabaseStateEnterpriseImpl(NamedDatabaseId _namedDatabaseId,
      OperatorStateEnterpriseTypeImpl _soOperatorStateEnterpriseTypeImpl) {
    this(null, _namedDatabaseId, _soOperatorStateEnterpriseTypeImpl);
  }


  private DatabaseStateEnterpriseImpl(Throwable _fiueThrowable, NamedDatabaseId _namedDatabaseId,
      OperatorStateEnterpriseTypeImpl _soOperatorStateEnterpriseTypeImpl) {
    this.fiueThrowable = _fiueThrowable;
    this.namedDatabaseId = _namedDatabaseId;
    this.soOperatorStateEnterpriseTypeImpl = _soOperatorStateEnterpriseTypeImpl;
  }


  public static DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImpl() {
    return new DatabaseStateEnterpriseImpl(null, null, OperatorStateEnterpriseTypeImpl.SETI_IS);
  }


  public static DatabaseStateEnterpriseImpl intlDatabaseStateEnterpriseImpl(
      NamedDatabaseId _namedDatabaseId) {
    return new DatabaseStateEnterpriseImpl(null, _namedDatabaseId,
        OperatorStateEnterpriseTypeImpl.SETI_IS);
  }


  public static String lofmtString(DatabaseStateEnterpriseImpl _scDatabaseStateEnterpriseImpl,
      DatabaseStateEnterpriseImpl _sdDatabaseStateEnterpriseImpl) {
    return String.format(io.github.onograph.I18N.format(
            "io.github.onograph.dbms.DatabaseStateEnterpriseImpl.format"),
        toshtsrgString(_scDatabaseStateEnterpriseImpl),
        toshtsrgString(_sdDatabaseStateEnterpriseImpl));
  }


  public static String toshtsrgString(DatabaseStateEnterpriseImpl _databaseStateEnterpriseImpl) {
    return _databaseStateEnterpriseImpl == null ? io.github.onograph.TokenConstants.UNKNOWN
        : String.format("%s%s{db=%s}", _databaseStateEnterpriseImpl.hasFailed()
                ? io.github.onograph.TokenConstants.P_FAILED__ : "",
            _databaseStateEnterpriseImpl.operatorState(),
            _databaseStateEnterpriseImpl.namedDatabaseId.logPrefix());
  }


  public static DatabaseStateEnterpriseImpl unnnDatabaseStateEnterpriseImpl(
      NamedDatabaseId _namedDatabaseId) {
    return new DatabaseStateEnterpriseImpl(null, _namedDatabaseId,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_DEFINED);
  }

  @Override
  public NamedDatabaseId databaseId() {
    return this.namedDatabaseId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      DatabaseStateEnterpriseImpl _tDatabaseStateEnterpriseImpl = (DatabaseStateEnterpriseImpl) obj;
      return this.hasFailed() == _tDatabaseStateEnterpriseImpl.hasFailed() &&
          Objects.equals(this.namedDatabaseId, _tDatabaseStateEnterpriseImpl.namedDatabaseId) &&
          this.soOperatorStateEnterpriseTypeImpl
              == _tDatabaseStateEnterpriseImpl.soOperatorStateEnterpriseTypeImpl;
    } else {
      return false;
    }
  }

  @Override
  public Optional<Throwable> failure() {
    return Optional.ofNullable(this.fiueThrowable);
  }


  public DatabaseStateEnterpriseImpl falDatabaseStateEnterpriseImpl(Throwable _fiueThrowable) {
    return new DatabaseStateEnterpriseImpl(_fiueThrowable, this.namedDatabaseId,
        this.soOperatorStateEnterpriseTypeImpl);
  }

  @Override
  public boolean hasFailed() {
    return this.fiueThrowable != null;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.namedDatabaseId, this.soOperatorStateEnterpriseTypeImpl,
        this.hasFailed());
  }


  public DatabaseStateEnterpriseImpl helyDatabaseStateEnterpriseImpl() {
    return new DatabaseStateEnterpriseImpl(null, this.namedDatabaseId,
        this.soOperatorStateEnterpriseTypeImpl);
  }

  @Override
  public OperatorStateEnterpriseTypeImpl operatorState() {
    return this.soOperatorStateEnterpriseTypeImpl;
  }


}
