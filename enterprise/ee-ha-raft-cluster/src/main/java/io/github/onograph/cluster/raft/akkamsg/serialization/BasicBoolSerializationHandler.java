package io.github.onograph.cluster.raft.akkamsg.serialization;

import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;


public class BasicBoolSerializationHandler {

  private BasicBoolSerializationHandler() {
  }


  public static boolean isUnahForRe(ReadableChannel _readableChannel) throws IOException {
    return _readableChannel.get() != 0;
  }


  public static void maslForWr(boolean val, WritableChannel _writableChannel)
      throws IOException {
    _writableChannel.put((byte) (val ? 1 : 0));
  }
}
