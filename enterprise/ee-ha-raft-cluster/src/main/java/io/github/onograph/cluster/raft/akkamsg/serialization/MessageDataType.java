package io.github.onograph.cluster.raft.akkamsg.serialization;


public enum MessageDataType {


  CT((byte) 0),

  DUPD_MD((byte) 1),

  CON_ENT_TMS((byte) 2),

  MSG((byte) 3);


  private final byte mcd;

  MessageDataType(byte _cmByte) {
    this.mcd = _cmByte;
  }


  public byte getMcd() {
    return this.mcd;
  }
}
