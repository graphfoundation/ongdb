package io.github.onograph.cluster.raft.akkamsg;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.test.FakeClockJobScheduler;

class OutDirectionLogImplTest {

  @Test
  void testConstructor() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<Object> _consensusMessageLogServiceLmrMEMBER = new ConsensusMessageLogServiceDefaultImpl<Object>(
        _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    new OutDirectionLogImpl<Object, ConsensusMessageServiceMeta.AbstractConsensusMessage>(
        _consensusMessageLogServiceLmrMEMBER, TestDatabaseIdRepository.randomNamedDatabaseId(),
        (OutDirection<Object, ConsensusMessageServiceMeta.AbstractConsensusMessage>) mock(
            OutDirection.class));
  }

  @Test
  void testSenForMEME() {
    OutDirection<Object, ConsensusMessageServiceMeta.AbstractConsensusMessage> outDirection =
        (OutDirection<Object, ConsensusMessageServiceMeta.AbstractConsensusMessage>) mock(
            OutDirection.class);
    doNothing().when(outDirection)
        .senForMEME((ConsensusMessageServiceMeta.AbstractConsensusMessage) any(), (Object) any());
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<Object> _consensusMessageLogServiceLmrMEMBER = new ConsensusMessageLogServiceDefaultImpl<Object>(
        _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    OutDirectionLogImpl<Object, ConsensusMessageServiceMeta.AbstractConsensusMessage> outDirectionLogImpl =
        new OutDirectionLogImpl<Object, ConsensusMessageServiceMeta.AbstractConsensusMessage>(
            _consensusMessageLogServiceLmrMEMBER, TestDatabaseIdRepository.randomNamedDatabaseId(),
            outDirection);
    outDirectionLogImpl.senForMEME(true, " mme T",
        new ConsensusMessageServiceMeta.LogClipRequestMessage(1L));
    verify(outDirection).senForMEME((ConsensusMessageServiceMeta.AbstractConsensusMessage) any(),
        (Object) any());
  }
}

