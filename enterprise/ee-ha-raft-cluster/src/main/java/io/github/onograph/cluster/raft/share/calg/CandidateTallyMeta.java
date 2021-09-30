package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.util.Objects;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeStateMarshal;


public class CandidateTallyMeta {


  private ConsensusNodeId fvConsensusNodeId;


  private long lgTer = -1L;

  public CandidateTallyMeta() {
  }


  private CandidateTallyMeta(long _lgTe, ConsensusNodeId _vfConsensusNodeId) {
    this.fvConsensusNodeId = _vfConsensusNodeId;
    this.lgTer = _lgTe;
  }


  private boolean _isTemcae(long _lgTe) {
    return _lgTe != this.lgTer;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      CandidateTallyMeta _svCandidateTallyMeta = (CandidateTallyMeta) obj;
      return this.lgTer == _svCandidateTallyMeta.lgTer && Objects.equals(this.fvConsensusNodeId,
          _svCandidateTallyMeta.fvConsensusNodeId);
    } else {
      return false;
    }
  }


  public ConsensusNodeId getFvConsensusNodeId() {
    return this.fvConsensusNodeId;
  }


  public long getLgTer() {
    return this.lgTer;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.fvConsensusNodeId, this.lgTer);
  }


  public boolean isUpaForCo(ConsensusNodeId _fvConsensusNodeId, long _lgTe) {
    if (this._isTemcae(_lgTe)) {
      this.fvConsensusNodeId = _fvConsensusNodeId;
      this.lgTer = _lgTe;
      return true;
    } else {
      if (this.fvConsensusNodeId == null) {
        if (_fvConsensusNodeId != null) {
          this.fvConsensusNodeId = _fvConsensusNodeId;
          return true;
        }
      } else if (!this.fvConsensusNodeId.equals(_fvConsensusNodeId)) {

        throw new IllegalArgumentException("*** Error:  0ec37958-ad53-4e61-beff-245e2a0ea84d");
      }

      return false;
    }
  }


  public static class MarshalChannelImplCMS extends SafeStateMarshal<CandidateTallyMeta> {


    public static final CandidateTallyMeta.MarshalChannelImplCMS IT = new CandidateTallyMeta.MarshalChannelImplCMS();


    private final ChannelMarshal<ConsensusNodeId> channelMarshalMmConsensusNodeId;

    private MarshalChannelImplCMS() {
      this.channelMarshalMmConsensusNodeId = ConsensusNodeId.SafeStateMarshalImpl.IT;
    }

    @Override
    public void marshal(CandidateTallyMeta _saeCandidateTallyMeta, WritableChannel _writableChannel)
        throws IOException {
      _writableChannel.putLong(_saeCandidateTallyMeta.lgTer);
      this.channelMarshalMmConsensusNodeId.marshal(_saeCandidateTallyMeta.getFvConsensusNodeId(),
          _writableChannel);
    }

    @Override
    public long ordinal(CandidateTallyMeta _saeCandidateTallyMeta) {
      return _saeCandidateTallyMeta.getLgTer();
    }

    @Override
    public CandidateTallyMeta startState() {
      return new CandidateTallyMeta();
    }

    @Override
    public CandidateTallyMeta unmarshal0(ReadableChannel _readableChannel)
        throws IOException, EndOfStreamException {

      long _lgTer = _readableChannel.getLong();

      ConsensusNodeId _mmeConsensusNodeId = this.channelMarshalMmConsensusNodeId.unmarshal(
          _readableChannel);
      return new CandidateTallyMeta(_lgTer, _mmeConsensusNodeId);
    }


  }
}
