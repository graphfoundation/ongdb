package io.github.onograph.dbms;


public class StateChangeException extends Exception {


  private final DatabaseStateEnterpriseImpl sefDatabaseStateEnterpriseImpl;

  public StateChangeException(Throwable _cueThrowable,
      DatabaseStateEnterpriseImpl _sefDatabaseStateEnterpriseImpl) {
    super(_cueThrowable);
    this.sefDatabaseStateEnterpriseImpl = _sefDatabaseStateEnterpriseImpl;
  }


  DatabaseStateEnterpriseImpl getSefDatabaseStateEnterpriseImpl() {
    return this.sefDatabaseStateEnterpriseImpl;
  }
}
