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


public class SecurityKnownSystemComponentVersionL43Drop4 extends
    AvailableSecurityKnownSystemComponentVersionSecurity {


  private final SecurityKnownSecurityComponentVersion peiuSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionL43Drop4(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _peiuSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_43D4);
    this.peiuSecurityKnownSecurityComponentVersion = _peiuSecurityKnownSecurityComponentVersion;
  }

  @Override
  public Set<ElementEntitlementDTO> gepigfrSet(Cache<String, Set<ElementEntitlementDTO>> _cacheCpss,
      List<String> _listRnString, Transaction _tTransaction) {
    return super.cungplforeSet(_cacheCpss, _listRnString, _tTransaction);
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _psNodeGdbPrivFacade, String prName) {
    this.peiuSecurityKnownSecurityComponentVersion.grdlpveForNoStNo(r, _psNodeGdbPrivFacade,
        prName);
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
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) throws Exception {
    if (sourceVInt < this.version) {
      this.peiuSecurityKnownSecurityComponentVersion.updsugForTr(sourceVInt, _tTransaction);
      this.setVersionProperty(_tTransaction, this.version);
    }
  }
}
