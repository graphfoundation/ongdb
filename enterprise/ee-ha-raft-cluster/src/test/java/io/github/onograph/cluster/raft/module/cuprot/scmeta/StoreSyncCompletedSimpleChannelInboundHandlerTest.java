package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import org.junit.jupiter.api.Test;

class StoreSyncCompletedSimpleChannelInboundHandlerTest {

  @Test
  void testConstructor() {

    new StoreSyncCompletedSimpleChannelInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testConstructor2() {

    CatchupAnswerLimitHandler _catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    new StoreSyncCompletedSimpleChannelInboundHandler(_catchupAnswerLimitHandler,
        new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler).onfesaceForSt((StoreSyncCompleted) any());
    StoreSyncCompletedSimpleChannelInboundHandler storeSyncCompletedSimpleChannelInboundHandler = new StoreSyncCompletedSimpleChannelInboundHandler(
        catchupAnswerLimitHandler, new RefCatchupManagerImpl());
    storeSyncCompletedSimpleChannelInboundHandler.channelRead0(null,
        new StoreSyncCompleted(1L, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK));
    verify(catchupAnswerLimitHandler).onfesaceForSt((StoreSyncCompleted) any());
  }
}

