package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertSame;

import io.github.onograph.config.EntProVer;
import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.Test;

class HandshakeClientMessageProcessorDefaultImplTest {

  @Test
  void testConstructor() {
    CompletableFuture<ComProFamilyWrapper> completableFuture = new CompletableFuture<ComProFamilyWrapper>();
    assertSame(completableFuture,
        (new HandshakeClientMessageProcessorDefaultImpl(completableFuture))
            .getCompletableFuturePfComProFamilyWrapper());
  }

  @Test
  void testHadForCh() {

    HandshakeClientMessageProcessorDefaultImpl handshakeClientMessageProcessorDefaultImpl = new HandshakeClientMessageProcessorDefaultImpl(
        new CompletableFuture<ComProFamilyWrapper>());
    handshakeClientMessageProcessorDefaultImpl.hadForCh(
        new ChangeComProReplyImpl(HandshakeStateType.OK));
  }

  @Test
  void testHadForCh2() {

    HandshakeClientMessageProcessorDefaultImpl handshakeClientMessageProcessorDefaultImpl = new HandshakeClientMessageProcessorDefaultImpl(
        new CompletableFuture<ComProFamilyWrapper>());
    handshakeClientMessageProcessorDefaultImpl.hadForCh(new ChangeComProReplyImpl(null));
  }

  @Test
  void testHadForCh3() {

    HandshakeClientMessageProcessorDefaultImpl handshakeClientMessageProcessorDefaultImpl = new HandshakeClientMessageProcessorDefaultImpl(
        new CompletableFuture<ComProFamilyWrapper>());
    handshakeClientMessageProcessorDefaultImpl
        .hadForCh(new ComProFamilyReplyServiceImpl(HandshakeStateType.IN_PROCESS, "P Type",
            new EntProVer(1, 1)));
  }
}

