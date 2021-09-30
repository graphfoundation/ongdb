package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;


public class SyncedLeaderMetaSafeChannelMarshal extends SafeChannelMarshal<SyncedLeaderMeta> {


  public static final SyncedLeaderMetaSafeChannelMarshal IT = new SyncedLeaderMetaSafeChannelMarshal();


  private final NodeServerMemberLeaderMetaSafeChannelMarshal milNodeServerMemberLeaderMetaSafeChannelMarshal;

  private SyncedLeaderMetaSafeChannelMarshal() {
    this.milNodeServerMemberLeaderMetaSafeChannelMarshal = NodeServerMemberLeaderMetaSafeChannelMarshal.IT;
  }

  @Override
  public void marshal(SyncedLeaderMeta _ilrSyncedLeaderMeta, WritableChannel _writableChannel)
      throws IOException {
    this.milNodeServerMemberLeaderMetaSafeChannelMarshal.marshal(
        _ilrSyncedLeaderMeta.getIlNodeServerMemberLeaderMeta(), _writableChannel);
  }

  @Override
  protected SyncedLeaderMeta unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {
    return new SyncedLeaderMeta(
        this.milNodeServerMemberLeaderMetaSafeChannelMarshal.unmarshal(_readableChannel));
  }
}
