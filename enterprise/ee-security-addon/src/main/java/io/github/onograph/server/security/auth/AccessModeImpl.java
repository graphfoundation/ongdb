package io.github.onograph.server.security.auth;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import org.eclipse.collections.api.set.primitive.IntSet;
import org.neo4j.internal.kernel.api.RelTypeSupplier;
import org.neo4j.internal.kernel.api.TokenSet;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.kernel.api.security.AdminAccessMode;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource.DatabaseScope;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;


class AccessModeImpl implements AccessMode {


  private final AdminAccessMode adminAccessMode;


  private final Properties arProperties;


  private final AuthFuncEntitlements authFuncEntitlements;


  private final IntSet bdrwtIntSet;


  private final DatabaseScope databaseScope;


  private final Properties drProperties;


  private final Properties dwProperties;


  private final boolean isAa;


  private final boolean isAsi;


  private final boolean isAtart;


  private final boolean isCsa;


  private final boolean isCta;


  private final boolean isDral;


  private final boolean isDtal;


  private final boolean isLanca;


  private final boolean isLancd;


  private final boolean isLanda;


  private final boolean isLandd;


  private final boolean isLara;


  private final boolean isLasa;


  private final boolean isLasd;


  private final boolean isLata;


  private final boolean isTarca;


  private final boolean isTarcd;


  private final boolean isTarda;


  private final boolean isTardd;


  private final boolean isTratd;


  private final boolean isWa;


  private final boolean isWd;


  private final boolean isWsa;


  private final IntSet lrbIntSet;


  private final IntSet lrwIntSet;


  private final IntSet lsbIntSet;


  private final IntSet lsfpnwIntSet;


  private final IntSet lswIntSet;


  private final IntSet ltbIntSet;


  private final IntSet ltwIntSet;


  private final IntSet lwncbIntSet;


  private final IntSet lwndbIntSet;


  private final IntSet lwndwIntSet;


  private final Procedures ppProcedures;


  private final Set<String> setRlsString;


  private final IntSet trtbIntSet;


  private final IntSet trtwIntSet;


  private final IntSet tsfprwIntSet;


  private final IntSet twrcbIntSet;


  private final IntSet twrcwIntSet;


  private final IntSet twrdwIntSet;


  private final Properties waProperties;


  private final IntSet wcnwlIntSet;


  AccessModeImpl(AdminAccessMode _adminAccessMode, Properties _arProperties,
      AuthFuncEntitlements authFuncEntitlements, IntSet _btlIntSet, Properties _drProperties,
      Properties _dwProperties, boolean _isAa, boolean _isAcrat, boolean _isAral, boolean _isAtart,
      boolean _isCsa, boolean _isCta, boolean _isIsa, boolean _isLanca, boolean _isLancd,
      boolean _isLanda, boolean _isLandd, boolean _isLard, boolean _isLasa, boolean _isLasd,
      boolean _isLata, boolean _isLatd, boolean _isTarcd, boolean _isTarda, boolean _isTardd,
      boolean _isTratd, boolean _isWa, boolean _isWd, boolean _isWsa, IntSet _lrbIntSet,
      IntSet _lrwIntSet, IntSet _lsbIntSet, IntSet _lswIntSet, IntSet _ltwIntSet,
      IntSet _lwncbIntSet, IntSet _lwncwIntSet, IntSet _lwndbIntSet, Procedures _ppProcedures,
      Set<String> _setRlsString, String _strDtbs, IntSet _trtbIntSet, IntSet _trtwIntSet,
      IntSet _twrcbIntSet, IntSet _twrdbIntSet, IntSet _twrdwIntSet, Properties _waProperties,
      IntSet _wcrwtIntSet, IntSet _wdnwlIntSet) {
    this.isAa = _isAa;
    this.isWa = _isWa;
    this.isWd = _isWd;
    this.isCta = _isCta;
    this.isWsa = _isWsa;
    this.isAsi = _isIsa;
    this.isCsa = _isCsa;
    this.setRlsString = _setRlsString;
    this.isLata = _isLata;
    this.isAtart = _isAtart;
    this.ltwIntSet = _ltwIntSet;
    this.trtwIntSet = _trtwIntSet;
    this.isDtal = _isLatd;
    this.isTratd = _isTratd;
    this.ltbIntSet = _btlIntSet;
    this.trtbIntSet = _trtbIntSet;
    this.arProperties = _arProperties;
    this.drProperties = _drProperties;
    this.isLasa = _isLasa;
    this.lswIntSet = _lswIntSet;
    this.isLasd = _isLasd;
    this.lsbIntSet = _lsbIntSet;
    this.isLara = _isAral;
    this.lrwIntSet = _lrwIntSet;
    this.isDral = _isLard;
    this.lrbIntSet = _lrbIntSet;
    this.isLanca = _isLanca;
    this.wcnwlIntSet = _lwncwIntSet;
    this.isLancd = _isLancd;
    this.lwncbIntSet = _lwncbIntSet;
    this.isLanda = _isLanda;
    this.lwndwIntSet = _wdnwlIntSet;
    this.isLandd = _isLandd;
    this.lwndbIntSet = _lwndbIntSet;
    this.isTarca = _isAcrat;
    this.twrcwIntSet = _wcrwtIntSet;
    this.isTarcd = _isTarcd;
    this.twrcbIntSet = _twrcbIntSet;
    this.isTarda = _isTarda;
    this.twrdwIntSet = _twrdwIntSet;
    this.isTardd = _isTardd;
    this.bdrwtIntSet = _twrdbIntSet;
    this.waProperties = _waProperties;
    this.dwProperties = _dwProperties;
    this.ppProcedures = _ppProcedures;
    this.authFuncEntitlements = authFuncEntitlements;
    this.adminAccessMode = _adminAccessMode;
    this.databaseScope = new DatabaseScope(_strDtbs);
    this.lsfpnwIntSet = _arProperties.getIntObjectMapPflIntSet().keySet().select((key) ->
    {
      return !_arProperties.getIntObjectMapPflIntSet()
          .get(key).isEmpty();
    });
    this.tsfprwIntSet = _arProperties.getIntObjectMapPftrIntSet().keySet().select((key) ->
    {
      return !_arProperties
          .getIntObjectMapPftrIntSet()
          .get(key).isEmpty();
    });
  }


