package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import akka.actor.ActorRef;
import akka.actor.ExtendedActorSystem;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerId.Marshal;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class UpdateReadReplicaInfoSafeChannelMarshal extends
    SafeChannelMarshal<UpdateReadReplicaInfo> {


  private final ChannelMarshal<ActorRef> channelMarshalMraActorRef;


  private final ChannelMarshal<GdbDiscoveryMetaReadReplicaImpl> channelMarshalRrimGdbDiscoveryMetaReadReplicaImpl;


  private final ChannelMarshal<ServerId> channelMarshalSimServerId;

  public UpdateReadReplicaInfoSafeChannelMarshal(ExtendedActorSystem _extendedActorSystem) {
    this.channelMarshalSimServerId = Marshal.INSTANCE;
    this.channelMarshalMraActorRef = new ActorRefSafeChannelMarshal(_extendedActorSystem);
    this.channelMarshalRrimGdbDiscoveryMetaReadReplicaImpl = GdbDiscoveryMetaReadReplicaMarshal.IT;
  }

  @Override
  public void marshal(UpdateReadReplicaInfo _mrrrUpdateReadReplicaInfo,
      WritableChannel _writableChannel) throws IOException {
    this.channelMarshalRrimGdbDiscoveryMetaReadReplicaImpl.marshal(
        _mrrrUpdateReadReplicaInfo.getIrrGdbDiscoveryMetaReadReplicaImpl(), _writableChannel);
    this.channelMarshalSimServerId.marshal(_mrrrUpdateReadReplicaInfo.getServerId(),
        _writableChannel);
    this.channelMarshalMraActorRef.marshal(_mrrrUpdateReadReplicaInfo.getMccActorRef(),
        _writableChannel);
    this.channelMarshalMraActorRef.marshal(_mrrrUpdateReadReplicaInfo.getTcActorRef(),
        _writableChannel);

    Map<DatabaseId, DiscoveryGdbOperatorMetaWrapper> _mapSddd = _mrrrUpdateReadReplicaInfo.getMapDsdd();
    _writableChannel.putInt(_mapSddd.size());

    Iterator _iterator = _mapSddd.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<DatabaseId, DiscoveryGdbOperatorMetaWrapper> _entryEtydd = (Entry) _iterator.next();
      DatabaseIdOnlySafeChannelMarshal.IT.marshal(_entryEtydd.getKey(), _writableChannel);
      DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal.IT.marshal(_entryEtydd.getValue(),
          _writableChannel);
    }
  }

  @Override
  protected UpdateReadReplicaInfo unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    GdbDiscoveryMetaReadReplicaImpl _irGdbDiscoveryMetaReadReplicaImpl =
        this.channelMarshalRrimGdbDiscoveryMetaReadReplicaImpl.unmarshal(_readableChannel);

    ServerId _serverId = this.channelMarshalSimServerId.unmarshal(_readableChannel);

    ActorRef _ccActorRef = this.channelMarshalMraActorRef.unmarshal(_readableChannel);

    ActorRef _ctActorRef = this.channelMarshalMraActorRef.unmarshal(_readableChannel);

    HashMap<DatabaseId, DiscoveryGdbOperatorMetaWrapper> _hashMapSddd = new HashMap();

    int sz = _readableChannel.getInt();

    for (

        int cur = 0; cur < sz; ++cur) {

      DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

      DiscoveryGdbOperatorMetaWrapper _saeDiscoveryGdbOperatorMetaWrapper =
          DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal.IT.unmarshal(_readableChannel);
      _hashMapSddd.put(_databaseId, _saeDiscoveryGdbOperatorMetaWrapper);
    }

    return new UpdateReadReplicaInfo(_ctActorRef, _irGdbDiscoveryMetaReadReplicaImpl, _hashMapSddd,
        _ccActorRef, _serverId);
  }
}
