package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.akkamsg.NettyChannel;
import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import io.github.onograph.config.EntProVer;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;


public class ServerComProMessageProcessorHandshakeImpl implements ServerComProMessageProcessor {


  private final io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.ComProFamilyBuilder bspComProFamilyBuilder =
      ComProFamilyWrapper.bulrComProFamilyWrapperComProFamilyBuilder();


  private final CompletableFuture<ComProFamilyWrapper> completableFutureFspComProFamilyWrapper = new CompletableFuture();


  private final CurrentActiveComProFamilyWrapper<EntProVer, ApplicationComProFamily> currentActiveComProFamilyWrapperPasea;


  private final NettyChannel nettyChannel;


  private final ComProFamilyManagerAppImpl rpaComProFamilyManagerAppImpl;


  private final ComProFamilyManagerMutableImpl rpmComProFamilyManagerMutableImpl;


  ServerComProMessageProcessorHandshakeImpl(NettyChannel _nettyChannel,
      ComProFamilyManagerAppImpl _rpaComProFamilyManagerAppImpl,
      ComProFamilyManagerMutableImpl _rpmComProFamilyManagerMutableImpl) {
    this.nettyChannel = _nettyChannel;
    this.rpaComProFamilyManagerAppImpl = _rpaComProFamilyManagerAppImpl;
    this.rpmComProFamilyManagerMutableImpl = _rpmComProFamilyManagerMutableImpl;
    this.currentActiveComProFamilyWrapperPasea = _rpaComProFamilyManagerAppImpl.getPsApplicationCurrentActiveComProFamilyWrapper();
  }


  private void _deleForSt(String m) {
    this.nettyChannel.dipe();
    this.completableFutureFspComProFamilyWrapper.completeExceptionally(
        new ServerException("*** Error: dbaf7647-e934-4109-8e87-097889d4ab1b",
            this.bspComProFamilyBuilder));
  }


  private Set<EntProVer> _survenfSet(
      ComProFamilyRequestServiceImpl _comProFamilyRequestServiceImpl) {
    return this.currentActiveComProFamilyWrapperPasea.mulspevsfSet(
        _comProFamilyRequestServiceImpl.getSetVrinIMPL());
  }


  private Set<String> _survenfSet(
      MutatingComProFamilyRequestService _mutatingComProFamilyRequestService) {
    return this.rpmComProFamilyManagerMutableImpl.surprofOptional(
            _mutatingComProFamilyRequestService.getPType()).map((supported) ->
        {
          return supported.mulspevsfSet(
              _mutatingComProFamilyRequestService.getSetVrinIMPL());
        })
        .orElse(Collections.emptySet());
  }


  CompletableFuture<ComProFamilyWrapper> getCompletableFutureFspComProFamilyWrapper() {
    return this.completableFutureFspComProFamilyWrapper;
  }

  @Override
  public void hadForMu(MutatingComProFamilyRequestService _rpmMutatingComProFamilyRequestService) {

    Optional<MutableComProFamily> _optionalSlceMutableComProFamily =
        this.rpmComProFamilyManagerMutableImpl.seeOptional(
            _rpmMutatingComProFamilyRequestService.getPType(),
            this._survenfSet(_rpmMutatingComProFamilyRequestService));

    MutatingComProReply _rsosMutatingComProReply;
    if (_optionalSlceMutableComProFamily.isPresent()) {

      MutableComProFamily _pmMutableComProFamily = _optionalSlceMutableComProFamily.get();
      this.bspComProFamilyBuilder.moieComProFamilyWrapperComProFamilyBuilder(
          _pmMutableComProFamily);
      _rsosMutatingComProReply = new MutatingComProReply(HandshakeStateType.OK,
          _pmMutableComProFamily.caerString(), _pmMutableComProFamily.getImpl());
    } else {
      _rsosMutatingComProReply = MutatingComProReply.faleMutatingComProReply(
          _rpmMutatingComProFamilyRequestService.getPType());
    }

    this.nettyChannel.wrtanflhFuture(_rsosMutatingComProReply);
  }

