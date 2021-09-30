package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.CommandReaderFactoryProvider;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.impl.transaction.log.InMemoryClosableChannel;
import org.neo4j.test.FakeClockJobScheduler;

class ConsensusByteToMessageDecoderTest {

  @Test
  void testAddTLCRequestBuilderConstructor() {

    new ConsensusByteToMessageDecoder.AddTLCRequestBuilder(new ConsensusNodeId(UUID.randomUUID()));
  }

  @Test
  void testAddTLCRequestBuilderMabcoleOptional() {
    ConsensusByteToMessageDecoder.AddTLCRequestBuilder addTLCRequestBuilder = new ConsensusByteToMessageDecoder.AddTLCRequestBuilder(
        new ConsensusNodeId(UUID.randomUUID()));
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    assertFalse(addTLCRequestBuilder.mabcoleOptional(_queueTrsLong, new LinkedList<SyncableData>())
        .isPresent());
  }

  @Test
  void testAddTLCRequestBuilderMabcoleOptional2() {
    ConsensusNodeId consensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    ConsensusByteToMessageDecoder.AddTLCRequestBuilder addTLCRequestBuilder = new ConsensusByteToMessageDecoder.AddTLCRequestBuilder(
        consensusNodeId);
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();

    LinkedList<SyncableData> syncableDataList = new LinkedList<SyncableData>();
    syncableDataList.add(mock(SyncableData.class));
    Optional<ConsensusMessageServiceMeta.AbstractConsensusMessage> actualMabcoleOptionalResult = addTLCRequestBuilder
        .mabcoleOptional(_queueTrsLong, syncableDataList);
    assertTrue(actualMabcoleOptionalResult.isPresent());
    ConsensusMessageServiceMeta.AbstractConsensusMessage getResult = actualMabcoleOptionalResult.get();
    assertEquals(ConsensusMessageServiceMeta.RaftConsensusMessageType.NIT_REQ, getResult.getTNme());
    assertFalse(getResult.getIsOr());
    assertTrue(getResult.getIsDc());
    assertSame(consensusNodeId, getResult.getFroConsensusNodeId());
    assertTrue(syncableDataList.isEmpty());
  }

