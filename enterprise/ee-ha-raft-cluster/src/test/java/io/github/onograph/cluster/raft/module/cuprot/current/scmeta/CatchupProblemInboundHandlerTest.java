package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import org.junit.jupiter.api.Test;

class CatchupProblemInboundHandlerTest {

  @Test
  void testConstructor() {

    new CatchupProblemInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler).onccerresForCa((CatchupProblem) any());
    CatchupProblemInboundHandler catchupProblemInboundHandler = new CatchupProblemInboundHandler(
        catchupAnswerLimitHandler, new RefCatchupManagerImpl());
    catchupProblemInboundHandler.channelRead0(null,
        new CatchupProblem("foo", CatchupStatusType.CST_STORE_NOT_SAME_ERR));
    verify(catchupAnswerLimitHandler).onccerresForCa((CatchupProblem) any());
  }
}

