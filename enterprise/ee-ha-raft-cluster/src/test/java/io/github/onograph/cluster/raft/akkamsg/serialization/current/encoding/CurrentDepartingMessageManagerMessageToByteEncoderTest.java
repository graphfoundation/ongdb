package io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding;

import static org.junit.jupiter.api.Assertions.assertNull;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.meta.fsm.State;
import io.github.onograph.config.NodeGroupIdentifier;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class CurrentDepartingMessageManagerMessageToByteEncoderTest {

  @Test
  void testCrahdrDepartingMessageManagerMessageToByteEncoderProcessor() {

    CurrentDepartingMessageManagerMessageToByteEncoder currentDepartingMessageManagerMessageToByteEncoder =
        new CurrentDepartingMessageManagerMessageToByteEncoder();
    currentDepartingMessageManagerMessageToByteEncoder.crahdrDepartingMessageManagerMessageToByteEncoderProcessor(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
  }

  @Test
  void testProcessorImplConstructor() {

    new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
  }

  @Test
  void testProcessorImplProcess() throws Exception {
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    UUID _riUUID = UUID.randomUUID();
    assertNull(processorImpl.process(
        new ConsensusMessageServiceMeta.InfoReplyMessage(_fConsensusNodeId, _riUUID,
            new State(State.MetaStateMessageType.OK))));
  }

  @Test
  void testProcessorImplProcess10() throws Exception {
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    assertNull(
        processorImpl.process(new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
            new ConsensusNodeId(UUID.randomUUID()), 1L, 1L)));
  }

  @Test
  void testProcessorImplProcess11() throws Exception {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel, null);
    assertNull(
        processorImpl.process(new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
            new ConsensusNodeId(UUID.randomUUID()), 1L, 1L)));
  }

  @Test
  void testProcessorImplProcess2() throws Exception {
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    UUID _riUUID = UUID.randomUUID();
    assertNull(processorImpl.process(
        new ConsensusMessageServiceMeta.InfoReplyMessage(_fConsensusNodeId, _riUUID,
            new State(State.MetaStateMessageType.OK))));
  }

  @Test
  void testProcessorImplProcess3() throws Exception {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel, null);
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    UUID _riUUID = UUID.randomUUID();
    assertNull(processorImpl.process(
        new ConsensusMessageServiceMeta.InfoReplyMessage(_fConsensusNodeId, _riUUID,
            new State(State.MetaStateMessageType.OK))));
  }

  @Test
  void testProcessorImplProcess4() throws Exception {
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertNull(processorImpl.process(
        new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(_fConsensusNodeId,
            1L, 1L, new HashSet<NodeGroupIdentifier>())));
  }

  @Test
  void testProcessorImplProcess5() throws Exception {
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(
            new CompositeByteBuf(new PooledByteBufAllocator(), true, 3)), null);
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertNull(processorImpl.process(
        new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(_fConsensusNodeId,
            1L, 1L, new HashSet<NodeGroupIdentifier>())));
  }

  @Test
  void testProcessorImplProcess6() throws Exception {
    DefaultWritableChecksumChannel defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        Unpooled.compositeBuffer(3));
    defaultWritableChecksumChannel.putInt(42);
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel, null);
    ConsensusNodeId _fConsensusNodeId = new ConsensusNodeId(UUID.randomUUID());
    assertNull(processorImpl.process(
        new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(_fConsensusNodeId,
            1L, 1L, new HashSet<NodeGroupIdentifier>())));
  }

  @Test
  void testProcessorImplProcess7() throws Exception {
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);

    HashSet<NodeGroupIdentifier> nodeGroupIdentifierSet = new HashSet<NodeGroupIdentifier>();
    nodeGroupIdentifierSet.add(new NodeGroupIdentifier("Dr"));
    assertNull(
        processorImpl.process(new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(
            new ConsensusNodeId(UUID.randomUUID()), 1L, 1L, nodeGroupIdentifierSet)));
  }

  @Test
  void testProcessorImplProcess8() throws Exception {
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);

    HashSet<NodeGroupIdentifier> nodeGroupIdentifierSet = new HashSet<NodeGroupIdentifier>();
    nodeGroupIdentifierSet.add(
        new NodeGroupIdentifier("io.github.onograph.config.NodeGroupIdentifier"));
    assertNull(
        processorImpl.process(new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(
            new ConsensusNodeId(UUID.randomUUID()), 1L, 1L, nodeGroupIdentifierSet)));
  }

  @Test
  void testProcessorImplProcess9() throws Exception {
    CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl = new CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        new DefaultWritableChecksumChannel(Unpooled.compositeBuffer(3)), null);
    assertNull(
        processorImpl.process(new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(
            new ConsensusNodeId(UUID.randomUUID()), 1L, 1L)));
  }
}