  private static AccessModeImpl.PermissionState _caacnopoyAccessModeImplPermissionState(
      Properties _alwProperties, Properties _dsloProperties, int pk,
      Supplier<TokenSet> _supplierLsTokenSet) {

    TokenSet _tokenSet = _supplierLsTokenSet.get();

    IntSet _lwIntSet = _alwProperties.getIntObjectMapPflIntSet().get(pk);

    IntSet _lbIntSet = _dsloProperties.getIntObjectMapPflIntSet().get(pk);

    boolean _isAlwd = false;

    long[] _lgVaArray = _tokenSet.all();

    int _iVa = _lgVaArray.length;

    for (

        int _iVr0 = 0; _iVr0 < _iVa; ++_iVr0) {

      long _lgLal = _lgVaArray[_iVr0];

      int lbl = (int) _lgLal;
      if (_lwIntSet != null && _lwIntSet.contains(lbl)) {
        _isAlwd = true;
      }

      if (_lbIntSet != null && _lbIntSet.contains(lbl)) {
        return AccessModeImpl.PermissionState.PS_DENY;
      }

      if (_alwProperties.getPaflIntSet().contains(lbl)) {
        _isAlwd = true;
      }

      if (_dsloProperties.getPaflIntSet().contains(lbl)) {
        return AccessModeImpl.PermissionState.PS_DENY;
      }
    }

    return AccessModeImpl.PermissionState
        .frmwiltAccessModeImplPermissionState(
            _isAlwd || _alwProperties.getIsLapa() || _alwProperties.getLafpnIntSet().contains(pk));
  }


  private static AccessModeImpl.PermissionState _caacreppAccessModeImplPermissionState(
      Properties _alwProperties, Properties _dsloProperties, int pk,
      RelTypeSupplier relationshipTypeName) {

    IntSet _wieitIntSet = _alwProperties.getIntObjectMapPftrIntSet().get(pk);

    IntSet _bakitIntSet = _dsloProperties.getIntObjectMapPftrIntSet().get(pk);

    boolean _isAlwd =
        _wieitIntSet != null && _wieitIntSet.contains(relationshipTypeName.getRelType()) ||
            _alwProperties.getPaftrIntSet().contains(relationshipTypeName.getRelType()) ||
            _alwProperties.getIsApart() || _alwProperties.getTafprIntSet().contains(pk);

    boolean _isTrd =
        _bakitIntSet != null && _bakitIntSet.contains(relationshipTypeName.getRelType()) ||
            _dsloProperties.getPaftrIntSet().contains(relationshipTypeName.getRelType());
    return AccessModeImpl.PermissionState.frmbaltAccessModeImplPermissionState(!_isTrd)
        .cobeAccessModeImplPermissionState(
            AccessModeImpl.PermissionState.frmwiltAccessModeImplPermissionState(_isAlwd));
  }


