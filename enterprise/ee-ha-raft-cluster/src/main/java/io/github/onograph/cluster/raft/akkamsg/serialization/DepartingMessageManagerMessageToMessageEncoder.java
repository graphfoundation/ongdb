package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.io.IOException;
import java.util.List;


public class DepartingMessageManagerMessageToMessageEncoder
    extends
    MessageToMessageEncoder<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?>> {


  private final SyncableDataEncodingService ecSyncableDataEncodingService;

  public DepartingMessageManagerMessageToMessageEncoder(
      SyncableDataEncodingService _ecSyncableDataEncodingService) {
    this.ecSyncableDataEncodingService = _ecSyncableDataEncodingService;
  }

  @Override
  protected void encode(ChannelHandlerContext _cChannelHandlerContext,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?> m,
      List<Object> _listOObject)
      throws Exception {
    _listOObject.add(m);

    Processor _hcrProcessor = new Processor(_cChannelHandlerContext.alloc(), _listOObject);
    m.getM().dipc(_hcrProcessor);
  }


  private class Processor implements ConsensusMessageServiceMeta.Processor<Void, Exception> {


    private final ByteBufAllocator byteBufAllocator;


    private final List<Object> listOObject;


    private Processor(ByteBufAllocator _byteBufAllocator, List<Object> _listOObject) {
      this.byteBufAllocator = _byteBufAllocator;
      this.listOObject = _listOObject;
    }


    private Void _ilaobVoid(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage _mrAbstractConsensusMessage) {

      throw new IllegalStateException("*** Error: 882f4a9c-a4a0-40cd-9feb-69776966aee3");
    }


    private void _sellctForSyLi(SyncableData btval, List<Object> _listOObject)
        throws IOException {
      _listOObject.add(MessageDataType.DUPD_MD);
      DepartingMessageManagerMessageToMessageEncoder.this.ecSyncableDataEncodingService.process(
          _listOObject, btval);
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask) throws Exception {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply)
        throws Exception {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask)
        throws Exception {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply)
        throws Exception {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask)
        throws Exception {
      this.listOObject.add(
          TransactionLogEntryElectionTermsConverter.seiitmByteBuf(this.byteBufAllocator,
              ask.getEtisConsensusLogEntryArray()));

      ConsensusLogEntry[] _consensusLogEntryArray = ask.getEtisConsensusLogEntryArray();

      int _iVar = _consensusLogEntryArray.length;

      for (

          int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

        ConsensusLogEntry _consensusLogEntry = _consensusLogEntryArray[_iVar2];
        this._sellctForSyLi(_consensusLogEntry.getBtval(), this.listOObject);
      }

      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply)
        throws Exception {
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage _hatetAliveNoReplyMessage)
        throws Exception {
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage _iclRequestTransactionLogCZMetaMessage)
        throws Exception {
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage _rhAliveReplyMessage)
        throws Exception {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.MsgCreatorService.Ask ask) throws Exception {
      this._sellctForSyLi(ask.getBtval(), this.listOObject);
      return null;
    }

    @Override
    public Void process(
        ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout)
        throws Exception {
      return this._ilaobVoid(consensusElectionTimeout);
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg)
        throws Exception {
      return this._ilaobVoid(aliveMsg);
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk)
        throws Exception {
      return this._ilaobVoid(bulkAsk);
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage _rpLogClipRequestMessage)
        throws Exception {
      return this._ilaobVoid(_rpLogClipRequestMessage);
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange)
        throws Exception {
      return null;
    }

    @Override
    public Void process(
        ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted)
        throws Exception {
      return null;
    }

    @Override
    public Void process(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage)
        throws Exception {
      return null;
    }

    @Override
    public Void process(ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec)
        throws Exception {
      return this._ilaobVoid(leaderRec);
    }
  }
}
