package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.config.NodeGroupIdentifier;
import io.github.onograph.config.NodeGroupIdentifierSetSupplier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.DbmsReadOnlyChecker;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.kernel.database.NamedDatabaseId;


class NodeTransferRunner implements Runnable {


  private static final TransferElectApproachDefaultImpl RAMSTTG_TRANSFER_ELECT_APPROACH_DEFAULT_IMPL = new TransferElectApproachDefaultImpl();


  private final Config config;


  private final DbmsReadOnlyChecker dbmsReadOnlyChecker;


  private final NodeGroupIdentifierSetSupplier gsmNodeGroupIdentifierSetSupplier;


  private final LeaderController ltLeaderController;


  private final TransferElectApproach ssTransferElectApproach;


  private final Supplier<List<NamedDatabaseId>> supplierRlList;


  NodeTransferRunner(TransferElectApproach _bllTransferElectApproach, Config _config,
      DbmsReadOnlyChecker _dbmsReadOnlyChecker,
      NodeGroupIdentifierSetSupplier _msgNodeGroupIdentifierSetSupplier,
      Supplier<List<NamedDatabaseId>> _supplierLrList, LeaderController _tlLeaderController) {
    this.config = _config;
    this.dbmsReadOnlyChecker = _dbmsReadOnlyChecker;
    this.gsmNodeGroupIdentifierSetSupplier = _msgNodeGroupIdentifierSetSupplier;
    this.ltLeaderController = _tlLeaderController;
    this.ssTransferElectApproach = _bllTransferElectApproach;
    this.supplierRlList = _supplierLrList;
  }


  private static Map<NamedDatabaseId, NodeGroupIdentifier> _pridgpMap(Config _config,
      List<NamedDatabaseId> _listLmNamedDatabaseId) {

    Map<String, NodeGroupIdentifier> _mapDpgpsn = LeaderNodeGroupSetting.RNME.reaMap(_config);

    NodeGroupIdentifier _gpdNodeGroupIdentifier = _config.get(
        SettingsDeclarationClusterImpl.settingDeldiogNodeGroupIdentifier);
    return Objects.equals(_gpdNodeGroupIdentifier, NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER)
        && _mapDpgpsn.isEmpty() ? Map.of()
        : _listLmNamedDatabaseId.stream()
            .map((dbId) ->
            {
              return Pair
                  .of(dbId,
                      _mapDpgpsn
                          .getOrDefault(
                              dbId.name(),
                              _gpdNodeGroupIdentifier));
            })
            .filter(
                (pair) ->
                {
                  return !Objects
                      .equals(
                          pair.other(),
                          NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER);
                })
            .collect(
                Collectors
                    .toMap(Pair::first,
                        Pair::other));
  }


  private void _dobannForLi(List<NamedDatabaseId> _listLaesiNamedDatabaseId) {

    Set<NamedDatabaseId> _setGpwdNamedDatabaseId = _pridgpMap(this.config,
        _listLaesiNamedDatabaseId).keySet();

    Stream _stream = _listLaesiNamedDatabaseId.stream();
    Objects.requireNonNull(_setGpwdNamedDatabaseId);

    List<NamedDatabaseId> _listLsnpuNamedDatabaseId =
        (List) _stream.filter(Predicate.not(_setGpwdNamedDatabaseId::contains))
            .filter(Predicate.not(NamedDatabaseId::isSystemDatabase))
            .collect(Collectors.toList());
    this.ltLeaderController.isBacldiForCoTr(_listLsnpuNamedDatabaseId,
        this.ssTransferElectApproach);
  }


  private boolean _isDoposblnForLi(List<NamedDatabaseId> _listLaesiNamedDatabaseId) {

    Map<NamedDatabaseId, NodeGroupIdentifier> _mapLunn = this._unilesMap(_listLaesiNamedDatabaseId);
    return this.ltLeaderController.isToposgoForCoTrFu(_mapLunn.keySet(), (databaseId) ->
    {
      return Set.of(_mapLunn.get(databaseId));
    }, RAMSTTG_TRANSFER_ELECT_APPROACH_DEFAULT_IMPL);
  }


  private boolean _isTrflahironForLi(List<NamedDatabaseId> _listLmNamedDatabaseId) {

    List<NamedDatabaseId> _listRolNamedDatabaseId = _listLmNamedDatabaseId.stream().filter((db) ->
    {
      return this.dbmsReadOnlyChecker.isReadOnly(db.name());
    }).collect(Collectors.toList());
    return this.ltLeaderController.isBacldiForCoTr(_listRolNamedDatabaseId,
        RAMSTTG_TRANSFER_ELECT_APPROACH_DEFAULT_IMPL);
  }


  private Map<NamedDatabaseId, NodeGroupIdentifier> _unilesMap(
      List<NamedDatabaseId> _listLmNamedDatabaseId) {

    Set<NodeGroupIdentifier> _setGcmNodeGroupIdentifier = this.gsmNodeGroupIdentifierSetSupplier.get();

    Map<NamedDatabaseId, NodeGroupIdentifier> _mapGpnn = _pridgpMap(this.config,
        _listLmNamedDatabaseId);
    if (_mapGpnn.isEmpty()) {
      return Map.of();
    } else if (_setGcmNodeGroupIdentifier.isEmpty()) {
      return _mapGpnn;
    } else {
      _mapGpnn.entrySet().removeIf((entry) ->
      {
        return _setGcmNodeGroupIdentifier.contains(entry.getValue());
      });
      return _mapGpnn;
    }
  }

  @Override
  public void run() {

    List<NamedDatabaseId> _listLmNamedDatabaseId = this.supplierRlList.get();
    if (!this._isTrflahironForLi(_listLmNamedDatabaseId)) {
      if (!this._isDoposblnForLi(_listLmNamedDatabaseId)) {
        this._dobannForLi(_listLmNamedDatabaseId);
      }
    }
  }
}
