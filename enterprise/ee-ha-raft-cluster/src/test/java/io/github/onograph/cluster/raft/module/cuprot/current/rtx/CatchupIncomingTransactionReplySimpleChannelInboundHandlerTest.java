package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import org.junit.jupiter.api.Test;

class CatchupIncomingTransactionReplySimpleChannelInboundHandlerTest {

  @Test
  void testConstructor() {

    new CatchupIncomingTransactionReplySimpleChannelInboundHandler(null,
        new RefCatchupManagerImpl());
  }
}

