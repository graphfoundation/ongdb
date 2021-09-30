package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class SliceMetaSimpleChannelInboundHandlerTest {

  @Test
  void testConstructor() {

    BufferingLog _log = new BufferingLog();
    new SliceMetaSimpleChannelInboundHandler(null, _log, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    doNothing().when(catchupAnswerLimitHandler).onfihdForSl((SliceMeta) any());
    BufferingLog _log = new BufferingLog();
    SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler = new SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler, _log, new RefCatchupManagerImpl());
    sliceMetaSimpleChannelInboundHandler.channelRead0(null, new SliceMeta(" str Nf"));
    verify(catchupAnswerLimitHandler).onfihdForSl((SliceMeta) any());
  }
}

