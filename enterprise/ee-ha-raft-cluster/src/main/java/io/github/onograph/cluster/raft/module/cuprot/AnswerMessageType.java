package io.github.onograph.cluster.raft.module.cuprot;


public enum AnswerMessageType {


  AMT_TRX((byte) 1),

  AMT_STORE_GUID((byte) 2),

  AMT_FP((byte) 3),

  AMT_SC_COMPLETE((byte) 4),

  AMT_CSNAP((byte) 5),

  AMT_TRX_IS_COMPLETE((byte) 6),

  AMT_SETUP_CT_ANSWER((byte) 7),

  AMT_IS_ANSWER((byte) 8),

  AMT_GDB_GUID_ANSWER((byte) 9),

  AMT_ALL_GDB_GUID_ANSWER((byte) 10),

  AMT_D_ANSWER((byte) 11),

  AMT_MD_ANSWER((byte) 12),

  AMT_ERR((byte) -57),

  AMT_UNDET((byte) -56);


  private final byte mTypeByte;

  AnswerMessageType(byte _tmByte) {
    this.mTypeByte = _tmByte;
  }


  public static AnswerMessageType mTypeByte(byte el2) {

    AnswerMessageType[] _answerMessageTypeArray = values();

    int _iVa = _answerMessageTypeArray.length;

    for (

        int _iV = 0; _iV < _iVa; ++_iV) {

      AnswerMessageType _tmrAnswerMessageType = _answerMessageTypeArray[_iV];
      if (_tmrAnswerMessageType.mTypeByte == el2) {
        return _tmrAnswerMessageType;
      }
    }

    return AMT_UNDET;
  }


  public byte getmTypeByte() {
    return this.mTypeByte;
  }


}
