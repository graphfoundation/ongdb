package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.DatabaseIdFactory;


public class DatabaseIdOnlySafeChannelMarshal extends SafeChannelMarshal<DatabaseId> {


  public static final DatabaseIdOnlySafeChannelMarshal IT = new DatabaseIdOnlySafeChannelMarshal();

  @Override
  public void marshal(DatabaseId _rDatabaseId, WritableChannel _writableChannel)
      throws IOException {
    UUIDSafeChannelMarshal.IT.marshal(_rDatabaseId.uuid(), _writableChannel);
  }

  @Override
  protected DatabaseId unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {
    return DatabaseIdFactory.from(UUIDSafeChannelMarshal.IT.unmarshal(_readableChannel));
  }
}
