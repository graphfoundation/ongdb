package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import org.junit.jupiter.api.Test;

class IncomingTxChannelOutboundHandlerAdapterTest {

  @Test
  void testConstructor() {

    new IncomingTxChannelOutboundHandlerAdapter();
  }

  @Test
  void testConstructor2() {

    new IncomingTxChannelOutboundHandlerAdapter(1);
  }
}

