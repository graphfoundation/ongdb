package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.netty.buffer.PooledByteBufAllocator;
import org.junit.jupiter.api.Test;

class TransactionLogEntryElectionTermsConverterTest {

  @Test
  void testSeiitmByteBuf() {
    PooledByteBufAllocator pooledByteBufAllocator = new PooledByteBufAllocator();
    TransactionLogEntryElectionTermsConverter.seiitmByteBuf(pooledByteBufAllocator,
        new ConsensusLogEntry[]{new ConsensusLogEntry(mock(SyncableData.class), 1L)});
        /*assertEquals( "PooledByteBufAllocatorMetric(usedHeapMemory: 16777216; usedDirectMemory: 0; numHeapArenas: 24;"
                      + " numDirectArenas: 24; smallCacheSize: 256; normalCacheSize: 64; numThreadLocalCaches: 1; chunkSize:"
                      + " 16777216)", pooledByteBufAllocator.metric().toString() );*/
  }
}

