package io.github.onograph.test;

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
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onShutdown(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0002");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.graphdb.facade.ExternalDependencies externalDependencies1 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService2 = io.github.onograph.server.DefaultDatabaseManagementServiceBuilder.cremgtsiDatabaseManagementService(
          config0, externalDependencies1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0003");
    }
    java.io.File file0 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
          file0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0004");
    }
    io.github.onograph.dbms.serverproc.WaitingReplyMetaType waitingReplyMetaType0 = io.github.onograph.dbms.serverproc.WaitingReplyMetaType.Incomplete;
    org.junit.Assert.assertTrue("'" + waitingReplyMetaType0 + "' != '"
            + io.github.onograph.dbms.serverproc.WaitingReplyMetaType.Incomplete + "'",
        waitingReplyMetaType0.equals(
            io.github.onograph.dbms.serverproc.WaitingReplyMetaType.Incomplete));
  }

  @Test
  public void test0005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0005");
    }
    org.neo4j.graphdb.factory.module.GlobalModule globalModule0 = null;
    try {
      io.github.onograph.module.edition.DefaultEnterpriseModule defaultEnterpriseModule1 = new io.github.onograph.module.edition.DefaultEnterpriseModule(
          globalModule0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0006");
    }
    java.util.function.Predicate<java.lang.String> strPredicate0 = io.github.onograph.cluster.raft.shared.AbstractClusterModule.fiwarfnfiPredicate();
    org.junit.Assert.assertNotNull(strPredicate0);
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0007");
    }
    int int0 = org.neo4j.server.NeoBootstrapper.OK;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0008");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder5 = clusteringDBMSBuilder1.setConfigRaw(
          strMap4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
  }

  @Test
  public void test0009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0009");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = clusteringDBMSBuilder1.build();
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService4 = clusteringDBMSBuilder3.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0011");
    }
    int int0 = org.neo4j.internal.kernel.api.TokenRead.ANY_LABEL;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0012");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager clusterDiscoveryManager0 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule1 = null;
    try {
      io.github.onograph.cluster.raft.share.CoreModule coreModule2 = new io.github.onograph.cluster.raft.share.CoreModule(
          clusterDiscoveryManager0, globalModule1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0013");
    }
    org.neo4j.kernel.impl.factory.DbmsInfo dbmsInfo0 = null;
    java.util.function.Function<org.neo4j.graphdb.factory.module.GlobalModule, org.neo4j.graphdb.factory.module.edition.AbstractEditionModule> globalModuleFunction1 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceFactoryClusteringImpl databaseManagementServiceFactoryClusteringImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceFactoryClusteringImpl(
        dbmsInfo0, globalModuleFunction1);
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.graphdb.facade.ExternalDependencies externalDependencies4 = null;
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = databaseManagementServiceFactoryClusteringImpl2.build(
          config3, externalDependencies4);
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray6 = new java.lang.String[]{"hi!", ""};
    try {
      int int7 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNotNull(strArray6);
  }

  @Test
  public void test0015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0015");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.function.ThrowingAction throwingAction1 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle2 = org.neo4j.kernel.lifecycle.LifecycleAdapter.simpleLife(
        throwingAction0, throwingAction1);
    org.junit.Assert.assertNotNull(lifecycle2);
  }

  @Test
  public void test0016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0016");
    }
    org.neo4j.graphdb.factory.module.GlobalModule globalModule0 = null;
    try {
      io.github.onograph.server.security.systemgraph.EnhancedDefaultDatabaseResolver enhancedDefaultDatabaseResolver1 = io.github.onograph.module.edition.EnterpriseModule.madetdbreeEnhancedDefaultDatabaseResolver(
          globalModule0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0017");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    java.lang.Class<?> wildcardClass3 = basicProcedureClusterMakeGdbDefaultImpl2.getClass();
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0018");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.kernel.api.procedure.Context context3 = null;
    org.neo4j.values.AnyValue anyValue4 = null;
    org.neo4j.values.AnyValue[] anyValueArray5 = new org.neo4j.values.AnyValue[]{anyValue4};
    org.neo4j.kernel.api.ResourceTracker resourceTracker6 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator7 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context3, anyValueArray5, resourceTracker6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(anyValueArray5);
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0019");
    }
    org.neo4j.cli.ExecutionContext executionContext0 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl1 = new io.github.onograph.dbms.commands.CommandGetServerIdImpl(
          executionContext0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0020");
    }
    java.time.Clock clock0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    org.neo4j.dbms.identity.ServerId serverId2 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaService metaService3 = null;
    org.neo4j.configuration.helpers.SocketAddress socketAddress4 = null;
    try {
      io.github.onograph.dbms.serverproc.BasicProcedureWaitingImpl basicProcedureWaitingImpl5 = io.github.onograph.dbms.serverproc.BasicProcedureWaitingImpl.stnleBasicProcedureWaitingImpl(
          clock0, logProvider1, serverId2, metaService3, socketAddress4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0021");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0022");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterDiscoveryManager clusterDiscoveryManager0 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule1 = null;
    try {
      io.github.onograph.cluster.raft.readreplica.ReadReplicaModule readReplicaModule2 = new io.github.onograph.cluster.raft.readreplica.ReadReplicaModule(
          clusterDiscoveryManager0, globalModule1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0023");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setConfigRaw(
          strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0024");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener2 = null;
    try {
      databaseManagementServiceClusterImpl1.unregisterDatabaseEventListener(databaseEventListener2);
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    java.nio.file.Path path3 = null;
    java.nio.file.Path path4 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    try {
      int int7 = enhancedBootstrapper0.start(path3, path4, strMap5, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0026");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    java.nio.file.Path path4 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    try {
      int int6 = enhancedBootstrapper0.start(path4, strMap5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0027");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray9 = new java.lang.String[]{"", "hi!", "enterprise", ""};
    try {
      int int10 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray9);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertNotNull(strArray9);
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0028");
    }
    io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType storeFormatType0 = io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_ALIGNED;
    org.junit.Assert.assertTrue("'" + storeFormatType0 + "' != '"
            + io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_ALIGNED + "'",
        storeFormatType0.equals(
            io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_ALIGNED));
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0029");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.shutdownDatabase("");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.shutdownDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0031");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      boolean boolean4 = databaseManagementServiceClusterImpl1.isWraeForSt("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0032");
    }
    io.github.onograph.dbms.utils.SchemaQueryGenService schemaQueryGenService0 = new io.github.onograph.dbms.utils.SchemaQueryGenService();
  }

  @Test
  public void test0033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0033");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onStart(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0034");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl databaseStateProcedureClusterImpl2 = new io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = databaseStateProcedureClusterImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context4 = null;
    org.neo4j.values.AnyValue[] anyValueArray5 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker6 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator7 = databaseStateProcedureClusterImpl2.apply(
          context4, anyValueArray5, resourceTracker6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: Illegal input:[]");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(anyValueArray5);
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0035");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      java.util.List<java.lang.String> strList3 = databaseManagementServiceClusterImpl2.listDatabases();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0036");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.io.pagecache.PageCache pageCache1 = null;
    io.github.onograph.cluster.raft.share.GdbUtilWrapperServiceImpl gdbUtilWrapperServiceImpl2 = new io.github.onograph.cluster.raft.share.GdbUtilWrapperServiceImpl(
        fileSystemAbstraction0, pageCache1);
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path5 = null;
    try {
      io.github.onograph.cluster.raft.utils.GdbUtilWrapper gdbUtilWrapper6 = gdbUtilWrapperServiceImpl2.sttrdasGdbUtilWrapper(
          config3, true, path5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0037");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      databaseManagementServiceClusterImpl1.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0038");
    }
    io.github.onograph.dbms.gdb.ClusteredAbstractMultipleGdbDatabaseManager clusteredAbstractMultipleGdbDatabaseManager0 = null;
    io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade clusterSimpleStorageFacade1 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule2 = null;
    io.github.onograph.dbms.HealthMonitorService healthMonitorService3 = null;
    io.github.onograph.dbms.MediationDbmsManagers mediationDbmsManagers4 = null;
    io.github.onograph.dbms.GdbReplicator gdbReplicator5 = null;
    io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl6 = null;
    org.neo4j.bolt.txtracking.ReconciledTransactionTracker reconciledTransactionTracker7 = null;
    try {
      io.github.onograph.dbms.ClusteredDbmsReconcilerLifecycleAdapter clusteredDbmsReconcilerLifecycleAdapter8 = new io.github.onograph.dbms.ClusteredDbmsReconcilerLifecycleAdapter(
          clusteredAbstractMultipleGdbDatabaseManager0, clusterSimpleStorageFacade1, globalModule2,
          healthMonitorService3, mediationDbmsManagers4, gdbReplicator5,
          systemGraphDbmsModelClusterImpl6, reconciledTransactionTracker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0039");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService3 = databaseManagementServiceClusterImpl1.database(
          "");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.dropDatabase("enterprise");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService9 = clusteringDBMSBuilder8.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0042");
    }
    io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType storeFormatType0 = io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_MATCHING;
    org.junit.Assert.assertTrue("'" + storeFormatType0 + "' != '"
            + io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_MATCHING + "'",
        storeFormatType0.equals(
            io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_MATCHING));
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0043");
    }
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.clsrBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.kernel.api.procedure.Context context6 = null;
    org.neo4j.values.AnyValue anyValue7 = null;
    org.neo4j.values.AnyValue[] anyValueArray8 = new org.neo4j.values.AnyValue[]{anyValue7};
    org.neo4j.kernel.api.ResourceTracker resourceTracker9 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator10 = basicProcedureQuarantineDatabaseImpl4.apply(
          context6, anyValueArray8, resourceTracker9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: c3bc6648-f892-4d86-9614-b53ef18de3fb");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(anyValueArray8);
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0044");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray9 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray9);
    try {
      int int11 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray9);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNotNull(strArray9);
  }

  @Test
  public void test0045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0045");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray8 = new java.lang.String[]{"", "hi!", "enterprise"};
    try {
      int int9 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray8);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertNotNull(strArray8);
  }

  @Test
  public void test0046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0046");
    }
    org.neo4j.kernel.database.DefaultDatabaseResolver defaultDatabaseResolver0 = null;
    io.github.onograph.server.security.DefaultSecurityLog defaultSecurityLog1 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule2 = null;
    try {
      org.neo4j.kernel.api.security.provider.SecurityProvider securityProvider3 = io.github.onograph.module.edition.EnterpriseModule.maenrsetmuSecurityProvider(
          defaultDatabaseResolver0, defaultSecurityLog1, globalModule2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0047");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.io.pagecache.PageCache pageCache1 = null;
    io.github.onograph.cluster.raft.share.GdbUtilWrapperServiceImpl gdbUtilWrapperServiceImpl2 = new io.github.onograph.cluster.raft.share.GdbUtilWrapperServiceImpl(
        fileSystemAbstraction0, pageCache1);
    org.neo4j.configuration.Config config3 = null;
    java.nio.file.Path path5 = null;
    try {
      io.github.onograph.cluster.raft.utils.GdbUtilWrapper gdbUtilWrapper6 = gdbUtilWrapperServiceImpl2.sttrdasGdbUtilWrapper(
          config3, false, path5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0048");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl databaseStateProcedureClusterImpl2 = new io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = databaseStateProcedureClusterImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context4 = null;
    org.neo4j.values.AnyValue anyValue5 = null;
    org.neo4j.values.AnyValue[] anyValueArray6 = new org.neo4j.values.AnyValue[]{anyValue5};
    org.neo4j.kernel.api.ResourceTracker resourceTracker7 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator8 = databaseStateProcedureClusterImpl2.apply(
          context4, anyValueArray6, resourceTracker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'databaseName' value should have a string representation. Instead: null");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(anyValueArray6);
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0049");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder3.setConfigRaw(
          strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
  }

  @Test
  public void test0050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0050");
    }
    int int0 = org.neo4j.internal.kernel.api.TokenRead.NO_TOKEN;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0051");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    java.lang.String[] strArray7 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray7);
    try {
      int int9 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray7);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray7);
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0052");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    java.nio.file.Path path1 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
    try {
      int int3 = enhancedBootstrapper0.start(path1, strMap2);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.lang.Class<?> wildcardClass9 = clusteringDBMSBuilder8.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0054");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService6 = clusteringDBMSBuilder3.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
  }

  @Test
  public void test0055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0055");
    }
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO2 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "", "enterprise");
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0056");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      java.util.List<java.lang.String> strList3 = databaseManagementServiceClusterImpl1.listDatabases();
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
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onInit(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0058");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener3 = null;
    try {
      databaseManagementServiceClusterImpl2.unregisterDatabaseEventListener(databaseEventListener3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0059");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.shutdownDatabase("hi!");
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
    int int0 = org.neo4j.internal.kernel.api.TokenRead.ANY_RELATIONSHIP_TYPE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0061");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout1 = null;
    io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType storeFormatType2 = io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_HL_TYPE;
    java.lang.String[] strArray5 = new java.lang.String[]{"enterprise"};
    java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList6, strArray5);
    java.util.List<java.lang.String> strList8 = null;
    java.lang.String[] strArray10 = new java.lang.String[]{"enterprise"};
    java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList11, strArray10);
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO15 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO18 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "", "enterprise");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO21 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "enterprise", "hi!");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO24 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "hi!");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO[] tokenNamePropertyDTOArray25 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO[]{
        tokenNamePropertyDTO15, tokenNamePropertyDTO18, tokenNamePropertyDTO21,
        tokenNamePropertyDTO24};
    java.util.ArrayList<io.github.onograph.dbms.utils.TokenNamePropertyDTO> tokenNamePropertyDTOList26 = new java.util.ArrayList<io.github.onograph.dbms.utils.TokenNamePropertyDTO>();
    boolean boolean27 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.dbms.utils.TokenNamePropertyDTO>) tokenNamePropertyDTOList26,
        tokenNamePropertyDTOArray25);
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO30 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    java.lang.String str31 = tokenNamePropertyDTO30.getStrNt();
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO34 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "enterprise", "hi!");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO37 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    java.lang.String str38 = tokenNamePropertyDTO37.getStrNt();
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO41 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "enterprise", "hi!");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO[] tokenNamePropertyDTOArray42 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO[]{
        tokenNamePropertyDTO30, tokenNamePropertyDTO34, tokenNamePropertyDTO37,
        tokenNamePropertyDTO41};
    java.util.ArrayList<io.github.onograph.dbms.utils.TokenNamePropertyDTO> tokenNamePropertyDTOList43 = new java.util.ArrayList<io.github.onograph.dbms.utils.TokenNamePropertyDTO>();
    boolean boolean44 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.dbms.utils.TokenNamePropertyDTO>) tokenNamePropertyDTOList43,
        tokenNamePropertyDTOArray42);
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO47 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "hi!");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO50 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "", "enterprise");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO53 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "enterprise", "hi!");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO56 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO59 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "", "enterprise");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO62 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    java.lang.String str63 = tokenNamePropertyDTO62.getStrNt();
    java.lang.String str64 = tokenNamePropertyDTO62.getStrNp();
    io.github.onograph.dbms.utils.TokenNamePropertyDTO[] tokenNamePropertyDTOArray65 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO[]{
        tokenNamePropertyDTO47, tokenNamePropertyDTO50, tokenNamePropertyDTO53,
        tokenNamePropertyDTO56, tokenNamePropertyDTO59, tokenNamePropertyDTO62};
    java.util.ArrayList<io.github.onograph.dbms.utils.TokenNamePropertyDTO> tokenNamePropertyDTOList66 = new java.util.ArrayList<io.github.onograph.dbms.utils.TokenNamePropertyDTO>();
    boolean boolean67 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.dbms.utils.TokenNamePropertyDTO>) tokenNamePropertyDTOList66,
        tokenNamePropertyDTOArray65);
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO70 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    java.lang.String str71 = tokenNamePropertyDTO70.getStrNt();
    java.lang.String str72 = tokenNamePropertyDTO70.getStrNp();
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO75 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO78 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "", "enterprise");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO81 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    java.lang.String str82 = tokenNamePropertyDTO81.getStrNt();
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO85 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    java.lang.String str86 = tokenNamePropertyDTO85.getStrNt();
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO89 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "");
    io.github.onograph.dbms.utils.TokenNamePropertyDTO[] tokenNamePropertyDTOArray90 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO[]{
        tokenNamePropertyDTO70, tokenNamePropertyDTO75, tokenNamePropertyDTO78,
        tokenNamePropertyDTO81, tokenNamePropertyDTO85, tokenNamePropertyDTO89};
    java.util.ArrayList<io.github.onograph.dbms.utils.TokenNamePropertyDTO> tokenNamePropertyDTOList91 = new java.util.ArrayList<io.github.onograph.dbms.utils.TokenNamePropertyDTO>();
    boolean boolean92 = java.util.Collections.addAll(
        (java.util.Collection<io.github.onograph.dbms.utils.TokenNamePropertyDTO>) tokenNamePropertyDTOList91,
        tokenNamePropertyDTOArray90);
    java.util.List<java.lang.String> strList93 = org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller.DEFAULT_NAMESPACE;
    java.util.List<java.lang.String> strList94 = org.neo4j.procedure.builtin.routing.AbstractRoutingProcedureInstaller.DEFAULT_NAMESPACE;
    java.io.PrintStream printStream95 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer96 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock97 = null;
    io.github.onograph.dbms.utils.NodeStoreWrapper nodeStoreWrapper98 = new io.github.onograph.dbms.utils.NodeStoreWrapper(
        config0, databaseLayout1, storeFormatType2, false,
        (java.util.List<java.lang.String>) strList6, strList8,
        (java.util.List<java.lang.String>) strList11,
        (java.util.List<io.github.onograph.dbms.utils.TokenNamePropertyDTO>) tokenNamePropertyDTOList26,
        (java.util.List<io.github.onograph.dbms.utils.TokenNamePropertyDTO>) tokenNamePropertyDTOList43,
        (java.util.List<io.github.onograph.dbms.utils.TokenNamePropertyDTO>) tokenNamePropertyDTOList66,
        (java.util.List<io.github.onograph.dbms.utils.TokenNamePropertyDTO>) tokenNamePropertyDTOList91,
        strList93, strList94, printStream95, pageCacheTracer96, systemNanoClock97);
    org.junit.Assert.assertTrue("'" + storeFormatType2 + "' != '"
            + io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_HL_TYPE + "'",
        storeFormatType2.equals(
            io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_HL_TYPE));
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(strArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(tokenNamePropertyDTOArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    org.junit.Assert.assertNotNull(tokenNamePropertyDTOArray42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    org.junit.Assert.assertNotNull(tokenNamePropertyDTOArray65);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    org.junit.Assert.assertNotNull(tokenNamePropertyDTOArray90);
    org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    org.junit.Assert.assertNotNull(strList93);
    org.junit.Assert.assertNotNull(strList94);
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0062");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver6);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl8 = clusteringDBMSBuilder1.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0063");
    }
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.clsrBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.kernel.api.procedure.Context context6 = null;
    org.neo4j.values.AnyValue[] anyValueArray7 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker8 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator9 = basicProcedureQuarantineDatabaseImpl4.apply(
          context6, anyValueArray7, resourceTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: fe8ab484-a650-4ba7-a59f-194832c36aaa");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(anyValueArray7);
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0064");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener3 = null;
    try {
      databaseManagementServiceClusterImpl1.registerDatabaseEventListener(databaseEventListener3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0065");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    org.neo4j.cli.ExecutionContext executionContext1 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl2 = commandGetServerIdCommandProvider0.createCommand(
          executionContext1);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService4 = databaseManagementServiceClusterImpl2.database(
          "enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0067");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService4 = databaseManagementServiceClusterImpl2.database(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0068");
    }
    java.io.File file0 = null;
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceBuilderEnterpriseImpl databaseManagementServiceBuilderEnterpriseImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceBuilderEnterpriseImpl(
          file0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0069");
    }
    java.lang.String[] strArray6 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray6);
  }

  @Test
  public void test0070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0070");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.setConfigRaw(
          strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0071");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService10 = clusteringDBMSBuilder5.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
  }

  @Test
  public void test0072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0072");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener2 = null;
    try {
      databaseManagementServiceClusterImpl1.registerDatabaseEventListener(databaseEventListener2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0073");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path4 = null;
    java.nio.file.Path path5 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      int int8 = enhancedBootstrapper0.start(path4, path5, strMap6, false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0074");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    java.nio.file.Path path4 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    try {
      int int6 = enhancedBootstrapper0.start(path4, strMap5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0075");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext2 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl3 = commandGetServerIdCommandProvider0.createCommand(
          executionContext2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
  }

  @Test
  public void test0076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0076");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path9);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl11 = clusteringDBMSBuilder3.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0077");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      boolean boolean4 = databaseManagementServiceClusterImpl2.isWraeForSt("");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.createDatabase("enterprise");
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
    io.github.onograph.cluster.raft.readreplica.ReadReplicaModule readReplicaModule0 = null;
    org.neo4j.graphdb.factory.module.GlobalModule globalModule1 = null;
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    try {
      io.github.onograph.cluster.raft.readreplica.EditionDatabaseComponentsReadReplicaClusterGdbImpl editionDatabaseComponentsReadReplicaClusterGdbImpl3 = new io.github.onograph.cluster.raft.readreplica.EditionDatabaseComponentsReadReplicaClusterGdbImpl(
          readReplicaModule0, globalModule1, namedDatabaseId2);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.startDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0081");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo clusterMetaTopologyInfo2 = null;
    org.neo4j.io.layout.Neo4jLayout neo4jLayout3 = null;
    try {
      io.github.onograph.dbms.MetaUpgradeFlowActionStagingImpl.LifecycleAdapterDefaultImpl lifecycleAdapterDefaultImpl4 = new io.github.onograph.dbms.MetaUpgradeFlowActionStagingImpl.LifecycleAdapterDefaultImpl(
          fileSystemAbstraction0, logProvider1, clusterMetaTopologyInfo2, neo4jLayout3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0082");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService4 = databaseManagementServiceClusterImpl1.database(
          "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0083");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      boolean boolean3 = databaseManagementServiceClusterImpl1.isWraeForSt("hi!");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.config.Configuration configuration5 = null;
    try {
      databaseManagementServiceClusterImpl2.createDatabase("", configuration5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0085");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.dropDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0086");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    java.nio.file.Path path4 = null;
    java.nio.file.Path path5 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      int int8 = enhancedBootstrapper0.start(path4, path5, strMap6, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0087");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener3 = null;
    try {
      databaseManagementServiceClusterImpl2.registerDatabaseEventListener(databaseEventListener3);
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
    io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType storeFormatType0 = io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_STANDARD;
    org.junit.Assert.assertTrue("'" + storeFormatType0 + "' != '"
            + io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_STANDARD + "'",
        storeFormatType0.equals(
            io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_STANDARD));
  }

  @Test
  public void test0089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0089");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl databaseStateProcedureClusterImpl2 = new io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.kernel.api.procedure.Context context3 = null;
    org.neo4j.values.AnyValue[] anyValueArray4 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker5 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator6 = databaseStateProcedureClusterImpl2.apply(
          context3, anyValueArray4, resourceTracker5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: Illegal input:[]");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(anyValueArray4);
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0090");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int2 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext3 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand4 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
  }

  @Test
  public void test0091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0091");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext2 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand3 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0092");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      java.util.List<java.lang.String> strList4 = databaseManagementServiceClusterImpl3.listDatabases();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0093");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray12 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray12);
    try {
      int int14 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray12);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(strArray12);
  }

  @Test
  public void test0094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0094");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0095");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      databaseManagementServiceClusterImpl1.startDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0096");
    }
    org.neo4j.io.layout.Neo4jLayout neo4jLayout0 = null;
    io.github.onograph.dbms.MetaUpgradeFlowActionStagingImpl metaUpgradeFlowActionStagingImpl1 = new io.github.onograph.dbms.MetaUpgradeFlowActionStagingImpl(
        neo4jLayout0);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    try {
      metaUpgradeFlowActionStagingImpl1.pefmseForUp(upgradeMetaEnv2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0097");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.startDatabase("hi!");
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
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int2 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int3 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext4 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand5 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0099");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    org.neo4j.cli.ExecutionContext executionContext1 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand2 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext1);
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
    java.lang.String[] strArray6 = new java.lang.String[]{"enterprise", "enterprise", "hi!", "hi!",
        "enterprise", "enterprise"};
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray6);
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0101");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener5 = null;
    try {
      databaseManagementServiceClusterImpl2.unregisterDatabaseEventListener(databaseEventListener5);
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    java.nio.file.Path path6 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
    try {
      int int8 = enhancedBootstrapper0.start(path6, strMap7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0103");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder9.loadPropertiesFromFile(
        "enterprise");
    java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder11.setConfigRaw(
          strMap12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0104");
    }
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO2 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "", "hi!");
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0105");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    java.lang.String[] strArray6 = new java.lang.String[]{"enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    try {
      int int8 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertNotNull(strArray6);
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0106");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.kernel.api.procedure.Context context3 = null;
    org.neo4j.values.AnyValue[] anyValueArray4 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker5 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator6 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context3, anyValueArray4, resourceTracker5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(anyValueArray4);
  }

  @Test
  public void test0107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0107");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "hi!");
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder3.setConfigRaw(
          strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0108");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path2 = null;
    java.nio.file.Path path3 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
    try {
      int int6 = enhancedBootstrapper0.start(path2, path3, strMap4, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0109");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.config.Configuration configuration6 = null;
    try {
      databaseManagementServiceClusterImpl4.createDatabase("", configuration6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0110");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setMonitors(
        monitors9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener11);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService13 = clusteringDBMSBuilder5.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0111");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    java.nio.file.Path path4 = null;
    java.nio.file.Path path5 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      int int8 = enhancedBootstrapper0.start(path4, path5, strMap6, false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0112");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      databaseManagementServiceClusterImpl2.shutdownDatabase("");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path9);
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder10.setExternalDependencies(
        dependencyResolver11);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule14 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder15 = databaseManagementServiceBuilder12.addURLAccessRule(
        "enterprise", uRLAccessRule14);
    java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder17 = databaseManagementServiceBuilder15.setConfigRaw(
          strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder15);
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0114");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    int int1 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext2 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl3 = commandGetServerIdCommandProvider0.createCommand(
          executionContext2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
  }

  @Test
  public void test0115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0115");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    java.nio.file.Path path4 = null;
    java.nio.file.Path path5 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      int int8 = enhancedBootstrapper0.start(path4, path5, strMap6, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0116");
    }
    java.time.Clock clock0 = null;
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    io.github.onograph.cluster.raft.module.cuprot.current.info.MetaService metaService3 = null;
    io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService remoteMetaService4 = null;
    org.neo4j.dbms.identity.ServerIdentity serverIdentity5 = null;
    try {
      io.github.onograph.dbms.serverproc.BasicProcedureWaitingImpl basicProcedureWaitingImpl6 = io.github.onograph.dbms.serverproc.BasicProcedureWaitingImpl.clsrBasicProcedureWaitingImpl(
          clock0, clusterStructureService1, logProvider2, metaService3, remoteMetaService4,
          serverIdentity5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0117");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.createDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0118");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    org.neo4j.graphdb.config.Configuration configuration4 = null;
    try {
      databaseManagementServiceClusterImpl2.createDatabase("hi!", configuration4);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      databaseManagementServiceClusterImpl2.startDatabase("hi!");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder3.setConfigRaw(
          strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0121");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl3.shutdownDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0122");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    java.nio.file.Path path5 = null;
    java.nio.file.Path path6 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path5, path6, strMap7, false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0123");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.config.Configuration configuration6 = null;
    try {
      databaseManagementServiceClusterImpl4.createDatabase("enterprise", configuration6);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.dropDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0125");
    }
    org.neo4j.cli.ExecutionContext executionContext0 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand1 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand(
          executionContext0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0126");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl4.startDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0127");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.dropDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0128");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.common.DependencyResolver dependencyResolver5 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder6 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver5);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        "enterprise");
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder1.setConfigRaw(
          strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0129");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    int int1 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext3 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl4 = commandGetServerIdCommandProvider0.createCommand(
          executionContext3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0130");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path4 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    try {
      int int6 = enhancedBootstrapper0.start(path4, strMap5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0131");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl databaseStateProcedureClusterImpl2 = new io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.kernel.api.procedure.Context context3 = null;
    org.neo4j.values.AnyValue anyValue4 = null;
    org.neo4j.values.AnyValue[] anyValueArray5 = new org.neo4j.values.AnyValue[]{anyValue4};
    org.neo4j.kernel.api.ResourceTracker resourceTracker6 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator7 = databaseStateProcedureClusterImpl2.apply(
          context3, anyValueArray5, resourceTracker6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'databaseName' value should have a string representation. Instead: null");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(anyValueArray5);
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0132");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray11 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray11);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray11);
    try {
      int int14 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray11);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertNotNull(strArray11);
  }

  @Test
  public void test0133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0133");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl5.startDatabase("");
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
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO2 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "hi!", "hi!");
    java.lang.String str3 = tokenNamePropertyDTO2.getStrNp();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0135");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = databaseManagementServiceBuilder7.addDatabaseListener(
        databaseEventListener8);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService10 = databaseManagementServiceBuilder7.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0136");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.dropDatabase("enterprise");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.createDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0138");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.logging.LogProvider logProvider8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder7.setUserLogProvider(
        logProvider8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder9.setUserLogProvider(
        logProvider10);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService12 = databaseManagementServiceBuilder11.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0139");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder1.setConfigRaw(
          strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0140");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log5 = enhancedBootstrapper0.getLog();
    boolean boolean6 = enhancedBootstrapper0.isRunning();
    java.lang.String[] strArray9 = new java.lang.String[]{"enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray9);
    try {
      int int11 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray9);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertNotNull(log5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(strArray9);
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0141");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl5.shutdownDatabase("hi!");
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    java.lang.String[] strArray8 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray8);
    try {
      int int10 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray8);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(strArray8);
  }

  @Test
  public void test0143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0143");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder3.setMonitors(
        monitors9);
    java.lang.String str11 = clusteringDBMSBuilder3.getEdition();
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl12 = clusteringDBMSBuilder3.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "enterprise" + "'", str11, "enterprise");
  }

  @Test
  public void test0144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0144");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    java.nio.file.Path path5 = null;
    java.nio.file.Path path6 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path5, path6, strMap7, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0145");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      boolean boolean7 = databaseManagementServiceClusterImpl4.isWraeForSt("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0146");
    }
    java.lang.String[] strArray6 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray6);
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0147");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.dropDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0148");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder1.setMonitors(
        monitors7);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService9 = clusteringDBMSBuilder8.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0149");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder8.loadPropertiesFromFile(
        path9);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl11 = clusteringDBMSBuilder8.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0150");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService6 = databaseManagementServiceClusterImpl2.database(
          "");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "hi!");
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = databaseManagementServiceBuilder7.addDatabaseListener(
        databaseEventListener8);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService10 = databaseManagementServiceBuilder7.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
  }

  @Test
  public void test0152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0152");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener3 = null;
    try {
      databaseManagementServiceClusterImpl2.unregisterDatabaseEventListener(databaseEventListener3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0153");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      boolean boolean3 = databaseManagementServiceClusterImpl1.isWraeForSt("enterprise");
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
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    java.lang.Class<?> wildcardClass4 = commandType3.getClass();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0155");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService4 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService5 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path6 = null;
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int10 = enhancedBootstrapper0.start(path6, path7, strMap8, false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNull(databaseManagementService4);
    org.junit.Assert.assertNull(databaseManagementService5);
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0156");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.config.Configuration configuration5 = null;
    try {
      databaseManagementServiceClusterImpl3.createDatabase("hi!", configuration5);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.createDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0158");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl3.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0159");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl3.dropDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0160");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      databaseManagementServiceClusterImpl1.dropDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0161");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener5 = null;
    try {
      databaseManagementServiceClusterImpl4.registerDatabaseEventListener(databaseEventListener5);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    java.lang.Class<?> wildcardClass9 = clusteringDBMSBuilder6.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0163");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    org.neo4j.graphdb.config.Configuration configuration4 = null;
    try {
      databaseManagementServiceClusterImpl1.createDatabase("hi!", configuration4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0164");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    java.lang.String str10 = clusteringDBMSBuilder5.getEdition();
    java.nio.file.Path path11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path11);
    java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder5.setConfigRaw(
          strMap13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "enterprise" + "'", str10, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
  }

  @Test
  public void test0165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0165");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener4 = null;
    try {
      databaseManagementServiceClusterImpl3.registerDatabaseEventListener(databaseEventListener4);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl5.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0167");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.shutdownDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0168");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder7.setExternalDependencies(
        dependencyResolver8);
    java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder7.setConfigRaw(
          strMap10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0169");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      databaseManagementServiceClusterImpl1.createDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0170");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl4.createDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0171");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl3.dropDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0172");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener3 = null;
    try {
      databaseManagementServiceClusterImpl1.unregisterDatabaseEventListener(databaseEventListener3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0173");
    }
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.stnleBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.kernel.api.procedure.Context context5 = null;
    org.neo4j.values.AnyValue[] anyValueArray6 = null;
    org.neo4j.kernel.api.ResourceTracker resourceTracker7 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator8 = basicProcedureQuarantineDatabaseImpl4.apply(
          context5, anyValueArray6, resourceTracker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
  }

  @Test
  public void test0174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0174");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder3.setConfigRaw(
          strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0175");
    }
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.stnleBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.kernel.api.procedure.Context context6 = null;
    org.neo4j.values.AnyValue anyValue7 = null;
    org.neo4j.values.AnyValue[] anyValueArray8 = new org.neo4j.values.AnyValue[]{anyValue7};
    org.neo4j.kernel.api.ResourceTracker resourceTracker9 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator10 = basicProcedureQuarantineDatabaseImpl4.apply(
          context6, anyValueArray8, resourceTracker9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: c3bc6648-f892-4d86-9614-b53ef18de3fb");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(anyValueArray8);
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0176");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver2);
    java.nio.file.Path path4 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = databaseManagementServiceBuilder5.setMonitors(
        monitors6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = databaseManagementServiceBuilder7.setMonitors(
        monitors8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0177");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl4.createDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0178");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext3 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand4 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
  }

  @Test
  public void test0179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0179");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    int int5 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray10 = new java.lang.String[]{"hi!", "enterprise", "enterprise",
        "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray10);
    try {
      int int12 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray10);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(strArray10);
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0180");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    org.neo4j.graphdb.config.Configuration configuration4 = null;
    try {
      databaseManagementServiceClusterImpl2.createDatabase("", configuration4);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver2);
    java.nio.file.Path path4 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = databaseManagementServiceBuilder5.setMonitors(
        monitors6);
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = databaseManagementServiceBuilder7.setExternalDependencies(
        dependencyResolver8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0182");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      boolean boolean6 = databaseManagementServiceClusterImpl2.isWraeForSt("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0183");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    java.nio.file.Path path6 = null;
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int10 = enhancedBootstrapper0.start(path6, path7, strMap8, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0184");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    java.nio.file.Path path3 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
    try {
      int int5 = enhancedBootstrapper0.start(path3, strMap4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0185");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService4 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService5 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService6 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path7, strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNull(databaseManagementService4);
    org.junit.Assert.assertNull(databaseManagementService5);
    org.junit.Assert.assertNull(databaseManagementService6);
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0186");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver6);
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder7.setConfigRaw(
          strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0187");
    }
    java.lang.String[] strArray2 = new java.lang.String[]{"enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray2);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray2);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0188");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl6.dropDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0189");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl9 = clusteringDBMSBuilder8.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0190");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService8 = databaseManagementServiceClusterImpl5.database(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0191");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl5.startDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0192");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    java.nio.file.Path path4 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    try {
      int int6 = enhancedBootstrapper0.start(path4, strMap5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0193");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl6.shutdown();
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService4 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path5 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      int int7 = enhancedBootstrapper0.start(path5, strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNull(databaseManagementService4);
  }

  @Test
  public void test0195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0195");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder1.addDatabaseListener(
        databaseEventListener7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0196");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService6 = databaseManagementServiceClusterImpl4.database(
          "enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0197");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl5.shutdownDatabase("");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder5.getEdition();
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener7);
    java.lang.Class<?> wildcardClass9 = clusteringDBMSBuilder8.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0199");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      boolean boolean8 = databaseManagementServiceClusterImpl5.isWraeForSt("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0200");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.logging.LogProvider logProvider8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder7.setUserLogProvider(
        logProvider8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder9.setUserLogProvider(
        logProvider10);
    java.lang.Class<?> wildcardClass12 = databaseManagementServiceBuilder11.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0201");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "hi!");
    org.neo4j.logging.LogProvider logProvider8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder3.setUserLogProvider(
        logProvider8);
    java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder3.setConfigRaw(
          strMap10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
  }

  @Test
  public void test0202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0202");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      java.util.List<java.lang.String> strList2 = databaseManagementServiceClusterImpl1.listDatabases();
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
    java.lang.String[] strArray4 = new java.lang.String[]{"hi!", "enterprise", "enterprise",
        "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray4);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray4);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray4);
  }

  @Test
  public void test0204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0204");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService3 = databaseManagementServiceClusterImpl1.database(
          "enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0205");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl5.dropDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0206");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    org.neo4j.logging.Log log5 = enhancedBootstrapper0.getLog();
    java.lang.String[] strArray7 = new java.lang.String[]{"enterprise"};
    try {
      int int8 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray7);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertNotNull(log5);
    org.junit.Assert.assertNotNull(strArray7);
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0207");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    java.lang.String str11 = clusteringDBMSBuilder5.getEdition();
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl12 = clusteringDBMSBuilder5.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "enterprise" + "'", str11, "enterprise");
  }

  @Test
  public void test0208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0208");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.shutdown();
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider11);
    java.nio.file.Path path13 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.loadPropertiesFromFile(
        path13);
    java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder16 = clusteringDBMSBuilder14.setConfigRaw(
          strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0210");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = clusteringDBMSBuilder3.addDatabaseListener(
        databaseEventListener11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder3.setUserLogProvider(
        logProvider13);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService15 = clusteringDBMSBuilder3.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0211");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceBuilderEnterpriseImpl databaseManagementServiceBuilderEnterpriseImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceBuilderEnterpriseImpl(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder3 = databaseManagementServiceBuilderEnterpriseImpl1.setMonitors(
        monitors2);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder3);
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0212");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext2 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand3 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0213");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setMonitors(
        monitors9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener11);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl13 = clusteringDBMSBuilder12.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0214");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService4 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path5 = null;
    java.nio.file.Path path6 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path5, path6, strMap7, false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNull(databaseManagementService4);
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0215");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    int int1 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = commandGetServerIdCommandProvider0.commandType();
    int int3 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext4 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl5 = commandGetServerIdCommandProvider0.createCommand(
          executionContext4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
  }

  @Test
  public void test0216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0216");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0217");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    java.nio.file.Path path7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        path7);
    java.nio.file.Path path9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        path9);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0218");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction6 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = null;
    metaUpgradeFlowAction6.accept(upgradeMetaEnv7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction6);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction10 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction11 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv12 = null;
    metaUpgradeFlowAction11.accept(upgradeMetaEnv12);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = metaUpgradeFlowAction10.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction11);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv15 = null;
    metaUpgradeFlowAction10.accept(upgradeMetaEnv15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction17 = metaUpgradeFlowAction6.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction10);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction18 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv19 = null;
    metaUpgradeFlowAction18.accept(upgradeMetaEnv19);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer21 = metaUpgradeFlowAction17.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction18);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer22 = metaUpgradeFlowAction0.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction18);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction23 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction24 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv25 = null;
    metaUpgradeFlowAction24.accept(upgradeMetaEnv25);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction27 = metaUpgradeFlowAction23.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction24);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction28 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction29 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv30 = null;
    metaUpgradeFlowAction29.accept(upgradeMetaEnv30);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction32 = metaUpgradeFlowAction28.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction29);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction33 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction34 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv35 = null;
    metaUpgradeFlowAction34.accept(upgradeMetaEnv35);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction37 = metaUpgradeFlowAction33.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction34);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction38 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction39 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv40 = null;
    metaUpgradeFlowAction39.accept(upgradeMetaEnv40);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction42 = metaUpgradeFlowAction38.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction39);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv43 = null;
    metaUpgradeFlowAction38.accept(upgradeMetaEnv43);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction45 = metaUpgradeFlowAction34.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction38);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction46 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv47 = null;
    metaUpgradeFlowAction46.accept(upgradeMetaEnv47);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer49 = metaUpgradeFlowAction45.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction46);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction50 = metaUpgradeFlowAction28.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction46);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction51 = metaUpgradeFlowAction27.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction50);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer52 = metaUpgradeFlowAction18.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction27);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction53 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction54 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv55 = null;
    metaUpgradeFlowAction54.accept(upgradeMetaEnv55);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction57 = metaUpgradeFlowAction53.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction54);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction58 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction59 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv60 = null;
    metaUpgradeFlowAction59.accept(upgradeMetaEnv60);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction62 = metaUpgradeFlowAction58.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction59);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv63 = null;
    metaUpgradeFlowAction58.accept(upgradeMetaEnv63);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction65 = metaUpgradeFlowAction54.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction58);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction66 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction67 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv68 = null;
    metaUpgradeFlowAction67.accept(upgradeMetaEnv68);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction70 = metaUpgradeFlowAction66.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction67);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction71 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction72 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv73 = null;
    metaUpgradeFlowAction72.accept(upgradeMetaEnv73);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction75 = metaUpgradeFlowAction71.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction72);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv76 = null;
    metaUpgradeFlowAction71.accept(upgradeMetaEnv76);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction78 = metaUpgradeFlowAction67.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction71);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction79 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv80 = null;
    metaUpgradeFlowAction79.accept(upgradeMetaEnv80);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer82 = metaUpgradeFlowAction78.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction79);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer83 = metaUpgradeFlowAction65.andThen(
        upgradeMetaEnvConsumer82);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer84 = upgradeMetaEnvConsumer52.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction65);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction6);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction10);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction11);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction17);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction18);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer21);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer22);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction23);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction24);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction27);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction28);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction29);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction32);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction33);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction34);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction37);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction38);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction39);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction42);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction45);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction46);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer49);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction50);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction51);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer52);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction53);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction54);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction57);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction58);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction59);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction62);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction65);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction66);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction67);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction70);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction71);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction72);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction75);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction78);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction79);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer82);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer83);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer84);
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0219");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    int int3 = enhancedBootstrapper0.stop();
    java.nio.file.Path path4 = null;
    java.nio.file.Path path5 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      int int8 = enhancedBootstrapper0.start(path4, path5, strMap6, false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0220");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.config.Configuration configuration6 = null;
    try {
      databaseManagementServiceClusterImpl2.createDatabase("", configuration6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0221");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener5 = null;
    try {
      databaseManagementServiceClusterImpl2.registerDatabaseEventListener(databaseEventListener5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0222");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver10);
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = databaseManagementServiceBuilder11.setExternalDependencies(
        dependencyResolver12);
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder15 = databaseManagementServiceBuilder11.setExternalDependencies(
        dependencyResolver14);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService16 = databaseManagementServiceBuilder11.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder15);
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0223");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder10.setConfigRaw(
          strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0224");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener7 = null;
    try {
      databaseManagementServiceClusterImpl6.unregisterDatabaseEventListener(databaseEventListener7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0225");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder10.setUserLogProvider(
        logProvider11);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService13 = databaseManagementServiceBuilder10.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0226");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl6.createDatabase("");
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
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.clsrBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.kernel.api.procedure.Context context5 = null;
    org.neo4j.values.AnyValue anyValue6 = null;
    org.neo4j.values.AnyValue[] anyValueArray7 = new org.neo4j.values.AnyValue[]{anyValue6};
    org.neo4j.kernel.api.ResourceTracker resourceTracker8 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator9 = basicProcedureQuarantineDatabaseImpl4.apply(
          context5, anyValueArray7, resourceTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: c3bc6648-f892-4d86-9614-b53ef18de3fb");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(anyValueArray7);
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0228");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver6);
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder1.setConfigRaw(
          strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0229");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.shutdownDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0230");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      boolean boolean7 = databaseManagementServiceClusterImpl5.isWraeForSt("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0231");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.addDatabaseListener(
        databaseEventListener7);
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder6.setConfigRaw(
          strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0232");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      boolean boolean7 = databaseManagementServiceClusterImpl4.isWraeForSt("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0233");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl5.startDatabase("enterprise");
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    java.nio.file.Path path5 = null;
    java.nio.file.Path path6 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path5, path6, strMap7, false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNotNull(log4);
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0235");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      boolean boolean7 = databaseManagementServiceClusterImpl5.isWraeForSt("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0236");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      java.util.List<java.lang.String> strList6 = databaseManagementServiceClusterImpl4.listDatabases();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0237");
    }
    java.lang.String[] strArray0 = null;
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray0);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder7.setMonitors(
        monitors8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder7.setUserLogProvider(
        logProvider10);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener12 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder7.addDatabaseListener(
        databaseEventListener12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0239");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      boolean boolean8 = databaseManagementServiceClusterImpl5.isWraeForSt("enterprise");
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
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.clsrBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.kernel.api.procedure.Context context5 = null;
    org.neo4j.values.AnyValue[] anyValueArray6 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker7 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator8 = basicProcedureQuarantineDatabaseImpl4.apply(
          context5, anyValueArray6, resourceTracker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: fe8ab484-a650-4ba7-a59f-194832c36aaa");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(anyValueArray6);
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0241");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log5 = enhancedBootstrapper0.getLog();
    java.nio.file.Path path6 = null;
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int10 = enhancedBootstrapper0.start(path6, path7, strMap8, false);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertNotNull(log5);
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0242");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService8 = databaseManagementServiceClusterImpl6.database(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0243");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log6 = enhancedBootstrapper0.getLog();
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path7, strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(log6);
  }

  @Test
  public void test0244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0244");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "hi!");
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = databaseManagementServiceBuilder7.addDatabaseListener(
        databaseEventListener8);
    java.nio.file.Path path10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = databaseManagementServiceBuilder7.loadPropertiesFromFile(
        path10);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener12 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = databaseManagementServiceBuilder11.addDatabaseListener(
        databaseEventListener12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0245");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    int int1 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = commandGetServerIdCommandProvider0.commandType();
    int int4 = commandGetServerIdCommandProvider0.getPriority();
    int int5 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType6 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType7 = commandGetServerIdCommandProvider0.commandType();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue(
        "'" + commandType7 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType7.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0246");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener4 = null;
    try {
      databaseManagementServiceClusterImpl2.registerDatabaseEventListener(databaseEventListener4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0247");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      boolean boolean8 = databaseManagementServiceClusterImpl6.isWraeForSt("hi!");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl5.shutdown();
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService8 = databaseManagementServiceClusterImpl6.database(
          "");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    java.nio.file.Path path6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0251");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl4.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0252");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.dropDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0253");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.setMonitors(
        monitors6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0254");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl4.createDatabase("");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      java.util.List<java.lang.String> strList4 = databaseManagementServiceClusterImpl2.listDatabases();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0256");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path9);
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder10.setExternalDependencies(
        dependencyResolver11);
    java.lang.Class<?> wildcardClass13 = databaseManagementServiceBuilder10.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0257");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService6 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path7, strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNull(databaseManagementService6);
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0258");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl4.startDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0259");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = clusteringDBMSBuilder5.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
  }

  @Test
  public void test0260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0260");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver10);
    java.nio.file.Path path12 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path12);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService14 = clusteringDBMSBuilder5.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0261");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl databaseStateProcedureClusterImpl2 = new io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = databaseStateProcedureClusterImpl2.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature4 = databaseStateProcedureClusterImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context5 = null;
    org.neo4j.values.AnyValue[] anyValueArray6 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker7 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator8 = databaseStateProcedureClusterImpl2.apply(
          context5, anyValueArray6, resourceTracker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: Illegal input:[]");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(procedureSignature4);
    org.junit.Assert.assertNotNull(anyValueArray6);
  }

  @Test
  public void test0262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0262");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener7 = null;
    try {
      databaseManagementServiceClusterImpl6.registerDatabaseEventListener(databaseEventListener7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0263");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl4.startDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0264");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction6 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = null;
    metaUpgradeFlowAction6.accept(upgradeMetaEnv7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction6);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction10 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction11 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv12 = null;
    metaUpgradeFlowAction11.accept(upgradeMetaEnv12);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = metaUpgradeFlowAction10.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction11);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv15 = null;
    metaUpgradeFlowAction10.accept(upgradeMetaEnv15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction17 = metaUpgradeFlowAction6.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction10);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction18 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv19 = null;
    metaUpgradeFlowAction18.accept(upgradeMetaEnv19);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer21 = metaUpgradeFlowAction17.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction18);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer22 = metaUpgradeFlowAction0.andThen(
        upgradeMetaEnvConsumer21);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction6);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction10);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction11);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction17);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction18);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer21);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer22);
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0265");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setMonitors(
        monitors9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener11);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.loadPropertiesFromFile(
        "hi!");
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService15 = clusteringDBMSBuilder12.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0266");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder7.setExternalDependencies(
        dependencyResolver8);
    java.lang.Class<?> wildcardClass10 = databaseManagementServiceBuilder9.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0267");
    }
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.stnleBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.kernel.api.procedure.Context context5 = null;
    org.neo4j.values.AnyValue anyValue6 = null;
    org.neo4j.values.AnyValue[] anyValueArray7 = new org.neo4j.values.AnyValue[]{anyValue6};
    org.neo4j.kernel.api.ResourceTracker resourceTracker8 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator9 = basicProcedureQuarantineDatabaseImpl4.apply(
          context5, anyValueArray7, resourceTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: c3bc6648-f892-4d86-9614-b53ef18de3fb");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(anyValueArray7);
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0268");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener4 = null;
    try {
      databaseManagementServiceClusterImpl2.unregisterDatabaseEventListener(databaseEventListener4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0269");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "");
    java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.setConfigRaw(
          strMap13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0270");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder9.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder9.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder9.setUserLogProvider(
        logProvider14);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl16 = clusteringDBMSBuilder15.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0271");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl4.dropDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0272");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider11);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule14 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder15 = clusteringDBMSBuilder12.addURLAccessRule(
        "", uRLAccessRule14);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder15);
  }

  @Test
  public void test0273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0273");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl5.dropDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0274");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.config.Configuration configuration8 = null;
    try {
      databaseManagementServiceClusterImpl6.createDatabase("hi!", configuration8);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.createDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0276");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context4 = null;
    org.neo4j.values.AnyValue[] anyValueArray5 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker6 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator7 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context4, anyValueArray5, resourceTracker6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(anyValueArray5);
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0277");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.startDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0278");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder7.setMonitors(
        monitors8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder7.setMonitors(
        monitors10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder7.setUserLogProvider(
        logProvider12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0279");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log6 = enhancedBootstrapper0.getLog();
    java.nio.file.Path path7 = null;
    java.nio.file.Path path8 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      int int11 = enhancedBootstrapper0.start(path7, path8, strMap9, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(log6);
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0280");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder6.addURLAccessRule(
        "", uRLAccessRule10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder6.setUserLogProvider(
        logProvider12);
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder6.setExternalDependencies(
        dependencyResolver14);
    java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder17 = clusteringDBMSBuilder6.setConfigRaw(
          strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0281");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    org.neo4j.logging.LogProvider logProvider6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder7.setConfigRaw(
          strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0282");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        "");
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl9 = clusteringDBMSBuilder8.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0283");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction6 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = null;
    metaUpgradeFlowAction6.accept(upgradeMetaEnv7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction6);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction10 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction11 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv12 = null;
    metaUpgradeFlowAction11.accept(upgradeMetaEnv12);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = metaUpgradeFlowAction10.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction11);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv15 = null;
    metaUpgradeFlowAction10.accept(upgradeMetaEnv15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction17 = metaUpgradeFlowAction6.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction10);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction18 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv19 = null;
    metaUpgradeFlowAction18.accept(upgradeMetaEnv19);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer21 = metaUpgradeFlowAction17.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction18);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction22 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction18);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction23 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction24 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv25 = null;
    metaUpgradeFlowAction24.accept(upgradeMetaEnv25);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction27 = metaUpgradeFlowAction23.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction24);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction28 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction29 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv30 = null;
    metaUpgradeFlowAction29.accept(upgradeMetaEnv30);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction32 = metaUpgradeFlowAction28.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction29);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction33 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction34 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv35 = null;
    metaUpgradeFlowAction34.accept(upgradeMetaEnv35);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction37 = metaUpgradeFlowAction33.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction34);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction38 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction39 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv40 = null;
    metaUpgradeFlowAction39.accept(upgradeMetaEnv40);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction42 = metaUpgradeFlowAction38.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction39);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv43 = null;
    metaUpgradeFlowAction38.accept(upgradeMetaEnv43);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction45 = metaUpgradeFlowAction34.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction38);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction46 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv47 = null;
    metaUpgradeFlowAction46.accept(upgradeMetaEnv47);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer49 = metaUpgradeFlowAction45.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction46);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer50 = metaUpgradeFlowAction28.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction46);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction51 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction52 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv53 = null;
    metaUpgradeFlowAction52.accept(upgradeMetaEnv53);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction55 = metaUpgradeFlowAction51.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction52);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction56 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction57 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv58 = null;
    metaUpgradeFlowAction57.accept(upgradeMetaEnv58);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction60 = metaUpgradeFlowAction56.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction57);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction61 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction62 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv63 = null;
    metaUpgradeFlowAction62.accept(upgradeMetaEnv63);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction65 = metaUpgradeFlowAction61.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction62);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction66 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction67 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv68 = null;
    metaUpgradeFlowAction67.accept(upgradeMetaEnv68);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction70 = metaUpgradeFlowAction66.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction67);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv71 = null;
    metaUpgradeFlowAction66.accept(upgradeMetaEnv71);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction73 = metaUpgradeFlowAction62.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction66);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction74 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv75 = null;
    metaUpgradeFlowAction74.accept(upgradeMetaEnv75);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer77 = metaUpgradeFlowAction73.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction74);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction78 = metaUpgradeFlowAction56.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction74);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction79 = metaUpgradeFlowAction55.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction78);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer80 = metaUpgradeFlowAction46.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction55);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction81 = metaUpgradeFlowAction23.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction55);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer82 = metaUpgradeFlowAction22.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction81);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction6);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction10);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction11);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction17);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction18);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer21);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction22);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction23);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction24);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction27);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction28);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction29);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction32);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction33);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction34);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction37);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction38);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction39);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction42);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction45);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction46);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer49);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer50);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction51);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction52);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction55);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction56);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction57);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction60);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction61);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction62);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction65);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction66);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction67);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction70);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction73);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction74);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer77);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction78);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction79);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer80);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction81);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer82);
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0284");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = commandGetServerIdCommandProvider0.commandType();
    int int3 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext4 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl5 = commandGetServerIdCommandProvider0.createCommand(
          executionContext4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0285");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService4 = enhancedBootstrapper0.getDatabaseManagementService();
    java.lang.String[] strArray9 = new java.lang.String[]{"hi!", "enterprise", "enterprise",
        "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray9);
    try {
      int int11 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray9);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNull(databaseManagementService4);
    org.junit.Assert.assertNotNull(strArray9);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0286");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService2 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log3 = enhancedBootstrapper0.getLog();
    java.nio.file.Path path4 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
    try {
      int int6 = enhancedBootstrapper0.start(path4, strMap5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNull(databaseManagementService2);
    org.junit.Assert.assertNotNull(log3);
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0287");
    }
    org.neo4j.server.Bootstrapper bootstrapper0 = null;
    java.lang.String[] strArray7 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray7);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray7);
    try {
      int int10 = org.neo4j.server.NeoBootstrapper.start(bootstrapper0, strArray7);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray7);
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0288");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    org.junit.Assert.assertTrue(
        "'" + priority1 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority1.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority2 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority2.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue(
        "'" + priority6 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority6.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority7 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority7.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority8 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority8.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0289");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener3 = null;
    try {
      databaseManagementServiceClusterImpl2.registerDatabaseEventListener(databaseEventListener3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0290");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder1.setMonitors(
        monitors7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder8.loadPropertiesFromFile(
        path9);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule12 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = databaseManagementServiceBuilder10.addURLAccessRule(
        "", uRLAccessRule12);
    java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder15 = databaseManagementServiceBuilder13.setConfigRaw(
          strMap14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0291");
    }
    java.lang.String[] strArray2 = new java.lang.String[]{"enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray2);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray2);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray2);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0292");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction6 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = null;
    metaUpgradeFlowAction6.accept(upgradeMetaEnv7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction6);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction10 = metaUpgradeFlowAction4.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction5);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv11 = null;
    metaUpgradeFlowAction5.accept(upgradeMetaEnv11);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction13 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv15 = null;
    metaUpgradeFlowAction14.accept(upgradeMetaEnv15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction17 = metaUpgradeFlowAction13.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction14);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction18 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction19 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv20 = null;
    metaUpgradeFlowAction19.accept(upgradeMetaEnv20);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction22 = metaUpgradeFlowAction18.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction19);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv23 = null;
    metaUpgradeFlowAction18.accept(upgradeMetaEnv23);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction25 = metaUpgradeFlowAction14.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction18);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction26 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction18);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer27 = null;
    try {
      java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer28 = metaUpgradeFlowAction5.andThen(
          upgradeMetaEnvConsumer27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction6);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction10);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction13);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction17);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction18);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction19);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction22);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction25);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction26);
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0293");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder3.setMonitors(
        monitors9);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl11 = clusteringDBMSBuilder3.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0294");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    org.junit.Assert.assertTrue(
        "'" + priority1 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority1.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority2 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority2.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue(
        "'" + priority5 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority5.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority7 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority7.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority8 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority8.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0295");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl4.dropDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0296");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context4 = null;
    org.neo4j.values.AnyValue anyValue5 = null;
    org.neo4j.values.AnyValue[] anyValueArray6 = new org.neo4j.values.AnyValue[]{anyValue5};
    org.neo4j.kernel.api.ResourceTracker resourceTracker7 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator8 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context4, anyValueArray6, resourceTracker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(anyValueArray6);
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0297");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl4.dropDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0298");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl databaseStateProcedureClusterImpl2 = new io.github.onograph.dbms.serverproc.DatabaseStateProcedureClusterImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = databaseStateProcedureClusterImpl2.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature4 = databaseStateProcedureClusterImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context5 = null;
    org.neo4j.values.AnyValue anyValue6 = null;
    org.neo4j.values.AnyValue[] anyValueArray7 = new org.neo4j.values.AnyValue[]{anyValue6};
    org.neo4j.kernel.api.ResourceTracker resourceTracker8 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator9 = databaseStateProcedureClusterImpl2.apply(
          context5, anyValueArray7, resourceTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'databaseName' value should have a string representation. Instead: null");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(procedureSignature4);
    org.junit.Assert.assertNotNull(anyValueArray7);
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0299");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService4 = enhancedBootstrapper0.getDatabaseManagementService();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log6 = enhancedBootstrapper0.getLog();
    boolean boolean7 = enhancedBootstrapper0.isRunning();
    java.nio.file.Path path8 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      int int10 = enhancedBootstrapper0.start(path8, strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNull(databaseManagementService4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(log6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0300");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder6.addURLAccessRule(
        "", uRLAccessRule10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder6.setUserLogProvider(
        logProvider12);
    java.nio.file.Path path14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        path14);
    java.lang.Class<?> wildcardClass16 = clusteringDBMSBuilder15.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0301");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    int int1 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = commandGetServerIdCommandProvider0.commandType();
    int int4 = commandGetServerIdCommandProvider0.getPriority();
    int int5 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext6 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl7 = commandGetServerIdCommandProvider0.createCommand(
          executionContext6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
  }

  @Test
  public void test0302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0302");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.startDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0303");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context4 = null;
    org.neo4j.values.AnyValue[] anyValueArray5 = null;
    org.neo4j.kernel.api.ResourceTracker resourceTracker6 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator7 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context4, anyValueArray5, resourceTracker6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0304");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.createDatabase("");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "hi!");
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder3.addDatabaseListener(
        databaseEventListener8);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder3.addDatabaseListener(
        databaseEventListener10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0306");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener6 = null;
    try {
      databaseManagementServiceClusterImpl4.unregisterDatabaseEventListener(databaseEventListener6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0307");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    java.nio.file.Path path6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0308");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.lang.Class<?> wildcardClass8 = clusteringDBMSBuilder5.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0309");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setMonitors(
        monitors9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener11);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.loadPropertiesFromFile(
        "hi!");
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder16 = clusteringDBMSBuilder14.setUserLogProvider(
        logProvider15);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService17 = clusteringDBMSBuilder16.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder16);
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0310");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder6.addURLAccessRule(
        "", uRLAccessRule10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder6.setUserLogProvider(
        logProvider12);
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder6.setExternalDependencies(
        dependencyResolver14);
    org.neo4j.monitoring.Monitors monitors16 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder17 = clusteringDBMSBuilder6.setMonitors(
        monitors16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder19 = clusteringDBMSBuilder6.setUserLogProvider(
        logProvider18);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl20 = clusteringDBMSBuilder6.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder17);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder19);
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0311");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl1.dropDatabase("hi!");
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
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.clsrBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature6 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature7 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.kernel.api.procedure.Context context8 = null;
    org.neo4j.values.AnyValue[] anyValueArray9 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker10 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator11 = basicProcedureQuarantineDatabaseImpl4.apply(
          context8, anyValueArray9, resourceTracker10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: fe8ab484-a650-4ba7-a59f-194832c36aaa");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(procedureSignature6);
    org.junit.Assert.assertNotNull(procedureSignature7);
    org.junit.Assert.assertNotNull(anyValueArray9);
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0313");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    try {
      databaseManagementServiceClusterImpl3.dropDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0314");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    int int5 = enhancedBootstrapper0.stop();
    int int6 = enhancedBootstrapper0.stop();
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path7, strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0315");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log6 = enhancedBootstrapper0.getLog();
    boolean boolean7 = enhancedBootstrapper0.isRunning();
    java.lang.String[] strArray13 = new java.lang.String[]{"", "enterprise", "enterprise",
        "enterprise", "hi!"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray13);
    try {
      int int15 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray13);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(log6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertNotNull(strArray13);
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0316");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      java.util.List<java.lang.String> strList8 = databaseManagementServiceClusterImpl5.listDatabases();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0317");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    java.lang.String[] strArray6 = new java.lang.String[]{"enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    try {
      int int8 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertNotNull(strArray6);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0318");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener8 = null;
    try {
      databaseManagementServiceClusterImpl7.unregisterDatabaseEventListener(databaseEventListener8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0319");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    java.lang.String str6 = clusteringDBMSBuilder3.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.setMonitors(
        monitors7);
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder8.setExternalDependencies(
        dependencyResolver9);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0320");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      boolean boolean8 = databaseManagementServiceClusterImpl6.isWraeForSt("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0321");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder6.setMonitors(
        monitors9);
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder10.setConfigRaw(
          strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0322");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder6.setExternalDependencies(
        dependencyResolver9);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService11 = clusteringDBMSBuilder6.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0323");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService4 = databaseManagementServiceClusterImpl2.database(
          "enterprise");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder3.setExternalDependencies(
        dependencyResolver9);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl11 = clusteringDBMSBuilder10.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
  }

  @Test
  public void test0325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0325");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService9 = databaseManagementServiceClusterImpl7.database(
          "hi!");
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log6 = enhancedBootstrapper0.getLog();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService7 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path8 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      int int10 = enhancedBootstrapper0.start(path8, strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(log6);
    org.junit.Assert.assertNull(databaseManagementService7);
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0327");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    int int5 = enhancedBootstrapper0.stop();
    java.nio.file.Path path6 = null;
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int10 = enhancedBootstrapper0.start(path6, path7, strMap8, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0328");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    org.neo4j.graphdb.config.Configuration configuration4 = null;
    try {
      databaseManagementServiceClusterImpl2.createDatabase("enterprise", configuration4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0329");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl4.shutdownDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0330");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService4 = enhancedBootstrapper0.getDatabaseManagementService();
    int int5 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray8 = new java.lang.String[]{"", ""};
    try {
      int int9 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray8);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNull(databaseManagementService4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNotNull(strArray8);
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0331");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder5.getEdition();
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder8.addDatabaseListener(
        databaseEventListener9);
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = clusteringDBMSBuilder10.setConfigRaw(
          strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0332");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver6);
    java.lang.String str8 = clusteringDBMSBuilder5.getEdition();
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setConfigRaw(
          strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "enterprise" + "'", str8, "enterprise");
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0333");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    org.neo4j.graphdb.config.Configuration configuration4 = null;
    try {
      databaseManagementServiceClusterImpl2.createDatabase("", configuration4);
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
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.clsrBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature6 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.kernel.api.procedure.Context context7 = null;
    org.neo4j.values.AnyValue anyValue8 = null;
    org.neo4j.values.AnyValue[] anyValueArray9 = new org.neo4j.values.AnyValue[]{anyValue8};
    org.neo4j.kernel.api.ResourceTracker resourceTracker10 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator11 = basicProcedureQuarantineDatabaseImpl4.apply(
          context7, anyValueArray9, resourceTracker10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: c3bc6648-f892-4d86-9614-b53ef18de3fb");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(procedureSignature6);
    org.junit.Assert.assertNotNull(anyValueArray9);
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0335");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      boolean boolean9 = databaseManagementServiceClusterImpl7.isWraeForSt("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0336");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int2 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int3 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int4 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int5 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext6 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand7 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0337");
    }
    io.github.onograph.dbms.serverproc.WaitingReplyMetaType waitingReplyMetaType0 = io.github.onograph.dbms.serverproc.WaitingReplyMetaType.CaughtUp;
    java.lang.Class<?> wildcardClass1 = waitingReplyMetaType0.getClass();
    org.junit.Assert.assertTrue("'" + waitingReplyMetaType0 + "' != '"
            + io.github.onograph.dbms.serverproc.WaitingReplyMetaType.CaughtUp + "'",
        waitingReplyMetaType0.equals(
            io.github.onograph.dbms.serverproc.WaitingReplyMetaType.CaughtUp));
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0338");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl3.startDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0339");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onStop(
        throwingAction0);
    java.lang.Class<?> wildcardClass2 = lifecycle1.getClass();
    org.junit.Assert.assertNotNull(lifecycle1);
    org.junit.Assert.assertNotNull(wildcardClass2);
  }

  @Test
  public void test0340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0340");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setMonitors(
        monitors9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener11);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService13 = clusteringDBMSBuilder12.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
  }

  @Test
  public void test0341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0341");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "hi!");
    org.neo4j.logging.LogProvider logProvider8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0342");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      boolean boolean9 = databaseManagementServiceClusterImpl7.isWraeForSt("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0343");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver2);
    java.lang.Class<?> wildcardClass4 = clusteringDBMSBuilder3.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0344");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    java.nio.file.Path path7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        path7);
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        "");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0345");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.lang.String str9 = clusteringDBMSBuilder3.getEdition();
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder3.setExternalDependencies(
        dependencyResolver10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "enterprise" + "'", str9, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
  }

  @Test
  public void test0346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0346");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener6 = null;
    try {
      databaseManagementServiceClusterImpl4.registerDatabaseEventListener(databaseEventListener6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0347");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature4 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context5 = null;
    org.neo4j.values.AnyValue[] anyValueArray6 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker7 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator8 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context5, anyValueArray6, resourceTracker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(procedureSignature4);
    org.junit.Assert.assertNotNull(anyValueArray6);
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0348");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext5 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand6 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
  }

  @Test
  public void test0349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0349");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      boolean boolean5 = databaseManagementServiceClusterImpl3.isWraeForSt("");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl5.shutdownDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0351");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService2 = enhancedBootstrapper0.getDatabaseManagementService();
    java.lang.String[] strArray4 = new java.lang.String[]{"hi!"};
    try {
      int int5 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray4);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNull(databaseManagementService2);
    org.junit.Assert.assertNotNull(strArray4);
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0352");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener6 = null;
    try {
      databaseManagementServiceClusterImpl2.registerDatabaseEventListener(databaseEventListener6);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = clusteringDBMSBuilder3.addDatabaseListener(
        databaseEventListener11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder14 = clusteringDBMSBuilder3.setMonitors(
        monitors13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder14);
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0354");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService6 = enhancedBootstrapper0.getDatabaseManagementService();
    java.lang.String[] strArray11 = new java.lang.String[]{"enterprise", "hi!", "", "hi!"};
    try {
      int int12 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray11);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNull(databaseManagementService6);
    org.junit.Assert.assertNotNull(strArray11);
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0355");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    int int3 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService5 = enhancedBootstrapper0.getDatabaseManagementService();
    boolean boolean6 = enhancedBootstrapper0.isRunning();
    java.nio.file.Path path7 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
    try {
      int int9 = enhancedBootstrapper0.start(path7, strMap8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertNull(databaseManagementService5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0356");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.common.DependencyResolver dependencyResolver4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.setExternalDependencies(
        dependencyResolver4);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0357");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      databaseManagementServiceClusterImpl2.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0358");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0359");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv5 = null;
    metaUpgradeFlowAction0.accept(upgradeMetaEnv5);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction7 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction8 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv9 = null;
    metaUpgradeFlowAction8.accept(upgradeMetaEnv9);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction11 = metaUpgradeFlowAction7.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction8);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer12 = metaUpgradeFlowAction0.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction13 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv15 = null;
    metaUpgradeFlowAction14.accept(upgradeMetaEnv15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction17 = metaUpgradeFlowAction13.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction14);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction18 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction19 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv20 = null;
    metaUpgradeFlowAction19.accept(upgradeMetaEnv20);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction22 = metaUpgradeFlowAction18.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction19);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv23 = null;
    metaUpgradeFlowAction18.accept(upgradeMetaEnv23);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction25 = metaUpgradeFlowAction14.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction18);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction26 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv27 = null;
    metaUpgradeFlowAction26.accept(upgradeMetaEnv27);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer29 = metaUpgradeFlowAction25.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction26);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction30 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction31 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv32 = null;
    metaUpgradeFlowAction31.accept(upgradeMetaEnv32);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction34 = metaUpgradeFlowAction30.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction31);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction35 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction36 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv37 = null;
    metaUpgradeFlowAction36.accept(upgradeMetaEnv37);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction39 = metaUpgradeFlowAction35.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction36);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction40 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction41 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv42 = null;
    metaUpgradeFlowAction41.accept(upgradeMetaEnv42);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction44 = metaUpgradeFlowAction40.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction41);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction45 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction46 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv47 = null;
    metaUpgradeFlowAction46.accept(upgradeMetaEnv47);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction49 = metaUpgradeFlowAction45.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction46);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv50 = null;
    metaUpgradeFlowAction45.accept(upgradeMetaEnv50);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction52 = metaUpgradeFlowAction41.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction45);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction53 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv54 = null;
    metaUpgradeFlowAction53.accept(upgradeMetaEnv54);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer56 = metaUpgradeFlowAction52.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction53);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction57 = metaUpgradeFlowAction35.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction53);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction58 = metaUpgradeFlowAction34.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction57);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction59 = metaUpgradeFlowAction26.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction34);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction60 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction26);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv61 = null;
    metaUpgradeFlowAction26.accept(upgradeMetaEnv61);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction7);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction8);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction11);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer12);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction13);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction17);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction18);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction19);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction22);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction25);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction26);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer29);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction30);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction31);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction34);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction35);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction36);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction39);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction40);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction41);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction44);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction45);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction46);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction49);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction52);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction53);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer56);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction57);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction58);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction59);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction60);
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0360");
    }
    java.lang.String[] strArray6 = new java.lang.String[]{"", "", "", "hi!", "enterprise", ""};
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray6);
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0361");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver10);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule13 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder5.addURLAccessRule(
        "", uRLAccessRule13);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule16 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder17 = clusteringDBMSBuilder14.addURLAccessRule(
        "", uRLAccessRule16);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder17);
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0362");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener6 = null;
    try {
      databaseManagementServiceClusterImpl4.unregisterDatabaseEventListener(databaseEventListener6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0363");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener6 = null;
    try {
      databaseManagementServiceClusterImpl4.registerDatabaseEventListener(databaseEventListener6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0364");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    int int1 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray3 = new java.lang.String[]{""};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray3);
    try {
      int int5 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray3);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    org.junit.Assert.assertNotNull(strArray3);
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0365");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    try {
      databaseManagementServiceClusterImpl3.createDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0366");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl6.startDatabase("enterprise");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder1.setMonitors(
        monitors7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder1.addDatabaseListener(
        databaseEventListener9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder10.setUserLogProvider(
        logProvider11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0368");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setMonitors(
        monitors9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider11);
    org.neo4j.common.DependencyResolver dependencyResolver13 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder14 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver13);
    org.neo4j.common.DependencyResolver dependencyResolver15 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder16 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver15);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder14);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder16);
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0369");
    }
    java.lang.String[] strArray5 = new java.lang.String[]{"", "enterprise", "enterprise",
        "enterprise", "hi!"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray5);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray5);
    java.lang.Class<?> wildcardClass8 = strArray5.getClass();
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0370");
    }
    java.lang.String[] strArray0 = null;
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray0);
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0371");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider11);
    java.nio.file.Path path13 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.loadPropertiesFromFile(
        path13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder16 = clusteringDBMSBuilder14.setUserLogProvider(
        logProvider15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder18 = clusteringDBMSBuilder14.setUserLogProvider(
        logProvider17);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl19 = clusteringDBMSBuilder14.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder16);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder18);
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0372");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.config.Configuration configuration8 = null;
    try {
      databaseManagementServiceClusterImpl5.createDatabase("", configuration8);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      java.util.List<java.lang.String> strList4 = databaseManagementServiceClusterImpl3.listDatabases();
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    org.neo4j.graphdb.config.Configuration configuration6 = null;
    try {
      databaseManagementServiceClusterImpl3.createDatabase("hi!", configuration6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0375");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    java.lang.String str6 = clusteringDBMSBuilder3.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder3.setMonitors(
        monitors7);
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder3.setConfigRaw(
          strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0376");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        "hi!");
    java.nio.file.Path path11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        path11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0377");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider11);
    java.nio.file.Path path13 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.loadPropertiesFromFile(
        path13);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl15 = clusteringDBMSBuilder12.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0378");
    }
    org.neo4j.io.layout.Neo4jLayout neo4jLayout0 = null;
    io.github.onograph.dbms.MetaUpgradeFlowActionStagingImpl metaUpgradeFlowActionStagingImpl1 = new io.github.onograph.dbms.MetaUpgradeFlowActionStagingImpl(
        neo4jLayout0);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    try {
      metaUpgradeFlowActionStagingImpl1.accept(upgradeMetaEnv2);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService9 = databaseManagementServiceClusterImpl7.database(
          "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0380");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener4 = null;
    try {
      databaseManagementServiceClusterImpl3.registerDatabaseEventListener(databaseEventListener4);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = databaseManagementServiceBuilder8.addURLAccessRule(
        "enterprise", uRLAccessRule10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0382");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature4 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context6 = null;
    org.neo4j.values.AnyValue[] anyValueArray7 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker8 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator9 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context6, anyValueArray7, resourceTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(procedureSignature4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(anyValueArray7);
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0383");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = commandGetServerIdCommandProvider0.commandType();
    int int2 = commandGetServerIdCommandProvider0.getPriority();
    int int3 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext4 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl5 = commandGetServerIdCommandProvider0.createCommand(
          executionContext4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0384");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder1.setMonitors(
        monitors7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder1.addDatabaseListener(
        databaseEventListener9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder10.addDatabaseListener(
        databaseEventListener11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0385");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = commandGetServerIdCommandProvider0.commandType();
    int int3 = commandGetServerIdCommandProvider0.getPriority();
    int int4 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext5 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl6 = commandGetServerIdCommandProvider0.createCommand(
          executionContext5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0386");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    try {
      databaseManagementServiceClusterImpl3.shutdownDatabase("");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl6);
    try {
      databaseManagementServiceClusterImpl7.shutdownDatabase("enterprise");
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
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = commandGetServerIdCommandProvider0.commandType();
    int int4 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext5 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl6 = commandGetServerIdCommandProvider0.createCommand(
          executionContext5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0389");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    int int6 = enhancedBootstrapper0.stop();
    java.lang.String[] strArray12 = new java.lang.String[]{"", "enterprise", "enterprise",
        "enterprise", "hi!"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray12);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray12);
    try {
      int int15 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray12);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    org.junit.Assert.assertNotNull(strArray12);
  }

  @Test
  public void test0390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0390");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.dropDatabase("enterprise");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl6);
    try {
      databaseManagementServiceClusterImpl7.shutdownDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0392");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      boolean boolean5 = databaseManagementServiceClusterImpl3.isWraeForSt("hi!");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl3.startDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0394");
    }
    java.lang.String[] strArray2 = new java.lang.String[]{"enterprise", "enterprise"};
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray2);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray2);
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0395");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    java.lang.Class<?> wildcardClass6 = databaseManagementServiceClusterImpl5.getClass();
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0396");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService6 = databaseManagementServiceClusterImpl4.database(
          "hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0397");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    int int1 = commandGetServerIdCommandProvider0.getPriority();
    int int2 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext3 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl4 = commandGetServerIdCommandProvider0.createCommand(
          executionContext3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0398");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "hi!");
    org.neo4j.monitoring.Monitors monitors8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder3.setMonitors(
        monitors8);
    java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder9.setConfigRaw(
          strMap10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
  }

  @Test
  public void test0399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0399");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.shutdownDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0400");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.config.Configuration configuration7 = null;
    try {
      databaseManagementServiceClusterImpl5.createDatabase("enterprise", configuration7);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "");
    java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder14 = clusteringDBMSBuilder5.setConfigRaw(
          strMap13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0402");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule10);
    java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder11.setConfigRaw(
          strMap12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0403");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    java.lang.String str6 = clusteringDBMSBuilder3.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.setMonitors(
        monitors7);
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder8.setConfigRaw(
          strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0404");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver10);
    java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder5.setConfigRaw(
          strMap12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
  }

  @Test
  public void test0405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0405");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction6 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = null;
    metaUpgradeFlowAction6.accept(upgradeMetaEnv7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction6);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction10 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction11 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv12 = null;
    metaUpgradeFlowAction11.accept(upgradeMetaEnv12);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = metaUpgradeFlowAction10.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction11);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction15 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction16 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv17 = null;
    metaUpgradeFlowAction16.accept(upgradeMetaEnv17);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction19 = metaUpgradeFlowAction15.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction16);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv20 = null;
    metaUpgradeFlowAction15.accept(upgradeMetaEnv20);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction22 = metaUpgradeFlowAction11.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction23 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv24 = null;
    metaUpgradeFlowAction23.accept(upgradeMetaEnv24);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer26 = metaUpgradeFlowAction22.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction23);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction27 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction23);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction28 = metaUpgradeFlowAction4.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction27);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction29 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer30 = metaUpgradeFlowAction28.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction29);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction31 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction32 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv33 = null;
    metaUpgradeFlowAction32.accept(upgradeMetaEnv33);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction35 = metaUpgradeFlowAction31.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction32);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction36 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction37 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv38 = null;
    metaUpgradeFlowAction37.accept(upgradeMetaEnv38);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction40 = metaUpgradeFlowAction36.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction37);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction41 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction42 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv43 = null;
    metaUpgradeFlowAction42.accept(upgradeMetaEnv43);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction45 = metaUpgradeFlowAction41.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction42);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction46 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction47 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv48 = null;
    metaUpgradeFlowAction47.accept(upgradeMetaEnv48);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction50 = metaUpgradeFlowAction46.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction47);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv51 = null;
    metaUpgradeFlowAction46.accept(upgradeMetaEnv51);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction53 = metaUpgradeFlowAction42.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction46);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction54 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv55 = null;
    metaUpgradeFlowAction54.accept(upgradeMetaEnv55);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer57 = metaUpgradeFlowAction53.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction54);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction58 = metaUpgradeFlowAction36.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction54);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction59 = metaUpgradeFlowAction35.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction58);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction60 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer61 = metaUpgradeFlowAction59.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction60);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer62 = metaUpgradeFlowAction29.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction60);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction63 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction64 = metaUpgradeFlowAction29.andMetaUpgradeFlowAction(
          metaUpgradeFlowAction63);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction6);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction10);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction11);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction15);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction16);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction19);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction22);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction23);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer26);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction27);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction28);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction29);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer30);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction31);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction32);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction35);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction36);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction37);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction40);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction41);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction42);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction45);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction46);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction47);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction50);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction53);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction54);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer57);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction58);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction59);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction60);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer61);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer62);
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0406");
    }
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.stnleBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.kernel.api.procedure.Context context6 = null;
    org.neo4j.values.AnyValue[] anyValueArray7 = new org.neo4j.values.AnyValue[]{};
    org.neo4j.kernel.api.ResourceTracker resourceTracker8 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator9 = basicProcedureQuarantineDatabaseImpl4.apply(
          context6, anyValueArray7, resourceTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: fe8ab484-a650-4ba7-a59f-194832c36aaa");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(anyValueArray7);
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0407");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType5 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext6 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand7 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType5 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType5.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0408");
    }
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO2 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "enterprise", "");
    java.lang.String str3 = tokenNamePropertyDTO2.getStrNt();
    java.lang.String str4 = tokenNamePropertyDTO2.getStrNt();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0409");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder3.setExternalDependencies(
        dependencyResolver9);
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder3.setConfigRaw(
          strMap11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
  }

  @Test
  public void test0410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0410");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl4.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.junit.Assert.assertTrue(
        "'" + priority1 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority1.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority2 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority2.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority3 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority3.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority5 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority5.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue(
        "'" + priority6 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority6.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    org.junit.Assert.assertTrue(
        "'" + priority9 + "' != '" + org.neo4j.server.startup.EntryPoint.Priority.MEDIUM + "'",
        priority9.equals(org.neo4j.server.startup.EntryPoint.Priority.MEDIUM));
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0411");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.config.Configuration configuration8 = null;
    try {
      databaseManagementServiceClusterImpl5.createDatabase("hi!", configuration8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0412");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder6.addURLAccessRule(
        "", uRLAccessRule10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder6.setUserLogProvider(
        logProvider12);
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder6.setExternalDependencies(
        dependencyResolver14);
    org.neo4j.monitoring.Monitors monitors16 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder17 = clusteringDBMSBuilder6.setMonitors(
        monitors16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder19 = clusteringDBMSBuilder17.setUserLogProvider(
        logProvider18);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl20 = clusteringDBMSBuilder17.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder17);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder19);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0413");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver2);
    java.nio.file.Path path4 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = databaseManagementServiceBuilder5.setMonitors(
        monitors6);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService8 = databaseManagementServiceBuilder7.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0414");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    java.lang.Class<?> wildcardClass5 = commandType4.getClass();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0415");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener6 = null;
    try {
      databaseManagementServiceClusterImpl5.unregisterDatabaseEventListener(databaseEventListener6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0416");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    int int3 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType4 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext5 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand6 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0417");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener8 = null;
    try {
      databaseManagementServiceClusterImpl7.registerDatabaseEventListener(databaseEventListener8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0418");
    }
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO2 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "", "");
    java.lang.String str3 = tokenNamePropertyDTO2.getStrNt();
    java.lang.String str4 = tokenNamePropertyDTO2.getStrNt();
    java.lang.String str5 = tokenNamePropertyDTO2.getStrNt();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0419");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl6);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener8 = null;
    try {
      databaseManagementServiceClusterImpl7.registerDatabaseEventListener(databaseEventListener8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0420");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver6);
    org.neo4j.monitoring.Monitors monitors8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder7.setMonitors(
        monitors8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder7.setUserLogProvider(
        logProvider10);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder7.loadPropertiesFromFile(
        "hi!");
    java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder15 = clusteringDBMSBuilder7.setConfigRaw(
          strMap14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0421");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction6 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = null;
    metaUpgradeFlowAction6.accept(upgradeMetaEnv7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction6);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction10 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction11 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv12 = null;
    metaUpgradeFlowAction11.accept(upgradeMetaEnv12);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = metaUpgradeFlowAction10.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction11);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv15 = null;
    metaUpgradeFlowAction10.accept(upgradeMetaEnv15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction17 = metaUpgradeFlowAction6.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction10);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction18 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv19 = null;
    metaUpgradeFlowAction18.accept(upgradeMetaEnv19);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer21 = metaUpgradeFlowAction17.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction18);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer22 = metaUpgradeFlowAction0.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction18);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction23 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction24 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv25 = null;
    metaUpgradeFlowAction24.accept(upgradeMetaEnv25);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction27 = metaUpgradeFlowAction23.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction24);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction28 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction29 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv30 = null;
    metaUpgradeFlowAction29.accept(upgradeMetaEnv30);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction32 = metaUpgradeFlowAction28.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction29);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction33 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction34 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv35 = null;
    metaUpgradeFlowAction34.accept(upgradeMetaEnv35);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction37 = metaUpgradeFlowAction33.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction34);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction38 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction39 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv40 = null;
    metaUpgradeFlowAction39.accept(upgradeMetaEnv40);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction42 = metaUpgradeFlowAction38.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction39);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv43 = null;
    metaUpgradeFlowAction38.accept(upgradeMetaEnv43);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction45 = metaUpgradeFlowAction34.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction38);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction46 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv47 = null;
    metaUpgradeFlowAction46.accept(upgradeMetaEnv47);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer49 = metaUpgradeFlowAction45.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction46);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction50 = metaUpgradeFlowAction28.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction46);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction51 = metaUpgradeFlowAction27.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction50);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction52 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer53 = metaUpgradeFlowAction51.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction52);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction54 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction55 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv56 = null;
    metaUpgradeFlowAction55.accept(upgradeMetaEnv56);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction58 = metaUpgradeFlowAction54.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction55);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction59 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction60 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv61 = null;
    metaUpgradeFlowAction60.accept(upgradeMetaEnv61);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction63 = metaUpgradeFlowAction59.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction60);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction64 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction65 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv66 = null;
    metaUpgradeFlowAction65.accept(upgradeMetaEnv66);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction68 = metaUpgradeFlowAction64.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction65);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction69 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction70 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv71 = null;
    metaUpgradeFlowAction70.accept(upgradeMetaEnv71);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction73 = metaUpgradeFlowAction69.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction70);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv74 = null;
    metaUpgradeFlowAction69.accept(upgradeMetaEnv74);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction76 = metaUpgradeFlowAction65.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction69);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction77 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv78 = null;
    metaUpgradeFlowAction77.accept(upgradeMetaEnv78);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer80 = metaUpgradeFlowAction76.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction77);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction81 = metaUpgradeFlowAction59.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction77);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction82 = metaUpgradeFlowAction58.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction81);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction83 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer84 = metaUpgradeFlowAction82.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction83);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer85 = metaUpgradeFlowAction52.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction83);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction86 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction83);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction87 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction88 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv89 = null;
    metaUpgradeFlowAction88.accept(upgradeMetaEnv89);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction91 = metaUpgradeFlowAction87.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction88);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction92 = metaUpgradeFlowAction83.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction88);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction6);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction10);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction11);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction17);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction18);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer21);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer22);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction23);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction24);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction27);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction28);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction29);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction32);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction33);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction34);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction37);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction38);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction39);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction42);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction45);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction46);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer49);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction50);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction51);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction52);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer53);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction54);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction55);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction58);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction59);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction60);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction63);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction64);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction65);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction68);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction69);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction70);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction73);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction76);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction77);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer80);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction81);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction82);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction83);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer84);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer85);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction86);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction87);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction88);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction91);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction92);
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0422");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature4 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context5 = null;
    org.neo4j.values.AnyValue anyValue6 = null;
    org.neo4j.values.AnyValue[] anyValueArray7 = new org.neo4j.values.AnyValue[]{anyValue6};
    org.neo4j.kernel.api.ResourceTracker resourceTracker8 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator9 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context5, anyValueArray7, resourceTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(procedureSignature4);
    org.junit.Assert.assertNotNull(anyValueArray7);
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0423");
    }
    io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider commandGetServerIdCommandProvider0 = new io.github.onograph.dbms.commands.CommandGetServerIdCommandProvider();
    int int1 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = commandGetServerIdCommandProvider0.commandType();
    int int4 = commandGetServerIdCommandProvider0.getPriority();
    int int5 = commandGetServerIdCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType6 = commandGetServerIdCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext7 = null;
    try {
      io.github.onograph.dbms.commands.CommandGetServerIdImpl commandGetServerIdImpl8 = commandGetServerIdCommandProvider0.createCommand(
          executionContext7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.GET_SERVER_ID + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.GET_SERVER_ID));
  }

  @Test
  public void test0424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0424");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener8 = null;
    try {
      databaseManagementServiceClusterImpl5.unregisterDatabaseEventListener(databaseEventListener8);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder6.setMonitors(
        monitors9);
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder10.setExternalDependencies(
        dependencyResolver11);
    java.lang.Class<?> wildcardClass13 = clusteringDBMSBuilder12.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0426");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.config.Configuration configuration9 = null;
    try {
      databaseManagementServiceClusterImpl7.createDatabase("", configuration9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0427");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl6);
    try {
      databaseManagementServiceClusterImpl6.shutdown();
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener6);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl8 = clusteringDBMSBuilder5.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0429");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver2);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener4 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder5 = clusteringDBMSBuilder3.addDatabaseListener(
        databaseEventListener4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder3.setMonitors(
        monitors6);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl8 = clusteringDBMSBuilder3.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0430");
    }
    java.time.Clock clock0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.DbmsManagerWatchTagImpl dbmsManagerWatchTagImpl2 = null;
    java.time.ZoneId zoneId3 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl basicProcedureQuarantineDatabaseImpl4 = io.github.onograph.dbms.serverproc.BasicProcedureQuarantineDatabaseImpl.stnleBasicProcedureQuarantineDatabaseImpl(
        clock0, databaseIdRepository1, dbmsManagerWatchTagImpl2, zoneId3);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature6 = basicProcedureQuarantineDatabaseImpl4.signature();
    org.neo4j.kernel.api.procedure.Context context7 = null;
    org.neo4j.values.AnyValue anyValue8 = null;
    org.neo4j.values.AnyValue[] anyValueArray9 = new org.neo4j.values.AnyValue[]{anyValue8};
    org.neo4j.kernel.api.ResourceTracker resourceTracker10 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator11 = basicProcedureQuarantineDatabaseImpl4.apply(
          context7, anyValueArray9, resourceTracker10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: *** Error: c3bc6648-f892-4d86-9614-b53ef18de3fb");
    } catch (java.lang.IllegalArgumentException e) {
    }
    org.junit.Assert.assertNotNull(basicProcedureQuarantineDatabaseImpl4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(procedureSignature6);
    org.junit.Assert.assertNotNull(anyValueArray9);
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0431");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    org.neo4j.common.DependencyResolver dependencyResolver10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver10);
    java.nio.file.Path path12 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path12);
    java.nio.file.Path path14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder17 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider16);
    java.nio.file.Path path18 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder19 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path18);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder17);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder19);
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0432");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setMonitors(
        monitors9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener11);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.loadPropertiesFromFile(
        "hi!");
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder16 = clusteringDBMSBuilder14.setUserLogProvider(
        logProvider15);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener17 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder18 = clusteringDBMSBuilder16.addDatabaseListener(
        databaseEventListener17);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder16);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder18);
  }

  @Test
  public void test0433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0433");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv5 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv5);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction7 = null;
    try {
      io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction8 = metaUpgradeFlowAction1.andMetaUpgradeFlowAction(
          metaUpgradeFlowAction7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0434");
    }
    java.lang.String[] strArray4 = new java.lang.String[]{"hi!", "enterprise", "enterprise",
        "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray4);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray4);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray4);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray4);
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0435");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl1);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService4 = databaseManagementServiceClusterImpl2.database(
          "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0436");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl4.shutdownDatabase("hi!");
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl4.dropDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0438");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.common.DependencyResolver dependencyResolver8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder7.setExternalDependencies(
        dependencyResolver8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder9.setMonitors(
        monitors10);
    java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder9.setConfigRaw(
          strMap12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0439");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      java.util.List<java.lang.String> strList3 = databaseManagementServiceClusterImpl2.listDatabases();
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService6 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService7 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService8 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path9 = null;
    java.nio.file.Path path10 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
    try {
      int int13 = enhancedBootstrapper0.start(path9, path10, strMap11, true);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNull(databaseManagementService6);
    org.junit.Assert.assertNull(databaseManagementService7);
    org.junit.Assert.assertNull(databaseManagementService8);
  }

  @Test
  public void test0441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0441");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      boolean boolean7 = databaseManagementServiceClusterImpl5.isWraeForSt("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0442");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      boolean boolean8 = databaseManagementServiceClusterImpl5.isWraeForSt("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0443");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.common.DependencyResolver dependencyResolver2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setExternalDependencies(
        dependencyResolver2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder5.setConfigRaw(
          strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
  }

  @Test
  public void test0444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0444");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer5 = null;
    try {
      java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer6 = metaUpgradeFlowAction1.andThen(
          upgradeMetaEnvConsumer5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
  }

  @Test
  public void test0445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0445");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      org.neo4j.graphdb.GraphDatabaseService graphDatabaseService8 = databaseManagementServiceClusterImpl6.database(
          "enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0446");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider11);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "hi!");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule16 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder17 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule16);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl18 = clusteringDBMSBuilder17.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder17);
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0447");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = databaseManagementServiceBuilder8.setMonitors(
        monitors9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder8.addDatabaseListener(
        databaseEventListener11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder14 = databaseManagementServiceBuilder12.setUserLogProvider(
        logProvider13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder14);
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0448");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl5.shutdownDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0449");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService6 = enhancedBootstrapper0.getDatabaseManagementService();
    java.lang.String[] strArray13 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray13);
    try {
      int int15 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray13);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNull(databaseManagementService6);
    org.junit.Assert.assertNotNull(strArray13);
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0450");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl6);
    try {
      databaseManagementServiceClusterImpl6.createDatabase("hi!");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0451");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl2.dropDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0452");
    }
    java.lang.String[] strArray5 = new java.lang.String[]{"", "enterprise", "enterprise",
        "enterprise", "hi!"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray5);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray5);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray5);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray5);
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0453");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    java.lang.String str6 = clusteringDBMSBuilder3.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.setMonitors(
        monitors7);
    java.lang.Class<?> wildcardClass9 = clusteringDBMSBuilder8.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0454");
    }
    io.github.onograph.cluster.raft.module.dprot.ClusterStructureService clusterStructureService0 = null;
    org.neo4j.kernel.database.DatabaseIdRepository databaseIdRepository1 = null;
    io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl basicProcedureClusterMakeGdbDefaultImpl2 = new io.github.onograph.dbms.serverproc.BasicProcedureClusterMakeGdbDefaultImpl(
        clusterStructureService0, databaseIdRepository1);
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature3 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature4 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.internal.kernel.api.procs.ProcedureSignature procedureSignature5 = basicProcedureClusterMakeGdbDefaultImpl2.signature();
    org.neo4j.kernel.api.procedure.Context context6 = null;
    org.neo4j.values.AnyValue anyValue7 = null;
    org.neo4j.values.AnyValue[] anyValueArray8 = new org.neo4j.values.AnyValue[]{anyValue7};
    org.neo4j.kernel.api.ResourceTracker resourceTracker9 = null;
    try {
      org.neo4j.collection.RawIterator<org.neo4j.values.AnyValue[], org.neo4j.internal.kernel.api.exceptions.ProcedureException> anyValueArrayRawIterator10 = basicProcedureClusterMakeGdbDefaultImpl2.apply(
          context6, anyValueArray8, resourceTracker9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(procedureSignature3);
    org.junit.Assert.assertNotNull(procedureSignature4);
    org.junit.Assert.assertNotNull(procedureSignature5);
    org.junit.Assert.assertNotNull(anyValueArray8);
  }

  @Test
  public void test0455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0455");
    }
    java.lang.String[] strArray1 = new java.lang.String[]{""};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray1);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray1);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0456");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    try {
      databaseManagementServiceClusterImpl5.shutdown();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0457");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.common.DependencyResolver dependencyResolver9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder3.setExternalDependencies(
        dependencyResolver9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder10.setMonitors(
        monitors11);
    java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.setConfigRaw(
          strMap13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0458");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      boolean boolean3 = databaseManagementServiceClusterImpl1.isWraeForSt("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0459");
    }
    io.github.onograph.dbms.utils.TokenNamePropertyDTO tokenNamePropertyDTO2 = new io.github.onograph.dbms.utils.TokenNamePropertyDTO(
        "enterprise", "hi!");
    java.lang.String str3 = tokenNamePropertyDTO2.getStrNp();
    java.lang.String str4 = tokenNamePropertyDTO2.getStrNt();
    java.lang.Class<?> wildcardClass5 = tokenNamePropertyDTO2.getClass();
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterprise" + "'", str3, "enterprise");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0460");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    java.lang.String[] strArray8 = new java.lang.String[]{"hi!", "enterprise", "enterprise",
        "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray8);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray8);
    try {
      int int11 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray8);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(strArray8);
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0461");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    try {
      databaseManagementServiceClusterImpl5.createDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0462");
    }
    java.lang.String[] strArray6 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray6);
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0463");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "");
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl12 = clusteringDBMSBuilder5.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0464");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    int int5 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService6 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService7 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService8 = enhancedBootstrapper0.getDatabaseManagementService();
    java.nio.file.Path path9 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
    try {
      int int11 = enhancedBootstrapper0.start(path9, strMap10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertNull(databaseManagementService6);
    org.junit.Assert.assertNull(databaseManagementService7);
    org.junit.Assert.assertNull(databaseManagementService8);
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0465");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    int int5 = enhancedBootstrapper0.stop();
    int int6 = enhancedBootstrapper0.stop();
    int int7 = enhancedBootstrapper0.stop();
    java.nio.file.Path path8 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
    try {
      int int10 = enhancedBootstrapper0.start(path8, strMap9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0466");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    org.neo4j.graphdb.config.Configuration configuration7 = null;
    try {
      databaseManagementServiceClusterImpl2.createDatabase("", configuration7);
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    java.nio.file.Path path8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path8);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder9.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder9.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder9.setUserLogProvider(
        logProvider14);
    java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder17 = clusteringDBMSBuilder15.setConfigRaw(
          strMap16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0468");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl3.createDatabase("enterprise");
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
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    org.neo4j.logging.Log log2 = enhancedBootstrapper0.getLog();
    int int3 = enhancedBootstrapper0.stop();
    int int4 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log5 = enhancedBootstrapper0.getLog();
    java.lang.String[] strArray7 = new java.lang.String[]{""};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray7);
    try {
      int int9 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray7);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertNotNull(log2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertNotNull(log5);
    org.junit.Assert.assertNotNull(strArray7);
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0470");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.startDatabase("");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0471");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    java.nio.file.Path path5 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
    try {
      int int7 = enhancedBootstrapper0.start(path5, strMap6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
  }

  @Test
  public void test0472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0472");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener5 = null;
    try {
      databaseManagementServiceClusterImpl3.registerDatabaseEventListener(databaseEventListener5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0473");
    }
    java.lang.String[] strArray1 = new java.lang.String[]{""};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray1);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray1);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray1);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray1);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0474");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int2 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int3 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType4 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType5 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType6 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext7 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand8 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType5 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType5.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0475");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        "hi!");
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener13 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder14 = clusteringDBMSBuilder6.addDatabaseListener(
        databaseEventListener13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder16 = clusteringDBMSBuilder6.setUserLogProvider(
        logProvider15);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl17 = clusteringDBMSBuilder6.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder14);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder16);
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0476");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder6.addURLAccessRule(
        "", uRLAccessRule10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder6.setUserLogProvider(
        logProvider12);
    java.nio.file.Path path14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        path14);
    org.neo4j.common.DependencyResolver dependencyResolver16 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder17 = clusteringDBMSBuilder15.setExternalDependencies(
        dependencyResolver16);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder17);
  }

  @Test
  public void test0477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0477");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    org.neo4j.graphdb.config.Configuration configuration6 = null;
    try {
      databaseManagementServiceClusterImpl4.createDatabase("hi!", configuration6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0478");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder6.addURLAccessRule(
        "", uRLAccessRule10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder6.setUserLogProvider(
        logProvider12);
    org.neo4j.common.DependencyResolver dependencyResolver14 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder15 = clusteringDBMSBuilder6.setExternalDependencies(
        dependencyResolver14);
    org.neo4j.monitoring.Monitors monitors16 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder17 = clusteringDBMSBuilder6.setMonitors(
        monitors16);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule19 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder20 = clusteringDBMSBuilder6.addURLAccessRule(
        "enterprise", uRLAccessRule19);
    org.neo4j.monitoring.Monitors monitors21 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder22 = clusteringDBMSBuilder20.setMonitors(
        monitors21);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder15);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder17);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder20);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder22);
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0479");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction6 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = null;
    metaUpgradeFlowAction6.accept(upgradeMetaEnv7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction6);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction10 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction11 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv12 = null;
    metaUpgradeFlowAction11.accept(upgradeMetaEnv12);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = metaUpgradeFlowAction10.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction11);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv15 = null;
    metaUpgradeFlowAction10.accept(upgradeMetaEnv15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction17 = metaUpgradeFlowAction6.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction10);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction18 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv19 = null;
    metaUpgradeFlowAction18.accept(upgradeMetaEnv19);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer21 = metaUpgradeFlowAction17.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction18);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction22 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction18);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction23 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction24 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv25 = null;
    metaUpgradeFlowAction24.accept(upgradeMetaEnv25);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction27 = metaUpgradeFlowAction23.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction24);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction28 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction29 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv30 = null;
    metaUpgradeFlowAction29.accept(upgradeMetaEnv30);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction32 = metaUpgradeFlowAction28.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction29);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv33 = null;
    metaUpgradeFlowAction28.accept(upgradeMetaEnv33);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction35 = metaUpgradeFlowAction24.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction28);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction36 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv37 = null;
    metaUpgradeFlowAction36.accept(upgradeMetaEnv37);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer39 = metaUpgradeFlowAction35.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction36);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction40 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction41 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv42 = null;
    metaUpgradeFlowAction41.accept(upgradeMetaEnv42);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction44 = metaUpgradeFlowAction40.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction41);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction45 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction46 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv47 = null;
    metaUpgradeFlowAction46.accept(upgradeMetaEnv47);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction49 = metaUpgradeFlowAction45.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction46);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction50 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction51 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv52 = null;
    metaUpgradeFlowAction51.accept(upgradeMetaEnv52);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction54 = metaUpgradeFlowAction50.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction51);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction55 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction56 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv57 = null;
    metaUpgradeFlowAction56.accept(upgradeMetaEnv57);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction59 = metaUpgradeFlowAction55.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction56);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv60 = null;
    metaUpgradeFlowAction55.accept(upgradeMetaEnv60);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction62 = metaUpgradeFlowAction51.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction55);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction63 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv64 = null;
    metaUpgradeFlowAction63.accept(upgradeMetaEnv64);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer66 = metaUpgradeFlowAction62.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction63);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction67 = metaUpgradeFlowAction45.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction63);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction68 = metaUpgradeFlowAction44.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction67);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction69 = metaUpgradeFlowAction36.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction44);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer70 = metaUpgradeFlowAction0.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction69);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction6);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction10);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction11);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction17);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction18);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer21);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction22);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction23);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction24);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction27);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction28);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction29);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction32);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction35);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction36);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer39);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction40);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction41);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction44);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction45);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction46);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction49);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction50);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction51);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction54);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction55);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction56);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction59);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction62);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction63);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer66);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction67);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction68);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction69);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer70);
  }

  @Test
  public void test0480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0480");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder1.setMonitors(
        monitors7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder8.loadPropertiesFromFile(
        path9);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule12 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = databaseManagementServiceBuilder10.addURLAccessRule(
        "", uRLAccessRule12);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService14 = databaseManagementServiceBuilder10.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
  }

  @Test
  public void test0481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0481");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule10 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule10);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder11.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule15 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder16 = clusteringDBMSBuilder11.addURLAccessRule(
        "enterprise", uRLAccessRule15);
    try {
      org.neo4j.dbms.api.DatabaseManagementService databaseManagementService17 = clusteringDBMSBuilder16.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder16);
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0482");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = clusteringDBMSBuilder6.loadPropertiesFromFile(
        "hi!");
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener13 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder14 = clusteringDBMSBuilder6.addDatabaseListener(
        databaseEventListener13);
    java.lang.String str15 = clusteringDBMSBuilder6.getEdition();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "enterprise" + "'", str15, "enterprise");
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0483");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder3.addURLAccessRule(
        "", uRLAccessRule7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path9);
    org.neo4j.common.DependencyResolver dependencyResolver11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder10.setExternalDependencies(
        dependencyResolver11);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener13 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder14 = databaseManagementServiceBuilder10.addDatabaseListener(
        databaseEventListener13);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener15 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder16 = databaseManagementServiceBuilder10.addDatabaseListener(
        databaseEventListener15);
    java.nio.file.Path path17 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder18 = databaseManagementServiceBuilder10.loadPropertiesFromFile(
        path17);
    java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
    try {
      org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder20 = databaseManagementServiceBuilder18.setConfigRaw(
          strMap19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder14);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder16);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder18);
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0484");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.logging.LogProvider logProvider4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "hi!", uRLAccessRule7);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener9 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder10 = clusteringDBMSBuilder5.addDatabaseListener(
        databaseEventListener9);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder12 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "");
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder14 = clusteringDBMSBuilder12.loadPropertiesFromFile(
        "");
    java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder16 = clusteringDBMSBuilder14.setConfigRaw(
          strMap15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder10);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder14);
  }

  @Test
  public void test0485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0485");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        "");
    org.neo4j.logging.LogProvider logProvider6 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder7 = clusteringDBMSBuilder5.setUserLogProvider(
        logProvider6);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "");
    java.nio.file.Path path10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        path10);
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver12);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0486");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    boolean boolean3 = enhancedBootstrapper0.isRunning();
    org.neo4j.logging.Log log4 = enhancedBootstrapper0.getLog();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService5 = enhancedBootstrapper0.getDatabaseManagementService();
    boolean boolean6 = enhancedBootstrapper0.isRunning();
    java.lang.String[] strArray12 = new java.lang.String[]{"", "enterprise", "enterprise",
        "enterprise", "hi!"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray12);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray12);
    try {
      int int15 = org.neo4j.server.NeoBootstrapper.start(
          (org.neo4j.server.Bootstrapper) enhancedBootstrapper0, strArray12);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    org.junit.Assert.assertNotNull(log4);
    org.junit.Assert.assertNull(databaseManagementService5);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertNotNull(strArray12);
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0487");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder1.getEdition();
    java.lang.String str7 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.logging.LogProvider logProvider8 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder9 = clusteringDBMSBuilder1.setUserLogProvider(
        logProvider8);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "enterprise" + "'", str7, "enterprise");
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder9);
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0488");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.lang.String str4 = clusteringDBMSBuilder1.getEdition();
    java.nio.file.Path path5 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder6 = clusteringDBMSBuilder1.loadPropertiesFromFile(
        path5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder6.setMonitors(
        monitors7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder8.loadPropertiesFromFile(
        path9);
    java.nio.file.Path path11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder10.loadPropertiesFromFile(
        path11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterprise" + "'", str4, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder6);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0489");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl6 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl7 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl5);
    org.neo4j.graphdb.config.Configuration configuration9 = null;
    try {
      databaseManagementServiceClusterImpl7.createDatabase("hi!", configuration9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0490");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    org.neo4j.common.DependencyResolver dependencyResolver6 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.setExternalDependencies(
        dependencyResolver6);
    java.lang.Class<?> wildcardClass8 = clusteringDBMSBuilder7.getClass();
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0491");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    try {
      databaseManagementServiceClusterImpl2.shutdownDatabase("enterprise");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0492");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.logging.LogProvider logProvider8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder7.setUserLogProvider(
        logProvider8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder11 = clusteringDBMSBuilder9.setUserLogProvider(
        logProvider10);
    org.neo4j.common.DependencyResolver dependencyResolver12 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder13 = clusteringDBMSBuilder9.setExternalDependencies(
        dependencyResolver12);
    try {
      io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl14 = clusteringDBMSBuilder9.build();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder11);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder13);
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0493");
    }
    io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider0 = new io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommandCommandProvider();
    int int1 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int2 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    int int3 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType4 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType5 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType6 = nodeStoreWrapperCopyCommandCommandProvider0.commandType();
    int int7 = nodeStoreWrapperCopyCommandCommandProvider0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext8 = null;
    try {
      io.github.onograph.dbms.commands.NodeStoreWrapperCopyCommand nodeStoreWrapperCopyCommand9 = nodeStoreWrapperCopyCommandCommandProvider0.createCommand(
          executionContext8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType5 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType5.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.STORE_COPY + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.STORE_COPY));
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0494");
    }
    io.github.onograph.server.EnhancedBootstrapper enhancedBootstrapper0 = new io.github.onograph.server.EnhancedBootstrapper();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = enhancedBootstrapper0.getDatabaseManagementService();
    int int2 = enhancedBootstrapper0.stop();
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService3 = enhancedBootstrapper0.getDatabaseManagementService();
    int int4 = enhancedBootstrapper0.stop();
    org.neo4j.logging.Log log5 = enhancedBootstrapper0.getLog();
    int int6 = enhancedBootstrapper0.stop();
    int int7 = enhancedBootstrapper0.stop();
    boolean boolean8 = enhancedBootstrapper0.isRunning();
    java.nio.file.Path path9 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
    try {
      int int11 = enhancedBootstrapper0.start(path9, strMap10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNull(databaseManagementService1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNull(databaseManagementService3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertNotNull(log5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0495");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    org.neo4j.graphdb.security.URLAccessRule uRLAccessRule7 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder8 = clusteringDBMSBuilder5.addURLAccessRule(
        "", uRLAccessRule7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = databaseManagementServiceBuilder8.setMonitors(
        monitors9);
    org.neo4j.graphdb.event.DatabaseEventListener databaseEventListener11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder8.addDatabaseListener(
        databaseEventListener11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder14 = databaseManagementServiceBuilder8.setMonitors(
        monitors13);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder14);
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0496");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl1 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl2 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        databaseManagementService0);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl3 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl2);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl4 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl3);
    io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl5 = new io.github.onograph.dbms.service.DatabaseManagementServiceClusterImpl(
        (org.neo4j.dbms.api.DatabaseManagementService) databaseManagementServiceClusterImpl4);
    try {
      databaseManagementServiceClusterImpl5.shutdownDatabase("enterprise");
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
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    org.neo4j.monitoring.Monitors monitors4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder1.setMonitors(
        monitors4);
    java.lang.String str6 = clusteringDBMSBuilder1.getEdition();
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder8 = clusteringDBMSBuilder1.setMonitors(
        monitors7);
    java.nio.file.Path path9 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder10 = clusteringDBMSBuilder8.loadPropertiesFromFile(
        path9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    org.neo4j.dbms.api.DatabaseManagementServiceBuilder databaseManagementServiceBuilder12 = databaseManagementServiceBuilder10.setMonitors(
        monitors11);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "enterprise" + "'", str6, "enterprise");
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder8);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder10);
    org.junit.Assert.assertNotNull(databaseManagementServiceBuilder12);
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0498");
    }
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction0 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction1 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv2 = null;
    metaUpgradeFlowAction1.accept(upgradeMetaEnv2);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction4 = metaUpgradeFlowAction0.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction1);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction5 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction6 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv7 = null;
    metaUpgradeFlowAction6.accept(upgradeMetaEnv7);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction9 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction6);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction10 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction11 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv12 = null;
    metaUpgradeFlowAction11.accept(upgradeMetaEnv12);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction14 = metaUpgradeFlowAction10.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction11);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction15 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction16 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv17 = null;
    metaUpgradeFlowAction16.accept(upgradeMetaEnv17);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction19 = metaUpgradeFlowAction15.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction16);
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv20 = null;
    metaUpgradeFlowAction15.accept(upgradeMetaEnv20);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction22 = metaUpgradeFlowAction11.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction15);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction23 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv upgradeMetaEnv24 = null;
    metaUpgradeFlowAction23.accept(upgradeMetaEnv24);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer26 = metaUpgradeFlowAction22.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction23);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction27 = metaUpgradeFlowAction5.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction23);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction28 = metaUpgradeFlowAction4.andMetaUpgradeFlowAction(
        metaUpgradeFlowAction27);
    io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction metaUpgradeFlowAction29 = io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction.DEFAULT;
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer30 = metaUpgradeFlowAction28.andThen(
        (java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv>) metaUpgradeFlowAction29);
    java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer31 = null;
    try {
      java.util.function.Consumer<io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv> upgradeMetaEnvConsumer32 = upgradeMetaEnvConsumer30.andThen(
          upgradeMetaEnvConsumer31);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction0);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction1);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction4);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction5);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction6);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction9);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction10);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction11);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction14);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction15);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction16);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction19);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction22);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction23);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer26);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction27);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction28);
    org.junit.Assert.assertNotNull(metaUpgradeFlowAction29);
    org.junit.Assert.assertNotNull(upgradeMetaEnvConsumer30);
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0499");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder1 = new io.github.onograph.dbms.service.ClusteringDBMSBuilder(
        path0);
    org.neo4j.monitoring.Monitors monitors2 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder3 = clusteringDBMSBuilder1.setMonitors(
        monitors2);
    java.nio.file.Path path4 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder5 = clusteringDBMSBuilder3.loadPropertiesFromFile(
        path4);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder7 = clusteringDBMSBuilder5.loadPropertiesFromFile(
        "enterprise");
    org.neo4j.logging.LogProvider logProvider8 = null;
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder9 = clusteringDBMSBuilder7.setUserLogProvider(
        logProvider8);
    io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder11 = clusteringDBMSBuilder9.loadPropertiesFromFile(
        "hi!");
    java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
    try {
      io.github.onograph.dbms.service.ClusteringDBMSBuilder clusteringDBMSBuilder13 = clusteringDBMSBuilder9.setConfigRaw(
          strMap12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder3);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder5);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder7);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder9);
    org.junit.Assert.assertNotNull(clusteringDBMSBuilder11);
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0500");
    }
    java.lang.String[] strArray6 = new java.lang.String[]{"hi!", "hi!", "enterprise", "",
        "enterprise", "enterprise"};
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    io.github.onograph.server.EntryPointImpl.stopBootstrapper(strArray6);
    try {
      io.github.onograph.server.EntryPointImpl.startBootstrapper(strArray6);
      org.junit.Assert.fail(
          "Expected exception of type org.neo4j.server.ServerStartupException; message: Argument --home-dir is required and was not provided.");
    } catch (org.neo4j.server.ServerStartupException e) {
    }
    org.junit.Assert.assertNotNull(strArray6);
  }
}

