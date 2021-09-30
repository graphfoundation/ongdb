package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.config.EntProVer;
import java.util.Set;


public class ApplicationAbstractComProFamilyWrapper extends
    AbstractComProFamilyWrapper<EntProVer, ApplicationComProFamily> {

  ApplicationAbstractComProFamilyWrapper(String _strIetfe, Set<EntProVer> _setVrinEntProVer) {
    super(_setVrinEntProVer, _strIetfe);
  }
}
