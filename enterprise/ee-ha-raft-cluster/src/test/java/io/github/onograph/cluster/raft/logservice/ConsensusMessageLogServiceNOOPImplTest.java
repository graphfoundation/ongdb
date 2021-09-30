package io.github.onograph.cluster.raft.logservice;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class ConsensusMessageLogServiceNOOPImplTest {

  @Test
  void testConstructor() {

    ConsensusMessageLogServiceNOOPImpl<Object> actualConsensusMessageLogServiceNOOPImpl = new ConsensusMessageLogServiceNOOPImpl<Object>();
    ConsensusMessageServiceMeta.LogClipRequestMessage m = new ConsensusMessageServiceMeta.LogClipRequestMessage(
        1L);
    actualConsensusMessageLogServiceNOOPImpl.loiodForNaMECo(m, " mme Rmt",
        TestDatabaseIdRepository.randomNamedDatabaseId());
    ConsensusMessageServiceMeta.LogClipRequestMessage m1 = new ConsensusMessageServiceMeta.LogClipRequestMessage(
        1L);
    actualConsensusMessageLogServiceNOOPImpl.loobnForNaMECo(m1, " mme Rmt",
        TestDatabaseIdRepository.randomNamedDatabaseId());
  }
}

