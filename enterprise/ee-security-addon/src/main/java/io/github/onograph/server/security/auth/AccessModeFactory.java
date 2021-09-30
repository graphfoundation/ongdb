package io.github.onograph.server.security.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.collections.api.map.primitive.MutableIntObjectMap;
import org.eclipse.collections.api.set.primitive.IntSet;
import org.eclipse.collections.api.set.primitive.MutableIntSet;
import org.eclipse.collections.impl.factory.primitive.IntObjectMaps;
import org.eclipse.collections.impl.factory.primitive.IntSets;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource.DatabaseScope;
import org.neo4j.internal.kernel.api.security.FunctionSegment;
import org.neo4j.internal.kernel.api.security.LabelSegment;
import org.neo4j.internal.kernel.api.security.LoginContext.IdLookup;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.ProcedureSegment;
import org.neo4j.internal.kernel.api.security.RelTypeSegment;
import org.neo4j.internal.kernel.api.security.Segment;


class AccessModeFactory {


  private final AdminAccessModeEnterpriseImpl.Factory aamFactory = new AdminAccessModeEnterpriseImpl.Factory();


  private final boolean isIa;


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapAaeb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapAsceb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapEafeb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapFabeeb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapFabeem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapFaeem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapFbeem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapFeem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapIsaeb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapLapareb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapLapaweb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapLareb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapLaseb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapLawnceb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapLawndeb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapLrem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapLsem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapLtem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapLwncem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapLwndem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapPabeeb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapPaeeb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPafsnem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPafsnwem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPafsrem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPafsrwem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPbeem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPeem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntObjectMap<IntSet>> mapPfsnem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntObjectMap<IntSet>> mapPfsnwem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntObjectMap<IntSet>> mapPfsrem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntObjectMap<IntSet>> mapPfsrwem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPnem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPnwem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPrem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapPrwem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapTaleb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapTawrceb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapTawrdeb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapTrapareb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapTrapaweb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapTrateb = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapTrtem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapTwrcem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> mapTwrdem = new HashMap();


  private final Map<ElementEntitlementDTO.EntitlementActionType, Boolean> mapWaeb = new HashMap();


  private final IdLookup rsleIdLookup;


  private final Set<String> setRlsString;


  private final String strDtbs;


  private final String strNdd;


  private boolean isTkn;


  private boolean isWs;


  AccessModeFactory(boolean _isAi, IdLookup _rsleIdLookup, Set<String> _setRlsString,
      String _strDdn, String _strDtbs) {
    this.isIa = _isAi;
    this.setRlsString = _setRlsString;
    this.rsleIdLookup = _rsleIdLookup;
    this.strDtbs = _strDtbs;
    this.strNdd = _strDdn;

    ElementEntitlementDTO.EntitlementActionType[] _entitlementActionTypeArray = ElementEntitlementDTO.EntitlementActionType.values();

    int _iVar = _entitlementActionTypeArray.length;

    for (

        int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType = _entitlementActionTypeArray[_iVar2];
      this.mapLtem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapTrtem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPafsnem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPafsrem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPnem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPrem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPfsnem.put(_tpEntitlementActionType, IntObjectMaps.mutable.empty());
      this.mapPfsrem.put(_tpEntitlementActionType, IntObjectMaps.mutable.empty());
      this.mapLsem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapLrem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapLwncem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapLwndem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapTwrcem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapTwrdem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPafsnwem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPafsrwem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPnwem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPrwem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPfsnwem.put(_tpEntitlementActionType, IntObjectMaps.mutable.empty());
      this.mapPfsrwem.put(_tpEntitlementActionType, IntObjectMaps.mutable.empty());
      this.mapPeem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapPbeem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapFeem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapFbeem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapFaeem.put(_tpEntitlementActionType, IntSets.mutable.empty());
      this.mapFabeem.put(_tpEntitlementActionType, IntSets.mutable.empty());
    }
  }


