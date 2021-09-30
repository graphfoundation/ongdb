package io.github.onograph.dbms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class DbmsManagerWatchTagImpl extends AbstractDbmsManager {


  private final HealthMonitorService healthMonitorService;


  private final Log log;


  private final Map<String, DatabaseStateEnterpriseImpl> mapDsrdsd;


  public DbmsManagerWatchTagImpl(HealthMonitorService healthMonitorService,
      LogProvider _logProvider) {
    this.log = _logProvider.getLog(this.getClass());
    this.healthMonitorService = healthMonitorService;
    this.mapDsrdsd = new ConcurrentHashMap();
  }


  Optional<String> _gesomeeOptional(NamedDatabaseId _namedDatabaseId) {
    return this._gesomeeOptional(Optional.ofNullable(this.mapDsrdsd.get(_namedDatabaseId.name())));
  }


  private Optional<String> _gesomeeOptional(
      Optional<DatabaseStateEnterpriseImpl> _optionalSpDatabaseStateEnterpriseImpl) {
    return _optionalSpDatabaseStateEnterpriseImpl.flatMap(DatabaseStateEnterpriseImpl::failure)
        .map(Throwable::getMessage);
  }


  void adaltdsForMa(Map<NamedDatabaseId, String> _mapMqns) {

    Map<String, DatabaseStateEnterpriseImpl> _mapMressd = _mapMqns.entrySet().stream()
        .map((entry) ->
        {

          NamedDatabaseId _namedDatabaseId =
              entry.getKey();

          String m = entry.getValue();

          DatabaseStateEnterpriseImpl _databaseStateEnterpriseImpl =
              (new DatabaseStateEnterpriseImpl(_namedDatabaseId,
                  OperatorStateEnterpriseTypeImpl.SETI_QT))
                  .falDatabaseStateEnterpriseImpl(
                      new DatabaseManagementException(
                          "*** Error: 66ba3a89-56eb-4865-9798-5b828606fb61"));
          return Map.entry(_namedDatabaseId.name(),
              _databaseStateEnterpriseImpl);
        })
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
    this.mapDsrdsd.putAll(_mapMressd);
  }


  void adtderForNaSt(String m, NamedDatabaseId _namedDatabaseId) {

    DatabaseStateEnterpriseImpl _databaseStateEnterpriseImpl =
        (new DatabaseStateEnterpriseImpl(_namedDatabaseId,
            OperatorStateEnterpriseTypeImpl.SETI_QT)).falDatabaseStateEnterpriseImpl(
            new DatabaseManagementException("*** Error: 4e576910-def8-4140-bc2b-370b9bf4b524"));
    this.mapDsrdsd.put(_namedDatabaseId.name(), _databaseStateEnterpriseImpl);
  }

  @Override
  protected Map<String, DatabaseStateEnterpriseImpl> deidMapEP() {
    return this.mapDsrdsd;
  }


  public String puitqrnString(String m, NamedDatabaseId _namedDatabaseId) {
    if (DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.equals(_namedDatabaseId)) {

      throw new DatabaseManagementException("*** Error:  d4a2cbe0-e553-4a8b-9f9b-7f76ec67b37c");
    } else {

      String gdbName = _namedDatabaseId.name();

      DatabaseStateEnterpriseImpl _qiaDatabaseStateEnterpriseImpl = this.mapDsrdsd.get(gdbName);
      if (_qiaDatabaseStateEnterpriseImpl != null) {
        return String.format(io.github.onograph.I18N.format(
                "io.github.onograph.dbms.DbmsManagerWatchTagImpl.format"),
            _qiaDatabaseStateEnterpriseImpl.failure().map(Throwable::getMessage).orElseThrow());
      } else {
        this.healthMonitorService.stqnmgForNaSt(m, _namedDatabaseId);
        this.adtderForNaSt(m, _namedDatabaseId);
        this.trgrDbmsResolverMeta(_namedDatabaseId);
        return m;
      }
    }
  }


  public String reefqnString(NamedDatabaseId _namedDatabaseId) {

    Optional<DatabaseStateEnterpriseImpl> _optionalSpDatabaseStateEnterpriseImpl = Optional.ofNullable(
        this.mapDsrdsd.remove(_namedDatabaseId.name()));
    if (_optionalSpDatabaseStateEnterpriseImpl.isPresent()) {
      this.trgrDbmsResolverMeta(_namedDatabaseId);
    }

    return this._gesomeeOptional(_optionalSpDatabaseStateEnterpriseImpl)
        .orElse(io.github.onograph.I18N.format(
            "io.github.onograph.dbms.DbmsManagerWatchTagImpl.orElse"));
  }


  public void stpopiForNaTh(NamedDatabaseId _namedDatabaseId, Throwable _pocThrowable) {

    DatabaseStateEnterpriseImpl _qiaDatabaseStateEnterpriseImpl = this.mapDsrdsd.get(
        _namedDatabaseId.name());
    if (_qiaDatabaseStateEnterpriseImpl != null) {

    } else {

      String m = String.format("*** Error:  x10239-1202393ks. Message: %s",
          _pocThrowable.getMessage());
      this.healthMonitorService.stqnmgForNaSt(m, _namedDatabaseId);
      this.adtderForNaSt(m, _namedDatabaseId);
      this.trgrDbmsResolverMeta(
          DbmsResolverAction.paietaeDbmsResolverActionRequiresGeneration(_namedDatabaseId,
              _pocThrowable).create());
    }
  }


  private void trgrDbmsResolverMeta(NamedDatabaseId _namedDatabaseId) {
    this.trgrDbmsResolverMeta(
        DbmsResolverAction.prottaeDbmsResolverActionHasImportant(_namedDatabaseId).create());
  }
}
