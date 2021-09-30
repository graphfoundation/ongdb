package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import akka.actor.ActorRef;
import akka.actor.ExtendedActorSystem;
import akka.serialization.Serialization;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeChannelMarshal;


public final class ActorRefSafeChannelMarshal extends SafeChannelMarshal<ActorRef> {


  private final ExtendedActorSystem extendedActorSystem;

  public ActorRefSafeChannelMarshal(ExtendedActorSystem _extendedActorSystem) {
    this.extendedActorSystem = _extendedActorSystem;
  }

  @Override
  public void marshal(ActorRef _actorRef, WritableChannel _writableChannel)
      throws IOException {

    String _strPa = Serialization.serializedActorPath(_actorRef);
    BasicStringSerializationHandler.maslForBySt(_strPa, _writableChannel);
  }

  @Override
  protected ActorRef unmarshal0(ReadableChannel _readableChannel) throws IOException {

    String _strPra = BasicStringSerializationHandler.unahString(_readableChannel);
    return this.extendedActorSystem.provider().resolveActorRef(_strPra);
  }
}
