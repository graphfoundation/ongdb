package io.github.onograph.cluster.raft.id;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.Config;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.LocalMemoryTracker;

class CoreNodeClusterIdentModImplTest {

  @Test
  void testConstructor() {
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    Config _config = mock(Config.class);
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction1 = new AdversarialChannelDefaultFileSystemAbstraction();
    AssertableLogProvider _goaLogProvider = new AssertableLogProvider(true);
    ClusterMetaTopologyInfo _lyuClusterMetaTopologyInfo = mock(ClusterMetaTopologyInfo.class);
    ClusterSimpleStorageFacade _fsClusterSimpleStorageFacade = new ClusterSimpleStorageFacade(
        _config,
        _fFileSystemAbstraction1, _goaLogProvider,
        _lyuClusterMetaTopologyInfo, new LocalMemoryTracker());

    LogProvider logProvider = mock(LogProvider.class);
    when(logProvider.getLog((Class<?>) any())).thenThrow(new IllegalStateException("foo"));
    assertThrows(IllegalStateException.class,
        () -> new CoreNodeClusterIdentModImpl(_fFileSystemAbstraction,
            _fsClusterSimpleStorageFacade, logProvider, new LocalMemoryTracker(),
            null));

    verify(logProvider).getLog((Class<?>) any());
  }
}