  private static boolean _isDilprtfslaForPr(Properties _dsloProperties, int pk) {
    return _dsloProperties.getIsLapa() || _dsloProperties.getLafpnIntSet().contains(pk) ||
        !_dsloProperties.getPaflIntSet().isEmpty()
        || _dsloProperties.getIntObjectMapPflIntSet().get(pk) != null;
  }


  private static boolean _isDilprtfsreteForPr(Properties _dsloProperties, int pk) {
    return _dsloProperties.getIsApart() || _dsloProperties.getTafprIntSet().contains(pk) ||
        !_dsloProperties.getPaftrIntSet().isEmpty()
        || _dsloProperties.getIntObjectMapPftrIntSet().get(pk) != null;
  }


  private boolean _isAlprraosond(int pk) {
    return this.arProperties.getIsLapa() || this.arProperties.getLafpnIntSet().contains(pk) ||
        this.lsfpnwIntSet.contains(pk) || this.arProperties.getPaflIntSet().notEmpty();
  }


  private boolean _isAlspereosrete(int pk) {
    return this.arProperties.getIsApart() || this.arProperties.getTafprIntSet().contains(pk) ||
        this.tsfprwIntSet.contains(pk) || this.arProperties.getPaftrIntSet().notEmpty();
  }


  private boolean _isDilrepoyfalle(int pk) {
    return this.drProperties.getIsLapa() || this.drProperties.getLafpnIntSet().contains(pk);
  }


  private boolean _isDilrepoyfalrt(int pk) {
    return this.drProperties.getIsApart() || this.drProperties.getTafprIntSet().contains(pk);
  }

  @Override
  public boolean allowsCreateNode(int[] _iIlArray) {
    if (!this.isWd && !this.isLancd) {

      boolean _isAlwd = false;
      if (_iIlArray != null && _iIlArray.length > 0) {
        _isAlwd = true;

        int[] _iVaArray = _iIlArray;

        int _iVar = _iIlArray.length;

        for (

            int _iVa = 0; _iVa < _iVar; ++_iVa) {

          int lbl = _iVaArray[_iVa];
          if (this.lwncbIntSet.contains(lbl)) {
            return false;
          }

          _isAlwd &= this.wcnwlIntSet.contains(lbl);
        }
      }

      return this.isWa || this.isLanca || _isAlwd;
    } else {
      return false;
    }
  }

  @Override
  public boolean allowsCreateRelationship(int relationshipTypeName) {
    if (!this.isWd && !this.isTarcd && !this.twrcbIntSet.contains(relationshipTypeName)) {
      return this.isWa || this.isTarca || this.twrcwIntSet.contains(relationshipTypeName);
    } else {
      return false;
    }
  }

  @Override
  public boolean allowsDeleteNode(Supplier<TokenSet> _supplierSlTokenSet) {
    if (!this.isWd && !this.isLandd) {

      boolean _isAlwd = false;

      long[] _lgIlArray = _supplierSlTokenSet.get().all();
      if (_lgIlArray.length > 0) {
        _isAlwd = true;

        long[] _lgVarArray = _lgIlArray;

        int _iVar = _lgIlArray.length;

        for (

            int _iVa = 0; _iVa < _iVar; ++_iVa) {

          long lbl = _lgVarArray[_iVa];
          if (this.lwndbIntSet.contains((int) lbl)) {
            return false;
          }

          _isAlwd &= this.lwndwIntSet.contains((int) lbl);
        }
      }

      return this.isWa || this.isLanda || _isAlwd;
    } else {
      return false;
    }
  }

  @Override
  public boolean allowsDeleteRelationship(int relationshipTypeName) {
    if (!this.isWd && !this.isTardd && !this.bdrwtIntSet.contains(relationshipTypeName)) {
      return this.isWa || this.isTarda || this.twrdwIntSet.contains(relationshipTypeName);
    } else {
      return false;
    }
  }

  @Override
  public boolean allowsExecuteAggregatingFunction(int _iI) {
    return this.authFuncEntitlements.isAletarifnn(_iI);
  }

  @Override
  public boolean allowsExecuteFunction(int _iI) {
    return this.authFuncEntitlements.isAletfc(_iI);
  }

  @Override
  public boolean allowsExecuteProcedure(int _iIp) {
    return this.ppProcedures.isAlseupor(_iIp);
  }

  @Override
  public boolean allowsReadNodeProperty(Supplier<TokenSet> _supplierSlTokenSet, int pk) {
    if (this.allowsReadPropertyAllLabels(pk)) {
      return true;
    } else {
      return !this._isDilrepoyfalle(pk) && _caacnopoyAccessModeImplPermissionState(
          this.arProperties, this.drProperties, pk,
          _supplierSlTokenSet).isAloae();
    }
  }

