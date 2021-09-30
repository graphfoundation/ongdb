package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper;
import java.io.IOException;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerId.Marshal;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class GdbServerIdWrapperSafeChannelMarshal extends SafeChannelMarshal<GdbServerIdWrapper> {


  public static final GdbServerIdWrapperSafeChannelMarshal IT = new GdbServerIdWrapperSafeChannelMarshal();

  private GdbServerIdWrapperSafeChannelMarshal() {
  }

  @Override
  public void marshal(GdbServerIdWrapper gdbServerIdWrapper, WritableChannel _writableChannel)
      throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(gdbServerIdWrapper.getDatabaseId(),
        _writableChannel);
    Marshal.INSTANCE.marshal(gdbServerIdWrapper.getServerId(), _writableChannel);
  }

  @Override
  protected GdbServerIdWrapper unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    ServerId _serverId = Marshal.INSTANCE.unmarshal(_readableChannel);
    return new GdbServerIdWrapper(_databaseId, _serverId);
  }
}
