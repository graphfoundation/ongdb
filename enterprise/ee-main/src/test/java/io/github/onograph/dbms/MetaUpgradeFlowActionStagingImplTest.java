package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv;
import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.memory.LocalMemoryTracker;

class MetaUpgradeFlowActionStagingImplTest {

  @Test
  void testConstructor() {

    new MetaUpgradeFlowActionStagingImpl(null);
  }

  @Test
  void testLifecycleAdapterDefaultImplConstructor() {

    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    new MetaUpgradeFlowActionStagingImpl.LifecycleAdapterDefaultImpl(_fileSystemAbstraction,
        new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
            mock(Closeable.class))), null,
        null);
  }

  @Test
  void testLifecycleAdapterDefaultImplConstructor2() {

    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    new MetaUpgradeFlowActionStagingImpl.LifecycleAdapterDefaultImpl(_fileSystemAbstraction,
        new Log4jLogProvider(new ByteArrayOutputStream(3)), null, null);
  }

  @Test
  void testLifecycleAdapterDefaultImplInit() throws Exception {

    ClusterMetaTopologyInfo clusterMetaTopologyInfo = mock(ClusterMetaTopologyInfo.class);
    when(clusterMetaTopologyInfo.alrtgosList()).thenReturn(new ArrayList<String>());
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    (new MetaUpgradeFlowActionStagingImpl.LifecycleAdapterDefaultImpl(_fileSystemAbstraction,
        new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
            mock(Closeable.class))),
        clusterMetaTopologyInfo, null)).init();
  }

  @Test
  void testPefmseForUp() {
    MetaUpgradeFlowActionStagingImpl metaUpgradeFlowActionStagingImpl = new MetaUpgradeFlowActionStagingImpl(
        null);
    ClusterMetaTopologyInfo clusterMetaTopologyInfo = mock(ClusterMetaTopologyInfo.class);
    when(clusterMetaTopologyInfo.alrtgosList()).thenReturn(new ArrayList<String>());
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Config _config = mock(Config.class);
    DefaultFileSystemAbstraction _fFileSystemAbstraction1 = new DefaultFileSystemAbstraction();
    Log4jLogProvider _goaLogProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(null, mock(Closeable.class)));
    ClusterMetaTopologyInfo _lyuClusterMetaTopologyInfo = mock(ClusterMetaTopologyInfo.class);
    ClusterSimpleStorageFacade _fsscClusterSimpleStorageFacade = new ClusterSimpleStorageFacade(
        _config,
        _fFileSystemAbstraction1, _goaLogProvider,
        _lyuClusterMetaTopologyInfo, new LocalMemoryTracker());

    BufferingLog _log = new BufferingLog();
    metaUpgradeFlowActionStagingImpl.pefmseForUp(new UpgradeMetaEnv(_fFileSystemAbstraction,
        _fsscClusterSimpleStorageFacade, _log, clusterMetaTopologyInfo,
        new ClusterMetaFormat(1, 1)));
    verify(clusterMetaTopologyInfo).alrtgosList();
  }

  @Test
  void testPefmseForUp2() {
    MetaUpgradeFlowActionStagingImpl metaUpgradeFlowActionStagingImpl = new MetaUpgradeFlowActionStagingImpl(
        null);

    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    ClusterMetaTopologyInfo clusterMetaTopologyInfo = mock(ClusterMetaTopologyInfo.class);
    when(clusterMetaTopologyInfo.qunmrsefPath(any()))
        .thenThrow(new UncheckedIOException(new IOException("An error occurred")));
    when(clusterMetaTopologyInfo.alrtgosList()).thenReturn(stringList);
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Config _config = mock(Config.class);
    DefaultFileSystemAbstraction _fFileSystemAbstraction1 = new DefaultFileSystemAbstraction();
    Log4jLogProvider _goaLogProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(null, mock(Closeable.class)));
    ClusterMetaTopologyInfo _lyuClusterMetaTopologyInfo = mock(ClusterMetaTopologyInfo.class);
    ClusterSimpleStorageFacade _fsscClusterSimpleStorageFacade = new ClusterSimpleStorageFacade(
        _config,
        _fFileSystemAbstraction1, _goaLogProvider,
        _lyuClusterMetaTopologyInfo, new LocalMemoryTracker());

    BufferingLog _log = new BufferingLog();
    assertThrows(UncheckedIOException.class,
        () -> metaUpgradeFlowActionStagingImpl.pefmseForUp(
            new UpgradeMetaEnv(_fFileSystemAbstraction,
                _fsscClusterSimpleStorageFacade, _log, clusterMetaTopologyInfo,
                new ClusterMetaFormat(1, 1))));
    verify(clusterMetaTopologyInfo).alrtgosList();
    verify(clusterMetaTopologyInfo).qunmrsefPath(any());
  }

  @Test
  void testPefmseForUp3() {
    MetaUpgradeFlowActionStagingImpl metaUpgradeFlowActionStagingImpl = new MetaUpgradeFlowActionStagingImpl(
        null);
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    when(fileSystemAbstraction.fileExists(any()))
        .thenThrow(new UncheckedIOException(new IOException("An error occurred")));

    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    ClusterMetaTopologyInfo clusterMetaTopologyInfo = mock(ClusterMetaTopologyInfo.class);
    when(clusterMetaTopologyInfo.qunmrsefPath(any()))
        .thenReturn(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(clusterMetaTopologyInfo.alrtgosList()).thenReturn(stringList);
    Config _config = mock(Config.class);
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _goaLogProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(null, mock(Closeable.class)));
    ClusterMetaTopologyInfo _lyuClusterMetaTopologyInfo = mock(ClusterMetaTopologyInfo.class);
    ClusterSimpleStorageFacade _fsscClusterSimpleStorageFacade = new ClusterSimpleStorageFacade(
        _config,
        _fFileSystemAbstraction, _goaLogProvider,
        _lyuClusterMetaTopologyInfo, new LocalMemoryTracker());

    BufferingLog _log = new BufferingLog();
    assertThrows(UncheckedIOException.class,
        () -> metaUpgradeFlowActionStagingImpl.pefmseForUp(new UpgradeMetaEnv(fileSystemAbstraction,
            _fsscClusterSimpleStorageFacade, _log, clusterMetaTopologyInfo,
            new ClusterMetaFormat(1, 1))));
    verify(fileSystemAbstraction).fileExists(any());
    verify(clusterMetaTopologyInfo).alrtgosList();
    verify(clusterMetaTopologyInfo).qunmrsefPath(any());
  }
}

