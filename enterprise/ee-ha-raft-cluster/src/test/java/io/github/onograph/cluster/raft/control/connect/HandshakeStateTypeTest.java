package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class HandshakeStateTypeTest {

  @Test
  void testFrmcdvaeOptional() {
    Optional<HandshakeStateType> actualFrmcdvaeOptionalResult = HandshakeStateType.frmcdvaeOptional(
        1);
    assertTrue(actualFrmcdvaeOptionalResult.isPresent());
    assertEquals(HandshakeStateType.IN_PROCESS, actualFrmcdvaeOptionalResult.get());
  }

  @Test
  void testFrmcdvaeOptional2() {
    Optional<HandshakeStateType> actualFrmcdvaeOptionalResult = HandshakeStateType.frmcdvaeOptional(
        0);
    assertTrue(actualFrmcdvaeOptionalResult.isPresent());
    assertEquals(HandshakeStateType.OK, actualFrmcdvaeOptionalResult.get());
  }
}

