package io.github.onograph.cluster.raft.share.meta.fsm;

import io.github.onograph.cluster.raft.share.meta.FSMData;
import java.util.function.Consumer;


public class FSMEmptyReq<T extends EmptyReq> implements FSM<T> {

  @Override
  public void aplcoaForCoCo(T _tRon, long caIdx, Consumer<FSMData> _consumerClbcFSMData) {
    _consumerClbcFSMData.accept(FSMData.ofFSMData(_tRon));
  }

  @Override
  public void fls() {
  }

  @Override
  public long laapdix() {
    return 0L;
  }
}
