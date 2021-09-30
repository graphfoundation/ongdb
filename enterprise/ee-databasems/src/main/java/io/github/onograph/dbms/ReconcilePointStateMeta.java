package io.github.onograph.dbms;

import org.neo4j.internal.helpers.Exceptions;


class ReconcilePointStateMeta {


  private final Throwable esThrowable;


  private final DatabaseStateEnterpriseImpl sdDatabaseStateEnterpriseImpl;


  private final DatabaseStateEnterpriseImpl ssDatabaseStateEnterpriseImpl;


  ReconcilePointStateMeta(Throwable _esThrowable,
      DatabaseStateEnterpriseImpl _sdDatabaseStateEnterpriseImpl,
      DatabaseStateEnterpriseImpl _ssDatabaseStateEnterpriseImpl) {
    this.esThrowable = _esThrowable;
    this.sdDatabaseStateEnterpriseImpl = _sdDatabaseStateEnterpriseImpl;
    this.ssDatabaseStateEnterpriseImpl = _ssDatabaseStateEnterpriseImpl;
  }


  ReconcilePointStateMeta databaseStateEnterpriseImpl(
      DatabaseStateEnterpriseImpl _databaseStateEnterpriseImpl) {
    return new ReconcilePointStateMeta(this.esThrowable, this.sdDatabaseStateEnterpriseImpl,
        _databaseStateEnterpriseImpl);
  }


  ReconcilePointStateMeta esThrowable(Throwable _esThrowable) {
    return new ReconcilePointStateMeta(Exceptions.chain(this.esThrowable, _esThrowable),
        this.sdDatabaseStateEnterpriseImpl,
        this.ssDatabaseStateEnterpriseImpl);
  }


  public Throwable getEsThrowable() {
    return this.esThrowable;
  }


  DatabaseStateEnterpriseImpl getSdDatabaseStateEnterpriseImpl() {
    return this.sdDatabaseStateEnterpriseImpl;
  }


  public DatabaseStateEnterpriseImpl getSsDatabaseStateEnterpriseImpl() {
    return this.ssDatabaseStateEnterpriseImpl;
  }
}
