package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler;
import io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import io.github.onograph.config.NodeGroupIdentifier;
import java.io.IOException;
import java.util.Set;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;


public class CoreDiscoveryServerInfoMarshal extends
    GdbDiscoveryMetaSafeChannelMarshal<GdbDiscoveryMetaCoreImpl> {


  public static final CoreDiscoveryServerInfoMarshal IT = new CoreDiscoveryServerInfoMarshal();


  private final ChannelMarshal<DiscoverySocketAddresses> channelMarshalMaccDiscoverySocketAddresses;


  private final ChannelMarshal<SocketAddress> channelMarshalMasaSocketAddress;

  private CoreDiscoveryServerInfoMarshal() {
    this.channelMarshalMaccDiscoverySocketAddresses =
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.DiscoverySocketAddressesSafeChannelMarshal.IT;
    this.channelMarshalMasaSocketAddress = SocketAddressSafeChannelMarshal.IT;
  }

  @Override
  public void marshal(GdbDiscoveryMetaCoreImpl _csiGdbDiscoveryMetaCoreImpl,
      WritableChannel _writableChannel)
      throws IOException {
    this.channelMarshalMasaSocketAddress.marshal(_csiGdbDiscoveryMetaCoreImpl.getSrSocketAddress(),
        _writableChannel);
    this.channelMarshalMasaSocketAddress.marshal(
        _csiGdbDiscoveryMetaCoreImpl.cacpsrrSocketAddress(), _writableChannel);
    this.channelMarshalMaccDiscoverySocketAddresses.marshal(
        _csiGdbDiscoveryMetaCoreImpl.contsDiscoverySocketAddresses(), _writableChannel);
    maslgosForGdWr(_csiGdbDiscoveryMetaCoreImpl, _writableChannel);
    maadaiForGdWr(_csiGdbDiscoveryMetaCoreImpl, _writableChannel);

    boolean _isRtbl = false;
    BasicBoolSerializationHandler.maslForWr(_isRtbl, _writableChannel);
  }

  @Override
  protected GdbDiscoveryMetaCoreImpl unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    SocketAddress _srSocketAddress = this.channelMarshalMasaSocketAddress.unmarshal(
        _readableChannel);

    SocketAddress _scSocketAddress = this.channelMarshalMasaSocketAddress.unmarshal(
        _readableChannel);

    DiscoverySocketAddresses _acDiscoverySocketAddresses = this.channelMarshalMaccDiscoverySocketAddresses.unmarshal(
        _readableChannel);

    Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier = unsgrSet(_readableChannel);

    Set<DatabaseId> _setIdDatabaseId = unsdasiSet(_readableChannel);
    BasicBoolSerializationHandler.isUnahForRe(_readableChannel);
    return new GdbDiscoveryMetaCoreImpl(_acDiscoverySocketAddresses, _scSocketAddress,
        _setGopNodeGroupIdentifier, _setIdDatabaseId, _srSocketAddress);
  }
}
