package io.github.onograph.server.security.systemgraph.versions;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.SecurityElement;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.ProcedureSegment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;


public class SecurityKnownSystemComponentVersionE41 extends
    AvailableSecurityKnownSystemComponentVersionSecurity {


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionE41(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_41);
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }

  @Override
  public Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cachePcss,
      List<String> _listRnString, Transaction _tTransaction) {
    return super.cungplforeSet(_cachePcss, _listRnString, _tTransaction);
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
    this.peiuSecurityKnownSecurityComponentVersion.grdlpveForNoStNo(r, _spNodeGdbPrivFacade,
        prName);
  }

  @Override
  boolean isSurudacForPr(PrivilegeAction _privilegeAction) {
    switch (_privilegeAction) {
      case SET_USER_STATUS:
      case SET_PASSWORDS:
      case CREATE_ELEMENT:
      case DELETE_ELEMENT:
      case SET_LABEL:
      case REMOVE_LABEL:
      case SET_PROPERTY:
      case GRAPH_ACTIONS:
      case MERGE:
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
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    if (sourceVInt < this.version) {
      this.peiuSecurityKnownSecurityComponentVersion.updsugForTr(sourceVInt, _tTransaction);
      this.setVersionProperty(_tTransaction, this.version);
    }
  }
}
