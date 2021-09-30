package io.github.onograph.server.security.systemgraph.versions;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.dbms.database.ComponentVersion;
import org.neo4j.dbms.database.KnownSystemComponentVersion;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public abstract class SecurityKnownSecurityComponentVersion extends KnownSystemComponentVersion {


  public static final RelationshipType DEI_RELATIONSHIP_TYPE = RelationshipType.withName(
      io.github.onograph.TokenConstants.DENIED);


  public static final RelationshipType FOR_RELATIONSHIP_TYPE = RelationshipType.withName(
      io.github.onograph.TokenConstants.FOR);


  public static final RelationshipType GRND_RELATIONSHIP_TYPE = RelationshipType.withName(
      io.github.onograph.TokenConstants.GRANTED);


  public static final Label RLX_LBL = Label.label(io.github.onograph.TokenConstants.ROLE2);


  public static final RelationshipType SCP_RELATIONSHIP_TYPE = RelationshipType.withName(
      io.github.onograph.TokenConstants.SCOPE);


  public static final Label USE_LBL = Label.label(io.github.onograph.TokenConstants.USER2);


  public static final RelationshipType USE_TO_RLX = RelationshipType.withName(
      io.github.onograph.TokenConstants.HAS_ROLE);


  static final RelationshipType APLS_RELATIONSHIP_TYPE = RelationshipType.withName(
      io.github.onograph.TokenConstants.APPLIES_TO);


  static final Label GDB_ALL_LBL = Label.label(io.github.onograph.TokenConstants.DATABASE_ALL);


  static final Label GDB_LBL = Label.label(io.github.onograph.TokenConstants.DATABASE2);


  static final Label GDB_STD_LBL = Label.label(io.github.onograph.TokenConstants.DATABASE_DEFAULT);


  static final Label PRVE_LBL = Label.label(io.github.onograph.TokenConstants.PRIVILEGE);


  static final RelationshipType QULI_RELATIONSHIP_TYPE = RelationshipType.withName(
      io.github.onograph.TokenConstants.QUALIFIED);


  static final Label REOC_LBL = Label.label(io.github.onograph.TokenConstants.RESOURCE2);


  static final Label SEMT_LBL = Label.label(io.github.onograph.TokenConstants.SEGMENT2);


  SecurityKnownSecurityComponentVersion(AbstractSecurityLog _abstractSecurityLog,
      ComponentVersion _componentVersion) {
    super(_componentVersion, _abstractSecurityLog);
  }


  private static void _deeusForTrLa(Label lbl, Transaction _tTransaction) {

    ResourceIterator _ndsResourceIterator = _tTransaction.findNodes(lbl);

    try {
      while (_ndsResourceIterator.hasNext()) {

        Node _neNode = (Node) _ndsResourceIterator.next();
        if (_neNode.getDegree(Direction.INCOMING) == 0) {
          _neNode.getRelationships().forEach(Relationship::delete);
          _neNode.delete();
        }
      }
    } catch (

        Throwable _throwable) {
      if (_ndsResourceIterator != null) {
        try {
          _ndsResourceIterator.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_ndsResourceIterator != null) {
      _ndsResourceIterator.close();
    }
  }


  private static Node _nereNode(String role, Transaction _tTransaction) {

    Node _node = _tTransaction.createNode(RLX_LBL);
    _node.setProperty(io.github.onograph.TokenConstants.NAME, role);
    return _node;
  }


  static void crepirefudForTr(Transaction _tTransaction) {
    try {
      _nereNode(io.github.onograph.TokenConstants.PUBLIC, _tTransaction);
    } catch (

        ConstraintViolationException _constraintViolationException) {

      throw new IllegalStateException("*** Error:  03d0817c-99c5-4f8d-9bda-9facca55ec6e",
          _constraintViolationException);
    }
  }


  public static Set<String> geaneSet(Label lbl, Transaction _tTransaction) {

    ResourceIterator<Node> _resourceIteratorNdsNode = _tTransaction.findNodes(lbl);

    Set _set;
    try {
      _set = _resourceIteratorNdsNode.stream().map((node) ->
      {
        return (String) node.getProperty(io.github.onograph.TokenConstants.NAME);
      }).collect(Collectors.toSet());
    } catch (

        Throwable _throwable) {
      if (_resourceIteratorNdsNode != null) {
        try {
          _resourceIteratorNdsNode.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_resourceIteratorNdsNode != null) {
      _resourceIteratorNdsNode.close();
    }

    return _set;
  }


  public void adreturForTrNoSt(Node r, Transaction _tTransaction, String uname)
      throws InvalidArgumentsException {

    Node _useNode = _tTransaction.findNode(USE_LBL, io.github.onograph.TokenConstants.NAME, uname);
    if (_useNode == null) {
      throw this.loadcteenInvalidArgumentsException(String.format(io.github.onograph.I18N.format(
              "io.github.onograph.server.security.systemgraph.versions.SecurityKnownSecurityComponentVersion.format"),
          uname));
    } else {
      _useNode.createRelationshipTo(r, USE_TO_RLX);
    }
  }


  public abstract void astutwhaoForPrElSe(
      ElementEntitlementDTO.GdbEntitlementType _gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment)
      throws UnsupportedOperationException;


  public Set<ElementEntitlementDTO> cungplforeSet(String role, Transaction _tTransaction) {
    throw this.unsupported();
  }


  public abstract GdbAuthActions gebccodGdbAuthActions(boolean _isV, boolean _isVa, String _strVa,
      Transaction _transaction);


  public Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cacheCpss,
      List<String> _listNrString, Transaction _tTransaction) {
    throw this.unsupported();
  }


  public abstract void grdlpveForNoStNo(Node _node, NodeGdbPrivFacade _nodeGdbPrivFacade,
      String _strV);


  public void inaplForTrLiMa(List<String> _listRlsString, Map<String, Set<String>> _mapUrss,
      Transaction _tTransaction)
      throws InvalidArgumentsException {

    NodeGdbPrivFacade _psNodeGdbPrivFacade = new NodeGdbPrivFacade();
    this.seudlpveForTrNo(_psNodeGdbPrivFacade, _tTransaction);
    _listRlsString.forEach((roleNamex) ->
    {

      Node r = _nereNode(roleNamex, _tTransaction);
      this.grdlpveForNoStNo(r, _psNodeGdbPrivFacade, roleNamex);
    });

    Iterator _iterator = _mapUrss.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<String, Set<String>> _entryEtyss = (Entry) _iterator.next();

      String role2 = _entryEtyss.getKey();

      Node r = _tTransaction.findNode(RLX_LBL, io.github.onograph.TokenConstants.NAME, role2);

      Iterator _iterator2 = ((Set) _entryEtyss.getValue()).iterator();

      while (_iterator2.hasNext()) {

        String uname = (String) _iterator2.next();
        this.adreturForTrNoSt(r, _tTransaction, uname);


      }
    }

    _deeusForTrLa(PRVE_LBL, _tTransaction);
    _deeusForTrLa(SEMT_LBL, _tTransaction);
    _deeusForTrLa(REOC_LBL, _tTransaction);
  }


  boolean isConnoivennForTr(Transaction _tTransaction) {
    return this.getVersion(_tTransaction) == null;
  }


  boolean isSurudacForPr(PrivilegeAction _privilegeAction) {
    return false;
  }


  public InvalidArgumentsException loadcteenInvalidArgumentsException(String m) {

    return new InvalidArgumentsException("*** Error: 6d07ffd2-6380-4509-a356-89ad51e4318a");
  }


  public abstract void seudlpveForTrNo(NodeGdbPrivFacade _nodeGdbPrivFacade,
      Transaction _transaction);


  public abstract void updsugForTr(int _iVar, Transaction _transaction) throws Exception;
}
