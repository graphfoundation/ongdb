package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.ComProFamily;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public abstract class CurrentActiveComProFamilyWrapper<U extends Comparable<U>, T extends ComProFamily<U>> {


  private final io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<T> comProFamilyGroupCtgrT;


  private final List<U> listVrinU;

  CurrentActiveComProFamilyWrapper(
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<T> _comProFamilyGroupCtgrT,
      List<U> _listVrinU) {
    this.comProFamilyGroupCtgrT = _comProFamilyGroupCtgrT;
    this.listVrinU = Collections.unmodifiableList(_listVrinU);
  }


  public io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<T> getComProFamilyGroupCtgrT() {
    return this.comProFamilyGroupCtgrT;
  }


  public List<U> getListVrinU() {
    return this.listVrinU;
  }


  public Set<U> mulspevsfSet(Set<U> _setVrU) {
    if (this.getListVrinU().isEmpty()) {
      return _setVrU;
    } else {

      Stream _stream = _setVrU.stream();

      List _list = this.getListVrinU();
      Objects.requireNonNull(_list);
      return (Set) _stream.filter(_list::contains).collect(Collectors.toSet());
    }
  }
}
