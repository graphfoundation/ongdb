package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerId.Marshal;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class ConsensusGdbServerCoordinatorSafeChannelMarshal extends
    SafeChannelMarshal<ConsensusGdbServerCoordinator> {


  public static final ConsensusGdbServerCoordinatorSafeChannelMarshal IT = new ConsensusGdbServerCoordinatorSafeChannelMarshal();

  private ConsensusGdbServerCoordinatorSafeChannelMarshal() {
  }

  @Override
  public void marshal(ConsensusGdbServerCoordinator consensusGdbServerCoordinator,
      WritableChannel _writableChannel) throws IOException {
    Marshal.INSTANCE.marshal(consensusGdbServerCoordinator.getServerId(), _writableChannel);

    Map<DatabaseId, ConsensusNodeId> _mapMpigdc = Map.copyOf(
        consensusGdbServerCoordinator.daatrmaMap());
    _writableChannel.putInt(_mapMpigdc.size());

    Iterator _iterator = _mapMpigdc.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<DatabaseId, ConsensusNodeId> _entryEtydc = (Entry) _iterator.next();

      DatabaseId _databaseId = _entryEtydc.getKey();

      ConsensusNodeId consensusNodeId = _entryEtydc.getValue();
      DatabaseIdOnlySafeChannelMarshal.IT.marshal(_databaseId, _writableChannel);
      ConsensusNodeId.SafeStateMarshalImpl.IT.marshal(consensusNodeId, _writableChannel);
    }
  }

  @Override
  protected ConsensusGdbServerCoordinator unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    ServerId _serverId = Marshal.INSTANCE.unmarshal(_readableChannel);

    int _iCm = _readableChannel.getInt();

    HashMap<DatabaseId, ConsensusNodeId> _hashMapMpigdc = new HashMap();

    for (

        int cur = 0; cur < _iCm; ++cur) {

      DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

      ConsensusNodeId consensusNodeId = ConsensusNodeId.SafeStateMarshalImpl.IT.unmarshal(
          _readableChannel);
      _hashMapMpigdc.put(_databaseId, consensusNodeId);
    }

    return ConsensusGdbServerCoordinator.ofConsensusGdbServerCoordinator(_hashMapMpigdc, _serverId);
  }
}
