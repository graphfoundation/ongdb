package io.github.onograph.cluster.raft.module.cuprot.current.core;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AuthMetaInboundHandlerTest {

  @Test
  void testConstructor() {

    new AuthMetaInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() throws Exception {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler).ongmarseForAu((AuthMeta) any());
    AuthMetaInboundHandler authMetaInboundHandler = new AuthMetaInboundHandler(
        catchupAnswerLimitHandler,
        new RefCatchupManagerImpl());
    authMetaInboundHandler.channelRead0(null, new AuthMeta(new ArrayList<String>()));
    verify(catchupAnswerLimitHandler).ongmarseForAu((AuthMeta) any());
  }
}