  @Override
  public void hadForMu(ChangeComProRequestImpl _sorChangeComProRequestImpl) {

    ComProFamilyWrapper _spComProFamilyWrapper = this.bspComProFamilyBuilder.bulComProFamilyWrapper();

    Optional<ApplicationComProFamily> _optionalSopApplicationComProFamily =
        this.rpaComProFamilyManagerAppImpl.seeOptional(_sorChangeComProRequestImpl.getPType(),
            _sorChangeComProRequestImpl.getVrinEntProVer());

    List<MutableComProFamily> _listSomMutableComProFamily = _sorChangeComProRequestImpl.getListPmPair()
        .stream().map((pair) ->
        {
          return this.rpmComProFamilyManagerMutableImpl
              .seeOptional(
                  pair.first(),
                  pair.other());
        }).flatMap(Optional::stream)
        .collect(Collectors.toList());
    if (_optionalSopApplicationComProFamily.isEmpty()) {
      this.nettyChannel.wrtanflhFuture(ChangeComProReplyImpl.FALE_CHANGE_COM_PRO_REPLY_IMPL);
      this._deleForSt(String.format(io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.control.connect.ServerComProMessageProcessorHandshakeImpl.format3"),
          _sorChangeComProRequestImpl.getPType(), _sorChangeComProRequestImpl.getVrinEntProVer()));
    } else if (_spComProFamilyWrapper.getPaApplicationComProFamily() == null) {
      this.nettyChannel.wrtanflhFuture(ChangeComProReplyImpl.FALE_CHANGE_COM_PRO_REPLY_IMPL);
      this._deleForSt(
          String.format(io.github.onograph.I18N.format(
                  "io.github.onograph.cluster.raft.control.connect.ServerComProMessageProcessorHandshakeImpl.format4"),
              _sorChangeComProRequestImpl.getPType(),
              _sorChangeComProRequestImpl.getVrinEntProVer()));
    } else if (!_optionalSopApplicationComProFamily.get()
        .equals(_spComProFamilyWrapper.getPaApplicationComProFamily())) {
      this.nettyChannel.wrtanflhFuture(ChangeComProReplyImpl.FALE_CHANGE_COM_PRO_REPLY_IMPL);
      this._deleForSt(
          String.format(io.github.onograph.I18N.format(
                  "io.github.onograph.cluster.raft.control.connect.ServerComProMessageProcessorHandshakeImpl.format5"),
              _sorChangeComProRequestImpl.getPType(),
              _sorChangeComProRequestImpl.getVrinEntProVer(),
              _spComProFamilyWrapper.getPaApplicationComProFamily().caerString(),
              _spComProFamilyWrapper.getPaApplicationComProFamily().getImpl()));
    } else if (!_listSomMutableComProFamily.equals(
        _spComProFamilyWrapper.getListPmMutableComProFamily())) {
      this.nettyChannel.wrtanflhFuture(ChangeComProReplyImpl.FALE_CHANGE_COM_PRO_REPLY_IMPL);
      this._deleForSt(String.format(io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.control.connect.ServerComProMessageProcessorHandshakeImpl.format6"),
          _sorChangeComProRequestImpl.getListPmPair(),
          _spComProFamilyWrapper.getListPmMutableComProFamily()));
    } else {

      ChangeComProReplyImpl _rsosChangeComProReplyImpl = new ChangeComProReplyImpl(
          HandshakeStateType.OK);
      this.nettyChannel.wrtanflhFuture(_rsosChangeComProReplyImpl);
      this.completableFutureFspComProFamilyWrapper.complete(_spComProFamilyWrapper);
    }
  }

  @Override
  public void hadForMu(ComProFamilyRequestServiceImpl _comProFamilyRequestServiceImpl) {

    ComProFamilyReplyServiceImpl _rsosComProFamilyReplyServiceImpl;
    if (!_comProFamilyRequestServiceImpl.getPType().equals(
        this.currentActiveComProFamilyWrapperPasea.getComProFamilyGroupCtgrT().lowerName())) {
      _rsosComProFamilyReplyServiceImpl = ComProFamilyReplyServiceImpl.NOROL_COM_PRO_FAMILY_REPLY_SERVICE_IMPL;
      this.nettyChannel.wrtanflhFuture(_rsosComProFamilyReplyServiceImpl);
      this._deleForSt(String.format(io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.control.connect.ServerComProMessageProcessorHandshakeImpl.format"),
          _comProFamilyRequestServiceImpl.getPType()));
    } else {

      Optional<ApplicationComProFamily> _optionalSlceApplicationComProFamily =
          this.rpaComProFamilyManagerAppImpl.seeOptional(_comProFamilyRequestServiceImpl.getPType(),
              this._survenfSet(_comProFamilyRequestServiceImpl));
      if (_optionalSlceApplicationComProFamily.isPresent()) {

        ApplicationComProFamily _psApplicationComProFamily = _optionalSlceApplicationComProFamily.get();
        this.bspComProFamilyBuilder.aplaoComProFamilyWrapperComProFamilyBuilder(
            _psApplicationComProFamily);
        _rsosComProFamilyReplyServiceImpl = new ComProFamilyReplyServiceImpl(HandshakeStateType.OK,
            _psApplicationComProFamily.caerString(),
            _psApplicationComProFamily.getImpl());
        this.nettyChannel.wrtanflhFuture(_rsosComProFamilyReplyServiceImpl);
      } else {
        _rsosComProFamilyReplyServiceImpl = ComProFamilyReplyServiceImpl.NOROL_COM_PRO_FAMILY_REPLY_SERVICE_IMPL;
        this.nettyChannel.wrtanflhFuture(_rsosComProFamilyReplyServiceImpl);
        this._deleForSt(String.format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.control.connect.ServerComProMessageProcessorHandshakeImpl.format2"),
            _comProFamilyRequestServiceImpl.getPType(),
            _comProFamilyRequestServiceImpl.getSetVrinIMPL()));
      }
    }
  }
}
