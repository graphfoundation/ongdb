package io.github.onograph.internal.batchimport;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DelegatingStoreChannel;
import org.neo4j.io.fs.PhysicalFlushableChannel;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.memory.LocalMemoryTracker;

class UtilsTest {

  @Test
  void testRedsrgString() throws IOException {
    ReadableChannel readableChannel = mock(ReadableChannel.class);
    doNothing().when(readableChannel).get((byte[]) any(), anyInt());
    when(readableChannel.getInt()).thenReturn(1);
    assertEquals("\u0000", Utils.redsrgString(readableChannel));
    verify(readableChannel).get((byte[]) any(), anyInt());
    verify(readableChannel).getInt();
  }

  @Test
  void testRedsrgString2() throws IOException {
    ReadableChannel readableChannel = mock(ReadableChannel.class);
    doNothing().when(readableChannel).get((byte[]) any(), anyInt());
    when(readableChannel.getInt()).thenReturn(-1);
    assertThrows(NegativeArraySizeException.class, () -> Utils.redsrgString(readableChannel));
    verify(readableChannel).getInt();
  }

  @Test
  void testWrtstnForStFl() throws IOException {

    DelegatingStoreChannel<StoreChannel> channel = new DelegatingStoreChannel<StoreChannel>(
        new DelegatingStoreChannel<StoreChannel>(new DelegatingStoreChannel<StoreChannel>(null)));
    Utils.wrtstnForStFl(new PhysicalFlushableChannel(channel, new LocalMemoryTracker()), "Dr");
  }
}

