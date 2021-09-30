package io.github.onograph.cluster.raft.control.connect;

import java.util.Objects;


public class ChangeComProReplyImpl implements HandshakeClientMessageService {


  public static final ChangeComProReplyImpl FALE_CHANGE_COM_PRO_REPLY_IMPL;


  static final int MSX_COD = 2;

  static {
    FALE_CHANGE_COM_PRO_REPLY_IMPL = new ChangeComProReplyImpl(HandshakeStateType.ERROR);
  }


  private final HandshakeStateType stat;

  ChangeComProReplyImpl(HandshakeStateType stat) {
    this.stat = stat;
  }

  @Override
  public void dipcForHa(HandshakeClientMessageProcessor _hnlrHandshakeClientMessageProcessor) {
    _hnlrHandshakeClientMessageProcessor.hadForCh(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ChangeComProReplyImpl _tChangeComProReplyImpl = (ChangeComProReplyImpl) obj;
      return this.stat == _tChangeComProReplyImpl.stat;
    } else {
      return false;
    }
  }


  public HandshakeStateType getStat() {
    return this.stat;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.stat);
  }


}
