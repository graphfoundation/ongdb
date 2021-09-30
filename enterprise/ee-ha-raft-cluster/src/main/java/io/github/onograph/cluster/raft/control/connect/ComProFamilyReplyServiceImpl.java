package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.config.EntProVer;


public class ComProFamilyReplyServiceImpl extends AbstractComProFamilyReplyService<EntProVer> {


  static final int MSX_COD = 0;


  static final ComProFamilyReplyServiceImpl NOROL_COM_PRO_FAMILY_REPLY_SERVICE_IMPL;

  static {
    NOROL_COM_PRO_FAMILY_REPLY_SERVICE_IMPL = new ComProFamilyReplyServiceImpl(
        HandshakeStateType.ERROR, "", new EntProVer(0, 0));
  }

  ComProFamilyReplyServiceImpl(HandshakeStateType _csHandshakeStateType, String pType,
      EntProVer _vrinEntProVer) {
    super(_csHandshakeStateType, _vrinEntProVer, pType);
  }

  @Override
  public void dipcForHa(HandshakeClientMessageProcessor _hnlrHandshakeClientMessageProcessor) {
    _hnlrHandshakeClientMessageProcessor.hadForCh(this);
  }
}
