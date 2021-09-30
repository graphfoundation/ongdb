package io.github.onograph.cluster.raft.control.connect;

import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;

class HandshakeLoggerTest {

  @Test
  void testConstructor() {

    (new HandshakeLogger(new AssertableLogProvider(true))).loggeae(true);
  }

  @Test
  void testConstructor2() {

    new HandshakeLogger(new AssertableLogProvider(true));
  }

  @Test
  void testConstructor3() {

    new HandshakeLogger(new Log4jLogProvider(new ByteArrayOutputStream(3)));
  }
}

