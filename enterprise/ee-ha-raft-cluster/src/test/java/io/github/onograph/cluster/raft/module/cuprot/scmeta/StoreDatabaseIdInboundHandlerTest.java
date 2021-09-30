package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import org.junit.jupiter.api.Test;
import org.neo4j.storageengine.api.StoreId;

class StoreDatabaseIdInboundHandlerTest {

  @Test
  void testConstructor() {

    new StoreDatabaseIdInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler).ongsirpForSt((StoreDatabaseId) any());
    StoreDatabaseIdInboundHandler storeDatabaseIdInboundHandler = new StoreDatabaseIdInboundHandler(
        catchupAnswerLimitHandler, new RefCatchupManagerImpl());
    storeDatabaseIdInboundHandler.channelRead0(null, new StoreDatabaseId(new StoreId(1L)));
    verify(catchupAnswerLimitHandler).ongsirpForSt((StoreDatabaseId) any());
  }
}

