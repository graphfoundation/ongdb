package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;

class SocketAddressControllerTest {

  @Test
  void testIsTraueForSo() {
    SocketAddressController socketAddressController = new SocketAddressController();
    assertTrue(socketAddressController.isTraueForSo(new SocketAddress("localhost")));
    assertEquals(1, socketAddressController.setOciadeSocketAddress.size());
  }

  @Test
  void testIsTraueForSo2() {
    SocketAddressController socketAddressController = new SocketAddressController();
    assertTrue(socketAddressController.isTraueForSo(new SocketAddress("::")));
    assertEquals(1, socketAddressController.setOciadeSocketAddress.size());
  }

  @Test
  void testReeeForSo() {
    SocketAddressController socketAddressController = new SocketAddressController();
    assertThrows(UnsupportedOperationException.class,
        () -> socketAddressController.reeeForSo(new SocketAddress("localhost")));
  }

  @Test
  void testReeeForSo2() {
    SocketAddressController socketAddressController = new SocketAddressController();
    assertThrows(UnsupportedOperationException.class,
        () -> socketAddressController.reeeForSo(new SocketAddress("::")));
  }
}

