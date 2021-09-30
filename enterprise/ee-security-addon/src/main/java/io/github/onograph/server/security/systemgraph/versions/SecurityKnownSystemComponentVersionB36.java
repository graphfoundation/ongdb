package io.github.onograph.server.security.systemgraph.versions;

import io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public class SecurityKnownSystemComponentVersionB36 extends SecurityKnownSecurityComponentVersion {


  private final Config config;


  private final Label dtbsLabel = Label.label(io.github.onograph.TokenConstants.DATABASE2);


  private final RelationshipType fdRelationshipType = RelationshipType.withName(
      io.github.onograph.TokenConstants.FOR_DATABASE);


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;


  private final Label rdLabel = Label.label(io.github.onograph.TokenConstants.DB_ROLE);


  private final RelationshipType rdhRelationshipType = RelationshipType.withName(
      io.github.onograph.TokenConstants.HAS_DB_ROLE);


  private final RelationshipType rfRelationshipType = RelationshipType.withName(
      io.github.onograph.TokenConstants.FOR_ROLE);

  public SecurityKnownSystemComponentVersionB36(AbstractSecurityLog _abstractSecurityLog,
      Config _config,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_36);
    this.config = _config;
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }

  @Override
  public void adreturForTrNoSt(Node r, Transaction _tTransaction, String uname)
      throws InvalidArgumentsException {

    Node _usNode = _tTransaction.findNode(USE_LBL, io.github.onograph.TokenConstants.NAME, uname);

    Node _dNode = _tTransaction.findNode(this.dtbsLabel, io.github.onograph.TokenConstants.NAME,
        this.config.get(GraphDatabaseSettings.default_database));
    if (_usNode == null) {
      throw this.loadcteenInvalidArgumentsException(String.format(io.github.onograph.I18N.format(
              "io.github.onograph.server.security.systemgraph.versions.SecurityKnownSystemComponentVersion_1_36Security.format"),
          uname));
    } else {

      Node _drNode = _tTransaction.createNode(this.rdLabel);
      _usNode.createRelationshipTo(_drNode, this.rdhRelationshipType);
      _drNode.createRelationshipTo(r, this.rfRelationshipType);
      _drNode.createRelationshipTo(_dNode, this.fdRelationshipType);
    }
  }

  @Override
  public void astutwhaoForPrElSe(ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment)
      throws UnsupportedOperationException {
    throw this.unsupported();
  }

  @Override
  public boolean detected(Transaction _tTransaction) {
    return nodesWithLabelExist(_tTransaction, this.rdLabel) && this.isConnoivennForTr(
        _tTransaction);
  }

  @Override
  public GdbAuthActions gebccodGdbAuthActions(boolean _isRs, boolean _isUs, String gdbName,
      Transaction _tTransaction) {
    throw this.unsupported();
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _spNodeGdbPrivFacade, String prName) {
  }

  @Override
  public void seudlpveForTrNo(NodeGdbPrivFacade _spNodeGdbPrivFacade, Transaction _tTransaction) {
    if (!nodesWithLabelExist(_tTransaction, this.dtbsLabel)) {

      throw new IllegalStateException("*** Error:  a0e2ab47-6a3f-4c1e-98d6-4888c2ae5045");
    }
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    if (sourceVInt < this.version) {
      this.peiuSecurityKnownSecurityComponentVersion.updsugForTr(sourceVInt, _tTransaction);
    } else {

      List<Node> _listRlsNode = _tTransaction.findNodes(RLX_LBL).stream()
          .collect(Collectors.toList());

      Set<Node> _setRdNode = new HashSet<>();

      Iterator<Node> _iteratorVarNode = _listRlsNode.iterator();

      Node _rdNode;

      Iterator _iterator;

      Relationship _relationship;
      while (_iteratorVarNode.hasNext()) {
        _rdNode = _iteratorVarNode.next();
        _iterator = _rdNode.getRelationships(Direction.INCOMING,
            new RelationshipType[]{this.rfRelationshipType}).iterator();

        while (_iterator.hasNext()) {
          _relationship = (Relationship) _iterator.next();
          _rdNode = _relationship.getOtherNode(_rdNode);
          _setRdNode.add(_rdNode);

          List<Relationship> _listDrtuRelationship = new ArrayList<>();

          Iterable<Relationship> _iterableVr00Relationship = _rdNode.getRelationships(
              Direction.INCOMING, this.rdhRelationshipType);
          Objects.requireNonNull(_listDrtuRelationship);
          _iterableVr00Relationship.forEach(_listDrtuRelationship::add);

          Iterator _iterator2 = _listDrtuRelationship.iterator();

          while (_iterator2.hasNext()) {

            Relationship _utrdRelationship = (Relationship) _iterator2.next();

            Node _useNode = _utrdRelationship.getOtherNode(_rdNode);
            _useNode.createRelationshipTo(_rdNode, USE_TO_RLX);
          }
        }
      }

      _iteratorVarNode = _setRdNode.iterator();

      while (_iteratorVarNode.hasNext()) {
        _rdNode = _iteratorVarNode.next();
        _iterator = _rdNode.getRelationships().iterator();

        while (_iterator.hasNext()) {
          _relationship = (Relationship) _iterator.next();
          _relationship.delete();
        }

        _rdNode.delete();
      }
    }
  }
}
