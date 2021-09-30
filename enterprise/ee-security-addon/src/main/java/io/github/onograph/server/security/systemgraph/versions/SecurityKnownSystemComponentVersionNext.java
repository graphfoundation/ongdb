package io.github.onograph.server.security.systemgraph.versions;

import io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.systemgraph.SecurityComponentVersion;
import org.neo4j.dbms.database.SystemGraphComponent.Status;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;


public class SecurityKnownSystemComponentVersionNext extends SecurityKnownSecurityComponentVersion {


  private final SecurityKnownSecurityComponentVersion lvSecurityKnownSecurityComponentVersion;

  public SecurityKnownSystemComponentVersionNext(AbstractSecurityLog _abstractSecurityLog,
      SecurityKnownSecurityComponentVersion _vklSecurityKnownSecurityComponentVersion) {
    super(_abstractSecurityLog, SecurityComponentVersion.BACK_COMPATIBLE_FOR_HOLDER_NEXT);
    this.lvSecurityKnownSecurityComponentVersion = _vklSecurityKnownSecurityComponentVersion;
    this.getStatus();
  }

  @Override
  public void astutwhaoForPrElSe(ElementEntitlementDTO.GdbEntitlementType gdbEntitlementType,
      PrivilegeAction _privilegeAction, Segment _segment)
      throws UnsupportedOperationException {
    throw this.unsupported();
  }

  @Override
  public boolean detected(Transaction _tTransaction) {

    Integer _iVrin = this.getVersion(_tTransaction);
    return _iVrin != null && _iVrin > this.lvSecurityKnownSecurityComponentVersion.version;
  }

  @Override
  public GdbAuthActions gebccodGdbAuthActions(boolean _isRs, boolean _isUs, String gdbName,
      Transaction _tTransaction) {
    throw this.unsupported();
  }

  @Override
  public Status getStatus() {
    return Status.UNSUPPORTED_FUTURE;
  }

  @Override
  public void grdlpveForNoStNo(Node r, NodeGdbPrivFacade _psNodeGdbPrivFacade, String prName) {
    throw this.unsupported();
  }

  @Override
  public void seudlpveForTrNo(NodeGdbPrivFacade _spNodeGdbPrivFacade, Transaction _tTransaction) {

    throw this.unsupported();
  }

  @Override
  public UnsupportedOperationException unsupported() {
    return new UnsupportedOperationException("*** Error: 96769674-6d81-4c56-98a4-7368c6ba1df1");
  }

  @Override
  public void updsugForTr(int sourceVInt, Transaction _tTransaction) {
    throw this.unsupported();
  }
}
