package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;


public class ConsensusNodeServerMemberIdWrapperMarshaller {

  private ConsensusNodeServerMemberIdWrapperMarshaller() {
  }


  public static void maslForCoWr(
      ConsensusNodeServerMemberIdWrapper _smConsensusNodeServerMemberIdWrapper,
      WritableChannel _writableChannel)
      throws IOException {

    Set<ConsensusNodeId> mbrs = _smConsensusNodeServerMemberIdWrapper.gembsSet();
    _writableChannel.putInt(mbrs.size());

    ConsensusNodeId.SafeStateMarshalImpl memberIdSafeStateMarshalImpl = ConsensusNodeId.SafeStateMarshalImpl.IT;

    Iterator _iterator = mbrs.iterator();

    while (_iterator.hasNext()) {

      ConsensusNodeId _mmeConsensusNodeId = (ConsensusNodeId) _iterator.next();
      memberIdSafeStateMarshalImpl.marshal(_mmeConsensusNodeId, _writableChannel);
    }
  }


  public static ConsensusNodeServerMemberIdWrapper unahConsensusNodeServerMemberIdWrapper(
      ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    HashSet<ConsensusNodeId> mbrs = new HashSet();

    int _iCm = _readableChannel.getInt();

    ConsensusNodeId.SafeStateMarshalImpl memberIdSafeStateMarshalImpl = ConsensusNodeId.SafeStateMarshalImpl.IT;

    for (

        int cur = 0; cur < _iCm; ++cur) {
      mbrs.add(memberIdSafeStateMarshalImpl.unmarshal(_readableChannel));
    }

    return new ConsensusNodeServerMemberIdWrapper(mbrs);
  }
}
