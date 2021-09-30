package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;

class ServerHandshakeCompletedActionTest {

  @Test
  void testFinishedConstructor() {
    SocketAddress socketAddress = (new ServerHandshakeCompletedAction.Finished(
        new SocketAddress("localhost"))).adeidSocketAddress;
    assertEquals("localhost", socketAddress.getHostname());
    assertEquals("localhost", socketAddress.toString());
    assertFalse(socketAddress.isIPv6());
    assertEquals(-1, socketAddress.getPort());
  }

  @Test
  void testStartedConstructor() {
    SocketAddress _avrieSocketAddress = new SocketAddress("localhost");
    ServerHandshakeCompletedAction.Started actualStarted = new ServerHandshakeCompletedAction.Started(
        _avrieSocketAddress, new ComProFamilyWrapper(new ArrayList<MutableComProFamily>(), null));

    SocketAddress socketAddress = actualStarted.adeidSocketAddress;
    assertEquals("localhost", socketAddress.toString());
    assertNull(actualStarted.prtostkComProFamilyWrapper.getPaApplicationComProFamily());
    assertFalse(socketAddress.isIPv6());
    assertEquals(-1, socketAddress.getPort());
    assertEquals("localhost", socketAddress.getHostname());
  }
}

