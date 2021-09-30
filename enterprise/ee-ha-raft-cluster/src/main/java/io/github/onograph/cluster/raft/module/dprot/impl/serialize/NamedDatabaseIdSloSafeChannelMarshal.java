package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;


public class NamedDatabaseIdSloSafeChannelMarshal extends SafeChannelMarshal<NamedDatabaseId> {


  public static final NamedDatabaseIdSloSafeChannelMarshal IT = new NamedDatabaseIdSloSafeChannelMarshal();

  private NamedDatabaseIdSloSafeChannelMarshal() {
  }

  @Override
  public void marshal(NamedDatabaseId _namedDatabaseId, WritableChannel _writableChannel)
      throws IOException {
    BasicStringSerializationHandler.maslForBySt(_namedDatabaseId.name(), _writableChannel);
    UUIDSafeChannelMarshal.IT.marshal(_namedDatabaseId.databaseId().uuid(), _writableChannel);
  }

  @Override
  protected NamedDatabaseId unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {
    return DatabaseIdFactory.from(BasicStringSerializationHandler.unahString(_readableChannel),
        UUIDSafeChannelMarshal.IT.unmarshal(_readableChannel));
  }
}
