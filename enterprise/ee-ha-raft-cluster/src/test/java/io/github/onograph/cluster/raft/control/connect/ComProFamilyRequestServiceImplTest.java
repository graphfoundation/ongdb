package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.config.EntProVer;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ComProFamilyRequestServiceImplTest {

  @Test
  void testConstructor() {
    HashSet<EntProVer> entProVerSet = new HashSet<EntProVer>();
    ComProFamilyRequestServiceImpl actualComProFamilyRequestServiceImpl = new ComProFamilyRequestServiceImpl(
        "P Type",
        entProVerSet);

    assertEquals("P Type", actualComProFamilyRequestServiceImpl.getPType());
    Set<EntProVer> setVrinIMPL = actualComProFamilyRequestServiceImpl.getSetVrinIMPL();
    assertSame(entProVerSet, setVrinIMPL);
    assertTrue(setVrinIMPL.isEmpty());
    assertSame(setVrinIMPL, entProVerSet);
  }

  @Test
  void testDipcForSe() {

    ComProFamilyRequestServiceImpl comProFamilyRequestServiceImpl = new ComProFamilyRequestServiceImpl(
        "P Type",
        new HashSet<EntProVer>());
    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    comProFamilyRequestServiceImpl
        .dipcForSe(clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            Unpooled.compositeBuffer(3)));
  }

  @Test
  void testDipcForSe2() {

    ComProFamilyRequestServiceImpl comProFamilyRequestServiceImpl = new ComProFamilyRequestServiceImpl(
        "P Type",
        new HashSet<EntProVer>());
    ClientMessageToByteEncoder clientMessageToByteEncoder = new ClientMessageToByteEncoder();
    comProFamilyRequestServiceImpl.dipcForSe(
        clientMessageToByteEncoder.new ServerMessageHandlerClientEncoderImpl(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)));
  }
}

