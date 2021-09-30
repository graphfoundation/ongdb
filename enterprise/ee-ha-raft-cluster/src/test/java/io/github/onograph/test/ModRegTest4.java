package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest4 {

  public static boolean debug = false;

  @Test
  public void test2001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2001");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType0 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_BAD_GDB_ERR;
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_BAD_GDB_ERR
        + "'", setupGdbSyncReplyStateType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_BAD_GDB_ERR));
  }

  @Test
  public void test2002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2002");
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
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog19 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long21 = inMemoryConsensusTransactionLog19.prn((long) 1536);
    long long23 = inMemoryConsensusTransactionLog19.redettm(0L);
    io.github.onograph.cluster.raft.share.calg.cle.DelegatingConsensusTransactionLog delegatingConsensusTransactionLog24 = new io.github.onograph.cluster.raft.share.calg.cle.DelegatingConsensusTransactionLog(
        (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog) inMemoryConsensusTransactionLog19);
    org.neo4j.logging.Log log25 = null;
    bulkAddAction10.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog) delegatingConsensusTransactionLog24,
        log25);
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog27 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long28 = inMemoryConsensusTransactionLog27.apeie();
    org.neo4j.logging.Log log29 = null;
    bulkAddAction10.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog) inMemoryConsensusTransactionLog27,
        log29);
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    org.junit.Assert.assertNotNull(consensusLogEntryArray18);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1536L + "'", long21 == 1536L);
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
  }

  @Test
  public void test2003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2003");
    }
    io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta replicationSessionManagerMeta0 = new io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta();
    java.lang.Object obj1 = null;
    boolean boolean2 = replicationSessionManagerMeta0.equals(obj1);
    io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta replicationSessionManagerMeta3 = replicationSessionManagerMeta0.neitcReplicationSessionManagerMeta();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType4 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV;
    boolean boolean5 = replicationSessionManagerMeta3.equals(
        (java.lang.Object) applicationComProFamilyType4);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(replicationSessionManagerMeta3);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType4 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType4.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test2004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2004");
    }
    java.util.Map<java.lang.String, java.net.InetAddress[]> strMap0 = null;
    io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl domainToInetAddressProviderConfImpl1 = new io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl(
        strMap0);
    try {
      java.net.InetAddress[] inetAddressArray3 = domainToInetAddressProviderConfImpl1.revdanmInetAddress(
          "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2005");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver6 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    livingCacheObserver6.sememt((int) 'a');
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl9 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        32, false, (long) 13, livingCacheObserver6);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl10 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        32, true, (long) 32, livingCacheObserver6);
    org.junit.Assert.assertNotNull(livingCacheObserver6);
  }

  @Test
  public void test2006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2006");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady consensusGdbsReady0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady.EMT_CONSENSUS_GDBS_READY;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType catchupManagerStatusType1 = io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_CSS;
    boolean boolean2 = consensusGdbsReady0.equals((java.lang.Object) catchupManagerStatusType1);
    java.util.Map<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId, io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusMemberGroupIdMap3 = consensusGdbsReady0.getMapRbcc();
    org.junit.Assert.assertNotNull(consensusGdbsReady0);
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType1 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_CSS
        + "'", catchupManagerStatusType1.equals(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_CSS));
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMap3);
  }

  @Test
  public void test2007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2007");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver6 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl7 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        (int) (byte) 1, false, (long) '#', livingCacheObserver6);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl8 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        (int) (byte) 9, false, (long) 2, livingCacheObserver6);
    livingCacheObserver6.sembe((long) (byte) 1);
    org.junit.Assert.assertNotNull(livingCacheObserver6);
  }

  @Test
  public void test2008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2008");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl clusterDiscoveryManagerAkkaImpl0 = new io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl();
    java.time.Clock clock1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService3 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler4 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterMetaSyncManager.RequiresComponents requiresComponents5 = io.github.onograph.cluster.raft.share.meta.cm.ClusterMetaSyncManager.bulClusterMetaSyncManagerRequiresComponents();
    java.nio.file.Path path6 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo7 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path6);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction8 = null;
    org.neo4j.configuration.Config config9 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction10 = null;
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.nio.file.Path path12 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo13 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path12);
    java.nio.file.Path path14 = clusterMetaTopologyInfo13.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker15 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo13);
    org.neo4j.memory.MemoryTracker memoryTracker16 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade17 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config9, fileSystemAbstraction10, logProvider11, clusterMetaTopologyInfo13,
        memoryTracker16);
    org.neo4j.logging.Log log18 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction19 = null;
    org.neo4j.configuration.Config config20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.nio.file.Path path23 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo24 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path23);
    java.nio.file.Path path25 = clusterMetaTopologyInfo24.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker26 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo24);
    org.neo4j.memory.MemoryTracker memoryTracker27 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade28 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config20, fileSystemAbstraction21, logProvider22, clusterMetaTopologyInfo24,
        memoryTracker27);
    org.neo4j.logging.Log log29 = null;
    java.nio.file.Path path30 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo31 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path30);
    java.nio.file.Path path32 = clusterMetaTopologyInfo31.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker33 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo31);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat34 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv35 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction19, clusterSimpleStorageFacade28, log29, clusterMetaTopologyInfo31,
        clusterMetaFormat34);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat36 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv37 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction8, clusterSimpleStorageFacade17, log18, clusterMetaTopologyInfo31,
        clusterMetaFormat36);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction38 = null;
    org.neo4j.logging.LogProvider logProvider39 = null;
    org.neo4j.logging.LogProvider logProvider41 = null;
    io.github.onograph.cluster.raft.share.NodeServerInfoLogService nodeServerInfoLogService42 = new io.github.onograph.cluster.raft.share.NodeServerInfoLogService(
        logProvider39, "temp-save", logProvider41);
    org.neo4j.logging.LogProvider logProvider43 = nodeServerInfoLogService42.getUserLogProvider();
    io.github.onograph.cluster.raft.share.meta.cm.ClusterMetaSyncManager.Versioning versioning44 = requiresComponents5.asComponents(
        clusterMetaTopologyInfo7, clusterSimpleStorageFacade17, fileSystemAbstraction38,
        logProvider43);
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray45 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList46 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean47 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList46,
        socketAddressArray45);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService48 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList46);
    boolean boolean49 = memberNodeService48.isRevoevjoat();
    io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterJoinOrganizer clusterJoinOrganizer50 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterJoinOrganizer(
        memberNodeService48);
    io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService pointInTimeBackupService51 = null;
    org.neo4j.dbms.identity.ServerIdentity serverIdentity52 = null;
    org.neo4j.ssl.config.SslPolicyLoader sslPolicyLoader53 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService54 = clusterDiscoveryManagerAkkaImpl0.rereatlseeClusterStructureService(
          clock1, config2, databaseStateService3, jobScheduler4, logProvider43, memberNodeService48,
          pointInTimeBackupService51, serverIdentity52, sslPolicyLoader53);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(requiresComponents5);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo7);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo13);
    org.junit.Assert.assertNull(path14);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo24);
    org.junit.Assert.assertNull(path25);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo31);
    org.junit.Assert.assertNull(path32);
    org.junit.Assert.assertNotNull(clusterMetaFormat34);
    org.junit.Assert.assertNotNull(logProvider43);
    org.junit.Assert.assertNotNull(versioning44);
    org.junit.Assert.assertNotNull(socketAddressArray45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    org.junit.Assert.assertNotNull(memberNodeService48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
  }

  @Test
  public void test2009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2009");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaMessageToByteEncoder requestMetaMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaMessageToByteEncoder();
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException2 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Throwable) clusterDatabaseManagementException2);
    boolean boolean4 = requestMetaMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) clusterDatabaseManagementException2);
    org.neo4j.kernel.api.exceptions.Status status5 = clusterDatabaseManagementException2.status();
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue(
        "'" + status5 + "' != '" + org.neo4j.kernel.api.exceptions.Status.Database.Unknown + "'",
        status5.equals(org.neo4j.kernel.api.exceptions.Status.Database.Unknown));
  }

  @Test
  public void test2010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2010");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef0 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType1 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef0.exeForE(messageDataType1);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType4 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef0.exeForE(messageDataType4);
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter messageDataTypeChannelInboundHandlerAdapter6 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
    try {
      messageDataTypeChannelInboundHandlerAdapter6.channelWritabilityChanged(
          channelHandlerContext7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + messageDataType1 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType1.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
    org.junit.Assert.assertTrue("'" + messageDataType4 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType4.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
  }

  @Test
  public void test2011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2011");
    }
    java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>> marshalChannelImplCMSRuleProcessorList0 = new java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>();
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSRuleProcessorJoiningImpl1 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>(
        (java.util.List<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>) marshalChannelImplCMSRuleProcessorList0);
    boolean boolean3 = marshalChannelImplCMSRuleProcessorJoiningImpl1.equals((java.lang.Object) 1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test2012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2012");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId4 = null;
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta6 = new io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta(
        consensusNodeId4, (long) (byte) 100);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId7 = nodeServerMemberLeaderMeta6.getImConsensusNodeId();
    try {
      coreClusterStructureServiceLifecycleAdapter3.onleeswcForNo(nodeServerMemberLeaderMeta6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(consensusNodeId7);
  }

  @Test
  public void test2013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2013");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS();
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager1.beginChecksum();
    org.neo4j.io.fs.ReadableChannel readableChannel3 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl4 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel3);
    readableClosablePositionAwareChecksumChannelPassThruImpl4.beginChecksum();
    readablePositionAwareChecksumChannelManager1.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl4);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta7 = marshalChannelImplCMS0.unmarshal0(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2014");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply33 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
        consensusNodeId30, true, (long) 128);
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler34 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl35 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler36 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler34, refCatchupManagerImpl35);
    org.neo4j.graphdb.Label label37 = org.neo4j.dbms.database.SystemGraphDbmsModel.DELETED_DATABASE_LABEL;
    boolean boolean38 = catchupProblemInboundHandler36.acceptInboundMessage(
        (java.lang.Object) label37);
    boolean boolean39 = reply33.equals((java.lang.Object) boolean38);
    try {
      java.lang.Void void40 = processorImpl11.process(reply33);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void13);
    org.junit.Assert.assertNull(void15);
    org.junit.Assert.assertNull(void17);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier20);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray21);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNull(void25);
    org.junit.Assert.assertNull(void27);
    org.junit.Assert.assertNull(void28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(label37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
  }

  @Test
  public void test2015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2015");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMessageToMessageDecoderController syncableDataMessageToMessageDecoderController1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataByteToMessageDecoder syncableDataByteToMessageDecoder2 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataByteToMessageDecoder(
        false, syncableDataMessageToMessageDecoderController1);
  }

  @Test
  public void test2016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2016");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    writableChecksumChannelImpl1.beginChecksum();
    writableChecksumChannelImpl1.beginChecksum();
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel5 = writableChecksumChannelImpl1.putShort(
          (short) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2017");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaMessageToByteEncoder metaMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.info.MetaMessageToByteEncoder();
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply catchupIncomingTransactionReply1 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply.EMT_CATCHUP_INCOMING_TRANSACTION_REPLY;
    org.neo4j.storageengine.api.StoreId storeId2 = catchupIncomingTransactionReply1.getStoreId();
    org.neo4j.storageengine.api.StoreId storeId3 = catchupIncomingTransactionReply1.getStoreId();
    boolean boolean4 = metaMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) catchupIncomingTransactionReply1);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta5 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta6 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta5);
    boolean boolean7 = catchupIncomingTransactionReply1.equals(
        (java.lang.Object) syncedLeaderMeta6);
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation8 = catchupIncomingTransactionReply1.getTCommittedTransactionRepresentation();
    org.junit.Assert.assertNotNull(catchupIncomingTransactionReply1);
    org.junit.Assert.assertNull(storeId2);
    org.junit.Assert.assertNull(storeId3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNull(committedTransactionRepresentation8);
  }

  @Test
  public void test2018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2018");
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
    org.neo4j.kernel.impl.api.LeaseService leaseService15 = coreNodeWrapper12.getLeaseService();
    io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService coreGdbFSMService16 = coreNodeWrapper12.getMsCoreGdbFSMService();
    org.junit.Assert.assertNull(accessCapabilityFactory13);
    org.junit.Assert.assertNull(databaseIdContext14);
    org.junit.Assert.assertNotNull(leaseService15);
    org.junit.Assert.assertNull(coreGdbFSMService16);
  }

  @Test
  public void test2019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2019");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSyncMessageToByteEncoder requestTransactionSyncMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSyncMessageToByteEncoder();
    java.util.List<java.lang.String> strList1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta authMeta2 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta(
        strList1);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor consensusLogEntryRawCursor3 = io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor.emtConsensusLogEntryRawCursor();
    boolean boolean4 = authMeta2.equals((java.lang.Object) consensusLogEntryRawCursor3);
    boolean boolean5 = requestTransactionSyncMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) boolean4);
    org.junit.Assert.assertNotNull(consensusLogEntryRawCursor3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test2020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2020");
    }
    java.io.InputStream inputStream0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.ReadableChannelDataInputStreamImpl readableChannelDataInputStreamImpl1 = new io.github.onograph.cluster.raft.akkamsg.serialization.ReadableChannelDataInputStreamImpl(
        inputStream0);
    try {
      byte byte2 = readableChannelDataInputStreamImpl1.get();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2021");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal uniqueAddressSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressSafeChannelMarshal.IT = uniqueAddressSafeChannelMarshal0;
    org.junit.Assert.assertNotNull(uniqueAddressSafeChannelMarshal0);
  }

  @Test
  public void test2022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2022");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorDefinedLengthImpl<io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler> catchupIncomingTransactionReplySimpleChannelInboundHandlerRuleProcessorDefinedLengthImpl1 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorDefinedLengthImpl<io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler>(
        (int) (byte) 10);
  }

  @Test
  public void test2023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2023");
    }
    org.neo4j.io.marshal.SafeChannelMarshal<io.github.onograph.cluster.raft.share.meta.fsm.AskState> askStateSafeChannelMarshal0 = io.github.onograph.cluster.raft.share.meta.fsm.AskState.AskStateSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.getCurrentPosition();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl5 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.AskState askState6 = askStateSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(askStateSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(logPosition4);
  }

  @Test
  public void test2024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2024");
    }
    io.netty.bootstrap.Bootstrap bootstrap0 = null;
    io.netty.channel.pool.ChannelPoolHandler channelPoolHandler1 = null;
    io.github.onograph.cluster.raft.netty.NettyChannelPoolBuilder nettyChannelPoolBuilder2 = null;
    io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl lBNettyChannelPoolMapImpl4 = new io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl(
        bootstrap0, channelPoolHandler1, nettyChannelPoolBuilder2, (int) (byte) 9);
    lBNettyChannelPoolMapImpl4.close();
    java.util.Spliterator<java.util.Map.Entry<io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO, io.netty.channel.pool.ChannelPool>> consensusSocketAddressDTOEntrySpliterator6 = lBNettyChannelPoolMapImpl4.spliterator();
    org.junit.Assert.assertNotNull(consensusSocketAddressDTOEntrySpliterator6);
  }

  @Test
  public void test2025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2025");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal setupGdbStoreSyncReplySafeChannelMarshal0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplySafeChannelMarshal();
    java.nio.file.Path[] pathArray2 = new java.nio.file.Path[]{};
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply setupGdbStoreSyncReply3 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(
        (long) 'h', pathArray2);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType4 = setupGdbStoreSyncReply3.getStat();
    org.neo4j.io.fs.WritableChannel writableChannel5 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl6 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel5);
    writableChecksumChannelImpl6.beginChecksum();
    int int8 = writableChecksumChannelImpl6.putChecksum();
    try {
      setupGdbStoreSyncReplySafeChannelMarshal0.marshal(setupGdbStoreSyncReply3,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pathArray2);
    org.junit.Assert.assertNotNull(setupGdbStoreSyncReply3);
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType4 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK
        + "'", setupGdbSyncReplyStateType4.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK));
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
  }

  @Test
  public void test2026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2026");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager0);
    boolean boolean2 = dataSyncRunnerStatsManagerDataManagerFactory1.getIsCi();
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager3 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory4 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager3);
    boolean boolean5 = dataSyncRunnerStatsManagerDataManagerFactory4.getIsCi();
    boolean boolean6 = dataSyncRunnerStatsManagerDataManagerFactory4.getIsCi();
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory7 = dataSyncRunnerStatsManagerDataManagerFactory1.cobeDataManagerFactory(
          dataSyncRunnerStatsManagerDataManagerFactory4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalStateException; message: *** Error:  fae80bd1-b164-44c7-9864-eeb00641dab2");
    } catch (java.lang.IllegalStateException e) {
    }
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test2027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2027");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask(
        consensusNodeId0, consensusNodeId1, (long) 1016, (long) (byte) 10, (long) (short) -1);
    long long6 = ask5.getLgIll();
    long long7 = ask5.getLgIll();
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1016L + "'", long6 == 1016L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1016L + "'", long7 == 1016L);
  }

  @Test
  public void test2028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2028");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.strvstfi();
    connector0.strvstfiForSt("policy");
    connector0.str();
    connector0.fihrih(1536L);
    connector0.str();
  }

  @Test
  public void test2029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2029");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaMessageToByteEncoder metaMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.info.MetaMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo structureInfo2 = io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo.EMT_STRUCTURE_INFO;
    java.util.stream.Stream<io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper> gdbDiscoveryMetaCoreWrapperStream3 = structureInfo2.geseStream();
    boolean boolean5 = structureInfo2.equals((java.lang.Object) "FollowerStates{}");
    akka.cluster.UniqueAddress uniqueAddress6 = null;
    java.util.stream.Stream<io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper> gdbDiscoveryMetaCoreWrapperStream7 = structureInfo2.geseStream(
        uniqueAddress6);
    io.netty.channel.ChannelPromise channelPromise8 = null;
    try {
      metaMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) gdbDiscoveryMetaCoreWrapperStream7, channelPromise8);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertNotNull(structureInfo2);
    org.junit.Assert.assertNotNull(gdbDiscoveryMetaCoreWrapperStream3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(gdbDiscoveryMetaCoreWrapperStream7);
  }

  @Test
  public void test2030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2030");
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
      org.neo4j.io.state.SimpleStorage<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSimpleStorage33 = clusterSimpleStorageFacade9.creomerSimpleStorage();
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
  public void test2031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2031");
    }
    io.github.onograph.cluster.raft.module.cuprot.IncomingEventService incomingEventService0 = io.github.onograph.cluster.raft.module.cuprot.IncomingEventService.NOO_INCOMING_EVENT_SERVICE;
    io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler serverSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler(
        incomingEventService0);
    io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper abstractCatchupManagementMessageWrapper2 = null;
    java.net.SocketAddress socketAddress3 = null;
    incomingEventService0.onccpromsForSoAb(abstractCatchupManagementMessageWrapper2,
        socketAddress3);
    java.net.SocketAddress socketAddress5 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync requestTransactionSync6 = null;
    incomingEventService0.ontpurqForSoRe(socketAddress5, requestTransactionSync6);
    org.junit.Assert.assertNotNull(incomingEventService0);
  }

  @Test
  public void test2032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2032");
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
    java.lang.Void void12 = consensusElectionTimeout1.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl5);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(void7);
    org.junit.Assert.assertNull(void9);
    org.junit.Assert.assertNull(void11);
    org.junit.Assert.assertNull(void12);
  }

  @Test
  public void test2033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2033");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray2 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction3 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        10L, (long) 0, consensusLogEntryArray2);
    io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaMessageToByteEncoder requestMetaMessageToByteEncoder4 = new io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaMessageToByteEncoder();
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException6 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException7 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Throwable) clusterDatabaseManagementException6);
    boolean boolean8 = requestMetaMessageToByteEncoder4.acceptOutboundMessage(
        (java.lang.Object) clusterDatabaseManagementException6);
    boolean boolean9 = incomingAction3.equals((java.lang.Object) boolean8);
    org.junit.Assert.assertNotNull(consensusLogEntryArray2);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test2034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2034");
    }
    org.neo4j.kernel.database.Database database0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.kernel.database.Database database3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncResourceServiceManager storeSyncResourceServiceManager4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncResourceServiceManager(
        database3);
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef5 = new io.github.onograph.cluster.raft.module.cuprot.ServerRef();
    io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType catchupManagerStatusType6 = io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.TRX_IN;
    boolean boolean7 = serverRef5.isExcnForE(catchupManagerStatusType6);
    try {
      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncRequestSimpleChannelInboundHandler storeSyncRequestSimpleChannelInboundHandler8 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncRequestSimpleChannelInboundHandler(
          database0, fileSystemAbstraction1, 1000, storeSyncResourceServiceManager4, serverRef5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType6 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.TRX_IN
        + "'", catchupManagerStatusType6.equals(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.TRX_IN));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test2035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2035");
    }
    org.neo4j.kernel.database.NamedDatabaseId[] namedDatabaseIdArray0 = new org.neo4j.kernel.database.NamedDatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.NamedDatabaseId> namedDatabaseIdSet1 = new java.util.LinkedHashSet<org.neo4j.kernel.database.NamedDatabaseId>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet1,
        namedDatabaseIdArray0);
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds allGdbIds3 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds(
        (java.util.Set<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet1);
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds allGdbIds4 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds(
        (java.util.Set<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet1);
    int int5 = allGdbIds4.getSz();
    org.junit.Assert.assertNotNull(namedDatabaseIdArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test2036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2036");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.onungt();
    try {
      coreClusterStructureServiceLifecycleAdapter3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2037");
    }
    java.util.function.Supplier<akka.cluster.client.ClusterClientSettings> clusterClientSettingsSupplier0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.ClusterActorBuilder clusterActorBuilder1 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.cleceporClusterActorServiceClusterActorBuilder(
        clusterClientSettingsSupplier0);
    akka.actor.Props props2 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.prpProps(
        clusterActorBuilder1);
    akka.actor.Props props3 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.prpProps(
        clusterActorBuilder1);
    akka.actor.Props props4 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.prpProps(
        clusterActorBuilder1);
    org.junit.Assert.assertNotNull(clusterActorBuilder1);
    org.junit.Assert.assertNotNull(props2);
    org.junit.Assert.assertNotNull(props3);
    org.junit.Assert.assertNotNull(props4);
  }

  @Test
  public void test2038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2038");
    }
    io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
    byte[] byteArray2 = new byte[]{(byte) 9};
    org.neo4j.kernel.database.DatabaseId databaseId3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType5 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData6 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData(
        byteArray2, databaseId3, "name", replicaTokenType5);
    io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[]{};
    java.util.LinkedList<io.netty.buffer.ByteBuf> byteBufList9 = new java.util.LinkedList<io.netty.buffer.ByteBuf>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<io.netty.buffer.ByteBuf>) byteBufList9, byteBufArray8);
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl11 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl(
          byteBufAllocator0, byteArray2, 0,
          (java.util.Queue<io.netty.buffer.ByteBuf>) byteBufList9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: allocator cannot be null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray2);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[9]");
    org.junit.Assert.assertNotNull(byteBufArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test2039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2039");
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
    java.lang.Object obj12 = null;
    boolean boolean13 = addAction2.equals(obj12);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry14 = addAction2.consensusLogEntry;
    org.junit.Assert.assertNotNull(livingCacheObserver6);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNull(consensusLogEntry14);
  }

  @Test
  public void test2040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2040");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onShutdown(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test2041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2041");
    }
    io.github.onograph.cluster.raft.readreplica.CatchupRunner catchupRunner0 = null;
    java.time.Duration duration1 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler scHolderJobScheduler2 = null;
    io.github.onograph.cluster.raft.readreplica.CatchupNodeTaskCoordinator catchupNodeTaskCoordinator3 = new io.github.onograph.cluster.raft.readreplica.CatchupNodeTaskCoordinator(
        catchupRunner0, duration1, scHolderJobScheduler2);
    try {
      catchupNodeTaskCoordinator3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test2042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2042");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    org.neo4j.dbms.identity.ServerId serverId1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId3 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier4 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray5 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier4};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet6 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet6,
        nodeGroupIdentifierArray5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec8 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId2, consensusNodeId3,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet6);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta loadBalanceServerMeta9 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta(
        socketAddress0, serverId1,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet6);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager10 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager10.beginChecksum();
    boolean boolean12 = loadBalanceServerMeta9.equals(
        (java.lang.Object) readablePositionAwareChecksumChannelManager10);
    try {
      boolean boolean13 = io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler.isUnahForRe(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(nodeGroupIdentifier4);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test2043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2043");
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
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder> transactionLogSyncManagerBuilderConsensusNodeFollowersMeta9 = new io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction10 = null;
    org.neo4j.logging.LogProvider logProvider11 = null;
    org.neo4j.memory.MemoryTracker memoryTracker12 = null;
    org.neo4j.io.pagecache.PageCache pageCache13 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = null;
    io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder transactionLogSyncManagerBuilder15 = new io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder(
        fileSystemAbstraction10, logProvider11, memoryTracker12, pageCache13, pageCacheTracer14);
    io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder[] transactionLogSyncManagerBuilderArray16 = new io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder[]{
        transactionLogSyncManagerBuilder15};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder> transactionLogSyncManagerBuilderSet17 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>) transactionLogSyncManagerBuilderSet17,
        transactionLogSyncManagerBuilderArray16);
    long long19 = io.github.onograph.cluster.raft.share.calg.NonLeaderVotingNodeMemberWrapper.qumanieForSeCo(
        transactionLogSyncManagerBuilderConsensusNodeFollowersMeta9,
        (java.util.Set<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>) transactionLogSyncManagerBuilderSet17);
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder> transactionLogSyncManagerBuilderConsensusNodeFollowersMeta20 = new io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.logging.LogProvider logProvider22 = null;
    org.neo4j.memory.MemoryTracker memoryTracker23 = null;
    org.neo4j.io.pagecache.PageCache pageCache24 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer25 = null;
    io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder transactionLogSyncManagerBuilder26 = new io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder(
        fileSystemAbstraction21, logProvider22, memoryTracker23, pageCache24, pageCacheTracer25);
    io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder[] transactionLogSyncManagerBuilderArray27 = new io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder[]{
        transactionLogSyncManagerBuilder26};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder> transactionLogSyncManagerBuilderSet28 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>();
    boolean boolean29 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>) transactionLogSyncManagerBuilderSet28,
        transactionLogSyncManagerBuilderArray27);
    long long30 = io.github.onograph.cluster.raft.share.calg.NonLeaderVotingNodeMemberWrapper.qumanieForSeCo(
        transactionLogSyncManagerBuilderConsensusNodeFollowersMeta20,
        (java.util.Set<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>) transactionLogSyncManagerBuilderSet28);
    long long31 = io.github.onograph.cluster.raft.share.calg.NonLeaderVotingNodeMemberWrapper.qumanieForSeCo(
        transactionLogSyncManagerBuilderConsensusNodeFollowersMeta9,
        (java.util.Set<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>) transactionLogSyncManagerBuilderSet28);
    akka.actor.ActorRef actorRef32 = null;
    java.nio.ByteBuffer byteBuffer33 = null;
    joinClusterRemoteInstrument1.remoteWriteMetadata(actorRef8, (java.lang.Object) long31,
        actorRef32, byteBuffer33);
    org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 8 + "'", byte2 != (byte) 8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierListSetting4);
    org.junit.Assert.assertNotNull(transactionLogSyncManagerBuilderArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    org.junit.Assert.assertNotNull(transactionLogSyncManagerBuilderArray27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
  }

  @Test
  public void test2044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2044");
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
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManager discoverySocketAddressManager5 = null;
    io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceDiscoveryKickoffImpl memberNodeServiceDiscoveryKickoffImpl6 = new io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceDiscoveryKickoffImpl(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1,
        discoverySocketAddressManager5);
    java.util.Optional<org.neo4j.configuration.helpers.SocketAddress> socketAddressOptional7 = memberNodeServiceDiscoveryKickoffImpl6.fOptional();
    try {
      boolean boolean8 = memberNodeServiceDiscoveryKickoffImpl6.isUsord();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(socketAddressArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(memberNodeService3);
    org.junit.Assert.assertNotNull(memberNodeService4);
    org.junit.Assert.assertNull(socketAddressOptional7);
  }

  @Test
  public void test2045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2045");
    }
    byte[] byteArray1 = new byte[]{(byte) 1};
    io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService chunkedInputEncodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService(
        byteArray1, true);
    long long4 = chunkedInputEncodingService3.length();
    io.netty.buffer.ByteBufAllocator byteBufAllocator5 = null;
    try {
      io.netty.buffer.ByteBuf byteBuf6 = chunkedInputEncodingService3.readChunk(byteBufAllocator5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
  }

  @Test
  public void test2046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2046");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl3 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean2);
    java.util.UUID uUID4 = clusterSessionBean2.getIsUUID();
    io.netty.buffer.ByteBuf byteBuf5 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel6 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf5);
    defaultWritableChecksumChannel6.beginChecksum();
    io.netty.buffer.ByteBuf byteBuf8 = defaultWritableChecksumChannel6.byebfByteBuf();
    io.netty.buffer.ByteBuf byteBuf9 = defaultWritableChecksumChannel6.byebfByteBuf();
    boolean boolean10 = clusterSessionBean2.equals(
        (java.lang.Object) defaultWritableChecksumChannel6);
    org.junit.Assert.assertNull(uUID4);
    org.junit.Assert.assertNull(byteBuf8);
    org.junit.Assert.assertNull(byteBuf9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test2047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2047");
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
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction13 = null;
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.nio.file.Path path15 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo16 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path15);
    java.nio.file.Path path17 = clusterMetaTopologyInfo16.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker18 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo16);
    org.neo4j.memory.MemoryTracker memoryTracker19 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade20 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config12, fileSystemAbstraction13, logProvider14, clusterMetaTopologyInfo16,
        memoryTracker19);
    org.neo4j.logging.Log log21 = null;
    java.nio.file.Path path22 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo23 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path22);
    java.nio.file.Path path24 = clusterMetaTopologyInfo23.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker25 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo23);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat26 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv27 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction11, clusterSimpleStorageFacade20, log21, clusterMetaTopologyInfo23,
        clusterMetaFormat26);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat28 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv29 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade9, log10, clusterMetaTopologyInfo23,
        clusterMetaFormat28);
    try {
      java.nio.file.Path path31 = clusterMetaTopologyInfo23.ralodeyPath("version");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo16);
    org.junit.Assert.assertNull(path17);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo23);
    org.junit.Assert.assertNull(path24);
    org.junit.Assert.assertNotNull(clusterMetaFormat26);
  }

  @Test
  public void test2048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2048");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry4 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray5 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry4};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction6 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray5);
    io.github.onograph.cluster.raft.module.cuprot.RefException refException7 = new io.github.onograph.cluster.raft.module.cuprot.RefException(
        "version", (java.lang.Object[]) consensusLogEntryArray5);
    io.github.onograph.cluster.raft.module.cuprot.RefException refException8 = new io.github.onograph.cluster.raft.module.cuprot.RefException(
        "Snappy", (java.lang.Object[]) consensusLogEntryArray5);
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
  }

  @Test
  public void test2049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2049");
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
    java.lang.String[] strArray14 = new java.lang.String[]{"store_random_id", "name", "leader-only",
        "store_random_id", "", ""};
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet15 = io.github.onograph.config.NodeGroupIdentifier.seoSet(
        strArray14);
    java.util.List<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierList16 = io.github.onograph.config.NodeGroupIdentifier.litoList(
        strArray14);
    java.util.List<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierList17 = io.github.onograph.config.NodeGroupIdentifier.litoList(
        strArray14);
    int[] intArray19 = new int[]{(byte) -1};
    try {
      relationshipTypeTokenHolder7.getOrCreateInternalIds(strArray14, intArray19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray14);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet15);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierList16);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierList17);
    org.junit.Assert.assertNotNull(intArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
  }

  @Test
  public void test2050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2050");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType1 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper socketAddressWrapper2 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
        socketAddress0, socketAddressSchemeType1);
    java.lang.Object obj3 = null;
    boolean boolean4 = socketAddressWrapper2.equals(obj3);
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper[] socketAddressWrapperArray5 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper[]{
        socketAddressWrapper2};
    java.util.ArrayList<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper> socketAddressWrapperList6 = new java.util.ArrayList<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper>) socketAddressWrapperList6,
        socketAddressWrapperArray5);
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses8 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.frmlsDiscoverySocketAddresses(
        (java.util.List<io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper>) socketAddressWrapperList6);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(socketAddressWrapperArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(discoverySocketAddresses8);
  }

  @Test
  public void test2051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2051");
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
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker16 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService17 = null;
    java.lang.Runnable runnable18 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage19 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl20 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable18, leasableMetaStateStorage19);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId21 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator22 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier23 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl24 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService17, syncableLeasableCoreNodeDataFSMImpl20, namedDatabaseId21,
        syncerator22, consensusNodeIdSupplier23);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId25 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator26 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionCommitProcessSyncableDataImpl transactionCommitProcessSyncableDataImpl27 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionCommitProcessSyncableDataImpl(
        databaseReadOnlyChecker16, leaseServiceEnterpriseImpl24, namedDatabaseId25, syncerator26);
    try {
      coreGdbFSMService15.inlcmpoForTr(
          (org.neo4j.kernel.impl.api.TransactionCommitProcess) transactionCommitProcessSyncableDataImpl27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(leasableMeta4);
    org.junit.Assert.assertNotNull(leasableMeta6);
  }

  @Test
  public void test2052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest4.test2052");
    }
    io.github.onograph.cluster.raft.control.AppComProFamilyGroupType appComProFamilyGroupType0 = io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.CATCHUP_PROTOCOL;
    java.lang.String str1 = appComProFamilyGroupType0.lowerName();
    org.junit.Assert.assertTrue("'" + appComProFamilyGroupType0 + "' != '"
            + io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.CATCHUP_PROTOCOL + "'",
        appComProFamilyGroupType0.equals(
            io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.CATCHUP_PROTOCOL));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "catchup_protocol" + "'", str1,
        "catchup_protocol");
  }
}

