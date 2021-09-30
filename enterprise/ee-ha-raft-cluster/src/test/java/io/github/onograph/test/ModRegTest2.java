package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest2 {

  public static boolean debug = false;

  @Test
  public void test1001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1001");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach configuredNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Collection<org.neo4j.dbms.identity.ServerId> serverIdCollection2 = configuredNamedServiceClusterApproach0.upesrfdteCollection(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1002");
    }
    org.neo4j.function.ThrowingFunction<io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel, io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.SyncableData>, java.lang.Exception> defaultReadableChecksumChannelThrowingFunction0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMessageToMessageDecoderNoWaitImpl syncableDataMessageToMessageDecoderNoWaitImpl1 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMessageToMessageDecoderNoWaitImpl(
        defaultReadableChecksumChannelThrowingFunction0);
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.SyncableData> syncableDataDataManagerFactory2 = syncableDataMessageToMessageDecoderNoWaitImpl1.cracttDataManagerFactory();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalStateException; message: *** Error:  69bee98f-4519-4e6e-8b7f-5d1bc8d25fa3");
    } catch (java.lang.IllegalStateException e) {
    }
  }

  @Test
  public void test1003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1003");
    }
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta0 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta1 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer2 = clearStaleClusterMeta0.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) clearStaleClusterMeta1);
    org.neo4j.memory.MemoryTracker memoryTracker3 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout4 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer clusterMemberSyncer5 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer(
        memoryTracker3, neo4jLayout4);
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta6 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta7 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction8 = clearStaleClusterMeta6.andMetaUpgradeFlowAction(
        (io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction) clearStaleClusterMeta7);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer9 = clusterMemberSyncer5.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) clearStaleClusterMeta7);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer10 = upgradeMetaEnvConsumer2.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) clusterMemberSyncer5);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer2);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction8);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer9);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer10);
  }

  @Test
  public void test1004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1004");
    }
    io.github.onograph.cluster.raft.control.connect.ClientByteToMessageDecoder clientByteToMessageDecoder0 = new io.github.onograph.cluster.raft.control.connect.ClientByteToMessageDecoder();
  }

  @Test
  public void test1005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1005");
    }
    io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_STINFO;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_STINFO
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_STINFO));
  }

  @Test
  public void test1006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1006");
    }
    java.util.concurrent.TimeUnit timeUnit1 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolder scHolder2 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder.fietioScHolder(
        (long) (short) 10, timeUnit1);
    org.junit.Assert.assertNotNull(scHolder2);
  }

  @Test
  public void test1007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1007");
    }
    io.github.onograph.dbms.DbmsManagerClusterImpl dbmsManagerClusterImpl0 = new io.github.onograph.dbms.DbmsManagerClusterImpl();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade storeSyncOpFacade2 = dbmsManagerClusterImpl0.stfosrcyDbmsManagerClusterImplStoreSyncOpFacade(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1008");
    }
    akka.actor.ActorRef actorRef0 = null;
    akka.cluster.Cluster cluster1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher clusterDataWatcher2 = null;
    akka.actor.ActorRef actorRef3 = null;
    akka.stream.javadsl.SourceQueueWithComplete<java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta>> databaseIdMapSourceQueueWithComplete4 = null;
    akka.actor.Props props5 = io.github.onograph.cluster.raft.module.dprot.impl.directory.DiscoveryManagementActor.prpProps(
        actorRef0, cluster1, clusterDataWatcher2, actorRef3, databaseIdMapSourceQueueWithComplete4);
    org.junit.Assert.assertNotNull(props5);
  }

  @Test
  public void test1009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1009");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager0.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData2 = io.github.onograph.cluster.raft.share.meta.fsm.comp.DataMarshaller.unahRequestData(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test1010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1010");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureJSerializer databaseCoreClusterStructureJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureJSerializer();
    java.lang.Object obj1 = null;
    try {
      byte[] byteArray2 = databaseCoreClusterStructureJSerializer0.toBinary(obj1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1011");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.strvstfi();
    connector0.strvstfiForSt("policy");
    connector0.strvinsno();
    connector0.strvstfiForSt("typically-connect-to-random-read-replica");
  }

  @Test
  public void test1012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1012");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.fihrih((long) (byte) 10);
    connector0.strvtrcs((long) 3);
    connector0.stres();
    connector0.strvstfi();
    connector0.strvstfi();
    connector0.strvtrcs((long) 1);
  }

  @Test
  public void test1013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1013");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.io.pagecache.PageCache pageCache1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources storeResources2 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources(
        fileSystemAbstraction0, pageCache1);
    org.neo4j.kernel.impl.transaction.log.files.LogFiles logFiles3 = null;
    java.nio.file.Path path4 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout5 = null;
    try {
      storeResources2.moetForPaDaLo(logFiles3, path4, databaseLayout5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1014");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.strvinsno();
  }

  @Test
  public void test1015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1015");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker7 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo5);
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade9 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config1, fileSystemAbstraction2, logProvider3, clusterMetaTopologyInfo5, memoryTracker8);
    org.neo4j.logging.Log log10 = null;
    java.nio.file.Path path11 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path11);
    java.nio.file.Path path13 = clusterMetaTopologyInfo12.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker14 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo12);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat15 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv16 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade9, log10, clusterMetaTopologyInfo12,
        clusterMetaFormat15);
    try {
      java.nio.file.Path path18 = clusterMetaTopologyInfo12.rametfePath("Snappy");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
    org.junit.Assert.assertNull(path13);
    org.junit.Assert.assertNotNull(clusterMetaFormat15);
  }

  @Test
  public void test1016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1016");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings<? extends io.netty.channel.socket.SocketChannel> wildcardNettyChannelClusterSettings1 = io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings.clecfNettyChannelClusterSettings(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1017");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal defaultSyncableDataMarshal1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal(
        logEntryReader0);
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readableClosablePositionAwareChecksumChannelPassThruImpl3.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition5 = readableClosablePositionAwareChecksumChannelPassThruImpl3.getCurrentPosition();
    int int6 = readableClosablePositionAwareChecksumChannelPassThruImpl3.endChecksumAndValidate();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl7 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.SyncableData> syncableDataDataManagerFactory9 = defaultSyncableDataMarshal1.unahDataManagerFactory(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3,
          (byte) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalStateException; message: *** Error: 1fc27463-a6b2-4806-a34a-44954f6d12e2");
    } catch (java.lang.IllegalStateException e) {
    }
    org.junit.Assert.assertNotNull(logPosition5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
  }

  @Test
  public void test1018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1018");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    org.neo4j.dbms.identity.ServerId serverId2 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId3 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId4 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier5 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray6 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier5};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet7 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet7,
        nodeGroupIdentifierArray6);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec9 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId3, consensusNodeId4,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet7);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta10 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress1, serverId2,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet7);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager11 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager11.beginChecksum();
    boolean boolean13 = loadBalanceServerMeta10.equals(
        (java.lang.Object) readablePositionAwareChecksumChannelManager11);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync14 = io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper.unahAbstractTransactionSync(
          logEntryReader0,
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(nodeGroupIdentifier5);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray6);
    //org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    //org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test1019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1019");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker7 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo5);
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade9 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config1, fileSystemAbstraction2, logProvider3, clusterMetaTopologyInfo5, memoryTracker8);
    org.neo4j.logging.Log log10 = null;
    java.nio.file.Path path11 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path11);
    java.nio.file.Path path13 = clusterMetaTopologyInfo12.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker14 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo12);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat15 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv16 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade9, log10, clusterMetaTopologyInfo12,
        clusterMetaFormat15);
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction17 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule18 = null;
    org.neo4j.memory.MemoryTracker memoryTracker19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade21 = null;
    org.neo4j.logging.Log log22 = null;
    java.nio.file.Path path23 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo24 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path23);
    java.nio.file.Path path25 = clusterMetaTopologyInfo24.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat26 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv27 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction20, clusterSimpleStorageFacade21, log22, clusterMetaTopologyInfo24,
        clusterMetaFormat26);
    org.neo4j.logging.Log log28 = upgradeMetaEnv27.getLog();
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo29 = upgradeMetaEnv27.getLscClusterMetaTopologyInfo();
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier30 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper31 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder32 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade9, namedDatabaseIdFunction17, globalModule18, memoryTracker19,
        clusterMetaTopologyInfo29, nodeGroupIdentifierSetSupplier30, leaderGatekeeper31);
    try {
      org.neo4j.io.state.SimpleStorage<io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat> clusterMetaFormatSimpleStorage33 = clusterSimpleStorageFacade9.crectsavrsgSimpleStorage();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
    org.junit.Assert.assertNull(path13);
    org.junit.Assert.assertNotNull(clusterMetaFormat15);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo24);
    org.junit.Assert.assertNull(path25);
    org.junit.Assert.assertNull(log28);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo29);
  }

  @Test
  public void test1020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1020");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.cuprot.ClusterCatchupNodeManager.BAK_SVX_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "backup-server" + "'", str0,
        "backup-server");
  }

  @Test
  public void test1021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1021");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_D_QM;
    org.junit.Assert.assertTrue(
        "'" + metaType0 + "' != '" + io.github.onograph.cluster.raft.share.meta.MetaType.MT_D_QM
            + "'", metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_D_QM));
  }

  @Test
  public void test1022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1022");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup2 = null;
    io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper applicationCurrentActiveComProFamilyWrapper3 = io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
        applicationComProFamilyComProFamilyGroup2);
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup4 = applicationCurrentActiveComProFamilyWrapper3.getComProFamilyGroupCtgrT();
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup5 = applicationCurrentActiveComProFamilyWrapper3.getComProFamilyGroupCtgrT();
    io.netty.channel.ChannelPromise channelPromise6 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) applicationComProFamilyComProFamilyGroup5, channelPromise6);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertNotNull(applicationCurrentActiveComProFamilyWrapper3);
    org.junit.Assert.assertNull(applicationComProFamilyComProFamilyGroup4);
    org.junit.Assert.assertNull(applicationComProFamilyComProFamilyGroup5);
  }

  @Test
  public void test1023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1023");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncCompletedByteToMessageDecoder storeSyncCompletedByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncCompletedByteToMessageDecoder();
  }

  @Test
  public void test1024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1024");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq<io.github.onograph.cluster.raft.share.meta.fsm.EmptyReq> emptyReqFSMEmptyReq0 = null;
    java.lang.Runnable runnable1 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl3 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable1, leasableMetaStateStorage2);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta4 = io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.INTL_LES_STAX;
    syncableLeasableCoreNodeDataFSMImpl3.inlspForLe(leasableMeta4);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta6 = syncableLeasableCoreNodeDataFSMImpl3.snpoLeasableMeta();
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl7 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl8 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ReplicatedTransactionFSM replicatedTransactionFSM9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl10 = null;
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier12 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore> logicalTransactionStoreSupplier13 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair transactionLogIndexRepair14 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair(
        logProvider11, transactionIdStoreSupplier12, logicalTransactionStoreSupplier13);
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService15 = new io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService(
        emptyReqFSMEmptyReq0, syncableLeasableCoreNodeDataFSMImpl3, fSMTokenImpl7, fSMTokenImpl8,
        replicatedTransactionFSM9, fSMTokenImpl10, transactionLogIndexRepair14);
    try {
      syncableLeasableCoreNodeDataFSMImpl3.fls();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(leasableMeta4);
    org.junit.Assert.assertNotNull(leasableMeta6);
  }

  @Test
  public void test1025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1025");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    java.lang.String str1 = mutableProtocols0.getImpl();
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols2 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols3 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    io.github.onograph.cluster.raft.control.MutableComProFamily[] mutableComProFamilyArray4 = new io.github.onograph.cluster.raft.control.MutableComProFamily[]{
        mutableProtocols0, mutableProtocols2, mutableProtocols3};
    java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily> mutableComProFamilyList5 = new java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList5,
        mutableComProFamilyArray4);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType7 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper comProFamilyWrapper8 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper(
        (java.util.List<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList5,
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType7);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType9 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV;
    boolean boolean10 = applicationComProFamilyType7.isEq(
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType9);
    io.github.onograph.config.EntProVer entProVer11 = applicationComProFamilyType9.getImpl();
    java.lang.String str12 = applicationComProFamilyType9.caerString();
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Snappy" + "'", str1, "Snappy");
    org.junit.Assert.assertTrue("'" + mutableProtocols2 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols2.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertTrue("'" + mutableProtocols3 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols3.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertNotNull(mutableComProFamilyArray4);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType7 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType7.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType9 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType9.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(entProVer11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "catchup_protocol" + "'", str12,
        "catchup_protocol");
  }

  @Test
  public void test1026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1026");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
        consensusNodeId0, false, (long) (-1), (long) '#', (long) 0);
    long long6 = reply5.getLgT();
    io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl distributedMessageBuilderDefaultImpl7 = new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.DistributedMessageBuilderDefaultImpl(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) reply5);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
  }

  @Test
  public void test1027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1027");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder requestStoreDatabaseIdMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder();
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS1 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta2 = marshalChannelImplCMS1.startState();
    boolean boolean3 = requestStoreDatabaseIdMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) marshalChannelImplCMS1);
    org.neo4j.io.fs.ReadableChannel readableChannel4 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl5 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel4);
    try {
      io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta6 = marshalChannelImplCMS1.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS1);
    org.junit.Assert.assertNotNull(candidateTermMeta2);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test1028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1028");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin1 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin2 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    org.neo4j.values.virtual.MapValue mapValue4 = null;
    try {
      org.neo4j.procedure.builtin.routing.RoutingResult routingResult5 = clusteringBalancerServiceImpl0.runRoutingResult(
          namedDatabaseId3, mapValue4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1029");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat0 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat1 = clusterMetaFormat0.plsoemnClusterMetaFormat();
    int int2 = clusterMetaFormat0.getIMnr();
    org.junit.Assert.assertNotNull(clusterMetaFormat0);
    org.junit.Assert.assertNotNull(clusterMetaFormat1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
  }

  @Test
  public void test1030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1030");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager1 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLocatorImpl socketAddressServiceLocatorImpl2 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLocatorImpl(
        clusterStructureService0, namedServiceApproachManager1);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    try {
      java.util.Collection<org.neo4j.configuration.helpers.SocketAddress> socketAddressCollection4 = socketAddressServiceLocatorImpl2.alsoaeCollection(
          namedDatabaseId3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1031");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel> readableClosablePositionAwareChecksumChannelDataManagerFactory0 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.emuiDataManagerFactory();
    org.junit.Assert.assertNotNull(readableClosablePositionAwareChecksumChannelDataManagerFactory0);
  }

  @Test
  public void test1032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1032");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure startFailure4 = new io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure(
        "RequestGdbId for ");
    boolean boolean5 = gdbIdInboundHandler2.acceptInboundMessage((java.lang.Object) startFailure4);
    io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady consensusGdbsReady7 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady.EMT_CONSENSUS_GDBS_READY;
    java.util.Map<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId, io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusMemberGroupIdMap8 = consensusGdbsReady7.getMapRbcc();
    try {
      gdbIdInboundHandler2.channelRead(channelHandlerContext6,
          (java.lang.Object) consensusGdbsReady7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(consensusGdbsReady7);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMap8);
  }

  @Test
  public void test1033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1033");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder requestStoreDatabaseIdMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      requestStoreDatabaseIdMessageToByteEncoder0.flush(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1034");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaJSerializer nodeServerMemberLeaderMetaJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaJSerializer();
    int int1 = nodeServerMemberLeaderMetaJSerializer0.identifier();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
  }

  @Test
  public void test1035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1035");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onInit(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test1036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1036");
    }
    io.github.onograph.cluster.raft.share.meta.DefaultMarshalChannelCMS defaultMarshalChannelCMS0 = new io.github.onograph.cluster.raft.share.meta.DefaultMarshalChannelCMS();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.getCurrentPosition();
    int int5 = readableClosablePositionAwareChecksumChannelPassThruImpl2.endChecksumAndValidate();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl6 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    try {
      java.lang.Long long7 = defaultMarshalChannelCMS0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test1037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1037");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    boolean boolean2 = transactionChunkingCompletedMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) '#');
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    transactionChunkingCompletedMessageToByteEncoder0.handlerAdded(channelHandlerContext3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    io.netty.channel.ChannelPromise channelPromise6 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.close(channelHandlerContext5,
          channelPromise6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1038");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions0 = io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions.roles;
    org.junit.Assert.assertTrue("'" + authMetaOptions0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions.roles + "'",
        authMetaOptions0.equals(
            io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions.roles));
  }

  @Test
  public void test1039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1039");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry akkaActorSystemRetry1 = io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.fottAkkaActorSystemRetry(
        128);
    java.util.concurrent.Callable<java.lang.Boolean> booleanCallable2 = null;
    try {
      akkaActorSystemRetry1.rettForStCa(booleanCallable2, "server_policies");
      org.junit.Assert.fail(
          "Expected exception of type io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure; message: java.lang.NullPointerException");
    } catch (io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure e) {
    }
    org.junit.Assert.assertNotNull(akkaActorSystemRetry1);
  }

  @Test
  public void test1040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1040");
    }
    io.github.onograph.cluster.raft.utils.ExceptionManager exceptionManager1 = new io.github.onograph.cluster.raft.utils.ExceptionManager(
        "designated_seeder");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        "store_version");
    exceptionManager1.addForTh((java.lang.Throwable) gdbStoreSyncCrlException3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException gdbIsoException5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException(
        (java.lang.Exception) gdbStoreSyncCrlException3);
    java.lang.Throwable[] throwableArray6 = gdbStoreSyncCrlException3.getSuppressed();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException7 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Throwable) gdbStoreSyncCrlException3);
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData8 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        (java.lang.Exception) gdbStoreSyncCrlException7);
    org.junit.Assert.assertNotNull(throwableArray6);
    org.junit.Assert.assertNotNull(fSMData8);
  }

  @Test
  public void test1041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1041");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal uUIDSafeChannelMarshal0 = new io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal();
    java.util.UUID uUID1 = null;
    org.neo4j.io.fs.WritableChannel writableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl3 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel2);
    try {
      uUIDSafeChannelMarshal0.marshal(uUID1,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1042");
    }
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta> databaseIdMap0 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.id.ConsensusNodeId> databaseIdMap1 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, org.neo4j.dbms.DatabaseState> databaseIdMap2 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl gdbServerPointInTimeImpl3 = new io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl(
        databaseIdMap0, databaseIdMap1, databaseIdMap2);
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.id.ConsensusNodeId> databaseIdMap4 = gdbServerPointInTimeImpl3.daammhMap();
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.id.ConsensusNodeId> databaseIdMap5 = gdbServerPointInTimeImpl3.daammhMap();
    org.junit.Assert.assertNull(databaseIdMap4);
    org.junit.Assert.assertNull(databaseIdMap5);
  }

  @Test
  public void test1043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1043");
    }
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta1 = marshalChannelImplCMS0.startState();
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS2 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta3 = marshalChannelImplCMS2.startState();
    long long4 = marshalChannelImplCMS0.ordinal(candidateTermMeta3);
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS5 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta6 = marshalChannelImplCMS5.startState();
    long long7 = marshalChannelImplCMS0.ordinal(candidateTermMeta6);
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta8 = marshalChannelImplCMS0.startState();
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(candidateTermMeta1);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS2);
    org.junit.Assert.assertNotNull(candidateTermMeta3);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS5);
    org.junit.Assert.assertNotNull(candidateTermMeta6);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    org.junit.Assert.assertNotNull(candidateTermMeta8);
  }

  @Test
  public void test1044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1044");
    }
    io.github.onograph.cluster.raft.share.sync.SessionSeqActionId sessionSeqActionId0 = null;
    io.github.onograph.cluster.raft.share.sync.SubClusterSessionBean subClusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.SubClusterSessionBean(
        (long) (byte) 0);
    java.util.UUID uUID3 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy4 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean5 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID3, consensusNodeIdLazy4);
    io.github.onograph.cluster.raft.share.sync.ClusterSessionEnvWrapper clusterSessionEnvWrapper6 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionEnvWrapper(
        sessionSeqActionId0, subClusterSessionBean2, clusterSessionBean5);
  }

  @Test
  public void test1045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1045");
    }
    io.github.onograph.cluster.raft.module.dprot.k8.K8NameRemTimestampWrapper k8NameRemTimestampWrapper0 = new io.github.onograph.cluster.raft.module.dprot.k8.K8NameRemTimestampWrapper();
    k8NameRemTimestampWrapper0.seneForSt("");
    java.lang.String str3 = k8NameRemTimestampWrapper0.name();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
  }

  @Test
  public void test1046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1046");
    }
    io.github.onograph.cluster.raft.module.cuprot.IncomingEventService incomingEventService0 = io.github.onograph.cluster.raft.module.cuprot.IncomingEventService.NOO_INCOMING_EVENT_SERVICE;
    io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler serverSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler(
        incomingEventService0);
    io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler serverSimpleChannelInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler(
        incomingEventService0);
    org.junit.Assert.assertNotNull(incomingEventService0);
  }

  @Test
  public void test1047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1047");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    org.neo4j.kernel.database.NamedDatabaseId[] namedDatabaseIdArray3 = new org.neo4j.kernel.database.NamedDatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.NamedDatabaseId> namedDatabaseIdSet4 = new java.util.LinkedHashSet<org.neo4j.kernel.database.NamedDatabaseId>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet4,
        namedDatabaseIdArray3);
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds allGdbIds6 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds(
        (java.util.Set<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet4);
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation7 = null;
    org.neo4j.kernel.database.DatabaseId databaseId8 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync10 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation7, databaseId8, (long) (short) 0);
    org.neo4j.kernel.database.DatabaseId databaseId11 = abstractTransactionSync10.daasidDatabaseId();
    boolean boolean12 = allGdbIds6.equals((java.lang.Object) databaseId11);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture13 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ongadteiresForCoAl(allGdbIds6,
          storeSyncCompletedCompletableFuture13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
    org.junit.Assert.assertNotNull(namedDatabaseIdArray3);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNull(databaseId11);
    //org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test1048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1048");
    }
    java.lang.String str0 = org.neo4j.dbms.database.SystemGraphDbmsModel.DUMP_DATA_PROPERTY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dump_data" + "'", str0, "dump_data");
  }

  @Test
  public void test1049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1049");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    java.time.Duration duration2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId setupConsensusDatabaseId3 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId(
        consensusMemberGroupId0, consensusNodeId1, duration2);
    java.time.Duration duration4 = setupConsensusDatabaseId3.getTmotDuration();
    java.time.Duration duration5 = setupConsensusDatabaseId3.getTmotDuration();
    java.time.Duration duration6 = setupConsensusDatabaseId3.getTmotDuration();
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager7 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory8 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager7);
    org.neo4j.logging.Log log9 = null;
    dataSyncRunnerStatsManager7.log = log9;
    boolean boolean11 = setupConsensusDatabaseId3.equals((java.lang.Object) log9);
    org.junit.Assert.assertNull(duration4);
    org.junit.Assert.assertNull(duration5);
    org.junit.Assert.assertNull(duration6);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory8);
    //org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test1050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1050");
    }
    io.github.onograph.cluster.raft.share.SettingsMigratorImpl settingsMigratorImpl0 = new io.github.onograph.cluster.raft.share.SettingsMigratorImpl();
    java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
    org.neo4j.logging.Log log3 = null;
    try {
      settingsMigratorImpl0.migrate(strMap1, strMap2, log3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1051");
    }
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException1 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure startFailure2 = new io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure(
        (java.lang.Throwable) clusterDatabaseManagementException1);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Exception) startFailure2, "user-defined");
    io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException clusterSyncerException5 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException(
        (java.lang.Throwable) startFailure2);
  }

  @Test
  public void test1052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1052");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
    try {
      double double2 = readablePositionAwareChecksumChannelManager0.getDouble();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test1053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1053");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType1.getImpl();
    boolean boolean3 = viewClusterInfo0.equals((java.lang.Object) entProVer2);
    java.util.SortedSet<akka.cluster.Member> memberSet4 = viewClusterInfo0.getMbrs();
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType1 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType1.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer2);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(memberSet4);
  }

  @Test
  public void test1054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1054");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor consensusLogEntryRawCursor0 = io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor.emtConsensusLogEntryRawCursor();
    consensusLogEntryRawCursor0.close();
    long long2 = consensusLogEntryRawCursor0.ine();
    boolean boolean3 = consensusLogEntryRawCursor0.next();
    boolean boolean4 = consensusLogEntryRawCursor0.next();
    org.junit.Assert.assertNotNull(consensusLogEntryRawCursor0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1055");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LeaderServiceNodeSocketAddressWrapper leaderServiceNodeSocketAddressWrapper0 = null;
    io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.ClientSideRoutingTableProviderDefaultImpl clientSideRoutingTableProviderDefaultImpl1 = new io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.ClientSideRoutingTableProviderDefaultImpl(
        leaderServiceNodeSocketAddressWrapper0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    org.neo4j.values.virtual.MapValue mapValue3 = null;
    try {
      org.neo4j.procedure.builtin.routing.RoutingResult routingResult4 = clientSideRoutingTableProviderDefaultImpl1.getRoutingResultForClientSideRouting(
          namedDatabaseId2, mapValue3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1056");
    }
    org.neo4j.graphdb.config.Setting<java.lang.String> strSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingKunceaString;
    org.junit.Assert.assertNotNull(strSetting0);
  }

  @Test
  public void test1057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1057");
    }
    org.neo4j.graphdb.config.Setting<io.github.onograph.config.ConsensusLogCacheStrategyType> consensusLogCacheStrategyTypeSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingIngcpConsensusLogCacheStrategyType;
    org.junit.Assert.assertNotNull(consensusLogCacheStrategyTypeSetting0);
  }

  @Test
  public void test1058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1058");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    java.nio.file.Path[] pathArray5 = new java.nio.file.Path[]{};
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply setupGdbStoreSyncReply6 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(
        (long) 'h', pathArray5);
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onsrltresForCoSe(
          storeSyncCompletedCompletableFuture3, setupGdbStoreSyncReply6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
    org.junit.Assert.assertNotNull(pathArray5);
    org.junit.Assert.assertNotNull(setupGdbStoreSyncReply6);
  }

  @Test
  public void test1059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1059");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    int int1 = consensusLogCacheServiceNLImpl0.elmtcu();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
  }

  @Test
  public void test1060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1060");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_CLST_SES_TRCKR;
    org.junit.Assert.assertTrue("'" + metaType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.MetaType.MT_CLST_SES_TRCKR + "'",
        metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_CLST_SES_TRCKR));
  }

  @Test
  public void test1061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1061");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta> candidateTermMetaMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.CONS_TER;
    org.junit.Assert.assertNotNull(candidateTermMetaMetaWrapper0);
  }

  @Test
  public void test1062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1062");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade4 = null;
    org.neo4j.logging.Log log5 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade6 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction7 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule8 = null;
    org.neo4j.memory.MemoryTracker memoryTracker9 = null;
    java.nio.file.Path path10 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo11 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path10);
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier12 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper13 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder14 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade6, namedDatabaseIdFunction7, globalModule8, memoryTracker9,
        clusterMetaTopologyInfo11, nodeGroupIdentifierSetSupplier12, leaderGatekeeper13);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat15 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv16 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction3, clusterSimpleStorageFacade4, log5, clusterMetaTopologyInfo11,
        clusterMetaFormat15);
    org.neo4j.memory.MemoryTracker memoryTracker17 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade18 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config0, fileSystemAbstraction1, logProvider2, clusterMetaTopologyInfo11, memoryTracker17);
    org.neo4j.logging.internal.DatabaseLogProvider databaseLogProvider19 = null;
    org.neo4j.kernel.lifecycle.LifeSupport lifeSupport21 = null;
    try {
      org.neo4j.io.state.StateStorage<java.lang.Long> longStateStorage22 = clusterSimpleStorageFacade18.crelfesrStateStorage(
          databaseLogProvider19,
          "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version",
          lifeSupport21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo11);
  }

  @Test
  public void test1063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1063");
    }
    org.neo4j.ssl.SslPolicy sslPolicy0 = null;
    io.github.onograph.cluster.raft.control.PipelineBuilderManager pipelineBuilderManager1 = new io.github.onograph.cluster.raft.control.PipelineBuilderManager(
        sslPolicy0);
    io.netty.channel.Channel channel2 = null;
    org.neo4j.logging.Log log3 = null;
    try {
      io.github.onograph.cluster.raft.control.ClientPipelineService clientPipelineService4 = pipelineBuilderManager1.cleClientPipelineService(
          channel2, log3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1064");
    }
    java.util.function.Supplier<java.util.zip.Checksum> checksumSupplier0 = org.neo4j.io.fs.ChecksumWriter.CHECKSUM_FACTORY;
    org.junit.Assert.assertNotNull(checksumSupplier0);
  }

  @Test
  public void test1065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1065");
    }
    java.time.Clock clock0 = null;
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodesFactoryDefaultImpl consensusNodesFactoryDefaultImpl1 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodesFactoryDefaultImpl();
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy3 = null;
    org.neo4j.logging.LogProvider logProvider6 = null;
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog7 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long9 = inMemoryConsensusTransactionLog7.prn((long) 1536);
    long long10 = inMemoryConsensusTransactionLog7.prvid();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor consensusLogEntryRawCursor12 = inMemoryConsensusTransactionLog7.geercuoConsensusLogEntryRawCursor(
        (long) (-1));
    io.github.onograph.cluster.raft.share.sync.SyncToManager syncToManager13 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta> nodeServerMemberTransactionLogDataMetaStateStorage14 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService memberNodesService15 = new io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService(
          clock0,
          (io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodes.ConsensusNodesFactory<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodesFactoryDefaultImpl1,
          100, consensusNodeIdLazy3, (long) 128, (long) (byte) 10, logProvider6,
          (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry) inMemoryConsensusTransactionLog7,
          syncToManager13, nodeServerMemberTransactionLogDataMetaStateStorage14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1536L + "'", long9 == 1536L);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1536L + "'", long10 == 1536L);
    org.junit.Assert.assertNotNull(consensusLogEntryRawCursor12);
  }

  @Test
  public void test1066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1066");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat0 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.nio.file.Path path5 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo6 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path5);
    java.nio.file.Path path7 = clusterMetaTopologyInfo6.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker8 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo6);
    org.neo4j.memory.MemoryTracker memoryTracker9 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade10 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config2, fileSystemAbstraction3, logProvider4, clusterMetaTopologyInfo6, memoryTracker9);
    org.neo4j.logging.Log log11 = null;
    java.nio.file.Path path12 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo13 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path12);
    java.nio.file.Path path14 = clusterMetaTopologyInfo13.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker15 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo13);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat16 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv17 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction1, clusterSimpleStorageFacade10, log11, clusterMetaTopologyInfo13,
        clusterMetaFormat16);
    boolean boolean18 = clusterMetaFormat0.isLortaForCl(clusterMetaFormat16);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat19 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.configuration.Config config21 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction22 = null;
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.nio.file.Path path24 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo25 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path24);
    java.nio.file.Path path26 = clusterMetaTopologyInfo25.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker27 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo25);
    org.neo4j.memory.MemoryTracker memoryTracker28 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade29 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config21, fileSystemAbstraction22, logProvider23, clusterMetaTopologyInfo25,
        memoryTracker28);
    org.neo4j.logging.Log log30 = null;
    java.nio.file.Path path31 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo32 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path31);
    java.nio.file.Path path33 = clusterMetaTopologyInfo32.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker34 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo32);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat35 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv36 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction20, clusterSimpleStorageFacade29, log30, clusterMetaTopologyInfo32,
        clusterMetaFormat35);
    boolean boolean37 = clusterMetaFormat19.isLortaForCl(clusterMetaFormat35);
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler38 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl39 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler40 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler38, refCatchupManagerImpl39);
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting41 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingJoapoDuration;
    boolean boolean42 = transactionChunkingCompletedInboundHandler40.acceptInboundMessage(
        (java.lang.Object) durationSetting41);
    boolean boolean43 = clusterMetaFormat19.equals(
        (java.lang.Object) transactionChunkingCompletedInboundHandler40);
    boolean boolean44 = clusterMetaFormat0.isMabmttForCl(clusterMetaFormat19);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction45 = null;
    org.neo4j.configuration.Config config46 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction47 = null;
    org.neo4j.logging.LogProvider logProvider48 = null;
    java.nio.file.Path path49 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo50 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path49);
    java.nio.file.Path path51 = clusterMetaTopologyInfo50.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker52 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo50);
    org.neo4j.memory.MemoryTracker memoryTracker53 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade54 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config46, fileSystemAbstraction47, logProvider48, clusterMetaTopologyInfo50,
        memoryTracker53);
    org.neo4j.logging.Log log55 = null;
    java.nio.file.Path path56 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo57 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path56);
    java.nio.file.Path path58 = clusterMetaTopologyInfo57.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker59 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo57);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat60 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv61 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction45, clusterSimpleStorageFacade54, log55, clusterMetaTopologyInfo57,
        clusterMetaFormat60);
    boolean boolean62 = clusterMetaFormat19.isMabmttForCl(clusterMetaFormat60);
    org.junit.Assert.assertNotNull(clusterMetaFormat0);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo6);
    org.junit.Assert.assertNull(path7);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo13);
    org.junit.Assert.assertNull(path14);
    org.junit.Assert.assertNotNull(clusterMetaFormat16);
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(clusterMetaFormat19);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo25);
    org.junit.Assert.assertNull(path26);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo32);
    org.junit.Assert.assertNull(path33);
    org.junit.Assert.assertNotNull(clusterMetaFormat35);
    //org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(durationSetting41);
    //org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    //org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    //org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo50);
    org.junit.Assert.assertNull(path51);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo57);
    org.junit.Assert.assertNull(path58);
    org.junit.Assert.assertNotNull(clusterMetaFormat60);
    //org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
  }

  @Test
  public void test1067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1067");
    }
    io.github.onograph.cluster.raft.module.dprot.k8.K8NameRemTimestampWrapper k8NameRemTimestampWrapper0 = new io.github.onograph.cluster.raft.module.dprot.k8.K8NameRemTimestampWrapper();
    k8NameRemTimestampWrapper0.seneForSt("");
    k8NameRemTimestampWrapper0.sedlntsForSt("default");
  }

  @Test
  public void test1068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1068");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl3 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean2);
    io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction dataSyncClusterAction4 = null;
    try {
      syncStatusMetaServiceImpl3.trrcnForDa(dataSyncClusterAction4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1069");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.OLD_CND_MB_UID;
    org.junit.Assert.assertNotNull(consensusNodeIdMetaWrapper0);
  }

  @Test
  public void test1070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1070");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder3 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder();
    io.github.onograph.cluster.raft.share.sync.SyncStatus syncStatus4 = new io.github.onograph.cluster.raft.share.sync.SyncStatus();
    boolean boolean5 = messageDataTypeMessageToByteEncoder3.acceptOutboundMessage(
        (java.lang.Object) syncStatus4);
    syncStatus4.awrcn((long) (byte) 1);
    boolean boolean8 = syncStatus4.getIsRi();
    boolean boolean9 = clusterSessionBean2.equals((java.lang.Object) syncStatus4);
    try {
      io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId10 = clusterSessionBean2.oweConsensusNodeId();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    //org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    //org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test1071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1071");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal storeIdSafeChannelMarshal0 = io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.getCurrentPosition();
    int int5 = readableClosablePositionAwareChecksumChannelPassThruImpl2.endChecksumAndValidate();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl6 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    try {
      org.neo4j.storageengine.api.StoreId storeId7 = storeIdSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeIdSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(logPosition4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test1072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1072");
    }
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta1 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta0);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta3 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta2);
    akka.cluster.ddata.ReplicatedData replicatedData4 = syncedLeaderMeta1.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta3);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta5 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta6 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta5);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta7 = syncedLeaderMeta3.mergeData(
        syncedLeaderMeta6);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction findComAction10 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction(
        (long) (byte) 100, (java.lang.Object) "name");
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta11 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta12 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta11);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta13 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta14 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta13);
    akka.cluster.ddata.ReplicatedData replicatedData15 = syncedLeaderMeta12.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta14);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta16 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta17 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta16);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta18 = syncedLeaderMeta14.mergeData(
        syncedLeaderMeta17);
    boolean boolean19 = findComAction10.equals((java.lang.Object) syncedLeaderMeta14);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta20 = syncedLeaderMeta6.mergeData(
        syncedLeaderMeta14);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta21 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta22 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta21);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta23 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta24 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta23);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta25 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta26 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta25);
    akka.cluster.ddata.ReplicatedData replicatedData27 = syncedLeaderMeta24.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta26);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta28 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta29 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta28);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta30 = syncedLeaderMeta26.mergeData(
        syncedLeaderMeta29);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta31 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta32 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta31);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta33 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta34 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta33);
    akka.cluster.ddata.ReplicatedData replicatedData35 = syncedLeaderMeta32.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta34);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta36 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta37 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta36);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta38 = syncedLeaderMeta34.mergeData(
        syncedLeaderMeta37);
    akka.cluster.ddata.ReplicatedData replicatedData39 = syncedLeaderMeta30.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta34);
    akka.cluster.ddata.ReplicatedData replicatedData40 = syncedLeaderMeta22.merge(replicatedData39);
    akka.cluster.ddata.ReplicatedData replicatedData41 = syncedLeaderMeta20.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta22);
    org.junit.Assert.assertNotNull(replicatedData4);
    org.junit.Assert.assertNotNull(syncedLeaderMeta7);
    org.junit.Assert.assertNotNull(replicatedData15);
    org.junit.Assert.assertNotNull(syncedLeaderMeta18);
    //org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(syncedLeaderMeta20);
    org.junit.Assert.assertNotNull(replicatedData27);
    org.junit.Assert.assertNotNull(syncedLeaderMeta30);
    org.junit.Assert.assertNotNull(replicatedData35);
    org.junit.Assert.assertNotNull(syncedLeaderMeta38);
    org.junit.Assert.assertNotNull(replicatedData39);
    org.junit.Assert.assertNotNull(replicatedData40);
    org.junit.Assert.assertNotNull(replicatedData41);
  }

  @Test
  public void test1073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1073");
    }
    io.github.onograph.config.EnterpriseClusterSettings enterpriseClusterSettings0 = new io.github.onograph.config.EnterpriseClusterSettings();
  }

  @Test
  public void test1074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1074");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols1 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    java.lang.String str2 = mutableProtocols1.getImpl();
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols3 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols4 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    io.github.onograph.cluster.raft.control.MutableComProFamily[] mutableComProFamilyArray5 = new io.github.onograph.cluster.raft.control.MutableComProFamily[]{
        mutableProtocols1, mutableProtocols3, mutableProtocols4};
    java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily> mutableComProFamilyList6 = new java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList6,
        mutableComProFamilyArray5);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType8 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper comProFamilyWrapper9 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper(
        (java.util.List<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList6,
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType8);
    io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started started10 = new io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started(
        socketAddress0, comProFamilyWrapper9);
    org.junit.Assert.assertTrue("'" + mutableProtocols1 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols1.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Snappy" + "'", str2, "Snappy");
    org.junit.Assert.assertTrue("'" + mutableProtocols3 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols3.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertTrue("'" + mutableProtocols4 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols4.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertNotNull(mutableComProFamilyArray5);
    //org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType8 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType8.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
  }

  @Test
  public void test1075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1075");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry4 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray5 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry4};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction6 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction7 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 100, 1536L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction10 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray5, (long) (byte) 0, (int) (short) 1);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl11 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry12 = null;
    consensusLogCacheServiceNoopImpl11.putForCo(consensusLogEntry12, (long) '#');
    long long15 = consensusLogCacheServiceNoopImpl11.toabys();
    org.neo4j.logging.Log log16 = null;
    bulkAddAction10.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNoopImpl11,
        log16);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray18 = bulkAddAction10.enrsConsensusLogEntryArray;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray19 = bulkAddAction10.enrsConsensusLogEntryArray;
    int int20 = bulkAddAction10.ofst;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray21 = bulkAddAction10.enrsConsensusLogEntryArray;
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    org.junit.Assert.assertNotNull(consensusLogEntryArray18);
    org.junit.Assert.assertNotNull(consensusLogEntryArray19);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    org.junit.Assert.assertNotNull(consensusLogEntryArray21);
  }

  @Test
  public void test1076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1076");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl2 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler storeSyncCompletedSimpleChannelInboundHandler3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl2);
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler4 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl2);
  }

  @Test
  public void test1077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1077");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId gdbId1 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId(
        databaseId0);
    java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>> marshalChannelImplCMSRuleProcessorList2 = new java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>();
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSRuleProcessorJoiningImpl3 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>(
        (java.util.List<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>) marshalChannelImplCMSRuleProcessorList2);
    boolean boolean4 = gdbId1.equals((java.lang.Object) marshalChannelImplCMSRuleProcessorList2);
    org.neo4j.kernel.database.DatabaseId databaseId5 = gdbId1.getRDatabaseId();
    org.neo4j.kernel.database.DatabaseId databaseId6 = gdbId1.getRDatabaseId();
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNull(databaseId5);
    org.junit.Assert.assertNull(databaseId6);
  }

  @Test
  public void test1078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1078");
    }
    io.github.onograph.cluster.raft.shared.ConsensusStrategyType consensusStrategyType0 = io.github.onograph.cluster.raft.shared.ConsensusStrategyType.IN_MEMORY;
    org.junit.Assert.assertTrue("'" + consensusStrategyType0 + "' != '"
            + io.github.onograph.cluster.raft.shared.ConsensusStrategyType.IN_MEMORY + "'",
        consensusStrategyType0.equals(
            io.github.onograph.cluster.raft.shared.ConsensusStrategyType.IN_MEMORY));
  }

  @Test
  public void test1079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1079");
    }
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory0 = null;
    org.neo4j.kernel.impl.api.CommitProcessFactory commitProcessFactory1 = null;
    org.neo4j.graphdb.factory.module.id.DatabaseIdContext databaseIdContext2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService3 = null;
    java.lang.Runnable runnable4 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage5 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl6 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable4, leasableMetaStateStorage5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator8 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl10 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService3, syncableLeasableCoreNodeDataFSMImpl6, namedDatabaseId7,
        syncerator8, consensusNodeIdSupplier9);
    org.neo4j.kernel.impl.locking.Locks locks11 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq<io.github.onograph.cluster.raft.share.meta.fsm.EmptyReq> emptyReqFSMEmptyReq12 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService13 = null;
    java.lang.Runnable runnable14 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage15 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl16 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable14, leasableMetaStateStorage15);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId17 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator18 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier19 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl20 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService13, syncableLeasableCoreNodeDataFSMImpl16, namedDatabaseId17,
        syncerator18, consensusNodeIdSupplier19);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl21 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl22 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ReplicatedTransactionFSM replicatedTransactionFSM23 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl24 = null;
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier26 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore> logicalTransactionStoreSupplier27 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair transactionLogIndexRepair28 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair(
        logProvider25, transactionIdStoreSupplier26, logicalTransactionStoreSupplier27);
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService29 = new io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService(
        emptyReqFSMEmptyReq12, syncableLeasableCoreNodeDataFSMImpl16, fSMTokenImpl21,
        fSMTokenImpl22, replicatedTransactionFSM23, fSMTokenImpl24, transactionLogIndexRepair28);
    org.neo4j.token.TokenHolders tokenHolders30 = null;
    io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper coreNodeWrapper31 = new io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper(
        accessCapabilityFactory0, commitProcessFactory1, databaseIdContext2,
        (org.neo4j.kernel.impl.api.LeaseService) leaseServiceEnterpriseImpl10, locks11,
        coreGdbFSMService29, tokenHolders30);
    try {
      coreGdbFSMService29.fls();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1080");
    }
    io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder serverMessageToByteEncoder0 = new io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    java.net.SocketAddress socketAddress2 = null;
    java.net.SocketAddress socketAddress3 = null;
    io.netty.channel.ChannelPromise channelPromise4 = null;
    try {
      serverMessageToByteEncoder0.connect(channelHandlerContext1, socketAddress2, socketAddress3,
          channelPromise4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1081");
    }
    io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta candidateTallyMeta0 = new io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta();
    long long1 = candidateTallyMeta0.getLgTer();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    boolean boolean4 = candidateTallyMeta0.isUpaForCo(consensusNodeId2, (long) ' ');
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test1082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1082");
    }
    org.neo4j.memory.MemoryTracker memoryTracker0 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout1 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer clusterMemberSyncer2 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer(
        memoryTracker0, neo4jLayout1);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction5 = null;
    org.neo4j.logging.LogProvider logProvider6 = null;
    java.nio.file.Path path7 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo8 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path7);
    java.nio.file.Path path9 = clusterMetaTopologyInfo8.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker10 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo8);
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade12 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config4, fileSystemAbstraction5, logProvider6, clusterMetaTopologyInfo8, memoryTracker11);
    org.neo4j.logging.Log log13 = null;
    java.nio.file.Path path14 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo15 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path14);
    java.nio.file.Path path16 = clusterMetaTopologyInfo15.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker17 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo15);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat18 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv19 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction3, clusterSimpleStorageFacade12, log13, clusterMetaTopologyInfo15,
        clusterMetaFormat18);
    try {
      clusterMemberSyncer2.pefmseForUp(upgradeMetaEnv19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo8);
    org.junit.Assert.assertNull(path9);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo15);
    org.junit.Assert.assertNull(path16);
    org.junit.Assert.assertNotNull(clusterMetaFormat18);
  }

  @Test
  public void test1083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1083");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
    try {
      short short2 = readablePositionAwareChecksumChannelManager0.getShort();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test1084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1084");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    java.lang.String[] strArray8 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet9 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray8);
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet10 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray8);
    org.neo4j.kernel.database.DatabaseId[] databaseIdArray11 = new org.neo4j.kernel.database.DatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId> databaseIdSet12 = new java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.DatabaseId>) databaseIdSet12,
        databaseIdArray11);
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl14 = new io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl(
        discoverySocketAddresses0, socketAddress1, nodeGroupIdentifierSet10,
        (java.util.Set<org.neo4j.kernel.database.DatabaseId>) databaseIdSet12);
    org.neo4j.graphdb.config.Setting<java.lang.String> strSetting15 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingLoaiuString;
    boolean boolean16 = gdbDiscoveryMetaReadReplicaImpl14.equals((java.lang.Object) strSetting15);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet9);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet10);
    org.junit.Assert.assertNotNull(databaseIdArray11);
    //org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(strSetting15);
    //org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test1085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1085");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk5 = null;
    java.lang.Void void6 = processorImpl2.process(bulkAsk5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage7 = null;
    java.lang.Void void8 = processorImpl2.process(logClipRequestMessage7);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId9 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply12 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
        consensusNodeId9, true, (long) 1015);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType14 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted15 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted(
        0L, setupGdbSyncReplyStateType14);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType16 = storeSyncCompleted15.getStat();
    boolean boolean17 = reply12.equals((java.lang.Object) storeSyncCompleted15);
    try {
      java.lang.Void void18 = processorImpl2.process(reply12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType14 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType14.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType16 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType16.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
    //org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test1086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1086");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS();
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta1 = io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.INTL_LES_STAX;
    org.neo4j.io.fs.WritableChannel writableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl3 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel2);
    writableChecksumChannelImpl3.beginChecksum();
    writableChecksumChannelImpl3.beginChecksum();
    try {
      marshalChannelImplCMS0.marshal(leasableMeta1,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(leasableMeta1);
  }

  @Test
  public void test1087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1087");
    }
    io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting clusterLoadBalancingServerPoliciesGroupSetting1 = io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting.gruClusterLoadBalancingServerPoliciesGroupSetting(
        "cc-discovery-actor-system");
    org.junit.Assert.assertNotNull(clusterLoadBalancingServerPoliciesGroupSetting1);
  }

  @Test
  public void test1088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1088");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    java.util.UUID uUID1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.State state2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage infoReplyMessage3 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage(
        consensusNodeId0, uUID1, state2);
    io.github.onograph.cluster.raft.share.meta.fsm.State state4 = infoReplyMessage3.getStat();
    java.util.UUID uUID5 = infoReplyMessage3.getIrUUID();
    org.junit.Assert.assertNull(state4);
    org.junit.Assert.assertNull(uUID5);
  }

  @Test
  public void test1089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1089");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingDivdidsSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test1090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1090");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType0 = io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_GDB_STATUS;
    java.lang.String str1 = clusterDataType0.getTokenKey();
    org.junit.Assert.assertTrue("'" + clusterDataType0 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_GDB_STATUS
        + "'", clusterDataType0.equals(
        io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_GDB_STATUS));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "member-db-state" + "'", str1,
        "member-db-state");
  }

  @Test
  public void test1091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1091");
    }
    io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper leaderNodeDataSDWrapper0 = new io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper();
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier2 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    char char4 = nodeGroupIdentifier2.charAt(0);
    akka.cluster.Cluster cluster5 = null;
    akka.event.EventStream eventStream6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler startScheduler7 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_8 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    akka.actor.Props props9 = io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.prpProps(
        cluster5, eventStream6, startScheduler7,
        (io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach) restartRules1_8);
    boolean boolean10 = nodeGroupIdentifier2.equals((java.lang.Object) restartRules1_8);
    boolean boolean11 = leaderNodeDataSDWrapper0.equals((java.lang.Object) nodeGroupIdentifier2);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId12 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask ask13 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask(
        (io.github.onograph.cluster.raft.share.sync.SyncableData) leaderNodeDataSDWrapper0,
        consensusNodeId12);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel14 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl15 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl16 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel14, safeStateMarshalImpl15);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk17 = null;
    java.lang.Void void18 = processorImpl16.process(bulkAsk17);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage19 = null;
    java.lang.Void void20 = processorImpl16.process(logClipRequestMessage19);
    java.lang.Void void21 = ask13.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl16);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply22 = null;
    try {
      java.lang.Void void23 = processorImpl16.process(reply22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
    org.junit.Assert.assertNotNull(props9);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    //org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(void18);
    org.junit.Assert.assertNull(void20);
    org.junit.Assert.assertNull(void21);
  }

  @Test
  public void test1092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1092");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder6 = new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        (long) (short) 0, 10L, consensusNodeId2, (int) (short) 10, (long) (short) -1, 52L);
    java.lang.Long[] longArray13 = new java.lang.Long[]{97L, 10L, 100L, 52L, 100L, 1L};
    java.util.LinkedList<java.lang.Long> longList14 = new java.util.LinkedList<java.lang.Long>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.Long>) longList14, longArray13);
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation16 = null;
    org.neo4j.kernel.database.DatabaseId databaseId17 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync19 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation16, databaseId17, (long) (short) 0);
    org.neo4j.kernel.database.DatabaseId databaseId20 = abstractTransactionSync19.daasidDatabaseId();
    org.neo4j.kernel.database.DatabaseId databaseId21 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId22 = null;
    java.util.UUID uUID23 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState24 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId21, consensusNodeId22, uUID23);
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray25 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet26 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean27 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet26,
        consensusNodeIdArray25);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper28 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet26);
    java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet29 = consensusNodeServerMemberIdWrapper28.gembsSet();
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation30 = null;
    org.neo4j.kernel.database.DatabaseId databaseId31 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync33 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation30, databaseId31, (long) (short) 0);
    io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper leaderNodeDataSDWrapper34 = new io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper();
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier36 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    char char38 = nodeGroupIdentifier36.charAt(0);
    akka.cluster.Cluster cluster39 = null;
    akka.event.EventStream eventStream40 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler startScheduler41 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_42 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    akka.actor.Props props43 = io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.prpProps(
        cluster39, eventStream40, startScheduler41,
        (io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach) restartRules1_42);
    boolean boolean44 = nodeGroupIdentifier36.equals((java.lang.Object) restartRules1_42);
    boolean boolean45 = leaderNodeDataSDWrapper34.equals((java.lang.Object) nodeGroupIdentifier36);
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray46 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet47 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean48 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet47,
        consensusNodeIdArray46);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper49 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet47);
    io.github.onograph.cluster.raft.share.sync.SyncableData[] syncableDataArray50 = new io.github.onograph.cluster.raft.share.sync.SyncableData[]{
        abstractTransactionSync19, askState24, consensusNodeServerMemberIdWrapper28,
        abstractTransactionSync33, leaderNodeDataSDWrapper34, consensusNodeServerMemberIdWrapper49};
    java.util.LinkedList<io.github.onograph.cluster.raft.share.sync.SyncableData> syncableDataList51 = new java.util.LinkedList<io.github.onograph.cluster.raft.share.sync.SyncableData>();
    boolean boolean52 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.share.sync.SyncableData>) syncableDataList51,
        syncableDataArray50);
    java.util.Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> abstractConsensusMessageOptional53 = bulkTLCRequestBuilder6.mabcoleOptional(
        (java.util.Queue<java.lang.Long>) longList14,
        (java.util.Queue<io.github.onograph.cluster.raft.share.sync.SyncableData>) syncableDataList51);
    org.junit.Assert.assertNotNull(longArray13);
    //org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNull(databaseId20);
    org.junit.Assert.assertNotNull(consensusNodeIdArray25);
    //org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertNotNull(consensusNodeIdSet29);
    org.junit.Assert.assertTrue("'" + char38 + "' != '" + 'h' + "'", char38 == 'h');
    org.junit.Assert.assertNotNull(props43);
    //org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    //org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(consensusNodeIdArray46);
    //org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertNotNull(syncableDataArray50);
    //org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    org.junit.Assert.assertNotNull(abstractConsensusMessageOptional53);
  }

  @Test
  public void test1093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1093");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach.IDNT;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "typically-connect-to-random-read-replica" + "'", str0,
        "typically-connect-to-random-read-replica");
  }

  @Test
  public void test1094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1094");
    }
    org.neo4j.kernel.KernelVersion kernelVersion0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation2 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply3 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply(
        kernelVersion0, storeId1, committedTransactionRepresentation2);
    org.neo4j.kernel.KernelVersion kernelVersion4 = catchupOutgoingTransactionPullReply3.getKernelVersion();
    org.junit.Assert.assertNull(kernelVersion4);
  }

  @Test
  public void test1095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1095");
    }
    java.time.Instant instant0 = null;
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        consensusNodeId2, false, 100L);
    boolean boolean6 = reply5.getIsGv();
    long long7 = reply5.getLgT();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply> replyArrivingMessageManager8 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager.ofConsensusMessageServiceMetaArrivingMessageManager(
        instant0, consensusMemberGroupId1, reply5);
    boolean boolean9 = reply5.getIsGv();
    long long10 = reply5.getLgT();
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    org.junit.Assert.assertNotNull(replyArrivingMessageManager8);
    //org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
  }

  @Test
  public void test1096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1096");
    }
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray0 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList1 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1,
        socketAddressArray0);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService3 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1);
    java.util.Spliterator<org.neo4j.configuration.helpers.SocketAddress> socketAddressSpliterator4 = socketAddressList1.spliterator();
    java.util.Spliterator<org.neo4j.configuration.helpers.SocketAddress> socketAddressSpliterator5 = socketAddressList1.spliterator();
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray6 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList7,
        socketAddressArray6);
    boolean boolean9 = io.github.onograph.cluster.raft.share.calg.VotingMemberThreshold.isQuu(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1,
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList7);
    org.junit.Assert.assertNotNull(socketAddressArray0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(memberNodeService3);
    org.junit.Assert.assertNotNull(socketAddressSpliterator4);
    org.junit.Assert.assertNotNull(socketAddressSpliterator5);
    org.junit.Assert.assertNotNull(socketAddressArray6);
    //org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    //org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test1097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1097");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType5 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_GENERAL_ERR;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted(
        (long) 10, setupGdbSyncReplyStateType5);
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onfesaceForCoSt(
          storeSyncCompletedCompletableFuture3, storeSyncCompleted6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType5 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_GENERAL_ERR
        + "'", setupGdbSyncReplyStateType5.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_GENERAL_ERR));
  }

  @Test
  public void test1098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1098");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup setup1 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup.nohgtsdTransactionBlockGeneratorSetup(
        10L);
    org.junit.Assert.assertNotNull(setup1);
  }

  @Test
  public void test1099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1099");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder answerMessageTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo initJoinClusterMessageCommandInfo2 = io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument.InitJoinClusterMessageCommandInfo.dumJoinClusterRemoteInstrumentInitJoinClusterMessageCommandInfo();
    akka.actor.ActorRef actorRef3 = initJoinClusterMessageCommandInfo2.geoilseActorRef();
    io.netty.channel.ChannelPromise channelPromise4 = null;
    try {
      answerMessageTypeMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) actorRef3, channelPromise4);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertNotNull(initJoinClusterMessageCommandInfo2);
    org.junit.Assert.assertNull(actorRef3);
  }

  @Test
  public void test1100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1100");
    }
    io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceNOOPImpl<java.lang.String> strConsensusMessageLogServiceNOOPImpl0 = new io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceNOOPImpl<java.lang.String>();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage aliveNoReplyMessage5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage(
        consensusNodeId1, (long) 10, (long) 'a', (long) (byte) 10);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    strConsensusMessageLogServiceNOOPImpl0.loobnForNaMECo(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) aliveNoReplyMessage5,
        "causal_clustering.leadership_priority_group", namedDatabaseId7);
    long long9 = aliveNoReplyMessage5.getLgIc();
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
  }

  @Test
  public void test1101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1101");
    }
    io.github.onograph.cluster.raft.share.calg.LeaderNodeElectionEnv leaderNodeElectionEnv2 = new io.github.onograph.cluster.raft.share.calg.LeaderNodeElectionEnv(
        (long) '4', (-1L));
    long long3 = leaderNodeElectionEnv2.comie;
    long long4 = leaderNodeElectionEnv2.comie;
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
  }

  @Test
  public void test1102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1102");
    }
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta0 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade2 = null;
    org.neo4j.logging.Log log3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat7 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv8 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction1, clusterSimpleStorageFacade2, log3, clusterMetaTopologyInfo5,
        clusterMetaFormat7);
    org.neo4j.logging.Log log9 = upgradeMetaEnv8.getLog();
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo10 = upgradeMetaEnv8.getLscClusterMetaTopologyInfo();
    try {
      clearStaleClusterMeta0.accept(upgradeMetaEnv8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNull(log9);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo10);
  }

  @Test
  public void test1103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1103");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement requestStoreDatabaseIdCatchupManagement1 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement(
        databaseId0);
    org.neo4j.kernel.database.DatabaseId databaseId2 = requestStoreDatabaseIdCatchupManagement1.getDatabaseId();
    org.junit.Assert.assertNull(databaseId2);
  }

  @Test
  public void test1104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1104");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    writableChecksumChannelImpl1.beginChecksum();
    writableChecksumChannelImpl1.beginChecksum();
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel5 = writableChecksumChannelImpl1.putDouble(
          (double) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1105");
    }
    io.github.onograph.cluster.raft.share.calg.nltof.TransferElectApproach transferElectApproach0 = io.github.onograph.cluster.raft.share.calg.nltof.TransferElectApproach.NOO_TRANSFER_ELECT_APPROACH;
    org.junit.Assert.assertNotNull(transferElectApproach0);
  }

  @Test
  public void test1106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1106");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta1 = marshalChannelImplCMS0.startState();
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS2 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta3 = marshalChannelImplCMS2.startState();
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper4 = nodeServerMemberTransactionLogDataMeta3.getCmitdMemberIndexWrapper();
    org.neo4j.io.fs.WritableChannel writableChannel5 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl6 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel5);
    try {
      marshalChannelImplCMS0.marshal(nodeServerMemberTransactionLogDataMeta3, writableChannel5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta1);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS2);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta3);
    org.junit.Assert.assertNull(memberIndexWrapper4);
  }

  @Test
  public void test1107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1107");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady consensusGdbsReady0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady.EMT_CONSENSUS_GDBS_READY;
    java.util.Map<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId, io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusMemberGroupIdMap1 = consensusGdbsReady0.getMapRbcc();
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady consensusGdbsReady2 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady(
        consensusMemberGroupIdMap1);
    org.junit.Assert.assertNotNull(consensusGdbsReady0);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMap1);
  }

  @Test
  public void test1108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1108");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier1 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    char char3 = nodeGroupIdentifier1.charAt(0);
    akka.cluster.Cluster cluster4 = null;
    akka.event.EventStream eventStream5 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler startScheduler6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_7 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    akka.actor.Props props8 = io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.prpProps(
        cluster4, eventStream5, startScheduler6,
        (io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach) restartRules1_7);
    boolean boolean9 = nodeGroupIdentifier1.equals((java.lang.Object) restartRules1_7);
    int int10 = nodeGroupIdentifier1.length();
    try {
      char char12 = nodeGroupIdentifier1.charAt(3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'h' + "'", char3 == 'h');
    org.junit.Assert.assertNotNull(props8);
    //org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
  }

  @Test
  public void test1109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1109");
    }
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl gdbDiscoveryMetaCoreImpl0 = null;
    org.neo4j.dbms.identity.ServerId serverId1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper gdbDiscoveryMetaCoreWrapper2 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper(
        gdbDiscoveryMetaCoreImpl0, serverId1);
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting3 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaonrnDuration;
    boolean boolean4 = gdbDiscoveryMetaCoreWrapper2.equals((java.lang.Object) durationSetting3);
    io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkcyrrnlyDuration = durationSetting3;
    org.junit.Assert.assertNotNull(durationSetting3);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1110");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder requestStoreDatabaseIdMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder();
    io.github.onograph.cluster.raft.control.connect.HandshakeStateType handshakeStateType1 = io.github.onograph.cluster.raft.control.connect.HandshakeStateType.IN_PROCESS;
    boolean boolean2 = requestStoreDatabaseIdMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) handshakeStateType1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.netty.channel.ChannelPromise channelPromise4 = null;
    try {
      requestStoreDatabaseIdMessageToByteEncoder0.deregister(channelHandlerContext3,
          channelPromise4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + handshakeStateType1 + "' != '"
            + io.github.onograph.cluster.raft.control.connect.HandshakeStateType.IN_PROCESS + "'",
        handshakeStateType1.equals(
            io.github.onograph.cluster.raft.control.connect.HandshakeStateType.IN_PROCESS));
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1111");
    }
    io.github.onograph.cluster.raft.palapp.strategies.FollowerApproach followerApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.FollowerApproach();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional2 = followerApproach0.upesrfodaOptional(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1112");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry0 = null;
    io.github.onograph.cluster.raft.share.calg.action.AddAction addAction2 = new io.github.onograph.cluster.raft.share.calg.action.AddAction(
        consensusLogEntry0, (long) 100);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver6 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    livingCacheObserver6.sememt((int) 'a');
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl9 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        32, false, (long) 13, livingCacheObserver6);
    org.neo4j.logging.Log log10 = null;
    addAction2.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceLiveImpl9,
        log10);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver15 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    livingCacheObserver15.sememt((int) 'a');
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl18 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        32, false, (long) 13, livingCacheObserver15);
    long long19 = consensusLogCacheServiceLiveImpl18.toabys();
    consensusLogCacheServiceLiveImpl18.retspccac();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry22 = consensusLogCacheServiceLiveImpl18.getConsensusLogEntry(
        1L);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry23 = null;
    consensusLogCacheServiceLiveImpl18.putForCo(consensusLogEntry23, (long) 0);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry27 = consensusLogCacheServiceLiveImpl18.getConsensusLogEntry(
        (long) ' ');
    org.neo4j.logging.Log log28 = null;
    addAction2.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceLiveImpl18,
        log28);
    org.junit.Assert.assertNotNull(livingCacheObserver6);
    org.junit.Assert.assertNotNull(livingCacheObserver15);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    org.junit.Assert.assertNull(consensusLogEntry22);
    org.junit.Assert.assertNull(consensusLogEntry27);
  }

  @Test
  public void test1113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1113");
    }
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker0 = null;
    org.neo4j.internal.id.IdGeneratorFactory idGeneratorFactory1 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator4 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.StorageEngine> storageEngineSupplier5 = null;
    org.neo4j.token.TokenRegistry tokenRegistry6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder relationshipTypeTokenHolder7 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder(
        databaseReadOnlyChecker0, idGeneratorFactory1, namedDatabaseId2, pageCacheTracer3,
        syncerator4, storageEngineSupplier5, tokenRegistry6);
    org.neo4j.token.api.NamedToken namedToken8 = null;
    try {
      relationshipTypeTokenHolder7.addToken(namedToken8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1114");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = null;
    java.lang.Boolean boolean2 = messageProcessorImpl0.process(aliveMsg1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage3 = null;
    java.lang.Boolean boolean4 = messageProcessorImpl0.process(requestTransactionLogCZMetaMessage3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask5 = null;
    java.lang.Boolean boolean6 = messageProcessorImpl0.process(ask5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange7 = null;
    java.lang.Boolean boolean8 = messageProcessorImpl0.process(askToChange7);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId9 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId10 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier11 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray12 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier11};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet13 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet13,
        nodeGroupIdentifierArray12);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec15 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId9, consensusNodeId10,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet13);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId16 = leaderRec15.getPooeConsensusNodeId();
    java.lang.Boolean boolean17 = messageProcessorImpl0.process(leaderRec15);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier11);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray12);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(consensusNodeId16);
    org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
  }

  @Test
  public void test1115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1115");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat0 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.nio.file.Path path5 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo6 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path5);
    java.nio.file.Path path7 = clusterMetaTopologyInfo6.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker8 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo6);
    org.neo4j.memory.MemoryTracker memoryTracker9 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade10 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config2, fileSystemAbstraction3, logProvider4, clusterMetaTopologyInfo6, memoryTracker9);
    org.neo4j.logging.Log log11 = null;
    java.nio.file.Path path12 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo13 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path12);
    java.nio.file.Path path14 = clusterMetaTopologyInfo13.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker15 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo13);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat16 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv17 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction1, clusterSimpleStorageFacade10, log11, clusterMetaTopologyInfo13,
        clusterMetaFormat16);
    boolean boolean18 = clusterMetaFormat0.isLortaForCl(clusterMetaFormat16);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat19 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.configuration.Config config21 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction22 = null;
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.nio.file.Path path24 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo25 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path24);
    java.nio.file.Path path26 = clusterMetaTopologyInfo25.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker27 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo25);
    org.neo4j.memory.MemoryTracker memoryTracker28 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade29 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config21, fileSystemAbstraction22, logProvider23, clusterMetaTopologyInfo25,
        memoryTracker28);
    org.neo4j.logging.Log log30 = null;
    java.nio.file.Path path31 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo32 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path31);
    java.nio.file.Path path33 = clusterMetaTopologyInfo32.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker34 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo32);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat35 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv36 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction20, clusterSimpleStorageFacade29, log30, clusterMetaTopologyInfo32,
        clusterMetaFormat35);
    boolean boolean37 = clusterMetaFormat19.isLortaForCl(clusterMetaFormat35);
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler38 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl39 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler40 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler38, refCatchupManagerImpl39);
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting41 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingJoapoDuration;
    boolean boolean42 = transactionChunkingCompletedInboundHandler40.acceptInboundMessage(
        (java.lang.Object) durationSetting41);
    boolean boolean43 = clusterMetaFormat19.equals(
        (java.lang.Object) transactionChunkingCompletedInboundHandler40);
    boolean boolean44 = clusterMetaFormat0.isMabmttForCl(clusterMetaFormat19);
    int int45 = clusterMetaFormat19.getIMjr();
    int int46 = clusterMetaFormat19.getIMnr();
    int int47 = clusterMetaFormat19.getIMjr();
    org.junit.Assert.assertNotNull(clusterMetaFormat0);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo6);
    org.junit.Assert.assertNull(path7);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo13);
    org.junit.Assert.assertNull(path14);
    org.junit.Assert.assertNotNull(clusterMetaFormat16);
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(clusterMetaFormat19);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo25);
    org.junit.Assert.assertNull(path26);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo32);
    org.junit.Assert.assertNull(path33);
    org.junit.Assert.assertNotNull(clusterMetaFormat35);
    //org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(durationSetting41);
    //org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    //org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    //org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
  }

  @Test
  public void test1116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1116");
    }
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory0 = null;
    org.neo4j.kernel.impl.api.CommitProcessFactory commitProcessFactory1 = null;
    org.neo4j.graphdb.factory.module.id.DatabaseIdContext databaseIdContext2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService3 = null;
    java.lang.Runnable runnable4 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage5 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl6 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable4, leasableMetaStateStorage5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator8 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl10 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService3, syncableLeasableCoreNodeDataFSMImpl6, namedDatabaseId7,
        syncerator8, consensusNodeIdSupplier9);
    org.neo4j.kernel.impl.locking.Locks locks11 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq<io.github.onograph.cluster.raft.share.meta.fsm.EmptyReq> emptyReqFSMEmptyReq12 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService13 = null;
    java.lang.Runnable runnable14 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage15 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl16 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable14, leasableMetaStateStorage15);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId17 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator18 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier19 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl20 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService13, syncableLeasableCoreNodeDataFSMImpl16, namedDatabaseId17,
        syncerator18, consensusNodeIdSupplier19);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl21 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl22 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ReplicatedTransactionFSM replicatedTransactionFSM23 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl24 = null;
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier26 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore> logicalTransactionStoreSupplier27 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair transactionLogIndexRepair28 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair(
        logProvider25, transactionIdStoreSupplier26, logicalTransactionStoreSupplier27);
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService29 = new io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService(
        emptyReqFSMEmptyReq12, syncableLeasableCoreNodeDataFSMImpl16, fSMTokenImpl21,
        fSMTokenImpl22, replicatedTransactionFSM23, fSMTokenImpl24, transactionLogIndexRepair28);
    org.neo4j.token.TokenHolders tokenHolders30 = null;
    io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper coreNodeWrapper31 = new io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper(
        accessCapabilityFactory0, commitProcessFactory1, databaseIdContext2,
        (org.neo4j.kernel.impl.api.LeaseService) leaseServiceEnterpriseImpl10, locks11,
        coreGdbFSMService29, tokenHolders30);
    org.neo4j.kernel.impl.api.LeaseClient leaseClient32 = leaseServiceEnterpriseImpl10.newClient();
    org.junit.Assert.assertNotNull(leaseClient32);
  }

  @Test
  public void test1117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1117");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    try {
      coreClusterStructureServiceLifecycleAdapter3.stop();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1118");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.Slice slice2 = null;
    try {
      boolean boolean3 = storeSyncCompletedCatchupAnswerManager0.isOnficttForCoSl(
          storeSyncCompletedCompletableFuture1, slice2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1119");
    }
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl gdbDiscoveryMetaCoreImpl0 = null;
    org.neo4j.dbms.identity.ServerId serverId1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper gdbDiscoveryMetaCoreWrapper2 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper(
        gdbDiscoveryMetaCoreImpl0, serverId1);
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException4 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure startFailure5 = new io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure(
        (java.lang.Throwable) clusterDatabaseManagementException4);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException7 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Exception) startFailure5, "user-defined");
    boolean boolean8 = gdbDiscoveryMetaCoreWrapper2.equals(
        (java.lang.Object) gdbStoreSyncCrlException7);
    org.neo4j.dbms.identity.ServerId serverId9 = gdbDiscoveryMetaCoreWrapper2.getServerId();
    //org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNull(serverId9);
  }

  @Test
  public void test1120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1120");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = consensusLogCacheServiceNLImpl0.getConsensusLogEntry(
        (long) 1);
    int int3 = consensusLogCacheServiceNLImpl0.elmtcu();
    consensusLogCacheServiceNLImpl0.enb();
    consensusLogCacheServiceNLImpl0.retspccac();
    org.junit.Assert.assertNull(consensusLogEntry2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
  }

  @Test
  public void test1121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1121");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncCompletedMessageToByteEncoder storeSyncCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncCompletedMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise2 = null;
    try {
      storeSyncCompletedMessageToByteEncoder0.deregister(channelHandlerContext1, channelPromise2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1122");
    }
    org.neo4j.graphdb.config.Setting<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingDeldiogNodeGroupIdentifier;
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSetting0);
  }

  @Test
  public void test1123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1123");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSafeChannelMarshal gdbServerIdWrapperSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSafeChannelMarshal.IT;
    org.junit.Assert.assertNotNull(gdbServerIdWrapperSafeChannelMarshal0);
  }

  @Test
  public void test1124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1124");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ));
  }

  @Test
  public void test1125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1125");
    }
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta> databaseIdMap0 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.id.ConsensusNodeId> databaseIdMap1 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, org.neo4j.dbms.DatabaseState> databaseIdMap2 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl gdbServerPointInTimeImpl3 = new io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl(
        databaseIdMap0, databaseIdMap1, databaseIdMap2);
    try {
      java.util.Set<org.neo4j.kernel.database.DatabaseId> databaseIdSet4 = gdbServerPointInTimeImpl3.divldasSet();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1126");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIds requestAllGdbIds0 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIds();
  }

  @Test
  public void test1127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1127");
    }
    java.nio.file.Path[] pathArray1 = new java.nio.file.Path[]{};
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply setupGdbStoreSyncReply2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(
        (long) 'h', pathArray1);
    java.nio.file.Path[] pathArray3 = setupGdbStoreSyncReply2.getPtsPathArray();
    long long4 = setupGdbStoreSyncReply2.getLgItpcl();
    org.junit.Assert.assertNotNull(pathArray1);
    org.junit.Assert.assertNotNull(setupGdbStoreSyncReply2);
    org.junit.Assert.assertNotNull(pathArray3);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 104L + "'", long4 == 104L);
  }

  @Test
  public void test1128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1128");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo structureInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo.EMT_STRUCTURE_INFO;
    akka.cluster.UniqueAddress uniqueAddress1 = null;
    java.util.stream.Stream<io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper> gdbDiscoveryMetaCoreWrapperStream2 = structureInfo0.geseStream(
        uniqueAddress1);
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachException namedServiceApproachException4 = new io.github.onograph.cluster.raft.palapp.NamedServiceApproachException(
        "user-defined");
    boolean boolean5 = structureInfo0.equals((java.lang.Object) namedServiceApproachException4);
    java.util.stream.Stream<io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper> gdbDiscoveryMetaCoreWrapperStream6 = structureInfo0.geseStream();
    org.junit.Assert.assertNotNull(structureInfo0);
    org.junit.Assert.assertNotNull(gdbDiscoveryMetaCoreWrapperStream2);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(gdbDiscoveryMetaCoreWrapperStream6);
  }

  @Test
  public void test1129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1129");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl(
          byteBuf0, 10L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1130");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.DiscoverySocketAddressesSafeChannelMarshal discoverySocketAddressesSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.DiscoverySocketAddressesSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    try {
      io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses4 = discoverySocketAddressesSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(discoverySocketAddressesSafeChannelMarshal0);
  }

  @Test
  public void test1131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1131");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = null;
    java.lang.Boolean boolean2 = messageProcessorImpl0.process(aliveMsg1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask3 = null;
    java.lang.Boolean boolean4 = messageProcessorImpl0.process(ask3);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId5 = null;
    java.util.UUID uUID6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.State state7 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage infoReplyMessage8 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage(
        consensusNodeId5, uUID6, state7);
    io.github.onograph.cluster.raft.share.meta.fsm.State state9 = infoReplyMessage8.getStat();
    java.lang.Boolean boolean10 = messageProcessorImpl0.process(infoReplyMessage8);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertNull(state9);
    org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
  }

  @Test
  public void test1132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1132");
    }
    io.github.onograph.cluster.raft.module.cuprot.IncomingEventService incomingEventService0 = io.github.onograph.cluster.raft.module.cuprot.IncomingEventService.NOO_INCOMING_EVENT_SERVICE;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    org.neo4j.storageengine.api.StoreId storeId2 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource5 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId1, storeId2, (long) (byte) 10, path4);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService6 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations7 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager8 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl9 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService6, leaderOperations7, namedServiceApproachManager8);
    boolean boolean10 = requestStoreResource5.equals(
        (java.lang.Object) socketAddressServiceLeaderImpl9);
    java.net.SocketAddress socketAddress11 = null;
    incomingEventService0.onccpromsForSoAb(
        (io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper) requestStoreResource5,
        socketAddress11);
    java.net.SocketAddress socketAddress13 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync requestTransactionSync14 = null;
    incomingEventService0.ontpurqForSoRe(socketAddress13, requestTransactionSync14);
    org.junit.Assert.assertNotNull(incomingEventService0);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test1133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1133");
    }
    java.lang.String str0 = org.neo4j.token.api.TokenHolder.TYPE_PROPERTY_KEY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PropertyKey" + "'", str0, "PropertyKey");
  }

  @Test
  public void test1134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1134");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncRequestMessageToByteEncoder storeSyncRequestMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncRequestMessageToByteEncoder();
  }

  @Test
  public void test1135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1135");
    }
    io.netty.channel.Channel channel0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager catchupReplyChannelManager1 = new io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager(
        channel0);
    try {
      catchupReplyChannelManager1.closeChannel();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1136");
    }
    io.github.onograph.cluster.raft.utils.ExceptionManager exceptionManager1 = new io.github.onograph.cluster.raft.utils.ExceptionManager(
        "designated_seeder");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        "store_version");
    exceptionManager1.addForTh((java.lang.Throwable) gdbStoreSyncCrlException3);
    java.lang.Throwable throwable5 = null;
    exceptionManager1.addForTh(throwable5);
  }

  @Test
  public void test1137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1137");
    }
    io.github.onograph.cluster.raft.share.calg.action.TransactionLogActionClipImpl transactionLogActionClipImpl1 = new io.github.onograph.cluster.raft.share.calg.action.TransactionLogActionClipImpl(
        (long) (short) 0);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl2 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry4 = consensusLogCacheServiceNLImpl2.getConsensusLogEntry(
        (long) 1);
    int int5 = consensusLogCacheServiceNLImpl2.elmtcu();
    consensusLogCacheServiceNLImpl2.enb();
    consensusLogCacheServiceNLImpl2.trnt(100L);
    org.neo4j.logging.Log log9 = null;
    transactionLogActionClipImpl1.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNLImpl2,
        log9);
    org.junit.Assert.assertNull(consensusLogEntry4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test1138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1138");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage5 = null;
    java.lang.Void void6 = processorImpl2.process(logClipRequestMessage5);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId7 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId8 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask12 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask(
        consensusNodeId7, consensusNodeId8, (long) 32, (long) (byte) -1, 10L);
    try {
      java.lang.Void void13 = processorImpl2.process(ask12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
  }

  @Test
  public void test1139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1139");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    io.github.onograph.cluster.raft.share.meta.ActionProcessManager actionProcessManager1 = null;
    io.github.onograph.cluster.raft.share.meta.ConsensusTLogManager consensusTLogManager2 = new io.github.onograph.cluster.raft.share.meta.ConsensusTLogManager(
        consensusOperationsManager0, actionProcessManager1);
    try {
      consensusTLogManager2.prn();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1140");
    }
    io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta candidateTallyMeta0 = new io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta();
    long long1 = candidateTallyMeta0.getLgTer();
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog2 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long4 = inMemoryConsensusTransactionLog2.prn((long) 1536);
    long long6 = inMemoryConsensusTransactionLog2.redettm(0L);
    boolean boolean7 = candidateTallyMeta0.equals((java.lang.Object) long6);
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1536L + "'", long4 == 1536L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    //org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test1141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1141");
    }
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray0 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList1 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1,
        socketAddressArray0);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService3 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService4 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1);
    boolean boolean5 = memberNodeService4.isUsord();
    io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterJoinOrganizer clusterJoinOrganizer6 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterJoinOrganizer(
        memberNodeService4);
    org.junit.Assert.assertNotNull(socketAddressArray0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(memberNodeService3);
    org.junit.Assert.assertNotNull(memberNodeService4);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
  }

  @Test
  public void test1142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1142");
    }
    io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
    io.netty.buffer.ByteBuf[] byteBufArray2 = new io.netty.buffer.ByteBuf[]{};
    java.util.LinkedList<io.netty.buffer.ByteBuf> byteBufList3 = new java.util.LinkedList<io.netty.buffer.ByteBuf>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<io.netty.buffer.ByteBuf>) byteBufList3, byteBufArray2);
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl5 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl(
          byteBufAllocator0, (int) (byte) 0,
          (java.util.Queue<io.netty.buffer.ByteBuf>) byteBufList3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: allocator cannot be null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteBufArray2);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1143");
    }
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId0 = null;
    org.neo4j.token.TokenRegistry tokenRegistry1 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator2 = null;
    org.neo4j.internal.id.IdGeneratorFactory idGeneratorFactory3 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.StorageEngine> storageEngineSupplier4 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer5 = null;
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder labelTokenHolder7 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder(
        namedDatabaseId0, tokenRegistry1, syncerator2, idGeneratorFactory3, storageEngineSupplier4,
        pageCacheTracer5, databaseReadOnlyChecker6);
    java.lang.String[] strArray14 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet15 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray14);
    int[] intArray18 = new int[]{(byte) 0, 128};
    try {
      labelTokenHolder7.getOrCreateInternalIds(strArray14, intArray18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet15);
    org.junit.Assert.assertNotNull(intArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 128]");
  }

  @Test
  public void test1144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1144");
    }
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaJobEventService readReplicaJobEventService0 = null;
    org.neo4j.logging.Log log3 = null;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaTransactionBlockProcessor readReplicaTransactionBlockProcessor4 = null;
    io.github.onograph.cluster.raft.readreplica.tx.TxCancelable txCancelable5 = null;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask readReplicaGetChangesTask6 = new io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask(
        readReplicaJobEventService0, (long) 1016, (long) 1016, log3,
        readReplicaTransactionBlockProcessor4, txCancelable5);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted> transactionChunkingCompletedCompletableFuture7 = null;
    java.nio.file.Path[] pathArray9 = new java.nio.file.Path[]{};
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply setupGdbStoreSyncReply10 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(
        (long) 'h', pathArray9);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType11 = setupGdbStoreSyncReply10.getStat();
    try {
      readReplicaGetChangesTask6.onsrltresForCoSe(transactionChunkingCompletedCompletableFuture7,
          setupGdbStoreSyncReply10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pathArray9);
    org.junit.Assert.assertNotNull(setupGdbStoreSyncReply10);
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType11 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK
        + "'", setupGdbSyncReplyStateType11.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK));
  }

  @Test
  public void test1145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1145");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SC_FP;
    byte byte1 = askMessageType0.getTmByte();
    org.junit.Assert.assertTrue("'" + askMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SC_FP + "'",
        askMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SC_FP));
    org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 6 + "'", byte1 == (byte) 6);
  }

  @Test
  public void test1146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1146");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId1 = null;
    long long2 = safeStateMarshalImpl0.ordinal(consensusMemberGroupId1);
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper3 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.dumMetaWrapper(
        (org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId>) safeStateMarshalImpl0);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager4 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel5 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl6 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel5);
    readablePositionAwareChecksumChannelManager4.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl6);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition8 = readablePositionAwareChecksumChannelManager4.getCurrentPosition();
    try {
      io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId9 = safeStateMarshalImpl0.unmarshal0(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper3);
    org.junit.Assert.assertNotNull(logPosition8);
  }

  @Test
  public void test1147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1147");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta sliceMeta1 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta(
        "store_version");
    java.lang.String str2 = sliceMeta1.getStrNf();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "store_version" + "'", str2,
        "store_version");
  }

  @Test
  public void test1148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1148");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver3 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl4 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        (int) (byte) 1, false, (long) '#', livingCacheObserver3);
    livingCacheObserver3.sembe((long) 1002);
    org.junit.Assert.assertNotNull(livingCacheObserver3);
  }

  @Test
  public void test1149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1149");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.cluster.raft.module.dprot.dprocs.DistributedClusterInfoBasicProcedure distributedClusterInfoBasicProcedure2 = new io.github.onograph.cluster.raft.module.dprot.dprocs.DistributedClusterInfoBasicProcedure(
        clusterStructureService0, databaseIdRepository1);
  }

  @Test
  public void test1150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1150");
    }
    io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper leaderNodeDataSDWrapper0 = new io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper();
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier2 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    char char4 = nodeGroupIdentifier2.charAt(0);
    akka.cluster.Cluster cluster5 = null;
    akka.event.EventStream eventStream6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler startScheduler7 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_8 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    akka.actor.Props props9 = io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.prpProps(
        cluster5, eventStream6, startScheduler7,
        (io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach) restartRules1_8);
    boolean boolean10 = nodeGroupIdentifier2.equals((java.lang.Object) restartRules1_8);
    boolean boolean11 = leaderNodeDataSDWrapper0.equals((java.lang.Object) nodeGroupIdentifier2);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId12 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask ask13 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask(
        (io.github.onograph.cluster.raft.share.sync.SyncableData) leaderNodeDataSDWrapper0,
        consensusNodeId12);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType14 = ask13.getTNme();
    org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
    org.junit.Assert.assertNotNull(props9);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    //org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType14 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.NIT_REQ
        + "'", raftConsensusMessageType14.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.NIT_REQ));
  }

  @Test
  public void test1151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1151");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq<io.github.onograph.cluster.raft.share.meta.fsm.EmptyReq> emptyReqFSMEmptyReq0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService1 = null;
    java.lang.Runnable runnable2 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl4 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable2, leasableMetaStateStorage3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator6 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier7 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl8 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService1, syncableLeasableCoreNodeDataFSMImpl4, namedDatabaseId5,
        syncerator6, consensusNodeIdSupplier7);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl10 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ReplicatedTransactionFSM replicatedTransactionFSM11 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl12 = null;
    org.neo4j.logging.LogProvider logProvider13 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier14 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore> logicalTransactionStoreSupplier15 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair transactionLogIndexRepair16 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair(
        logProvider13, transactionIdStoreSupplier14, logicalTransactionStoreSupplier15);
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService17 = new io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService(
        emptyReqFSMEmptyReq0, syncableLeasableCoreNodeDataFSMImpl4, fSMTokenImpl9, fSMTokenImpl10,
        replicatedTransactionFSM11, fSMTokenImpl12, transactionLogIndexRepair16);
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotData snapshotData20 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotData(
        (long) 2, (long) (short) -1);
    try {
      coreGdbFSMService17.aunspForSn(snapshotData20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1152");
    }
    io.github.onograph.cluster.raft.utils.queuesrv.ElementQueueRunnerImpl<io.github.onograph.cluster.raft.module.cuprot.AskMessageType> askMessageTypeElementQueueRunnerImpl0 = new io.github.onograph.cluster.raft.utils.queuesrv.ElementQueueRunnerImpl<io.github.onograph.cluster.raft.module.cuprot.AskMessageType>();
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType1 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC;
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType[] askMessageTypeArray2 = new io.github.onograph.cluster.raft.module.cuprot.AskMessageType[]{
        askMessageType1};
    java.util.ArrayList<io.github.onograph.cluster.raft.module.cuprot.AskMessageType> askMessageTypeList3 = new java.util.ArrayList<io.github.onograph.cluster.raft.module.cuprot.AskMessageType>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.module.cuprot.AskMessageType>) askMessageTypeList3,
        askMessageTypeArray2);
    askMessageTypeElementQueueRunnerImpl0.removeSome(
        (java.util.List<io.github.onograph.cluster.raft.module.cuprot.AskMessageType>) askMessageTypeList3);
    boolean boolean6 = askMessageTypeElementQueueRunnerImpl0.isQueueEmpty();
    askMessageTypeElementQueueRunnerImpl0.removeAll();
    org.junit.Assert.assertTrue("'" + askMessageType1 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC + "'",
        askMessageType1.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC));
    org.junit.Assert.assertNotNull(askMessageTypeArray2);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test1153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1153");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl();
    try {
      io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = consensusLogCacheServiceLiveImpl0.getConsensusLogEntry(
          (long) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: e9c4b331-9467-4fe6-9549-c9a5101868bc");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test1154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1154");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor storeResourceSyncProcessor1 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor(
        3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreElementFacade storeElementFacade7 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreElementFacade(
        fileSystemAbstraction3, path4, (int) '4',
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S");
    try {
      storeResourceSyncProcessor1.steForChSt(channelHandlerContext2, storeElementFacade7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1155");
    }
    io.github.onograph.cluster.raft.shared.ConsensusStrategyType consensusStrategyType0 = io.github.onograph.cluster.raft.shared.ConsensusStrategyType.SEGMENTED;
    org.junit.Assert.assertTrue("'" + consensusStrategyType0 + "' != '"
            + io.github.onograph.cluster.raft.shared.ConsensusStrategyType.SEGMENTED + "'",
        consensusStrategyType0.equals(
            io.github.onograph.cluster.raft.shared.ConsensusStrategyType.SEGMENTED));
  }

  @Test
  public void test1156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1156");
    }
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaJobEventService readReplicaJobEventService0 = null;
    org.neo4j.logging.Log log3 = null;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaTransactionBlockProcessor readReplicaTransactionBlockProcessor4 = null;
    io.github.onograph.cluster.raft.readreplica.tx.TxCancelable txCancelable5 = null;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask readReplicaGetChangesTask6 = new io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask(
        readReplicaJobEventService0, (long) 1016, (long) 1016, log3,
        readReplicaTransactionBlockProcessor4, txCancelable5);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted> transactionChunkingCompletedCompletableFuture7 = null;
    java.nio.file.Path path9 = null;
    java.nio.file.Path[] pathArray10 = new java.nio.file.Path[]{path9};
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply setupGdbStoreSyncReply11 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(
        (long) '4', pathArray10);
    try {
      readReplicaGetChangesTask6.onsrltresForCoSe(transactionChunkingCompletedCompletableFuture7,
          setupGdbStoreSyncReply11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pathArray10);
    org.junit.Assert.assertNotNull(setupGdbStoreSyncReply11);
  }

  @Test
  public void test1157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1157");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType1.getImpl();
    boolean boolean3 = viewClusterInfo0.equals((java.lang.Object) entProVer2);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType4 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer5 = applicationComProFamilyType4.getImpl();
    int int6 = entProVer2.compareTo(entProVer5);
    io.github.onograph.cluster.raft.share.sync.SyncStatus syncStatus7 = new io.github.onograph.cluster.raft.share.sync.SyncStatus();
    boolean boolean8 = entProVer2.equals((java.lang.Object) syncStatus7);
    syncStatus7.trerliee();
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType1 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType1.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer2);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType4 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType4.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    //org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test1158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1158");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.putInt(
          (-1));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1159");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceByteToMessageDecoder sliceByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier3 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    java.util.stream.IntStream intStream4 = nodeGroupIdentifier3.chars();
    try {
      sliceByteToMessageDecoder0.userEventTriggered(channelHandlerContext1,
          (java.lang.Object) intStream4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intStream4);
  }

  @Test
  public void test1160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1160");
    }
    akka.actor.ActorRef actorRef0 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses1 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress2 = null;
    java.lang.String[] strArray9 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet10 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray9);
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet11 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray9);
    org.neo4j.kernel.database.DatabaseId[] databaseIdArray12 = new org.neo4j.kernel.database.DatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId> databaseIdSet13 = new java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.DatabaseId>) databaseIdSet13,
        databaseIdArray12);
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl15 = new io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl(
        discoverySocketAddresses1, socketAddress2, nodeGroupIdentifierSet11,
        (java.util.Set<org.neo4j.kernel.database.DatabaseId>) databaseIdSet13);
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting16 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingReeasolaiInteger;
    boolean boolean17 = gdbDiscoveryMetaReadReplicaImpl15.equals((java.lang.Object) intSetting16);
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses18 = gdbDiscoveryMetaReadReplicaImpl15.contsDiscoverySocketAddresses();
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap19 = null;
    akka.actor.ActorRef actorRef20 = null;
    org.neo4j.dbms.identity.ServerId serverId21 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo updateReadReplicaInfo22 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo(
        actorRef0, gdbDiscoveryMetaReadReplicaImpl15, databaseIdMap19, actorRef20, serverId21);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet10);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet11);
    org.junit.Assert.assertNotNull(databaseIdArray12);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(intSetting16);
    //org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNull(discoverySocketAddresses18);
  }

  @Test
  public void test1161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1161");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal readReplicateGdbMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal.IT;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> serverIdMap2 = null;
    io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta readReplicateGdbMeta3 = io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(
        databaseId1, serverIdMap2);
    org.neo4j.io.fs.WritableChannel writableChannel4 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl5 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel4);
    writableChecksumChannelImpl5.beginChecksum();
    writableChecksumChannelImpl5.beginChecksum();
    try {
      readReplicateGdbMetaSafeChannelMarshal0.marshal(readReplicateGdbMeta3,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(readReplicateGdbMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(readReplicateGdbMeta3);
  }

  @Test
  public void test1162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1162");
    }
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker0 = null;
    org.neo4j.internal.id.IdGeneratorFactory idGeneratorFactory1 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator4 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.StorageEngine> storageEngineSupplier5 = null;
    org.neo4j.token.TokenRegistry tokenRegistry6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder relationshipTypeTokenHolder7 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder(
        databaseReadOnlyChecker0, idGeneratorFactory1, namedDatabaseId2, pageCacheTracer3,
        syncerator4, storageEngineSupplier5, tokenRegistry6);
    try {
      org.neo4j.token.api.NamedToken namedToken9 = relationshipTypeTokenHolder7.getTokenById(
          (int) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1163");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Long> longSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaneyLong;
    org.junit.Assert.assertNotNull(longSetting0);
  }

  @Test
  public void test1164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1164");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdByteToMessageDecoder requestStoreDatabaseIdByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdByteToMessageDecoder();
  }

  @Test
  public void test1165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1165");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.io.pagecache.PageCache pageCache1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources storeResources2 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources(
        fileSystemAbstraction0, pageCache1);
    org.neo4j.io.pagecache.context.CursorContext cursorContext3 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout4 = null;
    try {
      org.neo4j.storageengine.api.StoreId storeId5 = storeResources2.redsoiStoreId(cursorContext3,
          databaseLayout4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1166");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations1 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager2 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl3 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService0, leaderOperations1, namedServiceApproachManager2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId4 = null;
    try {
      org.neo4j.configuration.helpers.SocketAddress socketAddress5 = socketAddressServiceLeaderImpl3.prmySocketAddress(
          namedDatabaseId4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1167");
    }
    java.lang.Runnable runnable0 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable0, leasableMetaStateStorage1);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta3 = io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.INTL_LES_STAX;
    syncableLeasableCoreNodeDataFSMImpl2.inlspForLe(leasableMeta3);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta5 = syncableLeasableCoreNodeDataFSMImpl2.snpoLeasableMeta();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId6 = leasableMeta5.getOnrConsensusNodeId();
    org.junit.Assert.assertNotNull(leasableMeta3);
    org.junit.Assert.assertNotNull(leasableMeta5);
    org.junit.Assert.assertNull(consensusNodeId6);
  }

  @Test
  public void test1168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1168");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemMessageToByteEncoder catchupProblemMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemMessageToByteEncoder();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat1 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat2 = clusterMetaFormat1.plsoemnClusterMetaFormat();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat3 = clusterMetaFormat2.plsoemnClusterMetaFormat();
    boolean boolean4 = catchupProblemMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) clusterMetaFormat2);
    org.junit.Assert.assertNotNull(clusterMetaFormat1);
    org.junit.Assert.assertNotNull(clusterMetaFormat2);
    org.junit.Assert.assertNotNull(clusterMetaFormat3);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1169");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_VAL;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols1 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    java.lang.String str2 = mutableProtocols1.getImpl();
    java.lang.String str3 = mutableProtocols1.getImpl();
    java.lang.String str4 = mutableProtocols1.caerString();
    io.github.onograph.cluster.raft.control.MutableComProFamily[] mutableComProFamilyArray5 = new io.github.onograph.cluster.raft.control.MutableComProFamily[]{
        mutableProtocols0, mutableProtocols1};
    java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily> mutableComProFamilyList6 = new java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList6,
        mutableComProFamilyArray5);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType8 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer9 = applicationComProFamilyType8.getImpl();
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper comProFamilyWrapper10 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper(
        (java.util.List<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList6,
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType8);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType11 = null;
    try {
      boolean boolean12 = applicationComProFamilyType8.isSacerForAp(applicationComProFamilyType11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_VAL + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_VAL));
    org.junit.Assert.assertTrue("'" + mutableProtocols1 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols1.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Snappy" + "'", str2, "Snappy");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Snappy" + "'", str3, "Snappy");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "type_comp" + "'", str4, "type_comp");
    org.junit.Assert.assertNotNull(mutableComProFamilyArray5);
    //org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType8 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType8.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer9);
  }

  @Test
  public void test1170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1170");
    }
    java.time.Clock clock0 = null;
    akka.cluster.client.ClusterClientReceptionist clusterClientReceptionist1 = null;
    org.neo4j.configuration.Config config2 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta> readReplicateGdbMetaSourceQueueWithComplete3 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure> databaseReadReplicaClusterStructureSourceQueueWithComplete4 = null;
    akka.actor.Props props5 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.DatabaseReadReplicaClusterStructureLoggingActor.prpProps(
        clock0, clusterClientReceptionist1, config2, readReplicateGdbMetaSourceQueueWithComplete3,
        databaseReadReplicaClusterStructureSourceQueueWithComplete4);
    org.junit.Assert.assertNotNull(props5);
  }

  @Test
  public void test1171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1171");
    }
    io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting clusterLoadBalancingServerPoliciesGroupSetting1 = io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting.gruClusterLoadBalancingServerPoliciesGroupSetting(
        "catchup_protocol");
    java.lang.String str2 = clusterLoadBalancingServerPoliciesGroupSetting1.getPrefix();
    org.neo4j.graphdb.config.Setting<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta>> loadBalanceServerMetaRuleProcessorSetting3 = clusterLoadBalancingServerPoliciesGroupSetting1.val;
    java.lang.String str4 = clusterLoadBalancingServerPoliciesGroupSetting1.getPrefix();
    org.junit.Assert.assertNotNull(clusterLoadBalancingServerPoliciesGroupSetting1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "causal_clustering.load_balancing.config.server_policies" + "'",
        str2, "causal_clustering.load_balancing.config.server_policies");
    org.junit.Assert.assertNotNull(loadBalanceServerMetaRuleProcessorSetting3);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "causal_clustering.load_balancing.config.server_policies" + "'",
        str4, "causal_clustering.load_balancing.config.server_policies");
  }

  @Test
  public void test1172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1172");
    }
    akka.actor.ExtendedActorSystem extendedActorSystem0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ActorRefSafeChannelMarshal actorRefSafeChannelMarshal1 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.ActorRefSafeChannelMarshal(
        extendedActorSystem0);
    akka.actor.ActorRef actorRef2 = null;
    org.neo4j.io.fs.WritableChannel writableChannel3 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl4 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel3);
    writableChecksumChannelImpl4.beginChecksum();
    writableChecksumChannelImpl4.beginChecksum();
    try {
      actorRefSafeChannelMarshal1.marshal(actorRef2,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1173");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusMessageCoordinator consensusMessageCoordinator0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusMessageCoordinator.EMT_CONSENSUS_MESSAGE_COORDINATOR;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl2 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler3 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl2);
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType4 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_IS_ANSWER;
    boolean boolean5 = gdbIdInboundHandler3.acceptInboundMessage(
        (java.lang.Object) answerMessageType4);
    boolean boolean6 = consensusMessageCoordinator0.equals((java.lang.Object) answerMessageType4);
    org.junit.Assert.assertNotNull(consensusMessageCoordinator0);
    org.junit.Assert.assertTrue("'" + answerMessageType4 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_IS_ANSWER + "'",
        answerMessageType4.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_IS_ANSWER));
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test1174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1174");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    byte[] byteArray2 = new byte[]{(byte) 9};
    org.neo4j.kernel.database.DatabaseId databaseId3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType5 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData6 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData(
        byteArray2, databaseId3, "name", replicaTokenType5);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId7 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask ask8 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask(
        (io.github.onograph.cluster.raft.share.sync.SyncableData) requestData6, consensusNodeId7);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.comp.DataMarshaller.maslForReBy(byteBuf0,
          requestData6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray2);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[9]");
  }

  @Test
  public void test1175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1175");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaInboundHandler authMetaInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    try {
      authMetaInboundHandler2.channelRead(channelHandlerContext3, (java.lang.Object) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1176");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.DiscoverySocketAddressesSafeChannelMarshal discoverySocketAddressesSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.DiscoverySocketAddressesSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.getCurrentPosition();
    int int5 = readableClosablePositionAwareChecksumChannelPassThruImpl2.endChecksumAndValidate();
    try {
      io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses6 = discoverySocketAddressesSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(discoverySocketAddressesSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(logPosition4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test1177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1177");
    }
    io.github.onograph.cluster.raft.control.AppComProFamilyGroupType appComProFamilyGroupType0 = io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo1 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType2 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer3 = applicationComProFamilyType2.getImpl();
    boolean boolean4 = viewClusterInfo1.equals((java.lang.Object) entProVer3);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType5 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer6 = applicationComProFamilyType5.getImpl();
    int int7 = entProVer3.compareTo(entProVer6);
    java.util.Optional<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyOptional8 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.finOptional(
        appComProFamilyGroupType0, entProVer6);
    java.lang.Object obj9 = null;
    boolean boolean10 = entProVer6.equals(obj9);
    java.lang.String str11 = entProVer6.toString();
    org.junit.Assert.assertTrue("'" + appComProFamilyGroupType0 + "' != '"
            + io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL + "'",
        appComProFamilyGroupType0.equals(
            io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL));
    org.junit.Assert.assertNotNull(viewClusterInfo1);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType2 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType2.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer3);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType5 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType5.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    org.junit.Assert.assertNotNull(applicationComProFamilyOptional8);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "v4.0.0" + "'", str11, "v4.0.0");
  }

  @Test
  public void test1178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1178");
    }
    akka.actor.ExtendedActorSystem extendedActorSystem0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument joinClusterRemoteInstrument1 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument(
        extendedActorSystem0);
    byte byte2 = joinClusterRemoteInstrument1.identifier();
    akka.actor.ActorRef actorRef3 = null;
    org.neo4j.graphdb.config.Setting<java.util.List<io.github.onograph.config.NodeGroupIdentifier>> nodeGroupIdentifierListSetting4 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCocdtvoryList;
    akka.actor.ActorRef actorRef5 = null;
    java.nio.ByteBuffer byteBuffer6 = null;
    joinClusterRemoteInstrument1.remoteWriteMetadata(actorRef3,
        (java.lang.Object) nodeGroupIdentifierListSetting4, actorRef5, byteBuffer6);
    akka.actor.ActorRef actorRef8 = null;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType9 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    akka.actor.ActorRef actorRef10 = null;
    java.nio.ByteBuffer byteBuffer11 = null;
    joinClusterRemoteInstrument1.remoteReadMetadata(actorRef8,
        (java.lang.Object) applicationComProFamilyType9, actorRef10, byteBuffer11);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType13 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    java.lang.String str14 = applicationComProFamilyType13.caerString();
    boolean boolean15 = applicationComProFamilyType9.isEq(
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType13);
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService syncableDataEncodingService16 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService(
          applicationComProFamilyType13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  13180ee2-37a5-4584-9bbe-ade94ff01ee8");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 8 + "'", byte2 != (byte) 8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierListSetting4);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType9 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType9.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType13 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType13.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "catchup_protocol" + "'", str14,
        "catchup_protocol");
    //org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test1179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1179");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    java.nio.file.Path path1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreElementFacade storeElementFacade4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreElementFacade(
        fileSystemAbstraction0, path1, (int) ' ', "Snappy");
  }

  @Test
  public void test1180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1180");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal uUIDSafeChannelMarshal0 = new io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal();
    java.util.UUID uUID1 = null;
    org.neo4j.io.fs.WritableChannel writableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl3 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel2);
    writableChecksumChannelImpl3.beginChecksum();
    try {
      uUIDSafeChannelMarshal0.marshal(uUID1,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1181");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType0 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_BAD_GDB_ERR;
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_BAD_GDB_ERR
        + "'", setupGdbSyncReplyStateType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_BAD_GDB_ERR));
  }

  @Test
  public void test1182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1182");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    consensusLogCacheServiceNLImpl0.trnt(1536L);
    consensusLogCacheServiceNLImpl0.prn((long) 1000);
  }

  @Test
  public void test1183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1183");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dataSyncRunnerStatsManager0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dataSyncRunnerStatsManager0.securityContext;
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test1184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1184");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper1 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.dumMetaWrapper(
        (org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId>) safeStateMarshalImpl0);
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper2 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.dumMetaWrapper(
        (org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId>) safeStateMarshalImpl0);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId3 = null;
    long long4 = safeStateMarshalImpl0.ordinal(consensusMemberGroupId3);
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper1);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper2);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
  }

  @Test
  public void test1185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1185");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotData requestSnapshotData1 = new io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotData(
        databaseId0);
  }

  @Test
  public void test1186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1186");
    }
    io.github.onograph.cluster.raft.netty.NettyNioSettings<io.netty.channel.socket.nio.NioServerSocketChannel> nioServerSocketChannelNettyNioSettings0 = io.github.onograph.cluster.raft.netty.NettyNioSettings.nrcoNettyNioSettings();
    org.junit.Assert.assertNotNull(nioServerSocketChannelNettyNioSettings0);
  }

  @Test
  public void test1187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1187");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry4 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray5 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry4};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction6 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction7 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 100, 1536L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction10 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray5, (long) (byte) 0, (int) (short) 1);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl11 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry12 = null;
    consensusLogCacheServiceNoopImpl11.putForCo(consensusLogEntry12, (long) '#');
    long long15 = consensusLogCacheServiceNoopImpl11.toabys();
    org.neo4j.logging.Log log16 = null;
    bulkAddAction10.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNoopImpl11,
        log16);
    consensusLogCacheServiceNoopImpl11.trnt((long) 128);
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
  }

  @Test
  public void test1188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1188");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.SyncableTransactionLogReader syncableTransactionLogReader2 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.SyncableTransactionLogReader(
        logEntryReader0, (long) 10);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager3 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    try {
      org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation4 = syncableTransactionLogReader2.reaPhysicalTransactionRepresentation(
          (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readablePositionAwareChecksumChannelManager3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test1189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1189");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService0 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq<io.github.onograph.cluster.raft.share.meta.fsm.EmptyReq> emptyReqFSMEmptyReq1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService2 = null;
    java.lang.Runnable runnable3 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage4 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl5 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable3, leasableMetaStateStorage4);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator7 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier8 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl9 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService2, syncableLeasableCoreNodeDataFSMImpl5, namedDatabaseId6,
        syncerator7, consensusNodeIdSupplier8);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl10 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl11 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ReplicatedTransactionFSM replicatedTransactionFSM12 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl13 = null;
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier15 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore> logicalTransactionStoreSupplier16 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair transactionLogIndexRepair17 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair(
        logProvider14, transactionIdStoreSupplier15, logicalTransactionStoreSupplier16);
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService18 = new io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService(
        emptyReqFSMEmptyReq1, syncableLeasableCoreNodeDataFSMImpl5, fSMTokenImpl10, fSMTokenImpl11,
        replicatedTransactionFSM12, fSMTokenImpl13, transactionLogIndexRepair17);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId19 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator20 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier21 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl22 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService0, syncableLeasableCoreNodeDataFSMImpl5, namedDatabaseId19,
        syncerator20, consensusNodeIdSupplier21);
  }

  @Test
  public void test1190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1190");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = consensusLogCacheServiceNLImpl0.getConsensusLogEntry(
        (long) 1);
    int int3 = consensusLogCacheServiceNLImpl0.elmtcu();
    consensusLogCacheServiceNLImpl0.enb();
    consensusLogCacheServiceNLImpl0.enb();
    consensusLogCacheServiceNLImpl0.trnt((long) (byte) 0);
    consensusLogCacheServiceNLImpl0.enb();
    org.junit.Assert.assertNull(consensusLogEntry2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
  }

  @Test
  public void test1191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1191");
    }
    io.github.onograph.cluster.raft.share.meta.ConsensusConfiguratorForRaft consensusConfiguratorForRaft0 = null;
    java.time.Clock clock1 = null;
    io.github.onograph.cluster.raft.id.CoreNodeServerIdentity coreNodeServerIdentity3 = null;
    org.neo4j.monitoring.Monitors monitors4 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    org.neo4j.io.state.SimpleStorage<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdSimpleStorage6 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService7 = null;
    java.util.function.Supplier<org.neo4j.graphdb.GraphDatabaseService> graphDatabaseServiceSupplier8 = null;
    io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl9 = new io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl(
        graphDatabaseServiceSupplier8);
    org.neo4j.function.ThrowingAction<java.lang.InterruptedException> interruptedExceptionThrowingAction10 = null;
    java.time.Duration duration11 = null;
    try {
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier consensusServiceSupplier12 = new io.github.onograph.cluster.raft.id.ConsensusServiceSupplier(
          consensusConfiguratorForRaft0, clock1, 100, coreNodeServerIdentity3, monitors4,
          namedDatabaseId5, consensusMemberGroupIdSimpleStorage6, coreClusterStructureService7,
          systemGraphDbmsModelClusterImpl9, interruptedExceptionThrowingAction10, duration11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1192");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    writableChecksumChannelImpl1.beginChecksum();
    writableChecksumChannelImpl1.beginChecksum();
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel5 = writableChecksumChannelImpl1.putInt(
          1016);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1193");
    }
    java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>> marshalChannelImplCMSRuleProcessorList0 = new java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>();
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSRuleProcessorJoiningImpl1 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>(
        (java.util.List<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>) marshalChannelImplCMSRuleProcessorList0);
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS2 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS3 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS[] marshalChannelImplCMSArray4 = new io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS[]{
        marshalChannelImplCMS2, marshalChannelImplCMS3};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSSet5 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>) marshalChannelImplCMSSet5,
        marshalChannelImplCMSArray4);
    java.util.Set<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSSet7 = marshalChannelImplCMSRuleProcessorJoiningImpl1.aplSet(
        (java.util.Set<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>) marshalChannelImplCMSSet5);
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols8 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    java.lang.String str9 = mutableProtocols8.getImpl();
    java.lang.String str10 = mutableProtocols8.getImpl();
    java.lang.String str11 = mutableProtocols8.caerString();
    boolean boolean12 = marshalChannelImplCMSRuleProcessorJoiningImpl1.equals(
        (java.lang.Object) str11);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS2);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS3);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSArray4);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSSet7);
    org.junit.Assert.assertTrue("'" + mutableProtocols8 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols8.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Snappy" + "'", str9, "Snappy");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Snappy" + "'", str10, "Snappy");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "type_comp" + "'", str11, "type_comp");
    //org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test1194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1194");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin1 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin2 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin3 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
  }

  @Test
  public void test1195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1195");
    }
    org.neo4j.graphdb.factory.module.GlobalModule globalModule0 = null;
    org.neo4j.ssl.config.SslPolicyLoader sslPolicyLoader1 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.ClusterCatchupNodeManager clusterCatchupNodeManager2 = io.github.onograph.cluster.raft.module.cuprot.ClusterCatchupNodeManager.fatyClusterCatchupNodeManager(
          globalModule0, sslPolicyLoader1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1196");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    writableChecksumChannelImpl1.beginChecksum();
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel4 = writableChecksumChannelImpl1.putDouble(
          (double) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1197");
    }
    io.github.onograph.cluster.raft.palapp.strategies.FollowerApproach followerApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.FollowerApproach();
    followerApproach0.setup();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional3 = followerApproach0.upesrfodaOptional(
          namedDatabaseId2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1198");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS();
    java.lang.Runnable runnable1 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl3 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable1, leasableMetaStateStorage2);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta4 = io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.INTL_LES_STAX;
    syncableLeasableCoreNodeDataFSMImpl3.inlspForLe(leasableMeta4);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta6 = syncableLeasableCoreNodeDataFSMImpl3.snpoLeasableMeta();
    io.netty.buffer.ByteBuf byteBuf7 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel8 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf7);
    defaultWritableChecksumChannel8.beginChecksum();
    try {
      marshalChannelImplCMS0.marshal(leasableMeta6,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(leasableMeta4);
    org.junit.Assert.assertNotNull(leasableMeta6);
  }

  @Test
  public void test1199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1199");
    }
    io.github.onograph.config.ClusterDiscoveryMode clusterDiscoveryMode0 = io.github.onograph.config.ClusterDiscoveryMode.K8S;
    org.junit.Assert.assertTrue(
        "'" + clusterDiscoveryMode0 + "' != '" + io.github.onograph.config.ClusterDiscoveryMode.K8S
            + "'",
        clusterDiscoveryMode0.equals(io.github.onograph.config.ClusterDiscoveryMode.K8S));
  }

  @Test
  public void test1200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1200");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException2 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper4 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId0, (java.lang.Throwable) clusterDatabaseManagementException2, operatorState3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException gdbStoreException6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException(
        (java.lang.Throwable) clusterDatabaseManagementException2, "cc-discovery-actor-system");
  }

  @Test
  public void test1201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1201");
    }
    io.github.onograph.cluster.raft.utils.ExceptionManager exceptionManager1 = new io.github.onograph.cluster.raft.utils.ExceptionManager(
        "designated_seeder");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        "store_version");
    exceptionManager1.addForTh((java.lang.Throwable) gdbStoreSyncCrlException3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException gdbIsoException5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException(
        (java.lang.Exception) gdbStoreSyncCrlException3);
    java.lang.Throwable[] throwableArray6 = gdbStoreSyncCrlException3.getSuppressed();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException7 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Throwable) gdbStoreSyncCrlException3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException gdbIsoException8 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException(
        (java.lang.Exception) gdbStoreSyncCrlException3);
    org.junit.Assert.assertNotNull(throwableArray6);
  }

  @Test
  public void test1202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1202");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager discoveryRetryManager2 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager(
        1L, (long) (byte) 100);
    java.util.function.Predicate<java.lang.String> strPredicate3 = io.github.onograph.cluster.raft.shared.AbstractClusterModule.fiwarfnfiPredicate();
    java.util.function.Supplier<java.lang.String> strSupplier4 = null;
    try {
      java.lang.String str5 = discoveryRetryManager2.apl(strPredicate3, strSupplier4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strPredicate3);
  }

  @Test
  public void test1203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1203");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.RC;
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.RC + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.RC));
  }

  @Test
  public void test1204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1204");
    }
    byte[] byteArray1 = new byte[]{(byte) 1};
    io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService chunkedInputEncodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService(
        byteArray1, true);
    long long4 = chunkedInputEncodingService3.length();
    long long5 = chunkedInputEncodingService3.progress();
    io.netty.buffer.ByteBufAllocator byteBufAllocator6 = null;
    try {
      io.netty.buffer.ByteBuf byteBuf7 = chunkedInputEncodingService3.readChunk(byteBufAllocator6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
  }

  @Test
  public void test1205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1205");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry4 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray5 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry4};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction6 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction7 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 100, 1536L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction10 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray5, (long) (byte) 0, (int) (short) 1);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl11 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry12 = null;
    consensusLogCacheServiceNoopImpl11.putForCo(consensusLogEntry12, (long) '#');
    long long15 = consensusLogCacheServiceNoopImpl11.toabys();
    org.neo4j.logging.Log log16 = null;
    bulkAddAction10.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNoopImpl11,
        log16);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray18 = bulkAddAction10.enrsConsensusLogEntryArray;
    long long19 = bulkAddAction10.baeid;
    io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions transactionLogActions20 = null;
    try {
      bulkAddAction10.dipcForTr(transactionLogActions20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    org.junit.Assert.assertNotNull(consensusLogEntryArray18);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
  }

  @Test
  public void test1206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1206");
    }
    org.neo4j.kernel.database.Database database0 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler requestStoreDatabaseIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler(
        database0, serverRef1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterInitMeta clusterInitMeta4 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterInitMeta.EMT_CLUSTER_INIT_META;
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder metaByteToMessageDecoder5 = new io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder();
    io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator6 = io.netty.handler.codec.ByteToMessageDecoder.COMPOSITE_CUMULATOR;
    metaByteToMessageDecoder5.setCumulator(cumulator6);
    boolean boolean8 = clusterInitMeta4.equals((java.lang.Object) cumulator6);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    boolean boolean10 = clusterInitMeta4.isCaboartForNa(namedDatabaseId9);
    try {
      requestStoreDatabaseIdInboundHandler2.channelRead(channelHandlerContext3,
          (java.lang.Object) boolean10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterInitMeta4);
    org.junit.Assert.assertNotNull(cumulator6);
    //org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test1207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1207");
    }
    java.util.function.Supplier<java.lang.Enum> enumSupplier0 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.MultiScHolder multiScHolder1 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder.muttioMultiScHolder(
        enumSupplier0);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType2 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_REL;
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolder scHolder3 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.MultiScHolder multiScHolder4 = multiScHolder1.adtetMultiScHolder(
        (java.lang.Enum) replicaTokenType2, scHolder3);
    try {
      io.github.onograph.cluster.raft.share.calg.scholder.ScHold scHold5 = multiScHolder1.nexScHold();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(multiScHolder1);
    org.junit.Assert.assertTrue("'" + replicaTokenType2 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_REL + "'",
        replicaTokenType2.equals(
            io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_REL));
    org.junit.Assert.assertNotNull(multiScHolder4);
  }

  @Test
  public void test1208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1208");
    }
    io.github.onograph.cluster.raft.control.connect.HandshakeEventHandler handshakeEventHandler0 = io.github.onograph.cluster.raft.control.connect.HandshakeEventHandler.NOO_HANDSHAKE_EVENT_HANDLER;
    io.netty.channel.Channel channel1 = null;
    handshakeEventHandler0.onnincnoForCh(channel1);
    org.junit.Assert.assertNotNull(handshakeEventHandler0);
  }

  @Test
  public void test1209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1209");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_GDB_GUID_ANSWER;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_GDB_GUID_ANSWER + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_GDB_GUID_ANSWER));
  }

  @Test
  public void test1210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1210");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingUstroBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test1211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1211");
    }
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId0 = null;
    org.neo4j.token.TokenRegistry tokenRegistry1 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator2 = null;
    org.neo4j.internal.id.IdGeneratorFactory idGeneratorFactory3 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.StorageEngine> storageEngineSupplier4 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer5 = null;
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder labelTokenHolder7 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder(
        namedDatabaseId0, tokenRegistry1, syncerator2, idGeneratorFactory3, storageEngineSupplier4,
        pageCacheTracer5, databaseReadOnlyChecker6);
    java.lang.String[] strArray14 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet15 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray14);
    java.util.List<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierList16 = io.github.onograph.config.NodeGroupIdentifier.litoList(
        strArray14);
    int[] intArray22 = new int[]{'4', 1015, (short) 10, 1, 1000};
    try {
      labelTokenHolder7.getOrCreateInternalIds(strArray14, intArray22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet15);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierList16);
    org.junit.Assert.assertNotNull(intArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[52, 1015, 10, 1, 1000]");
  }

  @Test
  public void test1212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1212");
    }
    java.lang.Runnable runnable0 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable0, leasableMetaStateStorage1);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta3 = io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.INTL_LES_STAX;
    syncableLeasableCoreNodeDataFSMImpl2.inlspForLe(leasableMeta3);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta5 = syncableLeasableCoreNodeDataFSMImpl2.snpoLeasableMeta();
    try {
      syncableLeasableCoreNodeDataFSMImpl2.fls();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(leasableMeta3);
    org.junit.Assert.assertNotNull(leasableMeta5);
  }

  @Test
  public void test1213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1213");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.Meta meta2 = io.github.onograph.cluster.raft.module.cuprot.current.info.Meta.craMeta(
        (long) (byte) 1, "designated_seeder");
    java.util.Optional<java.lang.String> strOptional3 = meta2.rectfaeOptional();
    org.junit.Assert.assertNotNull(meta2);
    org.junit.Assert.assertNotNull(strOptional3);
  }

  @Test
  public void test1214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1214");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder askMessageTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType2 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_ALL_GDB_GUID_ASK;
    io.netty.channel.ChannelPromise channelPromise3 = null;
    try {
      askMessageTypeMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) askMessageType2, channelPromise3);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertTrue("'" + askMessageType2 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_ALL_GDB_GUID_ASK + "'",
        askMessageType2.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_ALL_GDB_GUID_ASK));
  }

  @Test
  public void test1215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1215");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer discoveryGdbOperatorMetaWrapperJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer();
    boolean boolean1 = discoveryGdbOperatorMetaWrapperJSerializer0.includeManifest();
    boolean boolean2 = discoveryGdbOperatorMetaWrapperJSerializer0.includeManifest();
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType3 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup setup4 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
        catchupStatusType3);
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted> transactionChunkingCompletedOptional5 = setup4.repsOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted> transactionChunkingCompletedOptional6 = setup4.repsOptional();
    org.neo4j.kernel.database.DatabaseId databaseId7 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException9 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState10 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper11 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId7, (java.lang.Throwable) clusterDatabaseManagementException9, operatorState10);
    boolean boolean12 = setup4.equals((java.lang.Object) clusterDatabaseManagementException9);
    try {
      byte[] byteArray13 = discoveryGdbOperatorMetaWrapperJSerializer0.toBinary(
          (java.lang.Object) setup4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator$Setup cannot be cast to class io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper (io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator$Setup and io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper are in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(setup4);
    org.junit.Assert.assertNotNull(transactionChunkingCompletedOptional5);
    org.junit.Assert.assertNotNull(transactionChunkingCompletedOptional6);
    //org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test1216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1216");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager0);
    boolean boolean2 = dataSyncRunnerStatsManagerDataManagerFactory1.getIsCi();
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager3 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory4 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager3);
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager5 = dataSyncRunnerStatsManagerDataManagerFactory4.bul();
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory6 = dataSyncRunnerStatsManagerDataManagerFactory1.cobeDataManagerFactory(
          dataSyncRunnerStatsManagerDataManagerFactory4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalStateException; message: *** Error:  fae80bd1-b164-44c7-9864-eeb00641dab2");
    } catch (java.lang.IllegalStateException e) {
    }
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory1);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory4);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManager5);
  }

  @Test
  public void test1217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1217");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData4 = io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableSerializer.unahSyncableLeasableCoreNodeData(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
  }

  @Test
  public void test1218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1218");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyByteToMessageDecoder setupGdbStoreSyncReplyByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    setupGdbStoreSyncReplyByteToMessageDecoder0.handlerRemoved(channelHandlerContext1);
  }

  @Test
  public void test1219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1219");
    }
    java.time.Instant instant0 = null;
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        consensusNodeId2, false, 100L);
    boolean boolean6 = reply5.getIsGv();
    long long7 = reply5.getLgT();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply> replyArrivingMessageManager8 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager.ofConsensusMessageServiceMetaArrivingMessageManager(
        instant0, consensusMemberGroupId1, reply5);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId9 = replyArrivingMessageManager8.getConsensusMemberGroupId();
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.id.ConsensusNodeId> databaseIdMap10 = null;
    org.neo4j.dbms.identity.ServerId serverId11 = null;
    io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator consensusGdbServerCoordinator12 = io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator.ofConsensusGdbServerCoordinator(
        databaseIdMap10, serverId11);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry16 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray17 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry16};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction18 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray17);
    io.github.onograph.cluster.raft.module.cuprot.RefException refException19 = new io.github.onograph.cluster.raft.module.cuprot.RefException(
        "FollowerStates{}", (java.lang.Object[]) consensusLogEntryArray17);
    boolean boolean20 = consensusGdbServerCoordinator12.equals(
        (java.lang.Object) consensusLogEntryArray17);
    boolean boolean21 = replyArrivingMessageManager8.equals(
        (java.lang.Object) consensusLogEntryArray17);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    org.junit.Assert.assertNotNull(replyArrivingMessageManager8);
    org.junit.Assert.assertNull(consensusMemberGroupId9);
    org.junit.Assert.assertNotNull(consensusGdbServerCoordinator12);
    org.junit.Assert.assertNotNull(consensusLogEntryArray17);
    //org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    //org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test1220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1220");
    }
    java.lang.Exception exception0 = null;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData1 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        exception0);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta2 = io.github.onograph.cluster.raft.share.sync.SyncMeta.apldSyncMeta(
        fSMData1);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta3 = io.github.onograph.cluster.raft.share.sync.SyncMeta.apldSyncMeta(
        fSMData1);
    org.junit.Assert.assertNotNull(fSMData1);
    org.junit.Assert.assertNotNull(syncMeta2);
    org.junit.Assert.assertNotNull(syncMeta3);
  }

  @Test
  public void test1221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1221");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray3 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry2};
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId4 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask7 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(
        (long) 1016, (long) (short) 100, consensusLogEntryArray3, consensusNodeId4,
        (long) (byte) -1, 0L);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel8 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl9 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl10 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel8, safeStateMarshalImpl9);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk11 = null;
    java.lang.Void void12 = processorImpl10.process(bulkAsk11);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage13 = null;
    java.lang.Void void14 = processorImpl10.process(logClipRequestMessage13);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage15 = null;
    java.lang.Void void16 = processorImpl10.process(aliveReplyMessage15);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId17 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout18 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
        consensusNodeId17);
    java.lang.Void void19 = processorImpl10.process(consensusElectionTimeout18);
    try {
      java.lang.Void void20 = ask7.dipc(
          (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusLogEntryArray3);
    org.junit.Assert.assertNull(void12);
    org.junit.Assert.assertNull(void14);
    org.junit.Assert.assertNull(void16);
    org.junit.Assert.assertNull(void19);
  }

  @Test
  public void test1222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1222");
    }
    java.time.Clock clock0 = null;
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodesFactoryDefaultImpl consensusNodesFactoryDefaultImpl1 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodesFactoryDefaultImpl();
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray2 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet3 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet3,
        consensusNodeIdArray2);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodes<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdConsensusNodes5 = consensusNodesFactoryDefaultImpl1.bulConsensusNodes(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet3);
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy7 = null;
    org.neo4j.logging.LogProvider logProvider10 = null;
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog11 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long13 = inMemoryConsensusTransactionLog11.prn((long) 1536);
    long long15 = inMemoryConsensusTransactionLog11.redettm(0L);
    io.github.onograph.cluster.raft.share.sync.SyncToManager syncToManager16 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta> nodeServerMemberTransactionLogDataMetaStateStorage17 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService memberNodesService18 = new io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService(
          clock0,
          (io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodes.ConsensusNodesFactory<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodesFactoryDefaultImpl1,
          1015, consensusNodeIdLazy7, 1536L, (long) 128, logProvider10,
          (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry) inMemoryConsensusTransactionLog11,
          syncToManager16, nodeServerMemberTransactionLogDataMetaStateStorage17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusNodeIdArray2);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(consensusNodeIdConsensusNodes5);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1536L + "'", long13 == 1536L);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
  }

  @Test
  public void test1223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1223");
    }
    org.neo4j.memory.MemoryTracker memoryTracker0 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout1 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer clusterMemberSyncer2 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer(
        memoryTracker0, neo4jLayout1);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade4 = null;
    org.neo4j.logging.Log log5 = null;
    java.nio.file.Path path6 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo7 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path6);
    java.nio.file.Path path8 = clusterMetaTopologyInfo7.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat9 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv10 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction3, clusterSimpleStorageFacade4, log5, clusterMetaTopologyInfo7,
        clusterMetaFormat9);
    org.neo4j.logging.Log log11 = upgradeMetaEnv10.getLog();
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = upgradeMetaEnv10.getLscClusterMetaTopologyInfo();
    try {
      clusterMemberSyncer2.pefmseForUp(upgradeMetaEnv10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo7);
    org.junit.Assert.assertNull(path8);
    org.junit.Assert.assertNull(log11);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
  }

  @Test
  public void test1224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1224");
    }
    io.github.onograph.cluster.raft.share.meta.ConsensusConfiguratorForRaft consensusConfiguratorForRaft0 = null;
    java.time.Clock clock1 = null;
    io.github.onograph.cluster.raft.id.CoreNodeServerIdentity coreNodeServerIdentity3 = null;
    org.neo4j.monitoring.Monitors monitors4 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    org.neo4j.io.state.SimpleStorage<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdSimpleStorage6 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService7 = null;
    java.util.function.Supplier<org.neo4j.graphdb.GraphDatabaseService> graphDatabaseServiceSupplier8 = null;
    io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl9 = new io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl(
        graphDatabaseServiceSupplier8);
    org.neo4j.function.ThrowingAction<java.lang.InterruptedException> interruptedExceptionThrowingAction10 = null;
    java.time.Duration duration11 = null;
    try {
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier consensusServiceSupplier12 = new io.github.onograph.cluster.raft.id.ConsensusServiceSupplier(
          consensusConfiguratorForRaft0, clock1, (int) (byte) 8, coreNodeServerIdentity3, monitors4,
          namedDatabaseId5, consensusMemberGroupIdSimpleStorage6, coreClusterStructureService7,
          systemGraphDbmsModelClusterImpl9, interruptedExceptionThrowingAction10, duration11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1225");
    }
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta> loadBalanceServerMetaRuleProcessor1 = io.github.onograph.cluster.raft.gateway.gwlb.mods.RuleProcessorConfigurator.pasRuleProcessor(
          "cc-database-status-actor");
      org.junit.Assert.fail(
          "Expected exception of type io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException; message: *** Error: b0c41905-88ce-452e-b1e9-41bd0132b3d5");
    } catch (io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException e) {
    }
  }

  @Test
  public void test1226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1226");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker7 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo5);
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade9 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config1, fileSystemAbstraction2, logProvider3, clusterMetaTopologyInfo5, memoryTracker8);
    org.neo4j.logging.Log log10 = null;
    java.nio.file.Path path11 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path11);
    java.nio.file.Path path13 = clusterMetaTopologyInfo12.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker14 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo12);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat15 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv16 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade9, log10, clusterMetaTopologyInfo12,
        clusterMetaFormat15);
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction17 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule18 = null;
    org.neo4j.memory.MemoryTracker memoryTracker19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade21 = null;
    org.neo4j.logging.Log log22 = null;
    java.nio.file.Path path23 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo24 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path23);
    java.nio.file.Path path25 = clusterMetaTopologyInfo24.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat26 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv27 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction20, clusterSimpleStorageFacade21, log22, clusterMetaTopologyInfo24,
        clusterMetaFormat26);
    org.neo4j.logging.Log log28 = upgradeMetaEnv27.getLog();
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo29 = upgradeMetaEnv27.getLscClusterMetaTopologyInfo();
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier30 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper31 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder32 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade9, namedDatabaseIdFunction17, globalModule18, memoryTracker19,
        clusterMetaTopologyInfo29, nodeGroupIdentifierSetSupplier30, leaderGatekeeper31);
    org.neo4j.logging.internal.DatabaseLogProvider databaseLogProvider33 = null;
    try {
      org.neo4j.io.state.SimpleStorage<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdSimpleStorage35 = clusterSimpleStorageFacade9.crergrSimpleStorage(
          databaseLogProvider33, "overview");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
    org.junit.Assert.assertNull(path13);
    org.junit.Assert.assertNotNull(clusterMetaFormat15);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo24);
    org.junit.Assert.assertNull(path25);
    org.junit.Assert.assertNull(log28);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo29);
  }

  @Test
  public void test1227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1227");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry1 = null;
    consensusLogCacheServiceNoopImpl0.putForCo(consensusLogEntry1, (long) '#');
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry4 = null;
    consensusLogCacheServiceNoopImpl0.putForCo(consensusLogEntry4, (long) (byte) 9);
    consensusLogCacheServiceNoopImpl0.trnt((long) 1536);
  }

  @Test
  public void test1228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1228");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    boolean boolean1 = viewClusterInfo0.getIsCnegd();
    akka.cluster.Member member2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo3 = viewClusterInfo0.unresponsiveMember(
        member2);
    java.util.Set<akka.cluster.Member> memberSet4 = viewClusterInfo0.getSetUrahbMember();
    akka.cluster.Member member5 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo6 = viewClusterInfo0.ignoreMember(
        member5);
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    //org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(viewClusterInfo3);
    org.junit.Assert.assertNotNull(memberSet4);
    org.junit.Assert.assertNotNull(viewClusterInfo6);
  }

  @Test
  public void test1229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1229");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage5 = null;
    java.lang.Void void6 = processorImpl2.process(logClipRequestMessage5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage7 = null;
    java.lang.Void void8 = processorImpl2.process(aliveReplyMessage7);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId9 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId10 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier11 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray12 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier11};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet13 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet13,
        nodeGroupIdentifierArray12);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec15 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId9, consensusNodeId10,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet13);
    java.lang.Void void16 = processorImpl2.process(leaderRec15);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage17 = null;
    java.lang.Void void18 = processorImpl2.process(aliveReplyMessage17);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId19 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId20 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask24 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask(
        consensusNodeId19, consensusNodeId20, (long) 1016, (long) (byte) 10, (long) (short) -1);
    try {
      java.lang.Void void25 = processorImpl2.process(ask24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier11);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray12);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(void16);
    org.junit.Assert.assertNull(void18);
  }

  @Test
  public void test1230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1230");
    }
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsEnvironmentWrapper metricsEnvironmentWrapper4 = io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.craMetricsEnvironmentWrapperBuilderMetricsEnvironmentWrapper(
        false, (long) (byte) 100, log2, "temp-save");
    io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.StopwatchMetricsEnvironmentWrapper stopwatchMetricsEnvironmentWrapper5 = metricsEnvironmentWrapper4.timMetricsEnvironmentWrapperBuilderStopwatchMetricsEnvironmentWrapper();
    metricsEnvironmentWrapper4.colt((double) 1016);
    org.junit.Assert.assertNotNull(metricsEnvironmentWrapper4);
    org.junit.Assert.assertNotNull(stopwatchMetricsEnvironmentWrapper5);
  }

  @Test
  public void test1231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1231");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId0, storeId1, (long) 128, path3);
  }

  @Test
  public void test1232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1232");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.CoreGDMCWJSerializer coreGDMCWJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.CoreGDMCWJSerializer();
  }

  @Test
  public void test1233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1233");
    }
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta1 = marshalChannelImplCMS0.startState();
    long long2 = candidateTermMeta1.getLgT();
    long long3 = candidateTermMeta1.getLgT();
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(candidateTermMeta1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
  }

  @Test
  public void test1234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1234");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta(
          (long) 1015, syncableLeasableCoreNodeData1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1235");
    }
    io.github.onograph.cluster.raft.netty.NettyKQueueSettings<io.netty.channel.kqueue.KQueueServerSocketChannel> kQueueServerSocketChannelNettyKQueueSettings0 = io.github.onograph.cluster.raft.netty.NettyKQueueSettings.kqesecfNettyKQueueSettings();
    java.util.concurrent.Executor executor1 = null;
    io.netty.channel.EventLoopGroup eventLoopGroup2 = kQueueServerSocketChannelNettyKQueueSettings0.evnloguEventLoopGroup(
        executor1);
    java.lang.Class<io.netty.channel.kqueue.KQueueServerSocketChannel> kQueueServerSocketChannelClass3 = kQueueServerSocketChannelNettyKQueueSettings0.chnlcaClass();
    org.junit.Assert.assertNotNull(kQueueServerSocketChannelNettyKQueueSettings0);
    org.junit.Assert.assertNotNull(eventLoopGroup2);
    org.junit.Assert.assertNotNull(kQueueServerSocketChannelClass3);
  }

  @Test
  public void test1236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1236");
    }
    org.neo4j.storageengine.api.StorageCommand[] storageCommandArray0 = new org.neo4j.storageengine.api.StorageCommand[]{};
    java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand> storageCommandList1 = new java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1,
        storageCommandArray0);
    byte[] byteArray3 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1);
    byte[] byteArray4 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1);
    try {
      long long5 = io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogHeadWrapper.deelinfrthr(
          byteArray4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  30faf29a-d87a-4ce0-9772-7173a2b607df");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(storageCommandArray0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
  }

  @Test
  public void test1237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1237");
    }
    org.neo4j.storageengine.api.StorageCommand[] storageCommandArray0 = new org.neo4j.storageengine.api.StorageCommand[]{};
    java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand> storageCommandList1 = new java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1,
        storageCommandArray0);
    byte[] byteArray3 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1);
    byte[] byteArray4 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1);
    byte[] byteArray5 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1);
    org.junit.Assert.assertNotNull(storageCommandArray0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    org.junit.Assert.assertNotNull(byteArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
  }

  @Test
  public void test1238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1238");
    }
    io.github.onograph.cluster.raft.module.cuprot.IncomingEventService incomingEventService0 = io.github.onograph.cluster.raft.module.cuprot.IncomingEventService.NOO_INCOMING_EVENT_SERVICE;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    org.neo4j.storageengine.api.StoreId storeId2 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource5 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId1, storeId2, (long) (byte) 10, path4);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService6 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations7 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager8 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl9 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService6, leaderOperations7, namedServiceApproachManager8);
    boolean boolean10 = requestStoreResource5.equals(
        (java.lang.Object) socketAddressServiceLeaderImpl9);
    java.net.SocketAddress socketAddress11 = null;
    incomingEventService0.onccpromsForSoAb(
        (io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper) requestStoreResource5,
        socketAddress11);
    java.nio.file.Path path13 = requestStoreResource5.getPath();
    org.junit.Assert.assertNotNull(incomingEventService0);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNull(path13);
  }

  @Test
  public void test1239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1239");
    }
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation0 = null;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync3 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation0, databaseId1, 10L);
    io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor autoCloseableActionProcessor4 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer5 = null;
    try {
      abstractTransactionSync3.dipcForSy(autoCloseableActionProcessor4, fSMDataConsumer5, 10L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1240");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl(
          byteBuf0, (long) 3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1241");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_UNDET;
    org.junit.Assert.assertTrue("'" + askMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_UNDET + "'",
        askMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_UNDET));
  }

  @Test
  public void test1242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1242");
    }
    io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting clusterLoadBalancingServerPoliciesGroupSetting0 = new io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting();
  }

  @Test
  public void test1243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1243");
    }
    org.neo4j.graphdb.config.Setting<java.nio.file.Path> pathSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingKunnpPath;
    org.junit.Assert.assertNotNull(pathSetting0);
  }

  @Test
  public void test1244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1244");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta1 = marshalChannelImplCMS0.startState();
    boolean boolean3 = nodeServerMemberTransactionLogDataMeta1.isTrnt((long) '#');
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta4 = nodeServerMemberTransactionLogDataMeta1.neitcNodeServerMemberTransactionLogDataMeta();
    boolean boolean6 = nodeServerMemberTransactionLogDataMeta4.isTrnt(104L);
    long long7 = nodeServerMemberTransactionLogDataMeta4.getLgOdnl();
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta1);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta4);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
  }

  @Test
  public void test1245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1245");
    }
    io.netty.bootstrap.Bootstrap bootstrap0 = null;
    io.netty.channel.pool.ChannelPoolHandler channelPoolHandler1 = null;
    io.github.onograph.cluster.raft.netty.NettyChannelPoolBuilder nettyChannelPoolBuilder2 = null;
    io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl lBNettyChannelPoolMapImpl4 = new io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl(
        bootstrap0, channelPoolHandler1, nettyChannelPoolBuilder2, (int) (byte) 9);
    lBNettyChannelPoolMapImpl4.close();
    io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO consensusSocketAddressDTO6 = null;
    try {
      io.netty.channel.pool.ChannelPool channelPool7 = lBNettyChannelPoolMapImpl4.get(
          consensusSocketAddressDTO6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: key");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1246");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService0 = null;
    java.lang.Runnable runnable1 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl3 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable1, leasableMetaStateStorage2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId4 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator5 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl7 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService0, syncableLeasableCoreNodeDataFSMImpl3, namedDatabaseId4,
        syncerator5, consensusNodeIdSupplier6);
    try {
      long long8 = syncableLeasableCoreNodeDataFSMImpl3.laapdix();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1247");
    }
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier0 = io.github.onograph.config.NodeGroupIdentifierSetSupplier.EMT_NODE_GROUP_IDENTIFIER_SET_SUPPLIER;
  }

  @Test
  public void test1248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1248");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.dbms.identity.ServerId serverId1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper gdbServerIdWrapper2 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper(
        databaseId0, serverId1);
  }

  @Test
  public void test1249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1249");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet2 = null;
    org.neo4j.kernel.database.DatabaseId[] databaseIdArray3 = new org.neo4j.kernel.database.DatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId> databaseIdSet4 = new java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.DatabaseId>) databaseIdSet4,
        databaseIdArray3);
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl6 = new io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl(
        discoverySocketAddresses0, socketAddress1, nodeGroupIdentifierSet2,
        (java.util.Set<org.neo4j.kernel.database.DatabaseId>) databaseIdSet4);
    org.junit.Assert.assertNotNull(databaseIdArray3);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test1250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1250");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef0 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType1 = null;
    contentTypeRef0.exeForE(messageDataType1);
    org.neo4j.logging.LogProvider logProvider3 = null;
    io.github.onograph.cluster.raft.share.CommandReaderFactoryProvider commandReaderFactoryProvider4 = null;
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType> messageDataTypeRef5 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder consensusByteToMessageDecoder6 = new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider4, messageDataTypeRef5);
    boolean boolean7 = consensusByteToMessageDecoder6.isSingleDecode();
    java.util.function.Supplier<io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataByteToMessageDecoder> syncableDataByteToMessageDecoderSupplier8 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.MessageRequestCIHAManager messageRequestCIHAManager9 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageRequestCIHAManager(
          (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0,
          logProvider3, consensusByteToMessageDecoder6, syncableDataByteToMessageDecoderSupplier8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test1251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1251");
    }
    io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta candidateTallyMeta0 = new io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder1 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder();
    io.github.onograph.cluster.raft.share.sync.SyncStatus syncStatus2 = new io.github.onograph.cluster.raft.share.sync.SyncStatus();
    boolean boolean3 = messageDataTypeMessageToByteEncoder1.acceptOutboundMessage(
        (java.lang.Object) syncStatus2);
    syncStatus2.awrcn((long) (byte) 1);
    boolean boolean6 = syncStatus2.getIsRi();
    boolean boolean7 = candidateTallyMeta0.equals((java.lang.Object) syncStatus2);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId8 = null;
    boolean boolean10 = candidateTallyMeta0.isUpaForCo(consensusNodeId8, 0L);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId11 = null;
    boolean boolean13 = candidateTallyMeta0.isUpaForCo(consensusNodeId11, (long) (byte) 6);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    //org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    //org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test1252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1252");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier2 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray3 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier2};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet4 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet4,
        nodeGroupIdentifierArray3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec6 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId0, consensusNodeId1,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet4);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId7 = leaderRec6.getPooeConsensusNodeId();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId8 = leaderRec6.getPooeConsensusNodeId();
    java.lang.Object obj9 = null;
    boolean boolean10 = leaderRec6.equals(obj9);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier2);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray3);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNull(consensusNodeId7);
    org.junit.Assert.assertNull(consensusNodeId8);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test1253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1253");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper comProFamilyWrapper1 = null;
    io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started started2 = new io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started(
        socketAddress0, comProFamilyWrapper1);
    org.neo4j.configuration.helpers.SocketAddress socketAddress3 = started2.adeidSocketAddress;
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper comProFamilyWrapper4 = started2.prtostkComProFamilyWrapper;
    org.junit.Assert.assertNull(socketAddress3);
    org.junit.Assert.assertNull(comProFamilyWrapper4);
  }

  @Test
  public void test1254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1254");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemMessageToByteEncoder catchupProblemMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemMessageToByteEncoder();
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType2 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper socketAddressWrapper3 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
        socketAddress1, socketAddressSchemeType2);
    boolean boolean4 = catchupProblemMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) socketAddressWrapper3);
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder> transactionLogSyncManagerBuilderConsensusNodeFollowersMeta5 = new io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>();
    java.lang.String str6 = transactionLogSyncManagerBuilderConsensusNodeFollowersMeta5.toString();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction7 = null;
    org.neo4j.logging.LogProvider logProvider8 = null;
    org.neo4j.memory.MemoryTracker memoryTracker9 = null;
    org.neo4j.io.pagecache.PageCache pageCache10 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = null;
    io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder transactionLogSyncManagerBuilder12 = new io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder(
        fileSystemAbstraction7, logProvider8, memoryTracker9, pageCache10, pageCacheTracer11);
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta consensusNodeFollowerMeta13 = transactionLogSyncManagerBuilderConsensusNodeFollowersMeta5.getConsensusNodeFollowerMeta(
        transactionLogSyncManagerBuilder12);
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta consensusNodeFollowerMeta15 = consensusNodeFollowerMeta13.onscresConsensusNodeFollowerMeta(
        (long) (short) 1);
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta consensusNodeFollowerMeta17 = consensusNodeFollowerMeta15.onscresConsensusNodeFollowerMeta(
        (long) 128);
    boolean boolean18 = socketAddressWrapper3.equals(
        (java.lang.Object) consensusNodeFollowerMeta17);
    org.junit.Assert.assertTrue("'" + socketAddressSchemeType2 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt
        + "'", socketAddressSchemeType2.equals(
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt));
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FollowerStates{}" + "'", str6,
        "FollowerStates{}");
    org.junit.Assert.assertNotNull(consensusNodeFollowerMeta13);
    org.junit.Assert.assertNotNull(consensusNodeFollowerMeta15);
    org.junit.Assert.assertNotNull(consensusNodeFollowerMeta17);
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test1255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1255");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager2 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager2.beginChecksum();
    org.neo4j.io.fs.ReadableChannel readableChannel4 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl5 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel4);
    readableClosablePositionAwareChecksumChannelPassThruImpl5.beginChecksum();
    readablePositionAwareChecksumChannelManager2.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl5);
    readablePositionAwareChecksumChannelManager0.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl5);
    try {
      short short9 = readablePositionAwareChecksumChannelManager0.getShort();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1256");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin1 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin2 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    java.lang.String str3 = clusteringBalancerServiceImpl0.plgneString();
    boolean boolean4 = clusteringBalancerServiceImpl0.isSfgpi();
    org.neo4j.graphdb.config.Configuration configuration5 = null;
    org.neo4j.logging.Log log6 = null;
    clusteringBalancerServiceImpl0.vaitForCoLo(configuration5, log6);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService8 = null;
    io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader clusterLeader9 = null;
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.configuration.Config config11 = null;
    try {
      clusteringBalancerServiceImpl0.iniForClClLoCo(clusterStructureService8, clusterLeader9,
          logProvider10, config11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "server_policies" + "'", str3,
        "server_policies");
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test1257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1257");
    }
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaJobEventService readReplicaJobEventService0 = null;
    org.neo4j.logging.Log log3 = null;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaTransactionBlockProcessor readReplicaTransactionBlockProcessor4 = null;
    io.github.onograph.cluster.raft.readreplica.tx.TxCancelable txCancelable5 = null;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask readReplicaGetChangesTask6 = new io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask(
        readReplicaJobEventService0, (long) 1016, (long) 1016, log3,
        readReplicaTransactionBlockProcessor4, txCancelable5);
    java.util.List<java.lang.String> strList7 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta authMeta8 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta(
        strList7);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted> transactionChunkingCompletedCompletableFuture9 = null;
    try {
      readReplicaGetChangesTask6.ongmarseForCoAu(authMeta8,
          transactionChunkingCompletedCompletableFuture9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1258");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper0 = null;
    io.github.onograph.cluster.raft.share.meta.pit.ConsensusMembershipState consensusMembershipState1 = new io.github.onograph.cluster.raft.share.meta.pit.ConsensusMembershipState(
        memberIndexWrapper0);
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper2 = consensusMembershipState1.getCmitdMemberIndexWrapper();
    org.junit.Assert.assertNull(memberIndexWrapper2);
  }

  @Test
  public void test1259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1259");
    }
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting leaderNodeGroupSetting1 = new io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting(
        "backup-server");
  }

  @Test
  public void test1260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1260");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.strvstfi();
    connector0.strvstfiForSt("policy");
    connector0.str();
    connector0.strvstfiForSt(
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S");
  }

  @Test
  public void test1261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1261");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper1 = io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper.unnnDiscoveryGdbOperatorMetaWrapper(
        databaseId0);
    org.neo4j.kernel.database.DatabaseId databaseId2 = discoveryGdbOperatorMetaWrapper1.getDatabaseId();
    java.lang.Object obj3 = null;
    boolean boolean4 = discoveryGdbOperatorMetaWrapper1.equals(obj3);
    org.junit.Assert.assertNotNull(discoveryGdbOperatorMetaWrapper1);
    org.junit.Assert.assertNull(databaseId2);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1262");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    java.lang.String str1 = applicationComProFamilyType0.caerString();
    java.lang.String str2 = applicationComProFamilyType0.caerString();
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "catchup_protocol" + "'", str1,
        "catchup_protocol");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "catchup_protocol" + "'", str2,
        "catchup_protocol");
  }

  @Test
  public void test1263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1263");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REQ));
  }

  @Test
  public void test1264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1264");
    }
    java.lang.Class<io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource> requestStoreResourceClass0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef2 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.exhandlers.GdbMissingHandler<io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource> requestStoreResourceGdbMissingHandler3 = new io.github.onograph.cluster.raft.module.cuprot.exhandlers.GdbMissingHandler<io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource>(
          requestStoreResourceClass0, logProvider1, serverRef2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1265");
    }
    io.netty.bootstrap.Bootstrap bootstrap0 = null;
    io.netty.channel.pool.ChannelPoolHandler channelPoolHandler1 = null;
    io.github.onograph.cluster.raft.netty.NettyChannelPoolBuilder nettyChannelPoolBuilder2 = null;
    io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl lBNettyChannelPoolMapImpl4 = new io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl(
        bootstrap0, channelPoolHandler1, nettyChannelPoolBuilder2, 128);
  }

  @Test
  public void test1266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1266");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl4 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition5 = readableClosablePositionAwareChecksumChannelPassThruImpl4.getCurrentPosition();
    byte[] byteArray10 = new byte[]{(byte) 6, (byte) 8, (byte) 8, (byte) 9};
    try {
      readableClosablePositionAwareChecksumChannelPassThruImpl4.get(byteArray10, 3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
    org.junit.Assert.assertNotNull(logPosition5);
    org.junit.Assert.assertNotNull(byteArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[6, 8, 8, 9]");
  }

  @Test
  public void test1267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1267");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingLersebfDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test1268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1268");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper1 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.dumMetaWrapper(
        (org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId>) safeStateMarshalImpl0);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId2 = safeStateMarshalImpl0.startState();
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager3 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl4 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager3);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager5 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager5.beginChecksum();
    org.neo4j.io.fs.ReadableChannel readableChannel7 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl8 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel7);
    readableClosablePositionAwareChecksumChannelPassThruImpl8.beginChecksum();
    readablePositionAwareChecksumChannelManager5.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl8);
    readablePositionAwareChecksumChannelManager3.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl8);
    try {
      io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId12 = safeStateMarshalImpl0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper1);
    org.junit.Assert.assertNull(consensusMemberGroupId2);
  }

  @Test
  public void test1269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1269");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager consensusTransactionLogMetaLRUCacheManager1 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager(
        (int) (byte) 1);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager4 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel5 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl6 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel5);
    readablePositionAwareChecksumChannelManager4.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl6);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition8 = readablePositionAwareChecksumChannelManager4.getCurrentPosition();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo consensusTransactionLogInfo9 = consensusTransactionLogMetaLRUCacheManager1.cahmedaConsensusTransactionLogMetaLRUCacheManagerConsensusTransactionLogInfo(
        (long) (byte) 9, 1L, logPosition8);
    io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal syncableDataChannelMarshal10 = new io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal();
    boolean boolean11 = consensusTransactionLogInfo9.equals(
        (java.lang.Object) syncableDataChannelMarshal10);
    org.neo4j.kernel.database.DatabaseId databaseId12 = null;
    org.neo4j.storageengine.api.StoreId storeId13 = null;
    java.nio.file.Path path15 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource16 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId12, storeId13, (long) (byte) 10, path15);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService17 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations18 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager19 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl20 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService17, leaderOperations18, namedServiceApproachManager19);
    boolean boolean21 = requestStoreResource16.equals(
        (java.lang.Object) socketAddressServiceLeaderImpl20);
    org.neo4j.storageengine.api.StoreId storeId22 = requestStoreResource16.getEpceStoreId();
    org.neo4j.kernel.database.DatabaseId databaseId23 = requestStoreResource16.getDatabaseId();
    java.nio.file.Path path24 = requestStoreResource16.getPath();
    boolean boolean25 = consensusTransactionLogInfo9.equals((java.lang.Object) path24);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId26 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId27 = null;
    java.time.Duration duration28 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId setupConsensusDatabaseId29 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId(
        consensusMemberGroupId26, consensusNodeId27, duration28);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType30 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_PROP;
    boolean boolean31 = setupConsensusDatabaseId29.equals((java.lang.Object) replicaTokenType30);
    boolean boolean32 = consensusTransactionLogInfo9.equals(
        (java.lang.Object) setupConsensusDatabaseId29);
    org.junit.Assert.assertNotNull(logPosition8);
    org.junit.Assert.assertNotNull(consensusTransactionLogInfo9);
    //org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    //org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNull(storeId22);
    org.junit.Assert.assertNull(databaseId23);
    org.junit.Assert.assertNull(path24);
    //org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + replicaTokenType30 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_PROP + "'",
        replicaTokenType30.equals(
            io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_PROP));
    //org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    //org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
  }

  @Test
  public void test1270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1270");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq.DefaultSDEmptyReqSafeChannelMarshal defaultSDEmptyReqSafeChannelMarshal0 = io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq.DefaultSDEmptyReqSafeChannelMarshal.IT;
    org.junit.Assert.assertNotNull(defaultSDEmptyReqSafeChannelMarshal0);
  }

  @Test
  public void test1271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1271");
    }
    io.github.onograph.RingQueue<io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta> syncedLeaderMetaRingQueue1 = new io.github.onograph.RingQueue<io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta>(
        (int) (short) 1);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta2 = syncedLeaderMetaRingQueue1.reo();
    org.junit.Assert.assertNull(syncedLeaderMeta2);
  }

  @Test
  public void test1272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1272");
    }
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray0 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList1 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1,
        socketAddressArray0);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService3 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService4 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1);
    boolean boolean5 = memberNodeService4.isUsord();
    boolean boolean6 = memberNodeService4.isRevoevjoat();
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl actorLifecycleApproachDefaultImpl7 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl(
        memberNodeService4);
    org.junit.Assert.assertNotNull(socketAddressArray0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(memberNodeService3);
    org.junit.Assert.assertNotNull(memberNodeService4);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test1273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1273");
    }
    java.util.function.Supplier<java.lang.Enum> enumSupplier0 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.MultiScHolder multiScHolder1 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder.muttioMultiScHolder(
        enumSupplier0);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType2 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_REL;
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolder scHolder3 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.MultiScHolder multiScHolder4 = multiScHolder1.adtetMultiScHolder(
        (java.lang.Enum) replicaTokenType2, scHolder3);
    try {
      io.github.onograph.cluster.raft.share.calg.scholder.ScHold scHold5 = multiScHolder4.nexScHold();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(multiScHolder1);
    org.junit.Assert.assertTrue("'" + replicaTokenType2 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_REL + "'",
        replicaTokenType2.equals(
            io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_REL));
    org.junit.Assert.assertNotNull(multiScHolder4);
  }

  @Test
  public void test1274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1274");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = consensusLogCacheServiceNLImpl0.getConsensusLogEntry(
        (long) 1);
    int int3 = consensusLogCacheServiceNLImpl0.elmtcu();
    consensusLogCacheServiceNLImpl0.enb();
    consensusLogCacheServiceNLImpl0.trnt(100L);
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy7 = null;
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog8 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long10 = inMemoryConsensusTransactionLog8.prn((long) 1536);
    long long11 = inMemoryConsensusTransactionLog8.prvid();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor consensusLogEntryRawCursor13 = inMemoryConsensusTransactionLog8.geercuoConsensusLogEntryRawCursor(
        (long) (-1));
    org.neo4j.logging.LogProvider logProvider14 = null;
    io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes memberNodes15 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta> candidateTermMetaStateStorage16 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta> candidateTallyMetaStateStorage17 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdTransferCollection18 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.meta.ConsensusMeta consensusMeta19 = new io.github.onograph.cluster.raft.share.calg.meta.ConsensusMeta(
          (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNLImpl0,
          consensusNodeIdLazy7,
          (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog) inMemoryConsensusTransactionLog8,
          logProvider14, memberNodes15, candidateTermMetaStateStorage16,
          candidateTallyMetaStateStorage17, consensusNodeIdTransferCollection18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(consensusLogEntry2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1536L + "'", long10 == 1536L);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1536L + "'", long11 == 1536L);
    org.junit.Assert.assertNotNull(consensusLogEntryRawCursor13);
  }

  @Test
  public void test1275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1275");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    org.neo4j.logging.Log log3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler4 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler5 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl6 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler7 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler5, refCatchupManagerImpl6);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler8 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler4, refCatchupManagerImpl6);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler9 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler2, log3, refCatchupManagerImpl6);
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler catchupIncomingTransactionReplySimpleChannelInboundHandler10 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl6);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler11 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl6);
    boolean boolean12 = catchupProblemInboundHandler11.isSharable();
    //org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test1276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1276");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker7 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo5);
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade9 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config1, fileSystemAbstraction2, logProvider3, clusterMetaTopologyInfo5, memoryTracker8);
    org.neo4j.logging.Log log10 = null;
    java.nio.file.Path path11 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path11);
    java.nio.file.Path path13 = clusterMetaTopologyInfo12.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker14 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo12);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat15 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv16 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade9, log10, clusterMetaTopologyInfo12,
        clusterMetaFormat15);
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction17 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule18 = null;
    org.neo4j.memory.MemoryTracker memoryTracker19 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade21 = null;
    org.neo4j.logging.Log log22 = null;
    java.nio.file.Path path23 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo24 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path23);
    java.nio.file.Path path25 = clusterMetaTopologyInfo24.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat26 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv27 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction20, clusterSimpleStorageFacade21, log22, clusterMetaTopologyInfo24,
        clusterMetaFormat26);
    org.neo4j.logging.Log log28 = upgradeMetaEnv27.getLog();
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo29 = upgradeMetaEnv27.getLscClusterMetaTopologyInfo();
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier30 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper31 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder32 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade9, namedDatabaseIdFunction17, globalModule18, memoryTracker19,
        clusterMetaTopologyInfo29, nodeGroupIdentifierSetSupplier30, leaderGatekeeper31);
    org.neo4j.configuration.helpers.DbmsReadOnlyChecker dbmsReadOnlyChecker33 = null;
    io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer infoReplyMessageConsumer34 = new io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer();
    org.neo4j.logging.internal.DatabaseLogService databaseLogService35 = null;
    org.neo4j.collection.Dependencies dependencies36 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy37 = null;
    org.neo4j.kernel.lifecycle.LifeSupport lifeSupport38 = null;
    io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal syncableDataChannelMarshal39 = new io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal();
    org.neo4j.monitoring.Monitors monitors40 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId41 = null;
    io.github.onograph.cluster.raft.akkamsg.OutDirection<io.github.onograph.cluster.raft.id.ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> consensusNodeIdOutDirection42 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapper consensusNodeGroupWrapper43 = consensusNodeGroupWrapperBuilder32.craConsensusNodeGroupWrapper(
          dbmsReadOnlyChecker33,
          (java.util.function.Consumer<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>) infoReplyMessageConsumer34,
          databaseLogService35, dependencies36, consensusNodeIdLazy37, lifeSupport38,
          syncableDataChannelMarshal39, monitors40, namedDatabaseId41,
          consensusNodeIdOutDirection42);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
    org.junit.Assert.assertNull(path13);
    org.junit.Assert.assertNotNull(clusterMetaFormat15);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo24);
    org.junit.Assert.assertNull(path25);
    org.junit.Assert.assertNull(log28);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo29);
  }

  @Test
  public void test1277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1277");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType arteryRemotingType0 = io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TCP;
    org.junit.Assert.assertTrue("'" + arteryRemotingType0 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TCP
        + "'", arteryRemotingType0.equals(
        io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TCP));
  }

  @Test
  public void test1278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1278");
    }
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder snapshotDataMessageToByteEncoder0 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder();
    org.neo4j.kernel.KernelVersion kernelVersion1 = null;
    org.neo4j.storageengine.api.StoreId storeId2 = null;
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation3 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply4 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply(
        kernelVersion1, storeId2, committedTransactionRepresentation3);
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation5 = catchupOutgoingTransactionPullReply4.getTCommittedTransactionRepresentation();
    org.neo4j.kernel.KernelVersion kernelVersion6 = catchupOutgoingTransactionPullReply4.getKernelVersion();
    boolean boolean7 = snapshotDataMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) kernelVersion6);
    java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>> marshalChannelImplCMSRuleProcessorList8 = new java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>();
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSRuleProcessorJoiningImpl9 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>(
        (java.util.List<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>) marshalChannelImplCMSRuleProcessorList8);
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS10 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS11 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS[] marshalChannelImplCMSArray12 = new io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS[]{
        marshalChannelImplCMS10, marshalChannelImplCMS11};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSSet13 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>) marshalChannelImplCMSSet13,
        marshalChannelImplCMSArray12);
    java.util.Set<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSSet15 = marshalChannelImplCMSRuleProcessorJoiningImpl9.aplSet(
        (java.util.Set<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>) marshalChannelImplCMSSet13);
    boolean boolean16 = snapshotDataMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) marshalChannelImplCMSSet13);
    org.junit.Assert.assertNull(committedTransactionRepresentation5);
    org.junit.Assert.assertNull(kernelVersion6);
    //org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS10);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS11);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSArray12);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSSet15);
    //org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test1279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1279");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl clusterDiscoveryManagerAkkaImpl0 = new io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl();
    java.time.Clock clock1 = null;
    org.neo4j.configuration.Config config2 = null;
    io.github.onograph.cluster.raft.id.CoreNodeServerIdentity coreNodeServerIdentity3 = null;
    io.github.onograph.dbms.crash.CrashSignaler crashSignaler4 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService5 = null;
    java.nio.file.Path path6 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo7 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path6);
    java.nio.file.Path path8 = clusterMetaTopologyInfo7.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker9 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo7);
    io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager discoveryRetryManager12 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager(
        (long) (byte) 9, (long) (short) 100);
    org.neo4j.scheduler.JobScheduler jobScheduler13 = null;
    org.neo4j.logging.LogProvider logProvider14 = null;
    org.neo4j.logging.LogProvider logProvider15 = null;
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray16 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList17 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList17,
        socketAddressArray16);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService19 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList17);
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl actorLifecycleApproachDefaultImpl20 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl(
        memberNodeService19);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService pointInTimeBackupService22 = null;
    org.neo4j.ssl.config.SslPolicyLoader sslPolicyLoader23 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService24 = clusterDiscoveryManagerAkkaImpl0.cotogsvCoreClusterStructureService(
          clock1, config2, coreNodeServerIdentity3, crashSignaler4, databaseStateService5,
          (io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker) defaultDiscoveryInitialProcChecker9,
          discoveryRetryManager12, jobScheduler13, logProvider14, logProvider15,
          memberNodeService19, monitors21, pointInTimeBackupService22, sslPolicyLoader23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo7);
    org.junit.Assert.assertNull(path8);
    org.junit.Assert.assertNotNull(socketAddressArray16);
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(memberNodeService19);
  }

  @Test
  public void test1280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1280");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl writableChecksumChannelStandardImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl(
          byteBuf0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1281");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncCompletedMessageToByteEncoder storeSyncCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncCompletedMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise3 = null;
    try {
      storeSyncCompletedMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) "store_random_id", channelPromise3);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
  }

  @Test
  public void test1282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1282");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef0 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType1 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef0.exeForE(messageDataType1);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService4 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter messageDataTypeChannelInboundHandlerAdapter5 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    org.junit.Assert.assertTrue("'" + messageDataType1 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType1.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
  }

  @Test
  public void test1283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1283");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dataSyncRunnerStatsManager0.securityContext = securityContext1;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = null;
    dataSyncRunnerStatsManager0.securityContext = securityContext3;
  }

  @Test
  public void test1284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1284");
    }
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType consensusNodeType0 = io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType.CNT_NODE_FOLLOWER;
    org.junit.Assert.assertTrue("'" + consensusNodeType0 + "' != '"
            + io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType.CNT_NODE_FOLLOWER + "'",
        consensusNodeType0.equals(
            io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType.CNT_NODE_FOLLOWER));
  }

  @Test
  public void test1285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1285");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    java.lang.String str1 = applicationComProFamilyType0.caerString();
    io.github.onograph.cluster.raft.control.ApplicationComProFamily[] applicationComProFamilyArray2 = new io.github.onograph.cluster.raft.control.ApplicationComProFamily[]{
        applicationComProFamilyType0};
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup3 = null;
    io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper applicationCurrentActiveComProFamilyWrapper4 = io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
        applicationComProFamilyComProFamilyGroup3);
    io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl comProFamilyManagerAppImpl5 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl(
        applicationComProFamilyArray2, applicationCurrentActiveComProFamilyWrapper4);
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup6 = null;
    io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper applicationCurrentActiveComProFamilyWrapper7 = io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
        applicationComProFamilyComProFamilyGroup6);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType8 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer9 = applicationComProFamilyType8.getImpl();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType10 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer11 = applicationComProFamilyType10.getImpl();
    int int12 = entProVer9.compareTo(entProVer11);
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo13 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType14 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer15 = applicationComProFamilyType14.getImpl();
    boolean boolean16 = viewClusterInfo13.equals((java.lang.Object) entProVer15);
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo17 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType18 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer19 = applicationComProFamilyType18.getImpl();
    boolean boolean20 = viewClusterInfo17.equals((java.lang.Object) entProVer19);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType21 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer22 = applicationComProFamilyType21.getImpl();
    int int23 = entProVer19.compareTo(entProVer22);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType24 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer25 = applicationComProFamilyType24.getImpl();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType26 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer27 = applicationComProFamilyType26.getImpl();
    int int28 = entProVer25.compareTo(entProVer27);
    io.github.onograph.config.EntProVer[] entProVerArray29 = new io.github.onograph.config.EntProVer[]{
        entProVer11, entProVer15, entProVer22, entProVer25};
    java.util.LinkedHashSet<io.github.onograph.config.EntProVer> entProVerSet30 = new java.util.LinkedHashSet<io.github.onograph.config.EntProVer>();
    boolean boolean31 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.EntProVer>) entProVerSet30,
        entProVerArray29);
    java.util.Set<io.github.onograph.config.EntProVer> entProVerSet32 = applicationCurrentActiveComProFamilyWrapper7.mulspevsfSet(
        (java.util.Set<io.github.onograph.config.EntProVer>) entProVerSet30);
    java.util.Set<io.github.onograph.config.EntProVer> entProVerSet33 = applicationCurrentActiveComProFamilyWrapper4.mulspevsfSet(
        (java.util.Set<io.github.onograph.config.EntProVer>) entProVerSet30);
    java.util.List<io.github.onograph.config.EntProVer> entProVerList34 = applicationCurrentActiveComProFamilyWrapper4.getListVrinU();
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "catchup_protocol" + "'", str1,
        "catchup_protocol");
    org.junit.Assert.assertNotNull(applicationComProFamilyArray2);
    org.junit.Assert.assertNotNull(applicationCurrentActiveComProFamilyWrapper4);
    org.junit.Assert.assertNotNull(applicationCurrentActiveComProFamilyWrapper7);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType8 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType8.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer9);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType10 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType10.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer11);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    org.junit.Assert.assertNotNull(viewClusterInfo13);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType14 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType14.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer15);
    //org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(viewClusterInfo17);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType18 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType18.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer19);
    //org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType21 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType21.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer22);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType24 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType24.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer25);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType26 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType26.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer27);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    org.junit.Assert.assertNotNull(entProVerArray29);
    //org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNotNull(entProVerSet32);
    org.junit.Assert.assertNotNull(entProVerSet33);
    org.junit.Assert.assertNotNull(entProVerList34);
  }

  @Test
  public void test1286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1286");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure startFailure1 = new io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure(
        "RequestGdbId for ");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException2 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Throwable) startFailure1);
  }

  @Test
  public void test1287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1287");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer1 = applicationComProFamilyType0.getImpl();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType2 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer3 = applicationComProFamilyType2.getImpl();
    int int4 = entProVer1.compareTo(entProVer3);
    int int5 = entProVer3.getIMjr();
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer1);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType2 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType2.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
  }

  @Test
  public void test1288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1288");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat0 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.nio.file.Path path5 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo6 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path5);
    java.nio.file.Path path7 = clusterMetaTopologyInfo6.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker8 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo6);
    org.neo4j.memory.MemoryTracker memoryTracker9 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade10 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config2, fileSystemAbstraction3, logProvider4, clusterMetaTopologyInfo6, memoryTracker9);
    org.neo4j.logging.Log log11 = null;
    java.nio.file.Path path12 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo13 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path12);
    java.nio.file.Path path14 = clusterMetaTopologyInfo13.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker15 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo13);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat16 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv17 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction1, clusterSimpleStorageFacade10, log11, clusterMetaTopologyInfo13,
        clusterMetaFormat16);
    boolean boolean18 = clusterMetaFormat0.isLortaForCl(clusterMetaFormat16);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat19 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction20 = null;
    org.neo4j.configuration.Config config21 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction22 = null;
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.nio.file.Path path24 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo25 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path24);
    java.nio.file.Path path26 = clusterMetaTopologyInfo25.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker27 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo25);
    org.neo4j.memory.MemoryTracker memoryTracker28 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade29 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config21, fileSystemAbstraction22, logProvider23, clusterMetaTopologyInfo25,
        memoryTracker28);
    org.neo4j.logging.Log log30 = null;
    java.nio.file.Path path31 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo32 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path31);
    java.nio.file.Path path33 = clusterMetaTopologyInfo32.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker34 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo32);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat35 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv36 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction20, clusterSimpleStorageFacade29, log30, clusterMetaTopologyInfo32,
        clusterMetaFormat35);
    boolean boolean37 = clusterMetaFormat19.isLortaForCl(clusterMetaFormat35);
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler38 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl39 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler40 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler38, refCatchupManagerImpl39);
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting41 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingJoapoDuration;
    boolean boolean42 = transactionChunkingCompletedInboundHandler40.acceptInboundMessage(
        (java.lang.Object) durationSetting41);
    boolean boolean43 = clusterMetaFormat19.equals(
        (java.lang.Object) transactionChunkingCompletedInboundHandler40);
    boolean boolean44 = clusterMetaFormat0.isMabmttForCl(clusterMetaFormat19);
    int int45 = clusterMetaFormat19.getIMjr();
    int int46 = clusterMetaFormat19.getIMnr();
    java.lang.Object obj47 = null;
    boolean boolean48 = clusterMetaFormat19.equals(obj47);
    org.junit.Assert.assertNotNull(clusterMetaFormat0);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo6);
    org.junit.Assert.assertNull(path7);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo13);
    org.junit.Assert.assertNull(path14);
    org.junit.Assert.assertNotNull(clusterMetaFormat16);
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(clusterMetaFormat19);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo25);
    org.junit.Assert.assertNull(path26);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo32);
    org.junit.Assert.assertNull(path33);
    org.junit.Assert.assertNotNull(clusterMetaFormat35);
    //org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(durationSetting41);
    //org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    //org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    //org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    //org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
  }

  @Test
  public void test1289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1289");
    }
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException1 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure startFailure2 = new io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure(
        (java.lang.Throwable) clusterDatabaseManagementException1);
    org.neo4j.kernel.api.exceptions.Status status3 = clusterDatabaseManagementException1.status();
    org.junit.Assert.assertTrue(
        "'" + status3 + "' != '" + org.neo4j.kernel.api.exceptions.Status.Database.Unknown + "'",
        status3.equals(org.neo4j.kernel.api.exceptions.Status.Database.Unknown));
  }

  @Test
  public void test1290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1290");
    }
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker0 = null;
    org.neo4j.internal.id.IdGeneratorFactory idGeneratorFactory1 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator4 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.StorageEngine> storageEngineSupplier5 = null;
    org.neo4j.token.TokenRegistry tokenRegistry6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder relationshipTypeTokenHolder7 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder(
        databaseReadOnlyChecker0, idGeneratorFactory1, namedDatabaseId2, pageCacheTracer3,
        syncerator4, storageEngineSupplier5, tokenRegistry6);
    try {
      int int9 = relationshipTypeTokenHolder7.getOrCreateId("designated_seeder");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1291");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    java.lang.String str1 = mutableProtocols0.getImpl();
    java.lang.String str2 = mutableProtocols0.caerString();
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Snappy" + "'", str1, "Snappy");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "type_comp" + "'", str2, "type_comp");
  }

  @Test
  public void test1292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1292");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    org.neo4j.io.pagecache.PageCache pageCache2 = null;
    org.neo4j.kernel.database.DatabaseTracers databaseTracers3 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction4 = null;
    org.neo4j.memory.MemoryTracker memoryTracker5 = null;
    org.neo4j.io.pagecache.PageCache pageCache6 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter7 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter(
        databaseTracers3, fileSystemAbstraction4, memoryTracker5, pageCache6);
    syncRecoveryLifecycleAdapter7.init();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.ClusteredGdb clusteredGdb9 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupClusteredGdbManageService catchupClusteredGdbManageService10 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupClusteredGdbManageService(
        fileSystemAbstraction0, logProvider1, pageCache2, syncRecoveryLifecycleAdapter7,
        clusteredGdb9);
    io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment storeSyncEnvironment11 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncFacade storeSyncFacade12 = catchupClusteredGdbManageService10.stcprsStoreSyncFacade(
          storeSyncEnvironment11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1293");
    }
    java.lang.String[] strArray25 = new java.lang.String[]{
        "causal_clustering.leadership_priority_group", "default", "user-defined",
        "cc-discovery-actor-system", "overview", "default", "RequestGdbId for ", "temp-copy",
        "name", "leader-only", "cc-database-status-actor", "storage_engine", "designated_seeder",
        "temp-copy", "server_policies", "joiner", "server_policies", "cc-directory-actor", "Snappy",
        "Label", "temp-save", "cc-core-restart-needed-listener-timer", "restarting-cluster-client",
        "store_version", "type_comp"};
    java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
    boolean boolean27 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList26, strArray25);
    java.lang.String[] strArray56 = new java.lang.String[]{
        "causal_clustering.load_balancing.config.server_policies", "type_comp",
        "causal_clustering.load_balancing.config.server_policies",
        "causal_clustering.load_balancing.config.server_policies", "store_version",
        "causal_clustering.leadership_priority_group",
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$RestartRules1. Running every PT10S",
        "initial_members", "status", "storage_engine", "user-defined", "RequestGdbId for ",
        "type_comp", "leader-only", "user-defined",
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version",
        "catchup_protocol", "designated_seeder", "cc-core-restart-needed-listener-timer",
        "cc-discovery-actor-system", "user-defined", "restarting-cluster-client",
        "cc-database-status-actor",
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version", "uuid", "uuid",
        "leader-only", "type_comp"};
    java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
    boolean boolean58 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList57, strArray56);
    io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions gdbAuthActions59 = new io.github.onograph.cluster.raft.module.cuprot.current.core.GdbAuthActions(
        (java.util.List<java.lang.String>) strList26, (java.util.List<java.lang.String>) strList57);
    java.util.List<java.lang.String> strList60 = gdbAuthActions59.gecmdList();
    org.junit.Assert.assertNotNull(strArray25);
    //org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(strArray56);
    //org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    org.junit.Assert.assertNotNull(strList60);
  }

  @Test
  public void test1294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1294");
    }
    akka.actor.Address[] addressArray0 = new akka.actor.Address[]{};
    java.util.ArrayList<akka.actor.Address> addressList1 = new java.util.ArrayList<akka.actor.Address>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<akka.actor.Address>) addressList1, addressArray0);
    io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure databaseCoreClusterStructure3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.CoreClusterStructure coreClusterStructure4 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.CoreClusterStructure(
        (java.util.Collection<akka.actor.Address>) addressList1, databaseCoreClusterStructure3);
    io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure databaseCoreClusterStructure5 = coreClusterStructure4.getTcDatabaseCoreClusterStructure();
    org.junit.Assert.assertNotNull(addressArray0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(databaseCoreClusterStructure5);
  }

  @Test
  public void test1295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1295");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType0 = io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup setup1 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
        catchupStatusType0);
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef2 = null;
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockService> transactionBlockServiceOptional3 = setup1.txstaOptional(
        serverRef2);
    org.junit.Assert.assertTrue("'" + catchupStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR
        + "'", catchupStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR));
    org.junit.Assert.assertNotNull(setup1);
    org.junit.Assert.assertNotNull(transactionBlockServiceOptional3);
  }

  @Test
  public void test1296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1296");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting1 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingCletqmutDuration;
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction noComAction2 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction(
        0L, (java.lang.Object) durationSetting1);
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder transactionSyncReplyByteToMessageDecoder3 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder();
    boolean boolean4 = noComAction2.equals(
        (java.lang.Object) transactionSyncReplyByteToMessageDecoder3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType6 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt;
    try {
      transactionSyncReplyByteToMessageDecoder3.channelRead(channelHandlerContext5,
          (java.lang.Object) socketAddressSchemeType6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(durationSetting1);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + socketAddressSchemeType6 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt
        + "'", socketAddressSchemeType6.equals(
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt));
  }

  @Test
  public void test1297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1297");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor storeResourceSyncProcessor1 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor(
        3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType4 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR;
    try {
      io.netty.util.concurrent.Future<java.lang.Void> voidFuture5 = storeResourceSyncProcessor1.endFuture(
          channelHandlerContext2, 10L, setupGdbSyncReplyStateType4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType4 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType4.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
  }

  @Test
  public void test1298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1298");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer1 = applicationComProFamilyType0.getImpl();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType0.getImpl();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType3 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    java.lang.String str4 = applicationComProFamilyType3.caerString();
    io.github.onograph.config.EntProVer entProVer5 = applicationComProFamilyType3.getImpl();
    boolean boolean6 = applicationComProFamilyType0.isLesoeaForAp(
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType3);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer1);
    org.junit.Assert.assertNotNull(entProVer2);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType3 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType3.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "catchup_protocol" + "'", str4,
        "catchup_protocol");
    org.junit.Assert.assertNotNull(entProVer5);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test1299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1299");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk5 = null;
    java.lang.Void void6 = processorImpl2.process(bulkAsk5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask ask7 = null;
    java.lang.Void void8 = processorImpl2.process(ask7);
    io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper leaderNodeDataSDWrapper9 = new io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper();
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier11 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    char char13 = nodeGroupIdentifier11.charAt(0);
    akka.cluster.Cluster cluster14 = null;
    akka.event.EventStream eventStream15 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler startScheduler16 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_17 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    akka.actor.Props props18 = io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.prpProps(
        cluster14, eventStream15, startScheduler16,
        (io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach) restartRules1_17);
    boolean boolean19 = nodeGroupIdentifier11.equals((java.lang.Object) restartRules1_17);
    boolean boolean20 = leaderNodeDataSDWrapper9.equals((java.lang.Object) nodeGroupIdentifier11);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId21 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask ask22 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask(
        (io.github.onograph.cluster.raft.share.sync.SyncableData) leaderNodeDataSDWrapper9,
        consensusNodeId21);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel23 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl24 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl25 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel23, safeStateMarshalImpl24);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk26 = null;
    java.lang.Void void27 = processorImpl25.process(bulkAsk26);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage28 = null;
    java.lang.Void void29 = processorImpl25.process(logClipRequestMessage28);
    java.lang.Void void30 = ask22.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl25);
    java.lang.Void void31 = processorImpl2.process(ask22);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry38 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray39 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry38};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction40 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray39);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction41 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 100, 1536L, consensusLogEntryArray39);
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction44 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray39, (long) (byte) 0, (int) (short) 1);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId45 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask48 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask(
        (long) (byte) 0, (long) 3, consensusLogEntryArray39, consensusNodeId45, 1L, (long) 128);
    long long49 = ask48.getLdrComLng();
    try {
      java.lang.Void void50 = processorImpl2.process(ask48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'h' + "'", char13 == 'h');
    org.junit.Assert.assertNotNull(props18);
    //org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    //org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNull(void27);
    org.junit.Assert.assertNull(void29);
    org.junit.Assert.assertNull(void30);
    org.junit.Assert.assertNull(void31);
    org.junit.Assert.assertNotNull(consensusLogEntryArray39);
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
  }

  @Test
  public void test1300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1300");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = null;
    java.lang.Boolean boolean2 = messageProcessorImpl0.process(aliveMsg1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask3 = null;
    java.lang.Boolean boolean4 = messageProcessorImpl0.process(ask3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage5 = null;
    java.lang.Boolean boolean6 = messageProcessorImpl0.process(requestTransactionLogCZMetaMessage5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted7 = null;
    java.lang.Boolean boolean8 = messageProcessorImpl0.process(leaderNotAccepted7);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage9 = null;
    java.lang.Boolean boolean10 = messageProcessorImpl0.process(
        requestTransactionLogCZMetaMessage9);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
  }

  @Test
  public void test1301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1301");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType0 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup setup1 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
        catchupStatusType0);
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef2 = null;
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockService> transactionBlockServiceOptional3 = setup1.txstaOptional(
        serverRef2);
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef4 = null;
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockService> transactionBlockServiceOptional5 = setup1.txstaOptional(
        serverRef4);
    org.junit.Assert.assertNotNull(setup1);
    org.junit.Assert.assertNotNull(transactionBlockServiceOptional3);
    org.junit.Assert.assertNotNull(transactionBlockServiceOptional5);
  }

  @Test
  public void test1302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1302");
    }
    io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings messageStackSettings2 = new io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings(
        13, 97L);
  }

  @Test
  public void test1303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1303");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout1 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
        consensusNodeId0);
    boolean boolean2 = consensusElectionTimeout1.getIsOr();
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel3 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl4 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl5 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel3, safeStateMarshalImpl4);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk6 = null;
    java.lang.Void void7 = processorImpl5.process(bulkAsk6);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage8 = null;
    java.lang.Void void9 = processorImpl5.process(logClipRequestMessage8);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage10 = null;
    java.lang.Void void11 = processorImpl5.process(aliveReplyMessage10);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId12 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId13 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier14 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray15 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier14};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet16 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet16,
        nodeGroupIdentifierArray15);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec18 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId12, consensusNodeId13,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet16);
    java.lang.Void void19 = processorImpl5.process(leaderRec18);
    java.lang.Void void20 = consensusElectionTimeout1.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl5);
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl21 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg22 = null;
    java.lang.Boolean boolean23 = messageProcessorImpl21.process(aliveMsg22);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask24 = null;
    java.lang.Boolean boolean25 = messageProcessorImpl21.process(ask24);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage26 = null;
    java.lang.Boolean boolean27 = messageProcessorImpl21.process(
        requestTransactionLogCZMetaMessage26);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted28 = null;
    java.lang.Boolean boolean29 = messageProcessorImpl21.process(leaderNotAccepted28);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId30 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg31 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg(
        consensusNodeId30);
    java.lang.Boolean boolean32 = messageProcessorImpl21.process(aliveMsg31);
    java.lang.Void void33 = processorImpl5.process(aliveMsg31);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId34 = null;
    java.util.UUID uUID35 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.State state36 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage infoReplyMessage37 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage(
        consensusNodeId34, uUID35, state36);
    try {
      java.lang.Object obj38 = processorImpl5.process(infoReplyMessage37);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(void7);
    org.junit.Assert.assertNull(void9);
    org.junit.Assert.assertNull(void11);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier14);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray15);
    //org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNull(void19);
    org.junit.Assert.assertNull(void20);
    org.junit.Assert.assertNotNull(messageProcessorImpl21);
    org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + true + "'", boolean23, true);
    org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
    org.junit.Assert.assertEquals("'" + boolean27 + "' != '" + true + "'", boolean27, true);
    org.junit.Assert.assertEquals("'" + boolean29 + "' != '" + true + "'", boolean29, true);
    org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + true + "'", boolean32, true);
    org.junit.Assert.assertNull(void33);
  }

  @Test
  public void test1304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1304");
    }
    org.neo4j.kernel.database.NamedDatabaseId[] namedDatabaseIdArray0 = new org.neo4j.kernel.database.NamedDatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.NamedDatabaseId> namedDatabaseIdSet1 = new java.util.LinkedHashSet<org.neo4j.kernel.database.NamedDatabaseId>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet1,
        namedDatabaseIdArray0);
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds allGdbIds3 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds(
        (java.util.Set<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet1);
    java.util.Set<org.neo4j.kernel.database.NamedDatabaseId> namedDatabaseIdSet4 = allGdbIds3.getSetDiNamedDatabaseId();
    io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service.Spec.PortInfo portInfo5 = new io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service.Spec.PortInfo();
    boolean boolean6 = allGdbIds3.equals((java.lang.Object) portInfo5);
    org.junit.Assert.assertNotNull(namedDatabaseIdArray0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(namedDatabaseIdSet4);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test1305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1305");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.strvstfi();
    connector0.strvstfiForSt("policy");
    connector0.strvinsno();
    connector0.fihrfForSt("cc-directory-actor");
  }

  @Test
  public void test1306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1306");
    }
    org.neo4j.io.fs.WritableChannel writableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel1);
    writableChecksumChannelImpl2.beginChecksum();
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler.maslForWr(
          false, (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1307");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta1 = marshalChannelImplCMS0.startState();
    boolean boolean3 = nodeServerMemberTransactionLogDataMeta1.isTrnt((long) '#');
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta4 = nodeServerMemberTransactionLogDataMeta1.neitcNodeServerMemberTransactionLogDataMeta();
    nodeServerMemberTransactionLogDataMeta4.start();
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta1);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta4);
  }

  @Test
  public void test1308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1308");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta2 = marshalChannelImplCMS0.unmarshal(
          readableChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1309");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor storeResourceSyncProcessor1 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor(
        3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier4 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    char char6 = nodeGroupIdentifier4.charAt(0);
    akka.cluster.Cluster cluster7 = null;
    akka.event.EventStream eventStream8 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler startScheduler9 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_10 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    akka.actor.Props props11 = io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.prpProps(
        cluster7, eventStream8, startScheduler9,
        (io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach) restartRules1_10);
    boolean boolean12 = nodeGroupIdentifier4.equals((java.lang.Object) restartRules1_10);
    int int13 = nodeGroupIdentifier4.length();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction14 = null;
    java.nio.file.Path path15 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreElementFacade storeElementFacade18 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreElementFacade(
        fileSystemAbstraction14, path15, 10, "Snappy");
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray20 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet21 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean22 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet21,
        consensusNodeIdArray20);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper23 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet21);
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper24 = new io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper(
        (long) ' ',
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet21);
    boolean boolean25 = storeElementFacade18.equals((java.lang.Object) ' ');
    java.lang.String str26 = storeElementFacade18.getStrPr();
    boolean boolean27 = nodeGroupIdentifier4.equals((java.lang.Object) storeElementFacade18);
    try {
      storeResourceSyncProcessor1.steForChSt(channelHandlerContext2, storeElementFacade18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'h' + "'", char6 == 'h');
    org.junit.Assert.assertNotNull(props11);
    //org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    org.junit.Assert.assertNotNull(consensusNodeIdArray20);
    //org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    //org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Snappy" + "'", str26, "Snappy");
    //org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
  }

  @Test
  public void test1310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1310");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException gdbStoreException1 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException(
        "PropertyKey");
  }

  @Test
  public void test1311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1311");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker7 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo5);
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade9 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config1, fileSystemAbstraction2, logProvider3, clusterMetaTopologyInfo5, memoryTracker8);
    org.neo4j.logging.Log log10 = null;
    java.nio.file.Path path11 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path11);
    java.nio.file.Path path13 = clusterMetaTopologyInfo12.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker14 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo12);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat15 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv16 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade9, log10, clusterMetaTopologyInfo12,
        clusterMetaFormat15);
    try {
      java.nio.file.Path path18 = clusterMetaTopologyInfo12.ravosadrrPath("v4.0.0");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
    org.junit.Assert.assertNull(path13);
    org.junit.Assert.assertNotNull(clusterMetaFormat15);
  }

  @Test
  public void test1312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1312");
    }
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceHandler coreClusterStructureServiceHandler0 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceHandler();
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager1 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService3 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter4 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager1, namedDatabaseId2, coreClusterStructureService3);
    coreClusterStructureServiceLifecycleAdapter4.onungt();
    coreClusterStructureServiceLifecycleAdapter4.shutdown();
    coreClusterStructureServiceLifecycleAdapter4.onungt();
    coreClusterStructureServiceLifecycleAdapter4.onungt();
    coreClusterStructureServiceHandler0.adcrtolnForCo(
        (io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler) coreClusterStructureServiceLifecycleAdapter4);
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager10 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService12 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter13 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager10, namedDatabaseId11, coreClusterStructureService12);
    coreClusterStructureServiceLifecycleAdapter13.onungt();
    coreClusterStructureServiceLifecycleAdapter13.shutdown();
    coreClusterStructureServiceLifecycleAdapter13.onungt();
    coreClusterStructureServiceHandler0.reectolsrForCo(
        (io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler) coreClusterStructureServiceLifecycleAdapter13);
  }

  @Test
  public void test1313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1313");
    }
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.ComProFamilyBuilder comProFamilyBuilder1 = io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.bulrComProFamilyWrapperComProFamilyBuilder();
    io.github.onograph.cluster.raft.control.connect.ServerException serverException2 = new io.github.onograph.cluster.raft.control.connect.ServerException(
        "store_random_id", comProFamilyBuilder1);
    io.github.onograph.cluster.raft.module.dprot.DiscoveryNodeReplyException discoveryNodeReplyException3 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryNodeReplyException(
        (java.lang.Throwable) serverException2);
    io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException nodeNotFoundException4 = new io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException(
        (java.lang.Throwable) discoveryNodeReplyException3);
    org.junit.Assert.assertNotNull(comProFamilyBuilder1);
  }

  @Test
  public void test1314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1314");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
  }

  @Test
  public void test1315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1315");
    }
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId0 = null;
    org.neo4j.token.TokenRegistry tokenRegistry1 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator2 = null;
    org.neo4j.internal.id.IdGeneratorFactory idGeneratorFactory3 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.StorageEngine> storageEngineSupplier4 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer5 = null;
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder labelTokenHolder7 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder(
        namedDatabaseId0, tokenRegistry1, syncerator2, idGeneratorFactory3, storageEngineSupplier4,
        pageCacheTracer5, databaseReadOnlyChecker6);
    org.neo4j.token.api.NamedToken[] namedTokenArray8 = new org.neo4j.token.api.NamedToken[]{};
    java.util.ArrayList<org.neo4j.token.api.NamedToken> namedTokenList9 = new java.util.ArrayList<org.neo4j.token.api.NamedToken>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.token.api.NamedToken>) namedTokenList9, namedTokenArray8);
    try {
      labelTokenHolder7.setInitialTokens(
          (java.util.List<org.neo4j.token.api.NamedToken>) namedTokenList9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(namedTokenArray8);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test1316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1316");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray0 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet1 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1,
        consensusNodeIdArray0);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper3 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper4 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1);
    java.util.OptionalLong optionalLong5 = consensusNodeServerMemberIdWrapper4.sizOptionalLong();
    org.junit.Assert.assertNotNull(consensusNodeIdArray0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(optionalLong5);
  }

  @Test
  public void test1317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1317");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.strvstfi();
    connector0.str();
  }

  @Test
  public void test1318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1318");
    }
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceHandler coreClusterStructureServiceHandler0 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceHandler();
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager1 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService3 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter4 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager1, namedDatabaseId2, coreClusterStructureService3);
    coreClusterStructureServiceLifecycleAdapter4.onungt();
    coreClusterStructureServiceLifecycleAdapter4.shutdown();
    coreClusterStructureServiceLifecycleAdapter4.onungt();
    coreClusterStructureServiceLifecycleAdapter4.onungt();
    coreClusterStructureServiceHandler0.adcrtolnForCo(
        (io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler) coreClusterStructureServiceLifecycleAdapter4);
    try {
      coreClusterStructureServiceLifecycleAdapter4.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1319");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    int int4 = readableClosablePositionAwareChecksumChannelPassThruImpl1.endChecksumAndValidate();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl5 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
    try {
      float float6 = readableClosablePositionAwareChecksumChannelPassThruImpl5.getFloat();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
  }

  @Test
  public void test1320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1320");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMessageToMessageDecoderNoopImpl syncableDataMessageToMessageDecoderNoopImpl0 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMessageToMessageDecoderNoopImpl();
    io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel defaultReadableChecksumChannel1 = null;
    try {
      syncableDataMessageToMessageDecoderNoopImpl0.coseForDe(defaultReadableChecksumChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1321");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo1 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path0);
    java.nio.file.Path path2 = clusterMetaTopologyInfo1.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker3 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo1);
    try {
      java.lang.Boolean boolean4 = defaultDiscoveryInitialProcChecker3.isFitsauBoolean();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo1);
    org.junit.Assert.assertNull(path2);
  }

  @Test
  public void test1322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1322");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    java.lang.String str1 = mutableProtocols0.getImpl();
    java.lang.String str2 = mutableProtocols0.getImpl();
    java.lang.String str3 = mutableProtocols0.getImpl();
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Snappy" + "'", str1, "Snappy");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Snappy" + "'", str2, "Snappy");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Snappy" + "'", str3, "Snappy");
  }

  @Test
  public void test1323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1323");
    }
    org.neo4j.internal.helpers.TimeoutStrategy timeoutStrategy1 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager discoveryRetryManager2 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager(
        1000L, timeoutStrategy1);
  }

  @Test
  public void test1324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1324");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal uniqueAddressSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.getCurrentPosition();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl5 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    try {
      akka.cluster.UniqueAddress uniqueAddress6 = uniqueAddressSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(uniqueAddressSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(logPosition4);
  }

  @Test
  public void test1325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1325");
    }
    org.neo4j.time.SystemNanoClock systemNanoClock0 = null;
    io.github.onograph.cluster.raft.share.calg.ResettableMessageTimerMessageSpacingImpl resettableMessageTimerMessageSpacingImpl1 = new io.github.onograph.cluster.raft.share.calg.ResettableMessageTimerMessageSpacingImpl(
        systemNanoClock0);
    io.github.onograph.cluster.raft.share.calg.LeaderNodeScheduleWrapper leaderNodeScheduleWrapper2 = null;
    java.util.function.LongSupplier longSupplier3 = null;
    io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider incomingMessageProvider4 = io.github.onograph.cluster.raft.share.calg.LeaderNodeStatusIncomingMessageProcessor.copaeIncomingMessageProvider(
        (io.github.onograph.cluster.raft.share.calg.ResettableMessageTimer) resettableMessageTimerMessageSpacingImpl1,
        leaderNodeScheduleWrapper2, longSupplier3);
    try {
      resettableMessageTimerMessageSpacingImpl1.tieret();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(incomingMessageProvider4);
  }

  @Test
  public void test1326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1326");
    }
    byte[] byteArray1 = new byte[]{(byte) 1};
    io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService chunkedInputEncodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService(
        byteArray1, true);
    io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
    try {
      io.netty.buffer.ByteBuf byteBuf5 = chunkedInputEncodingService3.readChunk(
          channelHandlerContext4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
  }

  @Test
  public void test1327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1327");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry0 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData consensusLogEntryData2 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData(
        consensusLogEntry0, (long) (short) 0);
  }

  @Test
  public void test1328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1328");
    }
    akka.actor.ActorRef actorRef0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode removeReadReplicaNode1 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode(
        actorRef0);
    akka.actor.ActorRef actorRef2 = removeReadReplicaNode1.getMccActorRef();
    akka.actor.ActorRef actorRef3 = null;
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl4 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap5 = null;
    akka.actor.ActorRef actorRef6 = null;
    org.neo4j.dbms.identity.ServerId serverId7 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo updateReadReplicaInfo8 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo(
        actorRef3, gdbDiscoveryMetaReadReplicaImpl4, databaseIdMap5, actorRef6, serverId7);
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap9 = updateReadReplicaInfo8.getMapDsdd();
    boolean boolean10 = removeReadReplicaNode1.equals((java.lang.Object) updateReadReplicaInfo8);
    akka.actor.ActorRef actorRef11 = removeReadReplicaNode1.getMccActorRef();
    org.junit.Assert.assertNull(actorRef2);
    org.junit.Assert.assertNull(databaseIdMap9);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNull(actorRef11);
  }

  @Test
  public void test1329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1329");
    }
    io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceNOOPImpl<java.lang.String> strConsensusMessageLogServiceNOOPImpl0 = new io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceNOOPImpl<java.lang.String>();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage aliveNoReplyMessage5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage(
        consensusNodeId1, (long) 10, (long) 'a', (long) (byte) 10);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    strConsensusMessageLogServiceNOOPImpl0.loobnForNaMECo(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) aliveNoReplyMessage5,
        "causal_clustering.leadership_priority_group", namedDatabaseId7);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId9 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply12 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
        consensusNodeId9, true, (long) 128);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    strConsensusMessageLogServiceNOOPImpl0.loiodForNaMECo(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) reply12,
        "storage_engine", namedDatabaseId14);
    boolean boolean16 = reply12.getIsGv();
    boolean boolean17 = reply12.getIsGv();
    //org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    //org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test1330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1330");
    }
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory0 = null;
    org.neo4j.kernel.impl.api.CommitProcessFactory commitProcessFactory1 = null;
    org.neo4j.graphdb.factory.module.id.DatabaseIdContext databaseIdContext2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl4 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator6 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier7 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl8 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService3, syncableLeasableCoreNodeDataFSMImpl4, namedDatabaseId5,
        syncerator6, consensusNodeIdSupplier7);
    org.neo4j.kernel.impl.locking.Locks locks9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService10 = null;
    org.neo4j.token.TokenHolders tokenHolders11 = null;
    io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper coreNodeWrapper12 = new io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper(
        accessCapabilityFactory0, commitProcessFactory1, databaseIdContext2,
        (org.neo4j.kernel.impl.api.LeaseService) leaseServiceEnterpriseImpl8, locks9,
        coreGdbFSMService10, tokenHolders11);
    org.neo4j.kernel.impl.locking.Locks locks13 = coreNodeWrapper12.getMlLocks();
    org.junit.Assert.assertNull(locks13);
  }

  @Test
  public void test1331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1331");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.fihrih((long) (byte) 10);
    connector0.fihrfForSt("cluster-state");
  }

  @Test
  public void test1332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1332");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService syncableDataEncodingService0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder departingMessageManagerMessageToMessageEncoder1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder(
        syncableDataEncodingService0);
    boolean boolean2 = departingMessageManagerMessageToMessageEncoder1.isSharable();
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1333");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
    try {
      long long2 = readablePositionAwareChecksumChannelManager0.getLong();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test1334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1334");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager0);
    org.neo4j.logging.Log log2 = null;
    dataSyncRunnerStatsManager0.log = log2;
    try {
      dataSyncRunnerStatsManager0.strForStLoLo("server_policies", (java.lang.Long) 1536L,
          (java.lang.Long) (-1L));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory1);
  }

  @Test
  public void test1335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1335");
    }
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog0 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long2 = inMemoryConsensusTransactionLog0.prn((long) 1536);
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException4 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.api.DatabaseManagementException databaseManagementException5 = org.neo4j.dbms.api.DatabaseManagementException.wrap(
        (java.lang.Throwable) clusterDatabaseManagementException4);
    org.neo4j.kernel.api.exceptions.Status status6 = databaseManagementException5.status();
    boolean boolean7 = inMemoryConsensusTransactionLog0.equals((java.lang.Object) status6);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray10 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction11 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        10L, (long) 0, consensusLogEntryArray10);
    long long12 = inMemoryConsensusTransactionLog0.apeForCo(consensusLogEntryArray10);
    long long13 = inMemoryConsensusTransactionLog0.prvid();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1536L + "'", long2 == 1536L);
    org.junit.Assert.assertNotNull(databaseManagementException5);
    org.junit.Assert.assertTrue(
        "'" + status6 + "' != '" + org.neo4j.kernel.api.exceptions.Status.Database.Unknown + "'",
        status6.equals(org.neo4j.kernel.api.exceptions.Status.Database.Unknown));
    //org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(consensusLogEntryArray10);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1536L + "'", long13 == 1536L);
  }

  @Test
  public void test1336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1336");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver3 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    livingCacheObserver3.sememt((int) 'a');
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl6 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        32, false, (long) 13, livingCacheObserver3);
    consensusLogCacheServiceLiveImpl6.trnt((long) 1016);
    org.junit.Assert.assertNotNull(livingCacheObserver3);
  }

  @Test
  public void test1337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1337");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkaecidtDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test1338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1338");
    }
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory0 = null;
    org.neo4j.kernel.impl.api.CommitProcessFactory commitProcessFactory1 = null;
    org.neo4j.graphdb.factory.module.id.DatabaseIdContext databaseIdContext2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl4 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator6 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier7 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl8 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService3, syncableLeasableCoreNodeDataFSMImpl4, namedDatabaseId5,
        syncerator6, consensusNodeIdSupplier7);
    org.neo4j.kernel.impl.locking.Locks locks9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService10 = null;
    org.neo4j.token.TokenHolders tokenHolders11 = null;
    io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper coreNodeWrapper12 = new io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper(
        accessCapabilityFactory0, commitProcessFactory1, databaseIdContext2,
        (org.neo4j.kernel.impl.api.LeaseService) leaseServiceEnterpriseImpl8, locks9,
        coreGdbFSMService10, tokenHolders11);
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory13 = coreNodeWrapper12.getAccessCapabilityFactory();
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService14 = coreNodeWrapper12.getMsCoreGdbFSMService();
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory15 = coreNodeWrapper12.getAccessCapabilityFactory();
    org.junit.Assert.assertNull(accessCapabilityFactory13);
    org.junit.Assert.assertNull(coreGdbFSMService14);
    org.junit.Assert.assertNull(accessCapabilityFactory15);
  }

  @Test
  public void test1339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1339");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage5 = null;
    java.lang.Void void6 = processorImpl2.process(logClipRequestMessage5);
    io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper leaderNodeDataSDWrapper7 = new io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper();
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier9 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    char char11 = nodeGroupIdentifier9.charAt(0);
    akka.cluster.Cluster cluster12 = null;
    akka.event.EventStream eventStream13 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler startScheduler14 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_15 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    akka.actor.Props props16 = io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.prpProps(
        cluster12, eventStream13, startScheduler14,
        (io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach) restartRules1_15);
    boolean boolean17 = nodeGroupIdentifier9.equals((java.lang.Object) restartRules1_15);
    boolean boolean18 = leaderNodeDataSDWrapper7.equals((java.lang.Object) nodeGroupIdentifier9);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId19 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask ask20 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.Ask(
        (io.github.onograph.cluster.raft.share.sync.SyncableData) leaderNodeDataSDWrapper7,
        consensusNodeId19);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel21 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl22 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl23 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel21, safeStateMarshalImpl22);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk24 = null;
    java.lang.Void void25 = processorImpl23.process(bulkAsk24);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage26 = null;
    java.lang.Void void27 = processorImpl23.process(logClipRequestMessage26);
    java.lang.Void void28 = ask20.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl23);
    java.lang.Void void29 = processorImpl2.process(ask20);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId30 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply35 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
        consensusNodeId30, false, (long) (-1), (long) '#', (long) 0);
    long long36 = reply35.getLgT();
    boolean boolean37 = reply35.getIsSces();
    try {
      java.lang.Void void38 = processorImpl2.process(reply35);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'h' + "'", char11 == 'h');
    org.junit.Assert.assertNotNull(props16);
    //org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNull(void25);
    org.junit.Assert.assertNull(void27);
    org.junit.Assert.assertNull(void28);
    org.junit.Assert.assertNull(void29);
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    //org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
  }

  @Test
  public void test1340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1340");
    }
    akka.actor.ActorRef actorRef0 = null;
    java.time.Clock clock1 = null;
    org.neo4j.configuration.Config config2 = null;
    akka.actor.ActorRef actorRef3 = null;
    java.time.Clock clock4 = null;
    org.neo4j.configuration.Config config5 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta> databaseIdMap6 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.id.ConsensusNodeId> databaseIdMap7 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, org.neo4j.dbms.DatabaseState> databaseIdMap8 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl gdbServerPointInTimeImpl9 = new io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl(
        databaseIdMap6, databaseIdMap7, databaseIdMap8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.dbms.identity.ServerId serverId11 = null;
    akka.stream.javadsl.SourceQueueWithComplete<java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta>> databaseIdMapSourceQueueWithComplete12 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator> consensusGdbServerCoordinatorSourceQueueWithComplete13 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta> readReplicateGdbMetaSourceQueueWithComplete14 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure> databaseCoreClusterStructureSourceQueueWithComplete15 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure> databaseReadReplicaClusterStructureSourceQueueWithComplete16 = null;
    akka.actor.Props props17 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor.prpProps(
        actorRef3, clock4, config5,
        (io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime) gdbServerPointInTimeImpl9,
        logProvider10, serverId11, databaseIdMapSourceQueueWithComplete12,
        consensusGdbServerCoordinatorSourceQueueWithComplete13,
        readReplicateGdbMetaSourceQueueWithComplete14,
        databaseCoreClusterStructureSourceQueueWithComplete15,
        databaseReadReplicaClusterStructureSourceQueueWithComplete16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    org.neo4j.dbms.identity.ServerId serverId19 = null;
    akka.stream.javadsl.SourceQueueWithComplete<java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta>> databaseIdMapSourceQueueWithComplete20 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator> consensusGdbServerCoordinatorSourceQueueWithComplete21 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta> readReplicateGdbMetaSourceQueueWithComplete22 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure> databaseCoreClusterStructureSourceQueueWithComplete23 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure> databaseReadReplicaClusterStructureSourceQueueWithComplete24 = null;
    akka.actor.Props props25 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ReadReplicaClientStructureActor.prpProps(
        actorRef0, clock1, config2,
        (io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime) gdbServerPointInTimeImpl9,
        logProvider18, serverId19, databaseIdMapSourceQueueWithComplete20,
        consensusGdbServerCoordinatorSourceQueueWithComplete21,
        readReplicateGdbMetaSourceQueueWithComplete22,
        databaseCoreClusterStructureSourceQueueWithComplete23,
        databaseReadReplicaClusterStructureSourceQueueWithComplete24);
    org.junit.Assert.assertNotNull(props17);
    org.junit.Assert.assertNotNull(props25);
  }

  @Test
  public void test1341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1341");
    }
    io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta replicationSessionManagerMeta0 = new io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta();
    java.lang.Object obj1 = null;
    boolean boolean2 = replicationSessionManagerMeta0.equals(obj1);
    io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta replicationSessionManagerMeta3 = replicationSessionManagerMeta0.neitcReplicationSessionManagerMeta();
    io.github.onograph.cluster.raft.share.sync.SessionSeqActionId sessionSeqActionId4 = null;
    java.util.UUID uUID5 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy6 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean7 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID5, consensusNodeIdLazy6);
    try {
      boolean boolean8 = replicationSessionManagerMeta3.isVaaoeoForClSe(sessionSeqActionId4,
          clusterSessionBean7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(replicationSessionManagerMeta3);
  }

  @Test
  public void test1342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1342");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal defaultSyncableDataMarshal1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal(
        logEntryReader0);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager2 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager2.beginChecksum();
    org.neo4j.io.fs.ReadableChannel readableChannel4 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl5 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel4);
    readableClosablePositionAwareChecksumChannelPassThruImpl5.beginChecksum();
    readablePositionAwareChecksumChannelManager2.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl5);
    try {
      io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData consensusLogEntryData8 = io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData.reaConsensusLogEntryData(
          (org.neo4j.io.marshal.ChannelMarshal<io.github.onograph.cluster.raft.share.sync.SyncableData>) defaultSyncableDataMarshal1,
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1343");
    }
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readablePositionAwareChecksumChannelManager1.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
    try {
      io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta5 = marshalChannelImplCMS0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
  }

  @Test
  public void test1344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1344");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry4 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray5 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry4};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction6 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction7 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 100, 1536L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction10 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray5, (long) (byte) 0, (int) (short) 1);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl11 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    consensusLogCacheServiceNLImpl11.trnt(1536L);
    org.neo4j.logging.Log log14 = null;
    bulkAddAction10.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNLImpl11,
        log14);
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
  }

  @Test
  public void test1345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1345");
    }
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotData snapshotData2 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotData(
        (long) 1002, (long) (byte) 9);
  }

  @Test
  public void test1346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1346");
    }
    io.github.onograph.cluster.raft.share.sync.SubClusterSessionBean subClusterSessionBean1 = new io.github.onograph.cluster.raft.share.sync.SubClusterSessionBean(
        0L);
  }

  @Test
  public void test1347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1347");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq<io.github.onograph.cluster.raft.share.meta.fsm.EmptyReq> emptyReqFSMEmptyReq0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService1 = null;
    java.lang.Runnable runnable2 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl4 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable2, leasableMetaStateStorage3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator6 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier7 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl8 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService1, syncableLeasableCoreNodeDataFSMImpl4, namedDatabaseId5,
        syncerator6, consensusNodeIdSupplier7);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl10 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ReplicatedTransactionFSM replicatedTransactionFSM11 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl12 = null;
    org.neo4j.logging.LogProvider logProvider13 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier14 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore> logicalTransactionStoreSupplier15 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair transactionLogIndexRepair16 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair(
        logProvider13, transactionIdStoreSupplier14, logicalTransactionStoreSupplier15);
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService17 = new io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService(
        emptyReqFSMEmptyReq0, syncableLeasableCoreNodeDataFSMImpl4, fSMTokenImpl9, fSMTokenImpl10,
        replicatedTransactionFSM11, fSMTokenImpl12, transactionLogIndexRepair16);
    io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor autoCloseableActionProcessor18 = coreGdbFSMService17.getDsaceAutoCloseableActionProcessor();
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation19 = null;
    org.neo4j.kernel.database.DatabaseId databaseId20 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync22 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation19, databaseId20, (long) (short) 0);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer23 = null;
    try {
      autoCloseableActionProcessor18.dipcForSyCo(abstractTransactionSync22, fSMDataConsumer23,
          1016L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(autoCloseableActionProcessor18);
  }

  @Test
  public void test1348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1348");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal uUIDSafeChannelMarshal0 = io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal.IT;
    org.junit.Assert.assertNotNull(uUIDSafeChannelMarshal0);
  }

  @Test
  public void test1349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1349");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readablePositionAwareChecksumChannelManager0.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.SyncableData> syncableDataDataManagerFactory4 = io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction.deeazDataManagerFactory(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1350");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal uniqueAddressSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    try {
      akka.cluster.UniqueAddress uniqueAddress3 = uniqueAddressSafeChannelMarshal0.unmarshal(
          readableChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(uniqueAddressSafeChannelMarshal0);
  }

  @Test
  public void test1351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1351");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.onungt();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = coreClusterStructureServiceLifecycleAdapter3.nadaiNamedDatabaseId();
    org.junit.Assert.assertNull(namedDatabaseId5);
  }

  @Test
  public void test1352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1352");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService2 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations3 = new io.github.onograph.cluster.raft.share.LeaderOperations(
        clusterStructureService1, consensusLeaderNodeService2);
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager4 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl5 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService0, leaderOperations3, namedServiceApproachManager4);
  }

  @Test
  public void test1353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1353");
    }
    io.github.onograph.RingQueue<io.github.onograph.cluster.raft.control.MutableComProFamily> mutableComProFamilyRingQueue1 = new io.github.onograph.RingQueue<io.github.onograph.cluster.raft.control.MutableComProFamily>(
        (int) '#');
  }

  @Test
  public void test1354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1354");
    }
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog0 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long2 = inMemoryConsensusTransactionLog0.prn((long) 1000);
    long long4 = inMemoryConsensusTransactionLog0.prn(100L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1000L + "'", long2 == 1000L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1000L + "'", long4 == 1000L);
  }

  @Test
  public void test1355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1355");
    }
    java.util.Optional<akka.remote.artery.tcp.SSLEngineProvider> sSLEngineProviderOptional0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.DiscoveryInitialProcCheckerReadReplicaImpl discoveryInitialProcCheckerReadReplicaImpl1 = new io.github.onograph.cluster.raft.module.dprot.impl.DiscoveryInitialProcCheckerReadReplicaImpl();
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO5 = new io.github.onograph.config.ClusterMemberLimitAtCreationDTO(
        3);
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder actorStackBuilder6 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder(
          sSLEngineProviderOptional0,
          (io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker) discoveryInitialProcCheckerReadReplicaImpl1,
          config2, logProvider3, clusterMemberLimitAtCreationDTO5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1356");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    java.time.Duration duration2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId setupConsensusDatabaseId3 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId(
        consensusMemberGroupId0, consensusNodeId1, duration2);
    java.time.Duration duration4 = setupConsensusDatabaseId3.getTmotDuration();
    java.time.Duration duration5 = setupConsensusDatabaseId3.getTmotDuration();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId6 = setupConsensusDatabaseId3.getPbihrConsensusNodeId();
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException8 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData9 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        (java.lang.Exception) clusterDatabaseManagementException8);
    io.github.onograph.cluster.raft.module.dprot.DiscoveryNodeReplyException discoveryNodeReplyException10 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryNodeReplyException(
        (java.lang.Throwable) clusterDatabaseManagementException8);
    boolean boolean11 = setupConsensusDatabaseId3.equals(
        (java.lang.Object) clusterDatabaseManagementException8);
    org.junit.Assert.assertNull(duration4);
    org.junit.Assert.assertNull(duration5);
    org.junit.Assert.assertNull(consensusNodeId6);
    org.junit.Assert.assertNotNull(fSMData9);
    //org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test1357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1357");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorKnownImpl ruleProcessorKnownImpl0 = io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorKnownImpl.IT;
    org.junit.Assert.assertNotNull(ruleProcessorKnownImpl0);
  }

  @Test
  public void test1358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1358");
    }
    io.github.onograph.cluster.raft.share.sync.SyncableData syncableData0 = null;
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal defaultSyncableDataMarshal2 = new io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal(
        logEntryReader1);
    org.neo4j.io.fs.WritableChannel writableChannel5 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl6 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel5);
    writableChecksumChannelImpl6.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData.wrtForWrChSy(
          syncableData0,
          (org.neo4j.io.marshal.ChannelMarshal<io.github.onograph.cluster.raft.share.sync.SyncableData>) defaultSyncableDataMarshal2,
          (long) (byte) 100, (long) (byte) -1,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1359");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl.PLGX_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "server_policies" + "'", str0,
        "server_policies");
  }

  @Test
  public void test1360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1360");
    }
    java.time.Clock clock0 = null;
    java.time.Duration duration1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl> syncableLeasableCoreNodeDataFSMImplTransferCollection2 = new io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl>(
          clock0, duration1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1361");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = null;
    java.lang.Boolean boolean2 = messageProcessorImpl0.process(aliveMsg1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask3 = null;
    java.lang.Boolean boolean4 = messageProcessorImpl0.process(ask3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage5 = null;
    java.lang.Boolean boolean6 = messageProcessorImpl0.process(requestTransactionLogCZMetaMessage5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted7 = null;
    java.lang.Boolean boolean8 = messageProcessorImpl0.process(leaderNotAccepted7);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId9 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage aliveNoReplyMessage13 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage(
        consensusNodeId9, (long) 10, (long) 'a', (long) (byte) 10);
    long long14 = aliveNoReplyMessage13.getLgLt();
    java.lang.Boolean boolean15 = messageProcessorImpl0.process(aliveNoReplyMessage13);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
  }

  @Test
  public void test1362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1362");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.strvstfi();
    connector0.fihrih();
    connector0.fihritan(1000L);
  }

  @Test
  public void test1363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1363");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_0 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    java.lang.String str1 = restartRules1_0.gersString();
    java.lang.String str2 = restartRules1_0.gersString();
    org.junit.Assert.assertEquals("'" + str1 + "' != '"
            + "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$RestartRules1. Running every PT10S"
            + "'", str1,
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$RestartRules1. Running every PT10S");
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
            + "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$RestartRules1. Running every PT10S"
            + "'", str2,
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$RestartRules1. Running every PT10S");
  }

  @Test
  public void test1364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1364");
    }
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta0 = new io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta();
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    org.neo4j.storageengine.api.StoreId storeId2 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource5 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId1, storeId2, (long) (byte) 10, path4);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService6 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations7 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager8 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl9 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService6, leaderOperations7, namedServiceApproachManager8);
    boolean boolean10 = requestStoreResource5.equals(
        (java.lang.Object) socketAddressServiceLeaderImpl9);
    org.neo4j.storageengine.api.StoreId storeId11 = requestStoreResource5.getEpceStoreId();
    org.neo4j.kernel.database.DatabaseId databaseId12 = requestStoreResource5.getDatabaseId();
    java.nio.file.Path path13 = requestStoreResource5.getPath();
    boolean boolean14 = candidateTermMeta0.equals((java.lang.Object) requestStoreResource5);
    long long15 = requestStoreResource5.getLgItr();
    org.neo4j.kernel.database.DatabaseId databaseId16 = requestStoreResource5.getDatabaseId();
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNull(storeId11);
    org.junit.Assert.assertNull(databaseId12);
    org.junit.Assert.assertNull(path13);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    org.junit.Assert.assertNull(databaseId16);
  }

  @Test
  public void test1365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1365");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta1 = marshalChannelImplCMS0.startState();
    boolean boolean3 = nodeServerMemberTransactionLogDataMeta1.isCom((long) '4');
    nodeServerMemberTransactionLogDataMeta1.shutdown();
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta1);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test1366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1366");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<org.neo4j.configuration.helpers.SocketAddress>> socketAddressListSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingInacyeList;
    org.junit.Assert.assertNotNull(socketAddressListSetting0);
  }

  @Test
  public void test1367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1367");
    }
    io.github.onograph.RingQueue<io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta> syncedLeaderMetaRingQueue1 = new io.github.onograph.RingQueue<io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta>(
        1000);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta3 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta2);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta4 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta5 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta4);
    akka.cluster.ddata.ReplicatedData replicatedData6 = syncedLeaderMeta3.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta5);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta7 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta8 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta7);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta9 = syncedLeaderMeta5.mergeData(
        syncedLeaderMeta8);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta10 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta11 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta10);
    akka.cluster.ddata.ReplicatedData replicatedData12 = syncedLeaderMeta8.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta11);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta13 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta14 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta13);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta15 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta16 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta15);
    akka.cluster.ddata.ReplicatedData replicatedData17 = syncedLeaderMeta14.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta16);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta18 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta19 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta18);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta20 = syncedLeaderMeta16.mergeData(
        syncedLeaderMeta19);
    akka.cluster.ddata.ReplicatedData replicatedData21 = syncedLeaderMeta8.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta20);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta22 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta23 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta22);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta24 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta25 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta24);
    akka.cluster.ddata.ReplicatedData replicatedData26 = syncedLeaderMeta23.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta25);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta27 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta28 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta27);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta29 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta30 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta29);
    akka.cluster.ddata.ReplicatedData replicatedData31 = syncedLeaderMeta28.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta30);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta32 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta33 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta32);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta34 = syncedLeaderMeta30.mergeData(
        syncedLeaderMeta33);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction findComAction37 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction(
        (long) (byte) 100, (java.lang.Object) "name");
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta38 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta39 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta38);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta40 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta41 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta40);
    akka.cluster.ddata.ReplicatedData replicatedData42 = syncedLeaderMeta39.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta41);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta43 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta44 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta43);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta45 = syncedLeaderMeta41.mergeData(
        syncedLeaderMeta44);
    boolean boolean46 = findComAction37.equals((java.lang.Object) syncedLeaderMeta41);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta47 = syncedLeaderMeta33.mergeData(
        syncedLeaderMeta41);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta[] syncedLeaderMetaArray48 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta[]{
        syncedLeaderMeta20, syncedLeaderMeta23, syncedLeaderMeta33};
    try {
      syncedLeaderMetaRingQueue1.claForV(syncedLeaderMetaArray48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  63523b69-c48e-4278-b396-a85463647e8d");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(replicatedData6);
    org.junit.Assert.assertNotNull(syncedLeaderMeta9);
    org.junit.Assert.assertNotNull(replicatedData12);
    org.junit.Assert.assertNotNull(replicatedData17);
    org.junit.Assert.assertNotNull(syncedLeaderMeta20);
    org.junit.Assert.assertNotNull(replicatedData21);
    org.junit.Assert.assertNotNull(replicatedData26);
    org.junit.Assert.assertNotNull(replicatedData31);
    org.junit.Assert.assertNotNull(syncedLeaderMeta34);
    org.junit.Assert.assertNotNull(replicatedData42);
    org.junit.Assert.assertNotNull(syncedLeaderMeta45);
    //org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertNotNull(syncedLeaderMeta47);
    org.junit.Assert.assertNotNull(syncedLeaderMetaArray48);
  }

  @Test
  public void test1368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1368");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker7 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo5);
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade9 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config1, fileSystemAbstraction2, logProvider3, clusterMetaTopologyInfo5, memoryTracker8);
    org.neo4j.logging.Log log10 = null;
    java.nio.file.Path path11 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path11);
    java.nio.file.Path path13 = clusterMetaTopologyInfo12.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker14 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo12);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat15 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv16 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade9, log10, clusterMetaTopologyInfo12,
        clusterMetaFormat15);
    org.neo4j.logging.internal.DatabaseLogProvider databaseLogProvider17 = null;
    org.neo4j.kernel.lifecycle.LifeSupport lifeSupport19 = null;
    try {
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage20 = clusterSimpleStorageFacade9.crelesaStateStorage(
          databaseLogProvider17, "Snappy", lifeSupport19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
    org.junit.Assert.assertNull(path13);
    org.junit.Assert.assertNotNull(clusterMetaFormat15);
  }

  @Test
  public void test1369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1369");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress3 = null;
    org.neo4j.dbms.identity.ServerId serverId4 = null;
    java.lang.String[] strArray11 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet12 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray11);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta13 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress3, serverId4, nodeGroupIdentifierSet12);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange14 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(
        consensusNodeId0, (long) 1536, (long) (byte) 0, nodeGroupIdentifierSet12);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId15 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId16 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier17 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray18 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier17};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet19 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet19,
        nodeGroupIdentifierArray18);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec21 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId15, consensusNodeId16,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet19);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel22 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl23 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl24 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel22, safeStateMarshalImpl23);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk25 = null;
    java.lang.Void void26 = processorImpl24.process(bulkAsk25);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage27 = null;
    java.lang.Void void28 = processorImpl24.process(logClipRequestMessage27);
    java.lang.Void void29 = leaderRec21.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl24);
    try {
      java.lang.Void void30 = askToChange14.dipc(
          (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray11);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet12);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier17);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray18);
    //org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNull(void26);
    org.junit.Assert.assertNull(void28);
    org.junit.Assert.assertNull(void29);
  }

  @Test
  public void test1370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1370");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta1 = marshalChannelImplCMS0.startState();
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper2 = nodeServerMemberTransactionLogDataMeta1.getCmitdMemberIndexWrapper();
    boolean boolean4 = nodeServerMemberTransactionLogDataMeta1.equals(
        (java.lang.Object) (byte) 100);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta1);
    org.junit.Assert.assertNull(memberIndexWrapper2);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1371");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamily[] applicationComProFamilyArray0 = null;
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup1 = null;
    io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper applicationCurrentActiveComProFamilyWrapper2 = io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
        applicationComProFamilyComProFamilyGroup1);
    java.util.List<io.github.onograph.config.EntProVer> entProVerList3 = applicationCurrentActiveComProFamilyWrapper2.getListVrinU();
    try {
      io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl comProFamilyManagerAppImpl4 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl(
          applicationComProFamilyArray0, applicationCurrentActiveComProFamilyWrapper2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(applicationCurrentActiveComProFamilyWrapper2);
    org.junit.Assert.assertNotNull(entProVerList3);
  }

  @Test
  public void test1372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1372");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = consensusLogCacheServiceNLImpl0.getConsensusLogEntry(
        (long) 1);
    consensusLogCacheServiceNLImpl0.enb();
    consensusLogCacheServiceNLImpl0.prn(1000L);
    org.junit.Assert.assertNull(consensusLogEntry2);
  }

  @Test
  public void test1373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1373");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor storeResourceSyncProcessor1 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor(
        3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType5 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_GENERAL_ERR;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted(
        (long) 10, setupGdbSyncReplyStateType5);
    try {
      io.netty.util.concurrent.Future<java.lang.Void> voidFuture7 = storeResourceSyncProcessor1.endFuture(
          channelHandlerContext2, (long) 1015, setupGdbSyncReplyStateType5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType5 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_GENERAL_ERR
        + "'", setupGdbSyncReplyStateType5.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_GENERAL_ERR));
  }

  @Test
  public void test1374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1374");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager0);
    boolean boolean2 = dataSyncRunnerStatsManagerDataManagerFactory1.getIsCi();
    boolean boolean3 = dataSyncRunnerStatsManagerDataManagerFactory1.getIsCi();
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager4 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory5 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager4);
    boolean boolean6 = dataSyncRunnerStatsManagerDataManagerFactory5.getIsCi();
    boolean boolean7 = dataSyncRunnerStatsManagerDataManagerFactory5.getIsCi();
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory8 = dataSyncRunnerStatsManagerDataManagerFactory1.cobeDataManagerFactory(
          dataSyncRunnerStatsManagerDataManagerFactory5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalStateException; message: *** Error:  fae80bd1-b164-44c7-9864-eeb00641dab2");
    } catch (java.lang.IllegalStateException e) {
    }
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory1);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory5);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    //org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test1375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1375");
    }
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta0 = new io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta();
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    org.neo4j.storageengine.api.StoreId storeId2 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource5 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId1, storeId2, (long) (byte) 10, path4);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService6 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations7 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager8 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl9 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService6, leaderOperations7, namedServiceApproachManager8);
    boolean boolean10 = requestStoreResource5.equals(
        (java.lang.Object) socketAddressServiceLeaderImpl9);
    org.neo4j.storageengine.api.StoreId storeId11 = requestStoreResource5.getEpceStoreId();
    org.neo4j.kernel.database.DatabaseId databaseId12 = requestStoreResource5.getDatabaseId();
    java.nio.file.Path path13 = requestStoreResource5.getPath();
    boolean boolean14 = candidateTermMeta0.equals((java.lang.Object) requestStoreResource5);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector15 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector15.fihrih((long) (byte) 10);
    boolean boolean18 = candidateTermMeta0.equals((java.lang.Object) connector15);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNull(storeId11);
    org.junit.Assert.assertNull(databaseId12);
    org.junit.Assert.assertNull(path13);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test1376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1376");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo4 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path3);
    java.nio.file.Path path5 = clusterMetaTopologyInfo4.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker6 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo4);
    org.neo4j.memory.MemoryTracker memoryTracker7 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade8 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config0, fileSystemAbstraction1, logProvider2, clusterMetaTopologyInfo4, memoryTracker7);
    org.neo4j.logging.internal.DatabaseLogProvider databaseLogProvider9 = null;
    org.neo4j.kernel.lifecycle.LifeSupport lifeSupport11 = null;
    try {
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta> nodeServerMemberTransactionLogDataMetaStateStorage12 = clusterSimpleStorageFacade8.crermrsgStateStorage(
          databaseLogProvider9, "member-db-state", lifeSupport11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo4);
    org.junit.Assert.assertNull(path5);
  }

  @Test
  public void test1377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1377");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl3 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler2, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler5 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseIdInboundHandler storeDatabaseIdInboundHandler6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusTransactionLogProcessor.TimeoutType timeoutType8 = io.github.onograph.cluster.raft.share.calg.ConsensusTransactionLogProcessor.TimeoutType.RETRY;
    try {
      storeDatabaseIdInboundHandler6.channelRead(channelHandlerContext7,
          (java.lang.Object) timeoutType8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + timeoutType8 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusTransactionLogProcessor.TimeoutType.RETRY
        + "'", timeoutType8.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusTransactionLogProcessor.TimeoutType.RETRY));
  }

  @Test
  public void test1378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1378");
    }
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta> loadBalanceServerMetaRuleProcessor1 = io.github.onograph.cluster.raft.gateway.gwlb.mods.RuleProcessorConfigurator.pasRuleProcessor(
          "user-defined");
      org.junit.Assert.fail(
          "Expected exception of type io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException; message: *** Error: b0c41905-88ce-452e-b1e9-41bd0132b3d5");
    } catch (io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException e) {
    }
  }

  @Test
  public void test1379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1379");
    }
    io.github.onograph.cluster.raft.control.MutatingComProFamilyGroupType mutatingComProFamilyGroupType0 = io.github.onograph.cluster.raft.control.MutatingComProFamilyGroupType.TYPE_COMP;
    java.lang.String str1 = mutatingComProFamilyGroupType0.lowerName();
    java.lang.String[] strArray37 = new java.lang.String[]{"cc-core-topology-actor",
        "server_policies", "user-defined", "server_policies", "default", "designated_seeder",
        "overview", "FollowerStates{}", "RequestGdbId for ", "RelationshipType",
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version",
        "catchup_protocol", "LZ4_high_compression", "cc-database-status-actor",
        "cc-core-restart-needed-listener-timer",
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$RestartRules1. Running every PT10S",
        "io.github.onograph.cluster.raft.control.connect.ClientException: ",
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version",
        "member-db-state", "cc-core-restart-needed-listener-timer", "user-defined",
        "causal_clustering.load_balancing.config.server_policies",
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$StartOverIfSingleNotResponding. Unreachable node detected.",
        "designated_seeder", "cc-directory-actor", "type_comp", "storage_engine", "joiner",
        "v4.0.0", "catchup_protocol", "status", "store_random_id", "designated_seeder", "overview",
        "causal_clustering.load_balancing.config.server_policies"};
    java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
    boolean boolean39 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList38, strArray37);
    io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper mutatingCurrentActiveComProFamilyWrapper40 = new io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper(
        (io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutatingComProFamilyGroupType0,
        (java.util.List<java.lang.String>) strList38);
    java.util.List<java.lang.String> strList41 = mutatingCurrentActiveComProFamilyWrapper40.getListVrinU();
    org.junit.Assert.assertTrue("'" + mutatingComProFamilyGroupType0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutatingComProFamilyGroupType.TYPE_COMP + "'",
        mutatingComProFamilyGroupType0.equals(
            io.github.onograph.cluster.raft.control.MutatingComProFamilyGroupType.TYPE_COMP));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "type_comp" + "'", str1, "type_comp");
    org.junit.Assert.assertNotNull(strArray37);
    //org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertNotNull(strList41);
  }

  @Test
  public void test1380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1380");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.strvstfi();
    connector0.fihrih();
    connector0.fii();
  }

  @Test
  public void test1381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1381");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncRequest storeSyncRequest2 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncRequest(
        databaseId0, storeId1);
  }

  @Test
  public void test1382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1382");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat2 = new io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat(
        (int) 'a', 1536);
  }

  @Test
  public void test1383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1383");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = consensusLogCacheServiceNLImpl0.getConsensusLogEntry(
        (long) 1);
    int int3 = consensusLogCacheServiceNLImpl0.elmtcu();
    consensusLogCacheServiceNLImpl0.enb();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry6 = consensusLogCacheServiceNLImpl0.getConsensusLogEntry(
        (long) (short) 0);
    int int7 = consensusLogCacheServiceNLImpl0.elmtcu();
    org.junit.Assert.assertNull(consensusLogEntry2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNull(consensusLogEntry6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
  }

  @Test
  public void test1384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1384");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException2 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper4 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId0, (java.lang.Throwable) clusterDatabaseManagementException2, operatorState3);
    java.util.Optional<java.lang.Throwable> throwableOptional5 = discoveryGdbOperatorMetaWrapper4.faleOptional();
    org.neo4j.dbms.OperatorState operatorState6 = discoveryGdbOperatorMetaWrapper4.getOperatorState();
    org.junit.Assert.assertNotNull(throwableOptional5);
    org.junit.Assert.assertNull(operatorState6);
  }

  @Test
  public void test1385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1385");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId0, storeId1, (long) 1536, path3);
  }

  @Test
  public void test1386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1386");
    }
    io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting clusterLoadBalancingServerPoliciesGroupSetting1 = io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting.gruClusterLoadBalancingServerPoliciesGroupSetting(
        "");
    java.lang.String str2 = clusterLoadBalancingServerPoliciesGroupSetting1.getPrefix();
    org.junit.Assert.assertNotNull(clusterLoadBalancingServerPoliciesGroupSetting1);
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "causal_clustering.load_balancing.config.server_policies" + "'",
        str2, "causal_clustering.load_balancing.config.server_policies");
  }

  @Test
  public void test1387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1387");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    writableChecksumChannelImpl1.beginChecksum();
    org.neo4j.storageengine.api.StorageCommand[] storageCommandArray3 = new org.neo4j.storageengine.api.StorageCommand[]{};
    java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand> storageCommandList4 = new java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.storageengine.api.StorageCommand>) storageCommandList4,
        storageCommandArray3);
    byte[] byteArray6 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList4);
    byte[] byteArray7 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList4);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel9 = writableChecksumChannelImpl1.put(
          byteArray7, (int) 'h');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storageCommandArray3);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
  }

  @Test
  public void test1388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1388");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder();
    org.neo4j.kernel.KernelVersion kernelVersion1 = null;
    org.neo4j.storageengine.api.StoreId storeId2 = null;
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation3 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply4 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply(
        kernelVersion1, storeId2, committedTransactionRepresentation3);
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation5 = catchupOutgoingTransactionPullReply4.getTCommittedTransactionRepresentation();
    boolean boolean6 = messageDataTypeMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) committedTransactionRepresentation5);
    org.junit.Assert.assertNull(committedTransactionRepresentation5);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test1389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1389");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readablePositionAwareChecksumChannelManager0.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readablePositionAwareChecksumChannelManager0.getCurrentPosition();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition5 = readablePositionAwareChecksumChannelManager0.getCurrentPosition();
    try {
      int int6 = readablePositionAwareChecksumChannelManager0.getInt();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition4);
    org.junit.Assert.assertNotNull(logPosition5);
  }

  @Test
  public void test1390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1390");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = null;
    java.lang.Boolean boolean2 = messageProcessorImpl0.process(aliveMsg1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply3 = null;
    java.lang.Boolean boolean4 = messageProcessorImpl0.process(reply3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage5 = null;
    java.lang.Boolean boolean6 = messageProcessorImpl0.process(logClipRequestMessage5);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
  }

  @Test
  public void test1391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1391");
    }
    java.util.ArrayList<org.neo4j.internal.helpers.collection.Pair<java.lang.String, java.lang.String>> strPairList0 = new java.util.ArrayList<org.neo4j.internal.helpers.collection.Pair<java.lang.String, java.lang.String>>();
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo2 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType3 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer4 = applicationComProFamilyType3.getImpl();
    boolean boolean5 = viewClusterInfo2.equals((java.lang.Object) entProVer4);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType6 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer7 = applicationComProFamilyType6.getImpl();
    int int8 = entProVer4.compareTo(entProVer7);
    io.github.onograph.cluster.raft.control.connect.ChangeComProRequestImpl changeComProRequestImpl9 = new io.github.onograph.cluster.raft.control.connect.ChangeComProRequestImpl(
        (java.util.List<org.neo4j.internal.helpers.collection.Pair<java.lang.String, java.lang.String>>) strPairList0,
        "", entProVer7);
    java.lang.String str10 = changeComProRequestImpl9.getPType();
    io.github.onograph.config.EntProVer entProVer11 = changeComProRequestImpl9.getVrinEntProVer();
    java.lang.Object obj12 = null;
    boolean boolean13 = changeComProRequestImpl9.equals(obj12);
    org.junit.Assert.assertNotNull(viewClusterInfo2);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType3 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType3.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer4);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType6 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType6.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer7);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    org.junit.Assert.assertNotNull(entProVer11);
    //org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test1392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1392");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    boolean boolean2 = transactionChunkingCompletedMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) '#');
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler3 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl4 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler5 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler3, refCatchupManagerImpl4);
    boolean boolean6 = transactionChunkingCompletedMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) catchupProblemInboundHandler5);
    io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta replicationSessionManagerMeta7 = new io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta();
    java.lang.Object obj8 = null;
    boolean boolean9 = replicationSessionManagerMeta7.equals(obj8);
    io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta replicationSessionManagerMeta10 = replicationSessionManagerMeta7.neitcReplicationSessionManagerMeta();
    boolean boolean11 = transactionChunkingCompletedMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) replicationSessionManagerMeta10);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver15 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    livingCacheObserver15.sememt((int) 'a');
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl18 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        32, false, (long) 13, livingCacheObserver15);
    boolean boolean19 = transactionChunkingCompletedMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) 13);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    //org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(replicationSessionManagerMeta10);
    //org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(livingCacheObserver15);
    //org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
  }

  @Test
  public void test1393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1393");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    boolean boolean3 = nettyChannelImpl2.isChannelDis();
    boolean boolean4 = nettyChannelImpl2.isChannelDis();
    boolean boolean5 = nettyChannelImpl2.isChannelDis();
    org.neo4j.kernel.database.DatabaseTracers databaseTracers6 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction7 = null;
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    org.neo4j.io.pagecache.PageCache pageCache9 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter10 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter(
        databaseTracers6, fileSystemAbstraction7, memoryTracker8, pageCache9);
    syncRecoveryLifecycleAdapter10.init();
    syncRecoveryLifecycleAdapter10.shutdown();
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture13 = nettyChannelImpl2.wrtanflhFuture(
          (java.lang.Object) syncRecoveryLifecycleAdapter10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test1394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1394");
    }
    io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
    io.netty.buffer.ByteBuf[] byteBufArray2 = new io.netty.buffer.ByteBuf[]{};
    java.util.LinkedList<io.netty.buffer.ByteBuf> byteBufList3 = new java.util.LinkedList<io.netty.buffer.ByteBuf>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<io.netty.buffer.ByteBuf>) byteBufList3, byteBufArray2);
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl5 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl(
          byteBufAllocator0, (int) (byte) -1,
          (java.util.Queue<io.netty.buffer.ByteBuf>) byteBufList3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: allocator cannot be null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteBufArray2);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1395");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper1 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.dumMetaWrapper(
        (org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId>) safeStateMarshalImpl0);
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readableClosablePositionAwareChecksumChannelPassThruImpl3.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition5 = readableClosablePositionAwareChecksumChannelPassThruImpl3.getCurrentPosition();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl6 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition7 = readableClosablePositionAwareChecksumChannelPassThruImpl6.getCurrentPosition();
    try {
      io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId8 = safeStateMarshalImpl0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper1);
    org.junit.Assert.assertNotNull(logPosition5);
    org.junit.Assert.assertNotNull(logPosition7);
  }

  @Test
  public void test1396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1396");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType3 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_IS_ANSWER;
    boolean boolean4 = gdbIdInboundHandler2.acceptInboundMessage(
        (java.lang.Object) answerMessageType3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSyncRequestByteToMessageDecoder requestSyncRequestByteToMessageDecoder6 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSyncRequestByteToMessageDecoder();
    try {
      gdbIdInboundHandler2.channelRead(channelHandlerContext5,
          (java.lang.Object) requestSyncRequestByteToMessageDecoder6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + answerMessageType3 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_IS_ANSWER + "'",
        answerMessageType3.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_IS_ANSWER));
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1397");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef0 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType1 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef0.exeForE(messageDataType1);
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef3 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType4 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef3.exeForE(messageDataType4);
    byte byte6 = messageDataType4.getMcd();
    contentTypeRef0.exeForE(messageDataType4);
    byte byte8 = messageDataType4.getMcd();
    org.junit.Assert.assertTrue("'" + messageDataType1 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType1.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
    org.junit.Assert.assertTrue("'" + messageDataType4 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType4.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
    org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
  }

  @Test
  public void test1398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1398");
    }
    akka.actor.ActorRef actorRef0 = null;
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl1 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap2 = null;
    akka.actor.ActorRef actorRef3 = null;
    org.neo4j.dbms.identity.ServerId serverId4 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo updateReadReplicaInfo5 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo(
        actorRef0, gdbDiscoveryMetaReadReplicaImpl1, databaseIdMap2, actorRef3, serverId4);
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap6 = updateReadReplicaInfo5.getMapDsdd();
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl7 = updateReadReplicaInfo5.getIrrGdbDiscoveryMetaReadReplicaImpl();
    org.neo4j.dbms.identity.ServerId serverId8 = updateReadReplicaInfo5.getServerId();
    org.junit.Assert.assertNull(databaseIdMap6);
    org.junit.Assert.assertNull(gdbDiscoveryMetaReadReplicaImpl7);
    org.junit.Assert.assertNull(serverId8);
  }

  @Test
  public void test1399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1399");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureJSerializer databaseCoreClusterStructureJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureJSerializer();
    boolean boolean1 = databaseCoreClusterStructureJSerializer0.includeManifest();
    //org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test1400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1400");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq<io.github.onograph.cluster.raft.share.meta.fsm.AskState> askStateFSMEmptyReq0 = new io.github.onograph.cluster.raft.share.meta.fsm.FSMEmptyReq<io.github.onograph.cluster.raft.share.meta.fsm.AskState>();
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    java.util.UUID uUID3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState4 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId1, consensusNodeId2, uUID3);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId5 = askState4.getImConsensusNodeId();
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer7 = null;
    try {
      askStateFSMEmptyReq0.aplcoaForCoCo(askState4, (long) 1000, fSMDataConsumer7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(consensusNodeId5);
  }

  @Test
  public void test1401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1401");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
    try {
      boolean boolean2 = io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler.isUnahForRe(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test1402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1402");
    }
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog0 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long3 = inMemoryConsensusTransactionLog0.pass((long) 0, (long) (short) -1);
    boolean boolean5 = inMemoryConsensusTransactionLog0.equals((java.lang.Object) "protocols");
    long long6 = inMemoryConsensusTransactionLog0.apeie();
    long long7 = inMemoryConsensusTransactionLog0.apeie();
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
  }

  @Test
  public void test1403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1403");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    java.lang.String str1 = mutableProtocols0.getImpl();
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols2 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols3 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    io.github.onograph.cluster.raft.control.MutableComProFamily[] mutableComProFamilyArray4 = new io.github.onograph.cluster.raft.control.MutableComProFamily[]{
        mutableProtocols0, mutableProtocols2, mutableProtocols3};
    java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily> mutableComProFamilyList5 = new java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList5,
        mutableComProFamilyArray4);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType7 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper comProFamilyWrapper8 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper(
        (java.util.List<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList5,
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType7);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyByteToMessageDecoder setupGdbStoreSyncReplyByteToMessageDecoder9 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyByteToMessageDecoder();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder requestSnapshotByteToMessageDecoder10 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder();
    io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator11 = io.netty.handler.codec.ByteToMessageDecoder.MERGE_CUMULATOR;
    requestSnapshotByteToMessageDecoder10.setCumulator(cumulator11);
    setupGdbStoreSyncReplyByteToMessageDecoder9.setCumulator(cumulator11);
    boolean boolean14 = comProFamilyWrapper8.equals(
        (java.lang.Object) setupGdbStoreSyncReplyByteToMessageDecoder9);
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder metaByteToMessageDecoder15 = new io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder();
    io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator16 = io.netty.handler.codec.ByteToMessageDecoder.COMPOSITE_CUMULATOR;
    metaByteToMessageDecoder15.setCumulator(cumulator16);
    boolean boolean18 = comProFamilyWrapper8.equals((java.lang.Object) metaByteToMessageDecoder15);
    io.github.onograph.cluster.raft.control.ApplicationComProFamily applicationComProFamily19 = comProFamilyWrapper8.getPaApplicationComProFamily();
    java.lang.String str20 = applicationComProFamily19.caerString();
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Snappy" + "'", str1, "Snappy");
    org.junit.Assert.assertTrue("'" + mutableProtocols2 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols2.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertTrue("'" + mutableProtocols3 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols3.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertNotNull(mutableComProFamilyArray4);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType7 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType7.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(cumulator11);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(cumulator16);
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamily19 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamily19.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "catchup_protocol" + "'", str20,
        "catchup_protocol");
  }

  @Test
  public void test1404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1404");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readablePositionAwareChecksumChannelManager0.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
  }

  @Test
  public void test1405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1405");
    }
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.nio.file.Path path2 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo3 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path2);
    java.nio.file.Path path4 = clusterMetaTopologyInfo3.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker5 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo3);
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO6 = null;
    org.neo4j.configuration.Config config7 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker discoveryInitialProcChecker8 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType arteryRemotingType9 = io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TLS_TCP;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter typesafeManagementAdapter10 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter(
        clusterMemberLimitAtCreationDTO6, config7, discoveryInitialProcChecker8,
        arteryRemotingType9);
    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter typesafeManagementAdapter11 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter(
        clusterMemberLimitAtCreationDTO0, config1,
        (io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker) defaultDiscoveryInitialProcChecker5,
        arteryRemotingType9);
    try {
      java.lang.Boolean boolean12 = defaultDiscoveryInitialProcChecker5.isFitsauBoolean();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo3);
    org.junit.Assert.assertNull(path4);
    org.junit.Assert.assertTrue("'" + arteryRemotingType9 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TLS_TCP
        + "'", arteryRemotingType9.equals(
        io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TLS_TCP));
  }

  @Test
  public void test1406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1406");
    }
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta> replicationSessionManagerMetaStateStorage0 = null;
    io.github.onograph.cluster.raft.ClusterSessionManager clusterSessionManager1 = new io.github.onograph.cluster.raft.ClusterSessionManager(
        replicationSessionManagerMetaStateStorage0);
    io.github.onograph.cluster.raft.share.sync.SessionSeqActionId sessionSeqActionId2 = null;
    java.util.UUID uUID3 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy4 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean5 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID3, consensusNodeIdLazy4);
    try {
      boolean boolean6 = clusterSessionManager1.isVaaoeoForClSe(sessionSeqActionId2,
          clusterSessionBean5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1407");
    }
    org.neo4j.graphdb.config.Setting<java.nio.file.Path> pathSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingKuncPath;
    org.junit.Assert.assertNotNull(pathSetting0);
  }

  @Test
  public void test1408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1408");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager0.beginChecksum();
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readableClosablePositionAwareChecksumChannelPassThruImpl3.beginChecksum();
    readablePositionAwareChecksumChannelManager0.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
    readablePositionAwareChecksumChannelManager0.close();
  }

  @Test
  public void test1409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1409");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker7 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo5);
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade9 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config1, fileSystemAbstraction2, logProvider3, clusterMetaTopologyInfo5, memoryTracker8);
    org.neo4j.logging.Log log10 = null;
    java.nio.file.Path path11 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path11);
    java.nio.file.Path path13 = clusterMetaTopologyInfo12.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker14 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo12);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat15 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv16 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade9, log10, clusterMetaTopologyInfo12,
        clusterMetaFormat15);
    org.neo4j.logging.internal.DatabaseLogProvider databaseLogProvider17 = null;
    try {
      org.neo4j.io.state.SimpleStorage<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdSimpleStorage19 = clusterSimpleStorageFacade9.crergrSimpleStorage(
          databaseLogProvider17, "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
    org.junit.Assert.assertNull(path13);
    org.junit.Assert.assertNotNull(clusterMetaFormat15);
  }

  @Test
  public void test1410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1410");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal uniqueAddressSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager1.beginChecksum();
    try {
      akka.cluster.UniqueAddress uniqueAddress3 = uniqueAddressSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(uniqueAddressSafeChannelMarshal0);
  }

  @Test
  public void test1411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1411");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.TransactionBlockServiceBuilder transactionBlockServiceBuilder0 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup setup1 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup.okTransactionBlockGeneratorSetup(
        transactionBlockServiceBuilder0);
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef2 = null;
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockService> transactionBlockServiceOptional3 = setup1.txstaOptional(
        serverRef2);
    org.junit.Assert.assertNotNull(setup1);
    org.junit.Assert.assertNotNull(transactionBlockServiceOptional3);
  }

  @Test
  public void test1412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1412");
    }
    io.github.onograph.cluster.raft.share.calg.action.TransactionLogActionMitImpl transactionLogActionMitImpl1 = new io.github.onograph.cluster.raft.share.calg.action.TransactionLogActionMitImpl(
        (long) (byte) 100);
  }

  @Test
  public void test1413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1413");
    }
    io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderImpl domainToInetAddressProviderImpl0 = new io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderImpl();
    java.net.InetAddress[] inetAddressArray2 = domainToInetAddressProviderImpl0.revdanmInetAddress(
        "");
    org.junit.Assert.assertNotNull(inetAddressArray2);
  }

  @Test
  public void test1414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1414");
    }
    io.netty.bootstrap.Bootstrap bootstrap0 = null;
    io.netty.channel.pool.ChannelPoolHandler channelPoolHandler1 = null;
    io.github.onograph.cluster.raft.netty.NettyChannelPoolBuilder nettyChannelPoolBuilder2 = null;
    io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl lBNettyChannelPoolMapImpl4 = new io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl(
        bootstrap0, channelPoolHandler1, nettyChannelPoolBuilder2, (int) (byte) 9);
    java.util.Spliterator<java.util.Map.Entry<io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO, io.netty.channel.pool.ChannelPool>> consensusSocketAddressDTOEntrySpliterator5 = lBNettyChannelPoolMapImpl4.spliterator();
    java.util.Spliterator<java.util.Map.Entry<io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO, io.netty.channel.pool.ChannelPool>> consensusSocketAddressDTOEntrySpliterator6 = lBNettyChannelPoolMapImpl4.spliterator();
    org.junit.Assert.assertNotNull(consensusSocketAddressDTOEntrySpliterator5);
    org.junit.Assert.assertNotNull(consensusSocketAddressDTOEntrySpliterator6);
  }

  @Test
  public void test1415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1415");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl clusterDiscoveryManagerAkkaImpl0 = new io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl();
    java.time.Clock clock1 = null;
    org.neo4j.configuration.Config config2 = null;
    io.github.onograph.dbms.crash.CrashSignaler crashSignaler3 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService4 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager discoveryRetryManager7 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager(
        (long) (byte) 9, (long) (short) 100);
    org.neo4j.scheduler.JobScheduler jobScheduler8 = null;
    org.neo4j.logging.LogProvider logProvider9 = null;
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray11 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList12 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList12,
        socketAddressArray11);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService14 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList12);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.cluster.raft.id.CoreNodeServerIdentity coreNodeServerIdentity16 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService pointInTimeBackupService17 = io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl.cosnoftPointInTimeBackupService(
        coreNodeServerIdentity16);
    org.neo4j.dbms.identity.ServerIdentity serverIdentity18 = null;
    org.neo4j.ssl.config.SslPolicyLoader sslPolicyLoader19 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService20 = clusterDiscoveryManagerAkkaImpl0.statosrClusterStructureService(
          clock1, config2, crashSignaler3, databaseStateService4, discoveryRetryManager7,
          jobScheduler8, logProvider9, logProvider10, memberNodeService14, monitors15,
          pointInTimeBackupService17, serverIdentity18, sslPolicyLoader19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(socketAddressArray11);
    //org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(memberNodeService14);
    org.junit.Assert.assertNotNull(pointInTimeBackupService17);
  }

  @Test
  public void test1416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1416");
    }
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog0 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long3 = inMemoryConsensusTransactionLog0.pass((long) 0, (long) (short) -1);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor consensusLogEntryRawCursor5 = inMemoryConsensusTransactionLog0.geercuoConsensusLogEntryRawCursor(
        (long) 1000);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertNotNull(consensusLogEntryRawCursor5);
  }

  @Test
  public void test1417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1417");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiartpoApplicationComProFamilyType();
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.RC + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.RC));
  }

  @Test
  public void test1418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1418");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.config.ClusterDiscoveryMode> clusterDiscoveryModeRef1 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter<io.github.onograph.config.ClusterDiscoveryMode> clusterDiscoveryModeMessageRequestChannelInboundHandlerAdapter2 = new io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter<io.github.onograph.config.ClusterDiscoveryMode>(
          logProvider0, clusterDiscoveryModeRef1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1419");
    }
    io.github.onograph.cluster.raft.netty.NettyEpollSettings<io.netty.channel.epoll.EpollServerSocketChannel> epollServerSocketChannelNettyEpollSettings0 = io.github.onograph.cluster.raft.netty.NettyEpollSettings.epsrciNettyEpollSettings();
    io.github.onograph.cluster.raft.netty.NettyKQueueSettings<io.netty.channel.kqueue.KQueueServerSocketChannel> kQueueServerSocketChannelNettyKQueueSettings1 = io.github.onograph.cluster.raft.netty.NettyKQueueSettings.kqesecfNettyKQueueSettings();
    java.util.concurrent.Executor executor2 = null;
    io.netty.channel.EventLoopGroup eventLoopGroup3 = kQueueServerSocketChannelNettyKQueueSettings1.evnloguEventLoopGroup(
        executor2);
    try {
      io.netty.channel.EventLoopGroup eventLoopGroup4 = epollServerSocketChannelNettyEpollSettings0.evnloguEventLoopGroup(
          executor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.UnsatisfiedLinkError; message: failed to load the required native library");
    } catch (java.lang.UnsatisfiedLinkError e) {
    }
    org.junit.Assert.assertNotNull(epollServerSocketChannelNettyEpollSettings0);
    org.junit.Assert.assertNotNull(kQueueServerSocketChannelNettyKQueueSettings1);
    org.junit.Assert.assertNotNull(eventLoopGroup3);
  }

  @Test
  public void test1420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1420");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotData snapshotData6 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotData(
        1536L, (long) ' ');
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.oncospoForCoSn(
          storeSyncCompletedCompletableFuture3, snapshotData6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test1421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1421");
    }
    io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta.MarshalChannelImplCMS.IT;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    org.neo4j.dbms.identity.ServerId serverId2 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId3 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId4 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier5 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray6 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier5};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet7 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet7,
        nodeGroupIdentifierArray6);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec9 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId3, consensusNodeId4,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet7);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta10 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress1, serverId2,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet7);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager11 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager11.beginChecksum();
    boolean boolean13 = loadBalanceServerMeta10.equals(
        (java.lang.Object) readablePositionAwareChecksumChannelManager11);
    try {
      io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta candidateTallyMeta14 = marshalChannelImplCMS0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier5);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray6);
    //org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    //org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test1422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1422");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    java.util.UUID uUID2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState3 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId0, consensusNodeId1, uUID2);
    org.neo4j.kernel.database.DatabaseId databaseId4 = askState3.daasidDatabaseId();
    org.neo4j.kernel.database.DatabaseId databaseId5 = askState3.daasidDatabaseId();
    org.junit.Assert.assertNull(databaseId4);
    org.junit.Assert.assertNull(databaseId5);
  }

  @Test
  public void test1423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1423");
    }
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog0 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long3 = inMemoryConsensusTransactionLog0.pass((long) 0, (long) (short) -1);
    boolean boolean5 = inMemoryConsensusTransactionLog0.equals((java.lang.Object) "protocols");
    io.github.onograph.cluster.raft.share.calg.cle.DelegatingConsensusTransactionLog delegatingConsensusTransactionLog6 = new io.github.onograph.cluster.raft.share.calg.cle.DelegatingConsensusTransactionLog(
        (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog) inMemoryConsensusTransactionLog0);
    long long7 = delegatingConsensusTransactionLog6.prvid();
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
  }

  @Test
  public void test1424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1424");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    java.nio.file.Path path5 = null;
    java.nio.file.Path[] pathArray6 = new java.nio.file.Path[]{path5};
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply setupGdbStoreSyncReply7 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(
        (long) '4', pathArray6);
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onsrltresForCoSe(
          storeSyncCompletedCompletableFuture3, setupGdbStoreSyncReply7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
    org.junit.Assert.assertNotNull(pathArray6);
    org.junit.Assert.assertNotNull(setupGdbStoreSyncReply7);
  }

  @Test
  public void test1425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1425");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl2 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler3 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl2);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceSimpleChannelInboundHandler sliceSimpleChannelInboundHandler4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceSimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl2);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    java.util.ArrayList<org.neo4j.internal.helpers.collection.Pair<java.lang.String, java.util.Optional<io.github.onograph.cluster.raft.control.MutableComProFamily>>> strPairList6 = new java.util.ArrayList<org.neo4j.internal.helpers.collection.Pair<java.lang.String, java.util.Optional<io.github.onograph.cluster.raft.control.MutableComProFamily>>>();
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols8 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    java.lang.String str9 = mutableProtocols8.getImpl();
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols10 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols11 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    io.github.onograph.cluster.raft.control.MutableComProFamily[] mutableComProFamilyArray12 = new io.github.onograph.cluster.raft.control.MutableComProFamily[]{
        mutableProtocols8, mutableProtocols10, mutableProtocols11};
    java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily> mutableComProFamilyList13 = new java.util.ArrayList<io.github.onograph.cluster.raft.control.MutableComProFamily>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList13,
        mutableComProFamilyArray12);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType15 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper comProFamilyWrapper16 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper(
        (java.util.List<io.github.onograph.cluster.raft.control.MutableComProFamily>) mutableComProFamilyList13,
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType15);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType17 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV;
    boolean boolean18 = applicationComProFamilyType15.isEq(
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType17);
    io.github.onograph.cluster.raft.control.connect.ClientException clientException19 = new io.github.onograph.cluster.raft.control.connect.ClientException(
        (java.util.List<org.neo4j.internal.helpers.collection.Pair<java.lang.String, java.util.Optional<io.github.onograph.cluster.raft.control.MutableComProFamily>>>) strPairList6,
        "LZ4_high_compression",
        (io.github.onograph.cluster.raft.control.ApplicationComProFamily) applicationComProFamilyType15);
    try {
      sliceSimpleChannelInboundHandler4.channelRead(channelHandlerContext5,
          (java.lang.Object) "LZ4_high_compression");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + mutableProtocols8 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols8.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Snappy" + "'", str9, "Snappy");
    org.junit.Assert.assertTrue("'" + mutableProtocols10 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols10.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertTrue("'" + mutableProtocols11 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols11.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertNotNull(mutableComProFamilyArray12);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType15 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType15.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType17 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType17.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    //org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test1426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1426");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_META;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_META
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_META));
  }

  @Test
  public void test1427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1427");
    }
    org.neo4j.dbms.identity.ServerId serverId0 = null;
    io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator consensusGdbServerCoordinator1 = io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator.emtofConsensusGdbServerCoordinator(
        serverId0);
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.id.ConsensusNodeId> databaseIdMap2 = consensusGdbServerCoordinator1.daatrmaMap();
    org.neo4j.dbms.identity.ServerId serverId3 = consensusGdbServerCoordinator1.getServerId();
    org.junit.Assert.assertNotNull(consensusGdbServerCoordinator1);
    org.junit.Assert.assertNotNull(databaseIdMap2);
    org.junit.Assert.assertNull(serverId3);
  }

  @Test
  public void test1428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1428");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaSafeChannelMarshal nodeServerMemberLeaderMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readablePositionAwareChecksumChannelManager1.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
    try {
      io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta5 = nodeServerMemberLeaderMetaSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMetaSafeChannelMarshal0);
  }

  @Test
  public void test1429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1429");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal readReplicateGdbMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal.IT;
    java.io.InputStream inputStream1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.ReadableChannelDataInputStreamImpl readableChannelDataInputStreamImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.ReadableChannelDataInputStreamImpl(
        inputStream1);
    try {
      io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta readReplicateGdbMeta3 = readReplicateGdbMetaSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableChannelDataInputStreamImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(readReplicateGdbMetaSafeChannelMarshal0);
  }

  @Test
  public void test1430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1430");
    }
    java.time.Clock clock0 = null;
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodesFactoryDefaultImpl consensusNodesFactoryDefaultImpl1 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodesFactoryDefaultImpl();
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy3 = null;
    org.neo4j.logging.LogProvider logProvider6 = null;
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog7 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long10 = inMemoryConsensusTransactionLog7.pass((long) 0, (long) (short) -1);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray14 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction15 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        10L, (long) 0, consensusLogEntryArray14);
    io.github.onograph.cluster.raft.module.cuprot.RefException refException16 = new io.github.onograph.cluster.raft.module.cuprot.RefException(
        "causal_clustering.load_balancing.config.server_policies",
        (java.lang.Object[]) consensusLogEntryArray14);
    long long17 = inMemoryConsensusTransactionLog7.apeForCo(consensusLogEntryArray14);
    io.github.onograph.cluster.raft.share.sync.SyncToManager syncToManager18 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta> nodeServerMemberTransactionLogDataMetaStateStorage19 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService memberNodesService20 = new io.github.onograph.cluster.raft.share.calg.mnode.MemberNodesService(
          clock0,
          (io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodes.ConsensusNodesFactory<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodesFactoryDefaultImpl1,
          100, consensusNodeIdLazy3, 1016L, (long) '4', logProvider6,
          (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogEntry) inMemoryConsensusTransactionLog7,
          syncToManager18, nodeServerMemberTransactionLogDataMetaStateStorage19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    org.junit.Assert.assertNotNull(consensusLogEntryArray14);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
  }

  @Test
  public void test1431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1431");
    }
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction findComAction2 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction(
        (long) (byte) 100, (java.lang.Object) "name");
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta4 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta3);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta5 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta6 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta5);
    akka.cluster.ddata.ReplicatedData replicatedData7 = syncedLeaderMeta4.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta6);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta8 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta9 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta8);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta10 = syncedLeaderMeta6.mergeData(
        syncedLeaderMeta9);
    boolean boolean11 = findComAction2.equals((java.lang.Object) syncedLeaderMeta6);
    org.neo4j.kernel.database.DatabaseTracers databaseTracers12 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction13 = null;
    org.neo4j.memory.MemoryTracker memoryTracker14 = null;
    org.neo4j.io.pagecache.PageCache pageCache15 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter16 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter(
        databaseTracers12, fileSystemAbstraction13, memoryTracker14, pageCache15);
    boolean boolean17 = findComAction2.equals((java.lang.Object) fileSystemAbstraction13);
    org.junit.Assert.assertNotNull(replicatedData7);
    org.junit.Assert.assertNotNull(syncedLeaderMeta10);
    //org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    //org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test1432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1432");
    }
    io.github.onograph.cluster.raft.control.AppComProFamilyGroupType appComProFamilyGroupType0 = io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo1 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType2 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer3 = applicationComProFamilyType2.getImpl();
    boolean boolean4 = viewClusterInfo1.equals((java.lang.Object) entProVer3);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType5 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer6 = applicationComProFamilyType5.getImpl();
    int int7 = entProVer3.compareTo(entProVer6);
    java.util.Optional<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyOptional8 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.finOptional(
        appComProFamilyGroupType0, entProVer6);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType9 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer10 = applicationComProFamilyType9.getImpl();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType11 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer12 = applicationComProFamilyType11.getImpl();
    int int13 = entProVer10.compareTo(entProVer12);
    java.util.Optional<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyOptional14 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.finOptional(
        appComProFamilyGroupType0, entProVer12);
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup15 = null;
    io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper applicationCurrentActiveComProFamilyWrapper16 = io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
        applicationComProFamilyComProFamilyGroup15);
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup17 = applicationCurrentActiveComProFamilyWrapper16.getComProFamilyGroupCtgrT();
    java.util.List<io.github.onograph.config.EntProVer> entProVerList18 = applicationCurrentActiveComProFamilyWrapper16.getListVrinU();
    io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper applicationCurrentActiveComProFamilyWrapper19 = io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper.foptoApplicationCurrentActiveComProFamilyWrapper(
        (io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily>) appComProFamilyGroupType0,
        entProVerList18);
    org.junit.Assert.assertTrue("'" + appComProFamilyGroupType0 + "' != '"
            + io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL + "'",
        appComProFamilyGroupType0.equals(
            io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL));
    org.junit.Assert.assertNotNull(viewClusterInfo1);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType2 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType2.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer3);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType5 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType5.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    org.junit.Assert.assertNotNull(applicationComProFamilyOptional8);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType9 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType9.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer10);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType11 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType11.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer12);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    org.junit.Assert.assertNotNull(applicationComProFamilyOptional14);
    org.junit.Assert.assertNotNull(applicationCurrentActiveComProFamilyWrapper16);
    org.junit.Assert.assertNull(applicationComProFamilyComProFamilyGroup17);
    org.junit.Assert.assertNotNull(entProVerList18);
    org.junit.Assert.assertNotNull(applicationCurrentActiveComProFamilyWrapper19);
  }

  @Test
  public void test1433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1433");
    }
    byte[] byteArray3 = new byte[]{(byte) 0, (byte) 10, (byte) -1};
    io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq defaultSDEmptyReq4 = new io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq(
        byteArray3);
    java.util.OptionalLong optionalLong5 = defaultSDEmptyReq4.sizOptionalLong();
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10, -1]");
    org.junit.Assert.assertNotNull(optionalLong5);
  }

  @Test
  public void test1434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1434");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.List<java.lang.String> strList3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta authMeta4 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta(
        strList3);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture5 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ongmarseForCoAu(authMeta4,
          storeSyncCompletedCompletableFuture5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test1435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1435");
    }
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException1 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData2 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        (java.lang.Exception) clusterDatabaseManagementException1);
    org.neo4j.kernel.api.exceptions.Status status3 = clusterDatabaseManagementException1.status();
    org.junit.Assert.assertNotNull(fSMData2);
    org.junit.Assert.assertTrue(
        "'" + status3 + "' != '" + org.neo4j.kernel.api.exceptions.Status.Database.Unknown + "'",
        status3.equals(org.neo4j.kernel.api.exceptions.Status.Database.Unknown));
  }

  @Test
  public void test1436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1436");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1 restartRules1_0 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.RestartRules1();
    akka.cluster.Cluster cluster1 = null;
    boolean boolean2 = restartRules1_0.isRerruForCl(cluster1);
    java.lang.String str3 = restartRules1_0.gersString();
    akka.cluster.Cluster cluster4 = null;
    boolean boolean5 = restartRules1_0.isRerruForCl(cluster4);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 != false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '"
            + "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$RestartRules1. Running every PT10S"
            + "'", str3,
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$RestartRules1. Running every PT10S");
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 != false);
  }

  @Test
  public void test1437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1437");
    }
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory0 = null;
    org.neo4j.kernel.impl.api.CommitProcessFactory commitProcessFactory1 = null;
    org.neo4j.graphdb.factory.module.id.DatabaseIdContext databaseIdContext2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl4 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator6 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier7 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl8 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService3, syncableLeasableCoreNodeDataFSMImpl4, namedDatabaseId5,
        syncerator6, consensusNodeIdSupplier7);
    org.neo4j.kernel.impl.locking.Locks locks9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService10 = null;
    org.neo4j.token.TokenHolders tokenHolders11 = null;
    io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper coreNodeWrapper12 = new io.github.onograph.cluster.raft.share.meta.CoreNodeWrapper(
        accessCapabilityFactory0, commitProcessFactory1, databaseIdContext2,
        (org.neo4j.kernel.impl.api.LeaseService) leaseServiceEnterpriseImpl8, locks9,
        coreGdbFSMService10, tokenHolders11);
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory13 = coreNodeWrapper12.getAccessCapabilityFactory();
    org.neo4j.graphdb.factory.module.id.DatabaseIdContext databaseIdContext14 = coreNodeWrapper12.getDatabaseIdContext();
    org.neo4j.kernel.impl.factory.AccessCapabilityFactory accessCapabilityFactory15 = coreNodeWrapper12.getAccessCapabilityFactory();
    org.junit.Assert.assertNull(accessCapabilityFactory13);
    org.junit.Assert.assertNull(databaseIdContext14);
    org.junit.Assert.assertNull(accessCapabilityFactory15);
  }

  @Test
  public void test1438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1438");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted transactionChunkingCompleted4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ontstfhrseForCoTr(
          storeSyncCompletedCompletableFuture3, transactionChunkingCompleted4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test1439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1439");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.MSG;
    byte byte1 = messageDataType0.getMcd();
    org.junit.Assert.assertTrue("'" + messageDataType0 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.MSG + "'",
        messageDataType0.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.MSG));
    org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 3 + "'", byte1 == (byte) 3);
  }

  @Test
  public void test1440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1440");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl4 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition5 = readableClosablePositionAwareChecksumChannelPassThruImpl4.getCurrentPosition();
    byte[] byteArray7 = new byte[]{(byte) 9};
    org.neo4j.kernel.database.DatabaseId databaseId8 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType10 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData11 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData(
        byteArray7, databaseId8, "name", replicaTokenType10);
    try {
      readableClosablePositionAwareChecksumChannelPassThruImpl4.get(byteArray7, (int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
    org.junit.Assert.assertNotNull(logPosition5);
    org.junit.Assert.assertNotNull(byteArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[9]");
  }

  @Test
  public void test1441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1441");
    }
    org.neo4j.graphdb.factory.module.GlobalModule globalModule0 = null;
    org.neo4j.ssl.config.SslPolicyLoader sslPolicyLoader1 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.CatchupManagerCoordinator catchupManagerCoordinator2 = io.github.onograph.cluster.raft.module.cuprot.CatchupManagerCoordinator.crechciCatchupManagerCoordinator(
          globalModule0, sslPolicyLoader1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1442");
    }
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta0 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta1 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer2 = clearStaleClusterMeta0.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) clearStaleClusterMeta1);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade4 = null;
    org.neo4j.logging.Log log5 = null;
    java.nio.file.Path path6 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo7 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path6);
    java.nio.file.Path path8 = clusterMetaTopologyInfo7.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat9 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv10 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction3, clusterSimpleStorageFacade4, log5, clusterMetaTopologyInfo7,
        clusterMetaFormat9);
    org.neo4j.logging.Log log11 = upgradeMetaEnv10.getLog();
    try {
      clearStaleClusterMeta0.accept(upgradeMetaEnv10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer2);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo7);
    org.junit.Assert.assertNull(path8);
    org.junit.Assert.assertNull(log11);
  }

  @Test
  public void test1443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1443");
    }
    akka.actor.ActorRef actorRef0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode removeReadReplicaNode1 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode(
        actorRef0);
    akka.actor.ActorRef actorRef2 = removeReadReplicaNode1.getMccActorRef();
    akka.actor.ActorRef actorRef3 = null;
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl4 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap5 = null;
    akka.actor.ActorRef actorRef6 = null;
    org.neo4j.dbms.identity.ServerId serverId7 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo updateReadReplicaInfo8 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo(
        actorRef3, gdbDiscoveryMetaReadReplicaImpl4, databaseIdMap5, actorRef6, serverId7);
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap9 = updateReadReplicaInfo8.getMapDsdd();
    boolean boolean10 = removeReadReplicaNode1.equals((java.lang.Object) updateReadReplicaInfo8);
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo11 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    akka.cluster.Member member12 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo13 = viewClusterInfo11.ignoreMember(
        member12);
    boolean boolean14 = updateReadReplicaInfo8.equals((java.lang.Object) viewClusterInfo11);
    org.junit.Assert.assertNull(actorRef2);
    org.junit.Assert.assertNull(databaseIdMap9);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(viewClusterInfo11);
    org.junit.Assert.assertNotNull(viewClusterInfo13);
    //org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test1444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1444");
    }
    io.github.onograph.cluster.raft.netty.NettyKQueueSettings<io.netty.channel.kqueue.KQueueSocketChannel> kQueueSocketChannelNettyKQueueSettings0 = io.github.onograph.cluster.raft.netty.NettyKQueueSettings.kqecncfNettyKQueueSettings();
    org.junit.Assert.assertNotNull(kQueueSocketChannelNettyKQueueSettings0);
  }

  @Test
  public void test1445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1445");
    }
    org.neo4j.kernel.KernelVersion kernelVersion0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation2 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply3 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply(
        kernelVersion0, storeId1, committedTransactionRepresentation2);
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation4 = catchupOutgoingTransactionPullReply3.getTCommittedTransactionRepresentation();
    org.neo4j.storageengine.api.StoreId storeId5 = catchupOutgoingTransactionPullReply3.getStoreId();
    org.junit.Assert.assertNull(committedTransactionRepresentation4);
    org.junit.Assert.assertNull(storeId5);
  }

  @Test
  public void test1446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1446");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureSafeChannelMarshal databaseCoreClusterStructureSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure databaseCoreClusterStructure1 = null;
    org.neo4j.io.fs.WritableChannel writableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl3 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel2);
    writableChecksumChannelImpl3.beginChecksum();
    try {
      databaseCoreClusterStructureSafeChannelMarshal0.marshal(databaseCoreClusterStructure1,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseCoreClusterStructureSafeChannelMarshal0);
  }

  @Test
  public void test1447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1447");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ConsensusDatabaseIdWrapperJSerializer consensusDatabaseIdWrapperJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.ConsensusDatabaseIdWrapperJSerializer();
    boolean boolean1 = consensusDatabaseIdWrapperJSerializer0.includeManifest();
    io.github.onograph.cluster.raft.control.AppComProFamilyGroupType appComProFamilyGroupType2 = io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo3 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType4 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer5 = applicationComProFamilyType4.getImpl();
    boolean boolean6 = viewClusterInfo3.equals((java.lang.Object) entProVer5);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType7 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer8 = applicationComProFamilyType7.getImpl();
    int int9 = entProVer5.compareTo(entProVer8);
    java.util.Optional<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyOptional10 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.finOptional(
        appComProFamilyGroupType2, entProVer8);
    try {
      byte[] byteArray11 = consensusDatabaseIdWrapperJSerializer0.toBinary(
          (java.lang.Object) appComProFamilyGroupType2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class io.github.onograph.cluster.raft.control.AppComProFamilyGroupType cannot be cast to class io.github.onograph.cluster.raft.id.ConsensusMemberGroupId (io.github.onograph.cluster.raft.control.AppComProFamilyGroupType and io.github.onograph.cluster.raft.id.ConsensusMemberGroupId are in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
    //org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertTrue("'" + appComProFamilyGroupType2 + "' != '"
            + io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL + "'",
        appComProFamilyGroupType2.equals(
            io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL));
    org.junit.Assert.assertNotNull(viewClusterInfo3);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType4 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType4.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer5);
    //org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType7 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType7.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertNotNull(applicationComProFamilyOptional10);
  }

  @Test
  public void test1448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1448");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId3 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId4 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask8 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask(
        consensusNodeId3, consensusNodeId4, (long) 1016, (long) (byte) 10, (long) (short) -1);
    long long9 = ask8.getLgIll();
    try {
      java.lang.Void void10 = processorImpl2.process(ask8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1016L + "'", long9 == 1016L);
  }

  @Test
  public void test1449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1449");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdMessageToByteEncoder gdbIdMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdMessageToByteEncoder();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.ExitMeta exitMeta1 = io.github.onograph.cluster.raft.module.cuprot.scmeta.ExitMeta.CONDI_EXIT_META;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.ExitMeta exitMeta2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.ExitMeta.CONDI_EXIT_META;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.ExitMeta exitMeta3 = exitMeta1.andExitMeta(
        exitMeta2);
    boolean boolean4 = gdbIdMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) exitMeta1);
    org.junit.Assert.assertNotNull(exitMeta1);
    org.junit.Assert.assertNotNull(exitMeta2);
    org.junit.Assert.assertNotNull(exitMeta3);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1450");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    try {
      io.github.onograph.cluster.raft.utils.GdbUtilWrapper gdbUtilWrapper2 = new io.github.onograph.cluster.raft.utils.GdbUtilWrapper(
          databaseManagementService0, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1451");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    int int4 = readableClosablePositionAwareChecksumChannelPassThruImpl1.endChecksumAndValidate();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl5 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
    try {
      boolean boolean6 = io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler.isUnahForRe(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
  }

  @Test
  public void test1452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1452");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    java.lang.String[] strArray8 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet9 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray8);
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet10 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray8);
    org.neo4j.kernel.database.DatabaseId[] databaseIdArray11 = new org.neo4j.kernel.database.DatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId> databaseIdSet12 = new java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.DatabaseId>) databaseIdSet12,
        databaseIdArray11);
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl14 = new io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl(
        discoverySocketAddresses0, socketAddress1, nodeGroupIdentifierSet10,
        (java.util.Set<org.neo4j.kernel.database.DatabaseId>) databaseIdSet12);
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting15 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingReeasolaiInteger;
    boolean boolean16 = gdbDiscoveryMetaReadReplicaImpl14.equals((java.lang.Object) intSetting15);
    org.neo4j.configuration.helpers.SocketAddress socketAddress17 = gdbDiscoveryMetaReadReplicaImpl14.cacpsrrSocketAddress();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.module.dprot.DiscoveryAddressesProvider> discoveryAddressesProviderDataManagerFactory18 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        (io.github.onograph.cluster.raft.module.dprot.DiscoveryAddressesProvider) gdbDiscoveryMetaReadReplicaImpl14);
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet9);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet10);
    org.junit.Assert.assertNotNull(databaseIdArray11);
    //org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(intSetting15);
    //org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNull(socketAddress17);
    org.junit.Assert.assertNotNull(discoveryAddressesProviderDataManagerFactory18);
  }

  @Test
  public void test1453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1453");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType1 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper socketAddressWrapper2 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
        socketAddress0, socketAddressSchemeType1);
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting3 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingExiatoBoolean;
    boolean boolean4 = socketAddressWrapper2.equals((java.lang.Object) booleanSetting3);
    org.junit.Assert.assertNotNull(booleanSetting3);
    //org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1454");
    }
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog0 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long3 = inMemoryConsensusTransactionLog0.pass((long) 0, (long) (short) -1);
    boolean boolean5 = inMemoryConsensusTransactionLog0.equals((java.lang.Object) "protocols");
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry10 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray11 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry10};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction12 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray11);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction13 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 100, 1536L, consensusLogEntryArray11);
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction16 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray11, (long) (byte) 0, (int) (short) 1);
    try {
      long long17 = inMemoryConsensusTransactionLog0.apeForCo(consensusLogEntryArray11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(consensusLogEntryArray11);
  }

  @Test
  public void test1455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1455");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData3 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData(
        databaseId0, 2, consensusNodeId2);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId4 = syncableLeasableCoreNodeData3.oweObject();
    org.junit.Assert.assertNull(consensusNodeId4);
  }

  @Test
  public void test1456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1456");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply3 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        consensusNodeId0, false, 100L);
    long long4 = reply3.getLgT();
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
  }

  @Test
  public void test1457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1457");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl3 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler2, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler5 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseIdInboundHandler storeDatabaseIdInboundHandler6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId7 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg8 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg(
        consensusNodeId7);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel9 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl10 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl11 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel9, safeStateMarshalImpl10);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk12 = null;
    java.lang.Void void13 = processorImpl11.process(bulkAsk12);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage14 = null;
    java.lang.Void void15 = processorImpl11.process(logClipRequestMessage14);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage16 = null;
    java.lang.Void void17 = processorImpl11.process(aliveReplyMessage16);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId18 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId19 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier20 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray21 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier20};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet22 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean23 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet22,
        nodeGroupIdentifierArray21);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec24 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId18, consensusNodeId19,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet22);
    java.lang.Void void25 = processorImpl11.process(leaderRec24);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage26 = null;
    java.lang.Void void27 = processorImpl11.process(aliveReplyMessage26);
    java.lang.Void void28 = aliveMsg8.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl11);
    boolean boolean29 = storeDatabaseIdInboundHandler6.acceptInboundMessage(
        (java.lang.Object) processorImpl11);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId30 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress33 = null;
    org.neo4j.dbms.identity.ServerId serverId34 = null;
    java.lang.String[] strArray41 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet42 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray41);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta43 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress33, serverId34, nodeGroupIdentifierSet42);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange44 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(
        consensusNodeId30, (long) 1536, (long) (byte) 0, nodeGroupIdentifierSet42);
    long long45 = askToChange44.getLgT();
    try {
      java.lang.Void void46 = processorImpl11.process(askToChange44);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void13);
    org.junit.Assert.assertNull(void15);
    org.junit.Assert.assertNull(void17);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier20);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray21);
    //org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNull(void25);
    org.junit.Assert.assertNull(void27);
    org.junit.Assert.assertNull(void28);
    //org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(strArray41);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet42);
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
  }

  @Test
  public void test1458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1458");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl4 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition5 = readableClosablePositionAwareChecksumChannelPassThruImpl4.getCurrentPosition();
    int int6 = readableClosablePositionAwareChecksumChannelPassThruImpl4.endChecksumAndValidate();
    org.junit.Assert.assertNotNull(logPosition3);
    org.junit.Assert.assertNotNull(logPosition5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
  }

  @Test
  public void test1459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1459");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorDefinedLengthImpl<java.lang.reflect.GenericDeclaration> genericDeclarationRuleProcessorDefinedLengthImpl1 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorDefinedLengthImpl<java.lang.reflect.GenericDeclaration>(
        0);
  }

  @Test
  public void test1460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1460");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    java.nio.file.DirectoryStream.Filter<java.nio.file.Path> pathFilter1 = null;
    org.neo4j.io.pagecache.PageCache pageCache2 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources storeResources3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources(
        fileSystemAbstraction0, pathFilter1, pageCache2);
    org.neo4j.kernel.database.Database database4 = null;
    org.neo4j.kernel.impl.transaction.log.files.LogFiles logFiles5 = null;
    io.github.onograph.dbms.DbmsManagerClusterImpl dbmsManagerClusterImpl6 = new io.github.onograph.dbms.DbmsManagerClusterImpl();
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer7 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment storeSyncEnvironment8 = new io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment(
          storeResources3, database4, logFiles5, dbmsManagerClusterImpl6, pageCacheTracer7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1461");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusSnapshotDataInfo consensusSnapshotDataInfo1 = new io.github.onograph.cluster.raft.id.ConsensusSnapshotDataInfo(
        consensusMemberGroupId0);
    java.util.Optional<io.github.onograph.cluster.raft.share.meta.pit.SnapshotData> snapshotDataOptional2 = consensusSnapshotDataInfo1.snpoOptional();
    java.util.Optional<io.github.onograph.cluster.raft.share.meta.pit.SnapshotData> snapshotDataOptional3 = consensusSnapshotDataInfo1.snpoOptional();
    org.junit.Assert.assertNotNull(snapshotDataOptional2);
    org.junit.Assert.assertNotNull(snapshotDataOptional3);
  }

  @Test
  public void test1462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1462");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder askMessageTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder();
    java.lang.String[] strArray7 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet8 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray7);
    java.util.List<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierList9 = io.github.onograph.config.NodeGroupIdentifier.litoList(
        strArray7);
    boolean boolean10 = askMessageTypeMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) strArray7);
    boolean boolean11 = askMessageTypeMessageToByteEncoder0.isSharable();
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId12 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId13 = null;
    java.time.Duration duration14 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId setupConsensusDatabaseId15 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.SetupConsensusDatabaseId(
        consensusMemberGroupId12, consensusNodeId13, duration14);
    java.time.Duration duration16 = setupConsensusDatabaseId15.getTmotDuration();
    boolean boolean17 = askMessageTypeMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) setupConsensusDatabaseId15);
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierList9);
    //org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    //org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(duration16);
    //org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test1463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1463");
    }
    byte[] byteArray1 = io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogHeadWrapper.enelinastha(
        (long) 100);
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1),
        "[0, 0, 0, 0, 0, 0, 0, 100]");
  }

  @Test
  public void test1464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1464");
    }
    java.io.InputStream inputStream0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.ReadableChannelDataInputStreamImpl readableChannelDataInputStreamImpl1 = new io.github.onograph.cluster.raft.akkamsg.serialization.ReadableChannelDataInputStreamImpl(
        inputStream0);
    try {
      int int2 = readableChannelDataInputStreamImpl1.getInt();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1465");
    }
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaJobEventService readReplicaJobEventService0 = null;
    org.neo4j.logging.Log log3 = null;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaTransactionBlockProcessor readReplicaTransactionBlockProcessor4 = null;
    io.github.onograph.cluster.raft.readreplica.tx.TxCancelable txCancelable5 = null;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask readReplicaGetChangesTask6 = new io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaGetChangesTask(
        readReplicaJobEventService0, (long) 1016, (long) 1016, log3,
        readReplicaTransactionBlockProcessor4, txCancelable5);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted> transactionChunkingCompletedCompletableFuture7 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId8 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply11 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
        consensusNodeId8, true, (long) 1015);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType13 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted14 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted(
        0L, setupGdbSyncReplyStateType13);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType15 = storeSyncCompleted14.getStat();
    boolean boolean16 = reply11.equals((java.lang.Object) storeSyncCompleted14);
    try {
      readReplicaGetChangesTask6.onfesaceForCoSt(transactionChunkingCompletedCompletableFuture7,
          storeSyncCompleted14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType13 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType13.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType15 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType15.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
    //org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test1466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1466");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaiasSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test1467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1467");
    }
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotData snapshotData2 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotData(
        0L, (long) 0);
    long long3 = snapshotData2.getBefTLng();
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
  }

  @Test
  public void test1468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1468");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray0 = io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry.emtConsensusLogEntryArray;
    org.junit.Assert.assertNotNull(consensusLogEntryArray0);
  }

  @Test
  public void test1469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1469");
    }
    io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceNOOPImpl<java.lang.String> strConsensusMessageLogServiceNOOPImpl0 = new io.github.onograph.cluster.raft.logservice.ConsensusMessageLogServiceNOOPImpl<java.lang.String>();
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler4 = null;
    org.neo4j.logging.Log log5 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler6 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler7 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl8 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler9 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler7, refCatchupManagerImpl8);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler10 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler6, refCatchupManagerImpl8);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler11 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler4, log5, refCatchupManagerImpl8);
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler catchupIncomingTransactionReplySimpleChannelInboundHandler12 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler(
        catchupAnswerLimitHandler3, refCatchupManagerImpl8);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler13 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler2, refCatchupManagerImpl8);
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsInboundHandler allGdbIdsInboundHandler14 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl8);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId15 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId16 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask20 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId15, consensusNodeId16, (long) '4', (long) (short) -1, 1L);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId21 = ask20.getCniaeConsensusNodeId();
    boolean boolean22 = allGdbIdsInboundHandler14.acceptInboundMessage((java.lang.Object) ask20);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId24 = null;
    strConsensusMessageLogServiceNOOPImpl0.loiodForNaMECo(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) ask20,
        "", namedDatabaseId24);
    org.junit.Assert.assertNull(consensusNodeId21);
    //org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
  }

  @Test
  public void test1470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1470");
    }
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId0 = null;
    org.neo4j.token.TokenRegistry tokenRegistry1 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator2 = null;
    org.neo4j.internal.id.IdGeneratorFactory idGeneratorFactory3 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.StorageEngine> storageEngineSupplier4 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer5 = null;
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder labelTokenHolder7 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.LabelTokenHolder(
        namedDatabaseId0, tokenRegistry1, syncerator2, idGeneratorFactory3, storageEngineSupplier4,
        pageCacheTracer5, databaseReadOnlyChecker6);
    try {
      int int9 = labelTokenHolder7.getOrCreateId("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1471");
    }
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog0 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long3 = inMemoryConsensusTransactionLog0.pass((long) 0, (long) (short) -1);
    boolean boolean5 = inMemoryConsensusTransactionLog0.equals((java.lang.Object) "protocols");
    try {
      inMemoryConsensusTransactionLog0.trnt((long) 4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: 0722f973-dbd9-46ea-82e7-5cdc69f835ce");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test1472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1472");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl3 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler2, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler5 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataInboundHandler snapshotDataInboundHandler6 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.control.ApplicationComProFamily[]> applicationComProFamilyArrayDataManagerFactory8 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.emuiDataManagerFactory();
    try {
      snapshotDataInboundHandler6.channelRead(channelHandlerContext7,
          (java.lang.Object) applicationComProFamilyArrayDataManagerFactory8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(applicationComProFamilyArrayDataManagerFactory8);
  }

  @Test
  public void test1473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1473");
    }
    io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service.Spec.PortInfo portInfo0 = new io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service.Spec.PortInfo();
    portInfo0.sept((int) ' ');
    int int3 = portInfo0.getPortNumber();
    portInfo0.sept((int) (byte) 9);
    int int6 = portInfo0.getPortNumber();
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
  }

  @Test
  public void test1474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1474");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId0, storeId1, (long) (byte) 10, path3);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService5 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations6 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager7 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl8 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService5, leaderOperations6, namedServiceApproachManager7);
    boolean boolean9 = requestStoreResource4.equals(
        (java.lang.Object) socketAddressServiceLeaderImpl8);
    org.neo4j.storageengine.api.StoreId storeId10 = requestStoreResource4.getEpceStoreId();
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType11 = requestStoreResource4.getTNme();
    //org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNull(storeId10);
    org.junit.Assert.assertTrue("'" + askMessageType11 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SC_FP + "'",
        askMessageType11.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SC_FP));
  }

  @Test
  public void test1475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1475");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl2 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler storeSyncCompletedSimpleChannelInboundHandler3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl2);
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType4 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.F_HDR_VAL;
    boolean boolean5 = refCatchupManagerImpl2.isExcnForE(catchupManagerStatusType4);
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler6 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl2);
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType4 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.F_HDR_VAL
        + "'", catchupManagerStatusType4.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.F_HDR_VAL));
    //org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test1476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1476");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.AskState.AskStateSafeChannelMarshal askStateSafeChannelMarshal0 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState.AskStateSafeChannelMarshal();
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    java.util.UUID uUID3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState4 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId1, consensusNodeId2, uUID3);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId5 = askState4.getImConsensusNodeId();
    org.neo4j.io.fs.WritableChannel writableChannel6 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl7 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel6);
    writableChecksumChannelImpl7.beginChecksum();
    try {
      askStateSafeChannelMarshal0.marshal(askState4,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(consensusNodeId5);
  }

  @Test
  public void test1477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1477");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.BulkTLCRequestBuilder bulkTLCRequestBuilder6 = new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.BulkTLCRequestBuilder(
        0L, (long) 100, consensusNodeId2, 1002, 100L, (long) (byte) -1);
  }

  @Test
  public void test1478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1478");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaInboundHandler authMetaInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta> replicationSessionManagerMetaStateStorage4 = null;
    io.github.onograph.cluster.raft.ClusterSessionManager clusterSessionManager5 = new io.github.onograph.cluster.raft.ClusterSessionManager(
        replicationSessionManagerMetaStateStorage4);
    try {
      authMetaInboundHandler2.channelRead(channelHandlerContext3,
          (java.lang.Object) replicationSessionManagerMetaStateStorage4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1479");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResourceMessageToByteEncoder requestStoreResourceMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResourceMessageToByteEncoder();
  }

  @Test
  public void test1480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1480");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage5 = null;
    java.lang.Void void6 = processorImpl2.process(logClipRequestMessage5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage7 = null;
    java.lang.Void void8 = processorImpl2.process(aliveReplyMessage7);
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl9 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply10 = null;
    java.lang.Boolean boolean11 = messageProcessorImpl9.process(reply10);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel12 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl13 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl14 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel12, safeStateMarshalImpl13);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk15 = null;
    java.lang.Void void16 = processorImpl14.process(bulkAsk15);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage17 = null;
    java.lang.Void void18 = processorImpl14.process(logClipRequestMessage17);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage19 = null;
    java.lang.Void void20 = processorImpl14.process(aliveReplyMessage19);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId21 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout22 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
        consensusNodeId21);
    java.lang.Void void23 = processorImpl14.process(consensusElectionTimeout22);
    java.lang.Boolean boolean24 = messageProcessorImpl9.process(consensusElectionTimeout22);
    java.lang.Void void25 = processorImpl2.process(consensusElectionTimeout22);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk26 = null;
    java.lang.Void void27 = processorImpl2.process(bulkAsk26);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId28 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress31 = null;
    org.neo4j.dbms.identity.ServerId serverId32 = null;
    java.lang.String[] strArray39 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet40 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray39);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta41 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress31, serverId32, nodeGroupIdentifierSet40);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange42 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange(
        consensusNodeId28, (long) 1536, (long) (byte) 0, nodeGroupIdentifierSet40);
    long long43 = askToChange42.getLgT();
    try {
      java.lang.Void void44 = processorImpl2.process(askToChange42);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNotNull(messageProcessorImpl9);
    org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    org.junit.Assert.assertNull(void16);
    org.junit.Assert.assertNull(void18);
    org.junit.Assert.assertNull(void20);
    org.junit.Assert.assertNull(void23);
    org.junit.Assert.assertEquals("'" + boolean24 + "' != '" + true + "'", boolean24, true);
    org.junit.Assert.assertNull(void25);
    org.junit.Assert.assertNull(void27);
    org.junit.Assert.assertNotNull(strArray39);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet40);
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
  }

  @Test
  public void test1481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1481");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    consensusLogCacheServiceNoopImpl0.trnt(0L);
    consensusLogCacheServiceNoopImpl0.trnt((long) 'h');
    consensusLogCacheServiceNoopImpl0.trnt((long) (byte) 8);
  }

  @Test
  public void test1482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1482");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusSnapshotDataInfo consensusSnapshotDataInfo1 = new io.github.onograph.cluster.raft.id.ConsensusSnapshotDataInfo(
        consensusMemberGroupId0);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId2 = consensusSnapshotDataInfo1.getConsensusMemberGroupId();
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId3 = consensusSnapshotDataInfo1.getConsensusMemberGroupId();
    org.junit.Assert.assertNull(consensusMemberGroupId2);
    org.junit.Assert.assertNull(consensusMemberGroupId3);
  }

  @Test
  public void test1483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1483");
    }
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade0 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction1 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule2 = null;
    org.neo4j.memory.MemoryTracker memoryTracker3 = null;
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier6 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper7 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder8 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade0, namedDatabaseIdFunction1, globalModule2, memoryTracker3,
        clusterMetaTopologyInfo5, nodeGroupIdentifierSetSupplier6, leaderGatekeeper7);
    try {
      java.nio.file.Path path10 = clusterMetaTopologyInfo5.rametfePath("status");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
  }

  @Test
  public void test1484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1484");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress2 = null;
    org.neo4j.dbms.identity.ServerId serverId3 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress4 = null;
    org.neo4j.dbms.identity.ServerId serverId5 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress6 = null;
    org.neo4j.dbms.identity.ServerId serverId7 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId8 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId9 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier10 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray11 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier10};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet12 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet12,
        nodeGroupIdentifierArray11);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec14 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId8, consensusNodeId9,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet12);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta15 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress6, serverId7,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet12);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta16 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress4, serverId5,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet12);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta17 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress2, serverId3,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet12);
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses18 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress19 = null;
    java.lang.String[] strArray26 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet27 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray26);
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet28 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray26);
    org.neo4j.kernel.database.DatabaseId[] databaseIdArray29 = new org.neo4j.kernel.database.DatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId> databaseIdSet30 = new java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId>();
    boolean boolean31 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.DatabaseId>) databaseIdSet30,
        databaseIdArray29);
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl32 = new io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl(
        discoverySocketAddresses18, socketAddress19, nodeGroupIdentifierSet28,
        (java.util.Set<org.neo4j.kernel.database.DatabaseId>) databaseIdSet30);
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting33 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingReeasolaiInteger;
    boolean boolean34 = gdbDiscoveryMetaReadReplicaImpl32.equals((java.lang.Object) intSetting33);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta35 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta36 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta35);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta37 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta38 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta37);
    akka.cluster.ddata.ReplicatedData replicatedData39 = syncedLeaderMeta36.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta38);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta40 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta41 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta40);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta42 = syncedLeaderMeta38.mergeData(
        syncedLeaderMeta41);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta43 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta44 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta43);
    akka.cluster.ddata.ReplicatedData replicatedData45 = syncedLeaderMeta41.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta44);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta46 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta47 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta46);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta48 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta49 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta48);
    akka.cluster.ddata.ReplicatedData replicatedData50 = syncedLeaderMeta47.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta49);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta51 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta52 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta51);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta53 = syncedLeaderMeta49.mergeData(
        syncedLeaderMeta52);
    akka.cluster.ddata.ReplicatedData replicatedData54 = syncedLeaderMeta41.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta53);
    boolean boolean55 = gdbDiscoveryMetaReadReplicaImpl32.equals(
        (java.lang.Object) replicatedData54);
    java.util.Set<org.neo4j.kernel.database.DatabaseId> databaseIdSet56 = gdbDiscoveryMetaReadReplicaImpl32.stedaiSet();
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl57 = new io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl(
        discoverySocketAddresses0, socketAddress1,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet12,
        databaseIdSet56);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier10);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray11);
    //org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(strArray26);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet27);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet28);
    org.junit.Assert.assertNotNull(databaseIdArray29);
    //org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(intSetting33);
    //org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertNotNull(replicatedData39);
    org.junit.Assert.assertNotNull(syncedLeaderMeta42);
    org.junit.Assert.assertNotNull(replicatedData45);
    org.junit.Assert.assertNotNull(replicatedData50);
    org.junit.Assert.assertNotNull(syncedLeaderMeta53);
    org.junit.Assert.assertNotNull(replicatedData54);
    //org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    org.junit.Assert.assertNotNull(databaseIdSet56);
  }

  @Test
  public void test1485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1485");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller actionMarshaller0 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller();
  }

  @Test
  public void test1486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1486");
    }
    io.github.onograph.cluster.raft.control.PipelineBuilderManager pipelineBuilderManager0 = io.github.onograph.cluster.raft.control.PipelineBuilderManager.inerPipelineBuilderManager();
    io.netty.channel.Channel channel1 = null;
    org.neo4j.logging.Log log2 = null;
    try {
      io.github.onograph.cluster.raft.control.ClientPipelineService clientPipelineService3 = pipelineBuilderManager0.cleClientPipelineService(
          channel1, log2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pipelineBuilderManager0);
  }

  @Test
  public void test1487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1487");
    }
    io.github.onograph.cluster.raft.control.connect.ProComAttributeKey proComAttributeKey0 = new io.github.onograph.cluster.raft.control.connect.ProComAttributeKey();
  }

  @Test
  public void test1488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1488");
    }
    java.time.Clock clock0 = null;
    java.time.Duration duration1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply> replyTransferCollection2 = new io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply>(
          clock0, duration1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1489");
    }
    io.netty.bootstrap.Bootstrap bootstrap0 = null;
    io.netty.channel.pool.ChannelPoolHandler channelPoolHandler1 = null;
    io.github.onograph.cluster.raft.netty.NettyChannelPoolBuilder nettyChannelPoolBuilder2 = null;
    io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl lBNettyChannelPoolMapImpl4 = new io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl(
        bootstrap0, channelPoolHandler1, nettyChannelPoolBuilder2, (int) (byte) 9);
    int int5 = lBNettyChannelPoolMapImpl4.size();
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test1490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1490");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotData snapshotData6 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotData(
        0L, (long) 0);
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.oncospoForCoSn(
          storeSyncCompletedCompletableFuture3, snapshotData6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test1491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1491");
    }
    org.neo4j.memory.MemoryTracker memoryTracker0 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout1 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer clusterMemberSyncer2 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer(
        memoryTracker0, neo4jLayout1);
    io.github.onograph.cluster.raft.control.connect.HandshakeClientMessageProcessorDefaultImpl handshakeClientMessageProcessorDefaultImpl3 = null;
    io.github.onograph.cluster.raft.control.connect.ClientHandshakeSimpleChannelInboundHandler clientHandshakeSimpleChannelInboundHandler4 = new io.github.onograph.cluster.raft.control.connect.ClientHandshakeSimpleChannelInboundHandler(
        handshakeClientMessageProcessorDefaultImpl3);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager consensusTransactionLogMetaLRUCacheManager6 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager(
        (int) (byte) 1);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager9 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel10 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl11 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel10);
    readablePositionAwareChecksumChannelManager9.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl11);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition13 = readablePositionAwareChecksumChannelManager9.getCurrentPosition();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo consensusTransactionLogInfo14 = consensusTransactionLogMetaLRUCacheManager6.cahmedaConsensusTransactionLogMetaLRUCacheManagerConsensusTransactionLogInfo(
        (long) (byte) 9, 1L, logPosition13);
    boolean boolean15 = clientHandshakeSimpleChannelInboundHandler4.acceptInboundMessage(
        (java.lang.Object) consensusTransactionLogInfo14);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade17 = null;
    org.neo4j.logging.Log log18 = null;
    java.nio.file.Path path19 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo20 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path19);
    java.nio.file.Path path21 = clusterMetaTopologyInfo20.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat22 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv23 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction16, clusterSimpleStorageFacade17, log18, clusterMetaTopologyInfo20,
        clusterMetaFormat22);
    org.neo4j.logging.Log log24 = upgradeMetaEnv23.getLog();
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo25 = upgradeMetaEnv23.getLscClusterMetaTopologyInfo();
    boolean boolean26 = clientHandshakeSimpleChannelInboundHandler4.acceptInboundMessage(
        (java.lang.Object) upgradeMetaEnv23);
    try {
      clusterMemberSyncer2.pefmseForUp(upgradeMetaEnv23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition13);
    org.junit.Assert.assertNotNull(consensusTransactionLogInfo14);
    //org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo20);
    org.junit.Assert.assertNull(path21);
    org.junit.Assert.assertNull(log24);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo25);
    //org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
  }

  @Test
  public void test1492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1492");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingExiacroBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test1493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1493");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData3 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData(
        databaseId0, (int) (byte) 8, consensusNodeId2);
  }

  @Test
  public void test1494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1494");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.memory.MemoryTracker memoryTracker1 = null;
    org.neo4j.io.marshal.StateMarshal<scala.Equals> equalsStateMarshal2 = null;
    io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService<scala.Equals> equalsCoreMetaManagementService3 = new io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService<scala.Equals>(
        fileSystemAbstraction0, memoryTracker1, equalsStateMarshal2);
    java.nio.file.Path path4 = null;
    java.nio.file.Path path5 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService.CoreMetaRecoveryInfo<scala.Equals> equalsCoreMetaRecoveryInfo6 = null;
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1495");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    boolean boolean2 = viewClusterInfo0.equals((java.lang.Object) "FollowerStates{}");
    java.util.Set<akka.cluster.Member> memberSet3 = viewClusterInfo0.getSetUrahbMember();
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(memberSet3);
  }

  @Test
  public void test1496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1496");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    java.lang.String str1 = applicationComProFamilyType0.caerString();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType0.getImpl();
    int int3 = entProVer2.getIMjr();
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "catchup_protocol" + "'", str1,
        "catchup_protocol");
    org.junit.Assert.assertNotNull(entProVer2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
  }

  @Test
  public void test1497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1497");
    }
    org.neo4j.ssl.SslPolicy sslPolicy0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.SSLEngineProviderDefaultImpl sSLEngineProviderDefaultImpl1 = new io.github.onograph.cluster.raft.module.dprot.SSLEngineProviderDefaultImpl(
          sslPolicy0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1498");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl discoverySocketAddressManagerDefaultImpl0 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl();
    boolean boolean1 = discoverySocketAddressManagerDefaultImpl0.isUsord();
    boolean boolean2 = discoverySocketAddressManagerDefaultImpl0.isUsord();
    boolean boolean3 = discoverySocketAddressManagerDefaultImpl0.isUsord();
    //org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    //org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    //org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
  }

  @Test
  public void test1499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1499");
    }
    io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType leadershipBalancingApproachType0 = io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType.LBAT_SPLIT;
    org.junit.Assert.assertTrue("'" + leadershipBalancingApproachType0 + "' != '"
        + io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType.LBAT_SPLIT
        + "'", leadershipBalancingApproachType0.equals(
        io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType.LBAT_SPLIT));
  }

  @Test
  public void test1500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1500");
    }
    java.time.Clock clock0 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher inactiveNodeWatcher3 = new io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher(
        clock0, (long) 10, log2);
  }
}
