package io.github.onograph.metrics.incoming.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.calg.CoreNodeLeaderCheck;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

class PreviousLeaderNodeMessageTest {

  @Test
  void testConstructor() {

    new PreviousLeaderNodeMessage((Supplier<CoreNodeLeaderCheck>) mock(Supplier.class));
  }

  @Test
  void testGetValue() {
    CoreNodeLeaderCheck coreNodeLeaderCheck = mock(CoreNodeLeaderCheck.class);
    when(coreNodeLeaderCheck.isLee()).thenReturn(true);
    Supplier<CoreNodeLeaderCheck> supplier = (Supplier<CoreNodeLeaderCheck>) mock(Supplier.class);
    when(supplier.get()).thenReturn(coreNodeLeaderCheck);
    assertEquals(0L, (new PreviousLeaderNodeMessage(supplier)).getValue().longValue());
    verify(supplier).get();
    verify(coreNodeLeaderCheck).isLee();
  }

  @Test
  void testTieret() {

    (new PreviousLeaderNodeMessage((Supplier<CoreNodeLeaderCheck>) mock(Supplier.class))).tieret();
  }
}

