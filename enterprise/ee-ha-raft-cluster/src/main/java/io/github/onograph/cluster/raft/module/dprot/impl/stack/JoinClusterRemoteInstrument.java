package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.actor.ActorRef;
import akka.actor.ActorSelectionMessage;
import akka.actor.ExtendedActorSystem;
import akka.cluster.ClusterMessage;
import akka.cluster.InternalClusterAction.InitJoin;
import akka.remote.artery.RemoteInstrument;
import java.nio.ByteBuffer;
import org.neo4j.util.VisibleForTesting;


public class JoinClusterRemoteInstrument extends RemoteInstrument {


  private static final byte reeirtiByte = AkkaRemoteInstrumentDequeWrapper.geinfr();


  private final ExtendedActorSystem extendedActorSystem;

  public JoinClusterRemoteInstrument(ExtendedActorSystem _extendedActorSystem) {
    this.extendedActorSystem = _extendedActorSystem;
  }


  private void _trpbeForJo(
      io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.ClusterMessageCommandInfo<?> ev) {
    if (this.extendedActorSystem != null) {
      if (this.extendedActorSystem.eventStream() != null) {
        this.extendedActorSystem.eventStream().publish(ev);
      }
    }
  }


  private Object _unrmseObject(Object m) {
    while (m instanceof ActorSelectionMessage) {
      m = ((ActorSelectionMessage) m).msg();
    }

    return m;
  }

  @Override
  public byte identifier() {
    return reeirtiByte;
  }

  @Override
  public void remoteMessageReceived(ActorRef _rcpetActorRef, Object m, ActorRef _sneActorRef,
      int sz, long _lgT) {
    m = this._unrmseObject(m);
    if (m instanceof InitJoin) {

      io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo ev =
          new io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo(
              (InitJoin) m, _sneActorRef);
      this._trpbeForJo(ev);
    }
  }

  @Override
  public void remoteMessageSent(ActorRef _rcpetActorRef, Object m, ActorRef _sneActorRef, int sz,
      long _lgTim) {
  }

  @Override
  public void remoteReadMetadata(ActorRef _rcpetActorRef, Object m, ActorRef _sneActorRef,
      ByteBuffer _byteBuffer) {
  }

  @Override
  public void remoteWriteMetadata(ActorRef _rcpetActorRef, Object m, ActorRef _sneActorRef,
      ByteBuffer _byteBuffer) {
  }


  public interface OriginatingActorRef {


    ActorRef geoilseActorRef();
  }


  private static class ClusterMessageCommandInfo<T extends ClusterMessage>
      implements
      io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.OriginatingActorRef {


    private final ActorRef osActorRef;


    private final T tMo;


    ClusterMessageCommandInfo(ActorRef _soActorRef, T _tMo) {
      this.osActorRef = _soActorRef;
      this.tMo = _tMo;
    }

    @Override
    public ActorRef geoilseActorRef() {
      return this.osActorRef;
    }


    public T getTMo() {
      return this.tMo;
    }
  }


  public static class InitJoinClusterMessageCommandInfo
      extends
      io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.ClusterMessageCommandInfo<InitJoin> {

    public InitJoinClusterMessageCommandInfo(InitJoin m, ActorRef _soActorRef) {
      super(_soActorRef, m);
    }


    @VisibleForTesting
    public static io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo dumJoinClusterRemoteInstrumentInitJoinClusterMessageCommandInfo() {
      return new io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo(
          new InitJoin(null), null);
    }
  }
}
