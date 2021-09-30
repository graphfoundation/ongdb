package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl;
import io.github.onograph.config.NodeGroupIdentifier;
import java.io.IOException;
import java.util.Set;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;


public class GdbDiscoveryMetaReadReplicaMarshal extends
    GdbDiscoveryMetaSafeChannelMarshal<GdbDiscoveryMetaReadReplicaImpl> {


  public static final GdbDiscoveryMetaReadReplicaMarshal IT = new GdbDiscoveryMetaReadReplicaMarshal();


  private final ChannelMarshal<SocketAddress> channelMarshalAsamSocketAddress;


  private final ChannelMarshal<DiscoverySocketAddresses> channelMarshalCcamDiscoverySocketAddresses;

  private GdbDiscoveryMetaReadReplicaMarshal() {
    this.channelMarshalCcamDiscoverySocketAddresses =
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.DiscoverySocketAddressesSafeChannelMarshal.IT;
    this.channelMarshalAsamSocketAddress = SocketAddressSafeChannelMarshal.IT;
  }

  @Override
  public void marshal(GdbDiscoveryMetaReadReplicaImpl _irrGdbDiscoveryMetaReadReplicaImpl,
      WritableChannel _writableChannel)
      throws IOException {
    this.channelMarshalCcamDiscoverySocketAddresses.marshal(
        _irrGdbDiscoveryMetaReadReplicaImpl.contsDiscoverySocketAddresses(), _writableChannel);
    this.channelMarshalAsamSocketAddress.marshal(
        _irrGdbDiscoveryMetaReadReplicaImpl.cacpsrrSocketAddress(), _writableChannel);
    maslgosForGdWr(_irrGdbDiscoveryMetaReadReplicaImpl, _writableChannel);
    maadaiForGdWr(_irrGdbDiscoveryMetaReadReplicaImpl, _writableChannel);
  }

  @Override
  protected GdbDiscoveryMetaReadReplicaImpl unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DiscoverySocketAddresses _acDiscoverySocketAddresses = this.channelMarshalCcamDiscoverySocketAddresses.unmarshal(
        _readableChannel);

    SocketAddress _scSocketAddress = this.channelMarshalAsamSocketAddress.unmarshal(
        _readableChannel);

    Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier = unsgrSet(_readableChannel);

    Set<DatabaseId> _setIdDatabaseId = unsdasiSet(_readableChannel);
    return new GdbDiscoveryMetaReadReplicaImpl(_acDiscoverySocketAddresses, _scSocketAddress,
        _setGopNodeGroupIdentifier, _setIdDatabaseId);
  }
}
