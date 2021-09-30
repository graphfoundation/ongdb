package io.github.onograph.cluster.raft.share.meta.fsm.lcservice;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.util.Objects;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeStateMarshal;


public class LeasableMeta {


  public static final LeasableMeta INTL_LES_STAX;

  static {
    INTL_LES_STAX = new LeasableMeta(-1L, SyncableLeasableCoreNodeData.INAD_LES_REQ);
  }


  private final long lgOdnl;


  private final int lsId;


  private final ConsensusNodeId onrConsensusNodeId;

  public LeasableMeta(long _lgOdnl, SyncableLeasableCoreNodeData _rlSyncableLeasableCoreNodeData) {
    this(_lgOdnl, _rlSyncableLeasableCoreNodeData.getLeaseId(),
        _rlSyncableLeasableCoreNodeData.oweObject());
  }

  private LeasableMeta(long _lgOdnl, int lsId, ConsensusNodeId _onrConsensusNodeId) {
    this.lgOdnl = _lgOdnl;
    this.lsId = lsId;
    this.onrConsensusNodeId = _onrConsensusNodeId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      LeasableMeta _thLeasableMeta = (LeasableMeta) obj;
      return this.lgOdnl == _thLeasableMeta.lgOdnl && this.lsId == _thLeasableMeta.lsId &&
          Objects.equals(this.onrConsensusNodeId, _thLeasableMeta.onrConsensusNodeId);
    } else {
      return false;
    }
  }


  long getLgOdnl() {
    return this.lgOdnl;
  }


  public int getLsId() {
    return this.lsId;
  }


  public ConsensusNodeId getOnrConsensusNodeId() {
    return this.onrConsensusNodeId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.lgOdnl, this.onrConsensusNodeId, this.lsId);
  }


  LeasableMeta neitcLeasableMeta() {
    return new LeasableMeta(this.lgOdnl, this.lsId, this.onrConsensusNodeId);
  }


  public static class MarshalChannelImplCMS extends SafeStateMarshal<LeasableMeta> {


    private final ChannelMarshal<ConsensusNodeId> channelMarshalMmConsensusNodeId;

    public MarshalChannelImplCMS() {
      this.channelMarshalMmConsensusNodeId = ConsensusNodeId.SafeStateMarshalImpl.IT;
    }

    @Override
    public void marshal(LeasableMeta _saeLeasableMeta, WritableChannel _writableChannel)
        throws IOException {
      _writableChannel.putLong(_saeLeasableMeta.lgOdnl);
      _writableChannel.putInt(_saeLeasableMeta.getLsId());
      this.channelMarshalMmConsensusNodeId.marshal(_saeLeasableMeta.getOnrConsensusNodeId(),
          _writableChannel);
    }

    @Override
    public long ordinal(LeasableMeta _saeLeasableMeta) {
      return _saeLeasableMeta.getLgOdnl();
    }

    @Override
    public LeasableMeta startState() {
      return LeasableMeta.INTL_LES_STAX;
    }

    @Override
    public LeasableMeta unmarshal0(ReadableChannel _readableChannel)
        throws IOException, EndOfStreamException {

      long lgIdx = _readableChannel.getLong();

      int lsId = _readableChannel.getInt();

      ConsensusNodeId _mmeConsensusNodeId = this.channelMarshalMmConsensusNodeId.unmarshal(
          _readableChannel);
      return new LeasableMeta(lgIdx, lsId, _mmeConsensusNodeId);
    }


  }
}
