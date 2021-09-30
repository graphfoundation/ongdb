package io.github.onograph.dbms;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import java.io.IOException;
import java.util.Objects;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeStateMarshal;


@Deprecated
public class WatchTag {


  private final String m;

  WatchTag(String m) {
    this.m = Objects.requireNonNull(m);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      WatchTag _tWatchTag = (WatchTag) obj;
      return Objects.equals(this.m, _tWatchTag.m);
    } else {
      return false;
    }
  }


  public String getM() {
    return this.m;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.m);
  }


  public static class MarshalChannelImplCMS extends SafeStateMarshal<WatchTag> {


    public static final io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS IT =
        new io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS();

    private MarshalChannelImplCMS() {
    }

    @Override
    public void marshal(WatchTag _mreWatchTag, WritableChannel _writableChannel)
        throws IOException {

      String m = _mreWatchTag.getM();
      BasicStringSerializationHandler.maslForBySt(m, _writableChannel);
    }

    @Override
    public long ordinal(WatchTag _mreWatchTag) {
      return _mreWatchTag == null ? 0L : 1L;
    }

    @Override
    public WatchTag startState() {
      return null;
    }

    @Override
    public WatchTag unmarshal0(ReadableChannel _readableChannel) throws IOException {

      String m = BasicStringSerializationHandler.unahString(_readableChannel);
      return new WatchTag(m);
    }
  }
}
