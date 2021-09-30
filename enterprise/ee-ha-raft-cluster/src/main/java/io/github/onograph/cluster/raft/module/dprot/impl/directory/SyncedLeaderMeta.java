package io.github.onograph.cluster.raft.module.dprot.impl.directory;

import akka.cluster.ddata.AbstractReplicatedData;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import org.neo4j.util.Id;


public class SyncedLeaderMeta extends AbstractReplicatedData<SyncedLeaderMeta> {


  private final NodeServerMemberLeaderMeta ilNodeServerMemberLeaderMeta;

  public SyncedLeaderMeta(NodeServerMemberLeaderMeta _liNodeServerMemberLeaderMeta) {
    this.ilNodeServerMemberLeaderMeta = _liNodeServerMemberLeaderMeta;
  }


  private static Optional<SyncedLeaderMeta> _sobyspdoOptional(SyncedLeaderMeta _lSyncedLeaderMeta,
      SyncedLeaderMeta _rgtSyncedLeaderMeta) {
    return _lSyncedLeaderMeta.ilNodeServerMemberLeaderMeta.getIsDsi() ? Optional.of(
        _lSyncedLeaderMeta)
        : (_rgtSyncedLeaderMeta.ilNodeServerMemberLeaderMeta.getIsDsi() ? Optional.of(
            _rgtSyncedLeaderMeta) : Optional.empty());
  }


  private static Optional<SyncedLeaderMeta> _sotbmbiOptional(SyncedLeaderMeta _lSyncedLeaderMeta,
      SyncedLeaderMeta _rgtSyncedLeaderMeta) {

    Comparator<ConsensusNodeId> _comparatorCuConsensusNodeId = Comparator.nullsFirst(
        Comparator.comparing(Id::uuid));

    int _iC = _comparatorCuConsensusNodeId.compare(
        _lSyncedLeaderMeta.ilNodeServerMemberLeaderMeta.getImConsensusNodeId(),
        _rgtSyncedLeaderMeta.ilNodeServerMemberLeaderMeta.getImConsensusNodeId());

    boolean _isGil = _iC > 0;

    boolean _isGir = _iC < 0;
    return _isGil ? Optional.of(_lSyncedLeaderMeta)
        : (_isGir ? Optional.of(_rgtSyncedLeaderMeta) : Optional.empty());
  }


  private static Optional<SyncedLeaderMeta> _sotbtmOptional(SyncedLeaderMeta _lSyncedLeaderMeta,
      SyncedLeaderMeta _rgtSyncedLeaderMeta) {

    boolean _isGl = _lSyncedLeaderMeta.ilNodeServerMemberLeaderMeta.getLgT()
        > _rgtSyncedLeaderMeta.ilNodeServerMemberLeaderMeta.getLgT();

    boolean _isGr = _rgtSyncedLeaderMeta.ilNodeServerMemberLeaderMeta.getLgT()
        > _lSyncedLeaderMeta.ilNodeServerMemberLeaderMeta.getLgT();
    return _isGl ? Optional.of(_lSyncedLeaderMeta)
        : (_isGr ? Optional.of(_rgtSyncedLeaderMeta) : Optional.empty());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      SyncedLeaderMeta _thaSyncedLeaderMeta = (SyncedLeaderMeta) obj;
      return Objects.equals(this.ilNodeServerMemberLeaderMeta,
          _thaSyncedLeaderMeta.ilNodeServerMemberLeaderMeta);
    } else {
      return false;
    }
  }


  public NodeServerMemberLeaderMeta getIlNodeServerMemberLeaderMeta() {
    return this.ilNodeServerMemberLeaderMeta;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.ilNodeServerMemberLeaderMeta);
  }

  @Override
  public SyncedLeaderMeta mergeData(SyncedLeaderMeta _thaSyncedLeaderMeta) {
    return Objects.equals(_thaSyncedLeaderMeta, this) ? _thaSyncedLeaderMeta
        : _sotbtmOptional(_thaSyncedLeaderMeta, this).or(() ->
        {
          return _sobyspdoOptional(
              _thaSyncedLeaderMeta,
              this);
        }).or(() ->
        {
          return _sotbmbiOptional(
              _thaSyncedLeaderMeta,
              this);
        }).orElse(
            _thaSyncedLeaderMeta);
  }


}
