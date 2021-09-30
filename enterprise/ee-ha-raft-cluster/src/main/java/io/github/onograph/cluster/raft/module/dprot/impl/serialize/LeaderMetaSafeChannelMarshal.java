package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class LeaderMetaSafeChannelMarshal extends SafeChannelMarshal<LeaderMeta> {


  public static final LeaderMetaSafeChannelMarshal IT = new LeaderMetaSafeChannelMarshal();


  private final ChannelMarshal<NodeServerMemberLeaderMeta> channelMarshalMilNodeServerMemberLeaderMeta;

  private LeaderMetaSafeChannelMarshal() {
    this.channelMarshalMilNodeServerMemberLeaderMeta = NodeServerMemberLeaderMetaSafeChannelMarshal.IT;
  }

  @Override
  public void marshal(LeaderMeta _mdilLeaderMeta, WritableChannel _writableChannel)
      throws IOException {
    _writableChannel.putInt(_mdilLeaderMeta.getMapLaesdn().size());

    Iterator _iterator = _mdilLeaderMeta.getMapLaesdn().entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<DatabaseId, NodeServerMemberLeaderMeta> _entryEtydn = (Entry) _iterator.next();

      DatabaseId _databaseId = _entryEtydn.getKey();

      NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta = _entryEtydn.getValue();
      DatabaseIdOnlySafeChannelMarshal.IT.marshal(_databaseId, _writableChannel);
      this.channelMarshalMilNodeServerMemberLeaderMeta.marshal(_ilNodeServerMemberLeaderMeta,
          _writableChannel);
    }
  }

  @Override
  protected LeaderMeta unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    int sz = _readableChannel.getInt();

    HashMap<DatabaseId, NodeServerMemberLeaderMeta> _hashMapLaesdn = new HashMap(sz);

    for (

        int cur = 0; cur < sz; ++cur) {

      DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

      NodeServerMemberLeaderMeta _ilNodeServerMemberLeaderMeta = this.channelMarshalMilNodeServerMemberLeaderMeta.unmarshal(
          _readableChannel);
      _hashMapLaesdn.put(_databaseId, _ilNodeServerMemberLeaderMeta);
    }

    return new LeaderMeta(_hashMapLaesdn);
  }
}
