package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;

class BasicBoolSerializationHandlerTest {

  @Test
  void testIsUnahForRe() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    assertTrue(BasicBoolSerializationHandler.isUnahForRe(inMemoryClosableChannel));
  }

  @Test
  void testIsUnahForRe2() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putShort((short) 0);
    assertFalse(BasicBoolSerializationHandler.isUnahForRe(inMemoryClosableChannel));
  }

  @Test
  void testMaslForWr() throws IOException {

    BasicBoolSerializationHandler.maslForWr(true, new InMemoryClosableChannel());
  }

  @Test
  void testMaslForWr2() throws IOException {

    BasicBoolSerializationHandler.maslForWr(false, new InMemoryClosableChannel());
  }

  @Test
  void testMaslForWr3() throws IOException {

    BasicBoolSerializationHandler.maslForWr(true,
        new InMemoryClosableChannel("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), false, true));
  }
}

