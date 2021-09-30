package io.github.onograph.cluster.raft.module.cuprot.current.info;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import org.junit.jupiter.api.Test;

class MetaInboundHandlerTest {

  @Test
  void testConstructor() {

    new MetaInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() throws Exception {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler).oninForMe((Meta) any());
    MetaInboundHandler metaInboundHandler = new MetaInboundHandler(catchupAnswerLimitHandler,
        new RefCatchupManagerImpl());
    metaInboundHandler.channelRead0(null, Meta.craMeta(1L, " str Fr"));
    verify(catchupAnswerLimitHandler).oninForMe((Meta) any());
  }
}

