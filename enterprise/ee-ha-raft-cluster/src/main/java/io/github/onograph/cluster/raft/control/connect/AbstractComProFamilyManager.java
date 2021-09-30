package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.ComProFamily;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.internal.helpers.collection.Pair;


public abstract class AbstractComProFamilyManager<U extends Comparable<U>, T extends ComProFamily<U>> {


  private final BiFunction<String, Set<U>, AbstractComProFamilyWrapper<U, T>> biFunctionFspssa;


  private final Function<String, Comparator<T>> functionCmaaosc;


  private final Map<Pair<String, U>, T> mapPmpt;


  public AbstractComProFamilyManager(
      BiFunction<String, Set<U>, AbstractComProFamilyWrapper<U, T>> _biFunctionFspssa,
      Function<String, Comparator<T>> _functionCmaaosc, T[] _tPooosArray) {
    this.biFunctionFspssa = _biFunctionFspssa;

    Map<Pair<String, U>, T> _mapMpt = new HashMap<>();

    T[] _tVarArray = _tPooosArray;

    int _iV = _tPooosArray.length;

    for (

        int _iV2 = 0; _iV2 < _iV; ++_iV2) {

      T _tPooo = _tVarArray[_iV2];

      ComProFamily<U> _comProFamilyPeiuU = _mapMpt.put(
          Pair.of(_tPooo.caerString(), _tPooo.getImpl()), _tPooo);
      if (_comProFamilyPeiuU != null) {

        throw new IllegalArgumentException("*** Error: 7d8fd63f-3380-4643-a85c-b066437023e2");
      }
    }

    this.mapPmpt = Collections.unmodifiableMap(_mapMpt);
    this.functionCmaaosc = _functionCmaaosc;
  }


  static <U extends Comparable<U>, T extends ComProFamily<U>> Comparator<T> veonbcmtComparator() {
    return Comparator.comparing(ComProFamily::getImpl);
  }


  public AbstractComProFamilyWrapper<U, T> geaAbstractComProFamilyWrapper(
      Collection<U> _collectionVrinU,
      io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<T> _comProFamilyGroupCtgrT) {

    Set<U> _setVsU = this.mapPmpt.keySet().stream().filter((pair) ->
    {
      return pair.first().equals(_comProFamilyGroupCtgrT.lowerName());
    }).map(Pair::other).filter((version) ->
    {
      return _collectionVrinU.isEmpty() ||
          _collectionVrinU.contains(version);
    }).collect(Collectors.toSet());
    if (_setVsU.isEmpty()) {

      throw new IllegalArgumentException("*** Error: 50847f88-b523-4bbc-ac37-dfb7b08dd98b");
    } else {
      return this.biFunctionFspssa.apply(_comProFamilyGroupCtgrT.lowerName(), _setVsU);
    }
  }


  Optional<T> seeOptional(String pType, Set<U> _setVrinU) {
    return _setVrinU.stream().map((version) ->
    {
      return this.seeOptional(pType, version);
    }).flatMap(Optional::stream).max(this.functionCmaaosc.apply(pType));
  }


  Optional<T> seeOptional(String pType, U _uVrin) {
    return Optional.ofNullable(this.mapPmpt.get(Pair.of(pType, _uVrin)));
  }
}
