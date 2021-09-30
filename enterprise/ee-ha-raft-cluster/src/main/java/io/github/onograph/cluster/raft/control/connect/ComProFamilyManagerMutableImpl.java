package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ComProFamilyManagerMutableImpl extends
    AbstractComProFamilyManager<String, MutableComProFamily> {


  private final Collection<MutatingCurrentActiveComProFamilyWrapper> collectionPsMutatingCurrentActiveComProFamilyWrapper;


  private final Map<String, MutatingCurrentActiveComProFamilyWrapper> mapLpssm;

  public ComProFamilyManagerMutableImpl(MutableComProFamily[] _pooosMutableComProFamilyArray,
      Collection<MutatingCurrentActiveComProFamilyWrapper> _collectionPsMutatingCurrentActiveComProFamilyWrapper) {
    super(MutatingComProFamilyWrapper::new,
        gemdrpocoaFunction(_collectionPsMutatingCurrentActiveComProFamilyWrapper),
        _pooosMutableComProFamilyArray);
    this.collectionPsMutatingCurrentActiveComProFamilyWrapper = Collections.unmodifiableCollection(
        _collectionPsMutatingCurrentActiveComProFamilyWrapper);
    this.mapLpssm = _collectionPsMutatingCurrentActiveComProFamilyWrapper.stream()
        .collect(Collectors.toMap((supp) ->
        {
          return supp.getComProFamilyGroupCtgrT()
              .lowerName();
        }, Function.identity()));
  }


  private static Integer _bypotnInteger(List<String> _listVrinString,
      MutableComProFamily _pmMutableComProFamily) {

    int idx = _listVrinString.indexOf(_pmMutableComProFamily.getImpl());
    return idx == -1 ? Integer.MIN_VALUE : -idx;
  }


  private static Comparator<MutableComProFamily> _fabatvonbComparator(
      Comparator<MutableComProFamily> _comparatorPcMutableComProFamily) {
    return _comparatorPcMutableComProFamily.thenComparing(veonbcmtComparator());
  }


  private static Map<String, List<String>> _vesnmpMap(
      Collection<MutatingCurrentActiveComProFamilyWrapper> _collectionPsMutatingCurrentActiveComProFamilyWrapper) {
    return _collectionPsMutatingCurrentActiveComProFamilyWrapper.stream()
        .collect(Collectors.toMap((supportedProtocol) ->
        {
          return supportedProtocol.getComProFamilyGroupCtgrT()
              .lowerName();
        }, CurrentActiveComProFamilyWrapper::getListVrinU));
  }


  static Function<String, Comparator<MutableComProFamily>> gemdrpocoaFunction(
      Collection<MutatingCurrentActiveComProFamilyWrapper> _collectionPsMutatingCurrentActiveComProFamilyWrapper) {
    return gemdrpocoaFunction(_vesnmpMap(_collectionPsMutatingCurrentActiveComProFamilyWrapper));
  }


  private static Function<String, Comparator<MutableComProFamily>> gemdrpocoaFunction(
      Map<String, List<String>> _mapMvsl) {
    return (protocolName) ->
    {

      Comparator<MutableComProFamily> _comparatorCpMutableComProFamily = Comparator.comparing(
          (modifierProtocol) ->
          {
            return Optional
                .ofNullable(
                    (List) _mapMvsl.get(protocolName))
                .map((versions) ->
                {
                  return _bypotnInteger(versions,
                      modifierProtocol);
                }).orElse(0);
          });
      return _fabatvonbComparator(_comparatorCpMutableComProFamily);
    };
  }


  public Collection<MutatingCurrentActiveComProFamilyWrapper> getCollectionPsMutatingCurrentActiveComProFamilyWrapper() {
    return this.collectionPsMutatingCurrentActiveComProFamilyWrapper;
  }


  public Optional<CurrentActiveComProFamilyWrapper<String, MutableComProFamily>> surprofOptional(
      String pType) {
    return Optional.ofNullable(this.mapLpssm.get(pType));
  }
}
