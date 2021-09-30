package io.github.onograph.cluster.raft.control;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.nio.charset.StandardCharsets;
import java.util.Objects;


final class SanityCheckingUtilities {


  private static final String MAIAE = io.github.onograph.TokenConstants.NEO4J_CLUSTER;


  private static final ByteBuf MAIAEF_BYTE_BUF = _cremcvebByteBuf();

  private SanityCheckingUtilities() {
  }


  private static ByteBuf _cremcvebByteBuf() {

    ByteBuf _byteBuf = ByteBufUtil.writeAscii(UnpooledByteBufAllocator.DEFAULT,
        io.github.onograph.TokenConstants.NEO4J_CLUSTER);

    ByteBuf _buByteBuf = Unpooled.unreleasableBuffer(_byteBuf);
    return _buByteBuf.asReadOnly();
  }


  static boolean isCrmavaForSt(String val) {
    return Objects.equals(io.github.onograph.TokenConstants.NEO4J_CLUSTER, val);
  }


  static ByteBuf maivaebfByteBuf() {
    return MAIAEF_BYTE_BUF.duplicate();
  }


  static String redmgvuString(ByteBuf _byteBuf) {

    int len = MAIAEF_BYTE_BUF.writerIndex();
    return _byteBuf.readCharSequence(len, StandardCharsets.US_ASCII).toString();
  }
}
