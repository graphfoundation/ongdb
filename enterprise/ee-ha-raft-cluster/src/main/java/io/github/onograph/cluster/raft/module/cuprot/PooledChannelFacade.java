package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder;
import io.github.onograph.cluster.raft.netty.ProtocolStackChannelWrapper;
import io.netty.channel.Channel;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import org.neo4j.storageengine.api.CommandReaderFactory;


class PooledChannelFacade {


  private final ProtocolStackChannelWrapper cpProtocolStackChannelWrapper;


  private TrackingAnswerLimitHandler trhTrackingAnswerLimitHandler;

  PooledChannelFacade(ProtocolStackChannelWrapper _cpProtocolStackChannelWrapper) {
    this.cpProtocolStackChannelWrapper = _cpProtocolStackChannelWrapper;
  }


  private TrackingAnswerLimitHandler _geoceroharTrackingAnswerLimitHandler() {
    if (this.trhTrackingAnswerLimitHandler == null) {
      this.trhTrackingAnswerLimitHandler = this.cpProtocolStackChannelWrapper.gearu(
          CatchupNettyChannelPoolLifecycleAdapter.TRCN_REPS_EVXHDLR);
    }

    return this.trhTrackingAnswerLimitHandler;
  }


  void dipe() {
    this.cpProtocolStackChannelWrapper.dipeFuture();
  }


  OptionalLong mselrnOptionalLong() {
    return this._geoceroharTrackingAnswerLimitHandler().mselrnOptionalLong();
  }


  ApplicationComProFamily prtoApplicationComProFamily() {
    return this.cpProtocolStackChannelWrapper.getSpComProFamilyWrapper()
        .getPaApplicationComProFamily();
  }


  void reee() {
    this.cpProtocolStackChannelWrapper.reeeFuture();
  }


  void secmrrfoForCo(CommandReaderFactory _commandReaderFactory) {
    this.cpProtocolStackChannelWrapper.getChannel()
        .attr(TransactionSyncReplyByteToMessageDecoder.CONCMD_RDXR_GENR_ATR)
        .set(_commandReaderFactory);
  }


  void senForAb(AbstractCatchupManagementMessageWrapper m) {

    Channel _channel = this.cpProtocolStackChannelWrapper.getChannel();
    _channel.eventLoop().execute(() ->
    {
      _channel.write(m.getTNme(), _channel.voidPromise());
      _channel.writeAndFlush(m, _channel.voidPromise());
    });
  }


  void sersehlForCaCo(CompletableFuture<?> _completableFutureRosObject,
      CatchupAnswerServiceHandlers<?> _catchupAnswerServiceHandlersHnlrObject) {
    this._geoceroharTrackingAnswerLimitHandler()
        .sersehlForCaCo(_completableFutureRosObject, _catchupAnswerServiceHandlersHnlrObject);
  }
}
