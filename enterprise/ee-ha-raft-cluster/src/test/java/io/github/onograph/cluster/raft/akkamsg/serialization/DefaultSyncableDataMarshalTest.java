package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.storageengine.api.CommandReaderFactory;

class DefaultSyncableDataMarshalTest {

  @Test
  void testConstructor() {
    VersionAwareLogEntryReader versionAwareLogEntryReader = new VersionAwareLogEntryReader(
        mock(CommandReaderFactory.class));
    LogEntryReader logEntryReader = (new DefaultSyncableDataMarshal(
        versionAwareLogEntryReader)).logEntryReader;
    assertTrue(logEntryReader instanceof VersionAwareLogEntryReader);
    assertSame(logEntryReader, versionAwareLogEntryReader);
  }

  @Test
  void testGemslSyncableDataProcessor() {

    DefaultSyncableDataMarshal defaultSyncableDataMarshal = new DefaultSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));
    defaultSyncableDataMarshal.gemslSyncableDataProcessor(new InMemoryClosableChannel());
  }

  @Test
  void testUnahDataManagerFactory() throws IOException, EndOfStreamException {
    DefaultSyncableDataMarshal defaultSyncableDataMarshal = new DefaultSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));
    assertTrue(
        defaultSyncableDataMarshal.unahDataManagerFactory(
                new ReadablePositionAwareChecksumChannelManager(), (byte) 5)
            .getIsCi());
  }

  @Test
  void testUnahDataManagerFactory2() throws IOException, EndOfStreamException {
    DefaultSyncableDataMarshal defaultSyncableDataMarshal = new DefaultSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));
    assertTrue(
        defaultSyncableDataMarshal.unahDataManagerFactory(new InMemoryClosableChannel(), (byte) 5)
            .getIsCi());
  }

  @Test
  void testUnahDataManagerFactory3() throws IOException, EndOfStreamException {
    DefaultSyncableDataMarshal defaultSyncableDataMarshal = new DefaultSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    assertTrue(defaultSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) 1)
        .getIsCi());
  }

  @Test
  void testUnahDataManagerFactory4() throws IOException, EndOfStreamException {
    DefaultSyncableDataMarshal defaultSyncableDataMarshal = new DefaultSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.put((byte) 'A');
    assertTrue(defaultSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) 5)
        .getIsCi());
  }
}

