package io.github.onograph.cluster.raft.akkamsg.serialization;

import java.io.IOException;
import java.util.UUID;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;


public final class UUIDSafeChannelMarshal extends SafeChannelMarshal<UUID> {


  public static final UUIDSafeChannelMarshal IT = new UUIDSafeChannelMarshal();

  @Override
  public void marshal(UUID _uUID, WritableChannel _writableChannel) throws IOException {
    _writableChannel.putLong(_uUID.getMostSignificantBits());
    _writableChannel.putLong(_uUID.getLeastSignificantBits());
  }

  @Override
  protected UUID unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    long _lgM = _readableChannel.getLong();

    long _lgL = _readableChannel.getLong();
    return new UUID(_lgM, _lgL);
  }
}
