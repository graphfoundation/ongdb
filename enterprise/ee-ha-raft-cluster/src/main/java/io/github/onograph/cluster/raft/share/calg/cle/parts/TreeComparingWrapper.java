package io.github.onograph.cluster.raft.share.calg.cle.parts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;


class TreeComparingWrapper<K extends Comparable<K>, V> {


  private final TreeMap<K, V> treeMapTkv = new TreeMap();


  private K kKe;


  private V vEv;


  public Set<Entry<K, V>> enrseSet() {
    return this.treeMapTkv.entrySet();
  }


  public V getVEv() {
    return this.vEv;
  }


  io.github.onograph.cluster.raft.share.calg.cle.parts.TreeComparingWrapper.KeyValueLimit<K, V> lokTreeComparingWrapperKeyValueLimit(
      K _kA) {
    if (this.kKe != null && this.kKe.compareTo(_kA) <= 0) {
      return new io.github.onograph.cluster.raft.share.calg.cle.parts.TreeComparingWrapper.KeyValueLimit(
          null, this.vEv);
    } else {

      Entry<K, V> _entryEtykv = this.treeMapTkv.floorEntry(_kA);
      return new io.github.onograph.cluster.raft.share.calg.cle.parts.TreeComparingWrapper.KeyValueLimit(
          (Comparable) this.treeMapTkv.higherKey(_kA),
          _entryEtykv != null ? _entryEtykv.getValue() : null);
    }
  }


  Collection<V> relefoCollection(K _kFro, V val) {

    Collection<V> _collectionRmvdV = new ArrayList<>();

    Iterator<V> _iteratorIV = this.treeMapTkv.tailMap(_kFro).values().iterator();

    while (_iteratorIV.hasNext()) {
      _collectionRmvdV.add(_iteratorIV.next());
      _iteratorIV.remove();
    }

    this.treeMapTkv.put(_kFro, val);
    this.kKe = _kFro;
    this.vEv = val;
    return _collectionRmvdV;
  }


  public Collection<V> reoCollection(K _kTl) {

    Collection<V> _collectionRmvdV = new ArrayList<>();

    K _kFor = this.treeMapTkv.floorKey(_kTl);

    Iterator<V> _iteratorIV = this.treeMapTkv.headMap(_kFor, false).values().iterator();

    while (_iteratorIV.hasNext()) {
      _collectionRmvdV.add(_iteratorIV.next());
      _iteratorIV.remove();
    }

    if (this.treeMapTkv.isEmpty()) {
      this.kKe = null;
      this.vEv = null;
    }

    return _collectionRmvdV;
  }


  static class KeyValueLimit<K, V> {


    private final K kLmt;


    private final V val;

    KeyValueLimit(K _kLmt, V val) {
      this.kLmt = _kLmt;
      this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.share.calg.cle.parts.TreeComparingWrapper.KeyValueLimit<?, ?> _keyValueLimitToo =
            (io.github.onograph.cluster.raft.share.calg.cle.parts.TreeComparingWrapper.KeyValueLimit) obj;
        return Objects.equals(this.kLmt, _keyValueLimitToo.kLmt) && Objects.equals(this.val,
            _keyValueLimitToo.val);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.kLmt, this.val);
    }


    Optional<K> liiOptional() {
      return Optional.ofNullable(this.kLmt);
    }


    Optional<V> vauOptional() {
      return Optional.ofNullable(this.val);
    }
  }
}
