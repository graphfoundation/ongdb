package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest1 {

  public static boolean debug = false;

  @Test
  public void test0501() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0501");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.onungt();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId5 = null;
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta7 = new io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta(
        consensusNodeId5, 0L);
    try {
      coreClusterStructureServiceLifecycleAdapter3.onleeswcForNo(nodeServerMemberLeaderMeta7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0502() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0502");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply17 = null;
    try {
      java.lang.Void void18 = processorImpl2.process(reply17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier11);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(void16);
  }

  @Test
  public void test0503() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0503");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat> clusterMetaFormatMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.META_WRAPPER_VESN_CLUSTER_META_FORMAT;
    org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat> clusterMetaFormatSafeStateMarshal1 = clusterMetaFormatMetaWrapper0.maslSafeStateMarshal();
    org.junit.Assert.assertNotNull(clusterMetaFormatMetaWrapper0);
    org.junit.Assert.assertNotNull(clusterMetaFormatSafeStateMarshal1);
  }

  @Test
  public void test0504() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0504");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.put(
          (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0505() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0505");
    }
    org.neo4j.kernel.database.Database database0 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler requestStoreDatabaseIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler(
        database0, serverRef1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    try {
      requestStoreDatabaseIdInboundHandler2.channelRead(channelHandlerContext3,
          (java.lang.Object) 1.0d);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0506() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0506");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType1 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper socketAddressWrapper2 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
        socketAddress0, socketAddressSchemeType1);
    try {
      java.lang.String str3 = socketAddressWrapper2.toString();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + socketAddressSchemeType1 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt
        + "'", socketAddressSchemeType1.equals(
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt));
  }

  @Test
  public void test0507() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0507");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_UNDET;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_UNDET + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_UNDET));
  }

  @Test
  public void test0508() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0508");
    }
    org.neo4j.kernel.database.Database database0 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler requestStoreDatabaseIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler(
        database0, serverRef1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder sliceMetaByteToMessageDecoder4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    sliceMetaByteToMessageDecoder4.handlerRemoved(channelHandlerContext5);
    try {
      requestStoreDatabaseIdInboundHandler2.channelRead(channelHandlerContext3,
          (java.lang.Object) sliceMetaByteToMessageDecoder4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0509() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0509");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.onungt();
    coreClusterStructureServiceLifecycleAdapter3.shutdown();
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray7 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet8 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet8,
        consensusNodeIdArray7);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper10 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet8);
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper11 = new io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper(
        (long) ' ',
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet8);
    try {
      coreClusterStructureServiceLifecycleAdapter3.oncetlchForSe(
          (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusNodeIdArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0510() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0510");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaSafeChannelMarshal nodeServerMemberLeaderMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta1 = io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META;
    io.netty.buffer.ByteBuf byteBuf2 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel3 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf2);
    defaultWritableChecksumChannel3.beginChecksum();
    try {
      nodeServerMemberLeaderMetaSafeChannelMarshal0.marshal(nodeServerMemberLeaderMeta1,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMeta1);
  }

  @Test
  public void test0511() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0511");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl3 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean2);
    io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction dataSyncClusterAction4 = null;
    java.lang.Exception exception5 = null;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData6 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        exception5);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta7 = io.github.onograph.cluster.raft.share.sync.SyncMeta.apldSyncMeta(
        fSMData6);
    try {
      syncStatusMetaServiceImpl3.trcrelForDaFS(dataSyncClusterAction4, fSMData6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(fSMData6);
    org.junit.Assert.assertNotNull(syncMeta7);
  }

  @Test
  public void test0512() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0512");
    }
    java.util.Map<java.lang.String, java.net.InetAddress[]> strMap0 = null;
    io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl domainToInetAddressProviderConfImpl1 = new io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl(
        strMap0);
    try {
      java.net.InetAddress[] inetAddressArray3 = domainToInetAddressProviderConfImpl1.revdanmInetAddress(
          "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0513() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0513");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.AskState.AskStateSafeChannelMarshal askStateSafeChannelMarshal0 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState.AskStateSafeChannelMarshal();
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    java.util.UUID uUID3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState4 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId1, consensusNodeId2, uUID3);
    org.neo4j.io.fs.WritableChannel writableChannel5 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl6 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel5);
    try {
      askStateSafeChannelMarshal0.marshal(askState4, writableChannel5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0514() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0514");
    }
    java.nio.ByteBuffer byteBuffer0 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler.maslForBySt(
          byteBuffer0, "policy");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0515() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0515");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta4 = marshalChannelImplCMS0.unmarshal0(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0516() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0516");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync3 = io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ClonedTxLogMarshaller.unahAbstractTransactionSync(
          logEntryReader0, readableChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0517() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0517");
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
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper7 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet5);
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
  public void test0518() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0518");
    }
    int int0 = org.neo4j.kernel.impl.api.LeaseService.NO_LEASE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
  }

  @Test
  public void test0519() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0519");
    }
    java.nio.ByteBuffer byteBuffer0 = null;
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler.maslForBySt(
          byteBuffer0, "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0520() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0520");
    }
    io.github.onograph.cluster.raft.module.cuprot.IncomingEventService incomingEventService0 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler serverSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler(
        incomingEventService0);
    java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>> answerMessageTypeMessageToByteEncoderRuleProcessorJoiningImplList2 = new java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>>();
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorInitiatorImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder> answerMessageTypeMessageToByteEncoderRuleProcessorInitiatorImpl3 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorInitiatorImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>(
        (java.util.List<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>>) answerMessageTypeMessageToByteEncoderRuleProcessorJoiningImplList2);
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray4 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5,
        socketAddressArray4);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService7 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService8 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5);
    boolean boolean9 = memberNodeService8.isUsord();
    boolean boolean10 = memberNodeService8.isUsord();
    boolean boolean11 = answerMessageTypeMessageToByteEncoderRuleProcessorInitiatorImpl3.equals(
        (java.lang.Object) memberNodeService8);
    boolean boolean12 = serverSimpleChannelInboundHandler1.acceptInboundMessage(
        (java.lang.Object) boolean11);
    org.junit.Assert.assertNotNull(socketAddressArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(memberNodeService7);
    org.junit.Assert.assertNotNull(memberNodeService8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
  }

  @Test
  public void test0521() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0521");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.dbms.database.DatabaseManager<io.github.onograph.dbms.gdb.EnterpriseClusterDbContext> enterpriseClusterDbContextDatabaseManager1 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.NodeMemberFinderDefaultImpl nodeMemberFinderDefaultImpl2 = new io.github.onograph.cluster.raft.share.calg.nltof.NodeMemberFinderDefaultImpl(
        clusterStructureService0, enterpriseClusterDbContextDatabaseManager1);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    org.neo4j.dbms.identity.ServerId serverId4 = null;
    try {
      io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId5 = nodeMemberFinderDefaultImpl2.revrtmefsrConsensusNodeId(
          namedDatabaseId3, serverId4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0522() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0522");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted9 = null;
    try {
      java.lang.Void void10 = processorImpl2.process(leaderNotAccepted9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
  }

  @Test
  public void test0523() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0523");
    }
    java.util.Map<java.lang.String, java.net.InetAddress[]> strMap0 = null;
    io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl domainToInetAddressProviderConfImpl1 = new io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl(
        strMap0);
    java.lang.String[] strArray25 = new java.lang.String[]{"", "default", "", "name", "name",
        "temp-copy", "protocols", "protocols", "", "default", "store_version", "temp-save",
        "default", "name", "catchup_protocol", "default", "default", "leader-only", "temp-copy",
        "hi!", "cc-directory-actor", "store_random_id"};
    java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean27 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strSet26, strArray25);
    io.github.onograph.cluster.raft.control.connect.MutatingComProFamilyWrapper mutatingComProFamilyWrapper28 = new io.github.onograph.cluster.raft.control.connect.MutatingComProFamilyWrapper(
        "RequestGdbId for ", (java.util.Set<java.lang.String>) strSet26);
    try {
      domainToInetAddressProviderConfImpl1.sehseaeForStCo(
          (java.util.Collection<java.lang.String>) strSet26, "store_version");
      org.junit.Assert.fail(
          "Expected exception of type io.github.onograph.cluster.raft.module.dprot.AddressNotFoundException; message: java.net.UnknownHostException: default: nodename nor servname provided, or not known");
    } catch (io.github.onograph.cluster.raft.module.dprot.AddressNotFoundException e) {
    }
    org.junit.Assert.assertNotNull(strArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
  }

  @Test
  public void test0524() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0524");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta sliceMeta1 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta(
        "hi!");
  }

  @Test
  public void test0525() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0525");
    }
    java.lang.Runnable runnable0 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable0, leasableMetaStateStorage1);
    try {
      long long3 = syncableLeasableCoreNodeDataFSMImpl2.laapdix();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0526() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0526");
    }
    java.util.function.Predicate<java.lang.Object> objPredicate0 = null;
    io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler messageChannelDuplexHandler1 = new io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler(
        objPredicate0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.netty.channel.ChannelPromise channelPromise3 = null;
    try {
      messageChannelDuplexHandler1.close(channelHandlerContext2, channelPromise3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0527() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0527");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STATS;
    org.junit.Assert.assertTrue("'" + askMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STATS + "'",
        askMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STATS));
  }

  @Test
  public void test0528() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0528");
    }
    io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS.IT;
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readableClosablePositionAwareChecksumChannelPassThruImpl2.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.getCurrentPosition();
    int int5 = readableClosablePositionAwareChecksumChannelPassThruImpl2.endChecksumAndValidate();
    try {
      io.github.onograph.dbms.WatchTag watchTag6 = marshalChannelImplCMS0.unmarshal0(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(logPosition4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test0529() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0529");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl> serverIdMap1 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure databaseReadReplicaClusterStructure2 = new io.github.onograph.cluster.raft.module.dprot.DatabaseReadReplicaClusterStructure(
          databaseId0, serverIdMap1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0530() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0530");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore logicalTransactionStore1 = null;
    org.neo4j.storageengine.api.TransactionIdStore transactionIdStore2 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogCommitSearcher transactionLogCommitSearcher3 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogCommitSearcher(
          logProvider0, logicalTransactionStore1, transactionIdStore2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0531() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0531");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    int int1 = consensusLogCacheServiceNoopImpl0.elmtcu();
    consensusLogCacheServiceNoopImpl0.prn((long) (short) -1);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
  }

  @Test
  public void test0532() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0532");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper1 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.dumMetaWrapper(
        (org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId>) safeStateMarshalImpl0);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId2 = null;
    org.neo4j.io.fs.WritableChannel writableChannel3 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl4 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel3);
    try {
      safeStateMarshalImpl0.marshal(consensusMemberGroupId2, writableChannel3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper1);
  }

  @Test
  public void test0533() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0533");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager0.beginChecksum();
    try {
      org.neo4j.kernel.impl.transaction.log.LogPosition logPosition2 = readablePositionAwareChecksumChannelManager0.getCurrentPosition();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0534() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0534");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask12 = null;
    try {
      java.lang.Void void13 = processorImpl2.process(ask12);
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
  public void test0535() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0535");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_DENIED;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_DENIED
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.LEADER_CHNG_DENIED));
  }

  @Test
  public void test0536() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0536");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingReeasolaueInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0537() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0537");
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
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage12 = clusterSimpleStorageFacade8.crelesaStateStorage(
          databaseLogProvider9, "storage_engine", lifeSupport11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo4);
    org.junit.Assert.assertNull(path5);
  }

  @Test
  public void test0538() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0538");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.share.calg.CandidateTallyMeta> candidateTallyMetaMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.CONS_VOT;
    org.junit.Assert.assertNotNull(candidateTallyMetaMetaWrapper0);
  }

  @Test
  public void test0539() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0539");
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
  public void test0540() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0540");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.State.MetaStateMessageType metaStateMessageType0 = io.github.onograph.cluster.raft.share.meta.fsm.State.MetaStateMessageType.OK;
    org.junit.Assert.assertTrue("'" + metaStateMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.fsm.State.MetaStateMessageType.OK + "'",
        metaStateMessageType0.equals(
            io.github.onograph.cluster.raft.share.meta.fsm.State.MetaStateMessageType.OK));
  }

  @Test
  public void test0541() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0541");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<java.lang.Long> longMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.FIN_FLSD;
    org.junit.Assert.assertNotNull(longMetaWrapper0);
  }

  @Test
  public void test0542() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0542");
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
    org.neo4j.kernel.impl.api.CommitProcessFactory commitProcessFactory13 = coreNodeWrapper12.getCommitProcessFactory();
    org.junit.Assert.assertNull(commitProcessFactory13);
  }

  @Test
  public void test0543() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0543");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations1 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager2 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl3 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService0, leaderOperations1, namedServiceApproachManager2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId4 = null;
    try {
      java.util.Collection<org.neo4j.configuration.helpers.SocketAddress> socketAddressCollection5 = socketAddressServiceLeaderImpl3.alsoaeCollection(
          namedDatabaseId4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0544() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0544");
    }
    io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager1.beginChecksum();
    try {
      io.github.onograph.dbms.WatchTag watchTag3 = marshalChannelImplCMS0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
  }

  @Test
  public void test0545() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0545");
    }
    java.lang.Runnable runnable0 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable0, leasableMetaStateStorage1);
    try {
      syncableLeasableCoreNodeDataFSMImpl2.fls();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0546() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0546");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        consensusNodeId2, false, 100L);
    io.netty.channel.ChannelPromise channelPromise6 = null;
    try {
      messageDataTypeMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) consensusNodeId2, channelPromise6);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
  }

  @Test
  public void test0547() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0547");
    }
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS1 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta2 = marshalChannelImplCMS1.startState();
    org.neo4j.io.fs.WritableChannel writableChannel3 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl4 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel3);
    try {
      marshalChannelImplCMS0.marshal(candidateTermMeta2,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS1);
    org.junit.Assert.assertNotNull(candidateTermMeta2);
  }

  @Test
  public void test0548() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0548");
    }
    io.github.onograph.cluster.raft.id.CoreNodeServerIdentity coreNodeServerIdentity0 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService pointInTimeBackupService1 = io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl.cosnoftPointInTimeBackupService(
        coreNodeServerIdentity0);
    org.neo4j.dbms.DatabaseStateService databaseStateService2 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta> databaseIdMap3 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime gdbServerPointInTime4 = pointInTimeBackupService1.takePointInTimeImage(
          databaseStateService2, databaseIdMap3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pointInTimeBackupService1);
  }

  @Test
  public void test0549() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0549");
    }
    java.lang.Runnable runnable0 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable0, leasableMetaStateStorage1);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData3 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer5 = null;
    try {
      syncableLeasableCoreNodeDataFSMImpl2.aplcoaForCoCo(syncableLeasableCoreNodeData3, (long) 'a',
          fSMDataConsumer5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0550() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0550");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    boolean boolean3 = nettyChannelImpl2.isChannelDis();
    try {
      boolean boolean4 = nettyChannelImpl2.isChannelOpen();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0551() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0551");
    }
    io.github.onograph.cluster.raft.share.meta.DefaultMarshalChannelCMS defaultMarshalChannelCMS0 = new io.github.onograph.cluster.raft.share.meta.DefaultMarshalChannelCMS();
    io.netty.buffer.ByteBuf byteBuf2 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel3 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf2);
    defaultWritableChecksumChannel3.beginChecksum();
    try {
      defaultMarshalChannelCMS0.marshal((java.lang.Long) 1536L,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0552() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0552");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType clusterNodeRoleType0 = io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.LEADER;
    org.junit.Assert.assertTrue("'" + clusterNodeRoleType0 + "' != '"
            + io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.LEADER + "'",
        clusterNodeRoleType0.equals(
            io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType.LEADER));
  }

  @Test
  public void test0553() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0553");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    org.neo4j.kernel.database.DatabaseId databaseId4 = null;
    org.neo4j.storageengine.api.StoreId storeId5 = null;
    java.nio.file.Path path7 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource8 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId4, storeId5, (long) (byte) 10, path7);
    org.neo4j.kernel.database.DatabaseId databaseId9 = requestStoreResource8.getDatabaseId();
    org.neo4j.storageengine.api.StoreId storeId10 = requestStoreResource8.getEpceStoreId();
    try {
      gdbIdInboundHandler2.channelRead(channelHandlerContext3,
          (java.lang.Object) requestStoreResource8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseId9);
    org.junit.Assert.assertNull(storeId10);
  }

  @Test
  public void test0554() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0554");
    }
    akka.actor.ExtendedActorSystem extendedActorSystem0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ActorRefSafeChannelMarshal actorRefSafeChannelMarshal1 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.ActorRefSafeChannelMarshal(
        extendedActorSystem0);
    akka.actor.ActorRef actorRef2 = null;
    org.neo4j.io.fs.WritableChannel writableChannel3 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl4 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel3);
    try {
      actorRefSafeChannelMarshal1.marshal(actorRef2,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0555() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0555");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType1.getImpl();
    boolean boolean3 = viewClusterInfo0.equals((java.lang.Object) entProVer2);
    akka.cluster.Member member4 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo5 = viewClusterInfo0.ignoreMember(
        member4);
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType1 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType1.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(viewClusterInfo5);
  }

  @Test
  public void test0556() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0556");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry0 = null;
    io.github.onograph.cluster.raft.share.calg.action.AddAction addAction2 = new io.github.onograph.cluster.raft.share.calg.action.AddAction(
        consensusLogEntry0, (long) 100);
    io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions transactionLogActions3 = null;
    try {
      addAction2.dipcForTr(transactionLogActions3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0557() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0557");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage9 = null;
    java.lang.Void void10 = processorImpl2.process(aliveReplyMessage9);
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNull(void10);
  }

  @Test
  public void test0558() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0558");
    }
    io.github.onograph.cluster.raft.control.connect.MessageChannelDuplexHandlerAction messageChannelDuplexHandlerAction0 = io.github.onograph.cluster.raft.control.connect.MessageChannelDuplexHandlerAction.gefleMessageChannelDuplexHandlerAction();
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager1 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory2 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager1);
    boolean boolean3 = messageChannelDuplexHandlerAction0.equals(
        (java.lang.Object) dataSyncRunnerStatsManagerDataManagerFactory2);
    org.junit.Assert.assertNotNull(messageChannelDuplexHandlerAction0);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0559() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0559");
    }
    io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType syncMetaType0 = io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_POS_REP;
    org.junit.Assert.assertTrue("'" + syncMetaType0 + "' != '"
            + io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_POS_REP + "'",
        syncMetaType0.equals(
            io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_POS_REP));
  }

  @Test
  public void test0560() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0560");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry0 = null;
    io.github.onograph.cluster.raft.share.calg.action.AddAction addAction2 = new io.github.onograph.cluster.raft.share.calg.action.AddAction(
        consensusLogEntry0, (long) 100);
    io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions transactionLogActions3 = null;
    try {
      addAction2.dipcForTr(transactionLogActions3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0561() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0561");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_CS;
    org.junit.Assert.assertTrue(
        "'" + metaType0 + "' != '" + io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_CS
            + "'",
        metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_CS));
  }

  @Test
  public void test0562() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0562");
    }
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType consensusNodeType0 = null;
    io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider consensusMetaProvider1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService consensusResultService2 = io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService.bulrConsensusResultService(
          consensusNodeType0, consensusMetaProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0563() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0563");
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
      askStateFSMEmptyReq0.aplcoaForCoCo(askState4, (long) (short) 1, fSMDataConsumer7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(consensusNodeId5);
  }

  @Test
  public void test0564() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0564");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    java.lang.Runnable runnable1 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl3 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable1, leasableMetaStateStorage2);
    boolean boolean4 = transactionChunkingCompletedMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) runnable1);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0565() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0565");
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
  public void test0566() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0566");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService syncableDataEncodingService0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder departingMessageManagerMessageToMessageEncoder1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder(
        syncableDataEncodingService0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    org.neo4j.kernel.database.DatabaseId databaseId3 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException5 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper7 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId3, (java.lang.Throwable) clusterDatabaseManagementException5, operatorState6);
    io.netty.channel.ChannelPromise channelPromise8 = null;
    try {
      departingMessageManagerMessageToMessageEncoder1.write(channelHandlerContext2,
          (java.lang.Object) databaseId3, channelPromise8);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
  }

  @Test
  public void test0567() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0567");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readablePositionAwareChecksumChannelManager0.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker4 = null;
    try {
      org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker5 = readablePositionAwareChecksumChannelManager0.getCurrentPosition(
          logPositionMarker4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0568() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0568");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo1 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path0);
    java.nio.file.Path path2 = clusterMetaTopologyInfo1.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker3 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo1);
    try {
      java.nio.file.Path path4 = clusterMetaTopologyInfo1.clestvsfiPath();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo1);
    org.junit.Assert.assertNull(path2);
  }

  @Test
  public void test0569() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0569");
    }
    java.util.Optional<akka.remote.artery.tcp.SSLEngineProvider> sSLEngineProviderOptional0 = null;
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO1 = null;
    org.neo4j.configuration.Config config2 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo4 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path3);
    java.nio.file.Path path5 = clusterMetaTopologyInfo4.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker6 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo4);
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO7 = null;
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker discoveryInitialProcChecker9 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType arteryRemotingType10 = io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TLS_TCP;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter typesafeManagementAdapter11 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter(
        clusterMemberLimitAtCreationDTO7, config8, discoveryInitialProcChecker9,
        arteryRemotingType10);
    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter typesafeManagementAdapter12 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter(
        clusterMemberLimitAtCreationDTO1, config2,
        (io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker) defaultDiscoveryInitialProcChecker6,
        arteryRemotingType10);
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.logging.LogProvider logProvider14 = null;
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO16 = new io.github.onograph.config.ClusterMemberLimitAtCreationDTO(
        3);
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder actorStackBuilder17 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder(
          sSLEngineProviderOptional0,
          (io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker) defaultDiscoveryInitialProcChecker6,
          config13, logProvider14, clusterMemberLimitAtCreationDTO16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo4);
    org.junit.Assert.assertNull(path5);
    org.junit.Assert.assertTrue("'" + arteryRemotingType10 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TLS_TCP
        + "'", arteryRemotingType10.equals(
        io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TLS_TCP));
  }

  @Test
  public void test0570() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0570");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager consensusTransactionLogMetaLRUCacheManager1 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager(
        2);
  }

  @Test
  public void test0571() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0571");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreIdMessageToByteEncoder storeIdMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreIdMessageToByteEncoder();
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting1 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingStchiInteger;
    boolean boolean2 = storeIdMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) intSetting1);
    org.junit.Assert.assertNotNull(intSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0572() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0572");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType0 = io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_ID_HDLR;
    org.junit.Assert.assertTrue("'" + clusterDataType0 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_ID_HDLR
        + "'", clusterDataType0.equals(
        io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_ID_HDLR));
  }

  @Test
  public void test0573() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0573");
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
          1015);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0574() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0574");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData1 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta(
          (long) 1, syncableLeasableCoreNodeData1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0575() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0575");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper1 = null;
    io.github.onograph.cluster.raft.share.meta.pit.ConsensusMembershipState consensusMembershipState2 = new io.github.onograph.cluster.raft.share.meta.pit.ConsensusMembershipState(
        memberIndexWrapper1);
    boolean boolean4 = consensusMembershipState2.equals((java.lang.Object) 1536L);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction findComAction5 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction(
        100L, (java.lang.Object) boolean4);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0576() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0576");
    }
    io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS.IT;
    io.github.onograph.dbms.WatchTag watchTag1 = marshalChannelImplCMS0.startState();
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager2 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel3 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl4 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel3);
    readablePositionAwareChecksumChannelManager2.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl4);
    try {
      io.github.onograph.dbms.WatchTag watchTag6 = marshalChannelImplCMS0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNull(watchTag1);
  }

  @Test
  public void test0577() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0577");
    }
    io.github.onograph.cluster.raft.module.cuprot.IncomingEventService incomingEventService0 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler serverSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler(
        incomingEventService0);
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting2 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingMutccsBoolean;
    boolean boolean3 = serverSimpleChannelInboundHandler1.acceptInboundMessage(
        (java.lang.Object) booleanSetting2);
    io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray5 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList6 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList6,
        socketAddressArray5);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService8 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList6);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService9 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList6);
    boolean boolean10 = memberNodeService9.isUsord();
    boolean boolean11 = memberNodeService9.isUsord();
    try {
      serverSimpleChannelInboundHandler1.channelRead(channelHandlerContext4,
          (java.lang.Object) boolean11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(socketAddressArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(memberNodeService8);
    org.junit.Assert.assertNotNull(memberNodeService9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test0578() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0578");
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
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType6 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_CS_ASK;
    askMessageTypeElementQueueRunnerImpl0.recForTry(askMessageType6);
    askMessageTypeElementQueueRunnerImpl0.removeAll();
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType9 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_GDB_GUID;
    org.junit.Assert.assertTrue("'" + askMessageType1 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC + "'",
        askMessageType1.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC));
    org.junit.Assert.assertNotNull(askMessageTypeArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + askMessageType6 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_CS_ASK + "'",
        askMessageType6.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_CS_ASK));
    org.junit.Assert.assertTrue("'" + askMessageType9 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_GDB_GUID + "'",
        askMessageType9.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_GDB_GUID));
  }

  @Test
  public void test0579() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0579");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_TTIME;
    org.junit.Assert.assertTrue("'" + metaType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_TTIME + "'",
        metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_TTIME));
  }

  @Test
  public void test0580() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0580");
    }
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachException namedServiceApproachException1 = new io.github.onograph.cluster.raft.palapp.NamedServiceApproachException(
        "user-defined");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException gdbStoreException3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException(
        (java.lang.Throwable) namedServiceApproachException1, "");
  }

  @Test
  public void test0581() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0581");
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
      leaseServiceEnterpriseImpl8.inil((int) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0582() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0582");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel1 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf0);
    defaultWritableChecksumChannel1.beginChecksum();
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel4 = defaultWritableChecksumChannel1.putInt(
          3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0583() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0583");
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
    int int9 = entProVer6.getIMnr();
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
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType5 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType5.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer6);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    org.junit.Assert.assertNotNull(applicationComProFamilyOptional8);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
  }

  @Test
  public void test0584() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0584");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager0.beginChecksum();
    try {
      long long2 = readablePositionAwareChecksumChannelManager0.getLong();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0585() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0585");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply catchupIncomingTransactionReply3 = null;
    io.netty.channel.Channel channel4 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager catchupReplyChannelManager5 = new io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager(
        channel4);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture6 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ontpurseForCoCaCa(
          catchupIncomingTransactionReply3, catchupReplyChannelManager5,
          storeSyncCompletedCompletableFuture6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0586() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0586");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaodoeInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0587() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0587");
    }
    java.security.SecureRandom secureRandom1 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.KeyStorePassword keyStorePassword2 = new io.github.onograph.cluster.raft.module.dprot.KeyStorePassword(
          3, secureRandom1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0588() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0588");
    }
    io.github.onograph.cluster.raft.control.connect.ServerComProMessageProcessorHandshakeImpl serverComProMessageProcessorHandshakeImpl0 = null;
    io.github.onograph.cluster.raft.control.connect.ServerHandshakeSimpleChannelInboundHandler serverHandshakeSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.control.connect.ServerHandshakeSimpleChannelInboundHandler(
        serverComProMessageProcessorHandshakeImpl0);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemMessageToByteEncoder catchupProblemMessageToByteEncoder2 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemMessageToByteEncoder();
    boolean boolean3 = serverHandshakeSimpleChannelInboundHandler1.acceptInboundMessage(
        (java.lang.Object) catchupProblemMessageToByteEncoder2);
    io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting5 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingMafnInteger;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData6 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        (java.lang.Object) intSetting5);
    try {
      serverHandshakeSimpleChannelInboundHandler1.channelRead(channelHandlerContext4,
          (java.lang.Object) fSMData6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(intSetting5);
    org.junit.Assert.assertNotNull(fSMData6);
  }

  @Test
  public void test0589() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0589");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId0 = null;
    try {
      org.neo4j.kernel.database.DatabaseId databaseId1 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.todabeiDatabaseId(
          consensusMemberGroupId0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0590() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0590");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure startFailure1 = new io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure(
        "store_version");
  }

  @Test
  public void test0591() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0591");
    }
    io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder serverMessageToByteEncoder0 = new io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier3 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray4 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier3};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet5 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet5,
        nodeGroupIdentifierArray4);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec7 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId1, consensusNodeId2,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet5);
    boolean boolean8 = serverMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) leaderRec7);
    io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
    try {
      serverMessageToByteEncoder0.read(channelHandlerContext9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(nodeGroupIdentifier3);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0592() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0592");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId0, storeId1, (long) (byte) 10, path3);
    org.neo4j.kernel.database.DatabaseId databaseId5 = requestStoreResource4.getDatabaseId();
    try {
      java.lang.String str6 = requestStoreResource4.decbString();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseId5);
  }

  @Test
  public void test0593() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0593");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaMessageToByteEncoder metaMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.info.MetaMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise3 = null;
    try {
      metaMessageToByteEncoder0.write(channelHandlerContext1, (java.lang.Object) "FollowerStates{}",
          channelPromise3);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
  }

  @Test
  public void test0594() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0594");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin1 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin2 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    java.lang.String str3 = clusteringBalancerServiceImpl0.plgneString();
    boolean boolean4 = clusteringBalancerServiceImpl0.isSfgpi();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "server_policies" + "'", str3,
        "server_policies");
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test0595() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0595");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver3 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl4 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
          (int) (byte) 10, true, 52L, livingCacheObserver3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0596() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0596");
    }
    org.neo4j.dbms.identity.ServerId serverId0 = null;
    io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException nodeNotFoundException1 = new io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException(
        serverId0);
  }

  @Test
  public void test0597() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0597");
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
    io.github.onograph.cluster.raft.share.calg.action.TransactionLogAction.TransactionLogActions transactionLogActions11 = null;
    try {
      bulkAddAction10.dipcForTr(transactionLogActions11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
  }

  @Test
  public void test0598() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0598");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    try {
      io.github.onograph.cluster.raft.readreplica.IdentityModuleReadReplicaNodeImpl identityModuleReadReplicaNodeImpl1 = new io.github.onograph.cluster.raft.readreplica.IdentityModuleReadReplicaNodeImpl(
          logProvider0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0599() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0599");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply setupGdbStoreSyncReply4 = null;
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onsrltresForCoSe(
          storeSyncCompletedCompletableFuture3, setupGdbStoreSyncReply4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
  }

  @Test
  public void test0600() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0600");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId0, storeId1, (long) (byte) 10, path3);
    org.neo4j.kernel.database.DatabaseId databaseId5 = requestStoreResource4.getDatabaseId();
    org.neo4j.storageengine.api.StoreId storeId6 = requestStoreResource4.getEpceStoreId();
    try {
      java.lang.String str7 = requestStoreResource4.decbString();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseId5);
    org.junit.Assert.assertNull(storeId6);
  }

  @Test
  public void test0601() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0601");
    }
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType> messageDataTypeRef0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService1 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        messageDataTypeRef0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    java.lang.Object obj3 = null;
    try {
      syncableDataDataManagerFactoryDecodingService1.channelRead(channelHandlerContext2, obj3);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.DecoderException; message: java.lang.NullPointerException: element");
    } catch (io.netty.handler.codec.DecoderException e) {
    }
  }

  @Test
  public void test0602() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0602");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType3 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt;
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture4 = nettyChannelImpl2.wrtFuture(
          (java.lang.Object) socketAddressSchemeType3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + socketAddressSchemeType3 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt
        + "'", socketAddressSchemeType3.equals(
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt));
  }

  @Test
  public void test0603() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0603");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder answerMessageTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      answerMessageTypeMessageToByteEncoder0.flush(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0604() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0604");
    }
    try {
      io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager consensusTransactionLogMetaLRUCacheManager1 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager(
          (int) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: maxSize=0, name=Raft log entry cache");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0605() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0605");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage aliveNoReplyMessage17 = null;
    try {
      java.lang.Void void18 = processorImpl2.process(aliveNoReplyMessage17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier11);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNull(void16);
  }

  @Test
  public void test0606() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0606");
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
      boolean boolean7 = leaseServiceEnterpriseImpl5.isInl((int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  6a482672-20a5-4004-a3c3-9d17e69087bd");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0607() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0607");
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
      java.nio.file.Path path15 = clusterMetaTopologyInfo8.lesdtPath("overview");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo8);
  }

  @Test
  public void test0608() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0608");
    }
    java.util.function.Predicate<java.lang.Object> objPredicate0 = null;
    io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler messageChannelDuplexHandler1 = new io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler(
        objPredicate0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    try {
      messageChannelDuplexHandler1.flush(channelHandlerContext2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0609() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0609");
    }
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException1 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.api.DatabaseManagementException databaseManagementException2 = org.neo4j.dbms.api.DatabaseManagementException.wrap(
        (java.lang.Throwable) clusterDatabaseManagementException1);
    org.neo4j.kernel.api.exceptions.Status status3 = databaseManagementException2.status();
    io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException clusterSyncerException5 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException(
        (java.lang.Throwable) databaseManagementException2, "default");
    org.junit.Assert.assertNotNull(databaseManagementException2);
    org.junit.Assert.assertTrue(
        "'" + status3 + "' != '" + org.neo4j.kernel.api.exceptions.Status.Database.Unknown + "'",
        status3.equals(org.neo4j.kernel.api.exceptions.Status.Database.Unknown));
  }

  @Test
  public void test0610() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0610");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal defaultSyncableDataMarshal1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal(
        logEntryReader0);
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readableClosablePositionAwareChecksumChannelPassThruImpl3.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData consensusLogEntryData5 = io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData.reaConsensusLogEntryData(
          (org.neo4j.io.marshal.ChannelMarshal<io.github.onograph.cluster.raft.share.sync.SyncableData>) defaultSyncableDataMarshal1,
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0611() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0611");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper1 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.dumMetaWrapper(
        (org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId>) safeStateMarshalImpl0);
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    try {
      io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId4 = safeStateMarshalImpl0.unmarshal0(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper1);
  }

  @Test
  public void test0612() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0612");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException2 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper4 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId0, (java.lang.Throwable) clusterDatabaseManagementException2, operatorState3);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta5 = io.github.onograph.cluster.raft.share.sync.SyncMeta.marcSyncMeta(
        (java.lang.Throwable) clusterDatabaseManagementException2);
    java.lang.Throwable throwable6 = syncMeta5.getFiueThrowable();
    io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException nodeNotFoundException7 = new io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException(
        throwable6);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException8 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        throwable6);
    org.junit.Assert.assertNotNull(syncMeta5);
    org.junit.Assert.assertNotNull(throwable6);
    org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "store_version");
    org.junit.Assert.assertEquals(throwable6.getMessage(), "store_version");
    org.junit.Assert.assertEquals(throwable6.toString(),
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version");
  }

  @Test
  public void test0613() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0613");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemByteToMessageDecoder catchupProblemByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      catchupProblemByteToMessageDecoder0.channelReadComplete(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0614() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0614");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    boolean boolean2 = viewClusterInfo0.equals((java.lang.Object) "FollowerStates{}");
    boolean boolean3 = viewClusterInfo0.isMoarrce();
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0615() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0615");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC_COM_VAL;
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC_COM_VAL + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC_COM_VAL));
  }

  @Test
  public void test0616() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0616");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingMieairleInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0617() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0617");
    }
    java.util.Map<java.lang.String, java.net.InetAddress[]> strMap0 = null;
    io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl domainToInetAddressProviderConfImpl1 = new io.github.onograph.cluster.raft.module.dprot.DomainToInetAddressProviderConfImpl(
        strMap0);
    try {
      java.net.InetAddress[] inetAddressArray3 = domainToInetAddressProviderConfImpl1.revdanmInetAddress(
          "policy");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0618() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0618");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSerializer gdbServerIdWrapperSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSerializer();
    boolean boolean1 = gdbServerIdWrapperSerializer0.includeManifest();
    io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo structureInfo2 = io.github.onograph.cluster.raft.module.dprot.impl.structure.StructureInfo.EMT_STRUCTURE_INFO;
    java.util.stream.Stream<io.github.onograph.cluster.raft.module.dprot.impl.structure.GdbDiscoveryMetaCoreWrapper> gdbDiscoveryMetaCoreWrapperStream3 = structureInfo2.geseStream();
    try {
      byte[] byteArray4 = gdbServerIdWrapperSerializer0.toBinary(
          (java.lang.Object) gdbDiscoveryMetaCoreWrapperStream3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class java.util.stream.ReferencePipeline$Head cannot be cast to class io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper (java.util.stream.ReferencePipeline$Head is in module java.base of loader 'bootstrap'; io.github.onograph.cluster.raft.module.dprot.impl.gdb.GdbServerIdWrapper is in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(structureInfo2);
    org.junit.Assert.assertNotNull(gdbDiscoveryMetaCoreWrapperStream3);
  }

  @Test
  public void test0619() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0619");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder askMessageTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise2 = null;
    try {
      askMessageTypeMessageToByteEncoder0.deregister(channelHandlerContext1, channelPromise2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0620() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0620");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRX_STM_COMPLETE;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRX_STM_COMPLETE
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.TRX_STM_COMPLETE));
  }

  @Test
  public void test0621() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0621");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Double> doubleSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkaechoDouble;
    org.junit.Assert.assertNotNull(doubleSetting0);
  }

  @Test
  public void test0622() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0622");
    }
    io.github.onograph.cluster.raft.module.cuprot.IncomingEventService incomingEventService0 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler serverSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.module.cuprot.ServerSimpleChannelInboundHandler(
        incomingEventService0);
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting2 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingMutccsBoolean;
    boolean boolean3 = serverSimpleChannelInboundHandler1.acceptInboundMessage(
        (java.lang.Object) booleanSetting2);
    io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
    akka.actor.ExtendedActorSystem extendedActorSystem5 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument joinClusterRemoteInstrument6 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument(
        extendedActorSystem5);
    try {
      serverSimpleChannelInboundHandler1.channelRead(channelHandlerContext4,
          (java.lang.Object) joinClusterRemoteInstrument6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
  }

  @Test
  public void test0623() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0623");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType1 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper socketAddressWrapper2 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
        socketAddress0, socketAddressSchemeType1);
    try {
      java.lang.String str3 = socketAddressWrapper2.toString();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0624() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0624");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef0 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.TransactionLogElectionTermByteToMessageDecoder transactionLogElectionTermByteToMessageDecoder1 = new io.github.onograph.cluster.raft.akkamsg.serialization.TransactionLogElectionTermByteToMessageDecoder(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
  }

  @Test
  public void test0625() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0625");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    readablePositionAwareChecksumChannelManager0.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
    try {
      byte byte4 = readableClosablePositionAwareChecksumChannelPassThruImpl2.get();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0626() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0626");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingReclssInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0627() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0627");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType> raftConsensusMessageTypeRef1 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType> raftConsensusMessageTypeMessageRequestChannelInboundHandlerAdapter2 = new io.github.onograph.cluster.raft.module.cuprot.MessageRequestChannelInboundHandlerAdapter<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType>(
          logProvider0, raftConsensusMessageTypeRef1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0628() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0628");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    java.util.UUID uUID2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState3 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId0, consensusNodeId1, uUID2);
    java.lang.Object obj4 = null;
    boolean boolean5 = askState3.equals(obj4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0629() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0629");
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
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType7 = null;
    askMessageTypeElementQueueRunnerImpl0.recForTry(askMessageType7);
    boolean boolean9 = askMessageTypeElementQueueRunnerImpl0.isQueueEmpty();
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType10 = askMessageTypeElementQueueRunnerImpl0.poll();
    org.junit.Assert.assertTrue("'" + askMessageType1 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC + "'",
        askMessageType1.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC));
    org.junit.Assert.assertNotNull(askMessageTypeArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNull(askMessageType10);
  }

  @Test
  public void test0630() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0630");
    }
    java.lang.Runnable runnable0 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable0, leasableMetaStateStorage1);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData3 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer5 = null;
    try {
      syncableLeasableCoreNodeDataFSMImpl2.aplcoaForCoCo(syncableLeasableCoreNodeData3, 1L,
          fSMDataConsumer5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0631() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0631");
    }
    io.github.onograph.cluster.raft.control.connect.ClientException clientException1 = new io.github.onograph.cluster.raft.control.connect.ClientException(
        "");
    java.lang.String str2 = clientException1.toString();
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "io.github.onograph.cluster.raft.control.connect.ClientException: "
            + "'", str2, "io.github.onograph.cluster.raft.control.connect.ClientException: ");
  }

  @Test
  public void test0632() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0632");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl3 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean2);
    io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction dataSyncClusterAction4 = null;
    try {
      syncStatusMetaServiceImpl3.abrForDa(dataSyncClusterAction4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0633() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0633");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType1 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer2 = applicationComProFamilyType1.getImpl();
    boolean boolean3 = viewClusterInfo0.equals((java.lang.Object) entProVer2);
    boolean boolean4 = viewClusterInfo0.getIsCnegd();
    org.junit.Assert.assertNotNull(viewClusterInfo0);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType1 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType1.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0634() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0634");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    org.neo4j.dbms.identity.ServerId serverId2 = null;
    try {
      io.github.onograph.cluster.raft.shared.ClusterGdbSeedValidator.alcnwiForSeNaCl(
          clusterStructureService0, namedDatabaseId1, serverId2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0635() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0635");
    }
    io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType leadershipBalancingApproachType0 = io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType.LBAT_BAL_OFF;
    org.junit.Assert.assertTrue("'" + leadershipBalancingApproachType0 + "' != '"
        + io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType.LBAT_BAL_OFF
        + "'", leadershipBalancingApproachType0.equals(
        io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType.LBAT_BAL_OFF));
  }

  @Test
  public void test0636() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0636");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaarlsInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0637() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0637");
    }
    org.neo4j.configuration.Config config0 = null;
    io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper.CoreClusterModuleBuilder coreClusterModuleBuilder1 = null;
    org.neo4j.graphdb.facade.ExternalDependencies externalDependencies2 = null;
    io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager clusterDiscoveryManager3 = null;
    try {
      io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper coreDatabaseManagementServiceWrapper4 = new io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper(
          config0, coreClusterModuleBuilder1, externalDependencies2, clusterDiscoveryManager3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0638() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0638");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId0, consensusNodeId1, (long) '4', (long) (short) -1, 1L);
    boolean boolean6 = ask5.getIsOr();
    long long7 = ask5.getLgIll();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType8 = ask5.getTNme();
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType8 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ
        + "'", raftConsensusMessageType8.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_REQ));
  }

  @Test
  public void test0639() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0639");
    }
    io.github.onograph.config.SettingsDeclarationClusterSystemImpl settingsDeclarationClusterSystemImpl0 = new io.github.onograph.config.SettingsDeclarationClusterSystemImpl();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.config.SettingsDeclarationClusterSystemImpl> settingsDeclarationClusterSystemImplDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        settingsDeclarationClusterSystemImpl0);
    org.junit.Assert.assertNotNull(settingsDeclarationClusterSystemImplDataManagerFactory1);
  }

  @Test
  public void test0640() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0640");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier1 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    java.lang.String str2 = nodeGroupIdentifier1.toString();
    try {
      java.lang.CharSequence charSequence5 = nodeGroupIdentifier1.subSequence((-1), 3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 3, length 3");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
    }
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
  }

  @Test
  public void test0641() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0641");
    }
    org.neo4j.storageengine.api.StorageCommand[] storageCommandArray0 = new org.neo4j.storageengine.api.StorageCommand[]{};
    java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand> storageCommandList1 = new java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1,
        storageCommandArray0);
    byte[] byteArray3 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList1);
    try {
      long long4 = io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogHeadWrapper.deelinfrthr(
          byteArray3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  30faf29a-d87a-4ce0-9772-7173a2b607df");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(storageCommandArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(byteArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
  }

  @Test
  public void test0642() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0642");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    io.github.onograph.cluster.raft.module.cuprot.CatchupProblem catchupProblem1 = null;
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture2 = null;
    try {
      storeSyncCompletedCatchupAnswerManager0.onccerresForCoCa(catchupProblem1,
          storeSyncCompletedCompletableFuture2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0643() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0643");
    }
    io.github.onograph.cluster.raft.palapp.strategies.DefaultNamedServiceClusterApproach defaultNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.DefaultNamedServiceClusterApproach();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional2 = defaultNamedServiceClusterApproach0.fiuesrfodaOptional(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0644() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0644");
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
      org.neo4j.configuration.helpers.SocketAddress socketAddress11 = socketAddressServiceLeaderImpl8.seoaSocketAddress(
          namedDatabaseId10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0645() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0645");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaJSerializer nodeServerMemberLeaderMetaJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaJSerializer();
    io.github.onograph.cluster.raft.module.cuprot.current.info.Meta meta3 = io.github.onograph.cluster.raft.module.cuprot.current.info.Meta.craMeta(
        (long) 1536, "cc-core-restart-needed-listener-timer");
    try {
      byte[] byteArray4 = nodeServerMemberLeaderMetaJSerializer0.toBinary((java.lang.Object) meta3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class io.github.onograph.cluster.raft.module.cuprot.current.info.Meta cannot be cast to class io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta (io.github.onograph.cluster.raft.module.cuprot.current.info.Meta and io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta are in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertNotNull(meta3);
  }

  @Test
  public void test0646() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0646");
    }
    java.time.Clock clock0 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher inactiveNodeWatcher3 = new io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher(
        clock0, (long) 'h', log2);
  }

  @Test
  public void test0647() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0647");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId0, consensusNodeId1, (long) '4', (long) (short) -1, 1L);
    boolean boolean6 = ask5.getIsOr();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId7 = ask5.getFroConsensusNodeId();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception> voidProcessor8 = null;
    try {
      java.lang.Void void9 = ask5.dipc(voidProcessor8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNull(consensusNodeId7);
  }

  @Test
  public void test0648() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0648");
    }
    java.util.function.Predicate<java.lang.Object> objPredicate0 = null;
    io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler messageChannelDuplexHandler1 = new io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler(
        objPredicate0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    java.net.SocketAddress socketAddress3 = null;
    java.net.SocketAddress socketAddress4 = null;
    io.netty.channel.ChannelPromise channelPromise5 = null;
    try {
      messageChannelDuplexHandler1.connect(channelHandlerContext2, socketAddress3, socketAddress4,
          channelPromise5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0649() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0649");
    }
    java.lang.Exception exception0 = null;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData1 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        exception0);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta2 = io.github.onograph.cluster.raft.share.sync.SyncMeta.apldSyncMeta(
        fSMData1);
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData3 = syncMeta2.getSmrFSMData();
    org.junit.Assert.assertNotNull(fSMData1);
    org.junit.Assert.assertNotNull(syncMeta2);
    org.junit.Assert.assertNotNull(fSMData3);
  }

  @Test
  public void test0650() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0650");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    org.neo4j.dbms.database.DatabaseManager<?> wildcardDatabaseManager1 = dataSyncRunnerStatsManager0.databaseManagerDaamnObject;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = null;
    dataSyncRunnerStatsManager0.securityContext = securityContext2;
    org.junit.Assert.assertNull(wildcardDatabaseManager1);
  }

  @Test
  public void test0651() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0651");
    }
    java.util.Optional<akka.remote.artery.tcp.SSLEngineProvider> sSLEngineProviderOptional0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade2 = null;
    org.neo4j.logging.Log log3 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade4 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction5 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule6 = null;
    org.neo4j.memory.MemoryTracker memoryTracker7 = null;
    java.nio.file.Path path8 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo9 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path8);
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier10 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper11 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder12 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade4, namedDatabaseIdFunction5, globalModule6, memoryTracker7,
        clusterMetaTopologyInfo9, nodeGroupIdentifierSetSupplier10, leaderGatekeeper11);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat13 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv14 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction1, clusterSimpleStorageFacade2, log3, clusterMetaTopologyInfo9,
        clusterMetaFormat13);
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker15 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo9);
    org.neo4j.configuration.Config config16 = null;
    org.neo4j.logging.LogProvider logProvider17 = null;
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO19 = new io.github.onograph.config.ClusterMemberLimitAtCreationDTO(
        3);
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder actorStackBuilder20 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder(
          sSLEngineProviderOptional0,
          (io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker) defaultDiscoveryInitialProcChecker15,
          config16, logProvider17, clusterMemberLimitAtCreationDTO19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo9);
  }

  @Test
  public void test0652() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0652");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder metaByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder();
    io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator1 = io.netty.handler.codec.ByteToMessageDecoder.COMPOSITE_CUMULATOR;
    metaByteToMessageDecoder0.setCumulator(cumulator1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler4 = null;
    org.neo4j.logging.Log log5 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler6 = null;
    org.neo4j.logging.Log log7 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler8 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler9 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl10 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler11 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler9, refCatchupManagerImpl10);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler12 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler8, refCatchupManagerImpl10);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler13 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler6, log7, refCatchupManagerImpl10);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler14 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler4, log5, refCatchupManagerImpl10);
    try {
      metaByteToMessageDecoder0.channelRead(channelHandlerContext3, (java.lang.Object) log5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(cumulator1);
  }

  @Test
  public void test0653() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0653");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType0 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.HEALTH_PING_TO;
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.HEALTH_PING_TO
        + "'", raftConsensusMessageType0.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.HEALTH_PING_TO));
  }

  @Test
  public void test0654() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0654");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemByteToMessageDecoder catchupProblemByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemByteToMessageDecoder();
    boolean boolean1 = catchupProblemByteToMessageDecoder0.isSingleDecode();
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
  }

  @Test
  public void test0655() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0655");
    }
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation0 = null;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync3 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation0, databaseId1, (long) (short) 0);
    io.netty.buffer.ByteBuf byteBuf4 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel5 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf4);
    defaultWritableChecksumChannel5.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper.maslForWrAb(
          abstractTransactionSync3,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0656() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0656");
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
    java.time.Instant instant9 = replyArrivingMessageManager8.getArInstant();
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    org.junit.Assert.assertNotNull(replyArrivingMessageManager8);
    org.junit.Assert.assertNull(instant9);
  }

  @Test
  public void test0657() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0657");
    }
    io.github.onograph.config.ConsensusLogCacheStrategyType consensusLogCacheStrategyType0 = io.github.onograph.config.ConsensusLogCacheStrategyType.ST_NOOP;
    org.junit.Assert.assertNotNull(consensusLogCacheStrategyType0);
  }

  @Test
  public void test0658() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0658");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady consensusGdbsReady0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady.EMT_CONSENSUS_GDBS_READY;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage[] infoReplyMessageArray1 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage[]{};
    java.util.ArrayList<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> infoReplyMessageList2 = new java.util.ArrayList<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>) infoReplyMessageList2,
        infoReplyMessageArray1);
    java.lang.Exception exception4 = null;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData5 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        exception4);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta6 = io.github.onograph.cluster.raft.share.sync.SyncMeta.apldSyncMeta(
        fSMData5);
    io.github.onograph.cluster.raft.share.sync.ClusterMetaInfoReply clusterMetaInfoReply7 = new io.github.onograph.cluster.raft.share.sync.ClusterMetaInfoReply(
        (java.util.List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage>) infoReplyMessageList2,
        syncMeta6);
    java.util.List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> infoReplyMessageList8 = clusterMetaInfoReply7.getListRsossInfoReplyMessage();
    boolean boolean9 = consensusGdbsReady0.equals((java.lang.Object) clusterMetaInfoReply7);
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager10 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory11 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager10);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext12 = dataSyncRunnerStatsManager10.securityContext;
    boolean boolean13 = consensusGdbsReady0.equals((java.lang.Object) dataSyncRunnerStatsManager10);
    org.junit.Assert.assertNotNull(consensusGdbsReady0);
    org.junit.Assert.assertNotNull(infoReplyMessageArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(fSMData5);
    org.junit.Assert.assertNotNull(syncMeta6);
    org.junit.Assert.assertNotNull(infoReplyMessageList8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory11);
    org.junit.Assert.assertNull(securityContext12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0659() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0659");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readablePositionAwareChecksumChannelManager1.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
    try {
      io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId5 = safeStateMarshalImpl0.unmarshal0(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
  }

  @Test
  public void test0660() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0660");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType arteryRemotingType0 = io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_AERON;
    org.junit.Assert.assertTrue("'" + arteryRemotingType0 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_AERON
        + "'", arteryRemotingType0.equals(
        io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_AERON));
  }

  @Test
  public void test0661() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0661");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    java.util.UUID uUID2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.AskState askState3 = new io.github.onograph.cluster.raft.share.meta.fsm.AskState(
        databaseId0, consensusNodeId1, uUID2);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId4 = askState3.getImConsensusNodeId();
    io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor autoCloseableActionProcessor5 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer6 = null;
    try {
      askState3.dipcForSy(autoCloseableActionProcessor5, fSMDataConsumer6, (long) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(consensusNodeId4);
  }

  @Test
  public void test0662() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0662");
    }
    io.github.onograph.cluster.raft.utils.queuesrv.ElementQueueRunnerImpl<io.github.onograph.cluster.raft.module.cuprot.AskMessageType> askMessageTypeElementQueueRunnerImpl0 = new io.github.onograph.cluster.raft.utils.queuesrv.ElementQueueRunnerImpl<io.github.onograph.cluster.raft.module.cuprot.AskMessageType>();
    boolean boolean1 = askMessageTypeElementQueueRunnerImpl0.isQueueEmpty();
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType3 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.froAskMessageType(
        (byte) 9);
    askMessageTypeElementQueueRunnerImpl0.recForTry(askMessageType3);
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    org.junit.Assert.assertTrue("'" + askMessageType3 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STATS + "'",
        askMessageType3.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STATS));
  }

  @Test
  public void test0663() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0663");
    }
    io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder serverMessageToByteEncoder0 = new io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId2 = null;
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier3 = io.github.onograph.config.NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER;
    io.github.onograph.config.NodeGroupIdentifier[] nodeGroupIdentifierArray4 = new io.github.onograph.config.NodeGroupIdentifier[]{
        nodeGroupIdentifier3};
    java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet5 = new java.util.LinkedHashSet<io.github.onograph.config.NodeGroupIdentifier>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet5,
        nodeGroupIdentifierArray4);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec7 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(
        consensusNodeId1, consensusNodeId2,
        (java.util.Set<io.github.onograph.config.NodeGroupIdentifier>) nodeGroupIdentifierSet5);
    boolean boolean8 = serverMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) leaderRec7);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType9 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    java.lang.String str10 = applicationComProFamilyType9.caerString();
    io.github.onograph.config.EntProVer entProVer11 = applicationComProFamilyType9.getImpl();
    boolean boolean12 = serverMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) applicationComProFamilyType9);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier3);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType9 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType9.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "catchup_protocol" + "'", str10,
        "catchup_protocol");
    org.junit.Assert.assertNotNull(entProVer11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test0664() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0664");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRecneieDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0665() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0665");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE__SNAPPY_VAL;
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE__SNAPPY_VAL + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE__SNAPPY_VAL));
  }

  @Test
  public void test0666() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0666");
    }
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta consensusNodeFollowerMeta0 = new io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta();
  }

  @Test
  public void test0667() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0667");
    }
    org.neo4j.graphdb.config.Setting<java.lang.String> strSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingRaontgString;
    org.junit.Assert.assertNotNull(strSetting0);
  }

  @Test
  public void test0668() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0668");
    }
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta0 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta1 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction2 = clearStaleClusterMeta0.andMetaUpgradeFlowAction(
        (io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction) clearStaleClusterMeta1);
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
    try {
      clearStaleClusterMeta1.pefmseForUp(upgradeMetaEnv10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction2);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo7);
    org.junit.Assert.assertNull(path8);
  }

  @Test
  public void test0669() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0669");
    }
    io.github.onograph.cluster.raft.control.MutableProtocols mutableProtocols0 = io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC;
    java.lang.String str1 = mutableProtocols0.getImpl();
    org.junit.Assert.assertTrue("'" + mutableProtocols0 + "' != '"
            + io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC + "'",
        mutableProtocols0.equals(
            io.github.onograph.cluster.raft.control.MutableProtocols.COM_TYPE_LZ4_HC));
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LZ4_high_compression" + "'", str1,
        "LZ4_high_compression");
  }

  @Test
  public void test0670() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0670");
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
    org.neo4j.logging.LogProvider logProvider11 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.pit.StoreSyncService storeSyncService12 = new io.github.onograph.cluster.raft.share.meta.pit.StoreSyncService(
          catchupClusteredGdbManageService10, logProvider11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0671() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0671");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdByteToMessageDecoder requestGdbIdByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    requestGdbIdByteToMessageDecoder0.handlerRemoved(channelHandlerContext1);
  }

  @Test
  public void test0672() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0672");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException clusterSyncerException3 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException();
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta4 = io.github.onograph.cluster.raft.share.sync.SyncMeta.norladSyncMeta(
        (java.lang.Throwable) clusterSyncerException3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Exception) clusterSyncerException3, "restarting-cluster-client");
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture7 = nettyChannelImpl2.wrtanflhFuture(
          (java.lang.Object) gdbStoreSyncCrlException6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(syncMeta4);
  }

  @Test
  public void test0673() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0673");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncRequestWatcher transactionSyncRequestWatcher1 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef2 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator transactionBlockGenerator3 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncSimpleChannelInboundHandler transactionSyncSimpleChannelInboundHandler4 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncSimpleChannelInboundHandler(
          logProvider0, transactionSyncRequestWatcher1, serverRef2, transactionBlockGenerator3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0674() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0674");
    }
    java.lang.Object obj1 = null;
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction noComAction2 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction(
        (long) (byte) 1, obj1);
    io.github.onograph.cluster.raft.share.calg.ConsensusTransactionLogProcessor consensusTransactionLogProcessor3 = null;
    io.github.onograph.cluster.raft.share.calg.LeaderNodeElectionEnv leaderNodeElectionEnv6 = new io.github.onograph.cluster.raft.share.calg.LeaderNodeElectionEnv(
        (long) '4', (-1L));
    try {
      noComAction2.apltoForCoLe(consensusTransactionLogProcessor3, leaderNodeElectionEnv6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0675() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0675");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder requestAllGdbIdsMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise2 = null;
    try {
      requestAllGdbIdsMessageToByteEncoder0.close(channelHandlerContext1, channelPromise2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0676() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0676");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType3 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted(
        0L, setupGdbSyncReplyStateType3);
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
  }

  @Test
  public void test0677() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0677");
    }
    java.util.function.Predicate<java.lang.Object> objPredicate0 = null;
    io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler messageChannelDuplexHandler1 = new io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler(
        objPredicate0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    try {
      messageChannelDuplexHandler1.read(channelHandlerContext2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0678() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0678");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    int int1 = consensusLogCacheServiceNoopImpl0.elmtcu();
    consensusLogCacheServiceNoopImpl0.retspccac();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
  }

  @Test
  public void test0679() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0679");
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
      entProVer2.enoForBy(byteBuf7);
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
  public void test0680() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0680");
    }
    org.neo4j.kernel.database.DatabaseTracers databaseTracers0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.memory.MemoryTracker memoryTracker2 = null;
    org.neo4j.io.pagecache.PageCache pageCache3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter(
        databaseTracers0, fileSystemAbstraction1, memoryTracker2, pageCache3);
    syncRecoveryLifecycleAdapter4.start();
    syncRecoveryLifecycleAdapter4.start();
  }

  @Test
  public void test0681() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0681");
    }
    akka.cluster.Cluster cluster0 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.structure.CleanupUnreachableActor cleanupUnreachableActor2 = new io.github.onograph.cluster.raft.module.dprot.impl.structure.CleanupUnreachableActor(
          cluster0, (java.lang.Boolean) false);
      org.junit.Assert.fail(
          "Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [io.github.onograph.cluster.raft.module.dprot.impl.structure.CleanupUnreachableActor] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
    } catch (akka.actor.ActorInitializationException e) {
    }
  }

  @Test
  public void test0682() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0682");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.CT;
    org.junit.Assert.assertTrue("'" + messageDataType0 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.CT + "'",
        messageDataType0.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.CT));
  }

  @Test
  public void test0683() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0683");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = null;
    java.lang.Boolean boolean2 = messageProcessorImpl0.process(aliveMsg1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage3 = null;
    java.lang.Boolean boolean4 = messageProcessorImpl0.process(requestTransactionLogCZMetaMessage3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.AskToChange askToChange5 = null;
    java.lang.Boolean boolean6 = messageProcessorImpl0.process(askToChange5);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
  }

  @Test
  public void test0684() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0684");
    }
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta1 = marshalChannelImplCMS0.startState();
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS marshalChannelImplCMS2 = io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.meta.CandidateTermMeta candidateTermMeta3 = marshalChannelImplCMS2.startState();
    io.netty.buffer.ByteBuf byteBuf4 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel5 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf4);
    try {
      marshalChannelImplCMS0.marshal(candidateTermMeta3,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNotNull(candidateTermMeta1);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS2);
    org.junit.Assert.assertNotNull(candidateTermMeta3);
  }

  @Test
  public void test0685() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0685");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingEneoBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0686() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0686");
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
      boolean boolean9 = leaseServiceEnterpriseImpl7.isInl((int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  6a482672-20a5-4004-a3c3-9d17e69087bd");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0687() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0687");
    }
    org.neo4j.kernel.database.Database database0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef2 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor storeResourceSyncProcessor4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor(
        3);
    try {
      io.github.onograph.cluster.raft.module.cuprot.scmeta.RequestStoreResourceInboundHandler requestStoreResourceInboundHandler5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.RequestStoreResourceInboundHandler(
          database0, fileSystemAbstraction1, serverRef2, storeResourceSyncProcessor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0688() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0688");
    }
    org.neo4j.configuration.helpers.SocketAddress socketAddress0 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType socketAddressSchemeType2 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt;
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper socketAddressWrapper3 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
        socketAddress1, socketAddressSchemeType2);
    io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper socketAddressWrapper4 = new io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressWrapper(
        socketAddress0, socketAddressSchemeType2);
    org.junit.Assert.assertTrue("'" + socketAddressSchemeType2 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt
        + "'", socketAddressSchemeType2.equals(
        io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddresses.SocketAddressSchemeType.bolt));
  }

  @Test
  public void test0689() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0689");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta sliceMeta5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta(
        "RelationshipType");
    int int6 = sliceMeta5.getIAr();
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.onfihdForCoSl(
          storeSyncCompletedCompletableFuture3, sliceMeta5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
  }

  @Test
  public void test0690() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0690");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
    try {
      io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper2 = io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapperMarshaller.unahConsensusNodeServerMemberIdWrapper(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0691() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0691");
    }
    java.time.Clock clock0 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher inactiveNodeWatcher3 = new io.github.onograph.cluster.raft.akkamsg.InactiveNodeWatcher(
        clock0, (long) 13, log2);
  }

  @Test
  public void test0692() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0692");
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
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker14 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo8);
    try {
      java.nio.file.Path path16 = clusterMetaTopologyInfo8.ragridfPath("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo8);
  }

  @Test
  public void test0693() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0693");
    }
    io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
    io.netty.buffer.ByteBuf[] byteBufArray2 = new io.netty.buffer.ByteBuf[]{};
    java.util.LinkedList<io.netty.buffer.ByteBuf> byteBufList3 = new java.util.LinkedList<io.netty.buffer.ByteBuf>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<io.netty.buffer.ByteBuf>) byteBufList3, byteBufArray2);
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl5 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl(
          byteBufAllocator0, 1536, (java.util.Queue<io.netty.buffer.ByteBuf>) byteBufList3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: allocator cannot be null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteBufArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0694() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0694");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl2 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, log1, refCatchupManagerImpl2);
    java.nio.file.Path path4 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo5 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path4);
    java.nio.file.Path path6 = clusterMetaTopologyInfo5.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker7 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo5);
    boolean boolean8 = sliceMetaSimpleChannelInboundHandler3.acceptInboundMessage(
        (java.lang.Object) clusterMetaTopologyInfo5);
    try {
      java.nio.file.Path path10 = clusterMetaTopologyInfo5.lesdtPath("restarting-cluster-client");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo5);
    org.junit.Assert.assertNull(path6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0695() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0695");
    }
    io.github.onograph.cluster.raft.utils.ExceptionManager exceptionManager1 = new io.github.onograph.cluster.raft.utils.ExceptionManager(
        "designated_seeder");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        "store_version");
    exceptionManager1.addForTh((java.lang.Throwable) gdbStoreSyncCrlException3);
    try {
      exceptionManager1.close();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: *** Error: 9da32cbf-1610-43d9-a432-389a3c208423");
    } catch (java.lang.RuntimeException e) {
    }
  }

  @Test
  public void test0696() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0696");
    }
    java.time.Clock clock0 = null;
    java.time.Duration duration1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder> scHolderBuilderTransferCollection2 = new io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder>(
          clock0, duration1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0697() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0697");
    }
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType> messageDataTypeRef0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService1 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        messageDataTypeRef0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder snapshotDataMessageToByteEncoder3 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder();
    org.neo4j.kernel.KernelVersion kernelVersion4 = null;
    org.neo4j.storageengine.api.StoreId storeId5 = null;
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation6 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply7 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply(
        kernelVersion4, storeId5, committedTransactionRepresentation6);
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation8 = catchupOutgoingTransactionPullReply7.getTCommittedTransactionRepresentation();
    org.neo4j.kernel.KernelVersion kernelVersion9 = catchupOutgoingTransactionPullReply7.getKernelVersion();
    boolean boolean10 = snapshotDataMessageToByteEncoder3.acceptOutboundMessage(
        (java.lang.Object) kernelVersion9);
    try {
      syncableDataDataManagerFactoryDecodingService1.channelRead(channelHandlerContext2,
          (java.lang.Object) boolean10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(committedTransactionRepresentation8);
    org.junit.Assert.assertNull(kernelVersion9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0698() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0698");
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
    java.time.Instant instant26 = null;
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId27 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId28 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply31 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        consensusNodeId28, false, 100L);
    boolean boolean32 = reply31.getIsGv();
    long long33 = reply31.getLgT();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply> replyArrivingMessageManager34 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager.ofConsensusMessageServiceMetaArrivingMessageManager(
        instant26, consensusMemberGroupId27, reply31);
    try {
      java.lang.Void void35 = processorImpl2.process(reply31);
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
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
    org.junit.Assert.assertNotNull(replyArrivingMessageManager34);
  }

  @Test
  public void test0699() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0699");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler catchupIncomingTransactionReplySimpleChannelInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction4 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade5 = null;
    org.neo4j.logging.Log log6 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade7 = null;
    java.util.function.Function<org.neo4j.kernel.database.NamedDatabaseId, io.github.onograph.cluster.raft.share.calg.LeaderNodeEventHandlers> namedDatabaseIdFunction8 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule9 = null;
    org.neo4j.memory.MemoryTracker memoryTracker10 = null;
    java.nio.file.Path path11 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo12 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path11);
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier13 = null;
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderGatekeeper leaderGatekeeper14 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder consensusNodeGroupWrapperBuilder15 = new io.github.onograph.cluster.raft.share.calg.ConsensusNodeGroupWrapperBuilder(
        clusterSimpleStorageFacade7, namedDatabaseIdFunction8, globalModule9, memoryTracker10,
        clusterMetaTopologyInfo12, nodeGroupIdentifierSetSupplier13, leaderGatekeeper14);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat16 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv17 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction4, clusterSimpleStorageFacade5, log6, clusterMetaTopologyInfo12,
        clusterMetaFormat16);
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker18 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo12);
    try {
      catchupIncomingTransactionReplySimpleChannelInboundHandler2.channelRead(
          channelHandlerContext3, (java.lang.Object) defaultDiscoveryInitialProcChecker18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo12);
  }

  @Test
  public void test0700() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0700");
    }
    io.netty.buffer.ByteBuf byteBuf1 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel2 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf1);
    defaultWritableChecksumChannel2.beginChecksum();
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler.maslForWr(
          false, (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0701() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0701");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO1 = io.github.onograph.config.ClusterMemberLimitAtCreationDTO.froClusterMemberLimitAtCreationDTO(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0702() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0702");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    try {
      byte byte3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.get();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0703() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0703");
    }
    org.neo4j.kernel.KernelVersion kernelVersion0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation2 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply3 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply(
        kernelVersion0, storeId1, committedTransactionRepresentation2);
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation4 = catchupOutgoingTransactionPullReply3.getTCommittedTransactionRepresentation();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager consensusTransactionLogMetaLRUCacheManager6 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager(
        (int) (short) 1);
    consensusTransactionLogMetaLRUCacheManager6.reouto((long) 100);
    boolean boolean9 = catchupOutgoingTransactionPullReply3.equals(
        (java.lang.Object) consensusTransactionLogMetaLRUCacheManager6);
    org.junit.Assert.assertNull(committedTransactionRepresentation4);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0704() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0704");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl3 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler2, refCatchupManagerImpl3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceSimpleChannelInboundHandler sliceSimpleChannelInboundHandler5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceSimpleChannelInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl3);
    try {
      io.github.onograph.cluster.raft.module.cuprot.ClientMessageChannelInboundHandlerAdapter clientMessageChannelInboundHandlerAdapter6 = new io.github.onograph.cluster.raft.module.cuprot.ClientMessageChannelInboundHandlerAdapter(
          logProvider0, refCatchupManagerImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0705() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0705");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.kernel.database.DatabaseId[] databaseIdArray1 = new org.neo4j.kernel.database.DatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId> databaseIdSet2 = new java.util.LinkedHashSet<org.neo4j.kernel.database.DatabaseId>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.DatabaseId>) databaseIdSet2,
        databaseIdArray1);
    try {
      io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl gdbDiscoveryMetaCoreImpl4 = io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl.froGdbDiscoveryMetaCoreImpl(
          config0, (java.util.Set<org.neo4j.kernel.database.DatabaseId>) databaseIdSet2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseIdArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0706() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0706");
    }
    io.netty.util.AttributeKey<java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper>> comProFamilyWrapperCompletableFutureAttributeKey0 = io.github.onograph.cluster.raft.control.connect.ProComAttributeKey.ATTRIBUTE_KEY_PRTOTK_COMPLETABLE_FUTURE;
    org.junit.Assert.assertNotNull(comProFamilyWrapperCompletableFutureAttributeKey0);
  }

  @Test
  public void test0707() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0707");
    }
    io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
    org.neo4j.storageengine.api.StorageCommand[] storageCommandArray1 = new org.neo4j.storageengine.api.StorageCommand[]{};
    java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand> storageCommandList2 = new java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.storageengine.api.StorageCommand>) storageCommandList2,
        storageCommandArray1);
    byte[] byteArray4 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList2);
    byte[] byteArray5 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList2);
    io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[]{};
    java.util.LinkedList<io.netty.buffer.ByteBuf> byteBufList8 = new java.util.LinkedList<io.netty.buffer.ByteBuf>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<io.netty.buffer.ByteBuf>) byteBufList8, byteBufArray7);
    try {
      io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl10 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl(
          byteBufAllocator0, byteArray5, (int) (short) 1,
          (java.util.Queue<io.netty.buffer.ByteBuf>) byteBufList8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: allocator cannot be null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storageCommandArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(byteArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    org.junit.Assert.assertNotNull(byteArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    org.junit.Assert.assertNotNull(byteBufArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0708() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0708");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer discoveryGdbOperatorMetaWrapperJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer();
    boolean boolean1 = discoveryGdbOperatorMetaWrapperJSerializer0.includeManifest();
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting2 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCauceInteger;
    try {
      byte[] byteArray3 = discoveryGdbOperatorMetaWrapperJSerializer0.toBinary(
          (java.lang.Object) intSetting2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class org.neo4j.configuration.SettingImpl cannot be cast to class io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper (org.neo4j.configuration.SettingImpl and io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper are in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    org.junit.Assert.assertNotNull(intSetting2);
  }

  @Test
  public void test0709() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0709");
    }
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl1 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl2 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel0, safeStateMarshalImpl1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk3 = null;
    java.lang.Void void4 = processorImpl2.process(bulkAsk3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage5 = null;
    java.lang.Void void6 = processorImpl2.process(logClipRequestMessage5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage7 = null;
    try {
      java.lang.Void void8 = processorImpl2.process(requestTransactionLogCZMetaMessage7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
  }

  @Test
  public void test0710() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0710");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdMessageToByteEncoder requestGdbIdMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdMessageToByteEncoder();
  }

  @Test
  public void test0711() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0711");
    }
    java.security.SecureRandom secureRandom1 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.KeyStorePassword keyStorePassword2 = new io.github.onograph.cluster.raft.module.dprot.KeyStorePassword(
          (int) '4', secureRandom1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0712() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0712");
    }
    io.github.onograph.cluster.raft.share.meta.DefaultMarshalChannelCMS defaultMarshalChannelCMS0 = new io.github.onograph.cluster.raft.share.meta.DefaultMarshalChannelCMS();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    try {
      java.lang.Long long3 = defaultMarshalChannelCMS0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0713() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0713");
    }
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.id.ConsensusNodeId> databaseIdMap0 = null;
    org.neo4j.dbms.identity.ServerId serverId1 = null;
    io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator consensusGdbServerCoordinator2 = io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator.ofConsensusGdbServerCoordinator(
        databaseIdMap0, serverId1);
    org.neo4j.dbms.identity.ServerId serverId3 = consensusGdbServerCoordinator2.getServerId();
    org.junit.Assert.assertNotNull(consensusGdbServerCoordinator2);
    org.junit.Assert.assertNull(serverId3);
  }

  @Test
  public void test0714() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0714");
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
    org.neo4j.kernel.database.DatabaseId databaseId21 = null;
    org.neo4j.storageengine.api.StoreId storeId22 = null;
    java.nio.file.Path path24 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource25 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId21, storeId22, (long) (byte) 10, path24);
    org.neo4j.kernel.database.DatabaseId databaseId26 = requestStoreResource25.getDatabaseId();
    org.neo4j.storageengine.api.StoreId storeId27 = requestStoreResource25.getEpceStoreId();
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType28 = requestStoreResource25.getTNme();
    boolean boolean29 = syncedLeaderMeta6.equals((java.lang.Object) askMessageType28);
    org.junit.Assert.assertNotNull(replicatedData4);
    org.junit.Assert.assertNotNull(syncedLeaderMeta7);
    org.junit.Assert.assertNotNull(replicatedData15);
    org.junit.Assert.assertNotNull(syncedLeaderMeta18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(syncedLeaderMeta20);
    org.junit.Assert.assertNull(databaseId26);
    org.junit.Assert.assertNull(storeId27);
    org.junit.Assert.assertTrue("'" + askMessageType28 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SC_FP + "'",
        askMessageType28.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SC_FP));
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
  }

  @Test
  public void test0715() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0715");
    }
    io.github.onograph.config.ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO1 = new io.github.onograph.config.ClusterMemberLimitAtCreationDTO(
        3);
    org.neo4j.configuration.Config config2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterJoinOrganizer clusterJoinOrganizer3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackBuilder actorStackBuilder4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray6 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList7 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList7,
        socketAddressArray6);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService9 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList7);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService10 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList7);
    boolean boolean11 = memberNodeService10.isUsord();
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray12 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList13 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList13,
        socketAddressArray12);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService15 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList13);
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl actorLifecycleApproachDefaultImpl16 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl(
        memberNodeService15);
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager actorStackManager17 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager(
          clusterMemberLimitAtCreationDTO1, config2, clusterJoinOrganizer3, actorStackBuilder4,
          logProvider5, memberNodeService10,
          (io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach) actorLifecycleApproachDefaultImpl16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(socketAddressArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(memberNodeService9);
    org.junit.Assert.assertNotNull(memberNodeService10);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(socketAddressArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(memberNodeService15);
  }

  @Test
  public void test0716() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0716");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    try {
      float float4 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getFloat();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
  }

  @Test
  public void test0717() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0717");
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
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta7 = clusterMetaInfoReply6.getRrSyncMeta();
    java.lang.Throwable throwable8 = syncMeta7.getFiueThrowable();
    org.junit.Assert.assertNotNull(infoReplyMessageArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(fSMData4);
    org.junit.Assert.assertNotNull(syncMeta5);
    org.junit.Assert.assertNotNull(syncMeta7);
    org.junit.Assert.assertNull(throwable8);
  }

  @Test
  public void test0718() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0718");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingMiealneoaBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0719() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0719");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingMiuetzueInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0720() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0720");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.Meta meta2 = io.github.onograph.cluster.raft.module.cuprot.current.info.Meta.craMeta(
        (long) 3, "io.github.onograph.cluster.raft.control.connect.ClientException: ");
    org.junit.Assert.assertNotNull(meta2);
  }

  @Test
  public void test0721() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0721");
    }
    io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaIncomingChangeTaskError readReplicaIncomingChangeTaskError0 = io.github.onograph.cluster.raft.readreplica.tx.ReadReplicaIncomingChangeTaskError.IT;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryNodeReplyException discoveryNodeReplyException1 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryNodeReplyException(
        (java.lang.Throwable) readReplicaIncomingChangeTaskError0);
    org.junit.Assert.assertNotNull(readReplicaIncomingChangeTaskError0);
  }

  @Test
  public void test0722() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0722");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask ask5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Ask(
        consensusNodeId0, consensusNodeId1, (long) '4', (long) (short) -1, 1L);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId6 = ask5.getCniaeConsensusNodeId();
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId7 = ask5.getFroConsensusNodeId();
    long long8 = ask5.getLgT();
    org.junit.Assert.assertNull(consensusNodeId6);
    org.junit.Assert.assertNull(consensusNodeId7);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
  }

  @Test
  public void test0723() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0723");
    }
    org.neo4j.scheduler.JobScheduler jobScheduler0 = null;
    io.github.onograph.cluster.raft.utils.queuesrv.ElementQueue<java.lang.Runnable> runnableElementQueue1 = null;
    org.neo4j.scheduler.Group group2 = null;
    org.neo4j.logging.Log log3 = null;
    io.github.onograph.cluster.raft.utils.queuesrv.QueueableJobSchedulerWrapper queueableJobSchedulerWrapper4 = new io.github.onograph.cluster.raft.utils.queuesrv.QueueableJobSchedulerWrapper(
        jobScheduler0, runnableElementQueue1, group2, log3);
  }

  @Test
  public void test0724() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0724");
    }
    java.lang.Runnable runnable0 = null;
    org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta> leasableMetaStateStorage1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl syncableLeasableCoreNodeDataFSMImpl2 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeDataFSMImpl(
        runnable0, leasableMetaStateStorage1);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta3 = io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.INTL_LES_STAX;
    syncableLeasableCoreNodeDataFSMImpl2.inlspForLe(leasableMeta3);
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData5 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer7 = null;
    try {
      syncableLeasableCoreNodeDataFSMImpl2.aplcoaForCoCo(syncableLeasableCoreNodeData5, (long) 'a',
          fSMDataConsumer7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(leasableMeta3);
  }

  @Test
  public void test0725() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0725");
    }
    java.time.Duration duration0 = null;
    org.neo4j.dbms.database.DatabaseManager<io.github.onograph.dbms.gdb.EnterpriseClusterDbContext> enterpriseClusterDbContextDatabaseManager1 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusLeaderNodeService consensusLeaderNodeService4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    org.neo4j.monitoring.Monitors monitors6 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    io.github.onograph.cluster.raft.akkamsg.OutDirection<io.github.onograph.cluster.raft.id.ConsensusNodeId, io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AbstractConsensusMessage> consensusNodeIdOutDirection8 = null;
    org.neo4j.internal.helpers.TimeoutStrategy timeoutStrategy9 = null;
    io.github.onograph.cluster.raft.share.sync.SubCSManager subCSManager10 = null;
    java.util.UUID uUID11 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy12 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean13 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID11, consensusNodeIdLazy12);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl14 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean13);
    try {
      io.github.onograph.cluster.raft.share.sync.ConsensusSynceratorImpl consensusSynceratorImpl15 = new io.github.onograph.cluster.raft.share.sync.ConsensusSynceratorImpl(
          duration0, enterpriseClusterDbContextDatabaseManager1, consensusNodeIdLazy2, (long) '4',
          consensusLeaderNodeService4, logProvider5, monitors6, namedDatabaseId7,
          consensusNodeIdOutDirection8, timeoutStrategy9, subCSManager10,
          (io.github.onograph.cluster.raft.share.sync.SyncStatusMetaService) syncStatusMetaServiceImpl14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0726() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0726");
    }
    io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType> messageDataTypeRef0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter messageDataTypeChannelInboundHandlerAdapter1 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeChannelInboundHandlerAdapter(
        messageDataTypeRef0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler4 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler5 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl6 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler7 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler5, refCatchupManagerImpl6);
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler8 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler4, refCatchupManagerImpl6);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseIdInboundHandler storeDatabaseIdInboundHandler9 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseIdInboundHandler(
        catchupAnswerLimitHandler3, refCatchupManagerImpl6);
    try {
      messageDataTypeChannelInboundHandlerAdapter1.channelRead(channelHandlerContext2,
          (java.lang.Object) catchupAnswerLimitHandler3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0727() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0727");
    }
    io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType consensusIdStatusType0 = io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType.OK_PUB_OTHER_THAN_CALLER;
    org.junit.Assert.assertTrue("'" + consensusIdStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType.OK_PUB_OTHER_THAN_CALLER
        + "'", consensusIdStatusType0.equals(
        io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType.OK_PUB_OTHER_THAN_CALLER));
  }

  @Test
  public void test0728() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0728");
    }
    io.github.onograph.cluster.raft.share.meta.MetaType metaType0 = io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_VOTE;
    org.junit.Assert.assertTrue("'" + metaType0 + "' != '"
            + io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_VOTE + "'",
        metaType0.equals(io.github.onograph.cluster.raft.share.meta.MetaType.MT_CONS_VOTE));
  }

  @Test
  public void test0729() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0729");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier1 = new io.github.onograph.config.NodeGroupIdentifier(
        "LZ4_high_compression");
    java.util.stream.IntStream intStream2 = nodeGroupIdentifier1.codePoints();
    org.junit.Assert.assertNotNull(intStream2);
  }

  @Test
  public void test0730() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0730");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta sliceMeta2 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta(
        (int) (short) -1, "default");
    java.lang.String str3 = sliceMeta2.getStrNf();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "default" + "'", str3, "default");
  }

  @Test
  public void test0731() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0731");
    }
    java.lang.String[] strArray5 = new java.lang.String[]{"designated_seeder", "leader-only",
        "store_version", "store_version"};
    java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strSet6, strArray5);
    io.github.onograph.cluster.raft.control.connect.MutatingComProFamilyWrapper mutatingComProFamilyWrapper8 = new io.github.onograph.cluster.raft.control.connect.MutatingComProFamilyWrapper(
        "", (java.util.Set<java.lang.String>) strSet6);
    java.lang.String str9 = mutatingComProFamilyWrapper8.getStrIetfe();
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
  }

  @Test
  public void test0732() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0732");
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
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler19 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl20 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler21 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler19, refCatchupManagerImpl20);
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting22 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingJoapoDuration;
    boolean boolean23 = transactionChunkingCompletedInboundHandler21.acceptInboundMessage(
        (java.lang.Object) durationSetting22);
    boolean boolean24 = clusterMetaFormat0.equals(
        (java.lang.Object) transactionChunkingCompletedInboundHandler21);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat25 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    org.neo4j.configuration.Config config27 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction28 = null;
    org.neo4j.logging.LogProvider logProvider29 = null;
    java.nio.file.Path path30 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo31 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path30);
    java.nio.file.Path path32 = clusterMetaTopologyInfo31.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker33 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo31);
    org.neo4j.memory.MemoryTracker memoryTracker34 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade35 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config27, fileSystemAbstraction28, logProvider29, clusterMetaTopologyInfo31,
        memoryTracker34);
    org.neo4j.logging.Log log36 = null;
    java.nio.file.Path path37 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo38 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path37);
    java.nio.file.Path path39 = clusterMetaTopologyInfo38.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker40 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo38);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat41 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv42 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction26, clusterSimpleStorageFacade35, log36, clusterMetaTopologyInfo38,
        clusterMetaFormat41);
    boolean boolean43 = clusterMetaFormat25.isLortaForCl(clusterMetaFormat41);
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler44 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl45 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler46 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler44, refCatchupManagerImpl45);
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting47 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingJoapoDuration;
    boolean boolean48 = transactionChunkingCompletedInboundHandler46.acceptInboundMessage(
        (java.lang.Object) durationSetting47);
    boolean boolean49 = clusterMetaFormat25.equals(
        (java.lang.Object) transactionChunkingCompletedInboundHandler46);
    boolean boolean50 = clusterMetaFormat0.isLortaForCl(clusterMetaFormat25);
    org.junit.Assert.assertNotNull(clusterMetaFormat0);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo6);
    org.junit.Assert.assertNull(path7);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo13);
    org.junit.Assert.assertNull(path14);
    org.junit.Assert.assertNotNull(clusterMetaFormat16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(durationSetting22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertNotNull(clusterMetaFormat25);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo31);
    org.junit.Assert.assertNull(path32);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo38);
    org.junit.Assert.assertNull(path39);
    org.junit.Assert.assertNotNull(clusterMetaFormat41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(durationSetting47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
  }

  @Test
  public void test0733() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0733");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressJSerializer uniqueAddressJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.UniqueAddressJSerializer();
    int int1 = uniqueAddressJSerializer0.identifier();
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId gdbId3 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId(
        databaseId2);
    try {
      byte[] byteArray4 = uniqueAddressJSerializer0.toBinary((java.lang.Object) gdbId3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId cannot be cast to class akka.cluster.UniqueAddress (io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId and akka.cluster.UniqueAddress are in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1002 + "'", int1 == 1002);
  }

  @Test
  public void test0734() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0734");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormatSafeChannelMarshaler clusterMetaFormatSafeChannelMarshaler0 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormatSafeChannelMarshaler.IT;
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat3 = clusterMetaFormatSafeChannelMarshaler0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaFormatSafeChannelMarshaler0);
  }

  @Test
  public void test0735() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0735");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta sliceMeta3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta(
        "store_version");
    try {
      storeSyncCompletedCatchupAnswerManager0.onfihdForCoSl(storeSyncCompletedCompletableFuture1,
          sliceMeta3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0736() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0736");
    }
    try {
      io.github.onograph.RingQueue<io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder> askMessageTypeMessageToByteEncoderRingQueue1 = new io.github.onograph.RingQueue<io.github.onograph.cluster.raft.module.cuprot.AskMessageTypeMessageToByteEncoder>(
          (int) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  c8c9dd13-eaa7-4a94-ad2a-c92e7ba5c9ac");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0737() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0737");
    }
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType jobTerminationType0 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_ASYNC;
    org.junit.Assert.assertTrue("'" + jobTerminationType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_ASYNC
        + "'", jobTerminationType0.equals(
        io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_ASYNC));
  }

  @Test
  public void test0738() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0738");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSerializer gdbServerIdWrapperSerializer2 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.GdbServerIdWrapperSerializer();
    io.netty.channel.ChannelPromise channelPromise3 = null;
    try {
      messageDataTypeMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) gdbServerIdWrapperSerializer2, channelPromise3);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
  }

  @Test
  public void test0739() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0739");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef0 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType1 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef0.exeForE(messageDataType1);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService4 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    try {
      syncableDataDataManagerFactoryDecodingService4.channelActive(channelHandlerContext5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + messageDataType1 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType1.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
  }

  @Test
  public void test0740() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0740");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier1 = new io.github.onograph.config.NodeGroupIdentifier(
        "hi!");
    char char3 = nodeGroupIdentifier1.charAt(0);
    java.lang.String str4 = nodeGroupIdentifier1.toString();
    org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'h' + "'", char3 == 'h');
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test0741() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0741");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.LeaderMetaSafeChannelMarshal leaderMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.LeaderMetaSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager1 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readablePositionAwareChecksumChannelManager1.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.directory.LeaderMeta leaderMeta5 = leaderMetaSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(leaderMetaSafeChannelMarshal0);
  }

  @Test
  public void test0742() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0742");
    }
    io.github.onograph.config.NodeGroupIdentifier nodeGroupIdentifier1 = new io.github.onograph.config.NodeGroupIdentifier(
        "joiner");
  }

  @Test
  public void test0743() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0743");
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
    org.neo4j.storageengine.api.StorageCommand[] storageCommandArray13 = new org.neo4j.storageengine.api.StorageCommand[]{};
    java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand> storageCommandList14 = new java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.storageengine.api.StorageCommand>) storageCommandList14,
        storageCommandArray13);
    byte[] byteArray16 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList14);
    try {
      readablePositionAwareChecksumChannelManager10.get(byteArray16, (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(nodeGroupIdentifier4);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(storageCommandArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(byteArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
  }

  @Test
  public void test0744() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0744");
    }
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachException namedServiceApproachException1 = new io.github.onograph.cluster.raft.palapp.NamedServiceApproachException(
        "RelationshipType");
  }

  @Test
  public void test0745() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0745");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaByteToMessageDecoder requestMetaByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    requestMetaByteToMessageDecoder0.handlerRemoved(channelHandlerContext1);
  }

  @Test
  public void test0746() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0746");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder answerMessageTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting3 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingCletqmutDuration;
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction noComAction4 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction(
        0L, (java.lang.Object) durationSetting3);
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder transactionSyncReplyByteToMessageDecoder5 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder();
    boolean boolean6 = noComAction4.equals(
        (java.lang.Object) transactionSyncReplyByteToMessageDecoder5);
    io.netty.channel.ChannelPromise channelPromise7 = null;
    try {
      answerMessageTypeMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) noComAction4, channelPromise7);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertNotNull(durationSetting3);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0747() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0747");
    }
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder> transactionLogSyncManagerBuilderConsensusNodeFollowersMeta0 = new io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta<io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder>();
    java.lang.String str1 = transactionLogSyncManagerBuilderConsensusNodeFollowersMeta0.toString();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    org.neo4j.memory.MemoryTracker memoryTracker4 = null;
    org.neo4j.io.pagecache.PageCache pageCache5 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer6 = null;
    io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder transactionLogSyncManagerBuilder7 = new io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManagerBuilder(
        fileSystemAbstraction2, logProvider3, memoryTracker4, pageCache5, pageCacheTracer6);
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowerMeta consensusNodeFollowerMeta8 = transactionLogSyncManagerBuilderConsensusNodeFollowersMeta0.getConsensusNodeFollowerMeta(
        transactionLogSyncManagerBuilder7);
    org.neo4j.configuration.Config config9 = null;
    org.neo4j.monitoring.DatabaseHealth databaseHealth10 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout11 = null;
    org.neo4j.storageengine.api.StorageEngineFactory storageEngineFactory14 = null;
    org.neo4j.internal.helpers.collection.LongRange longRange15 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.TransactionLogSyncManager transactionLogSyncManager16 = transactionLogSyncManagerBuilder7.craTransactionLogSyncManager(
          config9, databaseHealth10, databaseLayout11, true, true, storageEngineFactory14,
          longRange15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FollowerStates{}" + "'", str1,
        "FollowerStates{}");
    org.junit.Assert.assertNotNull(consensusNodeFollowerMeta8);
  }

  @Test
  public void test0748() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0748");
    }
    java.util.concurrent.TimeUnit timeUnit2 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolder scHolder3 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder.unrrdtmScHolder(
        (long) 1002, (long) (short) 1, timeUnit2);
    org.junit.Assert.assertNotNull(scHolder3);
  }

  @Test
  public void test0749() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0749");
    }
    java.time.Clock clock0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.cluster.raft.share.NodeServerInfoLogService nodeServerInfoLogService5 = new io.github.onograph.cluster.raft.share.NodeServerInfoLogService(
        logProvider2, "temp-save", logProvider4);
    io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog inMemoryConsensusTransactionLog6 = new io.github.onograph.cluster.raft.share.calg.cle.InMemoryConsensusTransactionLog();
    long long9 = inMemoryConsensusTransactionLog6.pass((long) 0, (long) (short) -1);
    boolean boolean11 = inMemoryConsensusTransactionLog6.equals((java.lang.Object) "protocols");
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId12 = null;
    io.github.onograph.cluster.raft.share.meta.ActionProcessManager actionProcessManager13 = null;
    io.github.onograph.cluster.raft.share.CoreMeta coreMeta14 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.SnapshotDataManager snapshotDataManager15 = new io.github.onograph.cluster.raft.share.meta.SnapshotDataManager(
          clock0, consensusOperationsManager1,
          (org.neo4j.logging.internal.LogService) nodeServerInfoLogService5,
          (io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog) inMemoryConsensusTransactionLog6,
          namedDatabaseId12, actionProcessManager13, coreMeta14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0750() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0750");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting1 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingCletqmutDuration;
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction noComAction2 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.NoComAction(
        0L, (java.lang.Object) durationSetting1);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder sliceMetaByteToMessageDecoder3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
    sliceMetaByteToMessageDecoder3.handlerRemoved(channelHandlerContext4);
    boolean boolean6 = noComAction2.equals((java.lang.Object) sliceMetaByteToMessageDecoder3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
    io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType messageStackStatusType8 = io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OK;
    try {
      sliceMetaByteToMessageDecoder3.userEventTriggered(channelHandlerContext7,
          (java.lang.Object) messageStackStatusType8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(durationSetting1);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + messageStackStatusType8 + "' != '"
        + io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OK
        + "'", messageStackStatusType8.equals(
        io.github.onograph.cluster.raft.share.bulk.MessageStack.MessageStackStatusType.MSST_OK));
  }

  @Test
  public void test0751() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0751");
    }
    java.lang.Class<io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> catchupManagementMessageWrapperIncDatabaseIdClass0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef2 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.exhandlers.GdbMissingHandler<io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> catchupManagementMessageWrapperIncDatabaseIdGdbMissingHandler3 = new io.github.onograph.cluster.raft.module.cuprot.exhandlers.GdbMissingHandler<io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>(
          catchupManagementMessageWrapperIncDatabaseIdClass0, logProvider1, serverRef2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0752() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0752");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_STORE_GUID;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_STORE_GUID + "'",
        answerMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_STORE_GUID));
  }

  @Test
  public void test0753() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0753");
    }
    akka.actor.ActorRef actorRef0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode removeReadReplicaNode1 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.RemoveReadReplicaNode(
        actorRef0);
    akka.actor.ActorRef actorRef2 = removeReadReplicaNode1.getMccActorRef();
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder transactionChunkingCompletedMessageToByteEncoder3 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedMessageToByteEncoder();
    boolean boolean5 = transactionChunkingCompletedMessageToByteEncoder3.acceptOutboundMessage(
        (java.lang.Object) '#');
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl6 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    boolean boolean7 = transactionChunkingCompletedMessageToByteEncoder3.acceptOutboundMessage(
        (java.lang.Object) clusteringBalancerServiceImpl6);
    boolean boolean8 = removeReadReplicaNode1.equals((java.lang.Object) boolean7);
    org.junit.Assert.assertNull(actorRef2);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0754() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0754");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.StartOverIfSingleNotResponding startOverIfSingleNotResponding0 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.StartOverIfSingleNotResponding();
    akka.cluster.Cluster cluster1 = null;
    try {
      boolean boolean2 = startOverIfSingleNotResponding0.isRerruForCl(cluster1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0755() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0755");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> serverIdMap1 = null;
    io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta readReplicateGdbMeta2 = io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(
        databaseId0, serverIdMap1);
    org.neo4j.kernel.database.DatabaseId databaseId3 = readReplicateGdbMeta2.getDatabaseId();
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> serverIdMap4 = readReplicateGdbMeta2.getMapMssd();
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> serverIdMap5 = readReplicateGdbMeta2.getMapMssd();
    org.junit.Assert.assertNotNull(readReplicateGdbMeta2);
    org.junit.Assert.assertNull(databaseId3);
    org.junit.Assert.assertNull(serverIdMap4);
    org.junit.Assert.assertNull(serverIdMap5);
  }

  @Test
  public void test0756() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0756");
    }
    io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach readReplicaNodeNamedServiceClusterApproach1 = new io.github.onograph.cluster.raft.palapp.strategies.ReadReplicaNodeNamedServiceClusterApproach(
        (int) 'a');
    readReplicaNodeNamedServiceClusterApproach1.setup();
  }

  @Test
  public void test0757() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0757");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager0);
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager2 = dataSyncRunnerStatsManagerDataManagerFactory1.bul();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext3 = dataSyncRunnerStatsManager2.securityContext;
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory1);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManager2);
    org.junit.Assert.assertNull(securityContext3);
  }

  @Test
  public void test0758() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0758");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel1 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = defaultWritableChecksumChannel1.putDouble(
          (double) 52L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0759() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0759");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler catchupIncomingTransactionReplySimpleChannelInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler4 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl5 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler storeSyncCompletedSimpleChannelInboundHandler6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler(
        catchupAnswerLimitHandler4, refCatchupManagerImpl5);
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType7 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.F_HDR_VAL;
    boolean boolean8 = refCatchupManagerImpl5.isExcnForE(catchupManagerStatusType7);
    try {
      catchupIncomingTransactionReplySimpleChannelInboundHandler2.channelRead(
          channelHandlerContext3, (java.lang.Object) refCatchupManagerImpl5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType7 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.F_HDR_VAL
        + "'", catchupManagerStatusType7.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.F_HDR_VAL));
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0760() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0760");
    }
    java.security.SecureRandom secureRandom1 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.KeyStorePassword keyStorePassword2 = new io.github.onograph.cluster.raft.module.dprot.KeyStorePassword(
          13, secureRandom1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0761() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0761");
    }
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation0 = null;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync3 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation0, databaseId1, (long) (short) 0);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor syncableDataProcessor4 = null;
    try {
      abstractTransactionSync3.dipcForSy(syncableDataProcessor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0762() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0762");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormatSafeChannelMarshaler clusterMetaFormatSafeChannelMarshaler0 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormatSafeChannelMarshaler.IT;
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat1 = clusterMetaFormatSafeChannelMarshaler0.startState();
    org.junit.Assert.assertNotNull(clusterMetaFormatSafeChannelMarshaler0);
    org.junit.Assert.assertNull(clusterMetaFormat1);
  }

  @Test
  public void test0763() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0763");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SocketAddressController socketAddressController0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SocketAddressController();
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    try {
      socketAddressController0.reeeForSo(socketAddress1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0764() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0764");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade1 = null;
    org.neo4j.logging.Log log2 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo4 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path3);
    java.nio.file.Path path5 = clusterMetaTopologyInfo4.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat6 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction0, clusterSimpleStorageFacade1, log2, clusterMetaTopologyInfo4,
        clusterMetaFormat6);
    try {
      java.nio.file.Path path9 = clusterMetaTopologyInfo4.qunmrsefPath("cc-discovery-actor-system");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo4);
    org.junit.Assert.assertNull(path5);
  }

  @Test
  public void test0765() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0765");
    }
    io.github.onograph.config.NodeGroupIdentifierSetSupplier nodeGroupIdentifierSetSupplier0 = null;
    io.github.onograph.config.NodeGroupIdentifierSetSupplier.EMT_NODE_GROUP_IDENTIFIER_SET_SUPPLIER = nodeGroupIdentifierSetSupplier0;
  }

  @Test
  public void test0766() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0766");
    }
    io.github.onograph.cluster.raft.palapp.strategies.CoreFocusedNamedServiceClusterApproach coreFocusedNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.CoreFocusedNamedServiceClusterApproach();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Collection<org.neo4j.dbms.identity.ServerId> serverIdCollection2 = coreFocusedNamedServiceClusterApproach0.upesrfdteCollection(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0767() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0767");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.monitoring.Monitors monitors1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService consensusLogCacheService2 = io.github.onograph.config.ConsensusLogCacheServiceBuilder.craConsensusLogCacheService(
          config0, monitors1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0768() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0768");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    try {
      io.github.onograph.dbms.SystemDbOnlyGdbReplicator systemDbOnlyGdbReplicator1 = new io.github.onograph.dbms.SystemDbOnlyGdbReplicator(
          logProvider0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0769() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0769");
    }
    io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting clusterLoadBalancingServerPoliciesGroupSetting1 = io.github.onograph.cluster.raft.share.ClusterLoadBalancingServerPoliciesGroupSetting.gruClusterLoadBalancingServerPoliciesGroupSetting(
        "catchup_protocol");
    org.neo4j.graphdb.config.Setting<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta>> loadBalanceServerMetaRuleProcessorSetting2 = clusterLoadBalancingServerPoliciesGroupSetting1.val;
    org.neo4j.graphdb.config.Setting<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta>> loadBalanceServerMetaRuleProcessorSetting3 = clusterLoadBalancingServerPoliciesGroupSetting1.val;
    java.lang.String str4 = clusterLoadBalancingServerPoliciesGroupSetting1.getPrefix();
    org.neo4j.graphdb.config.Setting<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta>> loadBalanceServerMetaRuleProcessorSetting5 = clusterLoadBalancingServerPoliciesGroupSetting1.val;
    org.neo4j.graphdb.config.Setting<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.gateway.gwlb.mods.LoadBalanceServerMeta>> loadBalanceServerMetaRuleProcessorSetting6 = clusterLoadBalancingServerPoliciesGroupSetting1.val;
    org.junit.Assert.assertNotNull(clusterLoadBalancingServerPoliciesGroupSetting1);
    org.junit.Assert.assertNotNull(loadBalanceServerMetaRuleProcessorSetting2);
    org.junit.Assert.assertNotNull(loadBalanceServerMetaRuleProcessorSetting3);
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "causal_clustering.load_balancing.config.server_policies" + "'",
        str4, "causal_clustering.load_balancing.config.server_policies");
    org.junit.Assert.assertNotNull(loadBalanceServerMetaRuleProcessorSetting5);
    org.junit.Assert.assertNotNull(loadBalanceServerMetaRuleProcessorSetting6);
  }

  @Test
  public void test0770() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0770");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException2 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.api.DatabaseManagementException databaseManagementException3 = org.neo4j.dbms.api.DatabaseManagementException.wrap(
        (java.lang.Throwable) clusterDatabaseManagementException2);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Exception) clusterDatabaseManagementException2, "protocols");
    org.neo4j.dbms.OperatorState operatorState6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper7 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId0, (java.lang.Throwable) gdbStoreSyncCrlException5, operatorState6);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException8 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Throwable) gdbStoreSyncCrlException5);
    org.junit.Assert.assertNotNull(databaseManagementException3);
  }

  @Test
  public void test0771() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0771");
    }
    byte[] byteArray1 = new byte[]{(byte) 9};
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType4 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData5 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData(
        byteArray1, databaseId2, "name", replicaTokenType4);
    org.neo4j.kernel.database.DatabaseId databaseId6 = requestData5.daasidDatabaseId();
    io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor autoCloseableActionProcessor7 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer8 = null;
    try {
      requestData5.dipcForSy(autoCloseableActionProcessor7, fSMDataConsumer8, (long) 'h');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[9]");
    org.junit.Assert.assertNull(databaseId6);
  }

  @Test
  public void test0772() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0772");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsByteToMessageDecoder requestAllGdbIdsByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsByteToMessageDecoder();
  }

  @Test
  public void test0773() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0773");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onStop(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0774() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0774");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker3 = null;
    org.neo4j.internal.id.IdGeneratorFactory idGeneratorFactory4 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer6 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator7 = null;
    java.util.function.Supplier<org.neo4j.storageengine.api.StorageEngine> storageEngineSupplier8 = null;
    org.neo4j.token.TokenRegistry tokenRegistry9 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder relationshipTypeTokenHolder10 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RelationshipTypeTokenHolder(
        databaseReadOnlyChecker3, idGeneratorFactory4, namedDatabaseId5, pageCacheTracer6,
        syncerator7, storageEngineSupplier8, tokenRegistry9);
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture11 = nettyChannelImpl2.wrtFuture(
          (java.lang.Object) relationshipTypeTokenHolder10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0775() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0775");
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
  public void test0776() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0776");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaSafeChannelMarshal nodeServerMemberLeaderMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.NodeServerMemberLeaderMetaSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta1 = io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META;
    boolean boolean2 = nodeServerMemberLeaderMeta1.getIsDsi();
    org.neo4j.io.fs.WritableChannel writableChannel3 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl4 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel3);
    try {
      nodeServerMemberLeaderMetaSafeChannelMarshal0.marshal(nodeServerMemberLeaderMeta1,
          writableChannel3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMeta1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0777() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0777");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl3 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean2);
    io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction dataSyncClusterAction4 = null;
    java.lang.Exception exception5 = null;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData6 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        exception5);
    try {
      syncStatusMetaServiceImpl3.trcrelForDaFS(dataSyncClusterAction4, fSMData6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(fSMData6);
  }

  @Test
  public void test0778() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0778");
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
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType6 = askMessageTypeElementQueueRunnerImpl0.poll();
    org.junit.Assert.assertTrue("'" + askMessageType1 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC + "'",
        askMessageType1.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_SET_SC));
    org.junit.Assert.assertNotNull(askMessageTypeArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNull(askMessageType6);
  }

  @Test
  public void test0779() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0779");
    }
    io.github.onograph.config.ConsensusLogCacheStrategyType consensusLogCacheStrategyType0 = io.github.onograph.config.ConsensusLogCacheStrategyType.ST_UNLMT;
    org.junit.Assert.assertNotNull(consensusLogCacheStrategyType0);
  }

  @Test
  public void test0780() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0780");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings<? extends io.netty.channel.socket.ServerSocketChannel> wildcardNettyChannelClusterSettings1 = io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings.sevcfNettyChannelClusterSettings(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0781() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0781");
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
    metaByteToMessageDecoder15.setSingleDecode(false);
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
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType7 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType7.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(cumulator11);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertNotNull(cumulator16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test0782() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0782");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply12 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
        consensusNodeId9, true, (long) 128);
    try {
      java.lang.Void void13 = processorImpl2.process(reply12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void4);
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
  }

  @Test
  public void test0783() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0783");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg(
        consensusNodeId0);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel2 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl3 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl4 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel2, safeStateMarshalImpl3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk5 = null;
    java.lang.Void void6 = processorImpl4.process(bulkAsk5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage7 = null;
    java.lang.Void void8 = processorImpl4.process(logClipRequestMessage7);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage9 = null;
    java.lang.Void void10 = processorImpl4.process(aliveReplyMessage9);
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl11 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply12 = null;
    java.lang.Boolean boolean13 = messageProcessorImpl11.process(reply12);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel14 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl15 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl16 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel14, safeStateMarshalImpl15);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk17 = null;
    java.lang.Void void18 = processorImpl16.process(bulkAsk17);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage19 = null;
    java.lang.Void void20 = processorImpl16.process(logClipRequestMessage19);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage21 = null;
    java.lang.Void void22 = processorImpl16.process(aliveReplyMessage21);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId23 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout24 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
        consensusNodeId23);
    java.lang.Void void25 = processorImpl16.process(consensusElectionTimeout24);
    java.lang.Boolean boolean26 = messageProcessorImpl11.process(consensusElectionTimeout24);
    java.lang.Void void27 = processorImpl4.process(consensusElectionTimeout24);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk28 = null;
    java.lang.Void void29 = processorImpl4.process(bulkAsk28);
    java.lang.Void void30 = aliveMsg1.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl4);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId31 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage aliveNoReplyMessage35 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage(
        consensusNodeId31, (long) 10, (long) 'a', (long) (byte) 10);
    try {
      java.lang.Void void36 = processorImpl4.process(aliveNoReplyMessage35);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNull(void10);
    org.junit.Assert.assertNotNull(messageProcessorImpl11);
    org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    org.junit.Assert.assertNull(void18);
    org.junit.Assert.assertNull(void20);
    org.junit.Assert.assertNull(void22);
    org.junit.Assert.assertNull(void25);
    org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
    org.junit.Assert.assertNull(void27);
    org.junit.Assert.assertNull(void29);
    org.junit.Assert.assertNull(void30);
  }

  @Test
  public void test0784() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0784");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingMieaibmroiInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0785() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0785");
    }
    java.time.Clock clock0 = null;
    org.neo4j.logging.internal.LogService logService1 = null;
    io.github.onograph.cluster.raft.share.NodeServerInfoLogService nodeServerInfoLogService3 = new io.github.onograph.cluster.raft.share.NodeServerInfoLogService(
        logService1, "hi!");
    java.lang.String str4 = nodeServerInfoLogService3.getStrNs();
    org.neo4j.monitoring.Monitors monitors5 = null;
    try {
      io.github.onograph.cluster.raft.watch.ConsensusServiceWatcherRAFTImpl.reieForLoMoCl(clock0,
          (org.neo4j.logging.internal.LogService) nodeServerInfoLogService3, monitors5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test0786() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0786");
    }
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation0 = null;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync3 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation0, databaseId1, (long) (short) 0);
    io.netty.buffer.ByteBuf byteBuf4 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel5 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf4);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ClonedTxLogMarshaller.maslForWrAb(
          abstractTransactionSync3,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0787() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0787");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry5 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray6 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry5};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction7 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray6);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction8 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 100, 1536L, consensusLogEntryArray6);
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction11 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray6, (long) (byte) 0, (int) (short) 1);
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl12 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry13 = null;
    consensusLogCacheServiceNoopImpl12.putForCo(consensusLogEntry13, (long) '#');
    long long16 = consensusLogCacheServiceNoopImpl12.toabys();
    org.neo4j.logging.Log log17 = null;
    bulkAddAction11.apltoForCoLo(
        (io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheService) consensusLogCacheServiceNoopImpl12,
        log17);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray19 = bulkAddAction11.enrsConsensusLogEntryArray;
    io.github.onograph.cluster.raft.module.cuprot.RefException refException20 = new io.github.onograph.cluster.raft.module.cuprot.RefException(
        "server_policies", (java.lang.Object[]) consensusLogEntryArray19);
    org.junit.Assert.assertNotNull(consensusLogEntryArray6);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    org.junit.Assert.assertNotNull(consensusLogEntryArray19);
  }

  @Test
  public void test0788() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0788");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    boolean boolean3 = nettyChannelImpl2.isChannelDis();
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler4 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler5 = null;
    org.neo4j.logging.Log log6 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler7 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler8 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl9 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler10 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler8, refCatchupManagerImpl9);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler11 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler7, refCatchupManagerImpl9);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler12 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler5, log6, refCatchupManagerImpl9);
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler catchupIncomingTransactionReplySimpleChannelInboundHandler13 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler(
        catchupAnswerLimitHandler4, refCatchupManagerImpl9);
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture14 = nettyChannelImpl2.wrtFuture(
          (java.lang.Object) refCatchupManagerImpl9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0789() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0789");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin1 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    org.neo4j.values.virtual.MapValue mapValue3 = null;
    try {
      org.neo4j.procedure.builtin.routing.RoutingResult routingResult4 = serverPoliciesPlugin1.runRoutingResult(
          namedDatabaseId2, mapValue3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0790() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0790");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = null;
    java.lang.Boolean boolean2 = messageProcessorImpl0.process(aliveMsg1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RequestTransactionLogCZMetaMessage requestTransactionLogCZMetaMessage3 = null;
    java.lang.Boolean boolean4 = messageProcessorImpl0.process(requestTransactionLogCZMetaMessage3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg5 = null;
    java.lang.Boolean boolean6 = messageProcessorImpl0.process(aliveMsg5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted7 = null;
    java.lang.Boolean boolean8 = messageProcessorImpl0.process(leaderNotAccepted7);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
  }

  @Test
  public void test0791() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0791");
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
      readReplicateGdbMetaSafeChannelMarshal0.marshal(readReplicateGdbMeta3, writableChannel5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(readReplicateGdbMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(readReplicateGdbMeta3);
    org.junit.Assert.assertNull(databaseId4);
  }

  @Test
  public void test0792() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0792");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply3 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
        consensusNodeId0, true, (long) 128);
    boolean boolean4 = reply3.getIsGv();
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test0793() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0793");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager0);
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager2 = dataSyncRunnerStatsManagerDataManagerFactory1.bul();
    org.neo4j.logging.Log log3 = dataSyncRunnerStatsManager2.log;
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory1);
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManager2);
    org.junit.Assert.assertNull(log3);
  }

  @Test
  public void test0794() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0794");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType0 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR;
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR
        + "'", setupGdbSyncReplyStateType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
  }

  @Test
  public void test0795() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0795");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType0 = io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_SAME_ERR;
    org.junit.Assert.assertTrue("'" + catchupStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_SAME_ERR
        + "'", catchupStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType.CST_STORE_NOT_SAME_ERR));
  }

  @Test
  public void test0796() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0796");
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
  public void test0797() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0797");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker4 = null;
    try {
      org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker5 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition(
          logPositionMarker4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
  }

  @Test
  public void test0798() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0798");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler storeSyncCompletedSimpleChannelInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdByteToMessageDecoder requestGdbIdByteToMessageDecoder3 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdByteToMessageDecoder();
    boolean boolean4 = storeSyncCompletedSimpleChannelInboundHandler2.acceptInboundMessage(
        (java.lang.Object) requestGdbIdByteToMessageDecoder3);
    requestGdbIdByteToMessageDecoder3.setSingleDecode(true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0799() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0799");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService syncableDataEncodingService0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder departingMessageManagerMessageToMessageEncoder1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder(
        syncableDataEncodingService0);
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException4 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState5 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper6 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId2, (java.lang.Throwable) clusterDatabaseManagementException4, operatorState5);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta7 = io.github.onograph.cluster.raft.share.sync.SyncMeta.marcSyncMeta(
        (java.lang.Throwable) clusterDatabaseManagementException4);
    boolean boolean8 = departingMessageManagerMessageToMessageEncoder1.acceptOutboundMessage(
        (java.lang.Object) syncMeta7);
    org.junit.Assert.assertNotNull(syncMeta7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0800() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0800");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.CoreGDMCWSafeChannelMarshal coreGDMCWSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.CoreGDMCWSafeChannelMarshal.IT;
    org.junit.Assert.assertNotNull(coreGDMCWSafeChannelMarshal0);
  }

  @Test
  public void test0801() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0801");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver3 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    livingCacheObserver3.sememt((int) 'a');
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl6 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        32, false, (long) 13, livingCacheObserver3);
    livingCacheObserver3.setabys(0L);
    org.junit.Assert.assertNotNull(livingCacheObserver3);
  }

  @Test
  public void test0802() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0802");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg(
        consensusNodeId0);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel2 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl3 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl4 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel2, safeStateMarshalImpl3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk5 = null;
    java.lang.Void void6 = processorImpl4.process(bulkAsk5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage7 = null;
    java.lang.Void void8 = processorImpl4.process(logClipRequestMessage7);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage9 = null;
    java.lang.Void void10 = processorImpl4.process(aliveReplyMessage9);
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl11 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply12 = null;
    java.lang.Boolean boolean13 = messageProcessorImpl11.process(reply12);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel14 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl15 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl16 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel14, safeStateMarshalImpl15);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk17 = null;
    java.lang.Void void18 = processorImpl16.process(bulkAsk17);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage19 = null;
    java.lang.Void void20 = processorImpl16.process(logClipRequestMessage19);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveReplyMessage aliveReplyMessage21 = null;
    java.lang.Void void22 = processorImpl16.process(aliveReplyMessage21);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId23 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout consensusElectionTimeout24 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.ConsensusElectionTimeout(
        consensusNodeId23);
    java.lang.Void void25 = processorImpl16.process(consensusElectionTimeout24);
    java.lang.Boolean boolean26 = messageProcessorImpl11.process(consensusElectionTimeout24);
    java.lang.Void void27 = processorImpl4.process(consensusElectionTimeout24);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk28 = null;
    java.lang.Void void29 = processorImpl4.process(bulkAsk28);
    java.lang.Void void30 = aliveMsg1.dipc(
        (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl4);
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId31 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply reply34 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.CandidateVoteMessage.Reply(
        consensusNodeId31, true, (long) 128);
    try {
      java.lang.Void void35 = processorImpl4.process(reply34);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void6);
    org.junit.Assert.assertNull(void8);
    org.junit.Assert.assertNull(void10);
    org.junit.Assert.assertNotNull(messageProcessorImpl11);
    org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    org.junit.Assert.assertNull(void18);
    org.junit.Assert.assertNull(void20);
    org.junit.Assert.assertNull(void22);
    org.junit.Assert.assertNull(void25);
    org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
    org.junit.Assert.assertNull(void27);
    org.junit.Assert.assertNull(void29);
    org.junit.Assert.assertNull(void30);
  }

  @Test
  public void test0803() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0803");
    }
    io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service.Spec.PortInfo portInfo0 = new io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service.Spec.PortInfo();
    java.lang.String str1 = portInfo0.name();
    org.junit.Assert.assertNull(str1);
  }

  @Test
  public void test0804() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0804");
    }
    org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation0 = null;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync abstractTransactionSync3 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync(
        physicalTransactionRepresentation0, databaseId1, (long) (short) 0);
    org.neo4j.io.fs.WritableChannel writableChannel4 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl5 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel4);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper.maslForWrAb(
          abstractTransactionSync3, (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0805() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0805");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager> dataSyncRunnerStatsManagerDataManagerFactory1 = io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory.fiieDataManagerFactory(
        dataSyncRunnerStatsManager0);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext2 = dataSyncRunnerStatsManager0.securityContext;
    org.neo4j.dbms.database.DatabaseManager<?> wildcardDatabaseManager3 = dataSyncRunnerStatsManager0.databaseManagerDaamnObject;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = dataSyncRunnerStatsManager0.securityContext;
    org.junit.Assert.assertNotNull(dataSyncRunnerStatsManagerDataManagerFactory1);
    org.junit.Assert.assertNull(securityContext2);
    org.junit.Assert.assertNull(wildcardDatabaseManager3);
    org.junit.Assert.assertNull(securityContext4);
  }

  @Test
  public void test0806() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0806");
    }
    io.github.onograph.cluster.raft.share.CommandReaderFactoryProvider commandReaderFactoryProvider0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef1 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType2 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef1.exeForE(messageDataType2);
    io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder consensusByteToMessageDecoder4 = new io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder(
        commandReaderFactoryProvider0,
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef1);
    org.junit.Assert.assertTrue("'" + messageDataType2 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType2.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
  }

  @Test
  public void test0807() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0807");
    }
    io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager discoveryRetryManager2 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager(
        (long) (byte) 9, (long) (short) 100);
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
  public void test0808() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0808");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage aliveNoReplyMessage4 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.AliveNoReplyMessage(
        consensusNodeId0, (long) 10, (long) 'a', (long) (byte) 10);
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel5 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl6 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl processorImpl7 = new io.github.onograph.cluster.raft.akkamsg.serialization.current.encoding.CurrentDepartingMessageManagerMessageToByteEncoder.ProcessorImpl(
        defaultWritableChecksumChannel5, safeStateMarshalImpl6);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk8 = null;
    java.lang.Void void9 = processorImpl7.process(bulkAsk8);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.MsgCreatorService.BulkAsk bulkAsk10 = null;
    java.lang.Void void11 = processorImpl7.process(bulkAsk10);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LogClipRequestMessage logClipRequestMessage12 = null;
    java.lang.Void void13 = processorImpl7.process(logClipRequestMessage12);
    try {
      java.lang.Void void14 = aliveNoReplyMessage4.dipc(
          (io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Processor<java.lang.Void, java.lang.Exception>) processorImpl7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(void9);
    org.junit.Assert.assertNull(void11);
    org.junit.Assert.assertNull(void13);
  }

  @Test
  public void test0809() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0809");
    }
    akka.actor.ExtendedActorSystem extendedActorSystem0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument joinClusterRemoteInstrument1 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.JoinClusterRemoteInstrument(
        extendedActorSystem0);
    byte byte2 = joinClusterRemoteInstrument1.identifier();
    byte byte3 = joinClusterRemoteInstrument1.identifier();
    System.out.println(" Test: identifier: " + joinClusterRemoteInstrument1.identifier());
    org.junit.Assert.assertTrue(
        "'" + byte2 + "' == '" + (byte) joinClusterRemoteInstrument1.identifier() + "'",
        byte2 != (byte) 8);
    org.junit.Assert.assertTrue(
        "'" + byte3 + "' == '" + (byte) joinClusterRemoteInstrument1.identifier() + "'",
        byte3 != (byte) 8);
  }

  @Test
  public void test0810() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0810");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask22 = null;
    try {
      java.lang.Void void23 = processorImpl16.process(ask22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
    org.junit.Assert.assertNotNull(props9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(void18);
    org.junit.Assert.assertNull(void20);
    org.junit.Assert.assertNull(void21);
  }

  @Test
  public void test0811() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0811");
    }
    java.util.UUID uUID0 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeId1);
  }

  @Test
  public void test0812() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0812");
    }
    java.util.Comparator<org.neo4j.configuration.helpers.SocketAddress> socketAddressComparator0 = io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceDiscoveryKickoffImpl.adtstaecmtComparator();
    org.junit.Assert.assertNotNull(socketAddressComparator0);
  }

  @Test
  public void test0813() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0813");
    }
    io.github.onograph.cluster.raft.control.connect.HandshakeEventHandler handshakeEventHandler0 = io.github.onograph.cluster.raft.control.connect.HandshakeEventHandler.NOO_HANDSHAKE_EVENT_HANDLER;
    io.netty.channel.socket.SocketChannel socketChannel1 = null;
    handshakeEventHandler0.onnehaskForSo(socketChannel1);
    org.junit.Assert.assertNotNull(handshakeEventHandler0);
  }

  @Test
  public void test0814() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0814");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.info.Meta meta4 = io.github.onograph.cluster.raft.module.cuprot.current.info.Meta.craMeta(
        (long) 1536, "cc-core-restart-needed-listener-timer");
    long long5 = meta4.getLgIr();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType raftConsensusMessageType6 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_ANS;
    boolean boolean7 = meta4.equals((java.lang.Object) raftConsensusMessageType6);
    try {
      storeSyncCompletedCatchupAnswerManager0.oninForCoMe(storeSyncCompletedCompletableFuture1,
          meta4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(meta4);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1536L + "'", long5 == 1536L);
    org.junit.Assert.assertTrue("'" + raftConsensusMessageType6 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_ANS
        + "'", raftConsensusMessageType6.equals(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.MTYPE_CONS_VOTE_ANS));
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0815() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0815");
    }
    io.github.onograph.cluster.raft.module.cuprot.IncomingEventService incomingEventService0 = io.github.onograph.cluster.raft.module.cuprot.IncomingEventService.NOO_INCOMING_EVENT_SERVICE;
    io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper abstractCatchupManagementMessageWrapper1 = null;
    java.net.SocketAddress socketAddress2 = null;
    incomingEventService0.onccpromsForSoAb(abstractCatchupManagementMessageWrapper1,
        socketAddress2);
    org.junit.Assert.assertNotNull(incomingEventService0);
  }

  @Test
  public void test0816() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0816");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingRadimDuration;
    io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingAkcyrraaDuration = durationSetting0;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0817() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0817");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply reply5 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.TransactionLogAddMessage.Reply(
        consensusNodeId0, false, (long) (-1), (long) '#', (long) 0);
    long long6 = reply5.getLgT();
    long long7 = reply5.getLgT();
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
  }

  @Test
  public void test0818() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0818");
    }
    org.neo4j.configuration.Config config0 = null;
    io.github.onograph.cluster.raft.id.CoreNodeServerIdentity coreNodeServerIdentity1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager actorStackManager2 = null;
    org.neo4j.logging.LogProvider logProvider3 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager discoveryRetryManager7 = new io.github.onograph.cluster.raft.module.dprot.DiscoveryRetryManager(
        (long) (byte) 9, (long) (short) 100);
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry akkaActorSystemRetry9 = io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.fottAkkaActorSystemRetry(
        128);
    io.github.onograph.cluster.raft.id.CoreNodeServerIdentity coreNodeServerIdentity10 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService pointInTimeBackupService11 = io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl.cosnoftPointInTimeBackupService(
        coreNodeServerIdentity10);
    org.neo4j.scheduler.JobScheduler jobScheduler12 = null;
    java.time.Clock clock13 = null;
    org.neo4j.monitoring.Monitors monitors14 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService15 = null;
    io.github.onograph.dbms.crash.CrashSignaler crashSignaler16 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.AkkaCoreClusterStructureService akkaCoreClusterStructureService17 = new io.github.onograph.cluster.raft.module.dprot.impl.AkkaCoreClusterStructureService(
          config0, coreNodeServerIdentity1, actorStackManager2, logProvider3, logProvider4,
          discoveryRetryManager7, akkaActorSystemRetry9, pointInTimeBackupService11, jobScheduler12,
          clock13, monitors14, databaseStateService15, crashSignaler16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(akkaActorSystemRetry9);
    org.junit.Assert.assertNotNull(pointInTimeBackupService11);
  }

  @Test
  public void test0819() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0819");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager0);
    try {
      double double2 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getDouble();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0820() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0820");
    }
    io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder serverMessageToByteEncoder0 = new io.github.onograph.cluster.raft.control.connect.ServerMessageToByteEncoder();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder requestStoreDatabaseIdMessageToByteEncoder1 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder();
    io.github.onograph.cluster.raft.control.connect.HandshakeStateType handshakeStateType2 = io.github.onograph.cluster.raft.control.connect.HandshakeStateType.IN_PROCESS;
    boolean boolean3 = requestStoreDatabaseIdMessageToByteEncoder1.acceptOutboundMessage(
        (java.lang.Object) handshakeStateType2);
    boolean boolean4 = serverMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) requestStoreDatabaseIdMessageToByteEncoder1);
    org.junit.Assert.assertTrue("'" + handshakeStateType2 + "' != '"
            + io.github.onograph.cluster.raft.control.connect.HandshakeStateType.IN_PROCESS + "'",
        handshakeStateType2.equals(
            io.github.onograph.cluster.raft.control.connect.HandshakeStateType.IN_PROCESS));
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0821() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0821");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler gdbIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbIdInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType3 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_ASK;
    boolean boolean4 = gdbIdInboundHandler2.acceptInboundMessage(
        (java.lang.Object) askMessageType3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    org.neo4j.kernel.database.DatabaseId databaseId6 = null;
    io.github.onograph.dbms.ClusterDatabaseManagementException clusterDatabaseManagementException8 = new io.github.onograph.dbms.ClusterDatabaseManagementException(
        "store_version");
    org.neo4j.dbms.OperatorState operatorState9 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper10 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId6, (java.lang.Throwable) clusterDatabaseManagementException8, operatorState9);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta11 = io.github.onograph.cluster.raft.share.sync.SyncMeta.marcSyncMeta(
        (java.lang.Throwable) clusterDatabaseManagementException8);
    java.lang.Throwable throwable12 = syncMeta11.getFiueThrowable();
    io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException nodeNotFoundException13 = new io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException(
        throwable12);
    try {
      gdbIdInboundHandler2.channelRead(channelHandlerContext5,
          (java.lang.Object) nodeNotFoundException13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + askMessageType3 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_ASK + "'",
        askMessageType3.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_ASK));
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(syncMeta11);
    org.junit.Assert.assertNotNull(throwable12);
    org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "store_version");
    org.junit.Assert.assertEquals(throwable12.getMessage(), "store_version");
    org.junit.Assert.assertEquals(throwable12.toString(),
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version");
  }

  @Test
  public void test0822() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0822");
    }
    io.github.onograph.cluster.raft.control.connect.HandshakeClientMessageProcessorDefaultImpl handshakeClientMessageProcessorDefaultImpl0 = null;
    io.github.onograph.cluster.raft.control.connect.ClientHandshakeSimpleChannelInboundHandler clientHandshakeSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.control.connect.ClientHandshakeSimpleChannelInboundHandler(
        handshakeClientMessageProcessorDefaultImpl0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    java.util.concurrent.TimeUnit timeUnit4 = null;
    io.github.onograph.cluster.raft.share.calg.scholder.ScHolder scHolder5 = io.github.onograph.cluster.raft.share.calg.scholder.ScHolderBuilder.fietioScHolder(
        (long) (short) 0, timeUnit4);
    try {
      clientHandshakeSimpleChannelInboundHandler1.channelRead(channelHandlerContext2,
          (java.lang.Object) scHolder5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(scHolder5);
  }

  @Test
  public void test0823() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0823");
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
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta7 = clusterMetaInfoReply6.getRrSyncMeta();
    java.util.List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> infoReplyMessageList8 = clusterMetaInfoReply6.getListRsossInfoReplyMessage();
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta9 = clusterMetaInfoReply6.getRrSyncMeta();
    org.junit.Assert.assertNotNull(infoReplyMessageArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(fSMData4);
    org.junit.Assert.assertNotNull(syncMeta5);
    org.junit.Assert.assertNotNull(syncMeta7);
    org.junit.Assert.assertNotNull(infoReplyMessageList8);
    org.junit.Assert.assertNotNull(syncMeta9);
  }

  @Test
  public void test0824() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0824");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef0 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType1 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef0.exeForE(messageDataType1);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService4 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef5 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType6 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef5.exeForE(messageDataType6);
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef8 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType9 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef8.exeForE(messageDataType9);
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef11 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType12 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef11.exeForE(messageDataType12);
    boolean boolean14 = contentTypeRef8.isExcnForE(messageDataType12);
    boolean boolean15 = contentTypeRef5.isExcnForE(messageDataType12);
    boolean boolean16 = contentTypeRef0.isExcnForE(messageDataType12);
    org.junit.Assert.assertTrue("'" + messageDataType1 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType1.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
    org.junit.Assert.assertTrue("'" + messageDataType6 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType6.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
    org.junit.Assert.assertTrue("'" + messageDataType9 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType9.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
    org.junit.Assert.assertTrue("'" + messageDataType12 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType12.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test0825() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0825");
    }
    io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType nodeElectionTimeTrackerType0 = io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_CON_ELECT_INPROCESS;
    org.junit.Assert.assertTrue("'" + nodeElectionTimeTrackerType0 + "' != '"
        + io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_CON_ELECT_INPROCESS
        + "'", nodeElectionTimeTrackerType0.equals(
        io.github.onograph.cluster.raft.share.calg.NodeElectionTimeTrackerType.TTT_CON_ELECT_INPROCESS));
  }

  @Test
  public void test0826() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0826");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingKunasSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test0827() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0827");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.putShort(
          (short) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0828() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0828");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.info.Meta meta4 = io.github.onograph.cluster.raft.module.cuprot.current.info.Meta.craMeta(
        (long) 1536, "cc-core-restart-needed-listener-timer");
    try {
      storeSyncCompletedCatchupAnswerManager0.oninForCoMe(storeSyncCompletedCompletableFuture1,
          meta4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(meta4);
  }

  @Test
  public void test0829() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0829");
    }
    io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType answerMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_ALL_GDB_GUID_ANSWER;
    org.junit.Assert.assertTrue("'" + answerMessageType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_ALL_GDB_GUID_ANSWER
        + "'", answerMessageType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType.AMT_ALL_GDB_GUID_ANSWER));
  }

  @Test
  public void test0830() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0830");
    }
    io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS.IT;
    io.github.onograph.dbms.WatchTag watchTag1 = null;
    org.neo4j.io.fs.WritableChannel writableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl3 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel2);
    try {
      marshalChannelImplCMS0.marshal(watchTag1,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
  }

  @Test
  public void test0831() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0831");
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
    org.neo4j.kernel.lifecycle.LifeSupport lifeSupport35 = null;
    try {
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta> replicationSessionManagerMetaStateStorage36 = clusterSimpleStorageFacade9.cresitasgStateStorage(
          databaseLogProvider33, "storage_engine", lifeSupport35);
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
  public void test0832() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0832");
    }
    io.github.onograph.RingQueue<io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta> syncedLeaderMetaRingQueue1 = new io.github.onograph.RingQueue<io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta>(
        (int) (short) 1);
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
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta12 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta13 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta12);
    akka.cluster.ddata.ReplicatedData replicatedData14 = syncedLeaderMeta11.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta13);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta15 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta16 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta15);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta17 = syncedLeaderMeta13.mergeData(
        syncedLeaderMeta16);
    akka.cluster.ddata.ReplicatedData replicatedData18 = syncedLeaderMeta9.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta13);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta19 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta20 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta19);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta21 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta22 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta21);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta23 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta24 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta23);
    akka.cluster.ddata.ReplicatedData replicatedData25 = syncedLeaderMeta22.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta24);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta26 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta27 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta26);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta28 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta29 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta28);
    akka.cluster.ddata.ReplicatedData replicatedData30 = syncedLeaderMeta27.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta29);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta31 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta32 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta31);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta33 = syncedLeaderMeta29.mergeData(
        syncedLeaderMeta32);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction findComAction36 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction(
        (long) (byte) 100, (java.lang.Object) "name");
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta37 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta38 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta37);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta39 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta40 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta39);
    akka.cluster.ddata.ReplicatedData replicatedData41 = syncedLeaderMeta38.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta40);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta42 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta43 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta42);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta44 = syncedLeaderMeta40.mergeData(
        syncedLeaderMeta43);
    boolean boolean45 = findComAction36.equals((java.lang.Object) syncedLeaderMeta40);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta46 = syncedLeaderMeta32.mergeData(
        syncedLeaderMeta40);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta47 = io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta.INTL_NODE_SERVER_MEMBER_LEADER_META;
    io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType clusterDataType48 = io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_NODE_MAP;
    boolean boolean49 = nodeServerMemberLeaderMeta47.equals((java.lang.Object) clusterDataType48);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta50 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta47);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta51 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta52 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta51);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta53 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta54 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta53);
    akka.cluster.ddata.ReplicatedData replicatedData55 = syncedLeaderMeta52.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta54);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta56 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta57 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta56);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta58 = syncedLeaderMeta54.mergeData(
        syncedLeaderMeta57);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction findComAction61 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction(
        (long) (byte) 100, (java.lang.Object) "name");
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta62 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta63 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta62);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta64 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta65 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta64);
    akka.cluster.ddata.ReplicatedData replicatedData66 = syncedLeaderMeta63.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta65);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta67 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta68 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta67);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta69 = syncedLeaderMeta65.mergeData(
        syncedLeaderMeta68);
    boolean boolean70 = findComAction61.equals((java.lang.Object) syncedLeaderMeta65);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta71 = syncedLeaderMeta57.mergeData(
        syncedLeaderMeta65);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta[] syncedLeaderMetaArray72 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta[]{
        syncedLeaderMeta9, syncedLeaderMeta20, syncedLeaderMeta24, syncedLeaderMeta32,
        syncedLeaderMeta50, syncedLeaderMeta71};
    try {
      syncedLeaderMetaRingQueue1.claForV(syncedLeaderMetaArray72);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  63523b69-c48e-4278-b396-a85463647e8d");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(replicatedData6);
    org.junit.Assert.assertNotNull(syncedLeaderMeta9);
    org.junit.Assert.assertNotNull(replicatedData14);
    org.junit.Assert.assertNotNull(syncedLeaderMeta17);
    org.junit.Assert.assertNotNull(replicatedData18);
    org.junit.Assert.assertNotNull(replicatedData25);
    org.junit.Assert.assertNotNull(replicatedData30);
    org.junit.Assert.assertNotNull(syncedLeaderMeta33);
    org.junit.Assert.assertNotNull(replicatedData41);
    org.junit.Assert.assertNotNull(syncedLeaderMeta44);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(syncedLeaderMeta46);
    org.junit.Assert.assertNotNull(nodeServerMemberLeaderMeta47);
    org.junit.Assert.assertTrue("'" + clusterDataType48 + "' != '"
        + io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_NODE_MAP
        + "'", clusterDataType48.equals(
        io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType.CDT_CONS_NODE_MAP));
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    org.junit.Assert.assertNotNull(replicatedData55);
    org.junit.Assert.assertNotNull(syncedLeaderMeta58);
    org.junit.Assert.assertNotNull(replicatedData66);
    org.junit.Assert.assertNotNull(syncedLeaderMeta69);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertNotNull(syncedLeaderMeta71);
    org.junit.Assert.assertNotNull(syncedLeaderMetaArray72);
  }

  @Test
  public void test0833() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0833");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaMessageToByteEncoder sliceMetaMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaMessageToByteEncoder();
    io.github.onograph.cluster.raft.control.connect.ServerByteToMessageDecoder serverByteToMessageDecoder1 = new io.github.onograph.cluster.raft.control.connect.ServerByteToMessageDecoder();
    boolean boolean2 = sliceMetaMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) serverByteToMessageDecoder1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0834() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0834");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.share.ClusterAdapterNodeBuilder.CONS_SVX_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "raft-server" + "'", str0, "raft-server");
  }

  @Test
  public void test0835() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0835");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterInitMeta clusterInitMeta0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterInitMeta.EMT_CLUSTER_INIT_META;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Optional<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdOptional2 = clusterInitMeta0.geboaOptional(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterInitMeta0);
  }

  @Test
  public void test0836() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0836");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.SyncableTransactionLogReader syncableTransactionLogReader1 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.SyncableTransactionLogReader(
        logEntryReader0);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager2 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager2.beginChecksum();
    try {
      org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation physicalTransactionRepresentation4 = syncableTransactionLogReader1.reaPhysicalTransactionRepresentation(
          (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readablePositionAwareChecksumChannelManager2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0837() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0837");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingLoaiuBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0838() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0838");
    }
    try {
      io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMeta requestAuthMeta2 = new io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMeta(
          "causal_clustering.load_balancing.config.server_policies", "LZ4_high_compression");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: No enum constant io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions.LZ4_high_compression");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0839() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0839");
    }
    io.github.onograph.cluster.raft.palapp.strategies.CoreFocusedNamedServiceClusterApproach coreFocusedNamedServiceClusterApproach0 = new io.github.onograph.cluster.raft.palapp.strategies.CoreFocusedNamedServiceClusterApproach();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    try {
      java.util.Optional<org.neo4j.dbms.identity.ServerId> serverIdOptional2 = coreFocusedNamedServiceClusterApproach0.upesrfodaOptional(
          namedDatabaseId1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0840() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0840");
    }
    akka.actor.ActorRef[] actorRefArray0 = new akka.actor.ActorRef[]{};
    java.util.LinkedHashSet<akka.actor.ActorRef> actorRefSet1 = new java.util.LinkedHashSet<akka.actor.ActorRef>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<akka.actor.ActorRef>) actorRefSet1, actorRefArray0);
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ShowClusterActorStructureMeta showClusterActorStructureMeta3 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.ShowClusterActorStructureMeta(
        (java.util.Set<akka.actor.ActorRef>) actorRefSet1);
    java.util.Set<akka.actor.ActorRef> actorRefSet4 = showClusterActorStructureMeta3.getSetCcActorRef();
    org.junit.Assert.assertNotNull(actorRefArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(actorRefSet4);
  }

  @Test
  public void test0841() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0841");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager1 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLocatorImpl socketAddressServiceLocatorImpl2 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLocatorImpl(
        clusterStructureService0, namedServiceApproachManager1);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    try {
      org.neo4j.configuration.helpers.SocketAddress socketAddress4 = socketAddressServiceLocatorImpl2.prmySocketAddress(
          namedDatabaseId3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0842() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0842");
    }
    org.neo4j.graphdb.config.Setting<java.nio.file.Path> pathSetting0 = io.github.onograph.config.SettingsDeclarationClusterSystemImpl.settingMieaxafPath;
    org.junit.Assert.assertNotNull(pathSetting0);
  }

  @Test
  public void test0843() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0843");
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
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyByteToMessageDecoder setupGdbStoreSyncReplyByteToMessageDecoder10 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbStoreSyncReplyByteToMessageDecoder();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder requestSnapshotByteToMessageDecoder11 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder();
    io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator12 = io.netty.handler.codec.ByteToMessageDecoder.MERGE_CUMULATOR;
    requestSnapshotByteToMessageDecoder11.setCumulator(cumulator12);
    setupGdbStoreSyncReplyByteToMessageDecoder10.setCumulator(cumulator12);
    boolean boolean15 = comProFamilyWrapper9.equals(
        (java.lang.Object) setupGdbStoreSyncReplyByteToMessageDecoder10);
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder metaByteToMessageDecoder16 = new io.github.onograph.cluster.raft.module.cuprot.current.info.MetaByteToMessageDecoder();
    io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator17 = io.netty.handler.codec.ByteToMessageDecoder.COMPOSITE_CUMULATOR;
    metaByteToMessageDecoder16.setCumulator(cumulator17);
    boolean boolean19 = comProFamilyWrapper9.equals((java.lang.Object) metaByteToMessageDecoder16);
    io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started started20 = new io.github.onograph.cluster.raft.control.connect.ServerHandshakeCompletedAction.Started(
        socketAddress0, comProFamilyWrapper9);
    io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper comProFamilyWrapper21 = started20.prtostkComProFamilyWrapper;
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
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType8 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType8.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(cumulator12);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(cumulator17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(comProFamilyWrapper21);
  }

  @Test
  public void test0844() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0844");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    boolean boolean3 = nettyChannelImpl2.isChannelDis();
    org.neo4j.memory.MemoryTracker memoryTracker4 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout5 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer clusterMemberSyncer6 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer(
        memoryTracker4, neo4jLayout5);
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta7 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta8 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = clearStaleClusterMeta7.andMetaUpgradeFlowAction(
        (io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction) clearStaleClusterMeta8);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer10 = clusterMemberSyncer6.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) clearStaleClusterMeta8);
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture11 = nettyChannelImpl2.wrtFuture(
          (java.lang.Object) clusterMemberSyncer6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer10);
  }

  @Test
  public void test0845() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0845");
    }
    io.netty.buffer.ByteBuf byteBuf1 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel2 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf1);
    defaultWritableChecksumChannel2.beginChecksum();
    try {
      io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler.maslForBySt(
          "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S",
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0846() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0846");
    }
    boolean boolean2 = io.github.onograph.cluster.raft.share.calg.VotingMemberThreshold.isQuu(
        (int) (byte) 100, (int) (short) 100);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
  }

  @Test
  public void test0847() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0847");
    }
    byte[] byteArray1 = new byte[]{(byte) 9};
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType4 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData5 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData(
        byteArray1, databaseId2, "name", replicaTokenType4);
    org.neo4j.kernel.database.DatabaseId databaseId6 = requestData5.daasidDatabaseId();
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor syncableDataProcessor7 = null;
    try {
      requestData5.dipcForSy(syncableDataProcessor7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[9]");
    org.junit.Assert.assertNull(databaseId6);
  }

  @Test
  public void test0848() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0848");
    }
    java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>> answerMessageTypeMessageToByteEncoderRuleProcessorJoiningImplList0 = new java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>>();
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorInitiatorImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder> answerMessageTypeMessageToByteEncoderRuleProcessorInitiatorImpl1 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorInitiatorImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>(
        (java.util.List<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>>) answerMessageTypeMessageToByteEncoderRuleProcessorJoiningImplList0);
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorInitiatorImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder> answerMessageTypeMessageToByteEncoderRuleProcessorInitiatorImpl2 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorInitiatorImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>(
        (java.util.List<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.module.cuprot.AnswerMessageTypeMessageToByteEncoder>>) answerMessageTypeMessageToByteEncoderRuleProcessorJoiningImplList0);
  }

  @Test
  public void test0849() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0849");
    }
    io.github.onograph.cluster.raft.control.connect.HandshakeClientMessageProcessorDefaultImpl handshakeClientMessageProcessorDefaultImpl0 = null;
    io.github.onograph.cluster.raft.control.connect.ClientHandshakeSimpleChannelInboundHandler clientHandshakeSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.control.connect.ClientHandshakeSimpleChannelInboundHandler(
        handshakeClientMessageProcessorDefaultImpl0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType catchupStatusType3 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup setup4 = io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockGenerator.Setup.faiTransactionBlockGeneratorSetup(
        catchupStatusType3);
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef5 = null;
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionBlockService> transactionBlockServiceOptional6 = setup4.txstaOptional(
        serverRef5);
    try {
      clientHandshakeSimpleChannelInboundHandler1.channelRead(channelHandlerContext2,
          (java.lang.Object) setup4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(setup4);
    org.junit.Assert.assertNotNull(transactionBlockServiceOptional6);
  }

  @Test
  public void test0850() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0850");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.lang.String[] strArray30 = new java.lang.String[]{"name",
        "cc-core-restart-needed-listener-timer", "leader-only",
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S",
        "causal_clustering.leadership_priority_group",
        "io.github.onograph.cluster.raft.control.connect.ClientException: ", "server_policies",
        "cc-directory-actor", "overview", "uuid", "protocols", "catchup_protocol", "type_comp",
        "catchup_protocol", "user-defined", "joiner",
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version", "hi!",
        "FollowerStates{}", "overview", "default", "temp-copy", "status",
        "cc-discovery-actor-system",
        "io.github.onograph.cluster.raft.control.connect.ClientException: ", "RelationshipType",
        "io.github.onograph.cluster.raft.control.connect.ClientException: ",
        "io.github.onograph.dbms.ClusterDatabaseManagementException: store_version",
        "FollowerStates{}"};
    java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
    boolean boolean32 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList31, strArray30);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta authMeta33 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta(
        (java.util.List<java.lang.String>) strList31);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture34 = null;
    try {
      storeSyncCompletedCatchupAnswerManager0.ongmarseForCoAu(authMeta33,
          storeSyncCompletedCompletableFuture34);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray30);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
  }

  @Test
  public void test0851() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0851");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin1 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.ClientSideRoutingTableProviderDistributedImpl clientSideRoutingTableProviderDistributedImpl2 = new io.github.onograph.cluster.raft.gateway.gwlb.rtprocs.ClientSideRoutingTableProviderDistributedImpl(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) serverPoliciesPlugin1);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    org.neo4j.values.virtual.MapValue mapValue4 = null;
    try {
      org.neo4j.procedure.builtin.routing.RoutingResult routingResult5 = clientSideRoutingTableProviderDistributedImpl2.getRoutingResultForClientSideRouting(
          namedDatabaseId3, mapValue4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0852() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0852");
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
  public void test0853() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0853");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager0.beginChecksum();
    org.neo4j.storageengine.api.StorageCommand[] storageCommandArray2 = new org.neo4j.storageengine.api.StorageCommand[]{};
    java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand> storageCommandList3 = new java.util.ArrayList<org.neo4j.storageengine.api.StorageCommand>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.storageengine.api.StorageCommand>) storageCommandList3,
        storageCommandArray2);
    byte[] byteArray5 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList3);
    byte[] byteArray6 = io.github.onograph.cluster.raft.share.meta.fsm.comp.ActionMarshaller.contbForLi(
        (java.util.List<org.neo4j.storageengine.api.StorageCommand>) storageCommandList3);
    try {
      readablePositionAwareChecksumChannelManager0.get(byteArray6, (int) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(storageCommandArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(byteArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    org.junit.Assert.assertNotNull(byteArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
  }

  @Test
  public void test0854() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0854");
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
    io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
    io.netty.channel.ChannelPromise channelPromise8 = null;
    try {
      transactionChunkingCompletedMessageToByteEncoder0.deregister(channelHandlerContext7,
          channelPromise8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0855() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0855");
    }
    java.util.function.Predicate<java.lang.Object> objPredicate0 = null;
    io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler messageChannelDuplexHandler1 = new io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler(
        objPredicate0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSyncMessageToByteEncoder requestTransactionSyncMessageToByteEncoder3 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSyncMessageToByteEncoder();
    io.netty.channel.ChannelPromise channelPromise4 = null;
    try {
      messageChannelDuplexHandler1.write(channelHandlerContext2,
          (java.lang.Object) requestTransactionSyncMessageToByteEncoder3, channelPromise4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0856() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0856");
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
    org.neo4j.token.TokenHolders tokenHolders13 = coreNodeWrapper12.getTokenHolders();
    org.junit.Assert.assertNull(tokenHolders13);
  }

  @Test
  public void test0857() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0857");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId1 = null;
    long long2 = safeStateMarshalImpl0.ordinal(consensusMemberGroupId1);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId3 = null;
    io.netty.buffer.ByteBuf byteBuf4 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel5 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf4);
    defaultWritableChecksumChannel5.beginChecksum();
    try {
      safeStateMarshalImpl0.marshal(consensusMemberGroupId3,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0858() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0858");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl3 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean2);
    io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction dataSyncClusterAction4 = null;
    try {
      syncStatusMetaServiceImpl3.abrForDa(dataSyncClusterAction4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0859() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0859");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder requestAllGdbIdsMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsMessageToByteEncoder();
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.dbms.WatchTag> watchTagMetaWrapper1 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.META_WRAPPER_QUNMR_WATCH_TAG;
    boolean boolean2 = requestAllGdbIdsMessageToByteEncoder0.acceptOutboundMessage(
        (java.lang.Object) watchTagMetaWrapper1);
    org.junit.Assert.assertNotNull(watchTagMetaWrapper1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0860() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0860");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources storeResources0 = null;
    org.neo4j.kernel.database.Database database1 = null;
    org.neo4j.kernel.impl.transaction.log.files.LogFiles logFiles2 = null;
    io.github.onograph.dbms.DbmsManagerClusterImpl dbmsManagerClusterImpl3 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer4 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment storeSyncEnvironment5 = new io.github.onograph.cluster.raft.share.meta.pit.StoreSyncEnvironment(
          storeResources0, database1, logFiles2, dbmsManagerClusterImpl3, pageCacheTracer4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0861() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0861");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer1 = applicationComProFamilyType0.getImpl();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType2 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer3 = applicationComProFamilyType2.getImpl();
    int int4 = entProVer1.compareTo(entProVer3);
    io.netty.buffer.ByteBuf byteBuf5 = null;
    try {
      entProVer1.enoForBy(byteBuf5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
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
  }

  @Test
  public void test0862() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0862");
    }
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager0 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    readablePositionAwareChecksumChannelManager0.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker2 = null;
    try {
      org.neo4j.kernel.impl.transaction.log.LogPositionMarker logPositionMarker3 = readablePositionAwareChecksumChannelManager0.getCurrentPosition(
          logPositionMarker2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test0863() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0863");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor storeResourceSyncProcessor1 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor(
        3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    java.time.Instant instant4 = null;
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId5 = null;
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId6 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply9 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        consensusNodeId6, false, 100L);
    boolean boolean10 = reply9.getIsGv();
    long long11 = reply9.getLgT();
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply> replyArrivingMessageManager12 = io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager.ofConsensusMessageServiceMetaArrivingMessageManager(
        instant4, consensusMemberGroupId5, reply9);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType14 = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted storeSyncCompleted15 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted(
        0L, setupGdbSyncReplyStateType14);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType16 = storeSyncCompleted15.getStat();
    boolean boolean17 = replyArrivingMessageManager12.equals(
        (java.lang.Object) setupGdbSyncReplyStateType16);
    try {
      io.netty.util.concurrent.Future<java.lang.Void> voidFuture18 = storeResourceSyncProcessor1.endFuture(
          channelHandlerContext2, (long) 1536, setupGdbSyncReplyStateType16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    org.junit.Assert.assertNotNull(replyArrivingMessageManager12);
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType14 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType14.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType16 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR
        + "'", setupGdbSyncReplyStateType16.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
  }

  @Test
  public void test0864() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0864");
    }
    io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager dataSyncRunnerStatsManager0 = new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager();
    org.neo4j.dbms.database.DatabaseManager<?> wildcardDatabaseManager1 = dataSyncRunnerStatsManager0.databaseManagerDaamnObject;
    org.neo4j.dbms.database.DatabaseManager<?> wildcardDatabaseManager2 = dataSyncRunnerStatsManager0.databaseManagerDaamnObject;
    org.junit.Assert.assertNull(wildcardDatabaseManager1);
    org.junit.Assert.assertNull(wildcardDatabaseManager2);
  }

  @Test
  public void test0865() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0865");
    }
    io.github.onograph.cluster.raft.utils.ExceptionManager exceptionManager1 = new io.github.onograph.cluster.raft.utils.ExceptionManager(
        "designated_seeder");
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        "store_version");
    exceptionManager1.addForTh((java.lang.Throwable) gdbStoreSyncCrlException3);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException gdbIsoException5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbIsoException(
        (java.lang.Exception) gdbStoreSyncCrlException3);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta6 = io.github.onograph.cluster.raft.share.sync.SyncMeta.marcSyncMeta(
        (java.lang.Throwable) gdbIsoException5);
    org.junit.Assert.assertNotNull(syncMeta6);
  }

  @Test
  public void test0866() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0866");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaInboundHandler authMetaInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    java.lang.Object obj3 = null;
    boolean boolean4 = authMetaInboundHandler2.acceptInboundMessage(obj3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0867() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0867");
    }
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType0 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer1 = applicationComProFamilyType0.getImpl();
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType2 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer3 = applicationComProFamilyType2.getImpl();
    int int4 = entProVer1.compareTo(entProVer3);
    java.lang.String str5 = entProVer3.toString();
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
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "v4.0.0" + "'", str5, "v4.0.0");
  }

  @Test
  public void test0868() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0868");
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
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply reply12 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Reply(
        consensusNodeId9, false, 100L);
    boolean boolean13 = reply12.getIsGv();
    long long14 = reply12.getLgT();
    java.lang.Boolean boolean15 = messageProcessorImpl0.process(reply12);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
  }

  @Test
  public void test0869() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0869");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_MD_ASK;
    org.junit.Assert.assertTrue("'" + askMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_MD_ASK + "'",
        askMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_MD_ASK));
  }

  @Test
  public void test0870() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0870");
    }
    io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting leaderNodeGroupSetting1 = new io.github.onograph.cluster.raft.share.calg.nltof.LeaderNodeGroupSetting(
        "hi!");
    org.neo4j.graphdb.config.Setting<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSetting2 = leaderNodeGroupSetting1.settingLerpioNodeGroupIdentifier;
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSetting2);
  }

  @Test
  public void test0871() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0871");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler3 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl4 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler5 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler3, refCatchupManagerImpl4);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler6 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler2, refCatchupManagerImpl4);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler7 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, log1, refCatchupManagerImpl4);
    org.neo4j.kernel.database.DatabaseId databaseId8 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException clusterSyncerException9 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException();
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta10 = io.github.onograph.cluster.raft.share.sync.SyncMeta.norladSyncMeta(
        (java.lang.Throwable) clusterSyncerException9);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException12 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Exception) clusterSyncerException9, "restarting-cluster-client");
    org.neo4j.dbms.OperatorState operatorState13 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper14 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId8, (java.lang.Throwable) gdbStoreSyncCrlException12, operatorState13);
    java.util.Optional<java.lang.Throwable> throwableOptional15 = discoveryGdbOperatorMetaWrapper14.faleOptional();
    boolean boolean16 = sliceMetaSimpleChannelInboundHandler7.acceptInboundMessage(
        (java.lang.Object) discoveryGdbOperatorMetaWrapper14);
    org.junit.Assert.assertNotNull(syncMeta10);
    org.junit.Assert.assertNotNull(throwableOptional15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test0872() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0872");
    }
    java.util.function.Predicate<java.lang.Object> objPredicate0 = null;
    io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler messageChannelDuplexHandler1 = new io.github.onograph.cluster.raft.akkamsg.MessageChannelDuplexHandler(
        objPredicate0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
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
      messageChannelDuplexHandler1.userEventTriggered(channelHandlerContext2,
          (java.lang.Object) clusterMetaFormat18);
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
  public void test0873() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0873");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal readReplicateGdbMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal.IT;
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
      io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta readReplicateGdbMeta14 = readReplicateGdbMetaSafeChannelMarshal0.unmarshal(
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error:  337d71e4-16ab-4986-b3d7-7e231af9f8ee");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(readReplicateGdbMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(nodeGroupIdentifier5);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0874() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0874");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreDatabaseId storeDatabaseId2 = null;
    try {
      storeSyncCompletedCatchupAnswerManager0.ongsirpForCoSt(storeSyncCompletedCompletableFuture1,
          storeDatabaseId2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0875() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0875");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl2 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler storeSyncCompletedSimpleChannelInboundHandler3 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl2);
    try {
      io.github.onograph.cluster.raft.module.cuprot.ClientMessageChannelInboundHandlerAdapter clientMessageChannelInboundHandlerAdapter4 = new io.github.onograph.cluster.raft.module.cuprot.ClientMessageChannelInboundHandlerAdapter(
          logProvider0, refCatchupManagerImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0876() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0876");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl clusteringBalancerServiceImpl0 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ClusteringBalancerServiceImpl();
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin1 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin serverPoliciesPlugin2 = new io.github.onograph.cluster.raft.gateway.gwlb.mods.ServerPoliciesPlugin(
        (io.github.onograph.cluster.raft.gateway.gwlb.BalancerService) clusteringBalancerServiceImpl0);
    java.lang.String str3 = clusteringBalancerServiceImpl0.plgneString();
    boolean boolean4 = clusteringBalancerServiceImpl0.isSfgpi();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    org.neo4j.values.virtual.MapValue mapValue6 = null;
    try {
      org.neo4j.procedure.builtin.routing.RoutingResult routingResult7 = clusteringBalancerServiceImpl0.runRoutingResult(
          namedDatabaseId5, mapValue6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "server_policies" + "'", str3,
        "server_policies");
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test0877() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0877");
    }
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorKnownImpl<io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl> messageProcessorImplRuleProcessorKnownImpl0 = io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorKnownImpl.asRuleProcessorKnownImpl();
    org.junit.Assert.assertNotNull(messageProcessorImplRuleProcessorKnownImpl0);
  }

  @Test
  public void test0878() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0878");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.SyncedLeaderMetaSafeChannelMarshal syncedLeaderMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.SyncedLeaderMetaSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta2 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta1);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta4 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta3);
    akka.cluster.ddata.ReplicatedData replicatedData5 = syncedLeaderMeta2.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta4);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta7 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta6);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta8 = syncedLeaderMeta4.mergeData(
        syncedLeaderMeta7);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction findComAction11 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FindComAction(
        (long) (byte) 100, (java.lang.Object) "name");
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta12 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta13 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta12);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta14 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta15 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta14);
    akka.cluster.ddata.ReplicatedData replicatedData16 = syncedLeaderMeta13.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta15);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta17 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta18 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta17);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta19 = syncedLeaderMeta15.mergeData(
        syncedLeaderMeta18);
    boolean boolean20 = findComAction11.equals((java.lang.Object) syncedLeaderMeta15);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta21 = syncedLeaderMeta7.mergeData(
        syncedLeaderMeta15);
    io.netty.buffer.ByteBuf byteBuf22 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel23 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf22);
    defaultWritableChecksumChannel23.beginChecksum();
    try {
      syncedLeaderMetaSafeChannelMarshal0.marshal(syncedLeaderMeta15,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(syncedLeaderMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(replicatedData5);
    org.junit.Assert.assertNotNull(syncedLeaderMeta8);
    org.junit.Assert.assertNotNull(replicatedData16);
    org.junit.Assert.assertNotNull(syncedLeaderMeta19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(syncedLeaderMeta21);
  }

  @Test
  public void test0879() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0879");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceWriterService storeResourceWriterService1 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedAbstractCatchupAnswerManager2 = io.github.onograph.cluster.raft.module.cuprot.scmeta.AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(
        log0, storeResourceWriterService1);
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture3 = null;
    org.neo4j.kernel.database.DatabaseId databaseId4 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId gdbId5 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId(
        databaseId4);
    java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>> marshalChannelImplCMSRuleProcessorList6 = new java.util.ArrayList<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>();
    io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSRuleProcessorJoiningImpl7 = new io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>(
        (java.util.List<io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS>>) marshalChannelImplCMSRuleProcessorList6);
    boolean boolean8 = gdbId5.equals((java.lang.Object) marshalChannelImplCMSRuleProcessorList6);
    try {
      storeSyncCompletedAbstractCatchupAnswerManager2.ongdairnForCoGd(
          storeSyncCompletedCompletableFuture3, gdbId5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(storeSyncCompletedAbstractCatchupAnswerManager2);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0880() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0880");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.init();
  }

  @Test
  public void test0881() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0881");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.onungt();
    coreClusterStructureServiceLifecycleAdapter3.shutdown();
    coreClusterStructureServiceLifecycleAdapter3.init();
    try {
      coreClusterStructureServiceLifecycleAdapter3.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0882() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0882");
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
      org.neo4j.io.state.SimpleStorage<io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat> clusterMetaFormatSimpleStorage17 = clusterSimpleStorageFacade9.crectsavrsgSimpleStorage();
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
  public void test0883() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0883");
    }
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.stack.MessageLoggerActor messageLoggerActor0 = new io.github.onograph.cluster.raft.module.dprot.impl.stack.MessageLoggerActor();
      org.junit.Assert.fail(
          "Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [io.github.onograph.cluster.raft.module.dprot.impl.stack.MessageLoggerActor] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
    } catch (akka.actor.ActorInitializationException e) {
    }
  }

  @Test
  public void test0884() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0884");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getCurrentPosition();
    int int4 = readableClosablePositionAwareChecksumChannelPassThruImpl1.endChecksumAndValidate();
    try {
      float float5 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getFloat();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
  }

  @Test
  public void test0885() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0885");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS marshalChannelImplCMS0 = new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.MarshalChannelImplCMS();
    org.neo4j.io.fs.ReadableChannel readableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl2 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta3 = marshalChannelImplCMS0.unmarshal0(
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0886() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0886");
    }
    org.neo4j.io.fs.WritableChannel writableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl1 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel0);
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel3 = writableChecksumChannelImpl1.putFloat(
          (float) 1L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0887() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0887");
    }
    java.time.Clock clock0 = null;
    java.time.Duration duration1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterInitMeta> clusterInitMetaTransferCollection2 = new io.github.onograph.cluster.raft.share.calg.nltof.TransferCollection<io.github.onograph.cluster.raft.module.dprot.impl.structure.ClusterInitMeta>(
          clock0, duration1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0888() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0888");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl3 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean2);
    io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction dataSyncClusterAction4 = null;
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting5 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingMafnInteger;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData6 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        (java.lang.Object) intSetting5);
    try {
      syncStatusMetaServiceImpl3.trcrelForDaFS(dataSyncClusterAction4, fSMData6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(intSetting5);
    org.junit.Assert.assertNotNull(fSMData6);
  }

  @Test
  public void test0889() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0889");
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
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotData snapshotData32 = null;
    try {
      coreGdbFSMService29.aunspForSn(snapshotData32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0890() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0890");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    try {
      float float3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getFloat();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0891() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0891");
    }
    io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_GDB_UIDS;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_GDB_UIDS
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_GDB_UIDS));
  }

  @Test
  public void test0892() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0892");
    }
    io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType consensusNodeType0 = io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType.CNT_NODE_LEADER;
    io.github.onograph.cluster.raft.share.calg.meta.ConsensusMetaProvider consensusMetaProvider1 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService consensusResultService2 = io.github.onograph.cluster.raft.share.calg.action.ConsensusResultService.bulrConsensusResultService(
          consensusNodeType0, consensusMetaProvider1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + consensusNodeType0 + "' != '"
            + io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType.CNT_NODE_LEADER + "'",
        consensusNodeType0.equals(
            io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType.CNT_NODE_LEADER));
  }

  @Test
  public void test0893() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0893");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.function.ThrowingAction throwingAction1 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle2 = org.neo4j.kernel.lifecycle.LifecycleAdapter.simpleLife(
        throwingAction0, throwingAction1);
    org.junit.Assert.assertNotNull(lifecycle2);
  }

  @Test
  public void test0894() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0894");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SocketAddressController socketAddressController0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SocketAddressController();
    org.neo4j.configuration.helpers.SocketAddress socketAddress1 = null;
    try {
      boolean boolean2 = socketAddressController0.isTraueForSo(socketAddress1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0895() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0895");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler2 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler3 = null;
    org.neo4j.logging.Log log4 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler5 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler6 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl7 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler8 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler6, refCatchupManagerImpl7);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler9 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler5, refCatchupManagerImpl7);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler10 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler3, log4, refCatchupManagerImpl7);
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler catchupIncomingTransactionReplySimpleChannelInboundHandler11 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler(
        catchupAnswerLimitHandler2, refCatchupManagerImpl7);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler12 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler1, refCatchupManagerImpl7);
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsInboundHandler allGdbIdsInboundHandler13 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIdsInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl7);
    java.lang.Class<?> wildcardClass14 = refCatchupManagerImpl7.getClass();
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0896() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0896");
    }
    org.neo4j.logging.LogProvider logProvider0 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageSimpleChannelInboundHandler consensusMessageSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageSimpleChannelInboundHandler(
          logProvider0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0897() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0897");
    }
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry6 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[] consensusLogEntryArray7 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry[]{
        consensusLogEntry6};
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction8 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 0, 100L, consensusLogEntryArray7);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction9 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        (long) (byte) 100, 1536L, consensusLogEntryArray7);
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction12 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray7, (long) (byte) 0, (int) (short) 1);
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction incomingAction13 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.IncomingAction(
        10L, (long) (byte) 10, consensusLogEntryArray7);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction14 = null;
    org.neo4j.configuration.Config config15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.nio.file.Path path18 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo19 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path18);
    java.nio.file.Path path20 = clusterMetaTopologyInfo19.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker21 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo19);
    org.neo4j.memory.MemoryTracker memoryTracker22 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade23 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config15, fileSystemAbstraction16, logProvider17, clusterMetaTopologyInfo19,
        memoryTracker22);
    org.neo4j.logging.Log log24 = null;
    java.nio.file.Path path25 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo26 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path25);
    java.nio.file.Path path27 = clusterMetaTopologyInfo26.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker28 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo26);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat29 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv30 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction14, clusterSimpleStorageFacade23, log24, clusterMetaTopologyInfo26,
        clusterMetaFormat29);
    boolean boolean31 = incomingAction13.equals((java.lang.Object) fileSystemAbstraction14);
    org.junit.Assert.assertNotNull(consensusLogEntryArray7);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo19);
    org.junit.Assert.assertNull(path20);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo26);
    org.junit.Assert.assertNull(path27);
    org.junit.Assert.assertNotNull(clusterMetaFormat29);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
  }

  @Test
  public void test0898() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0898");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.CoreClusterStructureActor.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-core-topology-actor" + "'", str0,
        "cc-core-topology-actor");
  }

  @Test
  public void test0899() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0899");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry2 = consensusLogCacheServiceNLImpl0.getConsensusLogEntry(
        (long) 1);
    int int3 = consensusLogCacheServiceNLImpl0.elmtcu();
    consensusLogCacheServiceNLImpl0.trnt(52L);
    org.junit.Assert.assertNull(consensusLogEntry2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
  }

  @Test
  public void test0900() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0900");
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
    consensusLogCacheServiceNoopImpl11.trnt(1536L);
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
  }

  @Test
  public void test0901() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0901");
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
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId22 = ask13.getFroConsensusNodeId();
    org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
    org.junit.Assert.assertNotNull(props9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNull(void18);
    org.junit.Assert.assertNull(void20);
    org.junit.Assert.assertNull(void21);
    org.junit.Assert.assertNull(consensusNodeId22);
  }

  @Test
  public void test0902() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0902");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta sliceMeta2 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMeta(
        (int) '4', "io.github.onograph.cluster.raft.control.connect.ClientException: ");
  }

  @Test
  public void test0903() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0903");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler catchupIncomingTransactionReplySimpleChannelInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    java.lang.Object obj4 = new java.lang.Object();
    try {
      catchupIncomingTransactionReplySimpleChannelInboundHandler2.channelRead(
          channelHandlerContext3, obj4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0904() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0904");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations1 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager2 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl3 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService0, leaderOperations1, namedServiceApproachManager2);
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.cluster.raft.share.meta.ActionProcessManager actionProcessManager6 = null;
    io.github.onograph.dbms.crash.GdbCrashSender gdbCrashSender7 = null;
    io.github.onograph.cluster.raft.share.meta.pit.SyncServiceLifecycleAdapter syncServiceLifecycleAdapter8 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.ConsensusIncomingMessageProcessor consensusIncomingMessageProcessor9 = new io.github.onograph.cluster.raft.share.meta.ConsensusIncomingMessageProcessor(
          socketAddressServiceLeaderImpl3, consensusOperationsManager4, logProvider5,
          actionProcessManager6, gdbCrashSender7, syncServiceLifecycleAdapter8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0905() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0905");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId0 = null;
    java.util.UUID uUID1 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.State state2 = null;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage infoReplyMessage3 = new io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage(
        consensusNodeId0, uUID1, state2);
    java.lang.Class<?> wildcardClass4 = infoReplyMessage3.getClass();
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0906() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0906");
    }
    byte[] byteArray1 = new byte[]{(byte) 9};
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType4 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData5 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData(
        byteArray1, databaseId2, "name", replicaTokenType4);
    org.neo4j.kernel.database.DatabaseId databaseId6 = requestData5.daasidDatabaseId();
    io.netty.buffer.ByteBuf byteBuf7 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel8 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf7);
    defaultWritableChecksumChannel8.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.comp.DataMarshaller.maslForReBy(requestData5,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[9]");
    org.junit.Assert.assertNull(databaseId6);
  }

  @Test
  public void test0907() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0907");
    }
    io.github.onograph.cluster.raft.control.PipelineBuilderManager pipelineBuilderManager0 = io.github.onograph.cluster.raft.control.PipelineBuilderManager.inerPipelineBuilderManager();
    io.netty.channel.Channel channel1 = null;
    org.neo4j.logging.Log log2 = null;
    try {
      io.github.onograph.cluster.raft.control.ServerPipelineService serverPipelineService3 = pipelineBuilderManager0.sevServerPipelineService(
          channel1, log2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pipelineBuilderManager0);
  }

  @Test
  public void test0908() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0908");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry akkaActorSystemRetry1 = io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.fottAkkaActorSystemRetry(
        128);
    java.util.concurrent.Callable<java.lang.Boolean> booleanCallable2 = null;
    try {
      akkaActorSystemRetry1.rettForStCa(booleanCallable2,
          "causal_clustering.leadership_priority_group");
      org.junit.Assert.fail(
          "Expected exception of type io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure; message: java.lang.NullPointerException");
    } catch (io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.StartFailure e) {
    }
    org.junit.Assert.assertNotNull(akkaActorSystemRetry1);
  }

  @Test
  public void test0909() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0909");
    }
    java.lang.String[] strArray17 = new java.lang.String[]{"cc-database-status-actor", "version",
        "cc-database-status-actor", "cc-core-topology-actor", "LZ4_high_compression", "joiner",
        "policy", "Label", "policy", "catchup_protocol", "storage_engine", "status", "v4.0.0",
        "initial_members", "cc-core-topology-actor", "LZ4_high_compression", "policy"};
    java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList18, strArray17);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta authMeta20 = new io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta(
        (java.util.List<java.lang.String>) strList18);
    org.junit.Assert.assertNotNull(strArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test0910() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0910");
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
    io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
    catchupProblemInboundHandler5.handlerAdded(channelHandlerContext7);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0911() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0911");
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
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting12 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingCleditDuration;
    boolean boolean13 = nodeGroupIdentifier2.equals((java.lang.Object) durationSetting12);
    java.lang.String str14 = nodeGroupIdentifier2.toString();
    org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
    org.junit.Assert.assertNotNull(props9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(durationSetting12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
  }

  @Test
  public void test0912() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0912");
    }
    org.neo4j.memory.MemoryTracker memoryTracker0 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout1 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer clusterMemberSyncer2 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterMemberSyncer(
        memoryTracker0, neo4jLayout1);
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta3 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta clearStaleClusterMeta4 = new io.github.onograph.cluster.raft.share.meta.cm.ClearStaleClusterMeta();
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = clearStaleClusterMeta3.andMetaUpgradeFlowAction(
        (io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction) clearStaleClusterMeta4);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer6 = clusterMemberSyncer2.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) clearStaleClusterMeta4);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction7 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade8 = null;
    org.neo4j.logging.Log log9 = null;
    java.nio.file.Path path10 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo11 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path10);
    java.nio.file.Path path12 = clusterMetaTopologyInfo11.getPscPath();
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat13 = null;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv14 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction7, clusterSimpleStorageFacade8, log9, clusterMetaTopologyInfo11,
        clusterMetaFormat13);
    org.neo4j.logging.Log log15 = upgradeMetaEnv14.getLog();
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo16 = upgradeMetaEnv14.getLscClusterMetaTopologyInfo();
    try {
      clearStaleClusterMeta4.pefmseForUp(upgradeMetaEnv14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer6);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo11);
    org.junit.Assert.assertNull(path12);
    org.junit.Assert.assertNull(log15);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo16);
  }

  @Test
  public void test0913() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0913");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog> consensusTransactionLogMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.CONS_LG;
    org.junit.Assert.assertNotNull(consensusTransactionLogMetaWrapper0);
  }

  @Test
  public void test0914() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0914");
    }
    io.github.onograph.cluster.raft.control.connect.ServerComProMessageProcessorHandshakeImpl serverComProMessageProcessorHandshakeImpl0 = null;
    io.github.onograph.cluster.raft.control.connect.ServerHandshakeSimpleChannelInboundHandler serverHandshakeSimpleChannelInboundHandler1 = new io.github.onograph.cluster.raft.control.connect.ServerHandshakeSimpleChannelInboundHandler(
        serverComProMessageProcessorHandshakeImpl0);
    boolean boolean3 = serverHandshakeSimpleChannelInboundHandler1.acceptInboundMessage(
        (java.lang.Object) (byte) 1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
    try {
      serverHandshakeSimpleChannelInboundHandler1.channelWritabilityChanged(channelHandlerContext4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0915() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0915");
    }
    java.lang.String[] strArray5 = new java.lang.String[]{"designated_seeder", "leader-only",
        "store_version", "store_version"};
    java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strSet6, strArray5);
    io.github.onograph.cluster.raft.control.connect.MutatingComProFamilyWrapper mutatingComProFamilyWrapper8 = new io.github.onograph.cluster.raft.control.connect.MutatingComProFamilyWrapper(
        "", (java.util.Set<java.lang.String>) strSet6);
    java.util.Set<java.lang.String> strSet9 = mutatingComProFamilyWrapper8.getSetVrinU();
    java.util.Set<java.lang.String> strSet10 = mutatingComProFamilyWrapper8.getSetVrinU();
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(strSet9);
    org.junit.Assert.assertNotNull(strSet10);
  }

  @Test
  public void test0916() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0916");
    }
    org.neo4j.kernel.database.Database database0 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef1 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler requestStoreDatabaseIdInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler(
        database0, serverRef1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl consensusLogCacheServiceNoopImpl4 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNoopImpl();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry5 = null;
    consensusLogCacheServiceNoopImpl4.putForCo(consensusLogEntry5, (long) '#');
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry8 = null;
    consensusLogCacheServiceNoopImpl4.putForCo(consensusLogEntry8, 52L);
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry12 = consensusLogCacheServiceNoopImpl4.getConsensusLogEntry(
        (long) 'a');
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry13 = null;
    consensusLogCacheServiceNoopImpl4.putForCo(consensusLogEntry13, (long) 100);
    consensusLogCacheServiceNoopImpl4.enb();
    try {
      requestStoreDatabaseIdInboundHandler2.channelRead(channelHandlerContext3,
          (java.lang.Object) consensusLogCacheServiceNoopImpl4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(consensusLogEntry12);
  }

  @Test
  public void test0917() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0917");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder requestSnapshotByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder();
    io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator1 = io.netty.handler.codec.ByteToMessageDecoder.MERGE_CUMULATOR;
    requestSnapshotByteToMessageDecoder0.setCumulator(cumulator1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    requestSnapshotByteToMessageDecoder0.handlerRemoved(channelHandlerContext3);
    requestSnapshotByteToMessageDecoder0.setDiscardAfterReads(3);
    org.junit.Assert.assertNotNull(cumulator1);
  }

  @Test
  public void test0918() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0918");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat2 = new io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat(
        (-1), 1536);
  }

  @Test
  public void test0919() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0919");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData0 = null;
    org.neo4j.io.fs.WritableChannel writableChannel1 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel1);
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableSerializer.maslForSyWr(
          syncableLeasableCoreNodeData0, writableChannel1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0920() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0920");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataEncodingService syncableDataEncodingService0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder departingMessageManagerMessageToMessageEncoder1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DepartingMessageManagerMessageToMessageEncoder(
        syncableDataEncodingService0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId3 = null;
    io.github.onograph.cluster.raft.id.ConsensusSnapshotDataInfo consensusSnapshotDataInfo4 = new io.github.onograph.cluster.raft.id.ConsensusSnapshotDataInfo(
        consensusMemberGroupId3);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId5 = consensusSnapshotDataInfo4.getConsensusMemberGroupId();
    io.netty.channel.ChannelPromise channelPromise6 = null;
    try {
      departingMessageManagerMessageToMessageEncoder1.write(channelHandlerContext2,
          (java.lang.Object) consensusSnapshotDataInfo4, channelPromise6);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertNull(consensusMemberGroupId5);
  }

  @Test
  public void test0921() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0921");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.logging.internal.LogService logService1 = null;
    io.github.onograph.cluster.raft.share.NodeServerInfoLogService nodeServerInfoLogService3 = new io.github.onograph.cluster.raft.share.NodeServerInfoLogService(
        logService1, "hi!");
    java.lang.String str4 = nodeServerInfoLogService3.getStrNs();
    io.github.onograph.cluster.raft.module.dprot.DNSSRVServiceImpl dNSSRVServiceImpl5 = new io.github.onograph.cluster.raft.module.dprot.DNSSRVServiceImpl();
    try {
      io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService6 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerSRVImpl.reoeMemberNodeService(
          config0, (org.neo4j.logging.internal.LogService) nodeServerInfoLogService3,
          (io.github.onograph.cluster.raft.module.dprot.AbstractDNSSRVService) dNSSRVServiceImpl5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test0922() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0922");
    }
    org.neo4j.kernel.database.DatabaseTracers databaseTracers0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.memory.MemoryTracker memoryTracker2 = null;
    org.neo4j.io.pagecache.PageCache pageCache3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter(
        databaseTracers0, fileSystemAbstraction1, memoryTracker2, pageCache3);
    syncRecoveryLifecycleAdapter4.start();
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout7 = null;
    org.neo4j.storageengine.api.StorageEngineFactory storageEngineFactory9 = null;
    try {
      boolean boolean10 = syncRecoveryLifecycleAdapter4.isCarcreseForCoDaSt(config6,
          databaseLayout7, 0L, storageEngineFactory9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0923() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0923");
    }
    java.util.function.Supplier<org.neo4j.graphdb.GraphDatabaseService> graphDatabaseServiceSupplier0 = null;
    io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl1 = new io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl(
        graphDatabaseServiceSupplier0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    try {
      java.util.Set<org.neo4j.dbms.identity.ServerId> serverIdSet3 = systemGraphDbmsModelClusterImpl1.geirSet(
          namedDatabaseId2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0924() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0924");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer discoveryGdbOperatorMetaWrapperJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperJSerializer();
    java.lang.Object obj1 = null;
    try {
      byte[] byteArray2 = discoveryGdbOperatorMetaWrapperJSerializer0.toBinary(obj1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0925() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0925");
    }
    org.neo4j.io.fs.ReadableChannel readableChannel0 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl1 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel0);
    readableClosablePositionAwareChecksumChannelPassThruImpl1.beginChecksum();
    try {
      int int3 = readableClosablePositionAwareChecksumChannelPassThruImpl1.getInt();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0926() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0926");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo1 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path0);
    try {
      java.nio.file.Path path3 = clusterMetaTopologyInfo1.ratgodPath("name");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo1);
  }

  @Test
  public void test0927() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0927");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal discoveryGdbOperatorMetaWrapperSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal.IT;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException clusterSyncerException2 = new io.github.onograph.cluster.raft.share.meta.cm.ClusterSyncerException();
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta3 = io.github.onograph.cluster.raft.share.sync.SyncMeta.norladSyncMeta(
        (java.lang.Throwable) clusterSyncerException2);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException gdbStoreSyncCrlException5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException(
        (java.lang.Exception) clusterSyncerException2, "restarting-cluster-client");
    org.neo4j.dbms.OperatorState operatorState6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper discoveryGdbOperatorMetaWrapper7 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper(
        databaseId1, (java.lang.Throwable) gdbStoreSyncCrlException5, operatorState6);
    java.util.Optional<java.lang.Throwable> throwableOptional8 = discoveryGdbOperatorMetaWrapper7.faleOptional();
    io.netty.buffer.ByteBuf byteBuf9 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel10 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf9);
    defaultWritableChecksumChannel10.beginChecksum();
    try {
      discoveryGdbOperatorMetaWrapperSafeChannelMarshal0.marshal(discoveryGdbOperatorMetaWrapper7,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(discoveryGdbOperatorMetaWrapperSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(syncMeta3);
    org.junit.Assert.assertNotNull(throwableOptional8);
  }

  @Test
  public void test0928() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0928");
    }
    java.lang.Exception exception0 = null;
    io.github.onograph.cluster.raft.share.meta.FSMData fSMData1 = io.github.onograph.cluster.raft.share.meta.FSMData.ofFSMData(
        exception0);
    io.github.onograph.cluster.raft.share.sync.SyncMeta syncMeta2 = io.github.onograph.cluster.raft.share.sync.SyncMeta.apldSyncMeta(
        fSMData1);
    io.github.onograph.cluster.raft.share.meta.fsm.comp.TokenHolderReplicaImpl tokenHolderReplicaImpl3 = fSMData1.cose();
    org.junit.Assert.assertNotNull(fSMData1);
    org.junit.Assert.assertNotNull(syncMeta2);
    org.junit.Assert.assertNull(tokenHolderReplicaImpl3);
  }

  @Test
  public void test0929() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0929");
    }
    org.neo4j.kernel.database.NamedDatabaseId[] namedDatabaseIdArray0 = new org.neo4j.kernel.database.NamedDatabaseId[]{};
    java.util.LinkedHashSet<org.neo4j.kernel.database.NamedDatabaseId> namedDatabaseIdSet1 = new java.util.LinkedHashSet<org.neo4j.kernel.database.NamedDatabaseId>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet1,
        namedDatabaseIdArray0);
    io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds allGdbIds3 = new io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds(
        (java.util.Set<org.neo4j.kernel.database.NamedDatabaseId>) namedDatabaseIdSet1);
    int int4 = allGdbIds3.getSz();
    org.junit.Assert.assertNotNull(namedDatabaseIdArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
  }

  @Test
  public void test0930() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0930");
    }
    io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FinishChangeAction finishChangeAction0 = new io.github.onograph.cluster.raft.share.calg.action.AbstractTransactionLogProcessorAction.FinishChangeAction();
  }

  @Test
  public void test0931() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0931");
    }
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper0 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.CONS_GRP_UID;
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper0);
  }

  @Test
  public void test0932() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0932");
    }
    io.github.onograph.cluster.raft.module.cuprot.AskMessageType askMessageType0 = io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_GUID_ASK;
    org.junit.Assert.assertTrue("'" + askMessageType0 + "' != '"
            + io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_GUID_ASK + "'",
        askMessageType0.equals(
            io.github.onograph.cluster.raft.module.cuprot.AskMessageType.AMT_STORE_GUID_ASK));
  }

  @Test
  public void test0933() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0933");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector connector0 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreTransferWatcher.Connector();
    connector0.fihrih((long) (byte) 10);
    connector0.fii();
  }

  @Test
  public void test0934() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0934");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.logging.Log log1 = null;
    try {
      io.github.onograph.cluster.raft.gateway.gwlb.LoadBalancingResourceIntegrator.vaitForCoLo(
          config0, log1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0935() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0935");
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
    syncRecoveryLifecycleAdapter7.start();
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
  public void test0936() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0936");
    }
    org.neo4j.kernel.availability.AvailabilityGuard availabilityGuard0 = null;
    java.lang.Class<io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement> requestStoreDatabaseIdCatchupManagementClass1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef serverRef3 = null;
    try {
      io.github.onograph.cluster.raft.module.cuprot.exhandlers.AvailabilityHandler<io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement> requestStoreDatabaseIdCatchupManagementAvailabilityHandler4 = new io.github.onograph.cluster.raft.module.cuprot.exhandlers.AvailabilityHandler<io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement>(
          availabilityGuard0, requestStoreDatabaseIdCatchupManagementClass1, logProvider2,
          serverRef3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0937() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0937");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler1 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler4 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl5 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler6 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler4, refCatchupManagerImpl5);
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler catchupProblemInboundHandler7 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.CatchupProblemInboundHandler(
        catchupAnswerLimitHandler3, refCatchupManagerImpl5);
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler sliceMetaSimpleChannelInboundHandler8 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaSimpleChannelInboundHandler(
        catchupAnswerLimitHandler1, log2, refCatchupManagerImpl5);
    io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler catchupIncomingTransactionReplySimpleChannelInboundHandler9 = new io.github.onograph.cluster.raft.module.cuprot.current.rtx.CatchupIncomingTransactionReplySimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl5);
    io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType syncMetaType10 = io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_COM_OK;
    boolean boolean11 = catchupIncomingTransactionReplySimpleChannelInboundHandler9.acceptInboundMessage(
        (java.lang.Object) syncMetaType10);
    org.junit.Assert.assertTrue("'" + syncMetaType10 + "' != '"
            + io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_COM_OK + "'",
        syncMetaType10.equals(
            io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_COM_OK));
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0938() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0938");
    }
    org.neo4j.configuration.helpers.DatabaseReadOnlyChecker databaseReadOnlyChecker0 = null;
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
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    io.github.onograph.cluster.raft.share.sync.Syncerator syncerator10 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionCommitProcessSyncableDataImpl transactionCommitProcessSyncableDataImpl11 = new io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionCommitProcessSyncableDataImpl(
        databaseReadOnlyChecker0, leaseServiceEnterpriseImpl8, namedDatabaseId9, syncerator10);
    org.neo4j.kernel.impl.api.TransactionToApply transactionToApply12 = null;
    org.neo4j.kernel.impl.transaction.tracing.CommitEvent commitEvent13 = null;
    org.neo4j.storageengine.api.TransactionApplicationMode transactionApplicationMode14 = null;
    try {
      long long15 = transactionCommitProcessSyncableDataImpl11.commit(transactionToApply12,
          commitEvent13, transactionApplicationMode14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0939() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0939");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.DurationRange> durationRangeSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingLerutodDurationRange;
    org.junit.Assert.assertNotNull(durationRangeSetting0);
  }

  @Test
  public void test0940() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0940");
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
    java.util.Set<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS> marshalChannelImplCMSSet16 = marshalChannelImplCMSRuleProcessorJoiningImpl1.aplSet(
        marshalChannelImplCMSSet15);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS2);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS3);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSSet7);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS10);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS11);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSSet15);
    org.junit.Assert.assertNotNull(marshalChannelImplCMSSet16);
  }

  @Test
  public void test0941() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0941");
    }
    java.time.Clock clock0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager consensusTransactionLogMetaLRUCacheManager3 = new io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager(
        (int) (byte) 1);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager6 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel7 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl8 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel7);
    readablePositionAwareChecksumChannelManager6.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl8);
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition10 = readablePositionAwareChecksumChannelManager6.getCurrentPosition();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLogMetaLRUCacheManager.ConsensusTransactionLogInfo consensusTransactionLogInfo11 = consensusTransactionLogMetaLRUCacheManager3.cahmedaConsensusTransactionLogMetaLRUCacheManagerConsensusTransactionLogInfo(
        (long) (byte) 9, 1L, logPosition10);
    io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal syncableDataChannelMarshal12 = new io.github.onograph.cluster.raft.share.calg.SyncableDataChannelMarshal();
    boolean boolean13 = consensusTransactionLogInfo11.equals(
        (java.lang.Object) syncableDataChannelMarshal12);
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.logging.LogProvider logProvider17 = null;
    org.neo4j.memory.MemoryTracker memoryTracker18 = null;
    java.nio.file.Path path19 = null;
    io.github.onograph.cluster.raft.share.calg.cle.parts.PartClipperService partClipperService20 = null;
    try {
      io.github.onograph.cluster.raft.share.calg.cle.parts.ConsensusTransactionLogSpreadImpl consensusTransactionLogSpreadImpl21 = new io.github.onograph.cluster.raft.share.calg.cle.parts.ConsensusTransactionLogSpreadImpl(
          clock0, fileSystemAbstraction1,
          (java.util.function.Function<java.lang.Integer, org.neo4j.io.marshal.ChannelMarshal<io.github.onograph.cluster.raft.share.sync.SyncableData>>) syncableDataChannelMarshal12,
          (int) (byte) 8, jobScheduler15, (long) 100, logProvider17, memoryTracker18, path19,
          partClipperService20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition10);
    org.junit.Assert.assertNotNull(consensusTransactionLogInfo11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0942() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0942");
    }
    io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS marshalChannelImplCMS0 = io.github.onograph.dbms.WatchTag.MarshalChannelImplCMS.IT;
    io.github.onograph.dbms.WatchTag watchTag1 = marshalChannelImplCMS0.startState();
    io.github.onograph.dbms.WatchTag watchTag2 = null;
    long long3 = marshalChannelImplCMS0.ordinal(watchTag2);
    org.junit.Assert.assertNotNull(marshalChannelImplCMS0);
    org.junit.Assert.assertNull(watchTag1);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
  }

  @Test
  public void test0943() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0943");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCatchupAnswerManager0 = new io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted>();
    java.util.concurrent.CompletableFuture<io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted> storeSyncCompletedCompletableFuture1 = null;
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId gdbId3 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId(
        databaseId2);
    try {
      storeSyncCompletedCatchupAnswerManager0.ongdairnForCoGd(storeSyncCompletedCompletableFuture1,
          gdbId3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0944() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0944");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.SyncedLeaderMetaSafeChannelMarshal syncedLeaderMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.SyncedLeaderMetaSafeChannelMarshal.IT;
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta1 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta2 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta1);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta3 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta4 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta3);
    akka.cluster.ddata.ReplicatedData replicatedData5 = syncedLeaderMeta2.merge(
        (akka.cluster.ddata.ReplicatedData) syncedLeaderMeta4);
    io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta nodeServerMemberLeaderMeta6 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta7 = new io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta(
        nodeServerMemberLeaderMeta6);
    io.github.onograph.cluster.raft.module.dprot.impl.directory.SyncedLeaderMeta syncedLeaderMeta8 = syncedLeaderMeta4.mergeData(
        syncedLeaderMeta7);
    org.neo4j.io.fs.WritableChannel writableChannel9 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl10 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel9);
    try {
      syncedLeaderMetaSafeChannelMarshal0.marshal(syncedLeaderMeta7, writableChannel9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(syncedLeaderMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(replicatedData5);
    org.junit.Assert.assertNotNull(syncedLeaderMeta8);
  }

  @Test
  public void test0945() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0945");
    }
    org.neo4j.kernel.database.DatabaseId databaseId0 = null;
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource4 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId0, storeId1, (long) 32, path3);
  }

  @Test
  public void test0946() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0946");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal defaultSyncableDataMarshal1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal(
        logEntryReader0);
    org.neo4j.io.fs.ReadableChannel readableChannel2 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl3 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel2);
    readableClosablePositionAwareChecksumChannelPassThruImpl3.beginChecksum();
    org.neo4j.kernel.impl.transaction.log.LogPosition logPosition5 = readableClosablePositionAwareChecksumChannelPassThruImpl3.getCurrentPosition();
    try {
      io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData consensusLogEntryData6 = io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData.reaConsensusLogEntryData(
          (org.neo4j.io.marshal.ChannelMarshal<io.github.onograph.cluster.raft.share.sync.SyncableData>) defaultSyncableDataMarshal1,
          (org.neo4j.io.fs.ReadableChannel) readableClosablePositionAwareChecksumChannelPassThruImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition5);
  }

  @Test
  public void test0947() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0947");
    }
    byte[] byteArray1 = new byte[]{(byte) 1};
    io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService chunkedInputEncodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.ChunkedInputEncodingService(
        byteArray1, true);
    long long4 = chunkedInputEncodingService3.length();
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    try {
      io.netty.buffer.ByteBuf byteBuf6 = chunkedInputEncodingService3.readChunk(
          channelHandlerContext5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray1);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
  }

  @Test
  public void test0948() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0948");
    }
    java.lang.String str0 = io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.DatabaseReadReplicaClusterStructureLoggingActor.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cc-rr-topology-actor" + "'", str0,
        "cc-rr-topology-actor");
  }

  @Test
  public void test0949() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0949");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel1 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf0);
    defaultWritableChecksumChannel1.beginChecksum();
    int int3 = defaultWritableChecksumChannel1.putChecksum();
    try {
      org.neo4j.io.fs.WritableChecksumChannel writableChecksumChannel5 = defaultWritableChecksumChannel1.putDouble(
          (double) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
  }

  @Test
  public void test0950() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0950");
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
      byte byte6 = readableClosablePositionAwareChecksumChannelPassThruImpl1.get();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(logPosition3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
  }

  @Test
  public void test0951() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0951");
    }
    java.lang.String str0 = io.github.onograph.config.SettingsDeclarationClusterImpl.STD_CLX_STAX_DIEO_NME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cluster-state" + "'", str0,
        "cluster-state");
  }

  @Test
  public void test0952() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0952");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    boolean boolean3 = nettyChannelImpl2.isChannelDis();
    try {
      nettyChannelImpl2.dipe();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0953() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0953");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder messageDataTypeMessageToByteEncoder0 = new io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataTypeMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.netty.channel.ChannelPromise channelPromise2 = null;
    try {
      messageDataTypeMessageToByteEncoder0.close(channelHandlerContext1, channelPromise2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0954() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0954");
    }
    java.util.UUID uUID0 = null;
    org.neo4j.function.Suppliers.Lazy<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdLazy1 = null;
    io.github.onograph.cluster.raft.share.sync.ClusterSessionBean clusterSessionBean2 = new io.github.onograph.cluster.raft.share.sync.ClusterSessionBean(
        uUID0, consensusNodeIdLazy1);
    io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl syncStatusMetaServiceImpl3 = new io.github.onograph.cluster.raft.share.sync.SyncStatusMetaServiceImpl(
        clusterSessionBean2);
    io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction dataSyncClusterAction4 = null;
    try {
      io.github.onograph.cluster.raft.share.sync.SyncStatus syncStatus5 = syncStatusMetaServiceImpl3.strSyncStatus(
          dataSyncClusterAction4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0955() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0955");
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
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService20 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList17);
    boolean boolean21 = memberNodeService20.isUsord();
    org.neo4j.monitoring.Monitors monitors22 = null;
    io.github.onograph.cluster.raft.id.CoreNodeServerIdentity coreNodeServerIdentity23 = null;
    io.github.onograph.cluster.raft.module.dprot.pit.PointInTimeBackupService pointInTimeBackupService24 = io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTimeImpl.cosnoftPointInTimeBackupService(
        coreNodeServerIdentity23);
    org.neo4j.ssl.config.SslPolicyLoader sslPolicyLoader25 = null;
    try {
      io.github.onograph.cluster.raft.module.dprot.impl.AkkaCoreClusterStructureService akkaCoreClusterStructureService26 = clusterDiscoveryManagerAkkaImpl0.cotogsvCoreClusterStructureService(
          clock1, config2, coreNodeServerIdentity3, crashSignaler4, databaseStateService5,
          (io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker) defaultDiscoveryInitialProcChecker9,
          discoveryRetryManager12, jobScheduler13, logProvider14, logProvider15,
          memberNodeService20, monitors22, pointInTimeBackupService24, sslPolicyLoader25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo7);
    org.junit.Assert.assertNull(path8);
    org.junit.Assert.assertNotNull(socketAddressArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(memberNodeService19);
    org.junit.Assert.assertNotNull(memberNodeService20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertNotNull(pointInTimeBackupService24);
  }

  @Test
  public void test0956() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0956");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureJSerializer databaseCoreClusterStructureJSerializer0 = new io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseCoreClusterStructureJSerializer();
    try {
      byte[] byteArray2 = databaseCoreClusterStructureJSerializer0.toBinary((java.lang.Object) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure (java.lang.Integer is in module java.base of loader 'bootstrap'; io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure is in unnamed module of loader 'app')");
    } catch (java.lang.ClassCastException e) {
    }
  }

  @Test
  public void test0957() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0957");
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
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor syncableDataProcessor14 = null;
    try {
      leaderNodeDataSDWrapper0.dipcForSy(syncableDataProcessor14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'h' + "'", char4 == 'h');
    org.junit.Assert.assertNotNull(props9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0958() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0958");
    }
    io.netty.util.AttributeKey<org.neo4j.storageengine.api.CommandReaderFactory> commandReaderFactoryAttributeKey0 = io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataByteToMessageDecoder.COPD_COTT_CONCMD_RDXR_GENR;
    org.junit.Assert.assertNotNull(commandReaderFactoryAttributeKey0);
  }

  @Test
  public void test0959() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0959");
    }
    java.util.UUID uUID0 = null;
    try {
      io.github.onograph.cluster.raft.id.ConsensusNodeId consensusNodeId1 = new io.github.onograph.cluster.raft.id.ConsensusNodeId(
          uUID0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: UUID should be not null.");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0960() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0960");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder requestStoreDatabaseIdMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS marshalChannelImplCMS2 = io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS.IT;
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta3 = marshalChannelImplCMS2.startState();
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper4 = nodeServerMemberTransactionLogDataMeta3.getCmitdMemberIndexWrapper();
    io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta nodeServerMemberTransactionLogDataMeta5 = nodeServerMemberTransactionLogDataMeta3.neitcNodeServerMemberTransactionLogDataMeta();
    io.netty.channel.ChannelPromise channelPromise6 = null;
    try {
      requestStoreDatabaseIdMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) nodeServerMemberTransactionLogDataMeta5, channelPromise6);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
    org.junit.Assert.assertNotNull(marshalChannelImplCMS2);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta3);
    org.junit.Assert.assertNull(memberIndexWrapper4);
    org.junit.Assert.assertNotNull(nodeServerMemberTransactionLogDataMeta5);
  }

  @Test
  public void test0961() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0961");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl messageProcessorImpl0 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageProcessorImpl.SUPTL_MESSAGE_PROCESSOR_IMPL;
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.Timeoutable.AliveMsg aliveMsg1 = null;
    java.lang.Boolean boolean2 = messageProcessorImpl0.process(aliveMsg1);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.VotePreparationMessage.Ask ask3 = null;
    java.lang.Boolean boolean4 = messageProcessorImpl0.process(ask3);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted5 = null;
    java.lang.Boolean boolean6 = messageProcessorImpl0.process(leaderNotAccepted5);
    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.LeaderChangeService.LeaderNotAccepted leaderNotAccepted7 = null;
    java.lang.Boolean boolean8 = messageProcessorImpl0.process(leaderNotAccepted7);
    org.junit.Assert.assertNotNull(messageProcessorImpl0);
    org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
  }

  @Test
  public void test0962() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0962");
    }
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray0 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList1 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1,
        socketAddressArray0);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService3 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1);
    io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl actorLifecycleApproachDefaultImpl4 = new io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach.ActorLifecycleApproachDefaultImpl(
        memberNodeService3);
    java.lang.String str5 = actorLifecycleApproachDefaultImpl4.gersString();
    java.lang.String str6 = actorLifecycleApproachDefaultImpl4.gersString();
    java.lang.String str7 = actorLifecycleApproachDefaultImpl4.gersString();
    org.junit.Assert.assertNotNull(socketAddressArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(memberNodeService3);
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
            + "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S"
            + "'", str5,
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S");
    org.junit.Assert.assertEquals("'" + str6 + "' != '"
            + "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S"
            + "'", str6,
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S");
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S"
            + "'", str7,
        "AkkaActorSystemRestartStrategy: class io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach$ActorLifecycleApproachDefaultImpl. Triggered after 0 consecutive failures. Running every PT10S");
  }

  @Test
  public void test0963() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0963");
    }
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusMemberGroupId.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.share.meta.MetaWrapper<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId> consensusMemberGroupIdMetaWrapper1 = io.github.onograph.cluster.raft.share.meta.MetaWrapper.dumMetaWrapper(
        (org.neo4j.io.marshal.SafeStateMarshal<io.github.onograph.cluster.raft.id.ConsensusMemberGroupId>) safeStateMarshalImpl0);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId2 = safeStateMarshalImpl0.startState();
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId3 = null;
    long long4 = safeStateMarshalImpl0.ordinal(consensusMemberGroupId3);
    io.github.onograph.cluster.raft.id.ConsensusMemberGroupId consensusMemberGroupId5 = null;
    long long6 = safeStateMarshalImpl0.ordinal(consensusMemberGroupId5);
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertNotNull(consensusMemberGroupIdMetaWrapper1);
    org.junit.Assert.assertNull(consensusMemberGroupId2);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
  }

  @Test
  public void test0964() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0964");
    }
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedByteToMessageDecoder transactionChunkingCompletedByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedByteToMessageDecoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    try {
      transactionChunkingCompletedByteToMessageDecoder0.channelActive(channelHandlerContext1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0965() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0965");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.id.ConsensusNodeId.SafeStateMarshalImpl.IT;
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
  }

  @Test
  public void test0966() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0966");
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
    io.github.onograph.cluster.raft.share.calg.action.BulkAddAction bulkAddAction13 = new io.github.onograph.cluster.raft.share.calg.action.BulkAddAction(
        consensusLogEntryArray5, 1L, (int) (byte) 8);
    org.junit.Assert.assertNotNull(consensusLogEntryArray5);
  }

  @Test
  public void test0967() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0967");
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
    try {
      boolean boolean7 = memberNodeServiceDiscoveryKickoffImpl6.isUsord();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(socketAddressArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(memberNodeService3);
    org.junit.Assert.assertNotNull(memberNodeService4);
  }

  @Test
  public void test0968() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0968");
    }
    io.github.onograph.cluster.raft.share.calg.ConsensusOperationsManager consensusOperationsManager0 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService coreClusterStructureService2 = null;
    io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter coreClusterStructureServiceLifecycleAdapter3 = new io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureServiceLifecycleAdapter(
        consensusOperationsManager0, namedDatabaseId1, coreClusterStructureService2);
    coreClusterStructureServiceLifecycleAdapter3.onungt();
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray5 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet6 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet6,
        consensusNodeIdArray5);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper8 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet6);
    try {
      coreClusterStructureServiceLifecycleAdapter3.oncetlchForSe(
          (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusNodeIdArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0969() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0969");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat0 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.CURT_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat1 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.nio.file.Path path6 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo7 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path6);
    java.nio.file.Path path8 = clusterMetaTopologyInfo7.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker9 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo7);
    org.neo4j.memory.MemoryTracker memoryTracker10 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade11 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config3, fileSystemAbstraction4, logProvider5, clusterMetaTopologyInfo7, memoryTracker10);
    org.neo4j.logging.Log log12 = null;
    java.nio.file.Path path13 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo14 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path13);
    java.nio.file.Path path15 = clusterMetaTopologyInfo14.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker16 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo14);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat17 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv18 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction2, clusterSimpleStorageFacade11, log12, clusterMetaTopologyInfo14,
        clusterMetaFormat17);
    boolean boolean19 = clusterMetaFormat1.isLortaForCl(clusterMetaFormat17);
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler20 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl21 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler22 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler20, refCatchupManagerImpl21);
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting23 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingJoapoDuration;
    boolean boolean24 = transactionChunkingCompletedInboundHandler22.acceptInboundMessage(
        (java.lang.Object) durationSetting23);
    boolean boolean25 = clusterMetaFormat1.equals(
        (java.lang.Object) transactionChunkingCompletedInboundHandler22);
    boolean boolean26 = clusterMetaFormat0.isMabmttForCl(clusterMetaFormat1);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat27 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction28 = null;
    org.neo4j.configuration.Config config29 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction30 = null;
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.nio.file.Path path32 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo33 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path32);
    java.nio.file.Path path34 = clusterMetaTopologyInfo33.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker35 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo33);
    org.neo4j.memory.MemoryTracker memoryTracker36 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade37 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config29, fileSystemAbstraction30, logProvider31, clusterMetaTopologyInfo33,
        memoryTracker36);
    org.neo4j.logging.Log log38 = null;
    java.nio.file.Path path39 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo40 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path39);
    java.nio.file.Path path41 = clusterMetaTopologyInfo40.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker42 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo40);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat43 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv44 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction28, clusterSimpleStorageFacade37, log38, clusterMetaTopologyInfo40,
        clusterMetaFormat43);
    boolean boolean45 = clusterMetaFormat27.isLortaForCl(clusterMetaFormat43);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat46 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction47 = null;
    org.neo4j.configuration.Config config48 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction49 = null;
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.nio.file.Path path51 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo52 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path51);
    java.nio.file.Path path53 = clusterMetaTopologyInfo52.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker54 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo52);
    org.neo4j.memory.MemoryTracker memoryTracker55 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade56 = new io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade(
        config48, fileSystemAbstraction49, logProvider50, clusterMetaTopologyInfo52,
        memoryTracker55);
    org.neo4j.logging.Log log57 = null;
    java.nio.file.Path path58 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo59 = io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        path58);
    java.nio.file.Path path60 = clusterMetaTopologyInfo59.getPscPath();
    io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker defaultDiscoveryInitialProcChecker61 = new io.github.onograph.cluster.raft.module.dprot.DefaultDiscoveryInitialProcChecker(
        clusterMetaTopologyInfo59);
    io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat clusterMetaFormat62 = io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat.INTL_CLUSTER_META_FORMAT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv63 = new io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv(
        fileSystemAbstraction47, clusterSimpleStorageFacade56, log57, clusterMetaTopologyInfo59,
        clusterMetaFormat62);
    boolean boolean64 = clusterMetaFormat46.isLortaForCl(clusterMetaFormat62);
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler65 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl66 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler transactionChunkingCompletedInboundHandler67 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompletedInboundHandler(
        catchupAnswerLimitHandler65, refCatchupManagerImpl66);
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting68 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingJoapoDuration;
    boolean boolean69 = transactionChunkingCompletedInboundHandler67.acceptInboundMessage(
        (java.lang.Object) durationSetting68);
    boolean boolean70 = clusterMetaFormat46.equals(
        (java.lang.Object) transactionChunkingCompletedInboundHandler67);
    boolean boolean71 = clusterMetaFormat27.isMabmttForCl(clusterMetaFormat46);
    boolean boolean72 = clusterMetaFormat0.isMabmttForCl(clusterMetaFormat27);
    org.junit.Assert.assertNotNull(clusterMetaFormat0);
    org.junit.Assert.assertNotNull(clusterMetaFormat1);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo7);
    org.junit.Assert.assertNull(path8);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo14);
    org.junit.Assert.assertNull(path15);
    org.junit.Assert.assertNotNull(clusterMetaFormat17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(durationSetting23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    org.junit.Assert.assertNotNull(clusterMetaFormat27);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo33);
    org.junit.Assert.assertNull(path34);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo40);
    org.junit.Assert.assertNull(path41);
    org.junit.Assert.assertNotNull(clusterMetaFormat43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    org.junit.Assert.assertNotNull(clusterMetaFormat46);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo52);
    org.junit.Assert.assertNull(path53);
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo59);
    org.junit.Assert.assertNull(path60);
    org.junit.Assert.assertNotNull(clusterMetaFormat62);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    org.junit.Assert.assertNotNull(durationSetting68);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
  }

  @Test
  public void test0970() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0970");
    }
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray0 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet1 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1,
        consensusNodeIdArray0);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper3 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet1);
    java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet4 = consensusNodeServerMemberIdWrapper3.gembsSet();
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor syncableDataProcessor5 = null;
    try {
      consensusNodeServerMemberIdWrapper3.dipcForSy(syncableDataProcessor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(consensusNodeIdArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(consensusNodeIdSet4);
  }

  @Test
  public void test0971() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0971");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady consensusGdbsReady0 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ConsensusGdbsReady.EMT_CONSENSUS_GDBS_READY;
    io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType catchupManagerStatusType1 = io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_CSS;
    boolean boolean2 = consensusGdbsReady0.equals((java.lang.Object) catchupManagerStatusType1);
    org.neo4j.kernel.database.DatabaseId databaseId3 = null;
    org.neo4j.storageengine.api.StoreId storeId4 = null;
    java.nio.file.Path path6 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource requestStoreResource7 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource(
        databaseId3, storeId4, (long) (byte) 10, path6);
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService8 = null;
    io.github.onograph.cluster.raft.share.LeaderOperations leaderOperations9 = null;
    io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager namedServiceApproachManager10 = null;
    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl socketAddressServiceLeaderImpl11 = new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLeaderImpl(
        clusterStructureService8, leaderOperations9, namedServiceApproachManager10);
    boolean boolean12 = requestStoreResource7.equals(
        (java.lang.Object) socketAddressServiceLeaderImpl11);
    org.neo4j.storageengine.api.StoreId storeId13 = requestStoreResource7.getEpceStoreId();
    org.neo4j.kernel.database.DatabaseId databaseId14 = requestStoreResource7.getDatabaseId();
    org.neo4j.storageengine.api.StoreId storeId15 = requestStoreResource7.getEpceStoreId();
    boolean boolean16 = consensusGdbsReady0.equals((java.lang.Object) requestStoreResource7);
    org.junit.Assert.assertNotNull(consensusGdbsReady0);
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType1 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_CSS
        + "'", catchupManagerStatusType1.equals(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.REQ_CSS));
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNull(storeId13);
    org.junit.Assert.assertNull(databaseId14);
    org.junit.Assert.assertNull(storeId15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test0972() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0972");
    }
    io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef contentTypeRef0 = new io.github.onograph.cluster.raft.akkamsg.serialization.ContentTypeRef();
    io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType messageDataType1 = io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD;
    contentTypeRef0.exeForE(messageDataType1);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService3 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService4 = new io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataDataManagerFactoryDecodingService(
        (io.github.onograph.cluster.raft.module.cuprot.Ref<io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType>) contentTypeRef0);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    syncableDataDataManagerFactoryDecodingService4.handlerAdded(channelHandlerContext5);
    org.junit.Assert.assertTrue("'" + messageDataType1 + "' != '"
            + io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD + "'",
        messageDataType1.equals(
            io.github.onograph.cluster.raft.akkamsg.serialization.MessageDataType.DUPD_MD));
  }

  @Test
  public void test0973() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0973");
    }
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta leasableMeta0 = io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta.INTL_LES_STAX;
    io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbId requestGdbId2 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbId(
        "");
    java.lang.String str3 = requestGdbId2.decbString();
    java.lang.String str4 = requestGdbId2.getGdbName();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder sliceMetaByteToMessageDecoder5 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SliceMetaByteToMessageDecoder();
    sliceMetaByteToMessageDecoder5.setDiscardAfterReads((int) ' ');
    boolean boolean8 = requestGdbId2.equals((java.lang.Object) sliceMetaByteToMessageDecoder5);
    boolean boolean9 = leasableMeta0.equals((java.lang.Object) sliceMetaByteToMessageDecoder5);
    org.junit.Assert.assertNotNull(leasableMeta0);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RequestGdbId for " + "'", str3,
        "RequestGdbId for ");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0974() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0974");
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
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta> nodeServerMemberTransactionLogDataMetaStateStorage22 = clusterSimpleStorageFacade18.crermrsgStateStorage(
          databaseLogProvider19, "", lifeSupport21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo11);
  }

  @Test
  public void test0975() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0975");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl consensusLogCacheServiceNLImpl0 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceNLImpl();
    consensusLogCacheServiceNLImpl0.retspccac();
    consensusLogCacheServiceNLImpl0.enb();
    consensusLogCacheServiceNLImpl0.prn((long) 1016);
  }

  @Test
  public void test0976() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0976");
    }
    org.neo4j.configuration.Config config0 = null;
    io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper.CoreClusterModuleBuilder coreClusterModuleBuilder1 = null;
    org.neo4j.graphdb.facade.ExternalDependencies externalDependencies2 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl clusterDiscoveryManagerAkkaImpl3 = new io.github.onograph.cluster.raft.module.dprot.impl.ClusterDiscoveryManagerAkkaImpl();
    try {
      io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper coreDatabaseManagementServiceWrapper4 = new io.github.onograph.cluster.raft.share.CoreDatabaseManagementServiceWrapper(
          config0, coreClusterModuleBuilder1, externalDependencies2,
          (io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager) clusterDiscoveryManagerAkkaImpl3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0977() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0977");
    }
    org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader logEntryReader0 = null;
    io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal defaultSyncableDataMarshal1 = new io.github.onograph.cluster.raft.akkamsg.serialization.DefaultSyncableDataMarshal(
        logEntryReader0);
    io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager readablePositionAwareChecksumChannelManager2 = new io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager();
    org.neo4j.io.fs.ReadableChannel readableChannel3 = null;
    io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl readableClosablePositionAwareChecksumChannelPassThruImpl4 = new io.github.onograph.cluster.raft.akkamsg.ReadableClosablePositionAwareChecksumChannelPassThruImpl(
        readableChannel3);
    readablePositionAwareChecksumChannelManager2.deettoForRe(
        (org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel) readableClosablePositionAwareChecksumChannelPassThruImpl4);
    readablePositionAwareChecksumChannelManager2.beginChecksum();
    try {
      io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData consensusLogEntryData7 = io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData.reaConsensusLogEntryData(
          (org.neo4j.io.marshal.ChannelMarshal<io.github.onograph.cluster.raft.share.sync.SyncableData>) defaultSyncableDataMarshal1,
          (org.neo4j.io.fs.ReadableChannel) readablePositionAwareChecksumChannelManager2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0978() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0978");
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
    org.neo4j.kernel.impl.api.CommitProcessFactory commitProcessFactory14 = coreNodeWrapper12.getCommitProcessFactory();
    org.junit.Assert.assertNull(accessCapabilityFactory13);
    org.junit.Assert.assertNull(commitProcessFactory14);
  }

  @Test
  public void test0979() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0979");
    }
    io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver livingCacheObserver3 = io.github.onograph.cluster.raft.share.calg.cle.cservice.LivingCacheObserver.VOI_LIVING_CACHE_OBSERVER;
    livingCacheObserver3.sememt((int) 'a');
    io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl consensusLogCacheServiceLiveImpl6 = new io.github.onograph.cluster.raft.share.calg.cle.cservice.ConsensusLogCacheServiceLiveImpl(
        32, false, (long) 13, livingCacheObserver3);
    long long7 = consensusLogCacheServiceLiveImpl6.toabys();
    io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry consensusLogEntry8 = null;
    consensusLogCacheServiceLiveImpl6.putForCo(consensusLogEntry8, 0L);
    org.junit.Assert.assertNotNull(livingCacheObserver3);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
  }

  @Test
  public void test0980() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0980");
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
    io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData syncableLeasableCoreNodeData8 = null;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.FSMData> fSMDataConsumer10 = null;
    try {
      syncableLeasableCoreNodeDataFSMImpl3.aplcoaForCoCo(syncableLeasableCoreNodeData8, (long) (-1),
          fSMDataConsumer10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0981() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0981");
    }
    org.neo4j.storageengine.api.StoreId storeId1 = null;
    org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation committedTransactionRepresentation2 = null;
    io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply catchupIncomingTransactionReply3 = new io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply(
        (int) (byte) 10, storeId1, committedTransactionRepresentation2);
  }

  @Test
  public void test0982() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0982");
    }
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper.SafeStateMarshalImpl safeStateMarshalImpl0 = io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper.SafeStateMarshalImpl.IT;
    io.github.onograph.cluster.raft.id.ConsensusNodeId[] consensusNodeIdArray2 = new io.github.onograph.cluster.raft.id.ConsensusNodeId[]{};
    java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId> consensusNodeIdSet3 = new java.util.LinkedHashSet<io.github.onograph.cluster.raft.id.ConsensusNodeId>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet3,
        consensusNodeIdArray2);
    io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper consensusNodeServerMemberIdWrapper5 = new io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper(
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet3);
    io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper memberIndexWrapper6 = new io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper(
        (long) ' ',
        (java.util.Set<io.github.onograph.cluster.raft.id.ConsensusNodeId>) consensusNodeIdSet3);
    io.netty.buffer.ByteBuf byteBuf7 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel8 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf7);
    defaultWritableChecksumChannel8.beginChecksum();
    int int10 = defaultWritableChecksumChannel8.putChecksum();
    try {
      safeStateMarshalImpl0.marshal(memberIndexWrapper6,
          (org.neo4j.io.fs.WritableChannel) defaultWritableChecksumChannel8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(safeStateMarshalImpl0);
    org.junit.Assert.assertNotNull(consensusNodeIdArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
  }

  @Test
  public void test0983() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0983");
    }
    io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal readReplicateGdbMetaSafeChannelMarshal0 = io.github.onograph.cluster.raft.module.dprot.impl.serialize.ReadReplicateGdbMetaSafeChannelMarshal.IT;
    org.neo4j.kernel.database.DatabaseId databaseId1 = null;
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> serverIdMap2 = null;
    io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta readReplicateGdbMeta3 = io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(
        databaseId1, serverIdMap2);
    org.neo4j.kernel.database.DatabaseId databaseId4 = readReplicateGdbMeta3.getDatabaseId();
    java.util.Map<org.neo4j.dbms.identity.ServerId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> serverIdMap5 = readReplicateGdbMeta3.getMapMssd();
    org.neo4j.io.fs.WritableChannel writableChannel6 = null;
    io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl writableChecksumChannelImpl7 = new io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelImpl(
        writableChannel6);
    writableChecksumChannelImpl7.beginChecksum();
    try {
      readReplicateGdbMetaSafeChannelMarshal0.marshal(readReplicateGdbMeta3,
          (org.neo4j.io.fs.WritableChannel) writableChecksumChannelImpl7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(readReplicateGdbMetaSafeChannelMarshal0);
    org.junit.Assert.assertNotNull(readReplicateGdbMeta3);
    org.junit.Assert.assertNull(databaseId4);
    org.junit.Assert.assertNull(serverIdMap5);
  }

  @Test
  public void test0984() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0984");
    }
    org.neo4j.kernel.database.DatabaseTracers databaseTracers0 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction1 = null;
    org.neo4j.memory.MemoryTracker memoryTracker2 = null;
    org.neo4j.io.pagecache.PageCache pageCache3 = null;
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter syncRecoveryLifecycleAdapter4 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.SyncRecoveryLifecycleAdapter(
        databaseTracers0, fileSystemAbstraction1, memoryTracker2, pageCache3);
    syncRecoveryLifecycleAdapter4.init();
    syncRecoveryLifecycleAdapter4.shutdown();
    org.neo4j.configuration.Config config7 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout8 = null;
    org.neo4j.storageengine.api.StorageEngineFactory storageEngineFactory10 = null;
    try {
      boolean boolean11 = syncRecoveryLifecycleAdapter4.isCarcreseForCoDaSt(config7,
          databaseLayout8, (long) ' ', storageEngineFactory10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0985() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0985");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.SettingsDeclarationClusterImpl.settingTranerSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test0986() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0986");
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
    java.util.Set<io.github.onograph.config.NodeGroupIdentifier> nodeGroupIdentifierSet15 = gdbDiscoveryMetaReadReplicaImpl14.gruSet();
    org.junit.Assert.assertNotNull(strArray8);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet9);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet10);
    org.junit.Assert.assertNotNull(databaseIdArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(nodeGroupIdentifierSet15);
  }

  @Test
  public void test0987() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0987");
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
      org.neo4j.io.state.StateStorage<io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta> nodeServerMemberTransactionLogDataMetaStateStorage22 = clusterSimpleStorageFacade18.crermrsgStateStorage(
          databaseLogProvider19, "designated_seeder", lifeSupport21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusterMetaTopologyInfo11);
  }

  @Test
  public void test0988() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0988");
    }
    io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType setupGdbSyncReplyStateType0 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK;
    try {
      io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply setupGdbStoreSyncReply1 = io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.eroSetupGdbStoreSyncReply(
          setupGdbSyncReplyStateType0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalStateException; message: *** Error: dc84a2e0-5034-419e-9d90-791845d2cebd");
    } catch (java.lang.IllegalStateException e) {
    }
    org.junit.Assert.assertTrue("'" + setupGdbSyncReplyStateType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK
        + "'", setupGdbSyncReplyStateType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.OK));
  }

  @Test
  public void test0989() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0989");
    }
    io.netty.channel.Channel channel0 = null;
    org.neo4j.logging.Log log1 = null;
    io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl nettyChannelImpl2 = new io.github.onograph.cluster.raft.akkamsg.NettyChannelImpl(
        channel0, log1);
    boolean boolean3 = nettyChannelImpl2.isChannelDis();
    io.netty.buffer.ByteBuf byteBuf4 = null;
    io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel defaultWritableChecksumChannel5 = new io.github.onograph.cluster.raft.akkamsg.DefaultWritableChecksumChannel(
        byteBuf4);
    try {
      java.util.concurrent.Future<java.lang.Void> voidFuture6 = nettyChannelImpl2.wrtanflhFuture(
          (java.lang.Object) byteBuf4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0990() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0990");
    }
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler0 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl1 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler storeSyncCompletedSimpleChannelInboundHandler2 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler(
        catchupAnswerLimitHandler0, refCatchupManagerImpl1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerLimitHandler catchupAnswerLimitHandler4 = null;
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl refCatchupManagerImpl5 = new io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl();
    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler storeSyncCompletedSimpleChannelInboundHandler6 = new io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompletedSimpleChannelInboundHandler(
        catchupAnswerLimitHandler4, refCatchupManagerImpl5);
    io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdByteToMessageDecoder requestGdbIdByteToMessageDecoder7 = new io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdByteToMessageDecoder();
    boolean boolean8 = storeSyncCompletedSimpleChannelInboundHandler6.acceptInboundMessage(
        (java.lang.Object) requestGdbIdByteToMessageDecoder7);
    try {
      storeSyncCompletedSimpleChannelInboundHandler2.userEventTriggered(channelHandlerContext3,
          (java.lang.Object) requestGdbIdByteToMessageDecoder7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0991() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0991");
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
    io.github.onograph.cluster.raft.control.AppComProFamilyGroupType appComProFamilyGroupType33 = io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL;
    io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo viewClusterInfo34 = io.github.onograph.cluster.raft.module.dprot.impl.structure.ViewClusterInfo.EMT_VIEW_CLUSTER_INFO;
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType35 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer36 = applicationComProFamilyType35.getImpl();
    boolean boolean37 = viewClusterInfo34.equals((java.lang.Object) entProVer36);
    io.github.onograph.cluster.raft.control.ApplicationComProFamilyType applicationComProFamilyType38 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.exiaccproApplicationComProFamilyType();
    io.github.onograph.config.EntProVer entProVer39 = applicationComProFamilyType38.getImpl();
    int int40 = entProVer36.compareTo(entProVer39);
    java.util.Optional<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyOptional41 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.finOptional(
        appComProFamilyGroupType33, entProVer39);
    java.util.List<io.github.onograph.cluster.raft.control.ApplicationComProFamily> applicationComProFamilyList42 = io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.ctgrAppComProFamilyGroupType(
        appComProFamilyGroupType33);
    try {
      io.github.onograph.cluster.raft.control.connect.AbstractComProFamilyWrapper<io.github.onograph.config.EntProVer, io.github.onograph.cluster.raft.control.ApplicationComProFamily> entProVerAbstractComProFamilyWrapper43 = comProFamilyManagerAppImpl5.geaAbstractComProFamilyWrapper(
          (java.util.Collection<io.github.onograph.config.EntProVer>) entProVerSet32,
          (io.github.onograph.cluster.raft.control.ComProFamily.ComProFamilyGroup<io.github.onograph.cluster.raft.control.ApplicationComProFamily>) appComProFamilyGroupType33);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: 50847f88-b523-4bbc-ac37-dfb7b08dd98b");
    } catch (java.lang.IllegalArgumentException e) {
    }
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
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(viewClusterInfo17);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType18 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType18.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
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
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNotNull(entProVerSet32);
    org.junit.Assert.assertTrue("'" + appComProFamilyGroupType33 + "' != '"
            + io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL + "'",
        appComProFamilyGroupType33.equals(
            io.github.onograph.cluster.raft.control.AppComProFamilyGroupType.RAFT_PROTOCOL));
    org.junit.Assert.assertNotNull(viewClusterInfo34);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType35 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType35.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + applicationComProFamilyType38 + "' != '"
            + io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV + "'",
        applicationComProFamilyType38.equals(
            io.github.onograph.cluster.raft.control.ApplicationComProFamilyType.CT_CURRV));
    org.junit.Assert.assertNotNull(entProVer39);
    org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    org.junit.Assert.assertNotNull(applicationComProFamilyOptional41);
    org.junit.Assert.assertNotNull(applicationComProFamilyList42);
  }

  @Test
  public void test0992() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0992");
    }
    io.netty.buffer.ByteBuf byteBuf0 = null;
    byte[] byteArray2 = new byte[]{(byte) 9};
    org.neo4j.kernel.database.DatabaseId databaseId3 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.ReplicaTokenType replicaTokenType5 = null;
    io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData requestData6 = new io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData(
        byteArray2, databaseId3, "name", replicaTokenType5);
    org.neo4j.kernel.database.DatabaseId databaseId7 = requestData6.daasidDatabaseId();
    try {
      io.github.onograph.cluster.raft.share.meta.fsm.comp.DataMarshaller.maslForReBy(byteBuf0,
          requestData6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(byteArray2);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[9]");
    org.junit.Assert.assertNull(databaseId7);
  }

  @Test
  public void test0993() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0993");
    }
    io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder snapshotDataMessageToByteEncoder0 = new io.github.onograph.cluster.raft.share.meta.pit.SnapshotDataMessageToByteEncoder();
    io.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
    io.github.onograph.cluster.raft.share.sync.SyncStatus syncStatus2 = new io.github.onograph.cluster.raft.share.sync.SyncStatus();
    io.netty.channel.ChannelPromise channelPromise3 = null;
    try {
      snapshotDataMessageToByteEncoder0.write(channelHandlerContext1,
          (java.lang.Object) syncStatus2, channelPromise3);
      org.junit.Assert.fail(
          "Expected exception of type io.netty.handler.codec.EncoderException; message: java.lang.NullPointerException");
    } catch (io.netty.handler.codec.EncoderException e) {
    }
  }

  @Test
  public void test0994() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0994");
    }
    io.netty.bootstrap.Bootstrap bootstrap0 = null;
    io.netty.channel.pool.ChannelPoolHandler channelPoolHandler1 = null;
    io.github.onograph.cluster.raft.netty.NettyChannelPoolBuilder nettyChannelPoolBuilder2 = null;
    io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl lBNettyChannelPoolMapImpl4 = new io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl(
        bootstrap0, channelPoolHandler1, nettyChannelPoolBuilder2, (int) (byte) 9);
    io.github.onograph.cluster.raft.netty.LBNettyChannelPoolMapImpl.ConsensusSocketAddressDTO consensusSocketAddressDTO5 = null;
    try {
      boolean boolean6 = lBNettyChannelPoolMapImpl4.remove(consensusSocketAddressDTO5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: key");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0995() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0995");
    }
    io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType catchupManagerStatusType0 = io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT;
    org.junit.Assert.assertTrue("'" + catchupManagerStatusType0 + "' != '"
        + io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT
        + "'", catchupManagerStatusType0.equals(
        io.github.onograph.cluster.raft.module.cuprot.RefCatchupManagerImpl.CatchupManagerStatusType.MSG_TYPE_IDNT));
  }

  @Test
  public void test0996() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0996");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMetaMessageToByteEncoder requestAuthMetaMessageToByteEncoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMetaMessageToByteEncoder();
  }

  @Test
  public void test0997() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0997");
    }
    io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder requestSnapshotByteToMessageDecoder0 = new io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestSnapshotByteToMessageDecoder();
    io.netty.handler.codec.ByteToMessageDecoder.Cumulator cumulator1 = io.netty.handler.codec.ByteToMessageDecoder.MERGE_CUMULATOR;
    requestSnapshotByteToMessageDecoder0.setCumulator(cumulator1);
    io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
    requestSnapshotByteToMessageDecoder0.handlerRemoved(channelHandlerContext3);
    io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
    try {
      requestSnapshotByteToMessageDecoder0.channelReadComplete(channelHandlerContext5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(cumulator1);
  }

  @Test
  public void test0998() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0998");
    }
    org.neo4j.dbms.identity.ServerId serverId0 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbMetaActor.FinalizeMInfo finalizeMInfo1 = new io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbMetaActor.FinalizeMInfo(
        serverId0);
  }

  @Test
  public void test0999() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0999");
    }
    akka.actor.ActorRef actorRef0 = null;
    io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaReadReplicaImpl gdbDiscoveryMetaReadReplicaImpl1 = null;
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap2 = null;
    akka.actor.ActorRef actorRef3 = null;
    org.neo4j.dbms.identity.ServerId serverId4 = null;
    io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo updateReadReplicaInfo5 = new io.github.onograph.cluster.raft.module.dprot.impl.readreplicatopology.UpdateReadReplicaInfo(
        actorRef0, gdbDiscoveryMetaReadReplicaImpl1, databaseIdMap2, actorRef3, serverId4);
    java.util.Map<org.neo4j.kernel.database.DatabaseId, io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper> databaseIdMap6 = updateReadReplicaInfo5.getMapDsdd();
    akka.actor.ActorRef actorRef7 = updateReadReplicaInfo5.getTcActorRef();
    org.junit.Assert.assertNull(databaseIdMap6);
    org.junit.Assert.assertNull(actorRef7);
  }

  @Test
  public void test1000() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test1000");
    }
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray0 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList1 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean2 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1,
        socketAddressArray0);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService3 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1);
    org.neo4j.configuration.helpers.SocketAddress[] socketAddressArray4 = new org.neo4j.configuration.helpers.SocketAddress[]{};
    java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress> socketAddressList5 = new java.util.ArrayList<org.neo4j.configuration.helpers.SocketAddress>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5,
        socketAddressArray4);
    io.github.onograph.cluster.raft.module.dprot.MemberNodeService memberNodeService7 = io.github.onograph.cluster.raft.module.dprot.DiscoverySocketAddressManagerDefaultImpl.reoeMemberNodeService(
        (java.util.List<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5);
    java.util.Spliterator<org.neo4j.configuration.helpers.SocketAddress> socketAddressSpliterator8 = socketAddressList5.spliterator();
    java.util.Spliterator<org.neo4j.configuration.helpers.SocketAddress> socketAddressSpliterator9 = socketAddressList5.spliterator();
    boolean boolean10 = io.github.onograph.cluster.raft.share.calg.VotingMemberThreshold.isQuu(
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList1,
        (java.util.Collection<org.neo4j.configuration.helpers.SocketAddress>) socketAddressList5);
    org.junit.Assert.assertNotNull(socketAddressArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(memberNodeService3);
    org.junit.Assert.assertNotNull(socketAddressArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(memberNodeService7);
    org.junit.Assert.assertNotNull(socketAddressSpliterator8);
    org.junit.Assert.assertNotNull(socketAddressSpliterator9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }
}
