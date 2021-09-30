package io.github.onograph.server.security.systemgraph.versions;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.SecurityElement;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.FunctionSegment;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;


public class SecurityKnownSystemComponentVersionF42Drop4 extends
    AvailableSecurityKnownSystemComponentVersionSecurity {


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionF42Drop4(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_42D4);
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }

  @Override
  public void astutwhaoForPrElSe(ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment)
      throws UnsupportedOperationException {
    if (!this.isSurudacForPr(_privilegeAction) || _segment == FunctionSegment.ALL) {
      throw this.unpdaoUnsupportedOperationException();
    }
  }

  @Override
  public Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cachePcss,
      List<String> _listNrString, Transaction _tTransaction) {
    return super.cungplforeSet(_cachePcss, _listNrString, _tTransaction);
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _spNodeGdbPrivFacade, String prName) {
    if (prName.equals(io.github.onograph.TokenConstants.PUBLIC)) {
      r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.STANDARD),
          GRND_RELATIONSHIP_TYPE);
      r.createRelationshipTo(
          _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_ALLOWED_EVERY_PROC),
          GRND_RELATIONSHIP_TYPE);
    } else {
      this.peiuSecurityKnownSecurityComponentVersion.grdlpveForNoStNo(r, _spNodeGdbPrivFacade,
          prName);
    }
  }

  @Override
  boolean isSurudacForPr(PrivilegeAction _privilegeAction) {
    switch (_privilegeAction) {
      case EXECUTE:
      case EXECUTE_BOOSTED:
      case EXECUTE_ADMIN:
        return true;
      default:
        return this.peiuSecurityKnownSecurityComponentVersion.isSurudacForPr(_privilegeAction);
    }
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

    Node _daNode = megnoNode(GDB_ALL_LBL, Map.of(io.github.onograph.TokenConstants.NAME, "*"),
        _tTransaction);

    Node _qpNode = megnoNode(Label.label(io.github.onograph.TokenConstants.PROCEDURE_QUALIFIER_ALL),
        Map.of(io.github.onograph.TokenConstants.TYPE, io.github.onograph.TokenConstants.PROCEDURE,
            io.github.onograph.TokenConstants.LABEL2, "*"),
        _tTransaction);

    Node _psNode = megseeNode(_daNode, _qpNode, _tTransaction);

    Node _rdNode = megnoNode(REOC_LBL, Map.of(io.github.onograph.TokenConstants.TYPE,
            SecurityElement.ElementType.DATABASE.toString(),
            io.github.onograph.TokenConstants.ARG1, "", io.github.onograph.TokenConstants.ARG2, ""),
        _tTransaction);

    Node _ppNode = _tTransaction.createNode(PRVE_LBL);
    seplnoForNoStNoNo(_ppNode, _rdNode, _psNode, PrivilegeAction.EXECUTE.toString());
    _spNodeGdbPrivFacade.sepveForNoNo(_ppNode, NodeGdbPrivFacade.PRIVILEGE.ACC_ALLOWED_EVERY_PROC);
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    if (sourceVInt < this.version) {
      this.peiuSecurityKnownSecurityComponentVersion.updsugForTr(sourceVInt, _tTransaction);
      this.setVersionProperty(_tTransaction, this.version);

      Node _rpNode = megnoNode(RLX_LBL,
          Map.of(io.github.onograph.TokenConstants.NAME, io.github.onograph.TokenConstants.PUBLIC),
          _tTransaction);
      gretpcepitForTrNo(_rpNode, _tTransaction);
    }
  }
}
