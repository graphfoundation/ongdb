package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class TransactionSyncReplyByteToMessageDecoderTest {

  @Test
  void testConstructor() {
    assertFalse((new TransactionSyncReplyByteToMessageDecoder()).isSingleDecode());
  }
}

