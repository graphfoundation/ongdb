package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;


public class NodeServerMemberLeaderMetaSafeChannelMarshal extends
    SafeChannelMarshal<NodeServerMemberLeaderMeta> {


  public static final NodeServerMemberLeaderMetaSafeChannelMarshal IT = new NodeServerMemberLeaderMetaSafeChannelMarshal();


  private final ConsensusNodeId.SafeStateMarshalImpl memberIdSafeStateMarshalImpl;

  private NodeServerMemberLeaderMetaSafeChannelMarshal() {
    this.memberIdSafeStateMarshalImpl = ConsensusNodeId.SafeStateMarshalImpl.IT;
  }

  @Override
  public void marshal(NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta,
      WritableChannel _writableChannel)
      throws IOException {
    this.memberIdSafeStateMarshalImpl.marshal(_ilNodeServerMemberLeaderMeta.getImConsensusNodeId(),
        _writableChannel);
    _writableChannel.putLong(_ilNodeServerMemberLeaderMeta.getLgT());
  }

  @Override
  protected NodeServerMemberLeaderMeta unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    ConsensusNodeId _imConsensusNodeId = this.memberIdSafeStateMarshalImpl.unmarshal(
        _readableChannel);

    long _lgTer = _readableChannel.getLong();
    return new NodeServerMemberLeaderMeta(_imConsensusNodeId, _lgTer);
  }
}
