package io.github.onograph.dbms;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;


class DbmsManagerShutdownImpl extends AbstractDbmsManager {


  private final int iCs;


  private final Map<String, DatabaseStateEnterpriseImpl> mapDsrdsd;

  DbmsManagerShutdownImpl(Config _config) {

    int _iPrlei = _config.get(GraphDatabaseSettings.reconciler_maximum_parallelism);
    if (_iPrlei == 0) {
      _iPrlei = Runtime.getRuntime().availableProcessors();
    }

    this.iCs = _iPrlei;
    this.mapDsrdsd = new ConcurrentHashMap();
  }


  private static DatabaseStateEnterpriseImpl _stpdsaDatabaseStateEnterpriseImpl(
      NamedDatabaseId _namedDatabaseId) {
    return new DatabaseStateEnterpriseImpl(_namedDatabaseId,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
  }


  Stream<Set<NamedDatabaseId>> badatosStream(Stream<NamedDatabaseId> _streamDtbssNamedDatabaseId) {

    AtomicInteger _iAtomicInteger = new AtomicInteger(0);
    return (_streamDtbssNamedDatabaseId.collect(Collectors.groupingBy((ignored) ->
    {
      return _iAtomicInteger.getAndIncrement() / this.iCs;
    }))).values().stream().map(HashSet::new);
  }

  @Override
  protected Map<String, DatabaseStateEnterpriseImpl> deidMapEP() {
    return this.mapDsrdsd;
  }


  void stpalForSe(Set<NamedDatabaseId> _setDrNamedDatabaseId) {
    this.mapDsrdsd.clear();

    Stream<NamedDatabaseId> _streamSndaNamedDatabaseId = _setDrNamedDatabaseId.stream()
        .filter((e) ->
        {
          return !e.equals(
              DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
        });

    Stream<Set<NamedDatabaseId>> _streamBthsSet = this.badatosStream(_streamSndaNamedDatabaseId);
    _streamBthsSet.forEach((databaseBatch) ->
    {

      Map<String, DatabaseStateEnterpriseImpl> _mapUdsd =
          databaseBatch.stream().collect(
              Collectors.toMap(NamedDatabaseId::name,
                  DbmsManagerShutdownImpl::_stpdsaDatabaseStateEnterpriseImpl));
      this.mapDsrdsd.putAll(_mapUdsd);
      this.trgrDbmsResolverMeta(
              DbmsResolverAction.pritrDbmsResolverActionHasImportant(databaseBatch).create())
          .awiForNa(databaseBatch);
    });
    this.mapDsrdsd.put(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.name(),
        _stpdsaDatabaseStateEnterpriseImpl(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID));
    this.trgrDbmsResolverMeta(DbmsResolverAction.prottaeDbmsResolverActionHasImportant(
            DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID).create())
        .awiForNa(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
  }
}
