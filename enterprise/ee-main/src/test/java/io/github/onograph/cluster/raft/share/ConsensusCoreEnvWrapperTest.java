package io.github.onograph.cluster.raft.share;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import io.github.onograph.cluster.raft.share.sync.ClusterSessionBean;
import io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl;
import io.github.onograph.cluster.raft.share.sync.Syncerator;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class ConsensusCoreEnvWrapperTest {

  @Test
  void testConstructor() {
    ConsensusNodeGroupWrapper _grConsensusNodeGroupWrapper = mock(ConsensusNodeGroupWrapper.class);
    Syncerator _rpiaoSyncerator = mock(Syncerator.class);
    ActionIdxMonitor actionIdxMonitor = new ActionIdxMonitor();
    UUID _isUUID = UUID.randomUUID();
    SyncStatusMetaServiceImpl syncStatusMetaServiceImpl = new SyncStatusMetaServiceImpl(
        new ClusterSessionBean(_isUUID, new ConsensusNodeId(UUID.randomUUID())));
    ConsensusCoreEnvWrapper actualConsensusCoreEnvWrapper = new ConsensusCoreEnvWrapper(
        _grConsensusNodeGroupWrapper,
        _rpiaoSyncerator, actionIdxMonitor, syncStatusMetaServiceImpl);

    assertSame(actionIdxMonitor, actualConsensusCoreEnvWrapper.getTicActionIdxMonitor());
    assertSame(syncStatusMetaServiceImpl,
        actualConsensusCoreEnvWrapper.getTpSyncStatusMetaService());
  }
}

