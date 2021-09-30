package io.github.onograph.cluster.raft.share.meta.fsm.lcservice;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.cluster.raft.share.sync.SyncMeta;
import io.github.onograph.cluster.raft.share.sync.Syncerator;
import java.util.Optional;
import java.util.function.Supplier;
import org.neo4j.kernel.api.exceptions.Status.Cluster;
import org.neo4j.kernel.api.exceptions.Status.General;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.api.LeaseClient;
import org.neo4j.kernel.impl.api.LeaseException;
import org.neo4j.kernel.impl.api.LeaseService;


public class LeaseServiceEnterpriseImpl implements LeaseService {


  private static final String NOT_ON_LED_ERO_MSX =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl.var");


  private final ConsensusLeaderNodeService llConsensusLeaderNodeService;


  private final SyncableLeasableCoreNodeDataFSMImpl mslSyncableLeasableCoreNodeDataFSMImpl;


  private final NamedDatabaseId namedDatabaseId;


  private final Syncerator rpiaoSyncerator;


  private final Supplier<ConsensusNodeId> supplierMslConsensusNodeId;


  private volatile int iIli = -1;


  private volatile int iIlm = -1;


  public LeaseServiceEnterpriseImpl(ConsensusLeaderNodeService _llConsensusLeaderNodeService,
      SyncableLeasableCoreNodeDataFSMImpl _mslSyncableLeasableCoreNodeDataFSMImpl,
      NamedDatabaseId _namedDatabaseId, Syncerator _rpiaoSyncerator,
      Supplier<ConsensusNodeId> _supplierMslConsensusNodeId) {
    this.llConsensusLeaderNodeService = _llConsensusLeaderNodeService;
    this.mslSyncableLeasableCoreNodeDataFSMImpl = _mslSyncableLeasableCoreNodeDataFSMImpl;
    this.namedDatabaseId = _namedDatabaseId;
    this.rpiaoSyncerator = _rpiaoSyncerator;
    this.supplierMslConsensusNodeId = _supplierMslConsensusNodeId;
  }


  private Leaseable _curtlaLeaseable() {

    LeasableMeta _saeLeasableMeta = this.mslSyncableLeasableCoreNodeDataFSMImpl.snpoLeasableMeta();
    return new SyncableLeasableCoreNodeData(this.namedDatabaseId, _saeLeasableMeta);
  }


  private void _enuld() throws LeaseException {

    Optional<NodeServerMemberLeaderMeta> _optionalIlNodeServerMemberLeaderMeta = this.llConsensusLeaderNodeService.geldioOptional();

    ConsensusNodeId _laeConsensusNodeId = null;
    if (_optionalIlNodeServerMemberLeaderMeta.isPresent()) {
      _laeConsensusNodeId = _optionalIlNodeServerMemberLeaderMeta.get().getImConsensusNodeId();
    }

    if (!this.supplierMslConsensusNodeId.get().equals(_laeConsensusNodeId)) {

      throw new LeaseException("*** Error:  cd5fea22-791c-4811-9a5c-a1000094bdf0",
          Cluster.NotALeader);
    }
  }


  synchronized int acrlsoth() throws LeaseException {

    Leaseable _lcLeaseable = this._curtlaLeaseable();
    if (this.supplierMslConsensusNodeId.get().equals(_lcLeaseable.oweObject()) && !this.isInl(
        _lcLeaseable.getLeaseId())) {
      return _lcLeaseable.getLeaseId();
    } else {
      this._enuld();

      SyncableLeasableCoreNodeData _rlSyncableLeasableCoreNodeData = new SyncableLeasableCoreNodeData(
          this.namedDatabaseId.databaseId(), Leaseable.getNext(_lcLeaseable.getLeaseId()),
          this.supplierMslConsensusNodeId.get());

      SyncMeta _rrSyncMeta = this.rpiaoSyncerator.relaSyncMeta(_rlSyncableLeasableCoreNodeData);
      if (_rrSyncMeta.getReslt()
          != io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_COM_OK) {

        throw new LeaseException("*** Error:  69d5f57c-3530-4806-bcc7-20db571602af",
            _rrSyncMeta.getFiueThrowable(), Cluster.ReplicationFailure);
      } else {

        boolean _isAl;
        try {
          _isAl = _rrSyncMeta.getSmrFSMData().cose();
        } catch (

            Exception _exception) {

          throw new LeaseException("*** Error:  f633266d-d749-44e7-84ea-770f789032bb", _exception,
              General.UnknownError);
        }

        if (!_isAl) {

          throw new LeaseException("*** Error:  95407a25-e83c-47c1-a089-1fcefd9f84af",
              Cluster.NotALeader);
        } else {
          this.iIli = _lcLeaseable.getLeaseId();
          return this.iIlm = _rlSyncableLeasableCoreNodeData.getLeaseId();
        }
      }
    }
  }


  public synchronized void inil(int lsId) {
    if (lsId != -1 && lsId == this.mslSyncableLeasableCoreNodeDataFSMImpl.getLsId()) {
      this.iIli = lsId;
    }
  }


  public boolean isInl(int lsId) {
    if (lsId == -1) {

      throw new IllegalArgumentException("*** Error:  6a482672-20a5-4004-a3c3-9d17e69087bd");
    } else {
      return lsId == this.iIli || lsId != this.mslSyncableLeasableCoreNodeDataFSMImpl.getLsId()
          || lsId != this.iIlm;
    }
  }

  @Override
  public LeaseClient newClient() {
    return new LeaseClientEnterpriseImpl(this);
  }
}
