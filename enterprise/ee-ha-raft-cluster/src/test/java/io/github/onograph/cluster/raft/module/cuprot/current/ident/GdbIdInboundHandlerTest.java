package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class GdbIdInboundHandlerTest {

  @Test
  void testConstructor() {

    new GdbIdInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler).ongdairnForGd((GdbId) any());
    GdbIdInboundHandler gdbIdInboundHandler = new GdbIdInboundHandler(catchupAnswerLimitHandler,
        new RefCatchupManagerImpl());
    gdbIdInboundHandler.channelRead0(null, new GdbId(TestDatabaseIdRepository.randomDatabaseId()));
    verify(catchupAnswerLimitHandler).ongdairnForGd((GdbId) any());
  }
}

