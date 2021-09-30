package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.akkamsg.NettyChannel;
import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import io.github.onograph.config.EntProVer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.neo4j.internal.helpers.collection.Pair;


public class HandshakeClientMessageProcessorDefaultImpl implements HandshakeClientMessageProcessor {


  private final CompletableFuture<ComProFamilyWrapper> completableFuturePfComProFamilyWrapper;


  private Collection<MutatingCurrentActiveComProFamilyWrapper> collectionPmsMutatingCurrentActiveComProFamilyWrapper;


  private List<Pair<String, Optional<MutableComProFamily>>> listPmnPair;


  private NettyChannel nettyChannel;


  private ApplicationComProFamily panApplicationComProFamily;


  private ApplicationCurrentActiveComProFamilyWrapper pasApplicationCurrentActiveComProFamilyWrapper;


  private ComProFamilyWrapper psComProFamilyWrapper;


  private ComProFamilyManagerAppImpl rpaComProFamilyManagerAppImpl;


  private ComProFamilyManagerMutableImpl rpmComProFamilyManagerMutableImpl;

  HandshakeClientMessageProcessorDefaultImpl(
      CompletableFuture<ComProFamilyWrapper> _completableFuturePfComProFamilyWrapper) {
    this.completableFuturePfComProFamilyWrapper = _completableFuturePfComProFamilyWrapper;
  }


  private void _faiForSt(String m) {
    this.completableFuturePfComProFamilyWrapper.completeExceptionally(
        new ClientException(this.listPmnPair, "*** Error: 0a5294ba-b9ff-4b79-86a2-934ee87fc583",
            this.panApplicationComProFamily));
  }


  private void _seproruForNeApCo(
      Collection<MutatingCurrentActiveComProFamilyWrapper> _collectionPmsMutatingCurrentActiveComProFamilyWrapper,
      NettyChannel _nettyChannel,
      ApplicationCurrentActiveComProFamilyWrapper _paApplicationCurrentActiveComProFamilyWrapper) {
    _collectionPmsMutatingCurrentActiveComProFamilyWrapper.forEach((modifierProtocol) ->
    {

      AbstractComProFamilyWrapper<String, MutableComProFamily>
          _abstractComProFamilyWrapperSpsm =
          this.rpmComProFamilyManagerMutableImpl.geaAbstractComProFamilyWrapper(
              modifierProtocol.getListVrinU(),
              modifierProtocol.getComProFamilyGroupCtgrT());
      _nettyChannel.wrtFuture(new MutatingComProFamilyRequestService(
          _abstractComProFamilyWrapperSpsm.getStrIetfe(),
          _abstractComProFamilyWrapperSpsm.getSetVrinU()));
    });

    AbstractComProFamilyWrapper<EntProVer, ApplicationComProFamily> _abstractComProFamilyWrapperApsea =
        this.rpaComProFamilyManagerAppImpl.geaAbstractComProFamilyWrapper(
            _paApplicationCurrentActiveComProFamilyWrapper.getListVrinU(),
            _paApplicationCurrentActiveComProFamilyWrapper.getComProFamilyGroupCtgrT());
    _nettyChannel.wrtanflhFuture(
        new ComProFamilyRequestServiceImpl(_abstractComProFamilyWrapperApsea.getStrIetfe(),
            _abstractComProFamilyWrapperApsea.getSetVrinU()));
  }


  private void _sesworetira() {
    if (this.panApplicationComProFamily != null && this.listPmnPair.size()
        == this.collectionPmsMutatingCurrentActiveComProFamilyWrapper.size()) {

      List<MutableComProFamily> _listPmaMutableComProFamily =
          this.listPmnPair.stream().map(Pair::other).flatMap(Optional::stream)
              .collect(Collectors.toList());
      this.psComProFamilyWrapper = new ComProFamilyWrapper(_listPmaMutableComProFamily,
          this.panApplicationComProFamily);

      List<Pair<String, String>> _listPmosPair = _listPmaMutableComProFamily.stream()
          .map((protocol) ->
          {
            return Pair.of(protocol.caerString(),
                protocol
                    .getImpl());
          }).collect(Collectors.toList());
      this.nettyChannel.wrtanflhFuture(new ChangeComProRequestImpl(
          _listPmosPair, this.panApplicationComProFamily.caerString(),
          this.panApplicationComProFamily.getImpl()));
    }
  }


  public CompletableFuture<ComProFamilyWrapper> getCompletableFuturePfComProFamilyWrapper() {
    return this.completableFuturePfComProFamilyWrapper;
  }

