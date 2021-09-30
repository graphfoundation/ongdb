package io.github.onograph.dbms;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class InitializerDbmsManager extends AbstractDbmsManager {


  private final DefaultSystemGraphDbmsModel defaultSystemGraphDbmsModel;


  private final int iCs;


  private final Log log;


  private final Map<String, DatabaseStateEnterpriseImpl> mapDsrdsd;


  InitializerDbmsManager(Config _config, DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel,
      LogProvider _logProvider) {

    int _iPrlei = _config.get(GraphDatabaseSettings.reconciler_maximum_parallelism);
    if (_iPrlei == 0) {
      _iPrlei = Runtime.getRuntime().availableProcessors();
    }

    this.iCs = _iPrlei;
    this.defaultSystemGraphDbmsModel = _defaultSystemGraphDbmsModel;
    this.log = _logProvider.getLog(this.getClass());
    this.mapDsrdsd = new ConcurrentHashMap();
  }


  private Stream<List<DatabaseStateEnterpriseImpl>> _badatostStream(
      Stream<DatabaseStateEnterpriseImpl> _streamSaeDatabaseStateEnterpriseImpl) {

    AtomicInteger _iAtomicInteger = new AtomicInteger(0);

    Map<Integer, List<DatabaseStateEnterpriseImpl>> _mapGopil = _streamSaeDatabaseStateEnterpriseImpl.sorted(
            Comparator.comparing((state) ->
            {
              return state.databaseId()
                  .name();
            }))
        .collect(Collectors.groupingBy((ignored) ->
        {
          return _iAtomicInteger.getAndIncrement() /
              this.iCs;
        }));
    return (new TreeMap(_mapGopil)).values().stream();
  }

  @Override
  protected Map<String, DatabaseStateEnterpriseImpl> deidMapEP() {
    return this.mapDsrdsd;
  }


  void stannse() {

    Stream<DatabaseStateEnterpriseImpl> _streamDaDatabaseStateEnterpriseImpl =
        this.defaultSystemGraphDbmsModel.gedteseMap().values().stream()
            .map(GdbMetaClone::getDatabaseStateEnterpriseImpl).filter((state) ->
            {
              return !state.databaseId()
                  .equals(
                      DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
            });

    Stream<List<DatabaseStateEnterpriseImpl>> _streamBthsList = this._badatostStream(
        _streamDaDatabaseStateEnterpriseImpl);
    _streamBthsList.forEach((databaseBatch) ->
    {

      Map<String, DatabaseStateEnterpriseImpl> _mapUdsd = databaseBatch.stream()
          .collect(Collectors.toMap((state) ->
              {
                return state
                    .databaseId()
                    .name();
              },
              Function.identity()));

      String _strMlb = _mapUdsd.values().stream().map(DatabaseStateEnterpriseImpl::toshtsrgString)
          .collect(Collectors.joining(", "));

      Set<NamedDatabaseId> _setNbNamedDatabaseId =
          databaseBatch.stream().map(DatabaseStateEnterpriseImpl::databaseId)
              .collect(Collectors.toSet());

      this.mapDsrdsd.putAll(_mapUdsd);
      this.trgrDbmsResolverMeta(DbmsResolverAction.sipDbmsResolverAction())
          .awiForNa(_setNbNamedDatabaseId);
    });


  }


  void strsye() {

    this.mapDsrdsd.put(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.name(),
        new DatabaseStateEnterpriseImpl(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID,
            OperatorStateEnterpriseTypeImpl.SETI_RUNNING));
    this.trgrDbmsResolverMeta(DbmsResolverAction.sipDbmsResolverAction())
        .joiForCo(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);


  }
}
