package io.github.onograph.cluster.raft.share.meta;

import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeStateMarshal;


public class DefaultMarshalChannelCMS extends SafeStateMarshal<Long> {

  @Override
  public void marshal(Long idx, WritableChannel _writableChannel) throws IOException {
    _writableChannel.putLong(idx);
  }

  @Override
  public long ordinal(Long idx) {
    return idx;
  }

  @Override
  public Long startState() {
    return -1L;
  }

  @Override
  protected Long unmarshal0(ReadableChannel _readableChannel) throws IOException {
    return _readableChannel.getLong();
  }
}
