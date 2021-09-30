package io.github.onograph.dbms;

import java.util.Objects;
import org.neo4j.kernel.database.NamedDatabaseId;


class GdbMetaClone {


  static final long INTL_UPA_UID = 0L;


  private final DatabaseStateEnterpriseImpl databaseStateEnterpriseImpl;


  private final long lgIu;

  GdbMetaClone(DatabaseStateEnterpriseImpl _databaseStateEnterpriseImpl, long _lgIu) {
    this.databaseStateEnterpriseImpl = _databaseStateEnterpriseImpl;
    this.lgIu = _lgIu;
  }


  GdbMetaClone(long _lgIu, NamedDatabaseId _namedDatabaseId,
      OperatorStateEnterpriseTypeImpl _soOperatorStateEnterpriseTypeImpl) {
    this(new DatabaseStateEnterpriseImpl(_namedDatabaseId, _soOperatorStateEnterpriseTypeImpl),
        _lgIu);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      GdbMetaClone _tGdbMetaClone = (GdbMetaClone) obj;
      return this.lgIu == _tGdbMetaClone.lgIu && Objects.equals(this.databaseStateEnterpriseImpl,
          _tGdbMetaClone.databaseStateEnterpriseImpl);
    } else {
      return false;
    }
  }


  DatabaseStateEnterpriseImpl getDatabaseStateEnterpriseImpl() {
    return this.databaseStateEnterpriseImpl;
  }


  long getLgIu() {
    return this.lgIu;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.databaseStateEnterpriseImpl, this.lgIu);
  }
}