  private void _adlbrseForMuSe(MutableIntSet _bowMutableIntSet, SecurityElement.Label _rsucLabel) {

    int _iIl = this._reoelbiForSt(_rsucLabel.geleString());
    if (_iIl != -1) {
      _bowMutableIntSet.add(_iIl);
    }
  }


  private void _adleForMuLa(int _iIp, LabelSegment _labelSegment,
      MutableIntObjectMap<IntSet> _mutableIntObjectMapMIntSet) {

    MutableIntSet _pfsMutableIntSet = (MutableIntSet) _mutableIntObjectMapMIntSet.getIfAbsentPut(
        _iIp, IntSets.mutable.empty());
    this._adleForMuLa(_pfsMutableIntSet, _labelSegment);
  }


  private void _adleForMuLa(MutableIntSet _bowMutableIntSet, LabelSegment _labelSegment) {

    int _iIl = this._reoelbiForSt(_labelSegment.getLabel());
    if (_iIl != -1) {
      _bowMutableIntSet.add(_iIl);
    }
  }


  private void _adpigaiForEl(ElementEntitlementDTO _piieeElementEntitlementDTO) {

    DatabaseScope _sdDatabaseScope;
    if (_piieeElementEntitlementDTO.getIsDa()) {
      _sdDatabaseScope = DatabaseScope.ALL;
    } else if (_piieeElementEntitlementDTO.getDefGdbName()) {
      _sdDatabaseScope = new DatabaseScope(this.strNdd);
    } else {
      _sdDatabaseScope = new DatabaseScope(_piieeElementEntitlementDTO.getGdbName());
    }

    AdminActionOnResource _adminActionOnResource =
        new AdminActionOnResource(_piieeElementEntitlementDTO.getPrivilegeAction(),
            _sdDatabaseScope, _piieeElementEntitlementDTO.getSegment());
    if (_piieeElementEntitlementDTO.getTpEntitlementActionType().isGrt()) {
      this.aamFactory.aloAdminAccessModeEnterpriseImplFactory(_adminActionOnResource);
    } else {
      this.aamFactory.denAdminAccessModeEnterpriseImplFactory(_adminActionOnResource);
    }
  }


  private void _adrteForMuRe(int _iPi, MutableIntObjectMap<IntSet> _mutableIntObjectMapMIntSet,
      RelTypeSegment _relTypeSegment) {

    MutableIntSet _sfpMutableIntSet = (MutableIntSet) _mutableIntObjectMapMIntSet.getIfAbsentPut(
        _iPi, IntSets.mutable.empty());
    this._adrteForMuRe(_sfpMutableIntSet, _relTypeSegment);
  }


  private void _adrteForMuRe(MutableIntSet _bowMutableIntSet, RelTypeSegment _relTypeSegment) {

    int _iItr = this._revrtidForSt(_relTypeSegment.getRelType());
    if (_iItr != -1) {
      _bowMutableIntSet.add(_iItr);
    }
  }


