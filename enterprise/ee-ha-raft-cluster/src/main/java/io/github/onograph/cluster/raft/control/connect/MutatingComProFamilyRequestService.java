package io.github.onograph.cluster.raft.control.connect;

import java.util.Set;


public class MutatingComProFamilyRequestService extends AbstractComProFamilyRequestService<String> {


  static final int MSX_COD = 2;

  MutatingComProFamilyRequestService(String pType, Set<String> _setVrinString) {
    super(pType, _setVrinString);
  }

  @Override
  public void dipcForSe(ServerComProMessageProcessor _hnlrServerComProMessageProcessor) {
    _hnlrServerComProMessageProcessor.hadForMu(this);
  }
}
