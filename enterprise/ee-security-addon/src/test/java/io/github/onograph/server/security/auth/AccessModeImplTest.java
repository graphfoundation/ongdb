package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import org.eclipse.collections.api.set.primitive.IntSet;
import org.eclipse.collections.impl.map.mutable.primitive.IntObjectHashMap;
import org.eclipse.collections.impl.set.mutable.primitive.IntHashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.RelTypeSupplier;
import org.neo4j.internal.kernel.api.TokenSet;
import org.neo4j.internal.kernel.api.security.AdminAccessMode;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;

class AccessModeImplTest {

  @Test
  void testConstructor() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet())).getIsAa());
  }

  @Test
  void testConstructor2() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties properties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties properties1 = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1, true,
        true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    AccessModeImpl actualAccessModeImpl = new AccessModeImpl(_adminAccessMode, properties,
        authFuncEntitlements,
        _btlIntSet, properties1, _dwProperties, true, true, true, true, true, true, true, true,
        true,
        true, true, true,
        true, true, true, true, true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet,
        _lsbIntSet,
        _lswIntSet, _ltwIntSet, _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures,
        _setRlsString, " str Dtbs",
        _trtbIntSet, _trtwIntSet, _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties,
        _wcrwtIntSet,
        new IntHashSet());

    assertTrue(actualAccessModeImpl.roles().isEmpty());
    assertTrue(actualAccessModeImpl.getIsAa());
    assertTrue(properties.getIntObjectMapPflIntSet().toList().isEmpty());
    assertTrue(properties.getIntObjectMapPftrIntSet().toList().isEmpty());
    assertTrue(properties1.getIntObjectMapPflIntSet().toList().isEmpty());
  }

  @Test
  void testAllowsCreateNode() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsCreateNode(new int[]{1, 1, 1, 1}));
  }

  @Test
  void testAllowsCreateRelationship() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsCreateRelationship(1));
  }

  @Test
  void testAllowsDeleteNode() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsDeleteNode((Supplier<TokenSet>) mock(Supplier.class)));
  }

  @Test
  void testAllowsDeleteRelationship() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsDeleteRelationship(1));
  }

  @Test
  void testAllowsExecuteAggregatingFunction() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsExecuteAggregatingFunction(1));
  }

  @Test
  void testAllowsExecuteFunction() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsExecuteFunction(1));
  }

  @Test
  void testAllowsExecuteProcedure() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsExecuteProcedure(1));
  }

  @Test
  void testAllowsReadNodeProperty() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsReadNodeProperty((Supplier<TokenSet>) mock(Supplier.class), 1));
  }

  @Test
  void testAllowsReadNodeProperty2() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet,
        false, true,
        _lafpnIntSet, _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsReadNodeProperty((Supplier<TokenSet>) mock(Supplier.class), 1));
  }

  @Test
  void testAllowsReadPropertyAllLabels() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsReadPropertyAllLabels(1));
  }

  @Test
  void testAllowsReadPropertyAllLabels2() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet,
        false, true,
        _lafpnIntSet, _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsReadPropertyAllLabels(1));
  }

  @Test
  void testAllowsReadPropertyAllRelTypes() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsReadPropertyAllRelTypes(1));
  }

  @Test
  void testAllowsReadPropertyAllRelTypes2() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        false,
        _lafpnIntSet, _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsReadPropertyAllRelTypes(1));
  }

  @Test
  void testAllowsReadRelationshipProperty() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsReadRelationshipProperty(mock(RelTypeSupplier.class), 1));
  }

  @Test
  void testAllowsReadRelationshipProperty2() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        false,
        _lafpnIntSet, _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsReadRelationshipProperty(mock(RelTypeSupplier.class), 1));
  }

  @Test
  void testAllowsRemoveLabel() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsRemoveLabel(1L));
  }

  @Test
  void testAllowsSchemaWrites() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet())).allowsSchemaWrites());
  }

  @Test
  void testAllowsSchemaWrites2() {
    AdminAccessMode adminAccessMode = mock(AdminAccessMode.class);
    when(adminAccessMode.allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any())).thenReturn(true);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue((new AccessModeImpl(adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
        _drProperties,
        _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true, true,
        true, true, true,
        true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet, _lswIntSet,
        _ltwIntSet,
        _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
        _trtbIntSet, _trtwIntSet,
        _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet, new IntHashSet()))
        .allowsSchemaWrites(PrivilegeAction.ACCESS));
    verify(adminAccessMode).allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any());
  }

  @Test
  void testAllowsSchemaWrites3() {
    AdminAccessMode adminAccessMode = mock(AdminAccessMode.class);
    when(adminAccessMode.allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any()))
        .thenReturn(false);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsSchemaWrites(PrivilegeAction.ACCESS));
    verify(adminAccessMode).allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any());
  }

  @Test
  void testAllowsSchemaWrites4() {
    AdminAccessMode adminAccessMode = mock(AdminAccessMode.class);
    when(adminAccessMode.allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any())).thenReturn(true);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, false, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsSchemaWrites(PrivilegeAction.ACCESS));
  }

  @Test
  void testAllowsSeePropertyKeyToken() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsSeePropertyKeyToken(1));
  }

  @Test
  void testAllowsSetLabel() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet())).allowsSetLabel(1L));
  }

  @Test
  void testAllowsSetProperty() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsSetProperty((Supplier<TokenSet>) mock(Supplier.class), 1));
  }

  @Test
  void testAllowsSetProperty2() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsSetProperty(mock(RelTypeSupplier.class), 1));
  }

  @Test
  void testAllowsShowConstraint() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsShowConstraint());
  }

  @Test
  void testAllowsShowIndex() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet())).allowsShowIndex());
  }

  @Test
  void testAllowsTokenCreates() {
    AdminAccessMode adminAccessMode = mock(AdminAccessMode.class);
    when(adminAccessMode.allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any())).thenReturn(true);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue((new AccessModeImpl(adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
        _drProperties,
        _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true, true,
        true, true, true,
        true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet, _lswIntSet,
        _ltwIntSet,
        _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
        _trtbIntSet, _trtwIntSet,
        _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet, new IntHashSet()))
        .allowsTokenCreates(PrivilegeAction.ACCESS));
    verify(adminAccessMode).allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any());
  }

  @Test
  void testAllowsTokenCreates2() {
    AdminAccessMode adminAccessMode = mock(AdminAccessMode.class);
    when(adminAccessMode.allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any()))
        .thenReturn(false);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsTokenCreates(PrivilegeAction.ACCESS));
    verify(adminAccessMode).allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any());
  }

  @Test
  void testAllowsTokenCreates3() {
    AdminAccessMode adminAccessMode = mock(AdminAccessMode.class);
    when(adminAccessMode.allows(
        (org.neo4j.internal.kernel.api.security.AdminActionOnResource) any())).thenReturn(true);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, false, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsTokenCreates(PrivilegeAction.ACCESS));
  }

  @Test
  void testAllowsTraverseAllLabels() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsTraverseAllLabels());
  }

  @Test
  void testAllowsTraverseAllNodesWithLabel() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsTraverseAllNodesWithLabel(1L));
  }

  @Test
  void testAllowsTraverseAllRelTypes() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsTraverseAllRelTypes());
  }

  @Test
  void testAllowsTraverseNode() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet())).allowsTraverseNode(1L,
            1L, 1L,
            1L));
  }

  @Test
  void testAllowsTraverseRelType() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .allowsTraverseRelType(1));
  }

  @Test
  void testAllowsWrites() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet())).allowsWrites());
  }

  @Test
  void testDisallowsReadPropertyForSomeLabel() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .disallowsReadPropertyForSomeLabel(1));
  }

  @Test
  void testDisallowsTraverseLabel() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .disallowsTraverseLabel(1L));
  }

  @Test
  void testDisallowsTraverseRelType() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertTrue(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .disallowsTraverseRelType(1));
  }

  @Test
  void testName() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertEquals("no roles",
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true,
            true, true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet,
            _trtwIntSet, _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .name());
  }

  @Test
  void testRoles() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> stringSet = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    Set<String> actualRolesResult = (new AccessModeImpl(_adminAccessMode, _arProperties,
        authFuncEntitlements,
        _btlIntSet, _drProperties, _dwProperties, true, true, true, true, true, true, true, true,
        true,
        true, true,
        true, true, true, true, true, true, true, true, true, true, true, true, _lrbIntSet,
        _lrwIntSet,
        _lsbIntSet,
        _lswIntSet, _ltwIntSet, _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, stringSet,
        " str Dtbs",
        _trtbIntSet, _trtwIntSet, _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties,
        _wcrwtIntSet,
        new IntHashSet())).roles();
    assertSame(stringSet, actualRolesResult);
    assertTrue(actualRolesResult.isEmpty());
  }

  @Test
  void testShouldBoostAccessForProcedureWith() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .shouldBoostAccessForProcedureWith(new String[]{" str Nr Array"}));
  }

  @Test
  void testShouldBoostAggregatingFunction() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .shouldBoostAggregatingFunction(1));
  }

  @Test
  void testShouldBoostFunction() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .shouldBoostFunction(1));
  }

  @Test
  void testShouldBoostProcedure() {
    AdminAccessMode _adminAccessMode = mock(AdminAccessMode.class);
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet = new IntHashSet();
    IntHashSet _paflIntSet = new IntHashSet();
    IntHashSet _paftrIntSet = new IntHashSet();
    Properties _arProperties = new Properties(_intObjectMapPflIntSet, _intObjectMapPftrIntSet, true,
        true, _lafpnIntSet,
        _paflIntSet, _paftrIntSet, new IntHashSet());

    IntHashSet _fabeaIntSet = new IntHashSet();
    IntHashSet _fabedIntSet = new IntHashSet();
    IntHashSet _faeaIntSet = new IntHashSet();
    IntHashSet _faedIntSet = new IntHashSet();
    IntHashSet _fbeaIntSet = new IntHashSet();
    IntHashSet _fbedIntSet = new IntHashSet();
    IntHashSet _feaIntSet = new IntHashSet();
    AuthFuncEntitlements authFuncEntitlements = new AuthFuncEntitlements(_fabeaIntSet, _fabedIntSet,
        _faeaIntSet,
        _faedIntSet, _fbeaIntSet, _fbedIntSet, _feaIntSet, new IntHashSet(), true, true,
        true, true);

    IntHashSet _btlIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet1 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet1 = new IntHashSet();
    IntHashSet _paflIntSet1 = new IntHashSet();
    IntHashSet _paftrIntSet1 = new IntHashSet();
    Properties _drProperties = new Properties(_intObjectMapPflIntSet1, _intObjectMapPftrIntSet1,
        true, true,
        _lafpnIntSet1, _paflIntSet1, _paftrIntSet1, new IntHashSet());

    IntObjectHashMap<IntSet> _intObjectMapPflIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet2 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet2 = new IntHashSet();
    IntHashSet _paflIntSet2 = new IntHashSet();
    IntHashSet _paftrIntSet2 = new IntHashSet();
    Properties _dwProperties = new Properties(_intObjectMapPflIntSet2, _intObjectMapPftrIntSet2,
        true, true,
        _lafpnIntSet2, _paflIntSet2, _paftrIntSet2, new IntHashSet());

    IntHashSet _lrbIntSet = new IntHashSet();
    IntHashSet _lrwIntSet = new IntHashSet();
    IntHashSet _lsbIntSet = new IntHashSet();
    IntHashSet _lswIntSet = new IntHashSet();
    IntHashSet _ltwIntSet = new IntHashSet();
    IntHashSet _lwncbIntSet = new IntHashSet();
    IntHashSet _lwncwIntSet = new IntHashSet();
    IntHashSet _lwndbIntSet = new IntHashSet();
    IntHashSet _peaIntSet = new IntHashSet();
    IntHashSet _pedIntSet = new IntHashSet();
    IntHashSet _pbeaIntSet = new IntHashSet();
    Procedures _ppProcedures = new Procedures(true, true, _peaIntSet, _pedIntSet, true, true,
        _pbeaIntSet,
        new IntHashSet());

    HashSet<String> _setRlsString = new HashSet<String>();
    IntHashSet _trtbIntSet = new IntHashSet();
    IntHashSet _trtwIntSet = new IntHashSet();
    IntHashSet _twrcbIntSet = new IntHashSet();
    IntHashSet _twrdbIntSet = new IntHashSet();
    IntHashSet _twrdwIntSet = new IntHashSet();
    IntObjectHashMap<IntSet> _intObjectMapPflIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntObjectHashMap<IntSet> _intObjectMapPftrIntSet3 = IntObjectHashMap.<IntSet>newMap();
    IntHashSet _lafpnIntSet3 = new IntHashSet();
    IntHashSet _paflIntSet3 = new IntHashSet();
    IntHashSet _paftrIntSet3 = new IntHashSet();
    Properties _waProperties = new Properties(_intObjectMapPflIntSet3, _intObjectMapPftrIntSet3,
        true, true,
        _lafpnIntSet3, _paflIntSet3, _paftrIntSet3, new IntHashSet());

    IntHashSet _wcrwtIntSet = new IntHashSet();
    assertFalse(
        (new AccessModeImpl(_adminAccessMode, _arProperties, authFuncEntitlements, _btlIntSet,
            _drProperties,
            _dwProperties, true, true, true, true, true, true, true, true, true, true, true, true,
            true, true, true, true,
            true, true, true, true, true, true, true, _lrbIntSet, _lrwIntSet, _lsbIntSet,
            _lswIntSet, _ltwIntSet,
            _lwncbIntSet, _lwncwIntSet, _lwndbIntSet, _ppProcedures, _setRlsString, " str Dtbs",
            _trtbIntSet, _trtwIntSet,
            _twrcbIntSet, _twrdbIntSet, _twrdwIntSet, _waProperties, _wcrwtIntSet,
            new IntHashSet()))
            .shouldBoostProcedure(1));
  }

  @Test
  void testPermissionStateFrmbaltAccessModeImplPermissionState() {
    assertEquals(AccessModeImpl.PermissionState.PS_GRANT_REFUSED,
        AccessModeImpl.PermissionState.frmbaltAccessModeImplPermissionState(true));
    assertEquals(AccessModeImpl.PermissionState.PS_DENY,
        AccessModeImpl.PermissionState.frmbaltAccessModeImplPermissionState(false));
  }

  @Test
  void testPermissionStateFrmwiltAccessModeImplPermissionState() {
    assertEquals(AccessModeImpl.PermissionState.PS_GRANT_GIVEN,
        AccessModeImpl.PermissionState.frmwiltAccessModeImplPermissionState(true));
    assertEquals(AccessModeImpl.PermissionState.PS_GRANT_REFUSED,
        AccessModeImpl.PermissionState.frmwiltAccessModeImplPermissionState(false));
  }

  @Test
  void testPermissionStateCobeAccessModeImplPermissionState() {
    assertEquals(AccessModeImpl.PermissionState.PS_GRANT_REFUSED,
        AccessModeImpl.PermissionState.PS_GRANT_REFUSED
            .cobeAccessModeImplPermissionState(AccessModeImpl.PermissionState.PS_GRANT_REFUSED));
    assertEquals(AccessModeImpl.PermissionState.PS_GRANT_GIVEN,
        AccessModeImpl.PermissionState.PS_GRANT_GIVEN
            .cobeAccessModeImplPermissionState(AccessModeImpl.PermissionState.PS_GRANT_REFUSED));
  }

  @Test
  void testPermissionStateIsAloae() {
    assertFalse(AccessModeImpl.PermissionState.PS_GRANT_REFUSED.isAloae());
    assertTrue(AccessModeImpl.PermissionState.PS_GRANT_GIVEN.isAloae());
  }
}

