package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogService;
import org.neo4j.kernel.database.NamedDatabaseId;


public class OutDirectionLogImpl<MEMBER, MESSAGE extends io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage>
    implements OutDirection<MEMBER, MESSAGE> {


  private final ConsensusMessageLogService<MEMBER> consensusMessageLogServiceLmrMEMBER;


  private final NamedDatabaseId namedDatabaseId;


  private final OutDirection<MEMBER, MESSAGE> outDirectionOtonmm;


  public OutDirectionLogImpl(
      ConsensusMessageLogService<MEMBER> _consensusMessageLogServiceLmrMEMBER,
      NamedDatabaseId _namedDatabaseId, OutDirection<MEMBER, MESSAGE> _outDirectionOtonmm) {
    this.consensusMessageLogServiceLmrMEMBER = _consensusMessageLogServiceLmrMEMBER;
    this.namedDatabaseId = _namedDatabaseId;
    this.outDirectionOtonmm = _outDirectionOtonmm;
  }

  @Override
  public void senForMEME(boolean _isBok, MEMBER _mmeT, MESSAGE m) {
    this.consensusMessageLogServiceLmrMEMBER.loobnForNaMECo(m, _mmeT, this.namedDatabaseId);
    this.outDirectionOtonmm.senForMEME(m, _mmeT);
  }
}
