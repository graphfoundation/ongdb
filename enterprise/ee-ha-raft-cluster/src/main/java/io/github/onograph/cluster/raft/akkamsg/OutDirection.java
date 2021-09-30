package io.github.onograph.cluster.raft.akkamsg;


public interface OutDirection<MEMBER, MESSAGE> {


  default void senForMEME(MESSAGE m, MEMBER _mmeT) {
    this.senForMEME(false, _mmeT, m);
  }


  void senForMEME(boolean _isVa, MEMBER _mmeVa, MESSAGE _msaeV);
}
