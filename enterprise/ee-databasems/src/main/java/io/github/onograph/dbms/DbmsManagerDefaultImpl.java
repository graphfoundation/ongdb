package io.github.onograph.dbms;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.kernel.database.NamedDatabaseId;


public final class DbmsManagerDefaultImpl extends AbstractDbmsManager {


  private final Map<String, DatabaseStateEnterpriseImpl> mapDsrdsd = new ConcurrentHashMap();

  DbmsManagerDefaultImpl() {
  }

  @Override
  protected Map<String, DatabaseStateEnterpriseImpl> deidMapEP() {
    return this.mapDsrdsd;
  }


  public void drpdtaForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapDsrdsd.put(_namedDatabaseId.name(),
        new DatabaseStateEnterpriseImpl(_namedDatabaseId, OperatorStateEnterpriseTypeImpl.SETI_D));

    DbmsResolverAction _rDbmsResolverAction = DbmsResolverAction.prottaeDbmsResolverActionHasImportant(
        _namedDatabaseId).create();

    DbmsResolverMeta _rslDbmsResolverMeta = this.trgrDbmsResolverMeta(_rDbmsResolverAction);
    _rslDbmsResolverMeta.awiForNa(_namedDatabaseId);
  }


  public void reodiForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapDsrdsd.remove(_namedDatabaseId.name());
    this.trgrDbmsResolverMeta(
            DbmsResolverAction.prottaeDbmsResolverActionHasImportant(_namedDatabaseId).create())
        .awiForNa(_namedDatabaseId);
  }


  public void stpdtaForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapDsrdsd.put(_namedDatabaseId.name(), new DatabaseStateEnterpriseImpl(_namedDatabaseId,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING));
    this.trgrDbmsResolverMeta(
            DbmsResolverAction.prottaeDbmsResolverActionHasImportant(_namedDatabaseId).create())
        .awiForNa(_namedDatabaseId);
  }


  public void strdabeForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapDsrdsd.put(_namedDatabaseId.name(), new DatabaseStateEnterpriseImpl(_namedDatabaseId,
        OperatorStateEnterpriseTypeImpl.SETI_RUNNING));
    this.trgrDbmsResolverMeta(
            DbmsResolverAction.prottaeDbmsResolverActionHasImportant(_namedDatabaseId).create())
        .awiForNa(_namedDatabaseId);
  }
}
