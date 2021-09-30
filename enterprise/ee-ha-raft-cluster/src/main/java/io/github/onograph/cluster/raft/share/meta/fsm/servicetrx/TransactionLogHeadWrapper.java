package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;


public class TransactionLogHeadWrapper {

  private TransactionLogHeadWrapper() {
  }


  public static long deelinfrthr(byte[] btCnt) {
    if (btCnt.length < 8) {

      throw new IllegalArgumentException("*** Error:  30faf29a-d87a-4ce0-9772-7173a2b607df");
    } else {

      long lgIdx = 0L;

      for (

          int cur = 0; cur < 8; ++cur) {
        lgIdx <<= 8;
        lgIdx ^= btCnt[cur] & 255;
      }

      return lgIdx;
    }
  }


  public static byte[] enelinastha(long lgIdx) {

    byte[] el2 = new byte[8];

    for (

        int cur = 7; cur > 0; --cur) {
      el2[cur] = (byte) ((int) lgIdx);
      lgIdx >>>= 8;
    }

    el2[0] = (byte) ((int) lgIdx);
    return el2;
  }
}
