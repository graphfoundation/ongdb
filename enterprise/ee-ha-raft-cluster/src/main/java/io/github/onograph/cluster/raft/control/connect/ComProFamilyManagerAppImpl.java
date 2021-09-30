package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.config.EntProVer;


public class ComProFamilyManagerAppImpl extends
    AbstractComProFamilyManager<EntProVer, ApplicationComProFamily> {


  private final ApplicationCurrentActiveComProFamilyWrapper psApplicationCurrentActiveComProFamilyWrapper;

  public ComProFamilyManagerAppImpl(ApplicationComProFamily[] _pooosApplicationComProFamilyArray,
      ApplicationCurrentActiveComProFamilyWrapper _psApplicationCurrentActiveComProFamilyWrapper) {
    super(ApplicationAbstractComProFamilyWrapper::new, (ignored) ->
    {
      return veonbcmtComparator();
    }, _pooosApplicationComProFamilyArray);
    this.psApplicationCurrentActiveComProFamilyWrapper = _psApplicationCurrentActiveComProFamilyWrapper;
  }


  ApplicationCurrentActiveComProFamilyWrapper getPsApplicationCurrentActiveComProFamilyWrapper() {
    return this.psApplicationCurrentActiveComProFamilyWrapper;
  }
}
