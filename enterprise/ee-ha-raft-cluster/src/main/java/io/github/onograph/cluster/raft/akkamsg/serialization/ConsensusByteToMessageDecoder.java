package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.cuprot.Ref;
import io.github.onograph.cluster.raft.share.CommandReaderFactoryProvider;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.time.Clock;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.marshal.EndOfStreamException;


public class ConsensusByteToMessageDecoder extends ByteToMessageDecoder {


  private final CommandReaderFactoryProvider commandReaderFactoryProvider;


  private final Ref<MessageDataType> refPoooMessageDataType;


  public ConsensusByteToMessageDecoder(CommandReaderFactoryProvider commandReaderFactoryProvider,
      Ref<MessageDataType> _refPoooMessageDataType) {
    this.commandReaderFactoryProvider = commandReaderFactoryProvider;
    this.refPoooMessageDataType = _refPoooMessageDataType;
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haeanerresConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _frConsensusNodeId, ReadableChannel _readableChannel) throws IOException {

    long _lgTer = _readableChannel.getLong();

    boolean _isSces = _readableChannel.get() == 1;

    long _lgIm = _readableChannel.getLong();

    long _lgIa = _readableChannel.getLong();
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(_frConsensusNodeId, _isSces,
            _lgIa, _lgIm, _lgTer));
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haeanerretConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _frConsensusNodeId, ReadableChannel _readableChannel) throws IOException {

    long _lgTe = _readableChannel.getLong();

    long begLIdx = _readableChannel.getLong();

    long befLT = _readableChannel.getLong();

    long ldrComLng = _readableChannel.getLong();

    int _iCe = _readableChannel.getInt();
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        befLT, begLIdx,
        _frConsensusNodeId, _iCe,
        ldrComLng, _lgTe);
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haecaniConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _frConsensusNodeId, ReadableChannel _readableChannel) throws IOException {

    long _lgTl = _readableChannel.getLong();

    long befIdx = _readableChannel.getLong();
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage(
            befIdx,
            _frConsensusNodeId,
            _lgTl));
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haehtrnConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _fConsensusNodeId, ReadableChannel _readableChannel) {
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage(
            _fConsensusNodeId));
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haehtrsConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _froConsensusNodeId, ReadableChannel _readableChannel) throws IOException {

    long _lgTl = _readableChannel.getLong();

    long _lgTic = _readableChannel.getLong();

    long _lgIc = _readableChannel.getLong();
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage(
            _froConsensusNodeId, _lgIc, _lgTl,
            _lgTic));
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haenenretConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _fConsensusNodeId, ReadableChannel _readableChannel) {
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.AddTLCRequestBuilder(
        _fConsensusNodeId);
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haepvorqConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _froConsensusNodeId, ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    ConsensusNodeId _cniaeConsensusNodeId = this.rervmeeConsensusNodeId(_readableChannel);

    long _lgT = _readableChannel.getLong();

    long _lgIll = _readableChannel.getLong();

    long _lgTll = _readableChannel.getLong();
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new ConsensusMessageServiceMeta.VotePreparationMessage.Ask(_cniaeConsensusNodeId,
            _froConsensusNodeId, _lgIll, _lgT, _lgTll));
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haepvorseConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _frConsensusNodeId, ReadableChannel _readableChannel) throws IOException {

    long _lgTe = _readableChannel.getLong();

    boolean _isGv = _readableChannel.get() == 1;
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new ConsensusMessageServiceMeta.VotePreparationMessage.Reply(_frConsensusNodeId, _isGv,
            _lgTe));
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haevrnConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _frConsensusNodeId, ReadableChannel _readableChannel) throws IOException {

    long _lgTe = _readableChannel.getLong();

    boolean _isGv = _readableChannel.get() == 1;
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(_frConsensusNodeId, _isGv,
            _lgTe));
  }


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _haevrsConsensusByteToMessageDecoderDistributedMessageBuilder(
      ConsensusNodeId _fConsensusNodeId, ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    ConsensusNodeId _cniaeConsensusNodeId = this.rervmeeConsensusNodeId(_readableChannel);

    long _lgTe = _readableChannel.getLong();

    long _lgIll = _readableChannel.getLong();

    long _lgTll = _readableChannel.getLong();
    return new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        new ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(_cniaeConsensusNodeId,
            _fConsensusNodeId, _lgIll, _lgTe, _lgTll));
  }

  @Override
  public void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _bfeByteBuf,
      List<Object> _listLiObject) throws Exception {

    ReadableChannel _readableChannel = new DefaultReadableChecksumChannel(_bfeByteBuf);

    ConsensusMemberGroupId consensusMemberGroupId = ConsensusMemberGroupId.SafeStateMarshalImpl.IT.unmarshal(
        _readableChannel);
    _cChannelHandlerContext.channel()
        .attr(SyncableDataByteToMessageDecoder.COPD_COTT_CONCMD_RDXR_GENR)
        .set(this.commandReaderFactoryProvider.getCommandReaderFactory(consensusMemberGroupId));

    int _iMtw = _readableChannel.getInt();

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType[] valArr =
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.values();

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType _raftConsensusMessageType = valArr[_iMtw];

    ConsensusNodeId _frConsensusNodeId = this.rervmeeConsensusNodeId(_readableChannel);

    io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _cmoeDistributedMessageBuilder =
        this.gelzcpOptional(_frConsensusNodeId, _raftConsensusMessageType, _readableChannel)
            .orElseThrow(() ->

            {
              return new IllegalArgumentException(
                  "*** Error:  9e41c963-2941-4dea-88e1-3b82ff9f443b");
            });
    _listLiObject.add(
        new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.IncomingConsensusMessageManager(
            _cmoeDistributedMessageBuilder, consensusMemberGroupId));
    this.refPoooMessageDataType.exeForE(MessageDataType.CT);
  }


  protected Optional<io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder> gelzcpOptional(
      ConsensusNodeId _frConsensusNodeId,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType _raftConsensusMessageType,
      ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {
    switch (_raftConsensusMessageType) {
      case MTYPE_CONS_VOTE_REQ:
        return Optional.of(
            this._haevrsConsensusByteToMessageDecoderDistributedMessageBuilder(_frConsensusNodeId,
                _readableChannel));
      case MTYPE_CONS_VOTE_ANS:
        return Optional.of(
            this._haevrnConsensusByteToMessageDecoderDistributedMessageBuilder(_frConsensusNodeId,
                _readableChannel));
      case PI_CONS_VOTE_REQ:
        return Optional.of(
            this._haepvorqConsensusByteToMessageDecoderDistributedMessageBuilder(_frConsensusNodeId,
                _readableChannel));
      case PI_CONS_VOTE_ANS:
        return Optional.of(this._haepvorseConsensusByteToMessageDecoderDistributedMessageBuilder(
            _frConsensusNodeId, _readableChannel));
      case MTYPE_CONS_AE_REQ:
        return Optional.of(this._haeanerretConsensusByteToMessageDecoderDistributedMessageBuilder(
            _frConsensusNodeId, _readableChannel));
      case MTYPE_CONS_AE_ANS:
        return Optional.of(this._haeanerresConsensusByteToMessageDecoderDistributedMessageBuilder(
            _frConsensusNodeId, _readableChannel));
      case NIT_REQ:
        return Optional.of(this._haenenretConsensusByteToMessageDecoderDistributedMessageBuilder(
            _frConsensusNodeId, _readableChannel));
      case HEALTH_PING_REQ:
        return Optional.of(
            this._haehtrsConsensusByteToMessageDecoderDistributedMessageBuilder(_frConsensusNodeId,
                _readableChannel));
      case HEALTH_PING_ANS:
        return Optional.of(
            this._haehtrnConsensusByteToMessageDecoderDistributedMessageBuilder(_frConsensusNodeId,
                _readableChannel));
      case LCS_META:
        return Optional.of(
            this._haecaniConsensusByteToMessageDecoderDistributedMessageBuilder(_frConsensusNodeId,
                _readableChannel));
      default:
        return Optional.empty();
    }
  }


  protected ConsensusNodeId rervmeeConsensusNodeId(ReadableChannel _bfeReadableChannel)
      throws IOException, EndOfStreamException {

    ConsensusNodeId.SafeStateMarshalImpl memberIdSafeStateMarshalImpl = ConsensusNodeId.SafeStateMarshalImpl.IT;
    return memberIdSafeStateMarshalImpl.unmarshal(_bfeReadableChannel);
  }


  protected interface DistributedMessageBuilder {


    Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> mabcoleOptional(
        Queue<Long> _queueVaLong, Queue<SyncableData> _queueVarSyncableData);
  }


  protected static class AddTLCRequestBuilder
      implements
      io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder {


    private final ConsensusNodeId froConsensusNodeId;

    AddTLCRequestBuilder(ConsensusNodeId _frConsensusNodeId) {
      this.froConsensusNodeId = _frConsensusNodeId;
    }

    @Override
    public Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> mabcoleOptional(
        Queue<Long> _queueTrsLong, Queue<SyncableData> _queueCnetSyncableData) {
      return _queueCnetSyncableData.isEmpty() ? Optional.empty() : Optional.of(
          new ConsensusMessageServiceMeta.MsgCreatorService.Ask(_queueCnetSyncableData.remove(),
              this.froConsensusNodeId));
    }
  }


  public static class BulkTLCRequestBuilder
      implements
      io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder {


    private final long befLT;


    private final long begLIdx;


    private final ConsensusNodeId froConsensusNodeId;


    private final int iEc;


    private final long ldrComLng;


    private final long lgTe;


    public BulkTLCRequestBuilder(long befLT, long begLIdx, ConsensusNodeId _frConsensusNodeId,
        int _iCe, long ldrComLng, long _lgTer) {
      this.befLT = befLT;
      this.begLIdx = begLIdx;
      this.froConsensusNodeId = _frConsensusNodeId;
      this.iEc = _iCe;
      this.ldrComLng = ldrComLng;
      this.lgTe = _lgTer;
    }

    @Override
    public Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> mabcoleOptional(
        Queue<Long> _queueTrsLong, Queue<SyncableData> _queueCnetSyncableData) {
      if (_queueTrsLong.size() >= this.iEc && _queueCnetSyncableData.size() >= this.iEc) {

        ConsensusLogEntry[] _etisConsensusLogEntryArray = new ConsensusLogEntry[this.iEc];

        for (

            int cur = 0; cur < this.iEc; ++cur) {

          long _lgTer = _queueTrsLong.remove();

          SyncableData btval = _queueCnetSyncableData.remove();
          _etisConsensusLogEntryArray[cur] = new ConsensusLogEntry(btval, _lgTer);
        }

        return Optional
            .of(new ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(this.befLT,
                this.begLIdx, _etisConsensusLogEntryArray,
                this.froConsensusNodeId, this.ldrComLng, this.lgTe));
      } else {
        return Optional.empty();
      }
    }
  }


  public static class DistributedMessageBuilderDefaultImpl
      implements
      io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder {


    private final io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m;

    public DistributedMessageBuilderDefaultImpl(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m) {
      this.m = m;
    }

    @Override
    public Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> mabcoleOptional(
        Queue<Long> _queueTrsLong, Queue<SyncableData> _queueCnetSyncableData) {
      return Optional.of(this.m);
    }
  }


  public static class IncomingConsensusMessageManager {


    private final io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder
        cmoeDistributedMessageBuilder;


    private final ConsensusMemberGroupId consensusMemberGroupId;

    public IncomingConsensusMessageManager(
        io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilder _cmoeDistributedMessageBuilder,
        ConsensusMemberGroupId consensusMemberGroupId) {
      this.cmoeDistributedMessageBuilder = _cmoeDistributedMessageBuilder;
      this.consensusMemberGroupId = consensusMemberGroupId;
    }


    public Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager> mabcooOptional(
        Clock _clock, Queue<SyncableData> _queueCnetSyncableData, Queue<Long> _queueTrsLong) {
      return this.cmoeDistributedMessageBuilder.mabcoleOptional(_queueTrsLong,
          _queueCnetSyncableData).map((m) ->
      {
        return io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager
            .ofConsensusMessageServiceMetaArrivingMessageManager(
                _clock.instant(),
                this.consensusMemberGroupId,
                m);
      });
    }
  }
}
