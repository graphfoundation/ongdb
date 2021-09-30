package io.github.onograph.internal.batchimport;

import java.io.IOException;
import org.neo4j.io.fs.FlushableChannel;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.string.UTF8;


class Utils {


  static String redsrgString(ReadableChannel _readableChannel) throws IOException {

    byte[] btCnt = new byte[_readableChannel.getInt()];
    _readableChannel.get(btCnt, btCnt.length);
    return UTF8.decode(btCnt);
  }


  static void wrtstnForStFl(FlushableChannel _flushableChannel, String title)
      throws IOException {

    byte[] btCnt = UTF8.encode(title);
    _flushableChannel.putInt(btCnt.length);
    _flushableChannel.put(btCnt, btCnt.length);
  }
}
