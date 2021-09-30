package io.github.onograph.dbms.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;
import org.eclipse.collections.api.map.primitive.ImmutableIntObjectMap;
import org.eclipse.collections.api.set.primitive.ImmutableIntSet;
import org.eclipse.collections.impl.factory.primitive.IntSets;
import org.neo4j.consistency.RecordType;
import org.neo4j.token.api.TokenNotFoundException;


class NodeStoreWrapperFilterSpec {


  private final ImmutableIntSet ilwndImmutableIntSet;


  private final ImmutableIntSet ilwnokImmutableIntSet;


  private final ImmutableIntObjectMap<ImmutableIntSet> immutableIntObjectMapIpnokImmutableIntSet;


  private final ImmutableIntObjectMap<ImmutableIntSet> immutableIntObjectMapIpnsImmutableIntSet;


  private final ImmutableIntObjectMap<ImmutableIntSet> immutableIntObjectMapIprokImmutableIntSet;


  private final ImmutableIntObjectMap<ImmutableIntSet> immutableIntObjectMapIprsImmutableIntSet;


  private final NodeWrapperInfoMetrics sasNodeWrapperInfoMetrics;


  private final Set<Integer> setIlsInteger;


  private final Set<Integer> setIpsInteger;


  private final Set<Integer> setSriInteger;


  NodeStoreWrapperFilterSpec(int[] _iIlsArray, int[] _iIlwndArray, int[] _iIlwnokArray,
      int[] _iIpsArray, int[] _iIrsArray,
      ImmutableIntObjectMap<ImmutableIntSet> _immutableIntObjectMapIpnokImmutableIntSet,
      ImmutableIntObjectMap<ImmutableIntSet> _immutableIntObjectMapIpnsImmutableIntSet,
      ImmutableIntObjectMap<ImmutableIntSet> _immutableIntObjectMapIprokImmutableIntSet,
      ImmutableIntObjectMap<ImmutableIntSet> _immutableIntObjectMapIprsImmutableIntSet,
      NodeWrapperInfoMetrics _sasNodeWrapperInfoMetrics) {
    this.sasNodeWrapperInfoMetrics = _sasNodeWrapperInfoMetrics;
    this.ilwndImmutableIntSet = IntSets.immutable.of(_iIlwndArray);
    this.ilwnokImmutableIntSet = IntSets.immutable.of(_iIlwnokArray);
    this.setIlsInteger = ConcurrentHashMap.newKeySet();
    this.setIpsInteger = ConcurrentHashMap.newKeySet();
    this.setSriInteger = ConcurrentHashMap.newKeySet();

    IntStream _intStream = Arrays.stream(_iIlsArray);

    Set _set = this.setIlsInteger;
    Objects.requireNonNull(_set);
    _intStream.forEach(_set::add);
    _intStream = Arrays.stream(_iIpsArray);
    _set = this.setIpsInteger;
    Objects.requireNonNull(_set);
    _intStream.forEach(_set::add);
    _intStream = Arrays.stream(_iIrsArray);
    _set = this.setSriInteger;
    Objects.requireNonNull(_set);
    _intStream.forEach(_set::add);
    this.immutableIntObjectMapIpnsImmutableIntSet = _immutableIntObjectMapIpnsImmutableIntSet;
    this.immutableIntObjectMapIpnokImmutableIntSet = _immutableIntObjectMapIpnokImmutableIntSet;
    this.immutableIntObjectMapIprsImmutableIntSet = _immutableIntObjectMapIprsImmutableIntSet;
    this.immutableIntObjectMapIprokImmutableIntSet = _immutableIntObjectMapIprokImmutableIntSet;
  }


  private boolean _isShdknprt(int _iIik, long[] _lgNliArray) {
    if (!this.setIpsInteger.isEmpty()) {
      return !this.setIpsInteger.contains(_iIik);
    } else {

      long[] _lgVarArray;

      int _iV;

      int _iV2;

      long _lgIln;
      if (!this.immutableIntObjectMapIpnsImmutableIntSet.isEmpty()) {

        ImmutableIntSet _lfpsImmutableIntSet = this.immutableIntObjectMapIpnsImmutableIntSet.get(
            _iIik);
        if (_lfpsImmutableIntSet == null) {
          return true;
        } else {
          _lgVarArray = _lgNliArray;
          _iV = _lgNliArray.length;

          for (_iV2 = 0; _iV2 < _iV; ++_iV2) {
            _lgIln = _lgVarArray[_iV2];
            if (_lfpsImmutableIntSet.contains(Math.toIntExact(_lgIln))) {
              return false;
            }
          }

          return true;
        }
      } else if (!this.immutableIntObjectMapIpnokImmutableIntSet.isEmpty()) {

        boolean _isLmn = true;
        _lgVarArray = _lgNliArray;
        _iV = _lgNliArray.length;

        for (_iV2 = 0; _iV2 < _iV; ++_iV2) {
          _lgIln = _lgVarArray[_iV2];

          ImmutableIntSet _lfpkImmutableIntSet = this.immutableIntObjectMapIpnokImmutableIntSet.get(
              Math.toIntExact(_lgIln));
          if (_lfpkImmutableIntSet != null) {
            _isLmn = false;
            if (_lfpkImmutableIntSet.contains(_iIik)) {
              return true;
            }
          }
        }

        return _isLmn;
      } else {
        return true;
      }
    }
  }


