package io.github.onograph.cluster.raft.akkamsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

class WritableChecksumChannelDefaultImplTest {

  @Test
  void testConstructor() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    assertThrows(IllegalArgumentException.class,
        () -> new WritableChecksumChannelDefaultImpl(_byteBufAllocator, 1,
            new LinkedList<ByteBuf>()));
  }

  @Test
  void testConstructor2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    LinkedList<ByteBuf> byteBufList = new LinkedList<ByteBuf>();
    new WritableChecksumChannelDefaultImpl(_byteBufAllocator, 493, byteBufList);

    assertTrue(byteBufList.isEmpty());
  }

  @Test
  void testConstructor3() throws UnsupportedEncodingException {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    byte[] _dmdByteArray = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    assertThrows(IllegalArgumentException.class,
        () -> new WritableChecksumChannelDefaultImpl(_byteBufAllocator, _dmdByteArray, 1,
            new LinkedList<ByteBuf>()));
  }

  @Test
  void testConstructor4() throws UnsupportedEncodingException {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    byte[] bytes = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LinkedList<ByteBuf> byteBufList = new LinkedList<ByteBuf>();
    new WritableChecksumChannelDefaultImpl(_byteBufAllocator, bytes, 493, byteBufList);

    assertEquals(24, bytes.length);
    assertTrue(byteBufList.isEmpty());
  }

  @Test
  void testClose() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.close();
    assertTrue(writableChecksumChannelDefaultImpl.getIsCi());
  }

  @Test
  void testClose2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putInt(42);
    writableChecksumChannelDefaultImpl.close();
    assertTrue(writableChecksumChannelDefaultImpl.getIsCi());
  }

  @Test
  void testCurtid() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    assertEquals(0, (new WritableChecksumChannelDefaultImpl(_byteBufAllocator, 8,
        new LinkedList<ByteBuf>())).curtid());
  }

  @Test
  void testCurtid2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putInt(42);
    assertEquals(4, writableChecksumChannelDefaultImpl.curtid());
  }

  @Test
  void testFlsWritableChecksumChannel() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.flsWritableChecksumChannel());
  }

  @Test
  void testFlsWritableChecksumChannel2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putInt(42);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.flsWritableChecksumChannel());
  }

  @Test
  void testPut() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.put((byte) 'A'));
  }

  @Test
  void testPut2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.put((byte) 'A'));
  }

  @Test
  void testPut3() throws UnsupportedEncodingException {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPut4() throws UnsupportedEncodingException {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPut5() throws UnsupportedEncodingException {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.put("AﾀAAAAAA".getBytes("UTF-8"), 3);
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.put("AAAAAAAA".getBytes("UTF-8"), 3));
  }

  @Test
  void testPutChecksum() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    assertEquals(0,
        (new WritableChecksumChannelDefaultImpl(_byteBufAllocator, 8,
            new LinkedList<ByteBuf>())).putChecksum());
  }

  @Test
  void testPutDouble() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putDouble(10.0));
  }

  @Test
  void testPutDouble2() {
    LinkedList<ByteBuf> byteBufList = new LinkedList<ByteBuf>();
    byteBufList.add(Unpooled.compositeBuffer(10));
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        new PooledByteBufAllocator(), 8, byteBufList);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putDouble(10.0));
  }

  @Test
  void testPutDouble3() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putInt(42);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putDouble(10.0));
  }

  @Test
  void testPutFloat() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putFloat(10.0f));
  }

  @Test
  void testPutFloat2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putFloat(10.0f));
  }

  @Test
  void testPutFloat3() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.put(
        new byte[]{'A', 'A', Byte.MAX_VALUE, 'A', 'A', 'A', 'A', 'A'}, 3);
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putFloat(10.0f));
  }

  @Test
  void testPutInt() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertSame(writableChecksumChannelDefaultImpl, writableChecksumChannelDefaultImpl.putInt(42));
  }

  @Test
  void testPutInt2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl, writableChecksumChannelDefaultImpl.putInt(42));
  }

  @Test
  void testPutInt3() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl, writableChecksumChannelDefaultImpl.putInt(-1));
  }

  @Test
  void testPutLong() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertSame(writableChecksumChannelDefaultImpl, writableChecksumChannelDefaultImpl.putLong(42L));
  }

  @Test
  void testPutLong2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putInt(42);
    assertSame(writableChecksumChannelDefaultImpl, writableChecksumChannelDefaultImpl.putLong(42L));
  }

  @Test
  void testPutLong3() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.put(
        new byte[]{'A', Byte.MAX_VALUE, 'A', 'A', 'A', 'A', 'A', 'A'}, 3);
    assertSame(writableChecksumChannelDefaultImpl, writableChecksumChannelDefaultImpl.putLong(42L));
  }

  @Test
  void testPutShort() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putShort((short) 1));
  }

  @Test
  void testPutShort2() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putShort((short) 1));
  }

  @Test
  void testPutShort3() throws UnsupportedEncodingException {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.put("AAAAXAAA".getBytes("UTF-8"), 3);
    writableChecksumChannelDefaultImpl.putDouble(10.0);
    assertSame(writableChecksumChannelDefaultImpl,
        writableChecksumChannelDefaultImpl.putShort((short) 1));
  }

  @Test
  void testSemat() throws UnsupportedEncodingException {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    assertThrows(IllegalArgumentException.class,
        () -> writableChecksumChannelDefaultImpl.semat("AAAAAAAA".getBytes("UTF-8")));
  }

  @Test
  void testSemat2() {

    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();
    (new WritableChecksumChannelDefaultImpl(_byteBufAllocator, 8, new LinkedList<ByteBuf>())).semat(
        new byte[]{});
  }

  @Test
  void testSemat3() {
    PooledByteBufAllocator _byteBufAllocator = new PooledByteBufAllocator();

    WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl = new WritableChecksumChannelDefaultImpl(
        _byteBufAllocator, 8, new LinkedList<ByteBuf>());
    writableChecksumChannelDefaultImpl.putInt(42);
    writableChecksumChannelDefaultImpl.semat(new byte[]{});
    assertFalse(writableChecksumChannelDefaultImpl.getIsCi());
  }
}

