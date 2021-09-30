package io.github.onograph.cluster.raft.module.cuprot;


public enum AskMessageType {


  AMT_TRX_IN_ASK((byte) 1),

  AMT_STORE_ASK((byte) 2),

  AMT_CS_ASK((byte) 3),

  AMT_STORE_GUID_ASK((byte) 4),

  AMT_SET_SC((byte) 5),

  AMT_SC_FP((byte) 6),

  AMT_GDB_GUID((byte) 7),

  AMT_ALL_GDB_GUID_ASK((byte) 8),

  AMT_STATS((byte) 9),

  AMT_MD_ASK((byte) 10),

  AMT_UNDET((byte) -108);


  private final byte tmByte;

  AskMessageType(byte _tmByte) {
    this.tmByte = _tmByte;
  }


  public static AskMessageType froAskMessageType(byte el2) {

    AskMessageType[] _askMessageTypeArray = values();

    int _iVa = _askMessageTypeArray.length;

    for (

        int _iV = 0; _iV < _iVa; ++_iV) {

      AskMessageType _tmrAskMessageType = _askMessageTypeArray[_iV];
      if (_tmrAskMessageType.tmByte == el2) {
        return _tmrAskMessageType;
      }
    }

    return AMT_UNDET;
  }


  public byte getTmByte() {
    return this.tmByte;
  }


}
