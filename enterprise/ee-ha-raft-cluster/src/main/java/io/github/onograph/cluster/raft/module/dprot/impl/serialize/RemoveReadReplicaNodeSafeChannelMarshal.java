package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import akka.actor.ActorRef;
import akka.actor.ExtendedActorSystem;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;


public class RemoveReadReplicaNodeSafeChannelMarshal extends
    SafeChannelMarshal<RemoveReadReplicaNode> {


  private final ChannelMarshal<ActorRef> channelMarshalMraActorRef;

  public RemoveReadReplicaNodeSafeChannelMarshal(ExtendedActorSystem _extendedActorSystem) {
    this.channelMarshalMraActorRef = new ActorRefSafeChannelMarshal(_extendedActorSystem);
  }

  @Override
  public void marshal(RemoveReadReplicaNode _rrrmRemoveReadReplicaNode,
      WritableChannel _writableChannel) throws IOException {
    this.channelMarshalMraActorRef.marshal(_rrrmRemoveReadReplicaNode.getMccActorRef(),
        _writableChannel);
  }

  @Override
  protected RemoveReadReplicaNode unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {
    return new RemoveReadReplicaNode(this.channelMarshalMraActorRef.unmarshal(_readableChannel));
  }
}