  private boolean _isShdkriipp(int _iIik, int _iItr) {
    if (!this.setIpsInteger.isEmpty()) {
      return !this.setIpsInteger.contains(_iIik);
    } else {

      ImmutableIntSet _rfpkImmutableIntSet;
      if (!this.immutableIntObjectMapIprsImmutableIntSet.isEmpty()) {
        _rfpkImmutableIntSet = this.immutableIntObjectMapIprsImmutableIntSet.get(_iIik);
        if (_rfpkImmutableIntSet == null) {
          return true;
        } else {
          return !_rfpkImmutableIntSet.contains(_iItr);
        }
      } else if (!this.immutableIntObjectMapIprokImmutableIntSet.isEmpty()) {
        _rfpkImmutableIntSet = this.immutableIntObjectMapIprokImmutableIntSet.get(_iItr);
        return _rfpkImmutableIntSet == null || _rfpkImmutableIntSet.contains(_iIik);
      } else {
        return true;
      }
    }
  }


  String firrthString(int _iItr,
      io.github.onograph.dbms.utils.NodeStoreWrapperFilterSpec.NodeStoreFilterTokenProvider _ltNodeStoreFilterTokenProvider) {
    if (!this.setSriInteger.contains(_iItr)) {
      try {
        return _ltNodeStoreFilterTokenProvider.lokString(_iItr);
      } catch (

          TokenNotFoundException _tokenNotFoundException) {
        this.setSriInteger.add(_iItr);
        this.sasNodeWrapperInfoMetrics.adcrtForSt(_iItr,
            io.github.onograph.TokenConstants.RELATIONSHIP2);
      }
    }

    return null;
  }


  String[] fitleString(long[] _lgIlArray,
      io.github.onograph.dbms.utils.NodeStoreWrapperFilterSpec.NodeStoreFilterTokenProvider _ltNodeStoreFilterTokenProvider) {

    ArrayList<String> _arrayListLblString = new ArrayList(_lgIlArray.length);

    long[] _lgVArray = _lgIlArray;

    int _iVa = _lgIlArray.length;

    for (

        int _iV = 0; _iV < _iVa; ++_iV) {

      long _lgIll = _lgVArray[_iV];

      int _iIl = Math.toIntExact(_lgIll);
      if (!this.setIlsInteger.contains(_iIl)) {
        try {
          _arrayListLblString.add(_ltNodeStoreFilterTokenProvider.lokString(_iIl));
        } catch (

            TokenNotFoundException _tokenNotFoundException) {
          this.setIlsInteger.add(_iIl);
          this.sasNodeWrapperInfoMetrics.adcrtForSt(_iIl, io.github.onograph.TokenConstants.LABEL);
        }
      }
    }

    return _arrayListLblString.toArray(new String[0]);
  }


  boolean isShddtne(long[] _lgIlArray) {

    long[] _lgVarArray;

    int _iVar;

    int _iVa;

    long _lgIll;
    if (!this.ilwnokImmutableIntSet.isEmpty()) {
      _lgVarArray = _lgIlArray;
      _iVar = _lgIlArray.length;

      for (_iVa = 0; _iVa < _iVar; ++_iVa) {
        _lgIll = _lgVarArray[_iVa];
        if (this.ilwnokImmutableIntSet.contains(Math.toIntExact(_lgIll))) {
          return false;
        }
      }

      return true;
    } else {
      if (!this.ilwndImmutableIntSet.isEmpty()) {
        _lgVarArray = _lgIlArray;
        _iVar = _lgIlArray.length;

        for (_iVa = 0; _iVa < _iVar; ++_iVa) {
          _lgIll = _lgVarArray[_iVa];
          if (this.ilwndImmutableIntSet.contains(Math.toIntExact(_lgIll))) {
            return true;
          }
        }
      }

      return false;
    }
  }


  boolean isShdkprForRe(int _iIik, long[] _lgTeoArray, RecordType _teoRecordType) {
    if (_teoRecordType == RecordType.NODE) {
      return this._isShdknprt(_iIik, _lgTeoArray);
    } else if (_teoRecordType == RecordType.RELATIONSHIP) {

      int _iRt = (int) _lgTeoArray[0];
      return this._isShdkriipp(_iIik, _iRt);
    } else {
      return true;
    }
  }


  @FunctionalInterface
  interface NodeStoreFilterTokenProvider {


    String lokString(int _iVar) throws TokenNotFoundException;
  }
}
