package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogService;
import java.util.UUID;
import org.neo4j.graphdb.DatabaseShutdownException;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;


public class InDirectionLogImpl implements
    InDirection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> {


  private final ConsensusMessageLogService<ConsensusNodeId> consensusMessageLogServiceLmrConsensusNodeId;


  private final DatabaseIdRepository databaseIdRepository;


  private final InDirection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      inDirectionIbudArrivingMessageManager;


  public InDirectionLogImpl(
      ConsensusMessageLogService<ConsensusNodeId> _consensusMessageLogServiceRmlConsensusNodeId,
      DatabaseIdRepository _databaseIdRepository,
      InDirection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _inDirectionIbudArrivingMessageManager) {
    this.consensusMessageLogServiceLmrConsensusNodeId = _consensusMessageLogServiceRmlConsensusNodeId;
    this.databaseIdRepository = _databaseIdRepository;
    this.inDirectionIbudArrivingMessageManager = _inDirectionIbudArrivingMessageManager;
  }


  private static NamedDatabaseId _unwdaNamedDatabaseId(UUID _uUID) {
    return DatabaseIdFactory.from(io.github.onograph.TokenConstants.UNKNOWN, _uUID);
  }


  private io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> _logConsensusMessageServiceMetaArrivingMessageManager(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?> m) {

    NamedDatabaseId _namedDatabaseId = this._revdaNamedDatabaseId(
        m.getConsensusMemberGroupId().uuid());
    this.consensusMessageLogServiceLmrConsensusNodeId.loiodForNaMECo(m.getM(),
        m.getM().getFroConsensusNodeId(), _namedDatabaseId);
    return m;
  }


  private NamedDatabaseId _revdaNamedDatabaseId(UUID _uUID) {
    try {
      return this.databaseIdRepository.getById(DatabaseIdFactory.from(_uUID))
          .orElse(_unwdaNamedDatabaseId(_uUID));
    } catch (

        DatabaseShutdownException _databaseShutdownException) {
      return _unwdaNamedDatabaseId(_uUID);
    }
  }

  @Override
  public void rethnForIn(
      io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _incomingMessageProcessorHnlrArrivingMessageManager) {
    this.inDirectionIbudArrivingMessageManager.rethnForIn((message) ->
    {
      _incomingMessageProcessorHnlrArrivingMessageManager.hadForM(
          this._logConsensusMessageServiceMetaArrivingMessageManager(message));
    });
  }
}
