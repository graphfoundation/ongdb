package io.github.onograph.cluster.raft.id;

import java.io.IOException;
import java.util.UUID;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeStateMarshal;
import org.neo4j.util.Id;


public final class ConsensusNodeId extends Id {

  public ConsensusNodeId(UUID _uUID) {
    super(_uUID);
  }


  public static class SafeStateMarshalImpl extends SafeStateMarshal<ConsensusNodeId> {


    public static final SafeStateMarshalImpl IT = new SafeStateMarshalImpl();

    private SafeStateMarshalImpl() {
    }

    @Override
    public void marshal(ConsensusNodeId _miConsensusNodeId, WritableChannel _writableChannel)
        throws IOException {
      if (_miConsensusNodeId == null) {
        _writableChannel.put((byte) 0);
      } else {
        _writableChannel.put((byte) 1);
        _writableChannel.putLong(_miConsensusNodeId.uuid().getMostSignificantBits());
        _writableChannel.putLong(_miConsensusNodeId.uuid().getLeastSignificantBits());
      }
    }

    @Override
    public long ordinal(ConsensusNodeId _imConsensusNodeId) {
      return _imConsensusNodeId == null ? 0L : 1L;
    }

    @Override
    public ConsensusNodeId startState() {
      return null;
    }

    @Override
    public ConsensusNodeId unmarshal0(ReadableChannel _readableChannel) throws IOException {

      byte _mnByte = _readableChannel.get();
      if (_mnByte == 0) {
        return null;
      } else {

        long _lgBsm = _readableChannel.getLong();

        long _lgBsl = _readableChannel.getLong();
        return new ConsensusNodeId(new UUID(_lgBsm, _lgBsl));
      }
    }


  }
}
