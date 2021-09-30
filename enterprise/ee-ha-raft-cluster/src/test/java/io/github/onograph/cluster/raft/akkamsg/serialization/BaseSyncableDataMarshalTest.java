package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper;
import io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.AskState;
import io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync;
import io.github.onograph.cluster.raft.share.sync.ClusterSessionBean;
import io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction;
import io.github.onograph.cluster.raft.share.sync.SessionSeqActionId;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StorageCommand;

class BaseSyncableDataMarshalTest {

  @Test
  void testConstructor() {
    VersionAwareLogEntryReader versionAwareLogEntryReader = new VersionAwareLogEntryReader(
        mock(CommandReaderFactory.class));
    LogEntryReader logEntryReader = (new BaseSyncableDataMarshal(
        versionAwareLogEntryReader)).logEntryReader;
    assertTrue(logEntryReader instanceof VersionAwareLogEntryReader);
    assertSame(logEntryReader, versionAwareLogEntryReader);
  }

  @Test
  void testGemslSyncableDataProcessor() {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));
    assertTrue(((BaseSyncableDataMarshal.Processor) baseSyncableDataMarshal
        .gemslSyncableDataProcessor(
            new InMemoryClosableChannel())).writableChannel instanceof InMemoryClosableChannel);
  }

  @Test
  void testMarshal() throws IOException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));
    SyncableData syncableData = mock(SyncableData.class);
    doNothing().when(syncableData).dipcForSy((SyncableDataProcessor) any());
    baseSyncableDataMarshal.marshal(syncableData, new InMemoryClosableChannel());
    verify(syncableData).dipcForSy((SyncableDataProcessor) any());
  }

  @Test
  void testProcessorConstructor() throws IOException {
    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    WritableChannel writableChannel = (new BaseSyncableDataMarshal.Processor(
        inMemoryClosableChannel)).writableChannel;
    assertTrue(writableChannel instanceof InMemoryClosableChannel);
    assertEquals(1000, ((InMemoryClosableChannel) writableChannel).capacity());
    LogPosition currentPosition = ((InMemoryClosableChannel) writableChannel).getCurrentPosition();
    assertEquals(0L, currentPosition.getByteOffset());
    assertEquals("LogPosition{logVersion=0, byteOffset=0}", currentPosition.toString());
    assertEquals(0L, currentPosition.getLogVersion());
    assertSame(writableChannel, inMemoryClosableChannel);
  }

  @Test
  void testProcessorProcess() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel());
    processor.process(new LeaderNodeDataSDWrapper());
  }

  @Test
  void testProcessorProcess10() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel(true));
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    NamedDatabaseId _namedDatabaseId1 = TestDatabaseIdRepository.randomNamedDatabaseId();
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    processor.process(new SyncableLeasableCoreNodeData(_namedDatabaseId,
        new LeasableMeta(1L,
            new SyncableLeasableCoreNodeData(_namedDatabaseId1, new LeasableMeta(1L,
                new SyncableLeasableCoreNodeData(
                    _databaseId,
                    123,
                    new ConsensusNodeId(
                        UUID.randomUUID())))))));
  }

  @Test
  void testProcessorProcess11() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel());
    PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    processor.process(
        new AbstractTransactionSync(_tPhysicalTransactionRepresentation,
            TestDatabaseIdRepository.randomDatabaseId()));
  }

  @Test
  void testProcessorProcess12() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
    PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    processor.process(
        new AbstractTransactionSync(_tPhysicalTransactionRepresentation,
            TestDatabaseIdRepository.randomDatabaseId()));
  }

  @Test
  void testProcessorProcess13() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel());
    SyncableData btval = mock(SyncableData.class);
    SessionSeqActionId _ioSessionSeqActionId = new SessionSeqActionId(1L, 1L);

    UUID _isUUID = UUID.randomUUID();
    processor.process(new DataSyncClusterAction(btval, _ioSessionSeqActionId,
        new ClusterSessionBean(_isUUID, new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcessorProcess14() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
    SyncableData btval = mock(SyncableData.class);
    SessionSeqActionId _ioSessionSeqActionId = new SessionSeqActionId(1L, 1L);

    UUID _isUUID = UUID.randomUUID();
    processor.process(new DataSyncClusterAction(btval, _ioSessionSeqActionId,
        new ClusterSessionBean(_isUUID, new ConsensusNodeId(UUID.randomUUID()))));
  }

  @Test
  void testProcessorProcess2() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"), false, true));
    processor.process(new LeaderNodeDataSDWrapper());
  }

  @Test
  void testProcessorProcess3() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel());
    processor.process(new ConsensusNodeServerMemberIdWrapper(new HashSet<ConsensusNodeId>()));
  }

  @Test
  void testProcessorProcess4() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
    processor.process(new ConsensusNodeServerMemberIdWrapper(new HashSet<ConsensusNodeId>()));
  }

  @Test
  void testProcessorProcess5() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel());
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    ConsensusNodeId _imConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    processor.process(new AskState(_databaseId, _imConsensusNodeId, UUID.randomUUID()));
  }

  @Test
  void testProcessorProcess6() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)));
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    ConsensusNodeId _imConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    processor.process(new AskState(_databaseId, _imConsensusNodeId, UUID.randomUUID()));
  }

  @Test
  void testProcessorProcess7() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel());
    processor.process(new DefaultSDEmptyReq("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8")));
  }

  @Test
  void testProcessorProcess8() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel());
    byte[] _cmadByteArray = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    processor.process(
        new RequestData(_cmadByteArray, TestDatabaseIdRepository.randomDatabaseId(), " str Nt",
            ReplicaTokenType.RTT_PROP));
  }

  @Test
  void testProcessorProcess9() throws IOException {

    BaseSyncableDataMarshal.Processor processor = new BaseSyncableDataMarshal.Processor(
        new InMemoryClosableChannel());
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    NamedDatabaseId _namedDatabaseId1 = TestDatabaseIdRepository.randomNamedDatabaseId();
    DatabaseId _databaseId = TestDatabaseIdRepository.randomDatabaseId();
    processor.process(new SyncableLeasableCoreNodeData(_namedDatabaseId,
        new LeasableMeta(1L,
            new SyncableLeasableCoreNodeData(_namedDatabaseId1, new LeasableMeta(1L,
                new SyncableLeasableCoreNodeData(
                    _databaseId,
                    123,
                    new ConsensusNodeId(
                        UUID.randomUUID())))))));
  }

  @Test
  void testUnahDataManagerFactory() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));
    assertThrows(IllegalStateException.class, () -> baseSyncableDataMarshal
        .unahDataManagerFactory(new ReadablePositionAwareChecksumChannelManager(), (byte) 'A'));
  }

  @Test
  void testUnahDataManagerFactory10() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    inMemoryClosableChannel.putDouble(10.0);
    assertTrue(baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) 1)
        .getIsCi());
  }

  @Test
  void testUnahDataManagerFactory11() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putDouble(10.0);
    inMemoryClosableChannel.put("AAAAAAAA".getBytes("UTF-8"), 3);
    inMemoryClosableChannel.putDouble(10.0);
    assertTrue(baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) 1)
        .getIsCi());
  }

  @Test
  void testUnahDataManagerFactory12() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    assertThrows(IllegalStateException.class,
        () -> baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel,
            Byte.MAX_VALUE));
  }

  @Test
  void testUnahDataManagerFactory13() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    inMemoryClosableChannel.putDouble(10.0);
    assertThrows(IllegalStateException.class,
        () -> baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) 2));
  }

  @Test
  void testUnahDataManagerFactory14() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    inMemoryClosableChannel.putDouble(10.0);
    assertTrue(baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) 5)
        .getIsCi());
  }

  @Test
  void testUnahDataManagerFactory15() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    inMemoryClosableChannel.putDouble(10.0);
    assertThrows(IllegalStateException.class,
        () -> baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) '￿'));
  }

  @Test
  void testUnahDataManagerFactory16() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putDouble(10.0);
    inMemoryClosableChannel.putDouble(10.0);
    assertThrows(IllegalStateException.class,
        () -> baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel,
            Byte.MAX_VALUE));
  }

  @Test
  void testUnahDataManagerFactory2() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));
    assertThrows(IllegalStateException.class, () -> baseSyncableDataMarshal
        .unahDataManagerFactory(new ReadablePositionAwareChecksumChannelManager(), (byte) 2));
  }

  @Test
  void testUnahDataManagerFactory3() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class), true));
    assertTrue(
        baseSyncableDataMarshal.unahDataManagerFactory(
                new ReadablePositionAwareChecksumChannelManager(), (byte) 5)
            .getIsCi());
  }

  @Test
  void testUnahDataManagerFactory4() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class), true));
    assertThrows(IllegalStateException.class, () -> baseSyncableDataMarshal
        .unahDataManagerFactory(new ReadablePositionAwareChecksumChannelManager(), (byte) '￿'));
  }

  @Test
  void testUnahDataManagerFactory5() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class), true));
    assertThrows(IllegalStateException.class, () -> baseSyncableDataMarshal
        .unahDataManagerFactory(new ReadablePositionAwareChecksumChannelManager(), Byte.MAX_VALUE));
  }

  @Test
  void testUnahDataManagerFactory6() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class), true));
    assertThrows(IllegalStateException.class, () -> baseSyncableDataMarshal
        .unahDataManagerFactory(new ReadablePositionAwareChecksumChannelManager(), (byte) 'ﾀ'));
  }

  @Test
  void testUnahDataManagerFactory7() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(null);
    assertThrows(IllegalStateException.class, () -> baseSyncableDataMarshal
        .unahDataManagerFactory(new ReadablePositionAwareChecksumChannelManager(), (byte) 'ﾀ'));
  }

  @Test
  void testUnahDataManagerFactory8() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    assertTrue(baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) 1)
        .getIsCi());
  }

  @Test
  void testUnahDataManagerFactory9() throws IOException, EndOfStreamException {
    BaseSyncableDataMarshal baseSyncableDataMarshal = new BaseSyncableDataMarshal(
        new VersionAwareLogEntryReader(mock(CommandReaderFactory.class)));

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putDouble(10.0);
    assertTrue(baseSyncableDataMarshal.unahDataManagerFactory(inMemoryClosableChannel, (byte) 1)
        .getIsCi());
  }
}

