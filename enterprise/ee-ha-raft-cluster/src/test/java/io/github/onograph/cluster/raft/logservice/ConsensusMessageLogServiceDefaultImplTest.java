package io.github.onograph.cluster.raft.logservice;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyBoolean;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.test.FakeClockJobScheduler;

class ConsensusMessageLogServiceDefaultImplTest {

  @Test
  void testConstructor() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    new ConsensusMessageLogServiceDefaultImpl<Object>(_clock,
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testLoiodForNaMECo() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<Object> consensusMessageLogServiceDefaultImpl = new ConsensusMessageLogServiceDefaultImpl<Object>(
        _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    ConsensusMessageServiceMeta.LogClipRequestMessage m = new ConsensusMessageServiceMeta.LogClipRequestMessage(
        1L);
    consensusMessageLogServiceDefaultImpl.loiodForNaMECo(m, " mme Rmt",
        TestDatabaseIdRepository.randomNamedDatabaseId());
  }

  @Test
  void testLoiodForNaMECo2() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<Object> consensusMessageLogServiceDefaultImpl = new ConsensusMessageLogServiceDefaultImpl<Object>(
        _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    consensusMessageLogServiceDefaultImpl.loiodForNaMECo(null, " mme Rmt",
        TestDatabaseIdRepository.randomNamedDatabaseId());
  }

  @Test
  void testLoiodForNaMECo3() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<Object> consensusMessageLogServiceDefaultImpl = new ConsensusMessageLogServiceDefaultImpl<Object>(
        _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    consensusMessageLogServiceDefaultImpl.loiodForNaMECo(
        new ConsensusMessageServiceMeta.LogClipRequestMessage(1L),
        " mme Rmt", null);
  }

  @Test
  void testLoobnForNaMECo() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<Object> consensusMessageLogServiceDefaultImpl = new ConsensusMessageLogServiceDefaultImpl<Object>(
        _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    ConsensusMessageServiceMeta.LogClipRequestMessage m = new ConsensusMessageServiceMeta.LogClipRequestMessage(
        1L);
    consensusMessageLogServiceDefaultImpl.loobnForNaMECo(m, " mme Rmt",
        TestDatabaseIdRepository.randomNamedDatabaseId());
  }

  @Test
  void testLoobnForNaMECo2() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<Object> consensusMessageLogServiceDefaultImpl = new ConsensusMessageLogServiceDefaultImpl<Object>(
        _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    consensusMessageLogServiceDefaultImpl.loobnForNaMECo(null, " mme Rmt",
        TestDatabaseIdRepository.randomNamedDatabaseId());
  }

  @Test
  void testLoobnForNaMECo3() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    ConsensusMessageLogServiceDefaultImpl<Object> consensusMessageLogServiceDefaultImpl = new ConsensusMessageLogServiceDefaultImpl<Object>(
        _clock, new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    consensusMessageLogServiceDefaultImpl.loobnForNaMECo(
        new ConsensusMessageServiceMeta.LogClipRequestMessage(1L),
        " mme Rmt", null);
  }

  @Test
  void testOpprwrPrintWriter() throws IOException {

    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.openAsOutputStream((Path) any(), anyBoolean())).thenReturn(
        new ByteArrayOutputStream(3));
    doNothing().when(fileSystemAbstraction).mkdirs((Path) any());
    (new ConsensusMessageLogServiceDefaultImpl<Object>(new FakeClockJobScheduler(),
        fileSystemAbstraction,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).opprwrPrintWriter();
  }

  @Test
  void testStart() throws IOException {

    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.openAsOutputStream((Path) any(), anyBoolean())).thenReturn(
        new ByteArrayOutputStream(3));
    doNothing().when(fileSystemAbstraction).mkdirs((Path) any());
    (new ConsensusMessageLogServiceDefaultImpl<Object>(new FakeClockJobScheduler(),
        fileSystemAbstraction,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).start();
  }

  @Test
  void testStop() {

    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    (new ConsensusMessageLogServiceDefaultImpl<Object>(_clock,
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).stop();
  }
}

