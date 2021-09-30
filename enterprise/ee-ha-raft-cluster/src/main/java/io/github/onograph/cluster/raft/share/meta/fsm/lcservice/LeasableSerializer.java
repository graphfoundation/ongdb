package io.github.onograph.cluster.raft.share.meta.fsm.lcservice;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;


public class LeasableSerializer {

  private LeasableSerializer() {
  }


  public static void maslForSyWr(SyncableLeasableCoreNodeData _rlSyncableLeasableCoreNodeData,
      WritableChannel _writableChannel) throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_rlSyncableLeasableCoreNodeData.daasidDatabaseId(),
        _writableChannel);
    _writableChannel.putInt(_rlSyncableLeasableCoreNodeData.getLeaseId());
    ConsensusNodeId.SafeStateMarshalImpl.IT.marshal(_rlSyncableLeasableCoreNodeData.oweObject(),
        _writableChannel);
  }


  public static SyncableLeasableCoreNodeData unahSyncableLeasableCoreNodeData(
      ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    int lsId = _readableChannel.getInt();

    ConsensusNodeId _onrConsensusNodeId = ConsensusNodeId.SafeStateMarshalImpl.IT.unmarshal(
        _readableChannel);
    return new SyncableLeasableCoreNodeData(_databaseId, lsId, _onrConsensusNodeId);
  }
}
