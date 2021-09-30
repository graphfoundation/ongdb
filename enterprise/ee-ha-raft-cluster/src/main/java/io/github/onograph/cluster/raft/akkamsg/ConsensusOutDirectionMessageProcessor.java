package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl;
import io.github.onograph.cluster.raft.netty.ProtocolStackChannelWrapper;
import io.netty.channel.ChannelFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ConsensusOutDirectionMessageProcessor
    implements
    OutDirection<SocketAddress, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?>> {


  private final ConsensusNettyChannelPoolLifecycleAdapter ccConsensusNettyChannelPoolLifecycleAdapter;


  private final ConsensusNettyChannelPoolLifecycleAdapter cdConsensusNettyChannelPoolLifecycleAdapter;


  private final Log log;


  public ConsensusOutDirectionMessageProcessor(LogProvider _logProvider,
      ConsensusNettyChannelPoolLifecycleAdapter _spccConsensusNettyChannelPoolLifecycleAdapter,
      ConsensusNettyChannelPoolLifecycleAdapter _spcdConsensusNettyChannelPoolLifecycleAdapter) {
    this.cdConsensusNettyChannelPoolLifecycleAdapter = _spcdConsensusNettyChannelPoolLifecycleAdapter;
    this.ccConsensusNettyChannelPoolLifecycleAdapter = _spccConsensusNettyChannelPoolLifecycleAdapter;
    this.log = _logProvider.getLog(this.getClass());
  }


  private static String _prnadeString(SocketAddress _tSocketAddress) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.akkamsg.ConsensusOutDirectionMessageProcessor.prnadeString",
        _tSocketAddress);
  }


  private CompletableFuture<Void> _sedmsgCompletableFuture(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?> m,
      ProtocolStackChannelWrapper _pcProtocolStackChannelWrapper) {
    try {

      CompletableFuture<Void> _completableFutureOfVoid = new CompletableFuture();
      _completableFutureOfVoid.whenComplete((ignore, ex) ->
      {
        if (ex instanceof CancellationException) {
          _pcProtocolStackChannelWrapper.dipeFuture();
        }
      });

      ChannelFuture _wfChannelFuture = _pcProtocolStackChannelWrapper.getChannel().writeAndFlush(m);
      _wfChannelFuture.addListener((writeComplete) ->
      {
        if (!writeComplete.isSuccess()) {
          _pcProtocolStackChannelWrapper.dipeFuture();
          _completableFutureOfVoid.completeExceptionally(
              this._wrpcuCompletionException(_pcProtocolStackChannelWrapper,
                  writeComplete.cause()));
        } else {
          try {
            _pcProtocolStackChannelWrapper.reeeFuture().addListener((f) ->
            {
              _completableFutureOfVoid.complete(null);
            });
          } catch (

              Throwable _throwable) {
            _completableFutureOfVoid.complete(null);
          }
        }
      });
      return _completableFutureOfVoid;
    } catch (

        Throwable _throwable2) {
      _pcProtocolStackChannelWrapper.dipeFuture();
      throw this._wrpcuCompletionException(_pcProtocolStackChannelWrapper, _throwable2);
    }
  }


  private CompletableFuture<Void> _trdacaeCompletableFuture(
      LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO consensusSocketAddressDTO,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?> m) {

    ProtocolStackChannelWrapper _cpProtocolStackChannelWrapper = this._wafopldtcnProtocolStackChannelWrapper(
        consensusSocketAddressDTO);
    return _cpProtocolStackChannelWrapper == null ? null
        : this._sedmsgCompletableFuture(m, _cpProtocolStackChannelWrapper);
  }


  private CompletableFuture<Void> _uscnceCompletableFuture(
      LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO consensusSocketAddressDTO,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?> m) {
    return this.ccConsensusNettyChannelPoolLifecycleAdapter.acueCompletableFuture(
        consensusSocketAddressDTO).thenCompose((pooledChannel) ->
    {
      return this._sedmsgCompletableFuture(
          m, pooledChannel);
    });
  }


  private ProtocolStackChannelWrapper _wafopldtcnProtocolStackChannelWrapper(
      LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO _consensusSocketAddressDTO) {
    try {
      return this.cdConsensusNettyChannelPoolLifecycleAdapter.acueCompletableFuture(
          _consensusSocketAddressDTO).get();
    } catch (

        InterruptedException _interruptedException) {

    } catch (

        ExecutionException _executionException) {

    }

    return null;
  }


  private CompletionException _wrpcuCompletionException(
      ProtocolStackChannelWrapper _cpProtocolStackChannelWrapper, Throwable _throwable) {
    return new CompletionException("*** Error: 99cdfb41-a9f8-4c44-a02e-10bcf5439354", _throwable);
  }

  @Override
  public void senForMEME(boolean _isBok, SocketAddress _tSocketAddress,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.DepartingMessageManager<?> m) {

    LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO consensusSocketAddressDTO =
        new LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO(m.getConsensusMemberGroupId(),
            _tSocketAddress);

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage _mrAbstractConsensusMessage = m.getM();

    CompletableFuture _ofCompletableFuture;
    if (!_mrAbstractConsensusMessage.getIsDc() && !_mrAbstractConsensusMessage.getIsOr()) {
      _ofCompletableFuture = this._uscnceCompletableFuture(consensusSocketAddressDTO, m);
    } else {
      _ofCompletableFuture = this._trdacaeCompletableFuture(consensusSocketAddressDTO, m);
      if (_ofCompletableFuture == null) {
        return;
      }
    }

    if (_isBok) {
      try {
        _ofCompletableFuture.get();
      } catch (

          ExecutionException _executionException) {

      } catch (

          InterruptedException _interruptedException) {
        _ofCompletableFuture.cancel(true);


      }
    } else {
      _ofCompletableFuture.whenComplete((ignore, throwable) ->
      {
        if (throwable != null) {

        }
      });
    }
  }
}
