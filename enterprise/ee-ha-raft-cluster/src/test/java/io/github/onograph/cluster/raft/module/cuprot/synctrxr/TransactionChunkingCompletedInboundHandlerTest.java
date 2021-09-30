package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import org.junit.jupiter.api.Test;

class TransactionChunkingCompletedInboundHandlerTest {

  @Test
  void testConstructor() {

    new TransactionChunkingCompletedInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler)
        .ontstfhrseForTr((TransactionChunkingCompleted) any());
    TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler = new TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler, new RefCatchupManagerImpl());
    transactionChunkingCompletedInboundHandler.channelRead0(null,
        new TransactionChunkingCompleted(1L, CatchupStatusType.CST_OK_STREAM_COMPLETE));
    verify(catchupAnswerLimitHandler).ontstfhrseForTr((TransactionChunkingCompleted) any());
  }
}

