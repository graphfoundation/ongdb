package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeStateMarshal;


public class MemberIndexWrapper {


  private final long lgIdx;


  private final Set<ConsensusNodeId> mbrs;

  public MemberIndexWrapper(long lgIdx, Set<ConsensusNodeId> mbrs) {
    this.lgIdx = lgIdx;
    this.mbrs = mbrs;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      MemberIndexWrapper _tMemberIndexWrapper = (MemberIndexWrapper) obj;
      return this.lgIdx == _tMemberIndexWrapper.lgIdx && Objects.equals(this.mbrs,
          _tMemberIndexWrapper.mbrs);
    } else {
      return false;
    }
  }


  public long getLgIdx() {
    return this.lgIdx;
  }


  public Set<ConsensusNodeId> getMbrs() {
    return this.mbrs;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.lgIdx, this.mbrs);
  }


  public static class SafeStateMarshalImpl extends SafeStateMarshal<MemberIndexWrapper> {


    public static final SafeStateMarshalImpl IT = new SafeStateMarshalImpl();


    ConsensusNodeId.SafeStateMarshalImpl memberSafeStateMarshalImpl;

    private SafeStateMarshalImpl() {
      this.memberSafeStateMarshalImpl = ConsensusNodeId.SafeStateMarshalImpl.IT;
    }

    @Override
    public void marshal(MemberIndexWrapper _etyMemberIndexWrapper, WritableChannel _writableChannel)
        throws IOException {
      if (_etyMemberIndexWrapper == null) {
        _writableChannel.putInt(0);
      } else {
        _writableChannel.putInt(1);
        _writableChannel.putLong(_etyMemberIndexWrapper.lgIdx);
        _writableChannel.putInt(_etyMemberIndexWrapper.mbrs.size());

        Iterator _iterator = _etyMemberIndexWrapper.mbrs.iterator();

        while (_iterator.hasNext()) {

          ConsensusNodeId _mmeConsensusNodeId = (ConsensusNodeId) _iterator.next();
          this.memberSafeStateMarshalImpl.marshal(_mmeConsensusNodeId, _writableChannel);
        }
      }
    }

    @Override
    public long ordinal(MemberIndexWrapper _etyMemberIndexWrapper) {
      return _etyMemberIndexWrapper.lgIdx;
    }

    @Override
    public MemberIndexWrapper startState() {
      return null;
    }

    @Override
    protected MemberIndexWrapper unmarshal0(ReadableChannel _readableChannel)
        throws IOException, EndOfStreamException {

      int _iEh = _readableChannel.getInt();
      if (_iEh == 0) {
        return null;
      } else {

        long lgIdx = _readableChannel.getLong();

        int _iCm = _readableChannel.getInt();

        Set<ConsensusNodeId> mbrs = new HashSet();

        for (

            int cur = 0; cur < _iCm; ++cur) {
          mbrs.add(this.memberSafeStateMarshalImpl.unmarshal(_readableChannel));
        }

        return new MemberIndexWrapper(lgIdx, mbrs);
      }
    }


  }
}