  @Override
  public boolean allowsReadPropertyAllLabels(int pk) {
    return (this.arProperties.getIsLapa() || this.arProperties.getLafpnIntSet().contains(pk)) &&
        !this.disallowsReadPropertyForSomeLabel(pk);
  }

  @Override
  public boolean allowsReadPropertyAllRelTypes(int pk) {
    return (this.arProperties.getIsApart() || this.arProperties.getTafprIntSet().contains(pk)) &&
        !_isDilprtfsreteForPr(this.drProperties, pk);
  }

  @Override
  public boolean allowsReadRelationshipProperty(RelTypeSupplier relationshipTypeName, int pk) {
    if (this.allowsReadPropertyAllRelTypes(pk)) {
      return true;
    } else {
      return !this._isDilrepoyfalrt(pk) && _caacreppAccessModeImplPermissionState(this.arProperties,
          this.drProperties, pk, relationshipTypeName)
          .isAloae();
    }
  }

  @Override
  public boolean allowsRemoveLabel(long _lgIl) {
    if (!this.isWd && !this.isDral && !this.lrbIntSet.contains((int) _lgIl)) {
      return this.isWa || this.isLara || this.lrwIntSet.contains((int) _lgIl);
    } else {
      return false;
    }
  }

  @Override
  public boolean allowsSchemaWrites() {
    return this.isWsa;
  }

  @Override
  public boolean allowsSchemaWrites(PrivilegeAction _privilegeAction) {
    return this.isWsa && this.adminAccessMode.allows(
        new AdminActionOnResource(_privilegeAction, this.databaseScope, Segment.ALL));
  }

  @Override
  public boolean allowsSeePropertyKeyToken(int pk) {

    boolean _isNfd =
        this.drProperties.getIsLapa() || this.drProperties.getLafpnIntSet().contains(pk) ||
            !this._isAlprraosond(pk);

    boolean _isRfd =
        this.drProperties.getIsApart() || this.drProperties.getTafprIntSet().contains(pk) ||
            !this._isAlspereosrete(pk);
    return !_isNfd || !_isRfd;
  }

  @Override
  public boolean allowsSetLabel(long _lgIl) {
    if (!this.isWd && !this.isLasd && !this.lsbIntSet.contains((int) _lgIl)) {
      return this.isWa || this.isLasa || this.lswIntSet.contains((int) _lgIl);
    } else {
      return false;
    }
  }

  @Override
  public boolean allowsSetProperty(Supplier<TokenSet> _supplierLiTokenSet, int pk) {
    if (this.isWd) {
      return false;
    } else if ((this.waProperties.getIsLapa() || this.waProperties.getLafpnIntSet().contains(pk)) &&
        !_isDilprtfslaForPr(this.dwProperties, pk)) {
      return true;
    } else {
      return !this.dwProperties.getIsLapa() && !this.dwProperties.getLafpnIntSet().contains(pk) &&
          _caacnopoyAccessModeImplPermissionState(this.waProperties, this.dwProperties, pk,
              _supplierLiTokenSet)
              .cobeAccessModeImplPermissionState(
                  PermissionState.frmwiltAccessModeImplPermissionState(this.isWa)).isAloae();
    }
  }

  @Override
  public boolean allowsSetProperty(RelTypeSupplier relationshipTypeName, int pk) {
    if (this.isWd) {
      return false;
    } else if ((this.dwProperties.getIsApart() || this.dwProperties.getTafprIntSet().contains(pk))
        &&
        !_isDilprtfsreteForPr(this.dwProperties, pk)) {
      return true;
    } else {
      return !this.dwProperties.getIsApart() && !this.dwProperties.getTafprIntSet().contains(pk) &&
          _caacreppAccessModeImplPermissionState(this.waProperties, this.dwProperties, pk,
              relationshipTypeName)
              .cobeAccessModeImplPermissionState(
                  PermissionState.frmwiltAccessModeImplPermissionState(this.isWa)).isAloae();
    }
  }

  @Override
  public boolean allowsShowConstraint() {
    return this.isCsa;
  }

  @Override
  public boolean allowsShowIndex() {
    return this.isAsi;
  }

  @Override
  public boolean allowsTokenCreates(PrivilegeAction _privilegeAction) {
    return this.isCta && this.adminAccessMode.allows(
        new AdminActionOnResource(_privilegeAction, this.databaseScope, Segment.ALL));
  }

  @Override
  public boolean allowsTraverseAllLabels() {
    return this.isLata && !this.isDtal && this.ltbIntSet.isEmpty();
  }

