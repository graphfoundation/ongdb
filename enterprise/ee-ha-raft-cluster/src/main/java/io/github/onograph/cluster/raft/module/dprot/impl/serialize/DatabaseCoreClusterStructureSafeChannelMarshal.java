package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
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


public class DatabaseCoreClusterStructureSafeChannelMarshal extends
    SafeChannelMarshal<DatabaseCoreClusterStructure> {


  public static final DatabaseCoreClusterStructureSafeChannelMarshal IT = new DatabaseCoreClusterStructureSafeChannelMarshal();


  private final ChannelMarshal<GdbDiscoveryMetaCoreImpl> channelMarshalMciscGdbDiscoveryMetaCoreImpl;


  private final ChannelMarshal<ConsensusMemberGroupId> channelMarshalMigrConsensusMemberGroupId;


  private final ChannelMarshal<ServerId> channelMarshalMisServerId;

  private DatabaseCoreClusterStructureSafeChannelMarshal() {
    this.channelMarshalMisServerId = Marshal.INSTANCE;
    this.channelMarshalMciscGdbDiscoveryMetaCoreImpl = CoreDiscoveryServerInfoMarshal.IT;
    this.channelMarshalMigrConsensusMemberGroupId = ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
  }

  @Override
  public void marshal(DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure,
      WritableChannel _writableChannel)
      throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_tcDatabaseCoreClusterStructure.daasidDatabaseId(),
        _writableChannel);
    this.channelMarshalMigrConsensusMemberGroupId.marshal(
        _tcDatabaseCoreClusterStructure.getConsensusMemberGroupId(), _writableChannel);
    _writableChannel.putInt(_tcDatabaseCoreClusterStructure.sevsMap().size());

    Iterator _iterator = _tcDatabaseCoreClusterStructure.sevsMap().entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<ServerId, GdbDiscoveryMetaCoreImpl> _entryEtysg = (Entry) _iterator.next();

      ServerId _serverId = _entryEtysg.getKey();

      GdbDiscoveryMetaCoreImpl _iscGdbDiscoveryMetaCoreImpl = _entryEtysg.getValue();
      this.channelMarshalMisServerId.marshal(_serverId, _writableChannel);
      this.channelMarshalMciscGdbDiscoveryMetaCoreImpl.marshal(_iscGdbDiscoveryMetaCoreImpl,
          _writableChannel);
    }
  }

  @Override
  protected DatabaseCoreClusterStructure unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    ConsensusMemberGroupId consensusMemberGroupId = this.channelMarshalMigrConsensusMemberGroupId.unmarshal(
        _readableChannel);

    int _iCm = _readableChannel.getInt();

    HashMap<ServerId, GdbDiscoveryMetaCoreImpl> mbrs = new HashMap(_iCm);

    for (

        int cur = 0; cur < _iCm; ++cur) {

      ServerId _serverId = this.channelMarshalMisServerId.unmarshal(_readableChannel);

      GdbDiscoveryMetaCoreImpl _iscGdbDiscoveryMetaCoreImpl = this.channelMarshalMciscGdbDiscoveryMetaCoreImpl.unmarshal(
          _readableChannel);
      mbrs.put(_serverId, _iscGdbDiscoveryMetaCoreImpl);
    }

    return new DatabaseCoreClusterStructure(consensusMemberGroupId, _databaseId, mbrs);
  }
}
