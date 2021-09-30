package io.github.onograph.server.security.systemgraph.versions;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.SecurityElement;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;


public class SecurityKnownSystemComponentVersionJ43Drop1 extends
    AvailableSecurityKnownSystemComponentVersionSecurity {


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionJ43Drop1(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_43D1);
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }


  private static void _crenpreForTrNo(NodeGdbPrivFacade _spNodeGdbPrivFacade,
      Transaction _tTransaction) {

    Node _daNode = megnoNode(GDB_ALL_LBL, Map.of(io.github.onograph.TokenConstants.NAME, "*"),
        _tTransaction);

    Node _qdNode = megnoNode(Label.label(io.github.onograph.TokenConstants.DATABASE_QUALIFIER),
        Map.of(io.github.onograph.TokenConstants.TYPE, io.github.onograph.TokenConstants.DATABASE,
            io.github.onograph.TokenConstants.LABEL2, ""),
        _tTransaction);

    Node _quNode =
        megnoNode(Label.label(io.github.onograph.TokenConstants.USER_QUALIFIER_ALL),
            Map.of(io.github.onograph.TokenConstants.TYPE, io.github.onograph.TokenConstants.USER,
                io.github.onograph.TokenConstants.LABEL2, "*"), _tTransaction);

    Node _usNode = megseeNode(_daNode, _quNode, _tTransaction);

    Node _sdNode = megseeNode(_daNode, _qdNode, _tTransaction);

    Node _drNode = megnoNode(REOC_LBL, Map.of(io.github.onograph.TokenConstants.TYPE,
            SecurityElement.ElementType.DATABASE.toString(),
            io.github.onograph.TokenConstants.ARG1, "", io.github.onograph.TokenConstants.ARG2, ""),
        _tTransaction);

    Node _ptNode = _tTransaction.createNode(PRVE_LBL);

    Node _pdsNode = _tTransaction.createNode(PRVE_LBL);

    Node _pdsNode2 = _tTransaction.createNode(PRVE_LBL);

    Node _padNode = _tTransaction.createNode(PRVE_LBL);
    seplnoForNoStNoNo(_ptNode, _drNode, _usNode, PrivilegeAction.TRANSACTION_MANAGEMENT.toString());
    seplnoForNoStNoNo(_pdsNode, _drNode, _sdNode, PrivilegeAction.START_DATABASE.toString());
    seplnoForNoStNoNo(_pdsNode2, _drNode, _sdNode, PrivilegeAction.STOP_DATABASE.toString());
    seplnoForNoStNoNo(_padNode, _drNode, _sdNode, PrivilegeAction.DBMS_ACTIONS.toString());
    _spNodeGdbPrivFacade.sepveForNoNo(_ptNode, NodeGdbPrivFacade.PRIVILEGE.ACC_TRX);
    _spNodeGdbPrivFacade.sepveForNoNo(_pdsNode, NodeGdbPrivFacade.PRIVILEGE.ACC_GDB_START);
    _spNodeGdbPrivFacade.sepveForNoNo(_pdsNode2, NodeGdbPrivFacade.PRIVILEGE.ACC_GDB_STOP);
    _spNodeGdbPrivFacade.sepveForNoNo(_padNode, NodeGdbPrivFacade.PRIVILEGE.ACC_ALL_GDBS);
  }

  @Override
  public Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cachePcss,
      List<String> _listRnString, Transaction _tTransaction) {
    return super.cungplforeSet(_cachePcss, _listRnString, _tTransaction);
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _spNodeGdbPrivFacade, String prName) {
    if (prName.equals(io.github.onograph.TokenConstants.ADMIN)) {
      r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_TRX),
          GRND_RELATIONSHIP_TYPE);
      r.createRelationshipTo(
          _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_GDB_START),
          GRND_RELATIONSHIP_TYPE);
      r.createRelationshipTo(
          _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_GDB_STOP),
          GRND_RELATIONSHIP_TYPE);
      r.createRelationshipTo(
          _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_ALL_GDBS),
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
    } else {
      this.peiuSecurityKnownSecurityComponentVersion.grdlpveForNoStNo(r, _spNodeGdbPrivFacade,
          prName);
    }
  }

  @Override
  boolean isSurudacForPr(PrivilegeAction _privilegeAction) {
    return this.peiuSecurityKnownSecurityComponentVersion.isSurudacForPr(_privilegeAction);
  }

  @Override
  public GdbPrivGenerator maprebiGdbPrivGenerator(
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType, String _strAto) {
    return new GdbPrivGenerator(_strAto, _tpEntitlementActionType);
  }

  @Override
  public void seudlpveForTrNo(NodeGdbPrivFacade _spNodeGdbPrivFacade, Transaction _tTransaction) {
    this.peiuSecurityKnownSecurityComponentVersion.seudlpveForTrNo(_spNodeGdbPrivFacade,
        _tTransaction);
    this.setVersionProperty(_tTransaction, this.version);
    _crenpreForTrNo(_spNodeGdbPrivFacade, _tTransaction);
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    if (sourceVInt < this.version) {
      this.peiuSecurityKnownSecurityComponentVersion.updsugForTr(sourceVInt, _tTransaction);
      this.setVersionProperty(_tTransaction, this.version);

      Node _paNode = _tTransaction.findNode(PRVE_LBL, io.github.onograph.TokenConstants.ACTION,
          PrivilegeAction.ADMIN.toString());
      if (_paNode != null) {

        NodeGdbPrivFacade _spNodeGdbPrivFacade = new NodeGdbPrivFacade();
        _crenpreForTrNo(_spNodeGdbPrivFacade, _tTransaction);

        Set<Node> _setAgrNode = new HashSet();
        _paNode.getRelationships(new RelationshipType[]{GRND_RELATIONSHIP_TYPE}).forEach((r) ->
        {
          _setAgrNode.add(r.getOtherNode(_paNode));
        });

        Iterator _iterator = _setAgrNode.iterator();

        while (_iterator.hasNext()) {

          Node r = (Node) _iterator.next();
          r.createRelationshipTo(
              _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_TRX),
              GRND_RELATIONSHIP_TYPE);
          r.createRelationshipTo(
              _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_GDB_START),
              GRND_RELATIONSHIP_TYPE);
          r.createRelationshipTo(
              _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_GDB_STOP),
              GRND_RELATIONSHIP_TYPE);
          r.createRelationshipTo(
              _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_ALL_GDBS),
              GRND_RELATIONSHIP_TYPE);
        }

        _iterator = _paNode.getRelationships().iterator();

        while (_iterator.hasNext()) {

          Relationship _relationship = (Relationship) _iterator.next();
          _relationship.delete();
        }

        _paNode.delete();
      }
    }
  }
}