  @Override
  public boolean allowsTraverseAllNodesWithLabel(long lbl) {
    if (!this.isDtal && !this.ltbIntSet.notEmpty()) {
      return this.isLata || this.ltwIntSet.contains((int) lbl);
    } else {
      return false;
    }
  }

  @Override
  public boolean allowsTraverseAllRelTypes() {
    return this.isAtart && !this.isTratd && this.trtbIntSet.isEmpty();
  }

  @Override
  public boolean allowsTraverseNode(long... _lgLblArray) {
    if (this.allowsTraverseAllLabels()) {
      return true;
    } else if (this.isDtal || _lgLblArray.length == 1 && _lgLblArray[0] == -1L) {
      return false;
    } else {

      boolean _isLata = false;

      long[] _lgVaArray = _lgLblArray;

      int _iVa = _lgLblArray.length;

      for (

          int _iV = 0; _iV < _iVa; ++_iV) {

        long _lgLal = _lgVaArray[_iV];

        int lbl = (int) _lgLal;
        if (this.ltbIntSet.contains(lbl)) {
          return false;
        }

        if (this.ltwIntSet.contains(lbl)) {
          _isLata = true;
        }
      }

      return _isLata || this.isLata;
    }
  }

  @Override
  public boolean allowsTraverseRelType(int relationshipTypeName) {
    if (this.allowsTraverseAllRelTypes()) {
      return true;
    } else if (relationshipTypeName != -1 && !this.isTratd && !this.trtbIntSet.contains(
        relationshipTypeName)) {
      return this.isAtart || this.trtwIntSet.contains(relationshipTypeName);
    } else {
      return false;
    }
  }

  @Override
  public boolean allowsWrites() {
    return this.isWa && !this.isWd;
  }

  @Override
  public boolean disallowsReadPropertyForSomeLabel(int pk) {
    return _isDilprtfslaForPr(this.drProperties, pk);
  }

  @Override
  public boolean disallowsTraverseLabel(long lbl) {
    return this.isDtal || this.ltbIntSet.contains((int) lbl);
  }

  @Override
  public boolean disallowsTraverseRelType(int relationshipTypeName) {
    return this.isTratd || this.trtbIntSet.contains(relationshipTypeName);
  }


  AdminAccessMode getAdminAccessMode() {
    return this.adminAccessMode;
  }


  boolean getIsAa() {
    return this.isAa;
  }

  @Override
  public String name() {

    Set<String> _setSrString = new TreeSet(this.setRlsString);
    return this.setRlsString.isEmpty() ? io.github.onograph.I18N.format(
        "io.github.onograph.server.security.auth.AccessModeImpl.name2")
        : io.github.onograph.I18N.format(
            "io.github.onograph.server.security.auth.AccessModeImpl.name",
            _setSrString);
  }

  @Override
  public Set<String> roles() {
    return this.setRlsString;
  }

  @Override
  public boolean shouldBoostAccessForProcedureWith(String[] _strNrArray) {

    String[] _strVArray = _strNrArray;

    int _iVar = _strNrArray.length;

    for (

        int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

      String role = _strVArray[_iVar2];
      if (this.setRlsString.contains(role)) {
        return true;
      }
    }

    return false;
  }

  @Override
  public boolean shouldBoostAggregatingFunction(int _iI) {
    return this.authFuncEntitlements.isShdbtaenfc(_iI);
  }

  @Override
  public boolean shouldBoostFunction(int _iI) {
    return this.authFuncEntitlements.isShdbtft(_iI);
  }

  @Override
  public boolean shouldBoostProcedure(int _iIp) {
    return this.ppProcedures.isShdbtpe(_iIp);
  }


  enum PermissionState {


    PS_GRANT_REFUSED,

    PS_GRANT_GIVEN,

    PS_DENY;


    public static AccessModeImpl.PermissionState frmbaltAccessModeImplPermissionState(
        boolean _isPritd) {
      return _isPritd ? PS_GRANT_REFUSED : PS_DENY;
    }


    public static AccessModeImpl.PermissionState frmwiltAccessModeImplPermissionState(
        boolean _isPritd) {
      return _isPritd ? PS_GRANT_GIVEN : PS_GRANT_REFUSED;
    }


    public AccessModeImpl.PermissionState cobeAccessModeImplPermissionState(
        AccessModeImpl.PermissionState _permissionState) {

      int _iOdr = this.compareTo(_permissionState);
      return _iOdr <= 0 ? _permissionState : this;
    }


    public boolean isAloae() {
      return this == PS_GRANT_GIVEN;
    }
  }
}
