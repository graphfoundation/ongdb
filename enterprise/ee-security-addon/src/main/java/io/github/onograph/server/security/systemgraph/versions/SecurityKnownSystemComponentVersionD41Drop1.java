package io.github.onograph.server.security.systemgraph.versions;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.SecurityElement;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.ProcedureSegment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public class SecurityKnownSystemComponentVersionD41Drop1 extends
    AvailableSecurityKnownSystemComponentVersionSecurity {


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionD41Drop1(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_41D1);
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }


  private static void _updfmsmpvetidadcttpForTr(Transaction _tTransaction) {

    Node _shmNode = _tTransaction.findNode(PRVE_LBL, io.github.onograph.TokenConstants.ACTION,
        io.github.onograph.TokenConstants.SCHEMA);
    if (_shmNode != null) {

      Relationship _rssRelationship = _shmNode.getSingleRelationship(SCP_RELATIONSHIP_TYPE,
          Direction.OUTGOING);

      Relationship _srrRelationship = _shmNode.getSingleRelationship(APLS_RELATIONSHIP_TYPE,
          Direction.OUTGOING);

      Node _sgetNode = _rssRelationship.getEndNode();

      Node _rsucNode = _srrRelationship.getEndNode();

      Node _idxNode = _tTransaction.findNode(PRVE_LBL, io.github.onograph.TokenConstants.ACTION,
          PrivilegeAction.INDEX.toString());
      if (_idxNode == null) {
        _idxNode = _tTransaction.createNode(PRVE_LBL);
        seplnoForNoStNoNo(_idxNode, _rsucNode, _sgetNode, PrivilegeAction.INDEX.toString());
      }

      Node _cntanNode = _tTransaction.findNode(PRVE_LBL, io.github.onograph.TokenConstants.ACTION,
          PrivilegeAction.CONSTRAINT.toString());
      if (_cntanNode == null) {
        _cntanNode = _tTransaction.createNode(PRVE_LBL);
        seplnoForNoStNoNo(_cntanNode, _rsucNode, _sgetNode, PrivilegeAction.CONSTRAINT.toString());
      }

      Iterator _iterator = _shmNode.getRelationships(new RelationshipType[]{GRND_RELATIONSHIP_TYPE})
          .iterator();

      while (_iterator.hasNext()) {

        Relationship _relationship = (Relationship) _iterator.next();

        Node r = _relationship.getOtherNode(_shmNode);
        r.createRelationshipTo(_idxNode, GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(_cntanNode, GRND_RELATIONSHIP_TYPE);
        _relationship.delete();
      }

      _srrRelationship.delete();
      _rssRelationship.delete();
      _shmNode.delete();
    }
  }


  private static void _updwtfmaprttoghruForTr(Transaction _tTransaction) {

    Node _rgNode = _tTransaction.findNode(Label.label(io.github.onograph.TokenConstants.RESOURCE2),
        io.github.onograph.TokenConstants.TYPE,
        SecurityElement.ElementType.GRAPH.toString());

    ResourceIterator _nwResourceIterator =
        _tTransaction.findNodes(PRVE_LBL, io.github.onograph.TokenConstants.ACTION,
            PrivilegeAction.WRITE.toString());

    while (_nwResourceIterator.hasNext()) {

      Node _wieNode = (Node) _nwResourceIterator.next();

      Relationship _rrwRelationship = _wieNode.getSingleRelationship(APLS_RELATIONSHIP_TYPE,
          Direction.OUTGOING);

      Node _roNode = _rrwRelationship.getEndNode();
      if (!_roNode.getProperty(io.github.onograph.TokenConstants.TYPE)
          .equals(SecurityElement.ElementType.GRAPH.toString())) {
        _wieNode.createRelationshipTo(_rgNode, APLS_RELATIONSHIP_TYPE);
        _rrwRelationship.delete();
      }
    }

    _nwResourceIterator.close();
  }

  @Override
  public boolean detected(Transaction _tTransaction) {
    return nodesWithLabelExist(_tTransaction, GDB_ALL_LBL) && nodesWithLabelExist(_tTransaction,
        GDB_STD_LBL) &&
        this.isConnoivennForTr(_tTransaction);
  }

  @Override
  public Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cacheCpss,
      List<String> _listRnString, Transaction _tTransaction) {
    return super.cungplforeSet(_cacheCpss, _listRnString, _tTransaction);
  }

  @Override
  Set<ElementEntitlementDTO> getmrpveSet() throws InvalidArgumentsException {
    return Collections.singleton(
        new ElementEntitlementDTO(
            ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.EXECUTE,
            new SecurityElement.Dbms(), ProcedureSegment.ALL,
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT));
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _spNodeGdbPrivFacade, String prName) {

    byte _byte1 = -1;
    switch (prName.hashCode()) {
      case -1924094359:
        if (prName.equals(io.github.onograph.TokenConstants.PUBLIC)) {
          _byte1 = 5;
        }
        break;
      case -1665999883:
        if (prName.equals(io.github.onograph.TokenConstants.ARCHITECT)) {
          _byte1 = 1;
        }
        break;
      case -1307827859:
        if (prName.equals(io.github.onograph.TokenConstants.EDITOR)) {
          _byte1 = 3;
        }
        break;
      case -934979389:
        if (prName.equals(io.github.onograph.TokenConstants.READER)) {
          _byte1 = 4;
        }
        break;
      case 92668751:
        if (prName.equals(io.github.onograph.TokenConstants.ADMIN)) {
          _byte1 = 0;
        }
        break;
      case 1447404028:
        if (prName.equals(io.github.onograph.TokenConstants.PUBLISHER)) {
          _byte1 = 2;
        }
    }

    switch (_byte1) {
      case 0:
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_ADMIN),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_CONS),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_IDX),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_TKN),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_CREATE_UPDATE_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_WRITE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_MATCH_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_MATCH),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING),
            GRND_RELATIONSHIP_TYPE);
        break;
      case 1:
        r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_CONS),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_IDX),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_TKN),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_CREATE_UPDATE_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_WRITE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_MATCH_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_MATCH),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING),
            GRND_RELATIONSHIP_TYPE);
        break;
      case 2:
        r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_TKN),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_CREATE_UPDATE_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_WRITE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_MATCH_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_MATCH),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING),
            GRND_RELATIONSHIP_TYPE);
        break;
      case 3:
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_CREATE_UPDATE_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_WRITE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_MATCH_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_MATCH),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING),
            GRND_RELATIONSHIP_TYPE);
        break;
      case 4:
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_MATCH_NODE),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_MATCH),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING),
            GRND_RELATIONSHIP_TYPE);
        break;
      case 5:
        r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.STANDARD),
            GRND_RELATIONSHIP_TYPE);
    }
  }

  @Override
  boolean isSurudacForPr(PrivilegeAction _privilegeAction) {
    switch (_privilegeAction) {
      case CREATE_USER:
      case DROP_USER:
      case SHOW_USER:
      case ALTER_USER:
      case USER_MANAGEMENT:
      case CREATE_DATABASE:
      case DROP_DATABASE:
      case DATABASE_MANAGEMENT:
      case SHOW_PRIVILEGE:
      case ASSIGN_PRIVILEGE:
      case REMOVE_PRIVILEGE:
      case PRIVILEGE_MANAGEMENT:
      case DBMS_ACTIONS:
      case TRANSACTION_MANAGEMENT:
      case SHOW_TRANSACTION:
      case TERMINATE_TRANSACTION:
        return true;
      default:
        return this.peiuSecurityKnownSecurityComponentVersion.isSurudacForPr(_privilegeAction);
    }
  }

  @Override
  public GdbPrivGenerator maprebiGdbPrivGenerator(
      ElementEntitlementDTO.EntitlementActionType _ptEntitlementActionType, String _strAto) {
    return new GdbPrivGenerator(_strAto, _ptEntitlementActionType);
  }

  @Override
  public void seudlpveForTrNo(NodeGdbPrivFacade _spNodeGdbPrivFacade, Transaction _tTransaction) {
    this.peiuSecurityKnownSecurityComponentVersion.seudlpveForTrNo(_spNodeGdbPrivFacade,
        _tTransaction);

    Node _daNode = megnoNode(GDB_ALL_LBL, Map.of(io.github.onograph.TokenConstants.NAME, "*"),
        _tTransaction);

    Node _ddNode = megnoNode(GDB_STD_LBL,
        Map.of(io.github.onograph.TokenConstants.NAME, io.github.onograph.TokenConstants.DEFAULT2),
        _tTransaction);

    Node _lqNode =
        megnoNode(Label.label(io.github.onograph.TokenConstants.LABEL_QUALIFIER_ALL),
            Map.of(io.github.onograph.TokenConstants.TYPE, io.github.onograph.TokenConstants.NODE,
                io.github.onograph.TokenConstants.LABEL2, "*"), _tTransaction);

    Node _qrNode = megnoNode(
        Label.label(io.github.onograph.TokenConstants.RELATIONSHIP_QUALIFIER_ALL),
        Map.of(io.github.onograph.TokenConstants.TYPE,
            io.github.onograph.TokenConstants.RELATIONSHIP,
            io.github.onograph.TokenConstants.LABEL2, "*"),
        _tTransaction);

    Node _dqNode = megnoNode(Label.label(io.github.onograph.TokenConstants.DATABASE_QUALIFIER),
        Map.of(io.github.onograph.TokenConstants.TYPE, io.github.onograph.TokenConstants.DATABASE,
            io.github.onograph.TokenConstants.LABEL2, ""),
        _tTransaction);

    Node _slNode = megseeNode(_daNode, _lqNode, _tTransaction);

    Node _srNode = megseeNode(_daNode, _qrNode, _tTransaction);

    Node _sdNode = megseeNode(_daNode, _dqNode, _tTransaction);

    Node _sddNode = megseeNode(_ddNode, _dqNode, _tTransaction);

    Node _rgNode = megnoNode(Label.label(io.github.onograph.TokenConstants.RESOURCE2),
        Map.of(io.github.onograph.TokenConstants.TYPE, SecurityElement.ElementType.GRAPH.toString(),
            io.github.onograph.TokenConstants.ARG1, "", io.github.onograph.TokenConstants.ARG2, ""),
        _tTransaction);

    Node _rpaNode = megnoNode(Label.label(io.github.onograph.TokenConstants.RESOURCE2),
        Map.of(io.github.onograph.TokenConstants.TYPE,
            SecurityElement.ElementType.ALL_PROPERTIES.toString(),
            io.github.onograph.TokenConstants.ARG1, "", io.github.onograph.TokenConstants.ARG2, ""),
        _tTransaction);

    Node _rdNode = megnoNode(REOC_LBL, Map.of(io.github.onograph.TokenConstants.TYPE,
            SecurityElement.ElementType.DATABASE.toString(),
            io.github.onograph.TokenConstants.ARG1, "", io.github.onograph.TokenConstants.ARG2, ""),
        _tTransaction);

    Node _pmNode = _tTransaction.createNode(PRVE_LBL);

    Node _prmNode = _tTransaction.createNode(PRVE_LBL);

    Node _wpNode = _tTransaction.createNode(PRVE_LBL);

    Node _prwNode = _tTransaction.createNode(PRVE_LBL);

    Node _padNode = _tTransaction.createNode(PRVE_LBL);

    Node _piNode = _tTransaction.createNode(PRVE_LBL);

    Node _pcNode = _tTransaction.createNode(PRVE_LBL);
    seplnoForNoStNoNo(_pmNode, _rpaNode, _slNode, PrivilegeAction.MATCH.toString());
    seplnoForNoStNoNo(_prmNode, _rpaNode, _srNode, PrivilegeAction.MATCH.toString());
    seplnoForNoStNoNo(_wpNode, _rgNode, _slNode, PrivilegeAction.WRITE.toString());
    seplnoForNoStNoNo(_prwNode, _rgNode, _srNode, PrivilegeAction.WRITE.toString());
    seplnoForNoStNoNo(_padNode, _rdNode, _sddNode, PrivilegeAction.ACCESS.toString());
    seplnoForNoStNoNo(_piNode, _rdNode, _sdNode, PrivilegeAction.INDEX.toString());
    seplnoForNoStNoNo(_pcNode, _rdNode, _sdNode, PrivilegeAction.CONSTRAINT.toString());
    _spNodeGdbPrivFacade.sepveForNoNo(_pmNode, NodeGdbPrivFacade.PRIVILEGE.ACC_MATCH_NODE);
    _spNodeGdbPrivFacade.sepveForNoNo(_prmNode, NodeGdbPrivFacade.PRIVILEGE.ACC_REL_MATCH);
    _spNodeGdbPrivFacade.sepveForNoNo(_wpNode, NodeGdbPrivFacade.PRIVILEGE.ACC_CREATE_UPDATE_NODE);
    _spNodeGdbPrivFacade.sepveForNoNo(_prwNode, NodeGdbPrivFacade.PRIVILEGE.ACC_REL_WRITE);
    _spNodeGdbPrivFacade.sepveForNoNo(_padNode, NodeGdbPrivFacade.PRIVILEGE.STANDARD);
    _spNodeGdbPrivFacade.sepveForNoNo(_piNode, NodeGdbPrivFacade.PRIVILEGE.ACC_IDX);
    _spNodeGdbPrivFacade.sepveForNoNo(_pcNode, NodeGdbPrivFacade.PRIVILEGE.ACC_CONS);
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    if (sourceVInt < this.version) {
      this.peiuSecurityKnownSecurityComponentVersion.updsugForTr(sourceVInt, _tTransaction);
      _updwtfmaprttoghruForTr(_tTransaction);
      _updfmsmpvetidadcttpForTr(_tTransaction);
      crepirefudForTr(_tTransaction);
    }
  }
}
