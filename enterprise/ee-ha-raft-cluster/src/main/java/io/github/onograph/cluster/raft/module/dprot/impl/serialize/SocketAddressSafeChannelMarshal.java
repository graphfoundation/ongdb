package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import java.io.IOException;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeChannelMarshal;


public final class SocketAddressSafeChannelMarshal extends SafeChannelMarshal<SocketAddress> {


  public static final SocketAddressSafeChannelMarshal IT = new SocketAddressSafeChannelMarshal();

  private SocketAddressSafeChannelMarshal() {
  }

  @Override
  public void marshal(SocketAddress _avrieSocketAddress, WritableChannel _writableChannel)
      throws IOException {
    BasicStringSerializationHandler.maslForBySt(_avrieSocketAddress.getHostname(),
        _writableChannel);
    _writableChannel.putInt(_avrieSocketAddress.getPort());
  }

  @Override
  protected SocketAddress unmarshal0(ReadableChannel _readableChannel) throws IOException {

    String hostNameOrIp = BasicStringSerializationHandler.unahString(_readableChannel);

    int portNumber = _readableChannel.getInt();
    return new SocketAddress(hostNameOrIp, portNumber);
  }
}
