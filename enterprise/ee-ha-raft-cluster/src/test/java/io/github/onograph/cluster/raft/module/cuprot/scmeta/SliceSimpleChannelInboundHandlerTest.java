package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler;
import io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class SliceSimpleChannelInboundHandlerTest {

  @Test
  void testConstructor() {

    new SliceSimpleChannelInboundHandler(null, new RefCatchupManagerImpl());
  }

  @Test
  void testChannelRead0() throws Exception {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    when(catchupAnswerLimitHandler.isOnficttForSl((Slice) any())).thenReturn(true);
    SliceSimpleChannelInboundHandler sliceSimpleChannelInboundHandler = new SliceSimpleChannelInboundHandler(
        catchupAnswerLimitHandler, new RefCatchupManagerImpl());
    Slice craSliceResult = Slice.craSlice(0, true, Unpooled.compositeBuffer(3));
    sliceSimpleChannelInboundHandler.channelRead0(null, craSliceResult);
    verify(catchupAnswerLimitHandler).isOnficttForSl((Slice) any());
    assertEquals(0, craSliceResult.getPyodByteBuf().refCnt());
  }

  @Test
  void testChannelRead02() throws Exception {
    CatchupAnswerLimitHandler catchupAnswerLimitHandler = mock(CatchupAnswerLimitHandler.class);
    when(catchupAnswerLimitHandler.isOnficttForSl((Slice) any())).thenReturn(false);
    SliceSimpleChannelInboundHandler sliceSimpleChannelInboundHandler = new SliceSimpleChannelInboundHandler(
        catchupAnswerLimitHandler, new RefCatchupManagerImpl());
    Slice craSliceResult = Slice.craSlice(0, true, Unpooled.compositeBuffer(3));
    sliceSimpleChannelInboundHandler.channelRead0(null, craSliceResult);
    verify(catchupAnswerLimitHandler).isOnficttForSl((Slice) any());
    assertEquals(0, craSliceResult.getPyodByteBuf().refCnt());
  }
}

