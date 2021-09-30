package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class TransactionLogElectionTermByteToMessageDecoderTest {

  @Test
  void testConstructor() {
    assertFalse((new TransactionLogElectionTermByteToMessageDecoder(
        new ContentTypeRef())).isSingleDecode());
  }
}

