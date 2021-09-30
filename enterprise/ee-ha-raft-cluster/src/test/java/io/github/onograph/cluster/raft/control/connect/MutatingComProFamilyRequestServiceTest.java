package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class MutatingComProFamilyRequestServiceTest {

  @Test
  void testConstructor() {
    HashSet<String> stringSet = new HashSet<String>();
    MutatingComProFamilyRequestService actualMutatingComProFamilyRequestService = new MutatingComProFamilyRequestService(
        "P Type", stringSet);

    assertEquals("P Type", actualMutatingComProFamilyRequestService.getPType());
    Set<String> setVrinIMPL = actualMutatingComProFamilyRequestService.getSetVrinIMPL();
    assertSame(stringSet, setVrinIMPL);
    assertTrue(setVrinIMPL.isEmpty());
    assertSame(setVrinIMPL, stringSet);
  }

  @Test
  void testDipcForSe() {

    MutatingComProFamilyRequestService mutatingComProFamilyRequestService = new MutatingComProFamilyRequestService(
        "P Type", new HashSet<String>());
    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    mutatingComProFamilyRequestService
        .dipcForSe(clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3)));
  }

  @Test
  void testDipcForSe2() {

    MutatingComProFamilyRequestService mutatingComProFamilyRequestService = new MutatingComProFamilyRequestService(
        "P Type", new HashSet<String>());
    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    mutatingComProFamilyRequestService.dipcForSe(
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)));
  }
}

