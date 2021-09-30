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
import org.neo4j.internal.kernel.api.security.PrivilegeAction;


public class SecurityKnownSystemComponentVersionG420Drop6 extends
    AvailableSecurityKnownSystemComponentVersionSecurity {


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionG420Drop6(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_42D6);
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }

  @Override
  public Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cacheCpss,
      List<String> _listNrString, Transaction _tTransaction) {
    return super.cungplforeSet(_cacheCpss, _listNrString, _tTransaction);
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _spNodeGdbPrivFacade, String prName) {
    if (prName.equals(io.github.onograph.TokenConstants.PUBLIC)) {
      r.createRelationshipTo(_spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.STANDARD),
          GRND_RELATIONSHIP_TYPE);
      r.createRelationshipTo(
          _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_ALLOWED_EVERY_PROC),
          GRND_RELATIONSHIP_TYPE);
      r.createRelationshipTo(
          _spNodeGdbPrivFacade.gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_ALLOWED_EVERY_FUNC),
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

    Node _daNode = megnoNode(GDB_ALL_LBL, Map.of(io.github.onograph.TokenConstants.NAME, "*"),
        _tTransaction);

    Node _fqNode = megnoNode(Label.label(io.github.onograph.TokenConstants.FUNCTION_QUALIFIER_ALL),
        Map.of(io.github.onograph.TokenConstants.TYPE, io.github.onograph.TokenConstants.FUNCTION,
            io.github.onograph.TokenConstants.LABEL2, "*"),
        _tTransaction);

    Node _fsNode = megseeNode(_daNode, _fqNode, _tTransaction);

    Node _rdNode = megnoNode(REOC_LBL, Map.of(io.github.onograph.TokenConstants.TYPE,
            SecurityElement.ElementType.DATABASE.toString(),
            io.github.onograph.TokenConstants.ARG1, "", io.github.onograph.TokenConstants.ARG2, ""),
        _tTransaction);

    Node _pfNode = _tTransaction.createNode(PRVE_LBL);
    seplnoForNoStNoNo(_pfNode, _rdNode, _fsNode, PrivilegeAction.EXECUTE.toString());
    _spNodeGdbPrivFacade.sepveForNoNo(_pfNode, NodeGdbPrivFacade.PRIVILEGE.ACC_ALLOWED_EVERY_FUNC);
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    if (sourceVInt < this.version) {
      this.peiuSecurityKnownSecurityComponentVersion.updsugForTr(sourceVInt, _tTransaction);
      this.setVersionProperty(_tTransaction, this.version);

      Node _rpNode = megnoNode(RLX_LBL,
          Map.of(io.github.onograph.TokenConstants.NAME, io.github.onograph.TokenConstants.PUBLIC),
          _tTransaction);
      gretfcpltoForTrNo(_rpNode, _tTransaction);
    }
  }
}
