package io.github.onograph.cluster.raft.module.cuprot.current.gdbi;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;

class AllGdbIdsInboundHandlerTest {

  @Test
  void testConstructor() {

    new AllGdbIdsInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() throws Exception {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler).ongadteiresForAl((AllGdbIds) any());
    AllGdbIdsInboundHandler allGdbIdsInboundHandler = new AllGdbIdsInboundHandler(
        catchupAnswerLimitHandler,
        new RefCatchupManagerImpl());
    allGdbIdsInboundHandler.channelRead0(null, new AllGdbIds(new HashSet<NamedDatabaseId>()));
    verify(catchupAnswerLimitHandler).ongadteiresForAl((AllGdbIds) any());
  }
}

