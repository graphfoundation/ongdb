package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerId.Marshal;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class DatabaseReadReplicaClusterStructureSafeChannelMarshal extends
    SafeChannelMarshal<DatabaseReadReplicaClusterStructure> {


  public static final DatabaseReadReplicaClusterStructureSafeChannelMarshal IT = new DatabaseReadReplicaClusterStructureSafeChannelMarshal();


  private final ChannelMarshal<ServerId> channelMarshalMisServerId;


  private final ChannelMarshal<GdbDiscoveryMetaReadReplicaImpl> channelMarshalRrimGdbDiscoveryMetaReadReplicaImpl;

  private DatabaseReadReplicaClusterStructureSafeChannelMarshal() {
    this.channelMarshalMisServerId = Marshal.INSTANCE;
    this.channelMarshalRrimGdbDiscoveryMetaReadReplicaImpl = GdbDiscoveryMetaReadReplicaMarshal.IT;
  }

  @Override
  public void marshal(DatabaseReadReplicaClusterStructure _trrDatabaseReadReplicaClusterStructure,
      WritableChannel _writableChannel) throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(
        _trrDatabaseReadReplicaClusterStructure.daasidDatabaseId(), _writableChannel);
    _writableChannel.putInt(_trrDatabaseReadReplicaClusterStructure.sevsMap().size());

    Iterator _iterator = _trrDatabaseReadReplicaClusterStructure.sevsMap().entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<ServerId, GdbDiscoveryMetaReadReplicaImpl> _entryEtysg = (Entry) _iterator.next();

      ServerId _serverId = _entryEtysg.getKey();

      GdbDiscoveryMetaReadReplicaImpl _irrGdbDiscoveryMetaReadReplicaImpl = _entryEtysg.getValue();
      this.channelMarshalMisServerId.marshal(_serverId, _writableChannel);
      this.channelMarshalRrimGdbDiscoveryMetaReadReplicaImpl.marshal(
          _irrGdbDiscoveryMetaReadReplicaImpl, _writableChannel);
    }
  }

  @Override
  protected DatabaseReadReplicaClusterStructure unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    int sz = _readableChannel.getInt();

    HashMap<ServerId, GdbDiscoveryMetaReadReplicaImpl> _hashMapRpiasg = new HashMap(sz);

    for (

        int cur = 0; cur < sz; ++cur) {

      ServerId _serverId = this.channelMarshalMisServerId.unmarshal(_readableChannel);

      GdbDiscoveryMetaReadReplicaImpl _irrGdbDiscoveryMetaReadReplicaImpl =
          this.channelMarshalRrimGdbDiscoveryMetaReadReplicaImpl.unmarshal(_readableChannel);
      _hashMapRpiasg.put(_serverId, _irrGdbDiscoveryMetaReadReplicaImpl);
    }

    return new DatabaseReadReplicaClusterStructure(_databaseId, _hashMapRpiasg);
  }
}
