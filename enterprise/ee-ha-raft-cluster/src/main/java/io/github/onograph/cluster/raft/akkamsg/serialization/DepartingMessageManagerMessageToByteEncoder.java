package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class DepartingMessageManagerMessageToByteEncoder
    extends
    MessageToByteEncoder<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager> {


  protected Processor crahdrDepartingMessageManagerMessageToByteEncoderProcessor(
      DefaultWritableChecksumChannel _defaultWritableChecksumChannel,
      ConsensusNodeId.SafeStateMarshalImpl memberSafeStateMarshalImpl) {
    return new Processor(_defaultWritableChecksumChannel, memberSafeStateMarshalImpl);
  }

  @Override
  public void encode(ChannelHandlerContext _cChannelHandlerContext,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager _mdDepartingMessageManager,
      ByteBuf _oByteBuf) throws Exception {

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage m = _mdDepartingMessageManager.getM();

    ConsensusMemberGroupId consensusMemberGroupId = _mdDepartingMessageManager.getConsensusMemberGroupId();

    ConsensusNodeId.SafeStateMarshalImpl memberSafeStateMarshalImpl = ConsensusNodeId.SafeStateMarshalImpl.IT;

    DefaultWritableChecksumChannel _defaultWritableChecksumChannel = new DefaultWritableChecksumChannel(
        _oByteBuf);
    _defaultWritableChecksumChannel.put(MessageDataType.MSG.getMcd());
    ConsensusMemberGroupId.SafeStateMarshalImpl.IT.marshal(consensusMemberGroupId,
        _defaultWritableChecksumChannel);
    _defaultWritableChecksumChannel.putInt(m.getTNme().ordinal());
    memberSafeStateMarshalImpl.marshal(m.getFroConsensusNodeId(), _defaultWritableChecksumChannel);
    m.dipc(this.crahdrDepartingMessageManagerMessageToByteEncoderProcessor(
        _defaultWritableChecksumChannel, memberSafeStateMarshalImpl));
  }


  protected static class Processor implements
      ConsensusMessageServiceMeta.Processor<Void, Exception> {


    protected final DefaultWritableChecksumChannel defaultWritableChecksumChannel;


    protected final ConsensusNodeId.SafeStateMarshalImpl memberSafeStateMarshalImpl;


    protected Processor(DefaultWritableChecksumChannel _defaultWritableChecksumChannel,
        ConsensusNodeId.SafeStateMarshalImpl memberSafeStateMarshalImpl) {
      this.defaultWritableChecksumChannel = _defaultWritableChecksumChannel;
      this.memberSafeStateMarshalImpl = memberSafeStateMarshalImpl;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask) throws Exception {
      this.memberSafeStateMarshalImpl.marshal(ask.getCniaeConsensusNodeId(),
          this.defaultWritableChecksumChannel);
      this.defaultWritableChecksumChannel.putLong(ask.getLgT());
      this.defaultWritableChecksumChannel.putLong(ask.getLgIll());
      this.defaultWritableChecksumChannel.putLong(ask.getLgTll());
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply) {
      this.defaultWritableChecksumChannel.putLong(reply.getLgT());
      this.defaultWritableChecksumChannel.put((byte) (reply.getIsGv() ? 1 : 0));
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.VotePreparationMessage.Ask nvAsk)
        throws Exception {
      this.memberSafeStateMarshalImpl.marshal(nvAsk.getCniaeConsensusNodeId(),
          this.defaultWritableChecksumChannel);
      this.defaultWritableChecksumChannel.putLong(nvAsk.getLgT());
      this.defaultWritableChecksumChannel.putLong(nvAsk.getLgIll());
      this.defaultWritableChecksumChannel.putLong(nvAsk.getLgTll());
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.VotePreparationMessage.Reply nvReply) {
      this.defaultWritableChecksumChannel.putLong(nvReply.getLgT());
      this.defaultWritableChecksumChannel.put((byte) (nvReply.getIsGv() ? 1 : 0));
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask nAsk)
        throws Exception {
      this.defaultWritableChecksumChannel.putLong(nAsk.getLgLt());
      this.defaultWritableChecksumChannel.putLong(nAsk.getBegLIdx());
      this.defaultWritableChecksumChannel.putLong(nAsk.getBefLT());
      this.defaultWritableChecksumChannel.putLong(nAsk.getLdrComLng());
      this.defaultWritableChecksumChannel.putInt(nAsk.getEtisConsensusLogEntryArray().length);
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply nReply) {
      this.defaultWritableChecksumChannel.putLong(nReply.getLgT());
      this.defaultWritableChecksumChannel.put((byte) (nReply.getIsSces() ? 1 : 0));
      this.defaultWritableChecksumChannel.putLong(nReply.getLgIm());
      this.defaultWritableChecksumChannel.putLong(nReply.getLgIa());
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) throws Exception {
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage) {
      this.defaultWritableChecksumChannel.putLong(_hatetAliveNoReplyMessage.getLgLt());
      this.defaultWritableChecksumChannel.putLong(_hatetAliveNoReplyMessage.getLgTic());
      this.defaultWritableChecksumChannel.putLong(_hatetAliveNoReplyMessage.getLgIc());
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage) {
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _iclRequestTransactionLogCZMetaMessage) {
      this.defaultWritableChecksumChannel.putLong(_iclRequestTransactionLogCZMetaMessage.getLgLt());
      this.defaultWritableChecksumChannel.putLong(
          _iclRequestTransactionLogCZMetaMessage.getBefIdx());
      return null;
    }

    @Override
    public Void process(
        ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout) {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg) {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk) {
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage) {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange)
        throws Exception {

      throw new UnsupportedOperationException("*** Error:  358a3f99-da6c-48d2-b1cd-bea9e1713844");
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec)
        throws Exception {
      return null;
    }

    @Override
    public Void process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted)
        throws Exception {

      throw new UnsupportedOperationException("*** Error:  eb0f5614-b929-4029-ac38-234f91c89dee");
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage)
        throws Exception {

      throw new UnsupportedOperationException("*** Error:  a0bbfda3-2619-49db-9929-c0244ff5399f");
    }
  }
}
