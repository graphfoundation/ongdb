package io.github.onograph.cluster.raft.share.meta.fsm.lcservice;


interface Leaseable {


  static int getNext(int _iIc) {

    int _iIc2 = _iIc + 1;
    if (_iIc2 == -1) {
      ++_iIc2;
    }

    return _iIc2;
  }


  int getLeaseId();


  Object oweObject();
}
