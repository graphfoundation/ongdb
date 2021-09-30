package io.github.onograph.cluster.raft.control;

import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class CPFProComFamilyProvider<O extends io.github.onograph.cluster.raft.control.CPFConfigurator.CPFDirection> {


  private final Map<ApplicationComProFamily, io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<O, ?>> mapIsalrac;


  private final Map<MutableComProFamily, MutatingProComClientManager<O>> mdrSrt;

  public CPFProComFamilyProvider(
      Collection<io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<O, ?>> _collectionIsalrAbstractBuilder,
      Collection<MutatingProComClientManager<O>> mdrSrt) {

    Map<ApplicationComProFamily, io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<O, ?>> _mapItac = new HashMap();
    _collectionIsalrAbstractBuilder.forEach((installer) ->
    {
      this._adtForMaTP(_mapItac, installer.getPaApplicationComProFamily(), installer);
    });
    this.mapIsalrac = Collections.unmodifiableMap(_mapItac);

    Map<MutableComProFamily, MutatingProComClientManager<O>> _mapImtmm = new HashMap();
    mdrSrt.forEach((installer) ->
    {
      installer.prtoCollection().forEach((protocol) ->
      {
        this._adtForMaTP(_mapImtmm, protocol, installer);
      });
    });
    this.mdrSrt = Collections.unmodifiableMap(_mapImtmm);
  }


  private <T, P extends ComProFamily> void _adtForMaTP(Map<P, T> _mapMstpt, P _pPooo, T _tIsalr) {

    T _tO = _mapMstpt.put(_pPooo, _tIsalr);
    if (_tO != null) {

      throw new IllegalArgumentException("*** Error: 051f1bfd-8eb9-4419-a1c3-92beadd4b0b7");
    }
  }


  private void _eneknpoForCoOb(Object _obIp, ComProFamily _poooComProFamily) {
    if (_obIp == null) {

      throw new IllegalStateException("*** Error: 519be75c-7d12-4b4e-bfde-7b7d71df83fc");
    }
  }


  private void _enenduaForLiMu(
      List<MutatingProComClientManager<O>> _listMpiMutatingProComClientManager,
      MutableComProFamily _pmMutableComProFamily) {

    boolean _isId = _listMpiMutatingProComClientManager.stream().flatMap((modifier) ->
    {
      return modifier.prtoCollection().stream();
    }).anyMatch((protocol) ->
    {
      return protocol.caerString()
          .equals(_pmMutableComProFamily.caerString());
    });
    if (_isId) {

      throw new IllegalArgumentException("*** Error: 0ca2cb94-11bd-4c55-9ab3-f450f6f6404f");
    }
  }


  private List<MutatingProComClientManager<O>> _gemdrpoinlList(
      ComProFamilyWrapper _spComProFamilyWrapper) {

    List<MutatingProComClientManager<O>> _listIpmMutatingProComClientManager = new ArrayList();

    Iterator _iterator = _spComProFamilyWrapper.getListPmMutableComProFamily().iterator();

    while (_iterator.hasNext()) {

      MutableComProFamily _pmMutableComProFamily = (MutableComProFamily) _iterator.next();
      this._enenduaForLiMu(_listIpmMutatingProComClientManager, _pmMutableComProFamily);

      MutatingProComClientManager<O> _mutatingProComClientManagerIpO = this.mdrSrt.get(
          _pmMutableComProFamily);
      this._eneknpoForCoOb(_mutatingProComClientManagerIpO, _pmMutableComProFamily);
      _listIpmMutatingProComClientManager.add(_mutatingProComClientManagerIpO);
    }

    return _listIpmMutatingProComClientManager;
  }


  public CPFConfigurator<O> intlfCPFConfigurator(ComProFamilyWrapper _spComProFamilyWrapper) {

    ApplicationComProFamily _paApplicationComProFamily = _spComProFamilyWrapper.getPaApplicationComProFamily();

    io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<O, ?> _abstractBuilderIpoo =
        this.mapIsalrac.get(_paApplicationComProFamily);
    this._eneknpoForCoOb(_abstractBuilderIpoo, _paApplicationComProFamily);
    return _abstractBuilderIpoo.cra(this._gemdrpoinlList(_spComProFamilyWrapper));
  }
}
