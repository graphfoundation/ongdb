package io.github.onograph.server.security.systemgraph.versions;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.SecurityElement;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.ProcedureSegment;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public class SecurityKnownSystemComponentVersionC40 extends
    AvailableSecurityKnownSystemComponentVersionSecurity {


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionC40(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_40);
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }

  @Override
  public void astutwhaoForPrElSe(ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment)
      throws UnsupportedOperationException {
    if (!this.isSurudacForPr(_privilegeAction)
        || ElementEntitlementDTO.GdbEntitlementType.EAT_GENERAL == gdbEntitlementType) {
      throw this.unpdaoUnsupportedOperationException();
    }
  }

  @Override
  public boolean detected(Transaction _tTransaction) {
    return nodesWithLabelExist(_tTransaction, GDB_ALL_LBL) && !nodesWithLabelExist(_tTransaction,
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
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_SCHEMA_COM),
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
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_PROP_READ),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.READ_REL_PROP),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING),
            GRND_RELATIONSHIP_TYPE);
        break;
      case 1:
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_SCHEMA_COM),
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
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_PROP_READ),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.READ_REL_PROP),
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
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_PROP_READ),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.READ_REL_PROP),
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
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_PROP_READ),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.READ_REL_PROP),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING),
            GRND_RELATIONSHIP_TYPE);
        break;
      case 4:
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_REL_TRAV),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_PROP_READ),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.READ_REL_PROP),
            GRND_RELATIONSHIP_TYPE);
        r.createRelationshipTo(
            _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING),
            GRND_RELATIONSHIP_TYPE);
    }
  }

  @Override
  boolean isSurudacForPr(PrivilegeAction _privilegeAction) {
    switch (_privilegeAction) {
      case ACCESS:
      case START_DATABASE:
      case STOP_DATABASE:
      case CREATE_INDEX:
      case DROP_INDEX:
      case INDEX:
      case CREATE_CONSTRAINT:
      case DROP_CONSTRAINT:
      case CONSTRAINT:
      case CREATE_LABEL:
      case CREATE_RELTYPE:
      case CREATE_PROPERTYKEY:
      case TOKEN:
      case DATABASE_ACTIONS:
      case CREATE_ROLE:
      case DROP_ROLE:
      case ASSIGN_ROLE:
      case REMOVE_ROLE:
      case SHOW_ROLE:
      case ROLE_MANAGEMENT:
      case TRAVERSE:
      case READ:
      case MATCH:
      case WRITE:
        return true;
      default:
        return false;
    }
  }

  @Override
  public GdbPrivGenerator maprebiGdbPrivGenerator(
      ElementEntitlementDTO.EntitlementActionType _tpEntitlementActionType, String _strAto) {
    return new GdbPrivGeneratorImpl(_strAto, _tpEntitlementActionType);
  }

  @Override
  public void seudlpveForTrNo(NodeGdbPrivFacade _spNodeGdbPrivFacade, Transaction _tTransaction) {

    Node _daNode = _tTransaction.createNode(GDB_ALL_LBL);
    _daNode.setProperty(io.github.onograph.TokenConstants.NAME, "*");

    Node _lqNode = _tTransaction.createNode(
        Label.label(io.github.onograph.TokenConstants.LABEL_QUALIFIER_ALL));
    _lqNode.setProperty(io.github.onograph.TokenConstants.TYPE,
        io.github.onograph.TokenConstants.NODE);
    _lqNode.setProperty(io.github.onograph.TokenConstants.LABEL2, "*");

    Node _qrNode = _tTransaction.createNode(
        Label.label(io.github.onograph.TokenConstants.RELATIONSHIP_QUALIFIER_ALL));
    _qrNode.setProperty(io.github.onograph.TokenConstants.TYPE,
        io.github.onograph.TokenConstants.RELATIONSHIP);
    _qrNode.setProperty(io.github.onograph.TokenConstants.LABEL2, "*");

    Node _qdNode = _tTransaction.createNode(
        Label.label(io.github.onograph.TokenConstants.DATABASE_QUALIFIER));
    _qdNode.setProperty(io.github.onograph.TokenConstants.TYPE,
        io.github.onograph.TokenConstants.DATABASE);
    _qdNode.setProperty(io.github.onograph.TokenConstants.LABEL2, "");

    Node _slNode = _tTransaction.createNode(SEMT_LBL);
    _slNode.createRelationshipTo(_lqNode, QULI_RELATIONSHIP_TYPE);
    _slNode.createRelationshipTo(_daNode, FOR_RELATIONSHIP_TYPE);

    Node _srNode = _tTransaction.createNode(SEMT_LBL);
    _srNode.createRelationshipTo(_qrNode, QULI_RELATIONSHIP_TYPE);
    _srNode.createRelationshipTo(_daNode, FOR_RELATIONSHIP_TYPE);

    Node _sdNode = _tTransaction.createNode(SEMT_LBL);
    _sdNode.createRelationshipTo(_qdNode, QULI_RELATIONSHIP_TYPE);
    _sdNode.createRelationshipTo(_daNode, FOR_RELATIONSHIP_TYPE);

    Node _grNode = _tTransaction.createNode(REOC_LBL);
    _grNode.setProperty(io.github.onograph.TokenConstants.TYPE,
        SecurityElement.ElementType.GRAPH.toString());
    _grNode.setProperty(io.github.onograph.TokenConstants.ARG1, "");
    _grNode.setProperty(io.github.onograph.TokenConstants.ARG2, "");

    Node _rpaNode = _tTransaction.createNode(REOC_LBL);
    _rpaNode.setProperty(io.github.onograph.TokenConstants.TYPE,
        SecurityElement.ElementType.ALL_PROPERTIES.toString());
    _rpaNode.setProperty(io.github.onograph.TokenConstants.ARG1, "");
    _rpaNode.setProperty(io.github.onograph.TokenConstants.ARG2, "");

    Node _rdNode = _tTransaction.createNode(REOC_LBL);
    _rdNode.setProperty(io.github.onograph.TokenConstants.TYPE,
        SecurityElement.ElementType.DATABASE.toString());
    _rdNode.setProperty(io.github.onograph.TokenConstants.ARG1, "");
    _rdNode.setProperty(io.github.onograph.TokenConstants.ARG2, "");

    Node _ptNode = _tTransaction.createNode(PRVE_LBL);

    Node _trpNode = _tTransaction.createNode(PRVE_LBL);

    Node _prNode = _tTransaction.createNode(PRVE_LBL);

    Node _prrNode = _tTransaction.createNode(PRVE_LBL);

    Node _wpNode = _tTransaction.createNode(PRVE_LBL);

    Node _prwNode = _tTransaction.createNode(PRVE_LBL);

    Node _paNode = _tTransaction.createNode(PRVE_LBL);

    Node _ptNode2 = _tTransaction.createNode(PRVE_LBL);

    Node _psNode = _tTransaction.createNode(PRVE_LBL);

    Node _paNode2 = _tTransaction.createNode(PRVE_LBL);
    seplnoForNoStNoNo(_ptNode, _grNode, _slNode, PrivilegeAction.TRAVERSE.toString());
    seplnoForNoStNoNo(_trpNode, _grNode, _srNode, PrivilegeAction.TRAVERSE.toString());
    seplnoForNoStNoNo(_prNode, _rpaNode, _slNode, PrivilegeAction.READ.toString());
    seplnoForNoStNoNo(_prrNode, _rpaNode, _srNode, PrivilegeAction.READ.toString());
    seplnoForNoStNoNo(_wpNode, _rpaNode, _slNode, PrivilegeAction.WRITE.toString());
    seplnoForNoStNoNo(_prwNode, _rpaNode, _srNode, PrivilegeAction.WRITE.toString());
    seplnoForNoStNoNo(_paNode, _rdNode, _sdNode, PrivilegeAction.ACCESS.toString());
    seplnoForNoStNoNo(_ptNode2, _rdNode, _sdNode, PrivilegeAction.TOKEN.toString());
    seplnoForNoStNoNo(_psNode, _rdNode, _sdNode, io.github.onograph.TokenConstants.SCHEMA);
    seplnoForNoStNoNo(_paNode2, _rdNode, _sdNode, PrivilegeAction.ADMIN.toString());
    _spNodeGdbPrivFacade.sepveForNoNo(_ptNode, NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_TRAV);
    _spNodeGdbPrivFacade.sepveForNoNo(_trpNode, NodeGdbPrivFacade.PRIVILEGE.ACC_REL_TRAV);
    _spNodeGdbPrivFacade.sepveForNoNo(_prNode, NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_PROP_READ);
    _spNodeGdbPrivFacade.sepveForNoNo(_prrNode, NodeGdbPrivFacade.PRIVILEGE.READ_REL_PROP);
    _spNodeGdbPrivFacade.sepveForNoNo(_wpNode, NodeGdbPrivFacade.PRIVILEGE.ACC_CREATE_UPDATE_NODE);
    _spNodeGdbPrivFacade.sepveForNoNo(_prwNode, NodeGdbPrivFacade.PRIVILEGE.ACC_REL_WRITE);
    _spNodeGdbPrivFacade.sepveForNoNo(_paNode, NodeGdbPrivFacade.PRIVILEGE.ACC_EVERYTHING);
    _spNodeGdbPrivFacade.sepveForNoNo(_ptNode2, NodeGdbPrivFacade.PRIVILEGE.ACC_TKN);
    _spNodeGdbPrivFacade.sepveForNoNo(_psNode, NodeGdbPrivFacade.PRIVILEGE.ACC_SCHEMA_COM);
    _spNodeGdbPrivFacade.sepveForNoNo(_paNode2, NodeGdbPrivFacade.PRIVILEGE.ACC_ADMIN);
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    if (sourceVInt < this.version) {
      this.peiuSecurityKnownSecurityComponentVersion.updsugForTr(sourceVInt, _tTransaction);

      NodeGdbPrivFacade _spNodeGdbPrivFacade = new NodeGdbPrivFacade();
      this.seudlpveForTrNo(_spNodeGdbPrivFacade, _tTransaction);

      List<Node> _listRlsNode = _tTransaction.findNodes(RLX_LBL).stream()
          .collect(Collectors.toList());

      Iterator _iterator = _listRlsNode.iterator();

      while (_iterator.hasNext()) {

        Node r = (Node) _iterator.next();
        this.grdlpveForNoStNo(r, _spNodeGdbPrivFacade,
            r.getProperty(io.github.onograph.TokenConstants.NAME).toString());
      }
    }
  }
}
