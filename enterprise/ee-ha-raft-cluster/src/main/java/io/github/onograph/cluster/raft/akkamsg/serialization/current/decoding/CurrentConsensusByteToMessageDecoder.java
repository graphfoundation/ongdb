package io.github.onograph.cluster.raft.akkamsg.serialization.current.decoding;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder;
import io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.cuprot.Ref;
import io.github.onograph.cluster.raft.share.CommandReaderFactoryProvider;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.config.NodeGroupIdentifier;
import java.io.IOException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.marshal.EndOfStreamException;


public class CurrentConsensusByteToMessageDecoder extends ConsensusByteToMessageDecoder {

  public CurrentConsensusByteToMessageDecoder(Ref<MessageDataType> _refPoooMessageDataType,
      CommandReaderFactoryProvider commandReaderFactoryProvider) {
    super(commandReaderFactoryProvider, _refPoooMessageDataType);
  }


  private static io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haeleptsreiConsensusByteToMessageDecoderDistributedMessageBuilder(
      ReadableChannel _readableChannel, ConsensusNodeId _frConsensusNodeId) throws IOException {

    long _lgIp = _readableChannel.getLong();

    long _lgTer = _readableChannel.getLong();
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted(_frConsensusNodeId,
            _lgIp, _lgTer));
  }


  private static io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haeleptsretConsensusByteToMessageDecoderDistributedMessageBuilder(
      ReadableChannel _readableChannel, ConsensusNodeId _froConsensusNodeId) throws IOException {

    long _lgIp = _readableChannel.getLong();

    long _lgTer = _readableChannel.getLong();

    int _iSg = _readableChannel.getInt();

    HashSet<String> _hashSetSgString = new HashSet();

    for (

        int cur = 0; cur < _iSg; ++cur) {
      _hashSetSgString.add(BasicStringSerializationHandler.unahString(_readableChannel));
    }

    Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier = NodeGroupIdentifier.seoSet(
        _hashSetSgString);
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(_froConsensusNodeId, _lgIp,
            _lgTer, _setGopNodeGroupIdentifier));
  }


  public static Optional<io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder> gelzcpfcrvoOptional(
      ReadableChannel _readableChannel,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType _raftConsensusMessageType,
      ConsensusNodeId _froConsensusNodeId) {
    try {
      switch (_raftConsensusMessageType) {
        case LEADER_CHNG_REQ:
          return Optional.of(
              _haeleptsretConsensusByteToMessageDecoderDistributedMessageBuilder(_readableChannel,
                  _froConsensusNodeId));
        case LEADER_CHNG_DENIED:
          return Optional.of(
              _haeleptsreiConsensusByteToMessageDecoderDistributedMessageBuilder(_readableChannel,
                  _froConsensusNodeId));
        default:
          return Optional.empty();
      }
    } catch (

        IOException _iOException) {
      throw new RuntimeException(_iOException);
    }
  }

  @Override
  protected Optional<io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder> gelzcpOptional(
      ConsensusNodeId _froConsensusNodeId,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType _raftConsensusMessageType,
      ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {
    return super.gelzcpOptional(_froConsensusNodeId, _raftConsensusMessageType, _readableChannel)
        .or(() ->
        {
          return gelzcpfcrvoOptional(_readableChannel,
              _raftConsensusMessageType,
              _froConsensusNodeId);
        });
  }
}
