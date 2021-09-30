package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolder;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.internal.helpers.Strings;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.util.Id;


public abstract class ClusterDiscoveryGdbLog<T> {


  protected static final Duration BLK_LTM = Duration.ofMillis(1000L);


  protected static final String BLK_SPCLX_NME = io.github.onograph.TokenConstants.BATCH_LOG_TIMER;


  protected final ScHolder bactioScHolder;


  protected final MutationInfo emtkeMutationInfo;


  protected final Log log;


  protected final Supplier<Set<DatabaseId>> supplierAldteslSet;


  protected final ScHolderJobSchedulerWatcher tieScHolderJobSchedulerWatcher;


  protected volatile MutationInfo backeMutationInfo;


  protected volatile List<DatabaseId> listBaedaiDatabaseId;


  protected ClusterDiscoveryGdbLog(Class<?> _classClObject, MutationInfo _kbeMutationInfo,
      LogProvider _logProvider, Supplier<Set<DatabaseId>> _supplierAdsSet, Duration _tbDuration,
      ScHolderJobScheduler _tsScHolderJobScheduler) {
    this.tieScHolderJobSchedulerWatcher = _tsScHolderJobScheduler.craScHolderJobSchedulerWatcher(
        Group.TOPOLOGY_LOGGER, (unused) ->
        {
          this._flschg();
        }, () ->
        {
          return io.github.onograph.TokenConstants.BATCH_LOG_TIMER;
        });
    this.supplierAldteslSet = _supplierAdsSet;
    this.log = _logProvider.getLog(_classClObject);
    this.emtkeMutationInfo = _kbeMutationInfo;
    this.backeMutationInfo = _kbeMutationInfo;
    this.listBaedaiDatabaseId = new ArrayList();
    this.bactioScHolder = ScHolderBuilder.fietioScHolder(_tbDuration.toMillis(),
        TimeUnit.MILLISECONDS);
  }


  private static String _dbtrbsrString(List<DatabaseId> _listDDatabaseId) {
    if (_listDDatabaseId.size() == 1) {
      return _listDDatabaseId.get(0).toString();
    } else if (_listDDatabaseId.size() <= 1) {
      return "";
    } else {

      StringBuilder _rslStringBuilder = new StringBuilder();
      _rslStringBuilder.append(_listDDatabaseId.get(0));

      int _iIl = _listDDatabaseId.size() - 1;

      for (

          int cur = 1; cur < _iIl; ++cur) {
        _rslStringBuilder.append(", ").append(_listDDatabaseId.get(cur));
      }

      _rslStringBuilder.append(
              io.github.onograph.I18N.format(
                  "io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryGdbLog.append"))
          .append(_listDDatabaseId.get(_iIl));
      return _rslStringBuilder.toString();
    }
  }


  private static void _prnlolForLoClLiSu(MutationInfo k, List<DatabaseId> _listDDatabaseId,
      Log _log, Supplier<Set<DatabaseId>> _supplierSpleSet) {

    HashSet<DatabaseId> _hashSetDaDatabaseId = new HashSet(_supplierSpleSet.get());
    _hashSetDaDatabaseId.addAll(_listDDatabaseId);

    StringBuilder _llStringBuilder = new StringBuilder();
    if (_listDDatabaseId.size() == 1) {
      _llStringBuilder.append(String.format(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryGdbLog.format"),
          k.tilString(), _dbtrbsrString(_listDDatabaseId), k.spcitnString()));
    } else if (_hashSetDaDatabaseId.size() == _listDDatabaseId.size()) {
      _llStringBuilder.append(String.format(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryGdbLog.format2"),
          k.tilString(), k.spcitnString()));
    } else if (_hashSetDaDatabaseId.size() - _listDDatabaseId.size() <= 5
        && _hashSetDaDatabaseId.size() < 2 * _listDDatabaseId.size()) {

      List<DatabaseId> _listDuDatabaseId = _hashSetDaDatabaseId.stream().filter((db) ->
      {
        return !_listDDatabaseId.contains(db);
      }).collect(Collectors.toList());
      _llStringBuilder.append(String.format(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryGdbLog.format3"),
          k.tilString(), _dbtrbsrString(_listDuDatabaseId),
          k.spcitnString()));
    } else if (_listDDatabaseId.size() <= 5) {
      _llStringBuilder.append(String.format(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryGdbLog.format4"),
          k.tilString(), _dbtrbsrString(_listDDatabaseId), k.spcitnString()));
    } else {
      _llStringBuilder.append(String.format(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryGdbLog.format5"),
          k.tilString(), _listDDatabaseId.size(), k.spcitnString()));
    }


  }


  protected static String nepdleString() {
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryGdbLog.nepdleString",
        System.lineSeparator());
  }


  protected static <V extends GdbDiscoveryMeta> String sertsastString(Map<ServerId, V> _mapIssv) {

    TreeMap<ServerId, V> _treeMapMssv = new TreeMap(Comparator.comparing(Id::uuid));
    _treeMapMssv.putAll(_mapIssv);
    return Strings.printMap(_treeMapMssv, nepdleString());
  }


  protected static String sertstsgString(Set<ServerId> mbrs) {

    TreeSet<ServerId> _treeSetSsServerId = new TreeSet(Comparator.comparing(Id::uuid));
    _treeSetSsServerId.addAll(mbrs);
    return _treeSetSsServerId.toString();
  }


  private void _flschg() {

    MutationInfo currentMutationInfo;

    List _idList;
    synchronized (this) {
      if (this.backeMutationInfo.equals(this.emtkeMutationInfo)) {
        return;
      }

      currentMutationInfo = this.backeMutationInfo;
      this.backeMutationInfo = this.emtkeMutationInfo;
      _idList = this.listBaedaiDatabaseId;
      this.listBaedaiDatabaseId = new ArrayList();
    }

    _prnlolForLoClLiSu(currentMutationInfo, _idList, this.log, this.supplierAldteslSet);
  }


  private synchronized void _haetlchForClDa(DatabaseId _databaseId, MutationInfo mutationInfo) {
    if (!Objects.equals(this.backeMutationInfo, mutationInfo)) {
      this._flschg();
      this.backeMutationInfo = mutationInfo;
      this.tieScHolderJobSchedulerWatcher.isSetForSc(this.bactioScHolder);
    }

    this.listBaedaiDatabaseId.add(_databaseId);
  }


  protected abstract Optional<MutationInfo> copecaeOptional(String _strVa, T _tV, T _tVar);


  protected abstract DatabaseId excdaiDatabaseId(T _tVar);


  public void locnForStTT(String _strDc, T _tIn, T _tIo) {

    Optional<MutationInfo> _optionalCagMutationInfo = this.copecaeOptional(_strDc, _tIn, _tIo);
    _optionalCagMutationInfo.ifPresent((content) ->
    {
      this._haetlchForClDa(this.excdaiDatabaseId(_tIn), content);
    });
  }


  protected interface MutationInfo {


    String spcitnString();


    String tilString();
  }
}
