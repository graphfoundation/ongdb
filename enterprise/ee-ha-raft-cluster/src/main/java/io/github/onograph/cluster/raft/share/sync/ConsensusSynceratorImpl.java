package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.akkamsg.OutDirection;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.dbms.gdb.EnterpriseClusterDbContext;
import java.time.Duration;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.function.Suppliers.Lazy;
import org.neo4j.internal.helpers.TimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy.Timeout;
import org.neo4j.kernel.availability.UnavailableException;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;


public class ConsensusSynceratorImpl implements Syncerator, LeaderNodeEventHandlers {


  private final DatabaseManager<EnterpriseClusterDbContext> databaseManagerDmEnterpriseClusterDbContext;


  private final Lazy<ConsensusNodeId> lazyMConsensusNodeId;


  private final long lgMta;


  private final Log log;


  private final ConsensusSyncWatcherService mrConsensusSyncWatcherService;


  private final NamedDatabaseId namedDatabaseId;


  private final OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage>
      outDirectionOtoncc;


  private final NodeLeaderManager plNodeLeaderManager;


  private final TimeoutStrategy porsTimeoutStrategy;


  private final SubCSManager psSubCSManager;


  private final SyncStatusMetaService tpSyncStatusMetaService;


  public ConsensusSynceratorImpl(Duration _alDuration,
      DatabaseManager<EnterpriseClusterDbContext> _databaseManagerMdEnterpriseClusterDbContext,
      Lazy<ConsensusNodeId> _lazyMConsensusNodeId, long _lgMta,
      ConsensusLeaderNodeService _llConsensusLeaderNodeService, LogProvider _logProvider,
      Monitors _monitors, NamedDatabaseId _namedDatabaseId,
      OutDirection<ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> _outDirectionOtoncc,
      TimeoutStrategy _porsTimeoutStrategy, SubCSManager _psSubCSManager,
      SyncStatusMetaService _tpSyncStatusMetaService) {
    this.namedDatabaseId = _namedDatabaseId;
    this.lazyMConsensusNodeId = _lazyMConsensusNodeId;
    this.outDirectionOtoncc = _outDirectionOtoncc;
    this.tpSyncStatusMetaService = _tpSyncStatusMetaService;
    this.psSubCSManager = _psSubCSManager;
    this.porsTimeoutStrategy = _porsTimeoutStrategy;
    this.lgMta = _lgMta;
    this.log = _logProvider.getLog(this.getClass());
    this.databaseManagerDmEnterpriseClusterDbContext = _databaseManagerMdEnterpriseClusterDbContext;
    this.mrConsensusSyncWatcherService = _monitors.newMonitor(ConsensusSyncWatcherService.class,
        new String[0]);
    this.plNodeLeaderManager = new NodeLeaderManager(_alDuration);
    _llConsensusLeaderNodeService.retlsrForLe(this);
  }


  private void _astdbavb() throws UnavailableException {

    Database _database =
        this.databaseManagerDmEnterpriseClusterDbContext.getDatabaseContext(this.namedDatabaseId)
            .map(DatabaseContext::database).orElseThrow(() ->
            {
              return new DatabaseNotFoundException(
                  "*** Error: 8742a98e-0b5a-4884-9e05-ba660f2317b8");
            });
    _database.getDatabaseAvailabilityGuard().await(this.lgMta);
    if (!_database.getDatabaseHealth().isHealthy()) {

      throw new UnavailableException("*** Error:  d415d97d-3abc-4abc-a033-877ad1109f2c");
    }
  }


  private boolean _isTrrlaForCoDaSyTi(ConsensusNodeId _laeConsensusNodeId,
      DataSyncClusterAction _oeainDataSyncClusterAction, SyncStatus _porsSyncStatus,
      Timeout _rpiaiTimeout)
      throws InterruptedException {
    this.mrConsensusSyncWatcherService.recnam();
    this.outDirectionOtoncc.senForMEME(true, _laeConsensusNodeId,
        new ConsensusMessageServiceMeta.MsgCreatorService.Ask(_oeainDataSyncClusterAction,
            this.lazyMConsensusNodeId.get()));
    _porsSyncStatus.awrcn(_rpiaiTimeout.getAndIncrement());
    return _porsSyncStatus.getIsRi();
  }

