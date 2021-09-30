package io.github.onograph.test;

import java.time.Clock;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest0 {

  public static boolean debug = false;

  @Test
  public void test0001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0001");
    }
    io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_STAT_INFO;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_STAT_INFO
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_STAT_INFO));
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0002");
    }
    java.util.Optional<io.github.onograph.cluster.raft.control.connect.HandshakeStateType> handshakeStateTypeOptional1 = io.github.onograph.cluster.raft.control.connect.HandshakeStateType.frmcdvaeOptional(
        (int) (short) -1);
    org.junit.Assert.assertNotNull(handshakeStateTypeOptional1);
  }

  @Test
  public void test0003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0003");
    }
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType jobTerminationType0 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_SYNC_HOLD;
    org.junit.Assert.assertTrue("'" + jobTerminationType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_SYNC_HOLD
        + "'", jobTerminationType0.equals(
        io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_SYNC_HOLD));
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0004");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData2 = io.github.onograph.cluster.raft.share.meta.fsm.comp.DataMarshaller.unahRequestData(
          byteBuf0, namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0005");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<io.github.onograph.config.EntProVer>> entProVerListSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRameiList;
    org.junit.Assert.assertNotNull(entProVerListSetting0);
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0006");
    }
    io.github.onograph.cluster.raft.share.sync.SyncableData syncableData0 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry(
          syncableData0, (long) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0007");
    }
    int int0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureJSerializer.SIEN;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1536 + "'", int0 == 1536);
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0008");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker2 = null;
    try {
      org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition(
          logPositionMarker2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0009");
    }
    org.neo4j.kernel.database.Database database0 = null;
    org.neo4j.storageengine.api.KernelVersionRepository kernelVersionRepository1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    io.github.onograph.config.TxFlowType txFlowType3 = null;
    org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore logicalTransactionStore4 = null;
    org.neo4j.storageengine.api.TransactionIdStore transactionIdStore5 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator transactionBlockGenerator6 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator(
          database0, kernelVersionRepository1, logProvider2, txFlowType3, logicalTransactionStore4,
          transactionIdStore5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0010");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingLoigyoDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0011");
    }
    org.neo4j.cli.ExecutionContext executionContext0 = null;
    try {
      io.github.onograph.commandline.dbms.ClusterDisconnectCommand clusterDisconnectCommand1 = new io.github.onograph.commandline.dbms.ClusterDisconnectCommand(
          executionContext0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0012");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.share.AccessCapabilityMutatingLeader.NOARS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
  }

  @Test
  public void test0013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0013");
    }
    org.neo4j.kernel.database.Database database0 = null;
    io.github.onograph.cluster.raft.shared.DistributedGdb distributedGdb1 = null;
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.kernel.impl.factory.GraphDatabaseFacade graphDatabaseFacade3 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService4 = null;
    try {
      io.github.onograph.dbms.gdb.EnterpriseDatabaseContextClusterImpl enterpriseDatabaseContextClusterImpl5 = io.github.onograph.dbms.gdb.EnterpriseDatabaseContextClusterImpl.corEnterpriseDatabaseContextClusterImpl(
          database0, distributedGdb1, monitors2, graphDatabaseFacade3, consensusLeaderNodeService4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0014");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResourceByteToMessageDecoder requestStoreResourceByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResourceByteToMessageDecoder();
  }

  @Test
  public void test0015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0015");
    }
    org.neo4j.graphdb.config.Configuration configuration0 = null;
    try {
      boolean boolean1 = io.github.onograph.config.EnterpriseClusterSettings.isCleeeForCo(
          configuration0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0016");
    }
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta> loadBalanceServerMetaRuleProcessor1 = io.github.onograph.cluster.raft.gateway.gwlb.mods.RuleProcessorConfigurator.pasRuleProcessor(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException; message: *** Error: b0c41905-88ce-452e-b1e9-41bd0132b3d5");
    } catch (io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException e) {
    }
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0017");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure databaseCoreClusterStructure1 = io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure.emtDatabaseCoreClusterStructure(
          databaseId0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0018");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_CORE_CONMEM_UID;
    org.junit.Assert.assertTrue("'" + metaType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.MetaType.MT_CORE_CONMEM_UID + "'",
        metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_CORE_CONMEM_UID));
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0019");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup setup1 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup.nohgtsdTransactionBlockGeneratorSetup(
        (long) (short) 1);
    org.junit.Assert.assertNotNull(setup1);
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0020");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType clusterNodeRoleType0 = io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.READ_REPLICA;
    org.junit.Assert.assertTrue("'" + clusterNodeRoleType0 + "' != '"
            + io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.READ_REPLICA + "'",
        clusterNodeRoleType0.equals(
            io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.READ_REPLICA));
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0021");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_ANS;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_ANS
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_ANS));
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0022");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Long> longSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaoasLong;
    org.junit.Assert.assertNotNull(longSetting0);
  }

  @Test
  public void test0023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0023");
    }
    java.lang.String str0 = io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl.DST_RAD_UID;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_random_id" + "'", str0,
        "store_random_id");
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0024");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeaderDistributedImpl clusterLeaderDistributedImpl2 = new io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeaderDistributedImpl(
          clusterStructureService0, logProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0025");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkaamDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0026");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver3 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl4 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
          (int) ' ', false, (long) (short) 1, livingCacheObserver3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0027");
    }
    java.lang.String str0 = io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl.DST_VX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_version" + "'", str0,
        "store_version");
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0028");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Long> longSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaneayLong;
    org.junit.Assert.assertNotNull(longSetting0);
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0029");
    }
    org.neo4j.scheduler.JobScheduler jobScheduler0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler scHolderJobScheduler2 = new io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler(
          jobScheduler0, logProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0030");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.kernel.database.DatabaseId[] databaseIdArray1 = new org.neo4j.kernel.database.DatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId> databaseIdSet2 = new java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.DatabaseId>) databaseIdSet2,
        databaseIdArray1);
    try {
      io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl4 = io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl.froGdbDiscoveryMetaReadReplicaImpl(
          config0, (java.util.Set<org.neo4j.kernel.database.DatabaseId>) databaseIdSet2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseIdArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0031");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_REQ;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_REQ
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_AE_REQ));
  }

  @Test
  public void test0032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0032");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService syncableDataEncodingService1 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService(
          applicationComProFamilyType0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  13180ee2-37a5-4584-9bbe-ade94ff01ee8");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
  }

  @Test
  public void test0033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0033");
    }
    java.lang.String str0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.TEM_SAV_DIEO_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "temp-save" + "'", str0, "temp-save");
  }

  @Test
  public void test0034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0034");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier1 = io.github.onograph.config.NodeGroupIdentifierSetSupplier.litNodeGroupIdentifierSetSupplier(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0035");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingStsutoDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0036");
    }
    org.neo4j.configuration.SettingValueParser<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSettingValueParser0 = io.github.onograph.config.NodeGroupIdentifier.SVX_GRP_NME;
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSettingValueParser0);
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0037");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkcyrrnlyDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0038");
    }
    akka.actor.ActorRef actorRef0 = null;
    akka.cluster.Cluster cluster1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher clusterDataWatcher3 = null;
    akka.actor.ActorRef actorRef4 = null;
    akka.actor.Props props5 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusDatabaseIdActor.prpProps(
        actorRef0, cluster1, (int) (byte) 0, clusterDataWatcher3, actorRef4);
    org.junit.Assert.assertNotNull(props5);
  }

  @Test
  public void test0039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0039");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta(
          (long) (byte) 1, syncableLeasableCoreNodeData1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0040");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.ConsensusNodeMessage consensusNodeMessage2 = new io.github.onograph.cluster.raft.module.dprot.impl.ConsensusNodeMessage(
          consensusNodeId0, namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0041");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingDiviasSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0042");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_ERR;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_ERR + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_ERR));
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0043");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.DurationRange> durationRangeSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingEliidtiDurationRange;
    org.junit.Assert.assertNotNull(durationRangeSetting0);
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0044");
    }
    org.neo4j.cli.ExecutionContext executionContext0 = null;
    org.neo4j.dbms.archive.Loader loader1 = null;
    try {
      io.github.onograph.commandline.dbms.ClusterLoadCommand clusterLoadCommand2 = new io.github.onograph.commandline.dbms.ClusterLoadCommand(
          executionContext0, loader1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0045");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.SPCLX_MK;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "cc-core-restart-needed-listener-timer" + "'", str0,
        "cc-core-restart-needed-listener-timer");
  }

  @Test
  public void test0046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0046");
    }
    byte byte0 = io.github.onograph.cluster.raft.module.dprot.impl.stack.AkkaRemoteInstrumentDequeWrapper.geinfr();
  }

  @Test
  public void test0047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0047");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorKnownImpl<java.lang.Object> objRuleProcessorKnownImpl0 = io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorKnownImpl.asRuleProcessorKnownImpl();
    org.junit.Assert.assertNotNull(objRuleProcessorKnownImpl0);
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0048");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    try {
      double double2 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getDouble();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0049");
    }
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.GdbOnline gdbOnline1 = new io.github.onograph.cluster.raft.module.dprot.impl.GdbOnline(
          namedDatabaseId0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0050");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply catchupIncomingTransactionReply3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager catchupReplyChannelManager4 = null;
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture5 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ontpurseForCoCaCa(
          catchupIncomingTransactionReply3, catchupReplyChannelManager4,
          storeSyncCompletedCompletableFuture5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0051");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<java.lang.String>> strListSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCoeneasList;
    org.junit.Assert.assertNotNull(strListSetting0);
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0052");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper0 = null;
    org.neo4j.io.fs.WritableChannel writableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel1);
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapperMarshaller.maslForCoWr(
          consensusNodeServerMemberIdWrapper0, writableChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0053");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_GDB_TITLE;
    org.junit.Assert.assertTrue("'" + metaType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.MetaType.MT_GDB_TITLE + "'",
        metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_GDB_TITLE));
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0054");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    org.neo4j.memory.MemoryTracker memoryTracker3 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout4 = null;
    try {
      io.github.onograph.cluster.raft.id.CoreNodeClusterIdentModImpl coreNodeClusterIdentModImpl5 = new io.github.onograph.cluster.raft.id.CoreNodeClusterIdentModImpl(
          fileSystemAbstraction0, clusterSimpleStorageFacade1, logProvider2, memoryTracker3,
          neo4jLayout4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0055");
    }
    io.netty.bootstrap.Bootstrap bootstrap0 = null;
    io.netty.channel.pool.ChannelPoolHandler channelPoolHandler1 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.SingleImplNettySimpleChannelPool singleImplNettySimpleChannelPool2 = new io.github.onograph.cluster.raft.akkamsg.SingleImplNettySimpleChannelPool(
          bootstrap0, channelPoolHandler1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: handler");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0056");
    }
    io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService remoteMetaService2 = new io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService(
          lifecycleCatchupManagerImpl0, logProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0057");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.SetupManager setupManager2 = new io.github.onograph.cluster.raft.share.meta.SetupManager(
          fileSystemAbstraction0, logProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0058");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingLertitDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0059");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.function.BooleanSupplier booleanSupplier1 = null;
    io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider consensusMetaProvider2 = null;
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier3 = null;
    java.util.function.BooleanSupplier booleanSupplier4 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaManagingEnvironment consensusMetaManagingEnvironment5 = new io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaManagingEnvironment(
          config0, booleanSupplier1, consensusMetaProvider2, nodeGroupIdentifierSetSupplier3,
          booleanSupplier4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0060");
    }
    java.time.Clock clock0 = null;
    io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach abstractNamedServiceClusterApproach1 = null;
    java.lang.Iterable<io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach> abstractNamedServiceClusterApproachIterable2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    try {
      io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager4 = new io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager(
          clock0, abstractNamedServiceClusterApproach1,
          abstractNamedServiceClusterApproachIterable2, logProvider3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0061");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingConlaeInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0062");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreService storeService0 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule1 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncManager transactionSyncManager2 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.scmeta.ClusteredGdb clusteredGdb3 = io.github.onograph.cluster.raft.module.cuprot.ClusteredGdbManager.crertsrClusteredGdb(
          storeService0, globalModule1, transactionSyncManager2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0063");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.dprocs.ShowAvailableProComFamBasicProcedure.PROC_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "protocols" + "'", str0, "protocols");
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0064");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_INFO;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_INFO
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.REQ_INFO));
  }

  @Test
  public void test0065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0065");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    consensusLogCacheServiceNoopImpl0.trnt(0L);
    org.neo4j.scheduler.JobScheduler jobScheduler5 = null;
    org.neo4j.logging.LogProvider logProvider6 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog consensusTransactionLog7 = null;
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.dbms.crash.GdbCrashSender gdbCrashSender9 = null;
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaService syncStatusMetaService10 = null;
    io.github.onograph.cluster.raft.share.CoreMeta coreMeta11 = null;
    io.github.onograph.cluster.raft.ClusterSessionManager clusterSessionManager12 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.ActionProcessManager actionProcessManager13 = new io.github.onograph.cluster.raft.share.meta.ActionProcessManager(
          (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNoopImpl0,
          (int) (byte) 10, (int) (byte) 1, jobScheduler5, logProvider6, consensusTransactionLog7,
          monitors8, gdbCrashSender9, syncStatusMetaService10, coreMeta11, clusterSessionManager12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0066");
    }
    java.lang.String str0 = io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl.DENSR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "designated_seeder" + "'", str0,
        "designated_seeder");
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0067");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    boolean boolean2 = transactionChunkingCompletedMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) '#');
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.netty.channel.ChannelPromise channelPromise5 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.write(channelHandlerContext3,
          (java.lang.Object) 0, channelPromise5);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0068");
    }
    int int0 = io.github.onograph.cluster.raft.watch.PerformanceTrackingLifecycleAdapter.SAPS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0069");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder sliceMetaByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      sliceMetaByteToMessageDecoder0.channelReadComplete(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0070");
    }
    org.neo4j.graphdb.config.Setting<java.nio.file.Path> pathSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCleteyPath;
    org.junit.Assert.assertNotNull(pathSetting0);
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0071");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray4 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5,
        socketAddressArray4);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService7 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService8 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5);
    try {
      gdbIdInboundHandler2.channelRead(channelHandlerContext3,
          (java.lang.Object) memberNodeService8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(socketAddressArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(memberNodeService7);
    org.junit.Assert.assertNotNull(memberNodeService8);
  }

  @Test
  public void test0072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0072");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC;
    org.junit.Assert.assertTrue("'" + askMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC + "'",
        askMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC));
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0073");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.palapp.strategies.LeaderNodeNamedServiceClusterApproach.IDNT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "leader-only" + "'", str0, "leader-only");
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0074");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedByteToMessageDecoder transactionChunkingCompletedByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId3 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask7 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId2, consensusNodeId3, (long) '4', (long) (short) -1, 1L);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId8 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager messager9 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) ask7,
        consensusNodeId8);
    try {
      transactionChunkingCompletedByteToMessageDecoder0.channelRead(channelHandlerContext1,
          (java.lang.Object) ask7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0075");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    try {
      io.github.onograph.cluster.raft.share.ProFamilyManagementService proFamilyManagementService2 = new io.github.onograph.cluster.raft.share.ProFamilyManagementService(
          config0, logProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0076");
    }
    int int0 = io.github.onograph.cluster.raft.watch.PerformanceTrackingLifecycleAdapter.TOAIR;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0077");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    org.neo4j.values.virtual.MapValue mapValue2 = null;
    try {
      org.neo4j.procedure.builtin.routing.RoutingResult routingResult3 = clusteringBalancerServiceImpl0.runRoutingResult(
          namedDatabaseId1, mapValue2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0078");
    }
    java.nio.ByteBuffer byteBuffer0 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler.maslForBySt(
          byteBuffer0, "designated_seeder");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0079");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.putInt(
          (int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0080");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException2 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper4 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId0, (java.lang.Throwable) clusterDatabaseManagementException2, operatorState3);
    java.lang.String str5 = clusterDatabaseManagementException2.toString();
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version" + "'", str5,
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version");
  }

  @Test
  public void test0081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0081");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo1 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path0);
    try {
      java.nio.file.Path path3 = clusterMetaTopologyInfo1.qunmrsefPath("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo1);
  }

  @Test
  public void test0082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0082");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingPultvDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0083");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManager> namedDatabaseIdFunction1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader clusterLeader3 = null;
    org.neo4j.procedure.builtin.routing.RoutingTableTTLProvider routingTableTTLProvider4 = null;
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.mods.LeaderServiceNodeSocketAddressWrapper leaderServiceNodeSocketAddressWrapper5 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.LeaderServiceNodeSocketAddressWrapper(
          config0, namedDatabaseIdFunction1, logProvider2, clusterLeader3,
          routingTableTTLProvider4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0084");
    }
    io.github.onograph.config.SettingsDeclarationClusterImpl settingsDeclarationClusterImpl0 = new io.github.onograph.config.SettingsDeclarationClusterImpl();
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0085");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REC;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REC
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_REC));
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0086");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId0, storeId1, (long) (byte) 10, path3);
    try {
      java.lang.String str5 = requestStoreResource4.decbString();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0087");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync3 = io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper.unahAbstractTransactionSync(
          logEntryReader0,
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0088");
    }
    org.neo4j.cli.ExecutionContext executionContext0 = null;
    org.neo4j.dbms.archive.Dumper dumper1 = null;
    try {
      io.github.onograph.commandline.dbms.DefaultDumpCommand defaultDumpCommand2 = new io.github.onograph.commandline.dbms.DefaultDumpCommand(
          executionContext0, dumper1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0089");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta> replicationSessionManagerMetaMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META;
    org.junit.Assert.assertNotNull(replicationSessionManagerMetaMetaWrapper0);
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0090");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaByteToMessageDecoder authMetaByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaByteToMessageDecoder();
  }

  @Test
  public void test0091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0091");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingStseeBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0092");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier1 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    try {
      char char3 = nodeGroupIdentifier1.charAt(100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
  }

  @Test
  public void test0093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0093");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.putInt(
          (int) (short) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0094");
    }
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta> loadBalanceServerMetaRuleProcessor1 = io.github.onograph.cluster.raft.gateway.gwlb.mods.RuleProcessorConfigurator.pasRuleProcessor(
          "temp-save");
      org.junit.Assert.fail(
          "Expected exception of type io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException; message: *** Error: b0c41905-88ce-452e-b1e9-41bd0132b3d5");
    } catch (io.github.onograph.cluster.raft.gateway.gwlb.mods.FilterException e) {
    }
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0095");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterGatekeeperActor.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "joiner" + "'", str0, "joiner");
  }

  @Test
  public void test0096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0096");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingStmnlbsInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0097");
    }
    io.github.onograph.dbms.crash.CrashSignaler crashSignaler0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager clusterDiscoveryManager2 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule3 = null;
    org.neo4j.ssl.config.SslPolicyLoader sslPolicyLoader4 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.ClusterDiscoveryService clusterDiscoveryService5 = new io.github.onograph.cluster.raft.share.meta.ClusterDiscoveryService(
          crashSignaler0, databaseStateService1, clusterDiscoveryManager2, globalModule3,
          sslPolicyLoader4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0098");
    }
    try {
      io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMeta requestAuthMeta2 = new io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMeta(
          "designated_seeder", "joiner");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: No enum constant io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions.joiner");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0099");
    }
    java.util.Optional<akka.remote.artery.tcp.SSLEngineProvider> sSLEngineProviderOptional0 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker discoveryInitialProcChecker1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO4 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder actorStackBuilder5 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder(
          sSLEngineProviderOptional0, discoveryInitialProcChecker1, config2, logProvider3,
          clusterMemberLimitAtCreationDTO4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0100");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    io.github.onograph.cluster.raft.module.cuprot.CatchupProblem catchupProblem3 = null;
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onccerresForCoCa(catchupProblem3,
          storeSyncCompletedCompletableFuture4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0101");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.monitoring.Monitors monitors1 = null;
    java.nio.file.Path path2 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterServiceFileSystemImpl storeResourceWriterServiceFileSystemImpl3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterServiceFileSystemImpl(
          fileSystemAbstraction0, monitors1, path2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0102");
    }
    int int0 = io.github.onograph.cluster.raft.share.calg.cle.parts.PartRecordDataHeader.EXST_VX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0103");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onfesaceForCoSt(
          storeSyncCompletedCompletableFuture3, storeSyncCompleted4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0104");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingDivetenaDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0105");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingLersitDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0106");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    try {
      java.lang.String str1 = io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler.unahString(
          byteBuf0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0107");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier0 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    java.util.stream.IntStream intStream1 = nodeGroupIdentifier0.chars();
    org.junit.Assert.assertNotNull(nodeGroupIdentifier0);
    org.junit.Assert.assertNotNull(intStream1);
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0108");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService1 = null;
    io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader clusterLeader2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    org.neo4j.configuration.Config config4 = null;
    try {
      clusteringBalancerServiceImpl0.iniForClClLoCo(clusterStructureService1, clusterLeader2,
          logProvider3, config4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0109");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply catchupIncomingTransactionReply3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager catchupReplyChannelManager4 = null;
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture5 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ontpurseForCoCaCa(
          catchupIncomingTransactionReply3, catchupReplyChannelManager4,
          storeSyncCompletedCompletableFuture5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0110");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.Slice slice4 = null;
    try {
      boolean boolean5 = storeSyncCompletedAbstractCatchupAnswerManager2.isOnficttForCoSl(
          storeSyncCompletedCompletableFuture3, slice4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0111");
    }
    java.lang.String str0 = org.neo4j.dbms.database.SystemGraphDbmsModel.DATABASE_NAME_PROPERTY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0112");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture4 = nettyChannelImpl2.wrtFuture(
          (java.lang.Object) "protocols");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0113");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingHahitDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0114");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise2 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.deregister(channelHandlerContext1,
          channelPromise2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0115");
    }
    try {
      io.github.onograph.config.EntProVer entProVer1 = io.github.onograph.config.EntProVer.pasEntProVer(
          "leader-only");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: 9007ff7a-ea55-4f7d-a51e-b1aa0249e2fd");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0116");
    }
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting leaderNodeGroupSetting1 = new io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting(
        "name");
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0117");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingLersnaDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0118");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper0 = null;
    org.neo4j.io.fs.WritableChannel writableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel1);
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapperMarshaller.maslForCoWr(
          consensusNodeServerMemberIdWrapper0,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0119");
    }
    java.util.function.Supplier<org.neo4j.graphdb.GraphDatabaseService> graphDatabaseServiceSupplier0 = null;
    io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl1 = new io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl(
        graphDatabaseServiceSupplier0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional3 = systemGraphDbmsModelClusterImpl1.densrOptional(
          namedDatabaseId2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0120");
    }
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta0 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction2 = clearStaleClusterMeta0.andMetaUpgradeFlowAction(
          metaUpgradeFlowAction1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0121");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onfesaceForCoSt(
          storeSyncCompletedCompletableFuture3, storeSyncCompleted4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0122");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo1 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path0);
    try {
      java.nio.file.Path path3 = clusterMetaTopologyInfo1.lesdtPath(
          "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo1);
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0123");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData2 = io.github.onograph.cluster.raft.share.meta.fsm.comp.DataMarshaller.unahRequestData(
          readableChannel0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0124");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType0 = io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_UNKNOWN_GDB_ERR;
    org.junit.Assert.assertTrue("'" + catchupStatusType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_UNKNOWN_GDB_ERR + "'",
        catchupStatusType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_UNKNOWN_GDB_ERR));
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0125");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo1 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path0);
    java.nio.file.Path path2 = clusterMetaTopologyInfo1.getPscPath();
    try {
      java.nio.file.Path path3 = clusterMetaTopologyInfo1.olmmidsefPath();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo1);
    org.junit.Assert.assertNull(path2);
  }

  @Test
  public void test0126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0126");
    }
    org.neo4j.graphdb.config.Setting<java.lang.String> strSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingKunlstString;
    org.junit.Assert.assertNotNull(strSetting0);
  }

  @Test
  public void test0127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0127");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    java.util.Map<java.lang.Integer, org.neo4j.io.marshal.ChannelMarshal<io.github.onograph.cluster.raft.share.sync.SyncableData>> intMap1 = io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMarshalBuilder.build(
        logEntryReader0);
    org.junit.Assert.assertNotNull(intMap1);
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0128");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    try {
      boolean boolean2 = io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler.isUnahForRe(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0129");
    }
    io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    org.neo4j.configuration.connectors.ConnectorPortRegister connectorPortRegister2 = null;
    java.util.concurrent.Executor executor3 = null;
    io.netty.channel.ChannelInboundHandler channelInboundHandler4 = null;
    io.github.onograph.cluster.raft.netty.NettyChannelSetupManager nettyChannelSetupManager5 = null;
    io.github.onograph.cluster.raft.netty.NettyKQueueSettings<io.netty.channel.kqueue.KQueueServerSocketChannel> kQueueServerSocketChannelNettyKQueueSettings6 = io.github.onograph.cluster.raft.netty.NettyKQueueSettings.kqesecfNettyKQueueSettings();
    org.neo4j.logging.internal.LogService logService7 = null;
    io.github.onograph.cluster.raft.share.NodeServerInfoLogService nodeServerInfoLogService9 = new io.github.onograph.cluster.raft.share.NodeServerInfoLogService(
        logService7, "hi!");
    try {
      io.github.onograph.cluster.raft.netty.ClusterAdapter clusterAdapter10 = new io.github.onograph.cluster.raft.netty.ClusterAdapter(
          byteBufAllocator0, socketAddress1, connectorPortRegister2, executor3,
          channelInboundHandler4, nettyChannelSetupManager5,
          (io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings<io.netty.channel.kqueue.KQueueServerSocketChannel>) kQueueServerSocketChannelNettyKQueueSettings6,
          nodeServerInfoLogService9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(kQueueServerSocketChannelNettyKQueueSettings6);
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0130");
    }
    java.util.UUID uUID0 = null;
    try {
      io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId1 = new io.github.onograph.cluster.raft.id.ConsensusMemberGroupId(
          uUID0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: UUID should be not null.");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0131");
    }
    io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType consensusIdStatusType0 = io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType.POS_COMPUB;
    org.junit.Assert.assertTrue("'" + consensusIdStatusType0 + "' != '"
            + io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType.POS_COMPUB + "'",
        consensusIdStatusType0.equals(
            io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType.POS_COMPUB));
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0132");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync0 = null;
    org.neo4j.io.fs.WritableChannel writableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper.maslForWrAb(
          abstractTransactionSync0, (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0133");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach readReplicaNodeNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional2 = readReplicaNodeNamedServiceClusterApproach0.upesrfodaOptional(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0134");
    }
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType> messageDataTypeRef0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.cluster.raft.share.CommandReaderFactoryProvider commandReaderFactoryProvider2 = null;
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType> messageDataTypeRef3 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder consensusByteToMessageDecoder4 = new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider2, messageDataTypeRef3);
    java.util.function.Supplier<io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataByteToMessageDecoder> syncableDataByteToMessageDecoderSupplier5 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.MessageRequestCIHAManager messageRequestCIHAManager6 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageRequestCIHAManager(
          messageDataTypeRef0, logProvider1, consensusByteToMessageDecoder4,
          syncableDataByteToMessageDecoderSupplier5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0135");
    }
    io.netty.util.AttributeKey<org.neo4j.storageengine.api.CommandReaderFactory> commandReaderFactoryAttributeKey0 = io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder.CONCMD_RDXR_GENR_ATR;
    org.junit.Assert.assertNotNull(commandReaderFactoryAttributeKey0);
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0136");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.graphdb.facade.ExternalDependencies externalDependencies1 = null;
    io.github.onograph.cluster.raft.readreplica.ReadReplicaDatabaseManagementServiceWrapper.AbstractClusterModuleReadReplicaBuilder abstractClusterModuleReadReplicaBuilder2 = null;
    io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager clusterDiscoveryManager3 = null;
    try {
      io.github.onograph.cluster.raft.readreplica.ReadReplicaDatabaseManagementServiceWrapper readReplicaDatabaseManagementServiceWrapper4 = new io.github.onograph.cluster.raft.readreplica.ReadReplicaDatabaseManagementServiceWrapper(
          config0, externalDependencies1, abstractClusterModuleReadReplicaBuilder2,
          clusterDiscoveryManager3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0137");
    }
    java.lang.String str0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.TEM_DST_COP_DIEO_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "temp-copy" + "'", str0, "temp-copy");
  }

  @Test
  public void test0138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0138");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    org.neo4j.values.virtual.MapValue mapValue2 = null;
    try {
      org.neo4j.procedure.builtin.routing.RoutingResult routingResult3 = clusteringBalancerServiceImpl0.runRoutingResult(
          namedDatabaseId1, mapValue2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0139");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_FP;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_FP + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_FP));
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0140");
    }
    io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl databaseStartupControllerAbortableImpl0 = null;
    io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment storeSyncEnvironment1 = null;
    io.github.onograph.dbms.crash.CrashSignaler crashSignaler2 = null;
    io.github.onograph.cluster.raft.share.meta.pit.DataSyncManager dataSyncManager3 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    org.neo4j.monitoring.Monitors monitors6 = null;
    io.github.onograph.cluster.raft.share.meta.ActionProcessManager actionProcessManager7 = null;
    io.github.onograph.dbms.GdbReplicator gdbReplicator8 = null;
    io.github.onograph.cluster.raft.share.meta.SnapshotDataManager snapshotDataManager9 = null;
    org.neo4j.internal.helpers.TimeoutStrategy timeoutStrategy10 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter syncServiceLifecycleAdapter11 = new io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter(
          databaseStartupControllerAbortableImpl0, storeSyncEnvironment1, crashSignaler2,
          dataSyncManager3, jobScheduler4, logProvider5, monitors6, actionProcessManager7,
          gdbReplicator8, snapshotDataManager9, timeoutStrategy10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0141");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    try {
      short short2 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getShort();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0142");
    }
    org.neo4j.io.layout.DatabaseLayout databaseLayout0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    try {
      io.github.onograph.cluster.raft.share.SetupPreparerContainer setupPreparerContainer2 = new io.github.onograph.cluster.raft.share.SetupPreparerContainer(
          databaseLayout0, fileSystemAbstraction1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0143");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel defaultReadableChecksumChannel1 = new io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel(
          byteBuf0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0144");
    }
    java.lang.String str0 = org.neo4j.token.api.TokenHolder.TYPE_RELATIONSHIP_TYPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RelationshipType" + "'", str0,
        "RelationshipType");
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0145");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ClusterActorService.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "restarting-cluster-client" + "'", str0,
        "restarting-cluster-client");
  }

  @Test
  public void test0146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0146");
    }
    java.lang.String str0 = org.neo4j.token.api.TokenHolder.TYPE_LABEL;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Label" + "'", str0, "Label");
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0147");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta> nodeServerMemberTransactionLogDataMetaMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.CONS_MBX;
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMetaMetaWrapper0);
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0148");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingTemaseInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0149");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry akkaActorSystemRetry0 = null;
    java.time.Clock clock1 = null;
    org.neo4j.configuration.Config config2 = null;
    io.github.onograph.dbms.crash.CrashSignaler crashSignaler3 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService4 = null;
    org.neo4j.dbms.identity.ServerIdentity serverIdentity5 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler6 = null;
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager actorStackManager8 = null;
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService pointInTimeBackupService10 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager discoveryRetryManager13 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager(
        (long) (byte) 9, (long) (short) 100);
    org.neo4j.logging.LogProvider logProvider14 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.LocalClusterStructureService localClusterStructureService15 = new io.github.onograph.cluster.raft.module.dprot.impl.LocalClusterStructureService(
          akkaActorSystemRetry0, clock1, config2, crashSignaler3, databaseStateService4,
          serverIdentity5, jobScheduler6, logProvider7, actorStackManager8, monitors9,
          pointInTimeBackupService10, discoveryRetryManager13, logProvider14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0150");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    try {
      coreClusterStructureServiceLifecycleAdapter3.onldsedn((long) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0151");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterStructureManager clusterStructureManager0 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterStructureManager();
  }

  @Test
  public void test0152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0152");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.FPART;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.FPART
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.FPART));
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0153");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.read(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0154");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder sliceMetaByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      sliceMetaByteToMessageDecoder0.channelRead(channelHandlerContext1, (java.lang.Object) 1536);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0155");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyMessageToByteEncoder setupGdbStoreSyncReplyMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyMessageToByteEncoder();
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0156");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    try {
      java.lang.String str2 = io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler.unahString(
          readableChannel0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0157");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade1 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade3 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction4 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule5 = null;
    org.neo4j.memory.MemoryTracker memoryTracker6 = null;
    java.nio.file.Path path7 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo8 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path7);
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier9 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper10 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder11 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade3, namedDatabaseIdFunction4, globalModule5, memoryTracker6,
        clusterMetaTopologyInfo8, nodeGroupIdentifierSetSupplier9, leaderGatekeeper10);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat12 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv13 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade1, log2, clusterMetaTopologyInfo8,
        clusterMetaFormat12);
    try {
      java.nio.file.Path path15 = clusterMetaTopologyInfo8.ramesstdioPath(
          "restarting-cluster-client");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo8);
  }

  @Test
  public void test0158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0158");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotData snapshotData4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.oncospoForCoSn(
          storeSyncCompletedCompletableFuture3, snapshotData4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0159");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta3 = io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META;
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture4 = nettyChannelImpl2.wrtanflhFuture(
          (java.lang.Object) nodeServerMemberLeaderMeta3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMeta3);
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0160");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.kernel.database.DatabaseId[] databaseIdArray1 = new org.neo4j.kernel.database.DatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId> databaseIdSet2 = new java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.DatabaseId>) databaseIdSet2,
        databaseIdArray1);
    try {
      io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl gdbDiscoveryMetaCoreImpl4 = io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl.frmrwGdbDiscoveryMetaCoreImpl(
          config0, (java.util.Set<org.neo4j.kernel.database.DatabaseId>) databaseIdSet2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseIdArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0161");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder4 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    try {
      gdbIdInboundHandler2.channelRead(channelHandlerContext3,
          (java.lang.Object) transactionChunkingCompletedMessageToByteEncoder4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0162");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId gdbId4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ongdairnForCoGd(
          storeSyncCompletedCompletableFuture3, gdbId4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0163");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingInnnotzniaBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0164");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray4 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet5 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet5,
        consensusNodeIdArray4);
    try {
      coreClusterStructureServiceLifecycleAdapter3.oncetlchForSe(
          (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusNodeIdArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0165");
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
  public void test0166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0166");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.impl.directory.DiscoveryManagementActor.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-directory-actor" + "'", str0,
        "cc-directory-actor");
  }

  @Test
  public void test0167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0167");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.SC_COMPLETE;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.SC_COMPLETE
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.SC_COMPLETE));
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0168");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.latrpcApplicationComProFamilyType(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0169");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LCS_META;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LCS_META
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LCS_META));
  }

  @Test
  public void test0170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0170");
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
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture7 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ongadteiresForCoAl(allGdbIds6,
          storeSyncCompletedCompletableFuture7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
    org.junit.Assert.assertNotNull(namedDatabaseIdArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0171");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType1.getImpl();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType3 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    java.lang.String str4 = applicationComProFamilyType3.caerString();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType5 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    java.lang.String str6 = applicationComProFamilyType5.caerString();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType7 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.cluster.raft.control.ApplicationComProFamily[] applicationComProFamilyArray8 = new io.github.onograph.cluster.raft.control.ApplicationComProFamily[]{
        applicationComProFamilyType0, applicationComProFamilyType1, applicationComProFamilyType3,
        applicationComProFamilyType5, applicationComProFamilyType7};
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup9 = null;
    io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper applicationCurrentActiveComProFamilyWrapper10 = io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
        applicationComProFamilyComProFamilyGroup9);
    try {
      io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl comProFamilyManagerAppImpl11 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl(
          applicationComProFamilyArray8, applicationCurrentActiveComProFamilyWrapper10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: 7d8fd63f-3380-4643-a85c-b066437023e2");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType1 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType1.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer2);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType3 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType3.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "catchup_protocol" + "'", str4,
        "catchup_protocol");
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType5 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType5.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "catchup_protocol" + "'", str6,
        "catchup_protocol");
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType7 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType7.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(applicationComProFamilyArray8);
    org.junit.Assert.assertNotNull(applicationCurrentActiveComProFamilyWrapper10);
  }

  @Test
  public void test0172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0172");
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
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    try {
      org.neo4j.configuration.helpers.SocketAddress socketAddress11 = socketAddressServiceLeaderImpl8.prmySocketAddress(
          namedDatabaseId10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0173");
    }
    java.time.Clock clock0 = null;
    io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach readReplicaNodeNamedServiceClusterApproach2 = new io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach(
        1536);
    java.lang.Iterable<io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach> abstractNamedServiceClusterApproachIterable3 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    try {
      io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager5 = new io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager(
          clock0,
          (io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach) readReplicaNodeNamedServiceClusterApproach2,
          abstractNamedServiceClusterApproachIterable3, logProvider4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0174");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    try {
      boolean boolean3 = nettyChannelImpl2.isChannelOpen();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0175");
    }
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta> databaseIdMap0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta leaderMeta1 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta(
          databaseIdMap0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0176");
    }
    akka.cluster.ddata.LWWMap<io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper, io.github.onograph.cluster.raft.id.ConsensusNodeId> gdbServerIdWrapperLWWMap0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusMessageCoordinator consensusMessageCoordinator1 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusMessageCoordinator(
          gdbServerIdWrapperLWWMap0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0177");
    }
    java.util.Optional<io.github.onograph.cluster.raft.control.connect.HandshakeStateType> handshakeStateTypeOptional1 = io.github.onograph.cluster.raft.control.connect.HandshakeStateType.frmcdvaeOptional(
        (int) (byte) 9);
    org.junit.Assert.assertNotNull(handshakeStateTypeOptional1);
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0178");
    }
    java.lang.String str0 = org.neo4j.dbms.database.SystemGraphDbmsModel.DATABASE_DEFAULT_PROPERTY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default" + "'", str0, "default");
  }

  @Test
  public void test0179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0179");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta sliceMeta5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta(
        "store_version");
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onfihdForCoSl(
          storeSyncCompletedCompletableFuture3, sliceMeta5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0180");
    }
    akka.cluster.Cluster cluster0 = null;
    org.neo4j.configuration.Config config1 = null;
    try {
      akka.actor.Props props2 = io.github.onograph.cluster.raft.module.dprot.impl.structure.CleanupUnreachableActor.prpProps(
          cluster0, config1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0181");
    }
    int int0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer.SIEN;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0182");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaMessageToByteEncoder sliceMetaMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager2 = null;
    io.github.onograph.cluster.raft.share.AccessCapabilityMutatingLeader accessCapabilityMutatingLeader3 = new io.github.onograph.cluster.raft.share.AccessCapabilityMutatingLeader(
        consensusOperationsManager2);
    io.netty.channel.ChannelPromise channelPromise4 = null;
    try {
      sliceMetaMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) accessCapabilityMutatingLeader3, channelPromise4);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
  }

  @Test
  public void test0183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0183");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkaeccaeeuDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0184");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    try {
      transactionChunkingCompletedInboundHandler2.channelUnregistered(channelHandlerContext3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0185");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    try {
      boolean boolean3 = io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler.isUnahForRe(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0186");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      boolean boolean1 = io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings.isPrfniForCo(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0187");
    }
    java.time.Clock clock0 = null;
    java.time.Duration duration1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.config.SettingsDeclarationClusterImpl> settingsDeclarationClusterImplTransferCollection2 = new io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.config.SettingsDeclarationClusterImpl>(
          clock0, duration1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0188");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType1 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper socketAddressWrapper2 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
        socketAddress0, socketAddressSchemeType1);
    java.lang.Object obj3 = null;
    boolean boolean4 = socketAddressWrapper2.equals(obj3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0189");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager0);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dataSyncRunnerStatsManager0.securityContext;
    try {
      java.util.stream.Stream<io.github.onograph.cluster.raft.share.sync.PerformanceStatsMeta> performanceStatsMetaStream4 = dataSyncRunnerStatsManager0.stoStream(
          "Label");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalStateException; message: *** Error: 9aeae0f0-7ab8-4ac1-a41b-fd4e671a1870");
    } catch (java.lang.IllegalStateException e) {
    }
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory1);
    org.junit.Assert.assertNull(securityContext2);
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0190");
    }
    io.github.onograph.cluster.raft.control.ComProFamilyUtilities comProFamilyUtilities0 = new io.github.onograph.cluster.raft.control.ComProFamilyUtilities();
  }

  @Test
  public void test0191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0191");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType0 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_TLS_S_ERR;
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_TLS_S_ERR
        + "'", setupGdbSyncReplyStateType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_TLS_S_ERR));
  }

  @Test
  public void test0192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0192");
    }
    org.neo4j.graphdb.config.Setting<java.lang.String> strSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingUsedreiryString;
    org.junit.Assert.assertNotNull(strSetting0);
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0193");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    try {
      coreClusterStructureServiceLifecycleAdapter3.onldsedn((long) (short) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0194");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseId storeDatabaseId4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ongsirpForCoSt(
          storeSyncCompletedCompletableFuture3, storeDatabaseId4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0195");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType0 = io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_ERR;
    org.junit.Assert.assertTrue("'" + catchupStatusType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_ERR + "'",
        catchupStatusType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_ERR));
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0196");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.INFO_REQ;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.INFO_REQ
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.INFO_REQ));
  }

  @Test
  public void test0197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0197");
    }
    io.github.onograph.cluster.raft.share.meta.StoreGdbEnvironmentWrapper storeGdbEnvironmentWrapper0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    io.github.onograph.cluster.raft.utils.GdbUtilWrapperService gdbUtilWrapperService3 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    org.neo4j.memory.MemoryTracker memoryTracker5 = null;
    org.neo4j.io.pagecache.PageCache pageCache6 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer7 = null;
    io.github.onograph.cluster.raft.share.meta.SetupManager setupManager8 = null;
    org.neo4j.storageengine.api.StorageEngineFactory storageEngineFactory9 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.ConsensusConfiguratorForRaft consensusConfiguratorForRaft10 = new io.github.onograph.cluster.raft.share.meta.ConsensusConfiguratorForRaft(
          Clock.systemUTC(), storeGdbEnvironmentWrapper0, config1, fileSystemAbstraction2,
          gdbUtilWrapperService3, logProvider4, memoryTracker5, pageCache6, pageCacheTracer7,
          setupManager8, storageEngineFactory9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0198");
    }
    io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType messageStackStatusType0 = io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OVERSIZED_ERR;
    org.junit.Assert.assertTrue("'" + messageStackStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OVERSIZED_ERR
        + "'", messageStackStatusType0.equals(
        io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OVERSIZED_ERR));
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0199");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting1 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingCletqmutDuration;
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction noComAction2 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction(
        0L, (java.lang.Object) durationSetting1);
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder transactionSyncReplyByteToMessageDecoder3 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder();
    boolean boolean4 = noComAction2.equals(
        (java.lang.Object) transactionSyncReplyByteToMessageDecoder3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    io.github.onograph.cluster.raft.control.connect.ClientException clientException7 = new io.github.onograph.cluster.raft.control.connect.ClientException(
        "");
    try {
      transactionSyncReplyByteToMessageDecoder3.exceptionCaught(channelHandlerContext5,
          (java.lang.Throwable) clientException7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(durationSetting1);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0200");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols1 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols2 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols3 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols4 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols5 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    io.github.onograph.cluster.raft.control.MutableComProFamily[] mutableComProFamilyArray6 = new io.github.onograph.cluster.raft.control.MutableComProFamily[]{
        mutableProtocols0, mutableProtocols1, mutableProtocols2, mutableProtocols3,
        mutableProtocols4, mutableProtocols5};
    io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper[] mutatingCurrentActiveComProFamilyWrapperArray7 = new io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper[]{};
    java.util.ArrayList<io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper> mutatingCurrentActiveComProFamilyWrapperList8 = new java.util.ArrayList<io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper>) mutatingCurrentActiveComProFamilyWrapperList8,
        mutatingCurrentActiveComProFamilyWrapperArray7);
    try {
      io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerMutableImpl comProFamilyManagerMutableImpl10 = new io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerMutableImpl(
          mutableComProFamilyArray6,
          (java.util.Collection<io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper>) mutatingCurrentActiveComProFamilyWrapperList8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: 7d8fd63f-3380-4643-a85c-b066437023e2");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertTrue("'" + mutableProtocols1 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols1.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertTrue("'" + mutableProtocols2 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols2.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertTrue("'" + mutableProtocols3 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols3.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertTrue("'" + mutableProtocols4 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols4.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
    org.junit.Assert.assertTrue("'" + mutableProtocols5 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols5.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertNotNull(mutableComProFamilyArray6);
    org.junit.Assert.assertNotNull(mutatingCurrentActiveComProFamilyWrapperArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0201");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    java.util.UUID uUID2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState3 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId0, consensusNodeId1, uUID2);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor syncableDataProcessor4 = null;
    try {
      askState3.dipcForSy(syncableDataProcessor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0202");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    try {
      boolean boolean3 = nettyChannelImpl2.isChannelOpen();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0203");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader clusterLeader3 = null;
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.BalancerService balancerService4 = io.github.onograph.cluster.raft.gateway.gwlb.LoadBalancingResourceIntegrator.loaBalancerService(
          clusterStructureService0, config1, logProvider2, clusterLeader3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0204");
    }
    org.neo4j.graphdb.config.Setting<java.lang.String> strSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaoltnString;
    org.junit.Assert.assertNotNull(strSetting0);
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0205");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.IDX_SS_ANSWER;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.IDX_SS_ANSWER
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.IDX_SS_ANSWER));
  }

  @Test
  public void test0206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0206");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = consensusLogCacheServiceNLImpl0.getConsensusLogEntry(
        (long) 1);
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy3 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog consensusTransactionLog4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.cluster.raft.share.calg.mnode.MemberNodes memberNodes6 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta> candidateTermMetaStateStorage7 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta> candidateTallyMetaStateStorage8 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdTransferCollection9 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.meta.ConsensusMeta consensusMeta10 = new io.github.onograph.cluster.raft.share.calg.meta.ConsensusMeta(
          (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNLImpl0,
          consensusNodeIdLazy3, consensusTransactionLog4, logProvider5, memberNodes6,
          candidateTermMetaStateStorage7, candidateTallyMetaStateStorage8,
          consensusNodeIdTransferCollection9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(consensusLogEntry2);
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0207");
    }
    akka.cluster.ddata.LWWMap<akka.cluster.UniqueAddress, io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper> uniqueAddressLWWMap0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo structureInfo1 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo(
          uniqueAddressLWWMap0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0208");
    }
    org.neo4j.kernel.database.DatabaseTracers databaseTracers0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.memory.MemoryTracker memoryTracker2 = null;
    org.neo4j.io.pagecache.PageCache pageCache3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter(
        databaseTracers0, fileSystemAbstraction1, memoryTracker2, pageCache3);
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout6 = null;
    org.neo4j.storageengine.api.StorageEngineFactory storageEngineFactory8 = null;
    try {
      boolean boolean9 = syncRecoveryLifecycleAdapter4.isCarcreseForCoDaSt(config5, databaseLayout6,
          (long) 100, storageEngineFactory8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0209");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseId storeDatabaseId4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ongsirpForCoSt(
          storeSyncCompletedCompletableFuture3, storeDatabaseId4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0210");
    }
    java.lang.String str0 = org.neo4j.dbms.database.SystemGraphDbmsModel.DATABASE_STATUS_PROPERTY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "status" + "'", str0, "status");
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0211");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingLoigaInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0212");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingMieaedenttDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0213");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingRaeeeeBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0214");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    io.github.onograph.cluster.raft.akkamsg.ConsensusNettyChannelPoolLifecycleAdapter consensusNettyChannelPoolLifecycleAdapter1 = null;
    io.github.onograph.cluster.raft.akkamsg.ConsensusNettyChannelPoolLifecycleAdapter consensusNettyChannelPoolLifecycleAdapter2 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.ConsensusOutDirectionMessageProcessor consensusOutDirectionMessageProcessor3 = new io.github.onograph.cluster.raft.akkamsg.ConsensusOutDirectionMessageProcessor(
          logProvider0, consensusNettyChannelPoolLifecycleAdapter1,
          consensusNettyChannelPoolLifecycleAdapter2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0215");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMetaByteToMessageDecoder requestAuthMetaByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMetaByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      requestAuthMetaByteToMessageDecoder0.channelActive(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0216");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONMEM_UID;
    int int1 = metaType0.getMTypeIdent();
    org.junit.Assert.assertTrue("'" + metaType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONMEM_UID + "'",
        metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONMEM_UID));
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0217");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkimDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0218");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync3 = io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper.unahAbstractTransactionSync(
          logEntryReader0, readableChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0219");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal databaseIdOnlySafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    try {
      org.neo4j.kernel.database.DatabaseId databaseId4 = databaseIdOnlySafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseIdOnlySafeChannelMarshal0);
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0220");
    }
    org.neo4j.kernel.impl.api.LeaseService leaseService0 = org.neo4j.kernel.impl.api.LeaseService.NO_LEASES;
    org.junit.Assert.assertNotNull(leaseService0);
  }

  @Test
  public void test0221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0221");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<io.github.onograph.config.NodeGroupIdentifier>> nodeGroupIdentifierListSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingSevguList;
    org.junit.Assert.assertNotNull(nodeGroupIdentifierListSetting0);
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0222");
    }
    java.time.Clock clock0 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher inactiveNodeWatcher3 = new io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher(
        clock0, (long) (-1), log2);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId4 = null;
    try {
      inactiveNodeWatcher3.loattsdtmmwinkasForCo(consensusNodeId4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0223");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = null;
    dataSyncRunnerStatsManager0.securityContext = securityContext1;
    try {
      java.util.stream.Stream<io.github.onograph.cluster.raft.share.sync.PerformanceStatsMeta> performanceStatsMetaStream4 = dataSyncRunnerStatsManager0.stoStream(
          "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalStateException; message: *** Error: 9aeae0f0-7ab8-4ac1-a41b-fd4e671a1870");
    } catch (java.lang.IllegalStateException e) {
    }
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0224");
    }
    java.lang.String str0 = io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl.INTLRR;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_members" + "'", str0,
        "initial_members");
  }

  @Test
  public void test0225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0225");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo1 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path0);
    java.nio.file.Path path2 = clusterMetaTopologyInfo1.getPscPath();
    try {
      java.nio.file.Path path4 = clusterMetaTopologyInfo1.qunmrsefPath("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo1);
    org.junit.Assert.assertNull(path2);
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0226");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.putInt(
          128);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0227");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingMiuetzoiInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0228");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade1 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade3 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction4 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule5 = null;
    org.neo4j.memory.MemoryTracker memoryTracker6 = null;
    java.nio.file.Path path7 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo8 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path7);
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier9 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper10 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder11 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade3, namedDatabaseIdFunction4, globalModule5, memoryTracker6,
        clusterMetaTopologyInfo8, nodeGroupIdentifierSetSupplier9, leaderGatekeeper10);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat12 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv13 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade1, log2, clusterMetaTopologyInfo8,
        clusterMetaFormat12);
    try {
      java.nio.file.Path path15 = clusterMetaTopologyInfo8.seotcdioPath("leader-only");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo8);
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0229");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer1 = applicationComProFamilyType0.getImpl();
    io.netty.buffer.ByteBuf byteBuf2 = null;
    try {
      entProVer1.enoForBy(byteBuf2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType0 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType0.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer1);
  }

  @Test
  public void test0230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0230");
    }
    io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SF;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SF
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SF));
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0231");
    }
    org.neo4j.kernel.database.DatabaseTracers databaseTracers0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.memory.MemoryTracker memoryTracker2 = null;
    org.neo4j.io.pagecache.PageCache pageCache3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter(
        databaseTracers0, fileSystemAbstraction1, memoryTracker2, pageCache3);
    syncRecoveryLifecycleAdapter4.init();
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout7 = null;
    org.neo4j.storageengine.api.StorageEngineFactory storageEngineFactory9 = null;
    try {
      boolean boolean10 = syncRecoveryLifecycleAdapter4.isCarcreseForCoDaSt(config6,
          databaseLayout7, (long) (byte) -1, storageEngineFactory9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0232");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.StartOverIfSingleNotResponding startOverIfSingleNotResponding0 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.StartOverIfSingleNotResponding();
    java.lang.String str1 = startOverIfSingleNotResponding0.gersString();
    org.junit.Assert.assertEquals("'" + str1 + "' != '"
            + "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$StartOverIfSingleNotResponding. Unreachable node detected."
            + "'", str1,
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$StartOverIfSingleNotResponding. Unreachable node detected.");
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0233");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    try {
      long long2 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getLong();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0234");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk5 = null;
    java.lang.Void void6 = processorImpl2.process(bulkAsk5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage infoReplyMessage7 = null;
    try {
      java.lang.Void void8 = processorImpl2.process(infoReplyMessage7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0235");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade1 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade3 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction4 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule5 = null;
    org.neo4j.memory.MemoryTracker memoryTracker6 = null;
    java.nio.file.Path path7 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo8 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path7);
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier9 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper10 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder11 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade3, namedDatabaseIdFunction4, globalModule5, memoryTracker6,
        clusterMetaTopologyInfo8, nodeGroupIdentifierSetSupplier9, leaderGatekeeper10);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat12 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv13 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade1, log2, clusterMetaTopologyInfo8,
        clusterMetaFormat12);
    try {
      java.nio.file.Path path15 = clusterMetaTopologyInfo8.lesdtPath("temp-save");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo8);
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0236");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    try {
      int int1 = readablePositionAwareChecksumChannelManager0.getInt();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0237");
    }
    java.util.Map<io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper, io.github.onograph.cluster.raft.id.ConsensusNodeId> gdbServerIdWrapperMap0 = null;
    try {
      java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator> serverIdMap1 = io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator.ofConsensusGdbServerCoordinator(
          gdbServerIdWrapperMap0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0238");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat> clusterMetaFormatMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.META_WRAPPER_VESN_CLUSTER_META_FORMAT;
    java.lang.String str1 = clusterMetaFormatMetaWrapper0.toString();
    org.junit.Assert.assertNotNull(clusterMetaFormatMetaWrapper0);
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "version" + "'", str1, "version");
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0239");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted3 = null;
    try {
      java.lang.Object obj4 = processorImpl2.process(leaderNotAccepted3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0240");
    }
    org.neo4j.io.layout.DatabaseLayout databaseLayout0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    try {
      io.github.onograph.cluster.raft.share.SetupPreparerContainer.SetupPreparerContainerFSAImpl setupPreparerContainerFSAImpl2 = io.github.onograph.cluster.raft.share.SetupPreparerContainer.clbeaafSetupPreparerContainerSetupPreparerContainerFSAImpl(
          databaseLayout0, fileSystemAbstraction1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0241");
    }
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder> transactionLogSyncManagerBuilderConsensusNodeFollowersMeta0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    org.neo4j.memory.MemoryTracker memoryTracker3 = null;
    org.neo4j.io.pagecache.PageCache pageCache4 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer5 = null;
    io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder transactionLogSyncManagerBuilder6 = new io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder(
        fileSystemAbstraction1, logProvider2, memoryTracker3, pageCache4, pageCacheTracer5);
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta consensusNodeFollowerMeta7 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder> transactionLogSyncManagerBuilderConsensusNodeFollowersMeta8 = new io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>(
          transactionLogSyncManagerBuilderConsensusNodeFollowersMeta0,
          transactionLogSyncManagerBuilder6, consensusNodeFollowerMeta7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0242");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException2 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper4 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId0, (java.lang.Throwable) clusterDatabaseManagementException2, operatorState3);
    java.util.Optional<java.lang.Throwable> throwableOptional5 = discoveryGdbOperatorMetaWrapper4.faleOptional();
    boolean boolean6 = discoveryGdbOperatorMetaWrapper4.isHafl();
    org.junit.Assert.assertNotNull(throwableOptional5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0243");
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
  public void test0244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0244");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor consensusLogEntryRawCursor0 = io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor.emtConsensusLogEntryRawCursor();
    consensusLogEntryRawCursor0.close();
    long long2 = consensusLogEntryRawCursor0.ine();
    boolean boolean3 = consensusLogEntryRawCursor0.next();
    consensusLogEntryRawCursor0.close();
    org.junit.Assert.assertNotNull(consensusLogEntryRawCursor0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0245");
    }
    org.neo4j.graphdb.config.Setting<java.lang.String> strSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingKunsctString;
    org.junit.Assert.assertNotNull(strSetting0);
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0246");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.NIT_REQ;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.NIT_REQ
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.NIT_REQ));
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0247");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider incomingMessageProvider3 = io.github.onograph.cluster.raft.share.bulk.BulkIncomingMessageRunner.copaeIncomingMessageProvider(
          config0, jobScheduler1, logProvider2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0248");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper3 = io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapperMarshaller.unahConsensusNodeServerMemberIdWrapper(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0249");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    java.util.UUID uUID2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState3 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId0, consensusNodeId1, uUID2);
    io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor autoCloseableActionProcessor4 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer5 = null;
    try {
      askState3.dipcForSy(autoCloseableActionProcessor4, fSMDataConsumer5, (long) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0250");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingJoapaDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0251");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    try {
      float float1 = readablePositionAwareChecksumChannelManager0.getFloat();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0252");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.TimerMoment timerMoment0 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor.TimerMoment();
  }

  @Test
  public void test0253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0253");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    try {
      float float2 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getFloat();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0254");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    try {
      coreClusterStructureServiceLifecycleAdapter3.onldsedn(100L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0255");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsByteToMessageDecoder allGdbIdsByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup2 = null;
    io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper applicationCurrentActiveComProFamilyWrapper3 = io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
        applicationComProFamilyComProFamilyGroup2);
    io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyComProFamilyGroup4 = applicationCurrentActiveComProFamilyWrapper3.getComProFamilyGroupCtgrT();
    try {
      allGdbIdsByteToMessageDecoder0.userEventTriggered(channelHandlerContext1,
          (java.lang.Object) applicationCurrentActiveComProFamilyWrapper3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(applicationCurrentActiveComProFamilyWrapper3);
    org.junit.Assert.assertNull(applicationComProFamilyComProFamilyGroup4);
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0256");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_SC_COMPLETE;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_SC_COMPLETE + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_SC_COMPLETE));
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0257");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.logging.Level> levelSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingMielneLevel;
    org.junit.Assert.assertNotNull(levelSetting0);
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0258");
    }
    try {
      io.github.onograph.config.EntProVer entProVer1 = io.github.onograph.config.EntProVer.pasEntProVer(
          "status");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: 9007ff7a-ea55-4f7d-a51e-b1aa0249e2fd");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0259");
    }
    boolean boolean2 = io.github.onograph.cluster.raft.share.calg.VotingMemberThreshold.isQuu(
        (int) (short) 10, (int) ' ');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
  }

  @Test
  public void test0260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0260");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry akkaActorSystemRetry1 = io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.focfAkkaActorSystemRetry(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0261");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    try {
      io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId1 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.froConsensusMemberGroupId(
          databaseId0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0262");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressJSerializer uniqueAddressJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressJSerializer();
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType1 = io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_DIR;
    try {
      byte[] byteArray2 = uniqueAddressJSerializer0.toBinary((java.lang.Object) clusterDataType1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType cannot be cast to class akka.cluster.UniqueAddress (io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType and akka.cluster.UniqueAddress are in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + clusterDataType1 + "' != '"
            + io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_DIR + "'",
        clusterDataType1.equals(
            io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_DIR));
  }

  @Test
  public void test0263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0263");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingStcafaDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0264");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCleodeBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0265");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    try {
      org.neo4j.kernel.impl.transaction.log.LogPosition logPosition1 = readablePositionAwareChecksumChannelManager0.getCurrentPosition();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0266");
    }
    org.neo4j.dbms.identity.ServerId serverId0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException catchupNodeNotFoundException1 = new io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException(
        serverId0);
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0267");
    }
    java.time.Clock clock0 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.time.Duration duration3 = null;
    try {
      io.github.onograph.cluster.raft.watch.PerformanceTrackingLifecycleAdapter performanceTrackingLifecycleAdapter4 = new io.github.onograph.cluster.raft.watch.PerformanceTrackingLifecycleAdapter(
          clock0, jobScheduler1, logProvider2, duration3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0268");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType0 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_LBL;
    org.junit.Assert.assertTrue("'" + replicaTokenType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_LBL + "'",
        replicaTokenType0.equals(
            io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType.RTT_LBL));
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0269");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply10 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        consensusNodeId7, false, 100L);
    try {
      java.lang.Void void11 = processorImpl2.process(reply10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0270");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingReelrBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0271");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask12 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId7, consensusNodeId8, (long) '4', (long) (short) -1, 1L);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId13 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager messager14 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) ask12,
        consensusNodeId13);
    try {
      java.lang.Void void15 = processorImpl2.process(ask12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0272");
    }
    java.lang.Throwable throwable0 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryNodeReplyException discoveryNodeReplyException1 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryNodeReplyException(
        throwable0);
  }

  @Test
  public void test0273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0273");
    }
    org.neo4j.graphdb.Label label0 = org.neo4j.dbms.database.SystemGraphDbmsModel.DATABASE_LABEL;
    org.junit.Assert.assertNotNull(label0);
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0274");
    }
    org.neo4j.graphdb.GraphDatabaseService graphDatabaseService0 = null;
    try {
      io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl.clceppeForGr(graphDatabaseService0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0275");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbMetaActor.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-database-status-actor" + "'", str0,
        "cc-database-status-actor");
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0276");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaSafeChannelMarshal nodeServerMemberLeaderMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta4 = nodeServerMemberLeaderMetaSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMetaSafeChannelMarshal0);
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0277");
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
      java.nio.file.Path path9 = clusterMetaTopologyInfo5.olmmidsefPath();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0278");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onStart(
        throwingAction0);
    try {
      lifecycle1.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0279");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_CSNAP;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_CSNAP + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_CSNAP));
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0280");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    org.neo4j.dbms.identity.ServerId serverId3 = null;
    try {
      io.github.onograph.cluster.raft.palapp.NamedServiceApproachesService namedServiceApproachesService4 = new io.github.onograph.cluster.raft.palapp.NamedServiceApproachesService(
          clusterStructureService0, config1, logProvider2, serverId3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0281");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId0 = null;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl> serverIdMap2 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure databaseCoreClusterStructure3 = new io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure(
          consensusMemberGroupId0, databaseId1, serverIdMap2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0282");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId0, consensusNodeId1, (long) '4', (long) (short) -1, 1L);
    boolean boolean6 = ask5.getIsOr();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId7 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager messager8 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) ask5,
        consensusNodeId7);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0283");
    }
    io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder serverMessageToByteEncoder0 = new io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler4 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler2, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType5 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_ASK;
    boolean boolean6 = gdbIdInboundHandler4.acceptInboundMessage(
        (java.lang.Object) askMessageType5);
    io.netty.channel.ChannelPromise channelPromise7 = null;
    try {
      serverMessageToByteEncoder0.write(channelHandlerContext1, (java.lang.Object) boolean6,
          channelPromise7);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertTrue("'" + askMessageType5 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_ASK + "'",
        askMessageType5.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_ASK));
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0284");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_LSREN;
    int int1 = metaType0.getMTypeIdent();
    org.junit.Assert.assertTrue(
        "'" + metaType0 + "' != '" + io.github.onograph.cluster.raft.share.meta.MetaType.MT_LSREN
            + "'", metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_LSREN));
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0285");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin1 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin2 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.BalancerService balancerService3 = serverPoliciesPlugin2.getDlgtBalancerService();
    org.junit.Assert.assertNotNull(balancerService3);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0286");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier0 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    try {
      char char2 = nodeGroupIdentifier0.charAt((int) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(nodeGroupIdentifier0);
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0287");
    }
    io.github.onograph.cluster.raft.shared.ClusterGdbSeedValidator clusterGdbSeedValidator0 = new io.github.onograph.cluster.raft.shared.ClusterGdbSeedValidator();
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0288");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.Meta meta2 = io.github.onograph.cluster.raft.module.cuprot.current.info.Meta.craMeta(
        (long) 1536, "cc-core-restart-needed-listener-timer");
    long long3 = meta2.getLgIr();
    java.util.Optional<java.lang.String> strOptional4 = meta2.rectfaeOptional();
    org.junit.Assert.assertNotNull(meta2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1536L + "'", long3 == 1536L);
    org.junit.Assert.assertNotNull(strOptional4);
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0289");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade1 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade3 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction4 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule5 = null;
    org.neo4j.memory.MemoryTracker memoryTracker6 = null;
    java.nio.file.Path path7 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo8 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path7);
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier9 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper10 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder11 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade3, namedDatabaseIdFunction4, globalModule5, memoryTracker6,
        clusterMetaTopologyInfo8, nodeGroupIdentifierSetSupplier9, leaderGatekeeper10);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat12 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv13 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade1, log2, clusterMetaTopologyInfo8,
        clusterMetaFormat12);
    try {
      java.nio.file.Path path15 = clusterMetaTopologyInfo8.ratesadrrPath("initial_members");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo8);
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0290");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingVoeaseInteger;
    io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkcymsapInteger = intSetting0;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0291");
    }
    io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType nodeElectionTimeTrackerType0 = io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_NOW;
    org.junit.Assert.assertTrue("'" + nodeElectionTimeTrackerType0 + "' != '"
            + io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_NOW + "'",
        nodeElectionTimeTrackerType0.equals(
            io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_NOW));
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0292");
    }
    io.github.onograph.config.ClusterDiscoveryMode clusterDiscoveryMode0 = io.github.onograph.config.ClusterDiscoveryMode.SRV;
    org.junit.Assert.assertTrue(
        "'" + clusterDiscoveryMode0 + "' != '" + io.github.onograph.config.ClusterDiscoveryMode.SRV
            + "'",
        clusterDiscoveryMode0.equals(io.github.onograph.config.ClusterDiscoveryMode.SRV));
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0293");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder requestAllGdbIdsMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType3 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted(
        0L, setupGdbSyncReplyStateType3);
    io.netty.channel.ChannelPromise channelPromise5 = null;
    try {
      requestAllGdbIdsMessageToByteEncoder0.write(channelHandlerContext1, (java.lang.Object) 0L,
          channelPromise5);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType3 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType3.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0294");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal databaseIdOnlySafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal.IT;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    org.neo4j.io.fs.WritableChannel writableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl3 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel2);
    try {
      databaseIdOnlySafeChannelMarshal0.marshal(databaseId1,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseIdOnlySafeChannelMarshal0);
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0295");
    }
    io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager1.beginChecksum();
    try {
      io.github.onograph.dbms.WatchTag watchTag3 = marshalChannelImplCMS0.unmarshal0(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
  }

  @Test
  public void test0296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0296");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer discoveryGdbOperatorMetaWrapperJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer();
    boolean boolean1 = discoveryGdbOperatorMetaWrapperJSerializer0.includeManifest();
    akka.actor.ActorRef actorRef2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode removeReadReplicaNode3 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode(
        actorRef2);
    try {
      byte[] byteArray4 = discoveryGdbOperatorMetaWrapperJSerializer0.toBinary(
          (java.lang.Object) actorRef2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0297");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId gdbId4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ongdairnForCoGd(
          storeSyncCompletedCompletableFuture3, gdbId4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0298");
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
    org.neo4j.configuration.helpers.DbmsReadOnlyChecker dbmsReadOnlyChecker9 = null;
    io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer infoReplyMessageConsumer10 = new io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer();
    org.neo4j.logging.internal.DatabaseLogService databaseLogService11 = null;
    org.neo4j.collection.Dependencies dependencies12 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy13 = null;
    org.neo4j.kernel.lifecycle.LifeSupport lifeSupport14 = null;
    io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal syncableDataChannelMarshal15 = null;
    org.neo4j.monitoring.Monitors monitors16 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId17 = null;
    io.github.onograph.cluster.raft.akkamsg.OutDirection<io.github.onograph.cluster.raft.id.ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> consensusNodeIdOutDirection18 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapper consensusNodeGroupWrapper19 = consensusNodeGroupWrapperBuilder8.craConsensusNodeGroupWrapper(
          dbmsReadOnlyChecker9,
          (java.util.function.Consumer<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>) infoReplyMessageConsumer10,
          databaseLogService11, dependencies12, consensusNodeIdLazy13, lifeSupport14,
          syncableDataChannelMarshal15, monitors16, namedDatabaseId17,
          consensusNodeIdOutDirection18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0299");
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
      int int8 = labelTokenHolder7.size();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0300");
    }
    java.util.function.Predicate<java.lang.Object> objPredicate0 = null;
    io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler messageChannelDuplexHandler1 = new io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler(
        objPredicate0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.netty.channel.ChannelPromise channelPromise3 = null;
    try {
      messageChannelDuplexHandler1.disconnect(channelHandlerContext2, channelPromise3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0301");
    }
    java.time.Clock clock0 = null;
    io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach readReplicaNodeNamedServiceClusterApproach1 = new io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach();
    java.lang.Iterable<io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach> abstractNamedServiceClusterApproachIterable2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    try {
      io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager4 = new io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager(
          clock0,
          (io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach) readReplicaNodeNamedServiceClusterApproach1,
          abstractNamedServiceClusterApproachIterable2, logProvider3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0302");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType0 = io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_TRX_PRN_ERR;
    org.junit.Assert.assertTrue("'" + catchupStatusType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_TRX_PRN_ERR + "'",
        catchupStatusType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_TRX_PRN_ERR));
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0303");
    }
    io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting clusterLoadBalancingServerPoliciesGroupSetting1 = io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting.gruClusterLoadBalancingServerPoliciesGroupSetting(
        "catchup_protocol");
    org.neo4j.graphdb.config.Setting<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta>> loadBalanceServerMetaRuleProcessorSetting2 = clusterLoadBalancingServerPoliciesGroupSetting1.val;
    org.neo4j.graphdb.config.Setting<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta>> loadBalanceServerMetaRuleProcessorSetting3 = clusterLoadBalancingServerPoliciesGroupSetting1.val;
    org.neo4j.graphdb.config.Setting<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta>> loadBalanceServerMetaRuleProcessorSetting4 = clusterLoadBalancingServerPoliciesGroupSetting1.val;
    org.junit.Assert.assertNotNull(clusterLoadBalancingServerPoliciesGroupSetting1);
    org.junit.Assert.assertNotNull(loadBalanceServerMetaRuleProcessorSetting2);
    org.junit.Assert.assertNotNull(loadBalanceServerMetaRuleProcessorSetting3);
    org.junit.Assert.assertNotNull(loadBalanceServerMetaRuleProcessorSetting4);
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0304");
    }
    org.neo4j.kernel.database.Database database0 = null;
    io.github.onograph.cluster.raft.shared.DistributedGdb distributedGdb1 = null;
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.kernel.impl.factory.GraphDatabaseFacade graphDatabaseFacade3 = null;
    try {
      io.github.onograph.dbms.gdb.EnterpriseDatabaseContextClusterImpl enterpriseDatabaseContextClusterImpl4 = io.github.onograph.dbms.gdb.EnterpriseDatabaseContextClusterImpl.redrpcEnterpriseDatabaseContextClusterImpl(
          database0, distributedGdb1, monitors2, graphDatabaseFacade3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0305");
    }
    org.neo4j.configuration.SettingConstraint<java.lang.String> strSettingConstraint0 = io.github.onograph.cluster.raft.gateway.gwlb.LoadBalancingResourceIntegrator.hapgSettingConstraint();
    org.junit.Assert.assertNotNull(strSettingConstraint0);
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0306");
    }
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.MetricsEnvironmentWrapper metricsEnvironmentWrapper4 = io.github.onograph.cluster.raft.utils.MetricsEnvironmentWrapperBuilder.craMetricsEnvironmentWrapperBuilderMetricsEnvironmentWrapper(
        false, (long) (byte) 100, log2, "temp-save");
    metricsEnvironmentWrapper4.cla();
    org.junit.Assert.assertNotNull(metricsEnvironmentWrapper4);
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0307");
    }
    akka.actor.ActorRef actorRef0 = null;
    akka.cluster.Cluster cluster1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher clusterDataWatcher2 = null;
    org.neo4j.dbms.identity.ServerId serverId3 = null;
    akka.actor.ActorRef actorRef4 = null;
    akka.stream.javadsl.SourceQueueWithComplete<io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta> readReplicateGdbMetaSourceQueueWithComplete5 = null;
    akka.actor.Props props6 = io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbMetaActor.prpProps(
        actorRef0, cluster1, clusterDataWatcher2, serverId3, actorRef4,
        readReplicateGdbMetaSourceQueueWithComplete5);
    org.junit.Assert.assertNotNull(props6);
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0308");
    }
    io.github.onograph.dbms.DbmsManagerClusterImpl dbmsManagerClusterImpl0 = new io.github.onograph.dbms.DbmsManagerClusterImpl();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      io.github.onograph.dbms.DbmsManagerClusterImpl.IntegrationManager integrationManager2 = dbmsManagerClusterImpl0.botrDbmsManagerClusterImplIntegrationManager(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0309");
    }
    java.util.Map<java.lang.String, java.net.InetAddress[]> strMap0 = null;
    io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl domainToInetAddressProviderConfImpl1 = new io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl(
        strMap0);
    try {
      java.net.InetAddress[] inetAddressArray3 = domainToInetAddressProviderConfImpl1.revdanmInetAddress(
          "status");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0310");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService0 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl1 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator3 = null;
    java.util.function.Supplier<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSupplier4 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl leaseServiceEnterpriseImpl5 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeaseServiceEnterpriseImpl(
        consensusLeaderNodeService0, syncableLeasableCoreNodeDataFSMImpl1, namedDatabaseId2,
        syncerator3, consensusNodeIdSupplier4);
    try {
      boolean boolean7 = leaseServiceEnterpriseImpl5.isInl(13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0311");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach readReplicaNodeNamedServiceClusterApproach1 = new io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach(
        1536);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional3 = readReplicaNodeNamedServiceClusterApproach1.upesrfodaOptional(
          namedDatabaseId2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0312");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_GZIP;
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_GZIP + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_GZIP));
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0313");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder askMessageTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise3 = null;
    try {
      askMessageTypeMessageToByteEncoder0.write(channelHandlerContext1, (java.lang.Object) "status",
          channelPromise3);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0314");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCleorsDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0315");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_VAL;
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_VAL + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_VAL));
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0316");
    }
    java.time.Clock clock0 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher inactiveNodeWatcher3 = new io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher(
        clock0, (long) ' ', log2);
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0317");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat> clusterMetaFormatMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.META_WRAPPER_VESN_CLUSTER_META_FORMAT;
    org.neo4j.configuration.Config config1 = null;
    try {
      int int2 = clusterMetaFormatMetaWrapper0.roaosiForCo(config1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.UnsupportedOperationException; message: *** Error: f6831586-3fdd-48fc-b466-4cba4ebce169");
    } catch (java.lang.UnsupportedOperationException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaFormatMetaWrapper0);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0318");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType1.getImpl();
    boolean boolean3 = viewClusterInfo0.equals((java.lang.Object) entProVer2);
    java.util.Set<akka.cluster.Member> memberSet4 = viewClusterInfo0.getSetUrahbMember();
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType1 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType1.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(memberSet4);
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0319");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal readReplicateGdbMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal.IT;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> serverIdMap2 = null;
    io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta readReplicateGdbMeta3 = io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(
        databaseId1, serverIdMap2);
    org.neo4j.kernel.database.DatabaseId databaseId4 = readReplicateGdbMeta3.getDatabaseId();
    org.neo4j.io.fs.WritableChannel writableChannel5 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl6 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel5);
    try {
      readReplicateGdbMetaSafeChannelMarshal0.marshal(readReplicateGdbMeta3,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(readReplicateGdbMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(readReplicateGdbMeta3);
    org.junit.Assert.assertNull(databaseId4);
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0320");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType0 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.https;
    org.junit.Assert.assertTrue("'" + socketAddressSchemeType0 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.https
        + "'", socketAddressSchemeType0.equals(
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.https));
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0321");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal readReplicateGdbMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    try {
      io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta readReplicateGdbMeta4 = readReplicateGdbMetaSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(readReplicateGdbMetaSafeChannelMarshal0);
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0322");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync0 = null;
    org.neo4j.io.fs.WritableChannel writableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper.maslForWrAb(
          abstractTransactionSync0, writableChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0323");
    }
    java.util.function.Supplier<java.lang.Enum> enumSupplier0 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.MultiScHolder multiScHolder1 = new io.github.onograph.cluster.raft.share.calg.scholder.MultiScHolder(
        enumSupplier0);
    try {
      io.github.onograph.cluster.raft.share.calg.scholder.ScHold scHold2 = multiScHolder1.nexScHold();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0324");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.onungt();
    try {
      coreClusterStructureServiceLifecycleAdapter3.onldsedn(0L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0325");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    try {
      io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId3 = clusterSessionBean2.oweConsensusNodeId();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0326");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.onungt();
    coreClusterStructureServiceLifecycleAdapter3.shutdown();
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta6 = io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META;
    try {
      coreClusterStructureServiceLifecycleAdapter3.onleeswcForNo(nodeServerMemberLeaderMeta6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMeta6);
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0327");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_NOOP;
    org.junit.Assert.assertTrue(
        "'" + metaType0 + "' != '" + io.github.onograph.cluster.raft.share.meta.MetaType.MT_NOOP
            + "'", metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_NOOP));
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0328");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker1 = null;
    try {
      org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker2 = readablePositionAwareChecksumChannelManager0.getCurrentPosition(
          logPositionMarker1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0329");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingTranrdeSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0330");
    }
    io.github.onograph.config.ClusterDiscoveryMode clusterDiscoveryMode0 = io.github.onograph.config.ClusterDiscoveryMode.DNS;
    org.junit.Assert.assertTrue(
        "'" + clusterDiscoveryMode0 + "' != '" + io.github.onograph.config.ClusterDiscoveryMode.DNS
            + "'",
        clusterDiscoveryMode0.equals(io.github.onograph.config.ClusterDiscoveryMode.DNS));
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0331");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Long> longSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingIngcxsLong;
    org.junit.Assert.assertNotNull(longSetting0);
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0332");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel1 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = defaultWritableChecksumChannel1.putShort(
          (short) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0333");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach configuredNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional2 = configuredNamedServiceClusterApproach0.upesrfodaOptional(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0334");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses discoverySocketAddresses1 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.frmcngDiscoverySocketAddresses(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0335");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.STORE_GUID;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.STORE_GUID
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.STORE_GUID));
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0336");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.put(
          (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0337");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Ask ask9 = null;
    try {
      java.lang.Void void10 = processorImpl2.process(ask9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
  }

  @Test
  public void test0338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0338");
    }
    try {
      io.github.onograph.config.EntProVer entProVer1 = io.github.onograph.config.EntProVer.pasEntProVer(
          "default");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: 9007ff7a-ea55-4f7d-a51e-b1aa0249e2fd");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0339");
    }
    java.time.Clock clock0 = null;
    java.time.Duration duration1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<org.neo4j.kernel.api.exceptions.Status> statusTransferCollection2 = new io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<org.neo4j.kernel.api.exceptions.Status>(
          clock0, duration1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0340");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    java.util.UUID uUID2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState3 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId0, consensusNodeId1, uUID2);
    io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor autoCloseableActionProcessor4 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer5 = null;
    try {
      askState3.dipcForSy(autoCloseableActionProcessor4, fSMDataConsumer5, (long) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0341");
    }
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType> messageDataTypeRef0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter messageDataTypeChannelInboundHandlerAdapter1 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter(
        messageDataTypeRef0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    try {
      messageDataTypeChannelInboundHandlerAdapter1.channelReadComplete(channelHandlerContext2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0342");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRF_IN_ANSWER;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRF_IN_ANSWER
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRF_IN_ANSWER));
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0343");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray0 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet1 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1,
        consensusNodeIdArray0);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper3 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor syncableDataProcessor4 = null;
    try {
      consensusNodeServerMemberIdWrapper3.dipcForSy(syncableDataProcessor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusNodeIdArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0344");
    }
    java.lang.String str0 = org.neo4j.dbms.database.SystemGraphDbmsModel.DATABASE_STORAGE_ENGINE_PROPERTY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "storage_engine" + "'", str0,
        "storage_engine");
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0345");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    java.lang.String str1 = mutableProtocols0.caerString();
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "type_comp" + "'", str1, "type_comp");
  }

  @Test
  public void test0346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0346");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Finished finished1 = new io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Finished(
        socketAddress0);
    org.neo4j.configuration.helpers.SocketAddress socketAddress2 = finished1.adeidSocketAddress;
    org.neo4j.configuration.helpers.SocketAddress socketAddress3 = finished1.adeidSocketAddress;
    org.junit.Assert.assertNull(socketAddress2);
    org.junit.Assert.assertNull(socketAddress3);
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0347");
    }
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta1 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta0);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta3 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta2);
    akka.cluster.ddata.ReplicatedData replicatedData4 = syncedLeaderMeta1.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta3);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta5 = io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META;
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType6 = io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_NODE_MAP;
    boolean boolean7 = nodeServerMemberLeaderMeta5.equals((java.lang.Object) clusterDataType6);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta8 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta5);
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta9 = syncedLeaderMeta1.mergeData(
          syncedLeaderMeta8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(replicatedData4);
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMeta5);
    org.junit.Assert.assertTrue("'" + clusterDataType6 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_NODE_MAP
        + "'", clusterDataType6.equals(
        io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_NODE_MAP));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0348");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout10 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
        consensusNodeId9);
    java.lang.Void void11 = processorImpl2.process(consensusElectionTimeout10);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage12 = null;
    try {
      java.lang.Void void13 = processorImpl2.process(requestTransactionLogCZMetaMessage12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNull(void11);
  }

  @Test
  public void test0349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0349");
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
      org.neo4j.token.api.NamedToken namedToken9 = labelTokenHolder7.getTokenById(13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0350");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage[] infoReplyMessageArray0 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage[]{};
    java.util.ArrayList<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> infoReplyMessageList1 = new java.util.ArrayList<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>) infoReplyMessageList1,
        infoReplyMessageArray0);
    java.lang.Exception exception3 = null;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData4 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        exception3);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta5 = io.github.onograph.cluster.raft.share.sync.SyncMeta.apldSyncMeta(
        fSMData4);
    io.github.onograph.cluster.raft.share.sync.ClusterMetaInfoReply clusterMetaInfoReply6 = new io.github.onograph.cluster.raft.share.sync.ClusterMetaInfoReply(
        (java.util.List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>) infoReplyMessageList1,
        syncMeta5);
    java.util.List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> infoReplyMessageList7 = clusterMetaInfoReply6.getListRsossInfoReplyMessage();
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta8 = clusterMetaInfoReply6.getRrSyncMeta();
    org.junit.Assert.assertNotNull(infoReplyMessageArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(fSMData4);
    org.junit.Assert.assertNotNull(syncMeta5);
    org.junit.Assert.assertNotNull(infoReplyMessageList7);
    org.junit.Assert.assertNotNull(syncMeta8);
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0351");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.palapp.strategies.ConfiguredNamedServiceClusterApproach.IDNT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user-defined" + "'", str0,
        "user-defined");
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0352");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder askMessageTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      askMessageTypeMessageToByteEncoder0.flush(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0353");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType clusterNodeRoleType0 = io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.UNKNOWN;
    org.junit.Assert.assertTrue("'" + clusterNodeRoleType0 + "' != '"
            + io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.UNKNOWN + "'",
        clusterNodeRoleType0.equals(
            io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.UNKNOWN));
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0354");
    }
    io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings messageStackSettings3 = new io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackSettings(
        (int) (short) 0, (int) ' ', (long) (byte) 100);
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0355");
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
      java.lang.Iterable<org.neo4j.token.api.NamedToken> namedTokenIterable8 = labelTokenHolder7.getAllTokens();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0356");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType0 = io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_META;
    org.junit.Assert.assertTrue("'" + clusterDataType0 + "' != '"
            + io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_META + "'",
        clusterDataType0.equals(
            io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_META));
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0357");
    }
    akka.actor.ActorRef actorRef0 = null;
    akka.actor.ActorRef actorRef1 = null;
    akka.cluster.Cluster cluster2 = null;
    org.neo4j.configuration.Config config3 = null;
    akka.actor.ActorRef actorRef4 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterMembersWatcher clusterMembersWatcher5 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor globalMetaActor6 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor(
          actorRef0, actorRef1, cluster2, config3, actorRef4, clusterMembersWatcher5);
      org.junit.Assert.fail(
          "Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [io.github.onograph.cluster.raft.module.dprot.impl.structure.GlobalMetaActor] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
    } catch (akka.actor.ActorInitializationException e) {
    }
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0358");
    }
    java.util.List<io.github.onograph.cluster.raft.share.meta.MetaWrapper<?>> wildcardMetaWrapperList0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.vauList();
    org.junit.Assert.assertNotNull(wildcardMetaWrapperList0);
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0359");
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
    try {
      leaseServiceEnterpriseImpl8.inil(2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0360");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.FSMUtils fSMUtils0 = null;
    org.neo4j.token.TokenRegistry tokenRegistry1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl fSMTokenImpl3 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.FSMTokenImpl(
          fSMUtils0, tokenRegistry1, logProvider2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0361");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusMessageCoordinator consensusMessageCoordinator0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusMessageCoordinator.EMT_CONSENSUS_MESSAGE_COORDINATOR;
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType1 = io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR;
    boolean boolean2 = consensusMessageCoordinator0.equals((java.lang.Object) catchupStatusType1);
    org.junit.Assert.assertNotNull(consensusMessageCoordinator0);
    org.junit.Assert.assertTrue("'" + catchupStatusType1 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR
        + "'", catchupStatusType1.equals(
        io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR));
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0362");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingDivetitDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0363");
    }
    io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
    byte[] byteArray4 = new byte[]{(byte) 100, (byte) 10, (byte) 9};
    io.netty.buffer.ByteBuf[] byteBufArray6 = new io.netty.buffer.ByteBuf[]{};
    java.util.LinkedList<io.netty.buffer.ByteBuf> byteBufList7 = new java.util.LinkedList<io.netty.buffer.ByteBuf>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<io.netty.buffer.ByteBuf>) byteBufList7, byteBufArray6);
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl9 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl(
          byteBufAllocator0, byteArray4, 2,
          (java.util.Queue<io.netty.buffer.ByteBuf>) byteBufList7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: allocator cannot be null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, 9]");
    org.junit.Assert.assertNotNull(byteBufArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0364");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdByteToMessageDecoder gdbIdByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdByteToMessageDecoder();
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0365");
    }
    io.github.onograph.cluster.raft.watch.DiagnosticsOfflineReportProviderClusterImpl diagnosticsOfflineReportProviderClusterImpl0 = new io.github.onograph.cluster.raft.watch.DiagnosticsOfflineReportProviderClusterImpl();
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0366");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure databaseReadReplicaClusterStructure1 = io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure.emtDatabaseReadReplicaClusterStructure(
          databaseId0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0367");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMarshalBuilder syncableDataMarshalBuilder0 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMarshalBuilder();
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0368");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingCledeitDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0369");
    }
    java.time.Clock clock0 = null;
    org.neo4j.monitoring.Monitors monitors1 = null;
    io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider incomingMessageProvider2 = io.github.onograph.cluster.raft.share.calg.ConsensusIncomingMessageMonitoringProcessor.copaeIncomingMessageProvider(
        clock0, monitors1);
    org.junit.Assert.assertNotNull(incomingMessageProvider2);
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0370");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService1 = null;
    io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader clusterLeader2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    org.neo4j.configuration.Config config4 = null;
    try {
      clusteringBalancerServiceImpl0.iniForClClLoCo(clusterStructureService1, clusterLeader2,
          logProvider3, config4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0371");
    }
    io.github.onograph.config.ClusterDiscoveryMode clusterDiscoveryMode0 = io.github.onograph.config.ClusterDiscoveryMode.LIST;
    org.junit.Assert.assertTrue(
        "'" + clusterDiscoveryMode0 + "' != '" + io.github.onograph.config.ClusterDiscoveryMode.LIST
            + "'",
        clusterDiscoveryMode0.equals(io.github.onograph.config.ClusterDiscoveryMode.LIST));
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0372");
    }
    org.neo4j.cli.ExecutionContext executionContext0 = null;
    java.time.Clock clock1 = null;
    try {
      io.github.onograph.commandline.dbms.ClusterDisconnectCommand clusterDisconnectCommand2 = new io.github.onograph.commandline.dbms.ClusterDisconnectCommand(
          executionContext0, clock1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0373");
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
      org.neo4j.token.api.NamedToken namedToken9 = relationshipTypeTokenHolder7.getInternalTokenById(
          128);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0374");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId0, consensusNodeId1, (long) '4', (long) (short) -1, 1L);
    boolean boolean6 = ask5.getIsOr();
    long long7 = ask5.getLgIll();
    io.github.onograph.cluster.raft.utils.ExceptionManager exceptionManager9 = new io.github.onograph.cluster.raft.utils.ExceptionManager(
        "designated_seeder");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException11 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        "store_version");
    exceptionManager9.addForTh((java.lang.Throwable) gdbStoreSyncCrlException11);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException gdbIsoException13 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException(
        (java.lang.Exception) gdbStoreSyncCrlException11);
    boolean boolean14 = ask5.equals((java.lang.Object) gdbStoreSyncCrlException11);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test0375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0375");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.put(
          (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0376");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader clusterLeader1 = null;
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManagerFunction serverMetaManagerFunction2 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerMetaManagerFunction(
        clusterStructureService0, clusterLeader1);
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0377");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel1 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = defaultWritableChecksumChannel1.putLong(
          (long) 3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0378");
    }
    java.util.Map<akka.cluster.UniqueAddress, io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper> uniqueAddressMap0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo structureInfo1 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo(
          uniqueAddressMap0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0379");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingIngcxiInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0380");
    }
    java.util.function.Supplier<org.neo4j.graphdb.GraphDatabaseService> graphDatabaseServiceSupplier0 = null;
    io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl1 = new io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl(
        graphDatabaseServiceSupplier0);
    org.neo4j.graphdb.factory.module.GlobalModule globalModule2 = null;
    io.github.onograph.dbms.HealthMonitorService healthMonitorService3 = null;
    org.neo4j.bolt.txtracking.ReconciledTransactionTracker reconciledTransactionTracker4 = null;
    try {
      io.github.onograph.dbms.ClusteringMediationDbmsManagers clusteringMediationDbmsManagers5 = new io.github.onograph.dbms.ClusteringMediationDbmsManagers(
          (io.github.onograph.dbms.DefaultSystemGraphDbmsModel) systemGraphDbmsModelClusterImpl1,
          globalModule2, healthMonitorService3, reconciledTransactionTracker4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0381");
    }
    io.github.onograph.cluster.raft.utils.queuesrv.ElementQueueRunnerImpl<io.github.onograph.cluster.raft.module.cuprot.AskMessageType> askMessageTypeElementQueueRunnerImpl0 = new io.github.onograph.cluster.raft.utils.queuesrv.ElementQueueRunnerImpl<io.github.onograph.cluster.raft.module.cuprot.AskMessageType>();
    boolean boolean1 = askMessageTypeElementQueueRunnerImpl0.isQueueEmpty();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0382");
    }
    io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType nodeElectionTimeTrackerType0 = io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_ERR_TRACE;
    org.junit.Assert.assertTrue("'" + nodeElectionTimeTrackerType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_ERR_TRACE
        + "'", nodeElectionTimeTrackerType0.equals(
        io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_ERR_TRACE));
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0383");
    }
    io.github.onograph.cluster.raft.share.calg.ResettableMessageTimer resettableMessageTimer0 = null;
    io.github.onograph.cluster.raft.share.calg.LeaderNodeScheduleWrapper leaderNodeScheduleWrapper1 = null;
    java.util.function.LongSupplier longSupplier2 = null;
    io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider incomingMessageProvider3 = io.github.onograph.cluster.raft.share.calg.LeaderNodeStatusIncomingMessageProcessor.copaeIncomingMessageProvider(
        resettableMessageTimer0, leaderNodeScheduleWrapper1, longSupplier2);
    org.junit.Assert.assertNotNull(incomingMessageProvider3);
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0384");
    }
    io.github.onograph.cluster.raft.share.ConsensusIncomingMessageManager consensusIncomingMessageManager0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.cluster.raft.akkamsg.IncomingMessageProvider incomingMessageProvider2 = io.github.onograph.cluster.raft.share.EnterpriseClusterIncomingMessageProcessor.copaeIncomingMessageProvider(
        consensusIncomingMessageManager0, logProvider1);
    org.junit.Assert.assertNotNull(incomingMessageProvider2);
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0385");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier0 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    try {
      java.lang.CharSequence charSequence3 = nodeGroupIdentifier0.subSequence((int) '#', (int) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 97, length 0");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertNotNull(nodeGroupIdentifier0);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0386");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl2 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, log1, refCatchupManagerImpl2);
    io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
    try {
      sliceMetaSimpleChannelInboundHandler3.channelReadComplete(channelHandlerContext4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0387");
    }
    io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer infoReplyMessageConsumer0 = new io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage infoReplyMessage1 = null;
    try {
      infoReplyMessageConsumer0.accept(infoReplyMessage1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0388");
    }
    akka.cluster.ClusterEvent.CurrentClusterState currentClusterState0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo1 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo(
          currentClusterState0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0389");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.latchpolApplicationComProFamilyType(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0390");
    }
    io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreService storeService2 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreService(
          lifecycleCatchupManagerImpl0, logProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0391");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta1 = marshalChannelImplCMS0.startState();
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS2 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta3 = marshalChannelImplCMS2.startState();
    boolean boolean5 = nodeServerMemberTransactionLogDataMeta3.isTrnt((long) '#');
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta6 = nodeServerMemberTransactionLogDataMeta3.neitcNodeServerMemberTransactionLogDataMeta();
    org.neo4j.io.fs.WritableChannel writableChannel7 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl8 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel7);
    try {
      marshalChannelImplCMS0.marshal(nodeServerMemberTransactionLogDataMeta3,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta1);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS2);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta6);
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0392");
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
      int int8 = relationshipTypeTokenHolder7.size();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0393");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkaecapzInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0394");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    java.lang.String str1 = mutableProtocols0.caerString();
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "type_comp" + "'", str1, "type_comp");
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0395");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
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
    org.neo4j.logging.LogProvider logProvider18 = null;
    org.neo4j.memory.MemoryTracker memoryTracker19 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout20 = null;
    try {
      io.github.onograph.cluster.raft.id.CoreNodeClusterIdentModImpl coreNodeClusterIdentModImpl21 = new io.github.onograph.cluster.raft.id.CoreNodeClusterIdentModImpl(
          fileSystemAbstraction0, clusterSimpleStorageFacade10, logProvider18, memoryTracker19,
          neo4jLayout20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo6);
    org.junit.Assert.assertNull(path7);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo13);
    org.junit.Assert.assertNull(path14);
    org.junit.Assert.assertNotNull(clusterMetaFormat16);
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0396");
    }
    java.lang.String str0 = org.neo4j.dbms.database.SystemGraphDbmsModel.DATABASE_UUID_PROPERTY;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "uuid" + "'", str0, "uuid");
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0397");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo1 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path0);
    java.nio.file.Path path2 = clusterMetaTopologyInfo1.getPscPath();
    try {
      java.nio.file.Path path4 = clusterMetaTopologyInfo1.ramesstdioPath("joiner");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo1);
    org.junit.Assert.assertNull(path2);
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0398");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach readReplicaNodeNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach();
    readReplicaNodeNamedServiceClusterApproach0.setup();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    try {
      java.util.Collection<org.neo4j.dbms.identity.ServerId> serverIdCollection3 = readReplicaNodeNamedServiceClusterApproach0.upesrfdteCollection(
          namedDatabaseId2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0399");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingMieaoranoBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0400");
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
    org.neo4j.token.api.NamedToken namedToken8 = null;
    try {
      labelTokenHolder7.addToken(namedToken8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0401");
    }
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog0 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long2 = inMemoryConsensusTransactionLog0.prn((long) 1536);
    long long4 = inMemoryConsensusTransactionLog0.redettm(0L);
    org.neo4j.monitoring.Monitors monitors5 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.cle.MonitoredConsensusTransactionLog monitoredConsensusTransactionLog6 = new io.github.onograph.cluster.raft.share.calg.cle.MonitoredConsensusTransactionLog(
          (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog) inMemoryConsensusTransactionLog0,
          monitors5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1536L + "'", long2 == 1536L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0402");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper2 = io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapperMarshaller.unahConsensusNodeServerMemberIdWrapper(
          readableChannel0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0403");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockLimiters transactionBlockLimiters0 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockLimiters.UNOD_TRANSACTION_BLOCK_LIMITERS;
    boolean boolean2 = transactionBlockLimiters0.isCole((long) 100);
    org.junit.Assert.assertNotNull(transactionBlockLimiters0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0404");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.LeaderMetaSafeChannelMarshal leaderMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.LeaderMetaSafeChannelMarshal.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.getCurrentPosition();
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta leaderMeta5 = leaderMetaSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(leaderMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(logPosition4);
  }

  @Test
  public void test0405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0405");
    }
    java.util.function.Supplier<java.lang.Enum> enumSupplier0 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.MultiScHolder multiScHolder1 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder.muttioMultiScHolder(
        enumSupplier0);
    try {
      io.github.onograph.cluster.raft.share.calg.scholder.ScHold scHold2 = multiScHolder1.nexScHold();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(multiScHolder1);
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0406");
    }
    io.github.onograph.cluster.raft.palapp.strategies.DefaultNamedServiceClusterApproach defaultNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.DefaultNamedServiceClusterApproach();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Collection<org.neo4j.dbms.identity.ServerId> serverIdCollection2 = defaultNamedServiceClusterApproach0.upesrfdteCollection(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0407");
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
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta> candidateTallyMetaStateStorage12 = clusterSimpleStorageFacade8.crervsteStateStorage(
          databaseLogProvider9, "version", lifeSupport11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo4);
    org.junit.Assert.assertNull(path5);
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0408");
    }
    io.github.onograph.dbms.crash.CrashManager crashManager0 = null;
    io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl databaseStartupControllerAbortableImpl1 = null;
    org.neo4j.kernel.database.Database database2 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl3 = null;
    try {
      io.github.onograph.cluster.raft.readreplica.ReadReplicaCrashServiceAdapter readReplicaCrashServiceAdapter4 = new io.github.onograph.cluster.raft.readreplica.ReadReplicaCrashServiceAdapter(
          crashManager0, databaseStartupControllerAbortableImpl1, database2,
          dbmsManagerWatchTagImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0409");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage[] infoReplyMessageArray0 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage[]{};
    java.util.ArrayList<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> infoReplyMessageList1 = new java.util.ArrayList<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>) infoReplyMessageList1,
        infoReplyMessageArray0);
    java.lang.Exception exception3 = null;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData4 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        exception3);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta5 = io.github.onograph.cluster.raft.share.sync.SyncMeta.apldSyncMeta(
        fSMData4);
    io.github.onograph.cluster.raft.share.sync.ClusterMetaInfoReply clusterMetaInfoReply6 = new io.github.onograph.cluster.raft.share.sync.ClusterMetaInfoReply(
        (java.util.List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>) infoReplyMessageList1,
        syncMeta5);
    java.util.List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> infoReplyMessageList7 = clusterMetaInfoReply6.getListRsossInfoReplyMessage();
    org.neo4j.kernel.database.DatabaseId databaseId8 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException10 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState11 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper12 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId8, (java.lang.Throwable) clusterDatabaseManagementException10, operatorState11);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta13 = io.github.onograph.cluster.raft.share.sync.SyncMeta.marcSyncMeta(
        (java.lang.Throwable) clusterDatabaseManagementException10);
    java.lang.Throwable throwable14 = syncMeta13.getFiueThrowable();
    io.github.onograph.cluster.raft.share.sync.ClusterMetaInfoReply clusterMetaInfoReply15 = new io.github.onograph.cluster.raft.share.sync.ClusterMetaInfoReply(
        infoReplyMessageList7, syncMeta13);
    org.junit.Assert.assertNotNull(infoReplyMessageArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(fSMData4);
    org.junit.Assert.assertNotNull(syncMeta5);
    org.junit.Assert.assertNotNull(infoReplyMessageList7);
    org.junit.Assert.assertNotNull(syncMeta13);
    org.junit.Assert.assertNotNull(throwable14);
    org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "store_version");
    org.junit.Assert.assertEquals(throwable14.getMessage(), "store_version");
    org.junit.Assert.assertEquals(throwable14.toString(),
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version");
  }

  @Test
  public void test0410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0410");
    }
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl0 = null;
    io.github.onograph.dbms.crash.DbmsCrashManager dbmsCrashManager1 = io.github.onograph.dbms.crash.ShutdownDbmsManager.craDbmsCrashManager(
        dbmsManagerWatchTagImpl0);
    org.junit.Assert.assertNotNull(dbmsCrashManager1);
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0411");
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
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta> replicationSessionManagerMetaStateStorage20 = clusterSimpleStorageFacade9.cresitasgStateStorage(
          databaseLogProvider17, "status", lifeSupport19);
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
  public void test0412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0412");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray0 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet1 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1,
        consensusNodeIdArray0);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper3 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1);
    io.netty.buffer.ByteBuf byteBuf4 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel5 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf4);
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapperMarshaller.maslForCoWr(
          consensusNodeServerMemberIdWrapper3,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusNodeIdArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0413");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.Set<org.neo4j.kernel.database.DatabaseId> databaseIdSet1 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl gdbDiscoveryMetaCoreImpl2 = io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl.frmrwGdbDiscoveryMetaCoreImpl(
          config0, databaseIdSet1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0414");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach readReplicaNodeNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach();
    readReplicaNodeNamedServiceClusterApproach0.setup();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional3 = readReplicaNodeNamedServiceClusterApproach0.fiuesrfodaOptional(
          namedDatabaseId2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0415");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingStcareetDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0416");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId0, consensusNodeId1, (long) '4', (long) (short) -1, 1L);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId6 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager messager7 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Messager(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage) ask5,
        consensusNodeId6);
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
      java.lang.Void void20 = ask5.dipc(
          (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void12);
    org.junit.Assert.assertNull(void14);
    org.junit.Assert.assertNull(void16);
    org.junit.Assert.assertNull(void19);
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0417");
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
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta> candidateTermMetaStateStorage20 = clusterSimpleStorageFacade9.crertsteStateStorage(
          databaseLogProvider17, "initial_members", lifeSupport19);
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
  public void test0418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0418");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder requestAllGdbIdsMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    org.neo4j.logging.Log log3 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl4 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler2, log3, refCatchupManagerImpl4);
    java.nio.file.Path path6 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo7 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path6);
    java.nio.file.Path path8 = clusterMetaTopologyInfo7.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker9 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo7);
    boolean boolean10 = sliceMetaSimpleChannelInboundHandler5.acceptInboundMessage(
        (java.lang.Object) clusterMetaTopologyInfo7);
    io.netty.channel.ChannelPromise channelPromise11 = null;
    try {
      requestAllGdbIdsMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) boolean10, channelPromise11);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo7);
    org.junit.Assert.assertNull(path8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0419");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkhweDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0420");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupManagerException catchupManagerException0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupManagerException();
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0421");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_MD_ANSWER;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_MD_ANSWER + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_MD_ANSWER));
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0422");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal storeIdSafeChannelMarshal0 = io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal.IT;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    io.netty.buffer.ByteBuf byteBuf2 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel3 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf2);
    try {
      storeIdSafeChannelMarshal0.marshal(storeId1,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeIdSafeChannelMarshal0);
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0423");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    try {
      io.github.onograph.cluster.raft.control.connect.HandshakeLogger handshakeLogger1 = new io.github.onograph.cluster.raft.control.connect.HandshakeLogger(
          logProvider0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0424");
    }
    org.neo4j.kernel.database.Database database0 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotDataInboundHandler requestSnapshotDataInboundHandler2 = new io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotDataInboundHandler(
          database0, serverRef1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0425");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData0 = null;
    io.netty.buffer.ByteBuf byteBuf1 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel2 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableSerializer.maslForSyWr(
          syncableLeasableCoreNodeData0,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0426");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder();
    io.github.onograph.cluster.raft.share.sync.SyncStatus syncStatus1 = new io.github.onograph.cluster.raft.share.sync.SyncStatus();
    boolean boolean2 = messageDataTypeMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) syncStatus1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    java.net.SocketAddress socketAddress4 = null;
    io.netty.channel.ChannelPromise channelPromise5 = null;
    try {
      messageDataTypeMessageToByteEncoder0.bind(channelHandlerContext3, socketAddress4,
          channelPromise5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0427");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync2 = io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper.unahAbstractTransactionSync(
          logEntryReader0, readableChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0428");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingLaldeInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0429");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCaueaimDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0430");
    }
    io.github.onograph.cluster.raft.utils.ExceptionManager.RunnableWithException[] runnableWithExceptionArray1 = new io.github.onograph.cluster.raft.utils.ExceptionManager.RunnableWithException[]{};
    io.github.onograph.cluster.raft.utils.ExceptionManager.ruaForStEx("leader-only",
        runnableWithExceptionArray1);
    org.junit.Assert.assertNotNull(runnableWithExceptionArray1);
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0431");
    }
    java.util.Comparator<org.neo4j.configuration.helpers.SocketAddress> socketAddressComparator0 = io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceDiscoveryKickoffImpl.comparatorAdtsdaecmtSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressComparator0);
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0432");
    }
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaIncomingChangeTaskError readReplicaIncomingChangeTaskError0 = io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaIncomingChangeTaskError.IT;
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaIncomingChangeTaskError.IT = readReplicaIncomingChangeTaskError0;
    org.junit.Assert.assertNotNull(readReplicaIncomingChangeTaskError0);
  }

  @Test
  public void test0433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0433");
    }
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper> consensusNodeServerMemberIdWrapperConsensusNodeFollowersMeta0 = new io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper>();
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0434");
    }
    io.github.onograph.cluster.raft.readreplica.CatchupNodeTaskCoordinator.SchedulerTypes schedulerTypes0 = io.github.onograph.cluster.raft.readreplica.CatchupNodeTaskCoordinator.SchedulerTypes.ST_TRX_IN_SW;
    org.junit.Assert.assertTrue("'" + schedulerTypes0 + "' != '"
        + io.github.onograph.cluster.raft.readreplica.CatchupNodeTaskCoordinator.SchedulerTypes.ST_TRX_IN_SW
        + "'", schedulerTypes0.equals(
        io.github.onograph.cluster.raft.readreplica.CatchupNodeTaskCoordinator.SchedulerTypes.ST_TRX_IN_SW));
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0435");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer discoveryGdbOperatorMetaWrapperJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer();
    boolean boolean1 = discoveryGdbOperatorMetaWrapperJSerializer0.includeManifest();
    boolean boolean2 = discoveryGdbOperatorMetaWrapperJSerializer0.includeManifest();
    java.lang.Object obj3 = null;
    try {
      byte[] byteArray4 = discoveryGdbOperatorMetaWrapperJSerializer0.toBinary(obj3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0436");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.flush(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0437");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType0 = io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_BAD_REQ;
    org.junit.Assert.assertTrue("'" + catchupStatusType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_BAD_REQ + "'",
        catchupStatusType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_BAD_REQ));
  }

  @Test
  public void test0438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0438");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta sliceMeta6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta(
        (int) (short) -1, "default");
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onfihdForCoSl(
          storeSyncCompletedCompletableFuture3, sliceMeta6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0439");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ChunkedInputTxWrapper chunkedInputTxWrapper2 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ChunkedInputTxWrapper(
          false, abstractTransactionSync1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0440");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingStcaeInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0441");
    }
    org.neo4j.graphdb.config.Setting<io.github.onograph.config.ClusterDiscoveryMode> clusterDiscoveryModeSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingDiceteClusterDiscoveryMode;
    org.junit.Assert.assertNotNull(clusterDiscoveryModeSetting0);
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0442");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder();
    io.github.onograph.cluster.raft.share.sync.SyncStatus syncStatus1 = new io.github.onograph.cluster.raft.share.sync.SyncStatus();
    boolean boolean2 = messageDataTypeMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) syncStatus1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    org.neo4j.kernel.database.DatabaseId databaseId4 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId5 = null;
    java.util.UUID uUID6 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState7 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId4, consensusNodeId5, uUID6);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId8 = askState7.getImConsensusNodeId();
    io.netty.channel.ChannelPromise channelPromise9 = null;
    try {
      messageDataTypeMessageToByteEncoder0.write(channelHandlerContext3,
          (java.lang.Object) askState7, channelPromise9);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(consensusNodeId8);
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0443");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise2 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.close(channelHandlerContext1,
          channelPromise2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0444");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.io.pagecache.PageCache pageCache2 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.TxMetaUtil txMetaUtil3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.TxMetaUtil(
        config0, fileSystemAbstraction1, pageCache2);
    org.neo4j.storageengine.api.CommandReaderFactory commandReaderFactory4 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout5 = null;
    try {
      boolean boolean6 = txMetaUtil3.isHatloForDaCo(commandReaderFactory4, databaseLayout5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0445");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.dprocs.ClusterInfoBasicProcedure.PROC_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "overview" + "'", str0, "overview");
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0446");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_TRX;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_TRX + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_TRX));
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0447");
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
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    try {
      org.neo4j.configuration.helpers.SocketAddress socketAddress11 = socketAddressServiceLeaderImpl8.prmySocketAddress(
          namedDatabaseId10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0448");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_D_ANSWER;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_D_ANSWER + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_D_ANSWER));
  }

  @Test
  public void test0449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0449");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout10 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
        consensusNodeId9);
    java.lang.Void void11 = processorImpl2.process(consensusElectionTimeout10);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange12 = null;
    try {
      java.lang.Void void13 = processorImpl2.process(askToChange12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNull(void11);
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0450");
    }
    org.neo4j.graphdb.config.Setting<java.nio.file.Path> pathSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingRaeepPath;
    org.junit.Assert.assertNotNull(pathSetting0);
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0451");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer discoveryGdbOperatorMetaWrapperJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer();
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols1 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY;
    try {
      byte[] byteArray2 = discoveryGdbOperatorMetaWrapperJSerializer0.toBinary(
          (java.lang.Object) mutableProtocols1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class io.github.onograph.cluster.raft.control.MutableProtocols cannot be cast to class io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper (io.github.onograph.cluster.raft.control.MutableProtocols and io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper are in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + mutableProtocols1 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY + "'",
        mutableProtocols1.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_SNAPPY));
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0452");
    }
    long long0 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.FIN_CPXR_TXS_UNVLL;
    org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0453");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSerializer gdbServerIdWrapperSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSerializer();
    boolean boolean1 = gdbServerIdWrapperSerializer0.includeManifest();
    boolean boolean2 = gdbServerIdWrapperSerializer0.includeManifest();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0454");
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
      com.typesafe.config.Config config12 = typesafeManagementAdapter11.geetConfig();
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
  public void test0455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0455");
    }
    io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    org.neo4j.configuration.connectors.ConnectorPortRegister connectorPortRegister2 = null;
    java.util.concurrent.Executor executor3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSyncByteToMessageDecoder requestTransactionSyncByteToMessageDecoder4 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSyncByteToMessageDecoder();
    io.github.onograph.cluster.raft.netty.NettyChannelSetupManager nettyChannelSetupManager5 = null;
    io.github.onograph.cluster.raft.netty.NettyKQueueSettings<io.netty.channel.kqueue.KQueueServerSocketChannel> kQueueServerSocketChannelNettyKQueueSettings6 = io.github.onograph.cluster.raft.netty.NettyKQueueSettings.kqesecfNettyKQueueSettings();
    org.neo4j.logging.internal.LogService logService7 = null;
    io.github.onograph.cluster.raft.share.NodeServerInfoLogService nodeServerInfoLogService9 = new io.github.onograph.cluster.raft.share.NodeServerInfoLogService(
        logService7, "hi!");
    try {
      io.github.onograph.cluster.raft.netty.ClusterAdapter clusterAdapter10 = new io.github.onograph.cluster.raft.netty.ClusterAdapter(
          byteBufAllocator0, socketAddress1, connectorPortRegister2, executor3,
          (io.netty.channel.ChannelInboundHandler) requestTransactionSyncByteToMessageDecoder4,
          nettyChannelSetupManager5,
          (io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings<io.netty.channel.kqueue.KQueueServerSocketChannel>) kQueueServerSocketChannelNettyKQueueSettings6,
          nodeServerInfoLogService9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(kQueueServerSocketChannelNettyKQueueSettings6);
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0456");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal storeIdSafeChannelMarshal0 = io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal.IT;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    org.neo4j.io.fs.WritableChannel writableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl3 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel2);
    try {
      storeIdSafeChannelMarshal0.marshal(storeId1,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeIdSafeChannelMarshal0);
  }

  @Test
  public void test0457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0457");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.PI_CONS_VOTE_REQ;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.PI_CONS_VOTE_REQ
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.PI_CONS_VOTE_REQ));
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0458");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.CONS_PRN_REQ;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.CONS_PRN_REQ
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.CONS_PRN_REQ));
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0459");
    }
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotData.MarshalChannelImplCMS marshalChannelImplCMS0 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotData.MarshalChannelImplCMS();
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    try {
      io.github.onograph.cluster.raft.share.meta.pit.SnapshotData snapshotData2 = marshalChannelImplCMS0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0460");
    }
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType jobTerminationType0 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_ASYNC_IR;
    org.junit.Assert.assertTrue("'" + jobTerminationType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_ASYNC_IR
        + "'", jobTerminationType0.equals(
        io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_ASYNC_IR));
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0461");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder.ACO_SYT_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-discovery-actor-system" + "'", str0,
        "cc-discovery-actor-system");
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0462");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.AskState.AskStateSafeChannelMarshal askStateSafeChannelMarshal0 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState.AskStateSafeChannelMarshal();
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager1.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.AskState askState3 = askStateSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0463");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalancingStrategies.RULE_MK;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "policy" + "'", str0, "policy");
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0464");
    }
    org.neo4j.dbms.DatabaseState databaseState0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper1 = io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper.froDiscoveryGdbOperatorMetaWrapper(
          databaseState0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0465");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType3 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted(
        0L, setupGdbSyncReplyStateType3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType5 = storeSyncCompleted4.getStat();
    try {
      storeSyncCompletedCatchupAnswerManager0.onfesaceForCoSt(storeSyncCompletedCompletableFuture1,
          storeSyncCompleted4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType3 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType3.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType5 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType5.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0466");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    try {
      nettyChannelImpl2.dipe();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0467");
    }
    io.github.onograph.cluster.raft.netty.NettyEpollSettings<io.netty.channel.epoll.EpollSocketChannel> epollSocketChannelNettyEpollSettings0 = io.github.onograph.cluster.raft.netty.NettyEpollSettings.epctciNettyEpollSettings();
    org.junit.Assert.assertNotNull(epollSocketChannelNettyEpollSettings0);
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0468");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync0 = null;
    org.neo4j.io.fs.WritableChannel writableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ClonedTxLogMarshaller.maslForWrAb(
          abstractTransactionSync0, (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0469");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_PREV_MDFLSH;
    org.junit.Assert.assertTrue("'" + metaType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.MetaType.MT_PREV_MDFLSH + "'",
        metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_PREV_MDFLSH));
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0470");
    }
    io.github.onograph.cluster.raft.netty.FutureUtilities futureUtilities0 = new io.github.onograph.cluster.raft.netty.FutureUtilities();
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0471");
    }
    org.neo4j.collection.Dependencies dependencies0 = null;
    org.neo4j.monitoring.Monitors monitors1 = null;
    try {
      io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl monitorsClusterConsensusImpl2 = io.github.onograph.cluster.raft.shared.MonitorsClusterConsensusImpl.craMonitorsClusterConsensusImpl(
          dependencies0, monitors1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0472");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.CONS_ELECT_TO;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.CONS_ELECT_TO
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.CONS_ELECT_TO));
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0473");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.SyncedLeaderMetaJSerializer syncedLeaderMetaJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.SyncedLeaderMetaJSerializer();
    boolean boolean1 = syncedLeaderMetaJSerializer0.includeManifest();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0474");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeaderImpl clusterLeaderImpl2 = new io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeaderImpl(
          clusterStructureService0, logProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0475");
    }
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting.ConfigParser configParser0 = io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting.RNME;
    org.neo4j.configuration.Config config1 = null;
    try {
      java.util.Map<java.lang.String, io.github.onograph.config.NodeGroupIdentifier> strMap2 = configParser0.reaMap(
          config1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(configParser0);
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0476");
    }
    io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SUID;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SUID
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_SUID));
  }

  @Test
  public void test0477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0477");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer discoveryGdbOperatorMetaWrapperJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer();
    io.netty.buffer.ByteBuf byteBuf1 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel2 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf1);
    defaultWritableChecksumChannel2.beginChecksum();
    try {
      byte[] byteArray4 = discoveryGdbOperatorMetaWrapperJSerializer0.toBinary(
          (java.lang.Object) defaultWritableChecksumChannel2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel cannot be cast to class io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper (io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel and io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper are in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0478");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<io.github.onograph.config.EntProVer>> entProVerListSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCaultnList;
    org.junit.Assert.assertNotNull(entProVerListSetting0);
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0479");
    }
    org.neo4j.logging.internal.LogService logService0 = null;
    io.github.onograph.cluster.raft.share.NodeServerInfoLogService nodeServerInfoLogService2 = new io.github.onograph.cluster.raft.share.NodeServerInfoLogService(
        logService0, "hi!");
    try {
      org.neo4j.logging.LogProvider logProvider3 = nodeServerInfoLogService2.getUserLogProvider();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0480");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.getCurrentPosition();
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta5 = marshalChannelImplCMS0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(logPosition4);
  }

  @Test
  public void test0481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0481");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    java.nio.file.Path path1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreElementFacade storeElementFacade4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreElementFacade(
        fileSystemAbstraction0, path1, 10, "Snappy");
    org.neo4j.kernel.database.DatabaseId databaseId5 = null;
    org.neo4j.storageengine.api.StoreId storeId6 = null;
    java.nio.file.Path path8 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource9 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId5, storeId6, (long) (byte) 10, path8);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService10 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations11 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager12 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl13 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService10, leaderOperations11, namedServiceApproachManager12);
    boolean boolean14 = requestStoreResource9.equals(
        (java.lang.Object) socketAddressServiceLeaderImpl13);
    boolean boolean15 = storeElementFacade4.equals((java.lang.Object) boolean14);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0482");
    }
    java.util.List<java.lang.String> strList0 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta authMeta1 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta(
        strList0);
    java.util.List<java.lang.String> strList2 = authMeta1.getListCmadString();
    org.junit.Assert.assertNull(strList2);
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0483");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType1.getImpl();
    boolean boolean3 = viewClusterInfo0.equals((java.lang.Object) entProVer2);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType4 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer5 = applicationComProFamilyType4.getImpl();
    int int6 = entProVer2.compareTo(entProVer5);
    io.netty.buffer.ByteBuf byteBuf7 = null;
    try {
      entProVer5.enoForBy(byteBuf7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType1 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType1.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType4 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType4.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0484");
    }
    java.lang.String str0 = io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl.DST_CRAO_LTM;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_creation_time" + "'", str0,
        "store_creation_time");
  }

  @Test
  public void test0485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0485");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    try {
      io.github.onograph.config.EntProVer entProVer1 = io.github.onograph.config.EntProVer.deoEntProVer(
          byteBuf0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0486");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS();
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta1 = null;
    try {
      long long2 = marshalChannelImplCMS0.ordinal(leasableMeta1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0487");
    }
    io.github.onograph.cluster.raft.utils.RemoteStoreVerifier remoteStoreVerifier0 = new io.github.onograph.cluster.raft.utils.RemoteStoreVerifier();
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0488");
    }
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder snapshotDataMessageToByteEncoder0 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      snapshotDataMessageToByteEncoder0.read(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0489");
    }
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting leaderNodeGroupSetting1 = new io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting(
        "hi!");
    java.lang.String str2 = leaderNodeGroupSetting1.getPrefix();
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "causal_clustering.leadership_priority_group" + "'", str2,
        "causal_clustering.leadership_priority_group");
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0490");
    }
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting leaderNodeGroupSetting0 = new io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting();
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0491");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<java.lang.String>> strListSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingUpeloaList;
    org.junit.Assert.assertNotNull(strListSetting0);
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0492");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    boolean boolean2 = transactionChunkingCompletedMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) '#');
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting4 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingCletqmutDuration;
    io.netty.channel.ChannelPromise channelPromise5 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.write(channelHandlerContext3,
          (java.lang.Object) durationSetting4, channelPromise5);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(durationSetting4);
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0493");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.TransactionIdStore> transactionIdStoreSupplier1 = null;
    java.util.function.Supplier<org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore> logicalTransactionStoreSupplier2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair transactionLogIndexRepair3 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogIndexRepair(
        logProvider0, transactionIdStoreSupplier1, logicalTransactionStoreSupplier2);
    try {
      long long4 = transactionLogIndexRepair3.filaapi();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0494");
    }
    akka.actor.AbstractActor.Receive receive0 = akka.actor.AbstractActor.emptyBehavior();
    org.junit.Assert.assertNotNull(receive0);
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0495");
    }
    java.time.Clock clock0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    java.util.function.Function<java.lang.Integer, org.neo4j.io.marshal.ChannelMarshal<io.github.onograph.cluster.raft.share.sync.SyncableData>> intFunction2 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler4 = null;
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.memory.MemoryTracker memoryTracker7 = null;
    java.nio.file.Path path8 = null;
    io.github.onograph.cluster.raft.share.calg.cle.parts.PartClipperService partClipperService9 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.cle.parts.ConsensusTransactionLogSpreadImpl consensusTransactionLogSpreadImpl10 = new io.github.onograph.cluster.raft.share.calg.cle.parts.ConsensusTransactionLogSpreadImpl(
          clock0, fileSystemAbstraction1, intFunction2, (int) (byte) 100, jobScheduler4,
          (long) (byte) 9, logProvider6, memoryTracker7, path8, partClipperService9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0496");
    }
    org.neo4j.storageengine.api.StoreId storeId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    org.neo4j.storageengine.api.StorageEngineFactory storageEngineFactory2 = null;
    try {
      boolean boolean3 = io.github.onograph.cluster.raft.utils.RemoteStoreVerifier.isVaretuetsofoForStStSt(
          storeId0, storeId1, storageEngineFactory2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0497");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.dbms.OperatorState operatorState1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper2 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId0, operatorState1);
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0498");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage5 = null;
    java.lang.Void void6 = processorImpl2.process(logClipRequestMessage5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply7 = null;
    try {
      java.lang.Void void8 = processorImpl2.process(reply7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0499");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder requestSnapshotByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      requestSnapshotByteToMessageDecoder0.channelWritabilityChanged(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0500");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage5 = null;
    java.lang.Void void6 = processorImpl2.process(logClipRequestMessage5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply7 = null;
    try {
      java.lang.Void void8 = processorImpl2.process(reply7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
  }
}