  @Override
  public void hadForCh(ChangeComProReplyImpl _rsosChangeComProReplyImpl) {
    if (this.psComProFamilyWrapper == null) {
      this._faiForSt(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.control.connect.HandshakeClientMessageProcessorDefaultImpl.faiForSt2"));
    } else if (_rsosChangeComProReplyImpl.getStat() != HandshakeStateType.OK) {
      this._faiForSt(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.control.connect.HandshakeClientMessageProcessorDefaultImpl.faiForSt3"));
    } else {
      this.completableFuturePfComProFamilyWrapper.complete(this.psComProFamilyWrapper);
    }
  }

  @Override
  public void hadForCh(MutatingComProReply _rpmMutatingComProReply) {
    if (_rpmMutatingComProReply.getCsHandshakeStateType() == HandshakeStateType.OK) {

      Optional<MutableComProFamily> _optionalPmsMutableComProFamily =
          this.rpmComProFamilyManagerMutableImpl.seeOptional(_rpmMutatingComProReply.getPType(),
              _rpmMutatingComProReply.getIVrin());
      this.listPmnPair.add(
          Pair.of(_rpmMutatingComProReply.getPType(), _optionalPmsMutableComProFamily));
    } else {
      this.listPmnPair.add(Pair.of(_rpmMutatingComProReply.getPType(), Optional.empty()));
    }

    this._sesworetira();
  }

  @Override
  public void hadForCh(ComProFamilyReplyServiceImpl _rpaComProFamilyReplyServiceImpl) {
    if (_rpaComProFamilyReplyServiceImpl.getCsHandshakeStateType() != HandshakeStateType.OK) {
      this._faiForSt(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.control.connect.HandshakeClientMessageProcessorDefaultImpl.faiForSt"));
    } else {

      Optional<ApplicationComProFamily> _optionalPoooApplicationComProFamily = this.rpaComProFamilyManagerAppImpl
          .seeOptional(_rpaComProFamilyReplyServiceImpl.getPType(),
              _rpaComProFamilyReplyServiceImpl.getIVrin());
      if (_optionalPoooApplicationComProFamily.isEmpty()) {

        AbstractComProFamilyWrapper<EntProVer, ApplicationComProFamily> _abstractComProFamilyWrapperVpakea = this.rpaComProFamilyManagerAppImpl
            .geaAbstractComProFamilyWrapper(
                this.pasApplicationCurrentActiveComProFamilyWrapper.getListVrinU(),
                this.pasApplicationCurrentActiveComProFamilyWrapper.getComProFamilyGroupCtgrT());
        this._faiForSt(String.format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.control.connect.HandshakeClientMessageProcessorDefaultImpl.format"),
            _rpaComProFamilyReplyServiceImpl.getPType(),
            _rpaComProFamilyReplyServiceImpl.getIVrin(),
            _abstractComProFamilyWrapperVpakea.getStrIetfe(),
            _abstractComProFamilyWrapperVpakea.getSetVrinU()));
      } else {
        this.panApplicationComProFamily = _optionalPoooApplicationComProFamily.get();
        this._sesworetira();
      }
    }
  }


  public void inttForNeCoCo(NettyChannel _nettyChannel,
      ComProFamilyManagerAppImpl _rpaComProFamilyManagerAppImpl,
      ComProFamilyManagerMutableImpl _rpmComProFamilyManagerMutableImpl) {
    this.nettyChannel = _nettyChannel;
    this.rpaComProFamilyManagerAppImpl = _rpaComProFamilyManagerAppImpl;
    this.pasApplicationCurrentActiveComProFamilyWrapper = _rpaComProFamilyManagerAppImpl.getPsApplicationCurrentActiveComProFamilyWrapper();
    this.rpmComProFamilyManagerMutableImpl = _rpmComProFamilyManagerMutableImpl;
    this.collectionPmsMutatingCurrentActiveComProFamilyWrapper =
        _rpmComProFamilyManagerMutableImpl.getCollectionPsMutatingCurrentActiveComProFamilyWrapper();
    this.listPmnPair = new ArrayList(
        this.collectionPmsMutatingCurrentActiveComProFamilyWrapper.size());
    this._seproruForNeApCo(this.collectionPmsMutatingCurrentActiveComProFamilyWrapper,
        _nettyChannel,
        this.pasApplicationCurrentActiveComProFamilyWrapper);
  }
}
