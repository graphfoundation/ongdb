package io.github.onograph.server.security.systemgraph.versions;

import io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.CommunitySecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;


public class DisabledSecurityKnownSystemComponentVersionSecurity extends
    SecurityKnownSecurityComponentVersion {

  public DisabledSecurityKnownSystemComponentVersionSecurity() {
    super(CommunitySecurityLog.NULL_LOG, SecurityComponentVersion.BAD_SEC_VERS);
  }

  @Override
  public void astutwhaoForPrElSe(ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment)
      throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  @Override
  public GdbAuthActions gebccodGdbAuthActions(boolean _isSr, boolean _isUs, String gdbName,
      Transaction _tTransaction) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _psNodeGdbPrivFacade, String prName) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void seudlpveForTrNo(NodeGdbPrivFacade _spNodeGdbPrivFacade, Transaction _tTransaction) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) {
    throw new UnsupportedOperationException();
  }
}
