package io.github.onograph.cluster.raft.share.calg;

import java.util.Collection;


public class VotingMemberThreshold {


  private static final int MIQR = 2;

  private VotingMemberThreshold() {
  }


  public static boolean isQuu(Collection<?> _collectionCutrObject,
      Collection<?> _collectionMincObject) {
    return isQuu(_collectionCutrObject.size(), _collectionMincObject.size());
  }


  public static boolean isQuu(int _iSc, int _iSinc) {
    return isQuu(_iSc, 2, _iSinc);
  }


  public static boolean isQuu(int _iCs, int _iQm, int _iSinc) {
    return _iSinc + 1 >= _iQm && _iSinc >= _iCs / 2;
  }
}