  @Override
  public void onleeswcForNo(NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta) {
    this.tpSyncStatusMetaService.trerliee();

    ConsensusNodeId _lnConsensusNodeId = _ilNodeServerMemberLeaderMeta.getImConsensusNodeId();

    ConsensusNodeId _loConsensusNodeId = this.plNodeLeaderManager.getLcConsensusNodeId();
    if (_lnConsensusNodeId == null && _loConsensusNodeId != null) {

    } else if (_lnConsensusNodeId != null && _loConsensusNodeId == null) {

    }

    this.plNodeLeaderManager.seldForCo(_lnConsensusNodeId);
  }

  @Override
  public SyncMeta relaSyncMeta(SyncableData _cmadSyncableData) {
    this.mrConsensusSyncWatcherService.clerut();

    try {
      this._astdbavb();
    } catch (

        DatabaseNotFoundException | UnavailableException _exception) {
      this.mrConsensusSyncWatcherService.norlad();
      return SyncMeta.norladSyncMeta(_exception);
    }

    ConsensusNodeId _laeConsensusNodeId;
    try {
      _laeConsensusNodeId = this.plNodeLeaderManager.awileeConsensusNodeId();
    } catch (

        InterruptedException _interruptedException) {
      Thread.currentThread().interrupt();
      this.mrConsensusSyncWatcherService.norlad();
      return SyncMeta.norladSyncMeta(_interruptedException);
    }

    if (_laeConsensusNodeId == null) {
      this.mrConsensusSyncWatcherService.norlad();
      return
          SyncMeta.norladSyncMeta(
              new IllegalStateException("*** Error:  0b6b8a10-f0c8-45d4-add3-8bee01d8c985"));
    } else {

      ClusterSessionEnvWrapper _clusterSessionEnvWrapper = this.psSubCSManager.acuessoClusterSessionEnvWrapper();

      DataSyncClusterAction _oeainDataSyncClusterAction =
          new DataSyncClusterAction(_cmadSyncableData,
              _clusterSessionEnvWrapper.getIolSessionSeqActionId(),
              _clusterSessionEnvWrapper.getSgClusterSessionBean());

      FSMData _rmsFSMData = null;

      SyncStatus _porsSyncStatus = this.tpSyncStatusMetaService.strSyncStatus(
          _oeainDataSyncClusterAction);

      try {

        Timeout _porsTimeout = this.porsTimeoutStrategy.newTimeout();

        CoreSyncLog _lgeCoreSyncLog = new CoreSyncLog(this.log);

        do {
          _lgeCoreSyncLog.neaetForDaCo(_laeConsensusNodeId, _oeainDataSyncClusterAction);
          if (this._isTrrlaForCoDaSyTi(_laeConsensusNodeId, _oeainDataSyncClusterAction,
              _porsSyncStatus, _porsTimeout)) {
            this.psSubCSManager.reeessoForCl(_clusterSessionEnvWrapper);
            this.mrConsensusSyncWatcherService.suslrle();
            _lgeCoreSyncLog.sucsForDa(_oeainDataSyncClusterAction);
            _porsSyncStatus.awirel();
            _rmsFSMData = _porsSyncStatus.getRslFSMData();
          } else {
            this._astdbavb();
            _laeConsensusNodeId = this.plNodeLeaderManager.awileeConsensusNodeId();
            if (_laeConsensusNodeId == null) {

              throw new IllegalStateException("*** Error:  c0cca9b4-144c-483a-a04a-d7339d14c18c");
            }
          }
        }
        while (_rmsFSMData == null);
      } catch (

          Throwable _throwable) {
        if (_throwable instanceof InterruptedException) {
          Thread.currentThread().interrupt();
        }

        this.tpSyncStatusMetaService.abrForDa(_oeainDataSyncClusterAction);
        this.mrConsensusSyncWatcherService.marc();
        return SyncMeta.marcSyncMeta(_throwable);
      }

      return SyncMeta.apldSyncMeta(_rmsFSMData);
    }
  }
}
