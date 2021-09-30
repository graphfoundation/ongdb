package io.github.onograph.server.security.systemgraph.versions;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.SecurityElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.neo4j.cypher.internal.security.SystemGraphCredential;
import org.neo4j.dbms.database.ComponentVersion;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.NotFoundException;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public abstract class AvailableSecurityKnownSystemComponentVersionSecurity extends
    SecurityKnownSecurityComponentVersion {


  static final String DBAM = io.github.onograph.TokenConstants.DATABASE;


  protected AvailableSecurityKnownSystemComponentVersionSecurity(
      AbstractSecurityLog _abstractSecurityLog, ComponentVersion _componentVersion) {
    super(_abstractSecurityLog, _componentVersion);
  }


  private static String _gedfdanmString(Transaction _tTransaction) {

    String _strNdd = "";

    Node defGdbName = _tTransaction.findNode(GDB_LBL, io.github.onograph.TokenConstants.DEFAULT,
        true);
    if (defGdbName != null) {
      _strNdd = defGdbName.getProperty(io.github.onograph.TokenConstants.NAME, "").toString();
    }

    return _strNdd;
  }


  private static void _gretpvetForTrNoNo(Node _qaiirNode, Node _roNode, Transaction _tTransaction) {

    Node _daNode = megnoNode(GDB_ALL_LBL, Map.of(io.github.onograph.TokenConstants.NAME, "*"),
        _tTransaction);

    Node _rdNode = megnoNode(REOC_LBL, Map.of(io.github.onograph.TokenConstants.TYPE,
            SecurityElement.ElementType.DATABASE.toString(),
            io.github.onograph.TokenConstants.ARG1, "", io.github.onograph.TokenConstants.ARG2, ""),
        _tTransaction);

    Node _sgetNode = megseeNode(_daNode, _qaiirNode, _tTransaction);

    Node _piieeNode = _tTransaction.createNode(PRVE_LBL);
    seplnoForNoStNoNo(_piieeNode, _rdNode, _sgetNode, PrivilegeAction.EXECUTE.toString());
    _roNode.createRelationshipTo(_piieeNode, GRND_RELATIONSHIP_TYPE);
  }


  static void gretfcpltoForTrNo(Node _rNode, Transaction _tTransaction) {

    Node _qfNode = megnoNode(Label.label(io.github.onograph.TokenConstants.FUNCTION_QUALIFIER_ALL),
        Map.of(io.github.onograph.TokenConstants.TYPE, io.github.onograph.TokenConstants.FUNCTION,
            io.github.onograph.TokenConstants.LABEL2, "*"),
        _tTransaction);
    _gretpvetForTrNoNo(_qfNode, _rNode, _tTransaction);
  }


  static void gretpcepitForTrNo(Node _rolNode, Transaction _tTransaction) {

    Node _qpNode = megnoNode(Label.label(io.github.onograph.TokenConstants.PROCEDURE_QUALIFIER_ALL),
        Map.of(io.github.onograph.TokenConstants.TYPE, io.github.onograph.TokenConstants.PROCEDURE,
            io.github.onograph.TokenConstants.LABEL2, "*"),
        _tTransaction);
    _gretpvetForTrNoNo(_qpNode, _rolNode, _tTransaction);
  }


  static Node megnoNode(Label lbl, Map<String, Object> _mapPoeteso, Transaction _tTransaction) {

    ResourceIterator<Node> _resourceIteratorNdsNode = _tTransaction.findNodes(lbl, _mapPoeteso);

    Node _node;
    if (_resourceIteratorNdsNode.hasNext()) {
      _node = _resourceIteratorNdsNode.next();
    } else {
      _node = _tTransaction.createNode(lbl);
      Objects.requireNonNull(_node);
      _mapPoeteso.forEach(_node::setProperty);
    }

    _resourceIteratorNdsNode.close();
    return _node;
  }


  static Node megseeNode(Node _dNode, Node _qaiirNode, Transaction _tTransaction) {

    List<Node> _listNsNode = new ArrayList();
    _qaiirNode.getRelationships(Direction.INCOMING, new RelationshipType[]{QULI_RELATIONSHIP_TYPE})
        .forEach((r) ->
        {
          _listNsNode
              .add(r.getOtherNode(
                  _qaiirNode));
        });

    Iterator _iterator = _listNsNode.iterator();

    while (_iterator.hasNext()) {

      Node _sgetNode = (Node) _iterator.next();

      List<Node> _listNdNode = new ArrayList();
      _sgetNode.getRelationships(Direction.OUTGOING, new RelationshipType[]{FOR_RELATIONSHIP_TYPE})
          .forEach((r) ->
          {
            _listNdNode.add(
                r.getOtherNode(_sgetNode));
          });

      Iterator _iterator2 = _listNdNode.iterator();

      while (_iterator2.hasNext()) {

        Node _node = (Node) _iterator2.next();
        if (_node.getId() == _dNode.getId()) {
          return _sgetNode;
        }
      }
    }

    Node _slNode = _tTransaction.createNode(SEMT_LBL);
    _slNode.createRelationshipTo(_qaiirNode, QULI_RELATIONSHIP_TYPE);
    _slNode.createRelationshipTo(_dNode, FOR_RELATIONSHIP_TYPE);
    return _slNode;
  }


  static void seplnoForNoStNoNo(Node _prNode, Node _rsucNode, Node _sgetNode, String _strAto) {
    _prNode.setProperty(io.github.onograph.TokenConstants.ACTION, _strAto);
    _prNode.createRelationshipTo(_sgetNode, SCP_RELATIONSHIP_TYPE);
    _prNode.createRelationshipTo(_rsucNode, APLS_RELATIONSHIP_TYPE);
  }


  private Map<String, ArrayList<String>> _gerltrsapreMap(String gdbName, boolean _isPs,
      List<String> _listRlsString, Transaction _tTransaction) {

    Map<String, ArrayList<String>> _mapPtrsa = new HashMap();

    String _strDdn = _gedfdanmString(_tTransaction);

    Iterator _iterator = _listRlsString.iterator();

    while (true) {

      String r;

      Set _rpSet;
      do {
        do {
          if (!_iterator.hasNext()) {
            return _mapPtrsa;
          }

          r = (String) _iterator.next();

          Set<ElementEntitlementDTO> _setPiieeElementEntitlementDTO = this.cungplforeSet(r,
              _tTransaction);

          Predicate<ElementEntitlementDTO> _predicatePriElementEntitlementDTO = (p) ->
          {
            return p.getIsDa() || p.getGdbName().equals(gdbName)
                || gdbName.equals(_strDdn) && p.getDefGdbName();
          };
          _rpSet = _setPiieeElementEntitlementDTO.stream()
              .filter(_predicatePriElementEntitlementDTO).filter((p) ->
              {
                return !p.isDspi();
              }).collect(Collectors.toSet());
          if (!_rpSet.isEmpty()) {
            _mapPtrsa.put(r, new ArrayList());
          }
        }
        while (_rpSet.isEmpty());
      }
      while (!_isPs);

      _mapPtrsa.get(r).add(String.format(io.github.onograph.I18N.format(
              "io.github.onograph.server.security.systemgraph.versions.AvailableSecurityKnownSystemComponentVersionSecurity.format3"),
          r));

      Set<String> _setPrString = new HashSet();

      Iterator _iterator2 = _rpSet.iterator();

      while (_iterator2.hasNext()) {

        ElementEntitlementDTO _piieeElementEntitlementDTO = (ElementEntitlementDTO) _iterator2.next();

        try {
          _setPrString.addAll(_piieeElementEntitlementDTO._ascoafList(false, r,
              io.github.onograph.TokenConstants.DATABASE));
        } catch (

            RuntimeException _runtimeException) {

        }
      }

      _mapPtrsa.get(r).addAll(_setPrString);
    }
  }


  private List<String> _geueacnList(boolean _isWrg, Set<String> _setRrString,
      Transaction _tTransaction) {

    Map<String, String> _mapUesss = new HashMap();

    Map<String, List<String>> _mapRtusl = new HashMap();

    Iterator _iterator = _setRrString.iterator();

    while (_iterator.hasNext()) {

      String r = (String) _iterator.next();

      Node _rNode =
          _tTransaction.findNode(Label.label(io.github.onograph.TokenConstants.ROLE2),
              io.github.onograph.TokenConstants.NAME, r);
      _rNode.getRelationships(Direction.INCOMING,
              new RelationshipType[]{
                  RelationshipType.withName(io.github.onograph.TokenConstants.HAS_ROLE)})
          .forEach((rel) ->
          {

            Node
                _satNode =
                rel.getStartNode();

            Map<String, Object>
                _mapPoeteso =
                _satNode
                    .getAllProperties();

            String
                uname =
                (String) _mapPoeteso
                    .get(io.github.onograph.TokenConstants.NAME);

            String
                _strVr00 =
                (Boolean) _mapPoeteso
                    .get(io.github.onograph.TokenConstants.PASSWORD_CHANGE_REQUIRED)
                    ? ""
                    : io.github.onograph.I18N.format(
                        "io.github.onograph.server.security.systemgraph.versions.AvailableSecurityKnownSystemComponentVersionSecurity.var");

            String
                _strRc =

                "CHANGE " +
                    _strVr00 + io.github.onograph.TokenConstants.REQUIRED;

            String
                _strSs =

                "SET STATUS " +
                    ((Boolean) _mapPoeteso
                        .get(io.github.onograph.TokenConstants.SUSPENDED)
                        ? io.github.onograph.TokenConstants.SUSPENDED
                        : io.github.onograph.TokenConstants.ACTIVE);

            try {

              String
                  _strCm =
                  SystemGraphCredential
                      .maskSerialized(
                          (String) _mapPoeteso
                              .get(io.github.onograph.TokenConstants.CREDENTIALS));
              _mapUesss.put(
                  uname,
                  String.format(io.github.onograph.I18N.format(
                          "io.github.onograph.server.security.systemgraph.versions.AvailableSecurityKnownSystemComponentVersionSecurity.format4"),
                      uname,
                      _strCm,
                      _strRc,
                      _strSs));
              _mapRtusl
                  .computeIfAbsent(
                      uname,
                      (u) ->
                      {
                        return new ArrayList();
                      });
              if (_isWrg) {
                _mapRtusl
                    .get(uname)
                    .add(String.format(io.github.onograph.I18N.format(
                            "io.github.onograph.server.security.systemgraph.versions.AvailableSecurityKnownSystemComponentVersionSecurity.format5"),
                        r,
                        uname));
              }
            } catch (

                IllegalArgumentException _illegalArgumentException) {

            }
          });
    }

    List<String> _listCmadString = new ArrayList();
    _mapUesss.forEach((user, command) ->
    {
      _listCmadString.add(command);
      _listCmadString.addAll(_mapRtusl.get(user));
    });
    return _listCmadString;
  }

  @Override
  public void astutwhaoForPrElSe(ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment)
      throws UnsupportedOperationException {
    if (!this.isSurudacForPr(_privilegeAction)) {
      throw this.unpdaoUnsupportedOperationException();
    }
  }

  @Override
  public Set<ElementEntitlementDTO> cungplforeSet(String role, Transaction _tTransaction) {

    HashSet _prHashSet = new HashSet();

    try {

      Node _rolNode =
          _tTransaction.findNode(Label.label(io.github.onograph.TokenConstants.ROLE2),
              io.github.onograph.TokenConstants.NAME,
              role);
      if (_rolNode != null) {
        _rolNode.getRelationships(Direction.OUTGOING).forEach((relToPriv) ->
        {
          try {

            Node _piieeNode = relToPriv.getEndNode();

            String _strDog = relToPriv.getType().name();

            String _strAto = (String) _piieeNode.getProperty(
                io.github.onograph.TokenConstants.ACTION);

            Node _rsucNode = Iterables.single(_piieeNode
                    .getRelationships(
                        Direction.OUTGOING,
                        RelationshipType
                            .withName(
                                io.github.onograph.TokenConstants.APPLIES_TO)))
                .getEndNode();

            Node _sgetNode = Iterables.single(_piieeNode
                    .getRelationships(
                        Direction.OUTGOING,
                        RelationshipType.withName(
                            io.github.onograph.TokenConstants.SCOPE)))
                .getEndNode();

            Node _dNode = Iterables.single(_sgetNode.getRelationships(
                    Direction.OUTGOING,
                    RelationshipType.withName(
                        io.github.onograph.TokenConstants.FOR)))
                .getEndNode();

            String gdbName = (String) _dNode.getProperty(
                io.github.onograph.TokenConstants.NAME);

            Node _qaiirNode = Iterables.single(_sgetNode
                    .getRelationships(
                        Direction.OUTGOING,
                        RelationshipType
                            .withName(
                                io.github.onograph.TokenConstants.QUALIFIED)))
                .getEndNode();

            ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType =
                ElementEntitlementDTO.EntitlementActionType.createUsingRelationshipType(
                    _strDog);

            GdbPrivGenerator _bpGdbPrivGenerator =
                this.maprebiGdbPrivGenerator(_tpEntitlementActionType, _strAto);
            _bpGdbPrivGenerator.qaiirNode(_qaiirNode)
                .onreueGdbPrivGenerator(_rsucNode);

            String _strLd = Iterables.single(_dNode.getLabels()).name();

            byte _byte1 = -1;
            switch (_strLd.hashCode()) {
              case -1810636282:
                if (_strLd.equals(
                    io.github.onograph.TokenConstants.DATABASE_ALL)) {
                  _byte1 = 1;
                }
                break;
              case -721472364:
                if (_strLd.equals(
                    io.github.onograph.TokenConstants.DELETED_DATABASE)) {
                  _byte1 = 3;
                }
                break;
              case 1447134246:
                if (_strLd.equals(
                    io.github.onograph.TokenConstants.DATABASE_DEFAULT)) {
                  _byte1 = 2;
                }
                break;
              case 1854109083:
                if (_strLd.equals(io.github.onograph.TokenConstants.DATABASE2)) {
                  _byte1 = 0;
                }
            }

            switch (_byte1) {
              case 0:
                _bpGdbPrivGenerator.fodasGdbPrivGenerator(gdbName);
                break;
              case 1:
                _bpGdbPrivGenerator.foaldbGdbPrivGenerator();
                break;
              case 2:
                _bpGdbPrivGenerator.fodfdaGdbPrivGenerator();
                break;
              case 3:
                return;
              default:

                throw new IllegalStateException(
                    "*** Error: 066efd31-3097-4bb7-b347-6132fc8c6d79");
            }

            _prHashSet.addAll(_bpGdbPrivGenerator.bulSet());
          } catch (

              InvalidArgumentsException _invalidArgumentsException) {

            throw new IllegalStateException(
                "*** Error:  9a94033c-46b7-4877-ab40-8ba1540f0047",
                _invalidArgumentsException);
          }
        });
      }
    } catch (

        NotFoundException _notFoundException) {
    }

    return _prHashSet;
  }


  protected Set<ElementEntitlementDTO> cungplforeSet(
      Cache<String, Set<ElementEntitlementDTO>> _cacheCpss, List<String> _listNrString,
      Transaction _tTransaction) {
    try {

      Set<ElementEntitlementDTO> _setPiieeElementEntitlementDTO = new HashSet();

      Iterator _iterator = _listNrString.iterator();

      while (_iterator.hasNext()) {

        String role = (String) _iterator.next();

        Set<ElementEntitlementDTO> _setPrElementEntitlementDTO = this.cungplforeSet(role,
            _tTransaction);
        _setPrElementEntitlementDTO.addAll(this.getmrpveSet());
        _cacheCpss.put(role, _setPrElementEntitlementDTO);
        _setPiieeElementEntitlementDTO.addAll(_setPrElementEntitlementDTO);
      }

      return _setPiieeElementEntitlementDTO;
    } catch (

        InvalidArgumentsException _invalidArgumentsException) {

      throw new IllegalStateException("*** Error:  906537ad-a814-4b40-8e57-98e97c03f636",
          _invalidArgumentsException);
    }
  }

  @Override
  public GdbAuthActions gebccodGdbAuthActions(boolean _isSr, boolean _isUs, String gdbName,
      Transaction _tTransaction) {

    ArrayList<String> _arrayListSrString = new ArrayList();

    ArrayList<String> _arrayListSuString = new ArrayList();
    _arrayListSrString.add(String.format(io.github.onograph.I18N.format(
            "io.github.onograph.server.security.systemgraph.versions.AvailableSecurityKnownSystemComponentVersionSecurity.format"),
        io.github.onograph.TokenConstants.DATABASE));

    Node _dtbsNode =
        _tTransaction.findNode(Label.label(io.github.onograph.TokenConstants.DATABASE2),
            io.github.onograph.TokenConstants.NAME,
            gdbName);
    if (_dtbsNode != null &&
        _dtbsNode.getProperty(io.github.onograph.TokenConstants.STATUS)
            .equals(io.github.onograph.TokenConstants.OFFLINE)) {
      _arrayListSrString.add(String.format(io.github.onograph.I18N.format(
              "io.github.onograph.server.security.systemgraph.versions.AvailableSecurityKnownSystemComponentVersionSecurity.format2"),
          io.github.onograph.TokenConstants.DATABASE));
    }

    ResourceIterator<Node> _resourceIteratorNrNode = _tTransaction.findNodes(RLX_LBL);

    List _rlsList;
    try {
      _rlsList = _resourceIteratorNrNode.stream().map((r) ->
      {
        return r.getProperty(io.github.onograph.TokenConstants.NAME).toString();
      }).filter((r) ->
      {
        return !r.equals(io.github.onograph.TokenConstants.PUBLIC);
      }).collect(Collectors.toList());
    } catch (

        Throwable _throwable) {
      if (_resourceIteratorNrNode != null) {
        try {
          _resourceIteratorNrNode.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_resourceIteratorNrNode != null) {
      _resourceIteratorNrNode.close();
    }

    Map<String, ArrayList<String>> _mapPtrsa = this._gerltrsapreMap(gdbName, _isSr, _rlsList,
        _tTransaction);

    Set<String> _setRrString = _mapPtrsa.keySet();
    if (_isSr) {
      _setRrString.forEach((role) ->
      {
        _arrayListSrString.addAll(_mapPtrsa.get(role));
      });
    }

    if (_isUs) {
      _arrayListSuString.addAll(this._geueacnList(_isSr, _setRrString, _tTransaction));
    }

    return new GdbAuthActions(_arrayListSrString, _arrayListSuString);
  }


  Set<ElementEntitlementDTO> getmrpveSet() throws InvalidArgumentsException {
    return Collections.emptySet();
  }


  public abstract GdbPrivGenerator maprebiGdbPrivGenerator(
      ElementEntitlementDTO.EntitlementActionType _entitlementActionType, String _strVa);


  UnsupportedOperationException unpdaoUnsupportedOperationException() {
    return new UnsupportedOperationException("*** Error: e8ca75df-b976-4f33-9ed6-476a4112286e");
  }
}
