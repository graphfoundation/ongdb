package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.StringChannelMarshal;


public class BasicStringSerializationHandler {


  private static final StringChannelMarshal STRREF_CHNL_MASL = new StringChannelMarshal();

  private BasicStringSerializationHandler() {
  }


  public static void maslForBySt(ByteBuf _bfeByteBuf, String _strSrn) {
    if (_strSrn == null) {
      _bfeByteBuf.writeInt(-1);
    } else {

      byte[] btCnt = _strSrn.getBytes(StandardCharsets.UTF_8);
      _bfeByteBuf.writeInt(btCnt.length);
      _bfeByteBuf.writeBytes(btCnt);
    }
  }


  public static void maslForBySt(ByteBuffer _byteBuffer, String _strSrn) {
    if (_strSrn == null) {
      _byteBuffer.putInt(-1);
    } else {

      byte[] btCnt = _strSrn.getBytes(StandardCharsets.UTF_8);
      _byteBuffer.putInt(btCnt.length);
      _byteBuffer.put(btCnt);
    }
  }


  public static void maslForBySt(String _strSrn, WritableChannel _writableChannel)
      throws IOException {
    STRREF_CHNL_MASL.marshal(_strSrn, _writableChannel);
  }


  public static String unahString(ByteBuf _bfeByteBuf) {

    int _iL = _bfeByteBuf.readInt();
    if (_iL == -1) {
      return null;
    } else {

      byte[] btCnt = new byte[_iL];
      _bfeByteBuf.readBytes(btCnt);
      return new String(btCnt, StandardCharsets.UTF_8);
    }
  }


  public static String unahString(ReadableChannel _readableChannel) throws IOException {
    return STRREF_CHNL_MASL.unmarshal(_readableChannel);
  }
}
