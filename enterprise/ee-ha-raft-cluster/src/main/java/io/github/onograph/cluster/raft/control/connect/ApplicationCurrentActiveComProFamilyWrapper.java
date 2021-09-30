package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.config.EntProVer;
import java.util.List;


public class ApplicationCurrentActiveComProFamilyWrapper extends
    CurrentActiveComProFamilyWrapper<EntProVer, ApplicationComProFamily> {

  private ApplicationCurrentActiveComProFamilyWrapper(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<ApplicationComProFamily> _comProFamilyGroupCtgrApplicationComProFamily,
      List<EntProVer> _listVrinEntProVer) {
    super(_comProFamilyGroupCtgrApplicationComProFamily, _listVrinEntProVer);
  }


  public static ApplicationCurrentActiveComProFamilyWrapper alkopolApplicationCurrentActiveComProFamilyWrapper(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<ApplicationComProFamily> _comProFamilyGroupCtgrApplicationComProFamily) {
    return new ApplicationCurrentActiveComProFamilyWrapper(
        _comProFamilyGroupCtgrApplicationComProFamily, List.of());
  }


  public static ApplicationCurrentActiveComProFamilyWrapper foptoApplicationCurrentActiveComProFamilyWrapper(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<ApplicationComProFamily> _comProFamilyGroupCtgrApplicationComProFamily,
      List<EntProVer> _listVrinEntProVer) {
    return new ApplicationCurrentActiveComProFamilyWrapper(
        _comProFamilyGroupCtgrApplicationComProFamily, _listVrinEntProVer);
  }
}
