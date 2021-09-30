package io.github.onograph.cluster.raft.control.connect;

import java.util.Objects;


public abstract class AbstractComProFamilyReplyService<IMPL extends Comparable<IMPL>> implements
    HandshakeClientMessageService {


  private final HandshakeStateType csHandshakeStateType;


  private final IMPL iVrin;


  private final String pType;


  AbstractComProFamilyReplyService(HandshakeStateType _csHandshakeStateType, IMPL _impVrin,
      String pType) {
    this.csHandshakeStateType = _csHandshakeStateType;
    this.iVrin = _impVrin;
    this.pType = pType;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      AbstractComProFamilyReplyService _tAbstractComProFamilyReplyService = (AbstractComProFamilyReplyService) obj;
      return Objects.equals(this.iVrin, _tAbstractComProFamilyReplyService.iVrin) &&
          Objects.equals(this.pType, _tAbstractComProFamilyReplyService.pType);
    } else {
      return false;
    }
  }


  public HandshakeStateType getCsHandshakeStateType() {
    return this.csHandshakeStateType;
  }


  public IMPL getIVrin() {
    return this.iVrin;
  }


  public String getPType() {
    return this.pType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.pType, this.iVrin);
  }


}
