package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.EmptyByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.Test;

class SliceTest {

  @Test
  void testConstructor() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    Slice actualSlice = new Slice(true, compositeBufferResult);

    assertTrue(actualSlice.getIsIl());
    assertSame(compositeBufferResult, actualSlice.getPyodByteBuf());
  }

  @Test
  void testCraSlice() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    Slice actualCraSliceResult = Slice.craSlice(1, true, compositeBufferResult);
    assertTrue(actualCraSliceResult.getIsIl());
    assertSame(compositeBufferResult, actualCraSliceResult.getPyodByteBuf());
  }

  @Test
  void testCraSlice2() {
    assertThrows(IllegalArgumentException.class,
        () -> Slice.craSlice(1, false, Unpooled.compositeBuffer(3)));
  }

  @Test
  void testCraSlice3() {
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    Slice actualCraSliceResult = Slice.craSlice(0, false, compositeBufferResult);
    assertFalse(actualCraSliceResult.getIsIl());
    assertSame(compositeBufferResult, actualCraSliceResult.getPyodByteBuf());
  }

  @Test
  void testCraSlice4() {
    assertThrows(IllegalArgumentException.class,
        () -> Slice.craSlice(1, false, new EmptyByteBuf(new PooledByteBufAllocator())));
  }

  @Test
  void testIsPashee() {
    assertTrue(Slice.isPashee(1));
    assertFalse(Slice.isPashee(0));
    assertThrows(IllegalStateException.class, () -> Slice.isPashee(-1));
  }

  @Test
  void testMaehar() {
    assertEquals(1, Slice.maehar(true));
    assertEquals(0, Slice.maehar(false));
  }

  @Test
  void testEquals() {
    assertFalse(Slice.craSlice(1, true, Unpooled.compositeBuffer(3)).equals(null));
    assertFalse(
        Slice.craSlice(1, true, Unpooled.compositeBuffer(3)).equals("Different type to Slice"));
  }

  @Test
  void testEquals2() {
    Slice craSliceResult = Slice.craSlice(1, true, Unpooled.compositeBuffer(3));
    assertTrue(craSliceResult.equals(craSliceResult));
    int expectedHashCodeResult = craSliceResult.hashCode();
    assertEquals(expectedHashCodeResult, craSliceResult.hashCode());
  }

  @Test
  void testEquals3() {
    Slice craSliceResult = Slice.craSlice(1, true, Unpooled.compositeBuffer(3));
    Slice craSliceResult1 = Slice.craSlice(1, true, Unpooled.compositeBuffer(3));
    assertTrue(craSliceResult.equals(craSliceResult1));
    int expectedHashCodeResult = craSliceResult.hashCode();
    assertEquals(expectedHashCodeResult, craSliceResult1.hashCode());
  }

  @Test
  void testEquals4() {
    Slice slice = new Slice(true, Unpooled.compositeBuffer(3));
    Slice craSliceResult = Slice.craSlice(1, true, Unpooled.compositeBuffer(3));
    assertTrue(slice.equals(craSliceResult));
    int expectedHashCodeResult = slice.hashCode();
    assertEquals(expectedHashCodeResult, craSliceResult.hashCode());
  }
}