  @Test
  void testBulkTLCRequestBuilderConstructor() {

    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder actualBulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), 1, 1L, 1L);
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    actualBulkTLCRequestBuilder.mabcoleOptional(_queueTrsLong, new LinkedList<SyncableData>());
  }

  @Test
  void testBulkTLCRequestBuilderConstructor2() {

    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder actualBulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), 0, 1L, 1L);
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    actualBulkTLCRequestBuilder.mabcoleOptional(_queueTrsLong, new LinkedList<SyncableData>());
  }

  @Test
  void testBulkTLCRequestBuilderConstructor3() {

    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder actualBulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), 1, 1L, 1L);
    LinkedList<Long> resultLongList = new LinkedList<Long>();
    resultLongList.add(0L);
    actualBulkTLCRequestBuilder.mabcoleOptional(resultLongList, new LinkedList<SyncableData>());
  }

  @Test
  void testBulkTLCRequestBuilderConstructor4() {

    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder actualBulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        -1L, -1L, new ConsensusNodeId(UUID.randomUUID()), 0, 1L, 1L);
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    actualBulkTLCRequestBuilder.mabcoleOptional(_queueTrsLong, new LinkedList<SyncableData>());
  }

  @Test
  void testBulkTLCRequestBuilderConstructor5() {

    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder actualBulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), 1, 1L, 1L);
    LinkedList<Long> resultLongList = new LinkedList<Long>();
    resultLongList.add(0L);
    LinkedList<SyncableData> syncableDataList = new LinkedList<SyncableData>();
    syncableDataList.add(mock(SyncableData.class));
    actualBulkTLCRequestBuilder.mabcoleOptional(resultLongList, syncableDataList);
  }

  @Test
  void testBulkTLCRequestBuilderConstructor6() throws UnsupportedEncodingException {

    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder actualBulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), 1, 1L, 1L);
    LinkedList<Long> resultLongList = new LinkedList<Long>();
    resultLongList.add(0L);
    LinkedList<SyncableData> syncableDataList = new LinkedList<SyncableData>();
    syncableDataList.add(new DefaultSDEmptyReq("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8")));
    actualBulkTLCRequestBuilder.mabcoleOptional(resultLongList, syncableDataList);
  }

  @Test
  void testBulkTLCRequestBuilderMabcoleOptional() {
    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), 1, 1L, 1L);
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    assertFalse(bulkTLCRequestBuilder.mabcoleOptional(_queueTrsLong, new LinkedList<SyncableData>())
        .isPresent());
  }

  @Test
  void testBulkTLCRequestBuilderMabcoleOptional2() {
    ConsensusNodeId consensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, consensusNodeId, 0, 1L, 1L);
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    Optional<ConsensusMessageServiceMeta.AbstractConsensusMessage> actualMabcoleOptionalResult = bulkTLCRequestBuilder
        .mabcoleOptional(_queueTrsLong, new LinkedList<SyncableData>());
    assertTrue(actualMabcoleOptionalResult.isPresent());
    ConsensusMessageServiceMeta.AbstractConsensusMessage getResult = actualMabcoleOptionalResult.get();
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getBefLT());
    assertEquals(ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_REQ,
        getResult.getTNme());
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getLgLt());
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getLdrComLng());
    assertTrue(getResult.getIsOr());
    assertTrue(getResult.getIsDc());
    assertSame(consensusNodeId, getResult.getFroConsensusNodeId());
    assertEquals(0,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getEtisConsensusLogEntryArray().length);
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getBegLIdx());
  }

  @Test
  void testBulkTLCRequestBuilderMabcoleOptional3() {
    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), -1, 1L, 1L);
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    assertThrows(NegativeArraySizeException.class,
        () -> bulkTLCRequestBuilder.mabcoleOptional(_queueTrsLong, new LinkedList<SyncableData>()));
  }

  @Test
  void testBulkTLCRequestBuilderMabcoleOptional4() {
    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), 1, 1L, 1L);

    LinkedList<Long> resultLongList = new LinkedList<Long>();
    resultLongList.add(0L);
    assertFalse(
        bulkTLCRequestBuilder.mabcoleOptional(resultLongList, new LinkedList<SyncableData>())
            .isPresent());
  }

  @Test
  void testBulkTLCRequestBuilderMabcoleOptional5() {
    ConsensusNodeId consensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        -1L, -1L, consensusNodeId, 0, 1L, 1L);
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    Optional<ConsensusMessageServiceMeta.AbstractConsensusMessage> actualMabcoleOptionalResult = bulkTLCRequestBuilder
        .mabcoleOptional(_queueTrsLong, new LinkedList<SyncableData>());
    assertTrue(actualMabcoleOptionalResult.isPresent());
    ConsensusMessageServiceMeta.AbstractConsensusMessage getResult = actualMabcoleOptionalResult.get();
    assertEquals(-1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getBefLT());
    assertEquals(ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_REQ,
        getResult.getTNme());
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getLgLt());
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getLdrComLng());
    assertTrue(getResult.getIsOr());
    assertTrue(getResult.getIsDc());
    assertSame(consensusNodeId, getResult.getFroConsensusNodeId());
    assertEquals(0,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getEtisConsensusLogEntryArray().length);
    assertEquals(-1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getBegLIdx());
  }

  @Test
  void testBulkTLCRequestBuilderMabcoleOptional6() {
    ConsensusNodeId consensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, consensusNodeId, 1, 1L, 1L);

    LinkedList<Long> resultLongList = new LinkedList<Long>();
    resultLongList.add(0L);

    LinkedList<SyncableData> syncableDataList = new LinkedList<SyncableData>();
    syncableDataList.add(mock(SyncableData.class));
    Optional<ConsensusMessageServiceMeta.AbstractConsensusMessage> actualMabcoleOptionalResult = bulkTLCRequestBuilder
        .mabcoleOptional(resultLongList, syncableDataList);
    assertTrue(actualMabcoleOptionalResult.isPresent());
    ConsensusMessageServiceMeta.AbstractConsensusMessage getResult = actualMabcoleOptionalResult.get();
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getBefLT());
    assertEquals(ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_REQ,
        getResult.getTNme());
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getLgLt());
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getLdrComLng());
    assertTrue(getResult.getIsOr());
    assertTrue(getResult.getIsDc());
    assertSame(consensusNodeId, getResult.getFroConsensusNodeId());
    assertEquals(1,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getEtisConsensusLogEntryArray().length);
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getBegLIdx());
    assertTrue(resultLongList.isEmpty());
    assertTrue(syncableDataList.isEmpty());
  }

  @Test
  void testBulkTLCRequestBuilderMabcoleOptional7() throws UnsupportedEncodingException {
    ConsensusNodeId consensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, consensusNodeId, 1, 1L, 1L);

    LinkedList<Long> resultLongList = new LinkedList<Long>();
    resultLongList.add(0L);

    LinkedList<SyncableData> syncableDataList = new LinkedList<SyncableData>();
    syncableDataList.add(new DefaultSDEmptyReq("AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8")));
    Optional<ConsensusMessageServiceMeta.AbstractConsensusMessage> actualMabcoleOptionalResult = bulkTLCRequestBuilder
        .mabcoleOptional(resultLongList, syncableDataList);
    assertTrue(actualMabcoleOptionalResult.isPresent());
    ConsensusMessageServiceMeta.AbstractConsensusMessage getResult = actualMabcoleOptionalResult.get();
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getBefLT());
    assertEquals(ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_REQ,
        getResult.getTNme());
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getLgLt());
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getLdrComLng());
    assertTrue(getResult.getIsOr());
    assertTrue(getResult.getIsDc());
    assertSame(consensusNodeId, getResult.getFroConsensusNodeId());
    assertEquals(1,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getEtisConsensusLogEntryArray().length);
    assertEquals(1L,
        ((ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask) getResult).getBegLIdx());
    assertTrue(resultLongList.isEmpty());
    assertTrue(syncableDataList.isEmpty());
  }

  @Test
  void testConstructor() {
    CommandReaderFactoryProvider commandReaderFactoryProvider = mock(
        CommandReaderFactoryProvider.class);
    assertFalse(
        (new ConsensusByteToMessageDecoder(commandReaderFactoryProvider,
            new ContentTypeRef())).isSingleDecode());
  }

  @Test
  void testDistributedMessageBuilderDefaultImplConstructor() {

    new ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new ConsensusMessageServiceMeta.LogClipRequestMessage(1L));
  }

  @Test
  void testDistributedMessageBuilderDefaultImplMabcoleOptional() {
    ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl distributedMessageBuilderDefaultImpl =
        new ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
            new ConsensusMessageServiceMeta.LogClipRequestMessage(1L));
    LinkedList<Long> _queueTrsLong = new LinkedList<Long>();
    assertTrue(distributedMessageBuilderDefaultImpl.mabcoleOptional(_queueTrsLong,
            new LinkedList<SyncableData>())
        .isPresent());
  }

  @Test
  void testGelzcpOptional() throws IOException, EndOfStreamException {
    CommandReaderFactoryProvider commandReaderFactoryProvider = mock(
        CommandReaderFactoryProvider.class);
    ConsensusByteToMessageDecoder consensusByteToMessageDecoder = new ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider, new ContentTypeRef());
    ConsensusNodeId _frConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putShort((short) 0);
    assertTrue(
        consensusByteToMessageDecoder
            .gelzcpOptional(_frConsensusNodeId,
                ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ,
                inMemoryClosableChannel)
            .isPresent());
  }

  @Test
  void testGelzcpOptional2() throws IOException, EndOfStreamException {
    CommandReaderFactoryProvider commandReaderFactoryProvider = mock(
        CommandReaderFactoryProvider.class);
    ConsensusByteToMessageDecoder consensusByteToMessageDecoder = new ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider, new ContentTypeRef());
    ConsensusNodeId _frConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putLong(0L);
    inMemoryClosableChannel.putShort((short) 0);
    assertTrue(
        consensusByteToMessageDecoder
            .gelzcpOptional(_frConsensusNodeId,
                ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_ANS,
                inMemoryClosableChannel)
            .isPresent());
  }

  @Test
  void testIncomingConsensusMessageManagerConstructor() {

    ConsensusByteToMessageDecoder.AddTLCRequestBuilder _cmoeDistributedMessageBuilder = new ConsensusByteToMessageDecoder.AddTLCRequestBuilder(
        new ConsensusNodeId(UUID.randomUUID()));
    new ConsensusByteToMessageDecoder.IncomingConsensusMessageManager(
        _cmoeDistributedMessageBuilder,
        new ConsensusMemberGroupId(UUID.randomUUID()));
  }

  @Test
  void testIncomingConsensusMessageManagerMabcooOptional() {
    ConsensusByteToMessageDecoder.AddTLCRequestBuilder _cmoeDistributedMessageBuilder = new ConsensusByteToMessageDecoder.AddTLCRequestBuilder(
        new ConsensusNodeId(UUID.randomUUID()));
    ConsensusByteToMessageDecoder.IncomingConsensusMessageManager incomingConsensusMessageManager =
        new ConsensusByteToMessageDecoder.IncomingConsensusMessageManager(
            _cmoeDistributedMessageBuilder, new ConsensusMemberGroupId(UUID.randomUUID()));
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    LinkedList<SyncableData> _queueCnetSyncableData = new LinkedList<SyncableData>();
    assertFalse(incomingConsensusMessageManager.mabcooOptional(_clock, _queueCnetSyncableData,
            new LinkedList<Long>())
        .isPresent());
  }

  @Test
  void testIncomingConsensusMessageManagerMabcooOptional2() {
    ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage = new ConsensusMessageServiceMeta.LogClipRequestMessage(
        1L);
    ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl _cmoeDistributedMessageBuilder =
        new ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
            logClipRequestMessage);
    ConsensusMemberGroupId consensusMemberGroupId = new ConsensusMemberGroupId(UUID.randomUUID());
    ConsensusByteToMessageDecoder.IncomingConsensusMessageManager incomingConsensusMessageManager =
        new ConsensusByteToMessageDecoder.IncomingConsensusMessageManager(
            _cmoeDistributedMessageBuilder, consensusMemberGroupId);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    LinkedList<SyncableData> _queueCnetSyncableData = new LinkedList<SyncableData>();
    Optional<ConsensusMessageServiceMeta.ArrivingMessageManager> actualMabcooOptionalResult = incomingConsensusMessageManager
        .mabcooOptional(_clock, _queueCnetSyncableData, new LinkedList<Long>());
    assertTrue(actualMabcooOptionalResult.isPresent());
    ConsensusMessageServiceMeta.ArrivingMessageManager getResult = actualMabcooOptionalResult.get();
    assertSame(logClipRequestMessage, getResult.getM());
    assertSame(consensusMemberGroupId, getResult.getConsensusMemberGroupId());
  }

  @Test
  void testIncomingConsensusMessageManagerMabcooOptional3() {
    ConsensusByteToMessageDecoder.BulkTLCRequestBuilder _cmoeDistributedMessageBuilder = new ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        1L, 1L, new ConsensusNodeId(UUID.randomUUID()), 1, 1L, 1L);

    ConsensusByteToMessageDecoder.IncomingConsensusMessageManager incomingConsensusMessageManager =
        new ConsensusByteToMessageDecoder.IncomingConsensusMessageManager(
            _cmoeDistributedMessageBuilder, new ConsensusMemberGroupId(UUID.randomUUID()));
    LinkedList<SyncableData> _queueCnetSyncableData = new LinkedList<SyncableData>();
    assertFalse(incomingConsensusMessageManager.mabcooOptional(null, _queueCnetSyncableData,
            new LinkedList<Long>())
        .isPresent());
  }

  @Test
  void testRervmeeConsensusNodeId() throws IOException, EndOfStreamException {
    CommandReaderFactoryProvider commandReaderFactoryProvider = mock(
        CommandReaderFactoryProvider.class);
    ConsensusByteToMessageDecoder consensusByteToMessageDecoder = new ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider, new ContentTypeRef());

    InMemoryClosableChannel inMemoryClosableChannel = new InMemoryClosableChannel();
    inMemoryClosableChannel.putShort((short) 0);
    assertNull(consensusByteToMessageDecoder.rervmeeConsensusNodeId(inMemoryClosableChannel));
  }

  @Test
  void testRervmeeConsensusNodeId2() throws IOException, EndOfStreamException {
    CommandReaderFactoryProvider commandReaderFactoryProvider = mock(
        CommandReaderFactoryProvider.class);
    ConsensusByteToMessageDecoder consensusByteToMessageDecoder = new ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider, new ContentTypeRef());
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeInt(42);
    assertNull(consensusByteToMessageDecoder
        .rervmeeConsensusNodeId(new DefaultReadableChecksumChannel(compositeBufferResult)));
  }

  @Test
  void testRervmeeConsensusNodeId3() throws IOException, EndOfStreamException {
    CommandReaderFactoryProvider commandReaderFactoryProvider = mock(
        CommandReaderFactoryProvider.class);
    ConsensusByteToMessageDecoder consensusByteToMessageDecoder = new ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider, new ContentTypeRef());
    CompositeByteBuf compositeBufferResult = Unpooled.compositeBuffer(3);
    compositeBufferResult.writeShort(42);
    assertNull(consensusByteToMessageDecoder
        .rervmeeConsensusNodeId(new DefaultReadableChecksumChannel(compositeBufferResult)));
  }
}

