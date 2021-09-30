package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.ComProFamily;
import java.util.Collections;
import java.util.Set;


public abstract class AbstractComProFamilyWrapper<U extends Comparable<U>, T extends ComProFamily<U>> {


  private final Set<U> setVrinU;


  private final String strIetfe;


  public AbstractComProFamilyWrapper(Set<U> _setVrinU, String _strIetfe) {
    this.strIetfe = _strIetfe;
    this.setVrinU = Collections.unmodifiableSet(_setVrinU);
  }


  public Set<U> getSetVrinU() {
    return this.setVrinU;
  }


  public String getStrIetfe() {
    return this.strIetfe;
  }
}
