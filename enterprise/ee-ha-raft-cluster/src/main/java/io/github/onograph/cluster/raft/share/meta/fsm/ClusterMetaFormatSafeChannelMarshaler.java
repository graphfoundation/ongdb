package io.github.onograph.cluster.raft.share.meta.fsm;

import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeStateMarshal;


public final class ClusterMetaFormatSafeChannelMarshaler extends
    SafeStateMarshal<ClusterMetaFormat> {


  public static final ClusterMetaFormatSafeChannelMarshaler IT = new ClusterMetaFormatSafeChannelMarshaler();

  private ClusterMetaFormatSafeChannelMarshaler() {
  }

  @Override
  public void marshal(ClusterMetaFormat _vrinClusterMetaFormat, WritableChannel _writableChannel)
      throws IOException {
    _writableChannel.putInt(_vrinClusterMetaFormat.getIMjr());
    _writableChannel.putInt(_vrinClusterMetaFormat.getIMnr());
  }

  @Override
  public long ordinal(ClusterMetaFormat _vscClusterMetaFormat) {

    throw new UnsupportedOperationException("*** Error: 769fbb97-0142-407b-a5fe-eca042620d69");
  }

  @Override
  public ClusterMetaFormat startState() {
    return null;
  }

  @Override
  protected ClusterMetaFormat unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    int _iMjr = _readableChannel.getInt();

    int _iMnr = _readableChannel.getInt();
    return new ClusterMetaFormat(_iMjr, _iMnr);
  }
}
