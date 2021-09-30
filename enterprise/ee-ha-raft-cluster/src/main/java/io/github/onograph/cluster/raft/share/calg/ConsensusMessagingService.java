package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.share.calg.action.ConsensusResultMeta;
import io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaManagingEnvironment;
import java.io.IOException;
import org.neo4j.logging.Log;


public interface ConsensusMessagingService {


  ConsensusResultMeta hadConsensusResultMeta(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage _abstractConsensusMessage,
      ConsensusMetaManagingEnvironment _consensusMetaManagingEnvironment, Log _log)
      throws IOException;
}
