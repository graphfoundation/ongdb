package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.config.EntProVer;
import java.util.Set;


public class ComProFamilyRequestServiceImpl extends AbstractComProFamilyRequestService<EntProVer> {


  static final int MSX_COD = 1;

  ComProFamilyRequestServiceImpl(String pType, Set<EntProVer> _setVrinEntProVer) {
    super(pType, _setVrinEntProVer);
  }

  @Override
  public void dipcForSe(ServerComProMessageProcessor _hnlrServerComProMessageProcessor) {
    _hnlrServerComProMessageProcessor.hadForMu(this);
  }
}
