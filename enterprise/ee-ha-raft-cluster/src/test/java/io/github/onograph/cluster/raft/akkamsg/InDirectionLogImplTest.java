package io.github.onograph.cluster.raft.akkamsg;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceDefaultImpl;
import io.github.onograph.cluster.raft.share.calg.ConsensusIncomingMessageMonitoringProcessor;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.monitoring.Monitors;
import org.neo4j.test.FakeClockJobScheduler;

class InDirectionLogImplTest {

  @Test
  void testConstructor() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<ConsensusNodeId> _consensusMessageLogServiceRmlConsensusNodeId =
        new ConsensusMessageLogServiceDefaultImpl<ConsensusNodeId>(
            _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    new InDirectionLogImpl(_consensusMessageLogServiceRmlConsensusNodeId,
        new TestDatabaseIdRepository(),
        (InDirection<ConsensusMessageServiceMeta.ArrivingMessageManager<?>>) mock(
            InDirection.class));
  }

  @Test
  void testRethnForIn() {

    InDirection<ConsensusMessageServiceMeta.ArrivingMessageManager<?>> inDirection =
        (InDirection<ConsensusMessageServiceMeta.ArrivingMessageManager<?>>) mock(
            InDirection.class);
    doNothing().when(inDirection)
        .rethnForIn(
            (InDirection.IncomingMessageProcessor<ConsensusMessageServiceMeta.ArrivingMessageManager<?>>) any());
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<ConsensusNodeId> _consensusMessageLogServiceRmlConsensusNodeId =
        new ConsensusMessageLogServiceDefaultImpl<ConsensusNodeId>(
            _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    InDirectionLogImpl inDirectionLogImpl = new InDirectionLogImpl(
        _consensusMessageLogServiceRmlConsensusNodeId,
        new TestDatabaseIdRepository(), inDirection);
    FakeClockJobScheduler _clock1 = new FakeClockJobScheduler();
    FakeClockJobScheduler _clock2 = new FakeClockJobScheduler();
    FakeClockJobScheduler _clock3 = new FakeClockJobScheduler();
    ConsensusIncomingMessageMonitoringProcessor _fLIncomingMessageProcessorHdArrivingMessageManager = new ConsensusIncomingMessageMonitoringProcessor(
        null, null, new Monitors());

    ConsensusIncomingMessageMonitoringProcessor _fLIncomingMessageProcessorHdArrivingMessageManager1 = new ConsensusIncomingMessageMonitoringProcessor(
        _clock3, _fLIncomingMessageProcessorHdArrivingMessageManager, new Monitors());

    ConsensusIncomingMessageMonitoringProcessor _fLIncomingMessageProcessorHdArrivingMessageManager2 = new ConsensusIncomingMessageMonitoringProcessor(
        _clock2, _fLIncomingMessageProcessorHdArrivingMessageManager1, new Monitors());

    inDirectionLogImpl.rethnForIn(new ConsensusIncomingMessageMonitoringProcessor(_clock1,
        _fLIncomingMessageProcessorHdArrivingMessageManager2,
        new Monitors()));
  }
}

