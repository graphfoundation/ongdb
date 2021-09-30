package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class ConsensusTransactionLogElectionTermsWrapperTest {

  @Test
  void testConstructor() {
    long[] longArray = new long[]{1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L};
    long[] lgTerArray = (new ConsensusTransactionLogElectionTermsWrapper(
        longArray)).getLgTerArray();
    assertEquals(8, lgTerArray.length);
    assertSame(lgTerArray, longArray);
  }
}

