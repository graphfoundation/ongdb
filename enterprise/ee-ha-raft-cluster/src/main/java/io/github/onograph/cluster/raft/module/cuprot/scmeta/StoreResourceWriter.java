package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.buffer.ByteBuf;
import java.io.IOException;


public interface StoreResourceWriter extends AutoCloseable {


  void wrtForBy(ByteBuf _byteBuf) throws IOException;
}
