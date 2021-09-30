package io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology;

import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class ClusterStructureMetaManager<T> {


  private final Clock clock;


  private final Function<DatabaseId, T> functionFsedt;


  private final Function<T, DatabaseId> functionIdgtd;


  private final Log log;


  private final Duration lsmDuration;


  private final Map<DatabaseId, Instant> mapUldi = new HashMap();


  private final SourceQueueWithComplete<T> sourceQueueWithCompleteSsT;


  private final String strTs;


  private ClusterStructureMetaManager(Clock _clock, Function<DatabaseId, T> _functionFsedt,
      Function<T, DatabaseId> _functionIdgtd, LogProvider _logProvider, Duration _lsmDuration,
      SourceQueueWithComplete<T> _sourceQueueWithCompleteUdrynT, String _strTs) {
    this.strTs = _strTs;
    this.sourceQueueWithCompleteSsT = _sourceQueueWithCompleteUdrynT;
    this.functionFsedt = _functionFsedt;
    this.lsmDuration = _lsmDuration;
    this.clock = _clock;
    this.log = _logProvider.getLog(this.getClass());
    this.functionIdgtd = _functionIdgtd;
  }


  static ClusterStructureMetaManager<ReadReplicateGdbMeta> focrdassClusterStructureMetaManager(
      Clock _clock, LogProvider _logProvider, Duration _lsdmDuration,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsdReadReplicateGdbMeta) {
    return new ClusterStructureMetaManager<>(_clock, (id) ->
    {
      return ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(id, Map.of());
    }, ReadReplicateGdbMeta::getDatabaseId, _logProvider, _lsdmDuration,
        _sourceQueueWithCompleteSsdReadReplicateGdbMeta,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterStructureMetaManager.id"));
  }


  static ClusterStructureMetaManager<DatabaseCoreClusterStructure> focrtoeClusterStructureMetaManager(
      Clock _clock, LogProvider _logProvider, Duration _ltmDuration,
      SourceQueueWithComplete<DatabaseCoreClusterStructure> _sourceQueueWithCompleteStDatabaseCoreClusterStructure) {
    return new ClusterStructureMetaManager<>(_clock,
        DatabaseCoreClusterStructure::emtDatabaseCoreClusterStructure,
        DatabaseCoreClusterStructure::daasidDatabaseId,
        _logProvider,
        _ltmDuration, _sourceQueueWithCompleteStDatabaseCoreClusterStructure,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterStructureMetaManager.sourceQueueWithCompleteStDatabaseCoreClusterStructure"));
  }


  static ClusterStructureMetaManager<ReadReplicateGdbMeta> forarldasstClusterStructureMetaManager(
      Clock _clock, LogProvider _logProvider, Duration _lsdmDuration,
      SourceQueueWithComplete<ReadReplicateGdbMeta> _sourceQueueWithCompleteSsdReadReplicateGdbMeta) {
    return new ClusterStructureMetaManager<>(_clock, (id) ->
    {
      return ReadReplicateGdbMeta.ofrerlaReadReplicateGdbMeta(id, Map.of());
    }, ReadReplicateGdbMeta::getDatabaseId, _logProvider, _lsdmDuration,
        _sourceQueueWithCompleteSsdReadReplicateGdbMeta,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterStructureMetaManager.id2"));
  }


  static ClusterStructureMetaManager<DatabaseReadReplicaClusterStructure> forarltogClusterStructureMetaManager(
      Clock _clock, LogProvider _logProvider, Duration _ltmDuration,
      SourceQueueWithComplete<DatabaseReadReplicaClusterStructure> _sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure) {
    return new ClusterStructureMetaManager<>(_clock,
        DatabaseReadReplicaClusterStructure::emtDatabaseReadReplicaClusterStructure,
        DatabaseReadReplicaClusterStructure::daasidDatabaseId, _logProvider,
        _ltmDuration, _sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterStructureMetaManager.sourceQueueWithCompleteStDatabaseReadReplicaClusterStructure"));
  }


  private Set<DatabaseId> _fidasifsasaSet() {

    Instant _aoInstant = this.clock.instant().minus(this.lsmDuration);
    return this.mapUldi.entrySet().stream().filter((entry) ->
    {
      return entry.getValue().isBefore(_aoInstant);
    }).map(Entry::getKey).collect(Collectors.toSet());
  }


  void ofeForT(T _tSae) {
    this.sourceQueueWithCompleteSsT.offer(_tSae);
    this.mapUldi.put(this.functionIdgtd.apply(_tSae), this.clock.instant());
  }


  void prss() {

    Set<DatabaseId> _setSsfidDatabaseId = this._fidasifsasaSet();

    Iterator _iterator = _setSsfidDatabaseId.iterator();

    while (_iterator.hasNext()) {

      DatabaseId _databaseId = (DatabaseId) _iterator.next();

      T _tEpy = this.functionFsedt.apply(_databaseId);
      this.sourceQueueWithCompleteSsT.offer(_tEpy);
      this.mapUldi.remove(_databaseId);
    }
  }
}
