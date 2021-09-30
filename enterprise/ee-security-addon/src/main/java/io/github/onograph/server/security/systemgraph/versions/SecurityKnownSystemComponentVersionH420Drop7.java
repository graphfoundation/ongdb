package io.github.onograph.server.security.systemgraph.versions;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import java.util.List;
import java.util.Set;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;


public class SecurityKnownSystemComponentVersionH420Drop7 extends
    AvailableSecurityKnownSystemComponentVersionSecurity {


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionH420Drop7(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_42D7);
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }

  @Override
  public Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cacheCpss,
      List<String> _listNrString, Transaction _tTransaction) {
    return super.cungplforeSet(_cacheCpss, _listNrString, _tTransaction);
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _spNodeGdbPrivFacade, String prName) {
    this.peiuSecurityKnownSecurityComponentVersion.grdlpveForNoStNo(r, _spNodeGdbPrivFacade,
        prName);
  }

  @Override
  boolean isSurudacForPr(PrivilegeAction _privilegeAction) {
    switch (_privilegeAction) {
      case SHOW_INDEX:
      case SHOW_CONSTRAINT:
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
  public void seudlpveForTrNo(NodeGdbPrivFacade _psNodeGdbPrivFacade, Transaction _tTransaction) {
    this.peiuSecurityKnownSecurityComponentVersion.seudlpveForTrNo(_psNodeGdbPrivFacade,
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
