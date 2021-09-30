package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.netty.buffer.PooledByteBufAllocator;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;

class ChunkedInputSliceImplTest {

  @Test
  void testConstructor() {
    assertFalse(
        (new ChunkedInputSliceImpl(1,
            new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3,
                " str Pr"))).isEndOfInput());
  }

  @Test
  void testClose() throws Exception {
    ChunkedInputSliceImpl chunkedInputSliceImpl = new ChunkedInputSliceImpl(1,
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"),
                "test.txt"), 3, " str Pr"));
    chunkedInputSliceImpl.close();
    assertFalse(chunkedInputSliceImpl.isEndOfInput());
  }

  @Test
  void testEquals() {
    assertFalse(
        (new ChunkedInputSliceImpl(1,
            new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3,
                " str Pr"))).equals(null));
    assertFalse((new ChunkedInputSliceImpl(1,
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr")))
        .equals("Different type to ChunkedInputSliceImpl"));
  }

  @Test
  void testEquals2() {
    ChunkedInputSliceImpl chunkedInputSliceImpl = new ChunkedInputSliceImpl(1,
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"),
                "test.txt"), 3, " str Pr"));
    assertTrue(chunkedInputSliceImpl.equals(chunkedInputSliceImpl));
    int expectedHashCodeResult = chunkedInputSliceImpl.hashCode();
    assertEquals(expectedHashCodeResult, chunkedInputSliceImpl.hashCode());
  }

  @Test
  void testEquals3() {
    ChunkedInputSliceImpl chunkedInputSliceImpl = new ChunkedInputSliceImpl(1,
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"),
                "test.txt"), 3, " str Pr"));
    ChunkedInputSliceImpl chunkedInputSliceImpl1 = new ChunkedInputSliceImpl(1,
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"),
                "test.txt"), 3, " str Pr"));

    assertTrue(chunkedInputSliceImpl.equals(chunkedInputSliceImpl1));
    int expectedHashCodeResult = chunkedInputSliceImpl.hashCode();
    assertEquals(expectedHashCodeResult, chunkedInputSliceImpl1.hashCode());
  }

  @Test
  void testEquals4() {
    ChunkedInputSliceImpl chunkedInputSliceImpl = new ChunkedInputSliceImpl(1,
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("Key"), "test.txt"),
            3, " str Pr"));
    assertFalse(chunkedInputSliceImpl.equals(
        new ChunkedInputSliceImpl(1,
            new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr"))));
  }

  @Test
  void testEquals5() {
    ChunkedInputSliceImpl chunkedInputSliceImpl = new ChunkedInputSliceImpl(1,
        mock(StoreElementFacade.class));
    assertFalse(chunkedInputSliceImpl.equals(
        new ChunkedInputSliceImpl(1,
            new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr"))));
  }

  @Test
  void testIsEndOfInput() {
    assertFalse(
        (new ChunkedInputSliceImpl(1,
            new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3,
                " str Pr"))).isEndOfInput());
  }

  @Test
  void testLength() {
    assertEquals(StoreSyncCompleted.FIN_CPXR_TXS_UNVLL,
        (new ChunkedInputSliceImpl(1,
            new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3,
                " str Pr"))).length());
  }

  @Test
  void testProgress() {
    assertEquals(0L,
        (new ChunkedInputSliceImpl(1,
            new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3,
                " str Pr"))).progress());
  }

  //@Test
  void testReadChunk() throws Exception {
    ChunkedInputSliceImpl chunkedInputSliceImpl = new ChunkedInputSliceImpl(0,
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"),
                "test.txt"), 3, " str Pr"));
    PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
    Slice actualReadChunkResult = chunkedInputSliceImpl.readChunk(pooledByteBufAllocator);
    assertTrue(actualReadChunkResult.getIsIl());
    assertTrue(actualReadChunkResult.getPyodByteBuf() instanceof io.netty.buffer.EmptyByteBuf);
        /*assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 0; usedDirectMemory: 16777216; numHeapArenas: 24;"
                      + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:"
                      + " 16777216)", pooledByteBufAllocator.metric().toString() );*/
  }

  @Test
  void testReadChunk2() throws Exception {
    ChunkedInputSliceImpl chunkedInputSliceImpl = new ChunkedInputSliceImpl(1,
        new StoreElementFacade(new EphemeralFileSystemAbstraction(),
            Paths.get("", "test.txt"), 3, " str Pr"));
    PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
    Slice actualReadChunkResult = chunkedInputSliceImpl.readChunk(pooledByteBufAllocator);
    assertTrue(actualReadChunkResult.getIsIl());
    assertTrue(actualReadChunkResult.getPyodByteBuf() instanceof io.netty.buffer.EmptyByteBuf);
    //assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 0; usedDirectMemory: 16777216; numHeapArenas: 24;" + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:" + " 16777216)", pooledByteBufAllocator.metric().toString() );
  }

  //@Test
  void testReadChunk3() throws Exception {
    ChunkedInputSliceImpl chunkedInputSliceImpl = new ChunkedInputSliceImpl(0,
        new StoreElementFacade(
            new DefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr"));
    PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
    Slice actualReadChunkResult = chunkedInputSliceImpl.readChunk(pooledByteBufAllocator);
    assertTrue(actualReadChunkResult.getIsIl());
    assertTrue(actualReadChunkResult.getPyodByteBuf() instanceof io.netty.buffer.EmptyByteBuf);
        /*assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 0; usedDirectMemory: 16777216; numHeapArenas: 24;"
                      + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:"
                      + " 16777216)", pooledByteBufAllocator.metric().toString() );*/
  }
}