  private void _hadeceForSeEl(Segment _qaiirSegment,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {

    int[] _iVarArray;

    int _iVa;

    int _iV;

    int _iIf;
    if (_qaiirSegment instanceof ProcedureSegment) {
      if (_qaiirSegment.equals(ProcedureSegment.ALL)) {
        this.mapPaeeb.put(_tpEntitlementActionType, true);
      } else {

        ProcedureSegment _qpProcedureSegment = (ProcedureSegment) _qaiirSegment;
        _iVarArray = this.rsleIdLookup.getProcedureIds(_qpProcedureSegment.getProcedure());
        _iVa = _iVarArray.length;

        for (_iV = 0; _iV < _iVa; ++_iV) {
          _iIf = _iVarArray[_iV];
          this.mapPeem.get(_tpEntitlementActionType).add(_iIf);
        }
      }
    } else {
      if (!(_qaiirSegment instanceof FunctionSegment)) {

        throw new IllegalStateException("*** Error: f3c960c2-88ee-4a33-ba1a-09a00fbb623d");
      }

      if (_qaiirSegment.equals(FunctionSegment.ALL)) {
        this.mapEafeb.put(_tpEntitlementActionType, true);
      } else {

        FunctionSegment _qfFunctionSegment = (FunctionSegment) _qaiirSegment;
        _iVarArray = this.rsleIdLookup.getFunctionIds(_qfFunctionSegment.getFunction());
        _iVa = _iVarArray.length;

        for (_iV = 0; _iV < _iVa; ++_iV) {
          _iIf = _iVarArray[_iV];
          this.mapFeem.get(_tpEntitlementActionType).add(_iIf);
        }

        _iVarArray = this.rsleIdLookup.getAggregatingFunctionIds(_qfFunctionSegment.getFunction());
        _iVa = _iVarArray.length;

        for (_iV = 0; _iV < _iVa; ++_iV) {
          _iIf = _iVarArray[_iV];
          this.mapFaeem.get(_tpEntitlementActionType).add(_iIf);
        }
      }
    }
  }


  private void _hadmcForSeSeEl(SecurityElement securityElement, Segment _segment,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    if (!_tpEntitlementActionType.isDe() || securityElement.typSecurityElementElementType()
        != SecurityElement.ElementType.PROPERTY) {
      this._haearecqlrForSeElStMaMaMaMa(this.mapTaleb, this.mapLtem, this.mapTrtem, this.mapTrateb,
          _segment,
          io.github.onograph.TokenConstants.MATCH,
          _tpEntitlementActionType);
    }

    this._haerplForSeSeElSt(securityElement, _segment, io.github.onograph.TokenConstants.MATCH,
        _tpEntitlementActionType);
  }


  private void _haearecqlrForSeElStMaMaMaMa(
      Map<ElementEntitlementDTO.EntitlementActionType, Boolean> _mapLapaeb,
      Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> _mapPafsnem,
      Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> _mapPafsrem,
      Map<ElementEntitlementDTO.EntitlementActionType, Boolean> _mapTrapaeb, Segment _segment,
      String _strNp, ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    if (_segment instanceof LabelSegment) {
      if (_segment.equals(LabelSegment.ALL)) {
        _mapLapaeb.put(_tpEntitlementActionType, true);
      } else {
        this._adleForMuLa(_mapPafsnem.get(_tpEntitlementActionType), (LabelSegment) _segment);
      }
    } else {
      if (!(_segment instanceof RelTypeSegment)) {

        throw new IllegalStateException("*** Error: bdf0e9db-bcf5-433c-9524-79d24614ea3f");
      }

      if (_segment.equals(RelTypeSegment.ALL)) {
        _mapTrapaeb.put(_tpEntitlementActionType, true);
      } else {
        this._adrteForMuRe(_mapPafsrem.get(_tpEntitlementActionType), (RelTypeSegment) _segment);
      }
    }
  }


  private void _haectpveForSeEl(Segment _segment,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    if (_segment instanceof LabelSegment) {
      if (_segment.equals(LabelSegment.ALL)) {
        this.mapLawnceb.put(_tpEntitlementActionType, true);
      } else {
        this._adleForMuLa(this.mapLwncem.get(_tpEntitlementActionType), (LabelSegment) _segment);
      }
    } else {
      if (!(_segment instanceof RelTypeSegment)) {

        throw new IllegalStateException("*** Error: 14b3f209-0041-4c93-8ff8-ea2bf608d2cf");
      }

      if (_segment.equals(RelTypeSegment.ALL)) {
        this.mapTawrceb.put(_tpEntitlementActionType, true);
      } else {
        this._adrteForMuRe(this.mapTwrcem.get(_tpEntitlementActionType), (RelTypeSegment) _segment);
      }
    }
  }


  private void _haedtpveForSeEl(Segment _segment,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    if (_segment instanceof LabelSegment) {
      if (_segment.equals(LabelSegment.ALL)) {
        this.mapLawndeb.put(_tpEntitlementActionType, true);
      } else {
        this._adleForMuLa(this.mapLwndem.get(_tpEntitlementActionType), (LabelSegment) _segment);
      }
    } else {
      if (!(_segment instanceof RelTypeSegment)) {

        throw new IllegalStateException("*** Error: eddc6dfa-2af4-4c94-b34a-5b4e3950e619");
      }

      if (_segment.equals(RelTypeSegment.ALL)) {
        this.mapTawrdeb.put(_tpEntitlementActionType, true);
      } else {
        this._adrteForMuRe(this.mapTwrdem.get(_tpEntitlementActionType), (RelTypeSegment) _segment);
      }
    }
  }


  private void _haeeuboForSeEl(Segment _qaiirSegment,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {

    int[] _iVaArray;

    int _iVar;

    int _iVar2;

    int _iFi;
    if (_qaiirSegment instanceof ProcedureSegment) {
      if (_qaiirSegment.equals(ProcedureSegment.ALL)) {
        this.mapPabeeb.put(_tpEntitlementActionType, true);
      } else {

        ProcedureSegment _qpProcedureSegment = (ProcedureSegment) _qaiirSegment;
        _iVaArray = this.rsleIdLookup.getProcedureIds(_qpProcedureSegment.getProcedure());
        _iVar = _iVaArray.length;

        for (_iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {
          _iFi = _iVaArray[_iVar2];
          this.mapPbeem.get(_tpEntitlementActionType).add(_iFi);
        }
      }
    } else {
      if (!(_qaiirSegment instanceof FunctionSegment)) {

        throw new IllegalStateException("*** Error: 16a2998b-a9e6-49ef-ab46-f78f092d45f5");
      }

      if (_qaiirSegment.equals(FunctionSegment.ALL)) {
        this.mapFabeeb.put(_tpEntitlementActionType, true);
      } else {

        FunctionSegment _qfFunctionSegment = (FunctionSegment) _qaiirSegment;
        _iVaArray = this.rsleIdLookup.getFunctionIds(_qfFunctionSegment.getFunction());
        _iVar = _iVaArray.length;

        for (_iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {
          _iFi = _iVaArray[_iVar2];
          this.mapFbeem.get(_tpEntitlementActionType).add(_iFi);
        }

        _iVaArray = this.rsleIdLookup.getAggregatingFunctionIds(_qfFunctionSegment.getFunction());
        _iVar = _iVaArray.length;

        for (_iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {
          _iFi = _iVaArray[_iVar2];
          this.mapFabeem.get(_tpEntitlementActionType).add(_iFi);
        }
      }
    }
  }


  private void _haellpiForSeElPr(PrivilegeAction _privilegeAction, SecurityElement securityElement,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    if (securityElement.typSecurityElementElementType()
        .equals(SecurityElement.ElementType.ALL_LABELS)) {
      if (_privilegeAction == PrivilegeAction.SET_LABEL) {
        this.mapLaseb.put(_tpEntitlementActionType, true);
      } else if (_privilegeAction == PrivilegeAction.REMOVE_LABEL) {
        this.mapLareb.put(_tpEntitlementActionType, true);
      }
    } else if (_privilegeAction == PrivilegeAction.SET_LABEL) {
      this._adlbrseForMuSe(this.mapLsem.get(_tpEntitlementActionType),
          (SecurityElement.Label) securityElement);
    } else if (_privilegeAction == PrivilegeAction.REMOVE_LABEL) {
      this._adlbrseForMuSe(this.mapLrem.get(_tpEntitlementActionType),
          (SecurityElement.Label) securityElement);
    }
  }


  private void _haeperecForSeSeElStMaMaMaMa(
      Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> _mapNpem,
      Map<ElementEntitlementDTO.EntitlementActionType, MutableIntObjectMap<IntSet>> _mapPfsnem,
      Map<ElementEntitlementDTO.EntitlementActionType, MutableIntObjectMap<IntSet>> _mapPfsrem,
      Map<ElementEntitlementDTO.EntitlementActionType, MutableIntSet> _mapPrem,
      SecurityElement.Property _rProperty, Segment _segment, String _strNp,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {

    int _iIp = this._revppiForSt(_rProperty.gepptString());
    if (_iIp != -1) {
      if (_segment instanceof LabelSegment) {
        if (_segment.equals(LabelSegment.ALL)) {
          _mapNpem.get(_tpEntitlementActionType).add(_iIp);
        } else {
          this._adleForMuLa(_iIp, (LabelSegment) _segment,
              _mapPfsnem.get(_tpEntitlementActionType));
        }
      } else {
        if (!(_segment instanceof RelTypeSegment)) {

          throw new IllegalStateException("*** Error: 61c92e30-bf2b-4b58-a33a-caca53335879");
        }

        if (_segment.equals(RelTypeSegment.ALL)) {
          _mapPrem.get(_tpEntitlementActionType).add(_iIp);
        } else {
          this._adrteForMuRe(_iIp, _mapPfsrem.get(_tpEntitlementActionType),
              (RelTypeSegment) _segment);
        }
      }
    }
  }


  private void _haerplForSeSeElSt(SecurityElement securityElement, Segment _segment, String _strNp,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    switch (securityElement.typSecurityElementElementType()) {
      case PROPERTY:
        this._haeperecForSeSeElStMaMaMaMa(this.mapPnem, this.mapPfsnem, this.mapPfsrem,
            this.mapPrem, (SecurityElement.Property) securityElement,
            _segment, _strNp, _tpEntitlementActionType);
        break;
      case ALL_PROPERTIES:
        this._haearecqlrForSeElStMaMaMaMa(this.mapLapareb, this.mapPafsnem, this.mapPafsrem,
            this.mapTrapareb, _segment,
            _strNp, _tpEntitlementActionType);
        break;
      case GRAPH:
        this.mapLapareb.put(_tpEntitlementActionType, true);
        this.mapTrapareb.put(_tpEntitlementActionType, true);
    }
  }


  private void _haesprtpveForSeSeEl(SecurityElement securityElement, Segment _segment,
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType) {
    switch (securityElement.typSecurityElementElementType()) {
      case PROPERTY:
        this._haeperecForSeSeElStMaMaMaMa(this.mapPnwem, this.mapPfsnwem, this.mapPfsrwem,
            this.mapPrwem,
            (SecurityElement.Property) securityElement,
            _segment, io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.AccessModeFactory.haeperecForSeSeElStMaMaMaMa"),
            _tpEntitlementActionType);
        break;
      case ALL_PROPERTIES:
        this._haearecqlrForSeElStMaMaMaMa(this.mapLapaweb, this.mapPafsnwem, this.mapPafsrwem,
            this.mapTrapaweb,
            _segment, io.github.onograph.I18N.format(
                "io.github.onograph.server.security.auth.AccessModeFactory.haearecqlrForSeElStMaMaMaMa"),
            _tpEntitlementActionType);
    }
  }


  private int _reoelbiForSt(String lbl) {
    assert !lbl.isEmpty();

    return this.rsleIdLookup.getLabelId(lbl);
  }


  private int _revppiForSt(String prop) {
    assert !prop.isEmpty();

    return this.rsleIdLookup.getPropertyKeyId(prop);
  }


  private int _revrtidForSt(String relationshipTypeName) {
    assert !relationshipTypeName.isEmpty();

    return this.rsleIdLookup.getRelTypeId(relationshipTypeName);
  }


  AccessModeFactory adpveAccessModeFactory(ElementEntitlementDTO _piieeElementEntitlementDTO) {

    SecurityElement securityElement = _piieeElementEntitlementDTO.getSecurityElement();

    Segment _segment = _piieeElementEntitlementDTO.getSegment();

    ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType = _piieeElementEntitlementDTO.getTpEntitlementActionType();

    PrivilegeAction _privilegeAction = _piieeElementEntitlementDTO.getPrivilegeAction();
    switch (_privilegeAction) {
      case ACCESS:
        this.mapAaeb.put(_tpEntitlementActionType, true);
        break;
      case TRAVERSE:
        this._haearecqlrForSeElStMaMaMaMa(this.mapTaleb, this.mapLtem, this.mapTrtem,
            this.mapTrateb, _segment,
            io.github.onograph.TokenConstants.TRAVERSE,
            _tpEntitlementActionType);
        break;
      case READ:
        this._haerplForSeSeElSt(securityElement, _segment, io.github.onograph.TokenConstants.READ,
            _tpEntitlementActionType);
        break;
      case MATCH:
        this._hadmcForSeSeEl(securityElement, _segment, _tpEntitlementActionType);
        break;
      case WRITE:
        this.mapWaeb.put(_tpEntitlementActionType, true);
        break;
      case GRAPH_ACTIONS:
        this.mapTaleb.put(_tpEntitlementActionType, true);
        this.mapTrateb.put(_tpEntitlementActionType, true);
        this.mapLapareb.put(_tpEntitlementActionType, true);
        this.mapTrapareb.put(_tpEntitlementActionType, true);
        this.mapWaeb.put(_tpEntitlementActionType, true);
        break;
      case SET_LABEL:
      case REMOVE_LABEL:
        this._haellpiForSeElPr(_privilegeAction, securityElement, _tpEntitlementActionType);
        break;
      case CREATE_ELEMENT:
        this._haectpveForSeEl(_segment, _tpEntitlementActionType);
        break;
      case DELETE_ELEMENT:
        this._haedtpveForSeEl(_segment, _tpEntitlementActionType);
        break;
      case SET_PROPERTY:
        this._haesprtpveForSeSeEl(securityElement, _segment, _tpEntitlementActionType);
        break;
      case MERGE:
        if (_tpEntitlementActionType.isGrt()) {
          this._hadmcForSeSeEl(securityElement, _segment, _tpEntitlementActionType);
          this._haectpveForSeEl(_segment, _tpEntitlementActionType);
          this._haesprtpveForSeSeEl(securityElement, _segment, _tpEntitlementActionType);
        }
        break;
      case EXECUTE:
        this._hadeceForSeEl(_segment, _tpEntitlementActionType);
        break;
      case EXECUTE_BOOSTED:
        this._haeeuboForSeEl(_segment, _tpEntitlementActionType);
        break;
      case SHOW_INDEX:
        this.mapIsaeb.put(_tpEntitlementActionType, true);
        break;
      case SHOW_CONSTRAINT:
        this.mapAsceb.put(_tpEntitlementActionType, true);
        break;
      default:
        if (PrivilegeAction.TOKEN.satisfies(_privilegeAction)) {
          this.isTkn = true;
          this._adpigaiForEl(_piieeElementEntitlementDTO);
        } else if (!PrivilegeAction.INDEX.satisfies(_privilegeAction)
            && !PrivilegeAction.CONSTRAINT.satisfies(_privilegeAction)) {
          if (PrivilegeAction.ADMIN.satisfies(_privilegeAction)) {
            this._adpigaiForEl(_piieeElementEntitlementDTO);
          } else if (PrivilegeAction.DATABASE_ACTIONS.satisfies(_privilegeAction)) {
            this.mapAaeb.put(_tpEntitlementActionType, true);
            this.isTkn = true;
            this.isWs = true;
            this.mapIsaeb.put(_tpEntitlementActionType, true);
            this.mapAsceb.put(_tpEntitlementActionType, true);
            this._adpigaiForEl(_piieeElementEntitlementDTO);
          }
        } else {
          if (_privilegeAction == PrivilegeAction.INDEX) {
            this.mapIsaeb.put(_tpEntitlementActionType, true);
          } else if (_privilegeAction == PrivilegeAction.CONSTRAINT) {
            this.mapAsceb.put(_tpEntitlementActionType, true);
          }

          this.isWs = true;
          this._adpigaiForEl(_piieeElementEntitlementDTO);
        }

        if (_privilegeAction.satisfies(PrivilegeAction.DBMS_ACTIONS)) {
          this.mapPaeeb.put(_tpEntitlementActionType, true);
          this.mapPabeeb.put(_tpEntitlementActionType, true);
          this.mapEafeb.put(_tpEntitlementActionType, true);
          this.mapFabeeb.put(_tpEntitlementActionType, true);
        } else if (_privilegeAction.satisfies(PrivilegeAction.EXECUTE_ADMIN)) {

          int[] _iVArray = this.rsleIdLookup.getAdminProcedureIds();

          int _iVa = _iVArray.length;

          for (

              int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

            int _iPi = _iVArray[_iVa2];
            this.mapPbeem.get(_tpEntitlementActionType).add(_iPi);
          }
        }
    }

    return this;
  }


  AccessModeImpl bulAccessModeImpl() {
    return new AccessModeImpl(
        this.aamFactory.bulAdminAccessModeEnterpriseImpl(), new Properties(
        this.mapPfsnem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapPfsrem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapLapareb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapTrapareb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapPnem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapPafsnem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapPafsrem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapPrem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT)),
        new AuthFuncEntitlements(
            this.mapFabeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
            this.mapFabeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
            this.mapFaeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
            this.mapFaeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
            this.mapFbeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
            this.mapFbeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
            this.mapFeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
            this.mapFeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
            this.mapFabeeb
                .getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
            this.mapFabeeb
                .getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
            this.mapEafeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
                false),
            this.mapEafeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY,
                false)),
        this.mapLtem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY), new Properties(
        this.mapPfsnem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapPfsrem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapLapareb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapTrapareb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapPnem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapPafsnem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapPafsrem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapPrem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY)), new Properties(
        this.mapPfsnwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapPfsrwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapLapaweb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapTrapaweb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapPnwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapPafsnwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapPafsrwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapPrwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY)),
        this.isIa && this.mapAaeb.getOrDefault(
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false) &&
            !(Boolean) this.mapAaeb.getOrDefault(
                ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapTawrceb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapLareb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapTrateb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.isIa && this.mapAsceb.getOrDefault(
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false) &&
            !(Boolean) this.mapAsceb.getOrDefault(
                ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.isIa && this.isTkn,
        this.isIa && this.mapIsaeb.getOrDefault(
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false) &&
            !(Boolean) this.mapIsaeb.getOrDefault(
                ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapLawnceb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapLawnceb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapLawndeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapLawndeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapLareb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapLaseb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapLaseb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapTaleb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapTaleb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapTawrceb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapTawrdeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapTawrdeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.mapTrateb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.isIa && this.mapWaeb.getOrDefault(
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapWaeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
        this.isIa && this.isWs,
        this.mapLrem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapLrem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapLsem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapLsem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapLtem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapLwncem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapLwncem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapLwndem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        new Procedures(
            this.mapPaeeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
                false),
            this.mapPaeeb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
            this.mapPeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
            this.mapPeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
            this.mapPabeeb
                .getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
            this.mapPabeeb
                .getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_DENY, false),
            this.mapPbeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
            this.mapPbeem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY)),
        this.setRlsString, this.strDtbs,
        this.mapTrtem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapTrtem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapTwrcem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapTwrdem.get(ElementEntitlementDTO.EntitlementActionType.EAT_DENY),
        this.mapTwrdem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT), new Properties(
        this.mapPfsnwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapPfsrwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapLapaweb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapTrapaweb.getOrDefault(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, false),
        this.mapPnwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapPafsnwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapPafsrwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapPrwem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT)),
        this.mapTwrcem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT),
        this.mapLwndem.get(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT));
  }


  AccessModeFactory wihacsAccessModeFactory() {
    this.mapAaeb.put(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, true);
    return this;
  }
}
