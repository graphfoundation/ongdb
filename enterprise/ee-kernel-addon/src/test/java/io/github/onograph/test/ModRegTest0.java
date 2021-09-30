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
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingCaltglBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0002");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingNemondBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0003");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingJvlcoaBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0004");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Backup.settingOneubBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0005");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingBoeebBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0006");
    }
    java.lang.String str0 = org.neo4j.kernel.api.security.AuthManager.INITIAL_PASSWORD;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "neo4j" + "'", str0, "neo4j");
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0007");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingNerndBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0008");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Integer> intSetting0 = io.github.onograph.config.Metrics.settingCsmaheInteger;
    org.junit.Assert.assertNotNull(intSetting0);
  }

  @Test
  public void test0009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0009");
    }
    io.github.onograph.config.Metrics.CompressionOption compressionOption0 = io.github.onograph.config.Metrics.CompressionOption.GZ;
    org.junit.Assert.assertTrue(
        "'" + compressionOption0 + "' != '" + io.github.onograph.config.Metrics.CompressionOption.GZ
            + "'",
        compressionOption0.equals(io.github.onograph.config.Metrics.CompressionOption.GZ));
  }

  @Test
  public void test0010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0010");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingJmebdBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0011");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingNeozbBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0012");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingJvreeBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0013");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<java.lang.String>> strListSetting0 = io.github.onograph.config.MainSettings.settingDyithiList;
    org.junit.Assert.assertNotNull(strListSetting0);
  }

  @Test
  public void test0014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0014");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.Metrics.settingCsieaDuration;
    org.junit.Assert.assertNotNull(durationSetting0);
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
    org.neo4j.graphdb.config.Setting<java.lang.Long> longSetting0 = io.github.onograph.config.MainSettings.settingMamfbLong;
    org.junit.Assert.assertNotNull(longSetting0);
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0017");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingGriaBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0018");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingNeeiglBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0019");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingJvgnlBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0020");
    }
    java.lang.String str0 = io.github.onograph.config.Backup.STD_BAK_HOS;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0021");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingJvfeeBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0022");
    }
    io.github.onograph.config.MainSettings mainSettings0 = new io.github.onograph.config.MainSettings();
  }

  @Test
  public void test0023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0023");
    }
    java.lang.String str0 = org.neo4j.kernel.impl.constraints.StandardConstraintSemantics.ERROR_MESSAGE_NODE_KEY;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Node Key constraint requires Neo4j Enterprise Edition" + "'", str0,
        "Node Key constraint requires Neo4j Enterprise Edition");
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0024");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    java.util.function.Consumer<java.lang.String> strConsumer4 = null;
    try {
      boolean boolean5 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (byte) -1, (long) (short) -1, strConsumer4);
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
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingJvhpaeBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0026");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingDaaundBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0027");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<org.neo4j.configuration.helpers.GlobbingPattern>> globbingPatternListSetting0 = io.github.onograph.config.Metrics.settingMerslrList;
    org.junit.Assert.assertNotNull(globbingPatternListSetting0);
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0028");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock1 = null;
    try {
      io.github.onograph.kernel.srv.pagecache.DefaultIOController defaultIOController2 = new io.github.onograph.kernel.srv.pagecache.DefaultIOController(
          config0, systemNanoClock1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0029");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Long> longSetting0 = io.github.onograph.config.Metrics.settingCstnsLong;
    org.junit.Assert.assertNotNull(longSetting0);
  }

  @Test
  public void test0030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0030");
    }
    io.github.onograph.config.SettingMigratorMetricImpl settingMigratorMetricImpl0 = new io.github.onograph.config.SettingMigratorMetricImpl();
    java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
    org.neo4j.logging.Log log3 = null;
    try {
      settingMigratorMetricImpl0.migrate(strMap1, strMap2, log3);
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
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onStop(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0032");
    }
    org.neo4j.internal.kernel.api.security.LoginContext loginContext0 = org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED;
    org.junit.Assert.assertNotNull(loginContext0);
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
    io.github.onograph.config.TxFlowType txFlowType0 = io.github.onograph.config.TxFlowType.TFT_START;
    org.junit.Assert.assertTrue(
        "'" + txFlowType0 + "' != '" + io.github.onograph.config.TxFlowType.TFT_START + "'",
        txFlowType0.equals(io.github.onograph.config.TxFlowType.TFT_START));
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0035");
    }
    long long0 = org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold.DEFAULT_CHECKING_FREQUENCY_MILLIS;
    org.junit.Assert.assertTrue("'" + long0 + "' != '" + 10000L + "'", long0 == 10000L);
  }

  @Test
  public void test0036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0036");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext2 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo3 = defaultLoginContext2.connectionInfo();
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext4 = defaultAuthManager0.login(
          strMap1, clientConnectionInfo3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(defaultLoginContext2);
    org.junit.Assert.assertNotNull(clientConnectionInfo3);
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0037");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onShutdown(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0038");
    }
    org.neo4j.graphdb.config.Setting<java.nio.file.Path> pathSetting0 = io.github.onograph.config.Metrics.settingCsphPath;
    org.junit.Assert.assertNotNull(pathSetting0);
  }

  @Test
  public void test0039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0039");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer5 = null;
    try {
      boolean boolean6 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) '4',
          (long) '#', strConsumer5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0040");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          0L, uniquenessConstraintDescriptor2, (long) ' ');
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor2, propertyCursor3, relationTypeSchemaDescriptor4,
          tokenNameLookup5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0042");
    }
    java.lang.String str0 = org.neo4j.kernel.api.security.AuthManager.INITIAL_USER_NAME;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "neo4j" + "'", str0, "neo4j");
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0043");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingNetnlBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0044");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.Metrics.settingGrpteeSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test0045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0045");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingNeundBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0046");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.storageengine.api.StorageReader storageReader1 = null;
    org.neo4j.internal.kernel.api.Read read2 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory3 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState4 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor5 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext6 = null;
    org.neo4j.memory.MemoryTracker memoryTracker7 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor8 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader1, read2, cursorFactory3, readableTransactionState4, txStateVisitor5,
          cursorContext6, memoryTracker7);
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
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingNeatoaBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0048");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingCyrnndBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0049");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor1 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor1, relationshipScanCursor2, propertyCursor3,
          relationTypeSchemaDescriptor4, tokenNameLookup5);
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
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    java.util.function.Consumer<java.lang.String> strConsumer4 = null;
    try {
      boolean boolean5 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) ' ',
          (long) 1, strConsumer4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0051");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.Metrics.settingPrteiSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0052");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingMeceebBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0053");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingCsebdBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0054");
    }
    io.github.onograph.config.SettingMigratorBackupImpl settingMigratorBackupImpl0 = new io.github.onograph.config.SettingMigratorBackupImpl();
    java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
    org.neo4j.logging.Log log3 = null;
    try {
      settingMigratorBackupImpl0.migrate(strMap1, strMap2, log3);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor1 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor1,
          nodeCursor2, propertyCursor3, labelSchemaDescriptor4, tokenNameLookup5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0056");
    }
    org.neo4j.graphdb.config.Setting<org.neo4j.configuration.helpers.SocketAddress> socketAddressSetting0 = io.github.onograph.config.Backup.settingOneutdSocketAddress;
    org.junit.Assert.assertNotNull(socketAddressSetting0);
  }

  @Test
  public void test0057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0057");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (short) 10, nodeKeyConstraintDescriptor2, (long) (-1));
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
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onInit(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0059");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0060");
    }
    io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService defaultIOControllerService0 = new io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService();
    int int1 = defaultIOControllerService0.getPriority();
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    try {
      org.neo4j.io.pagecache.IOController iOController4 = defaultIOControllerService0.createIOController(
          config2, systemNanoClock3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0061");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor1 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor2 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0062");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.pagecache.CachePopulator.PAAREE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PageCacheProfileLoader" + "'", str0,
        "PageCacheProfileLoader");
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0063");
    }
    int int0 = io.github.onograph.config.Backup.STD_BAK_POR;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6362 + "'", int0 == 6362);
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0064");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingMersaeBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0065");
    }
    org.neo4j.graphdb.config.Setting<io.github.onograph.config.Metrics.CompressionOption> compressionOptionSetting0 = io.github.onograph.config.Metrics.settingCscsroCompressionOption;
    org.junit.Assert.assertNotNull(compressionOptionSetting0);
  }

  @Test
  public void test0066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0066");
    }
    io.github.onograph.config.Metrics.CompressionOption compressionOption0 = io.github.onograph.config.Metrics.CompressionOption.NONE;
    org.junit.Assert.assertTrue("'" + compressionOption0 + "' != '"
            + io.github.onograph.config.Metrics.CompressionOption.NONE + "'",
        compressionOption0.equals(io.github.onograph.config.Metrics.CompressionOption.NONE));
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0067");
    }
    io.github.onograph.config.Metrics.CompressionOption compressionOption0 = io.github.onograph.config.Metrics.CompressionOption.ZIP;
    org.junit.Assert.assertTrue("'" + compressionOption0 + "' != '"
            + io.github.onograph.config.Metrics.CompressionOption.ZIP + "'",
        compressionOption0.equals(io.github.onograph.config.Metrics.CompressionOption.ZIP));
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0068");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingJvmndBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0069");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) '#', nodeKeyConstraintDescriptor2, (long) 1);
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
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext1 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker2 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle3 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext1, componentsChecker2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0071");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.MainSettings.settingEnetgaoBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0072");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.pagecache.CachePopulator.SUXE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".cacheprof" + "'", str0, ".cacheprof");
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0073");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.storageengine.api.StorageReader storageReader2 = null;
    org.neo4j.internal.kernel.api.Read read3 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory4 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState5 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor6 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext7 = null;
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor9 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader2, read3, cursorFactory4, readableTransactionState5, txStateVisitor6,
          cursorContext7, memoryTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0074");
    }
    org.neo4j.internal.kernel.api.security.AccessMode accessMode0 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext1 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo2 = defaultLoginContext1.connectionInfo();
    org.neo4j.internal.kernel.api.security.LoginContext loginContext3 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo2);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode0, clientConnectionInfo2,
        "Node Key constraint requires Neo4j Enterprise Edition");
    try {
      java.lang.String str6 = securityContext5.description();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultLoginContext1);
    org.junit.Assert.assertNotNull(clientConnectionInfo2);
    org.junit.Assert.assertNotNull(loginContext3);
    org.junit.Assert.assertNotNull(securityContext5);
  }

  @Test
  public void test0075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0075");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    java.lang.Class<?> wildcardClass4 = basePageCacheLoadingWatcher0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0076");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext4 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker5 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle6 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext4, componentsChecker5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0077");
    }
    org.neo4j.graphdb.config.Setting<java.lang.String> strSetting0 = io.github.onograph.config.Metrics.settingMersexString;
    org.junit.Assert.assertNotNull(strSetting0);
  }

  @Test
  public void test0078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0078");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.config.Metrics.settingGritlDuration;
    java.lang.Class<?> wildcardClass1 = durationSetting0.getClass();
    org.junit.Assert.assertNotNull(durationSetting0);
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0079");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer5 = null;
    try {
      boolean boolean6 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (byte) 10, (long) (short) 10, strConsumer5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0080");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingJvumbBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0081");
    }
    io.github.onograph.config.SettingMigratorEnterpriseImpl settingMigratorEnterpriseImpl0 = new io.github.onograph.config.SettingMigratorEnterpriseImpl();
    java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
    java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
    org.neo4j.logging.Log log3 = null;
    try {
      settingMigratorEnterpriseImpl0.migrate(strMap1, strMap2, log3);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor2, propertyCursor3,
          labelSchemaDescriptor4, tokenNameLookup5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0083");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor3 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor3, relationshipScanCursor4, propertyCursor5,
          relationTypeSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0084");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingNeghbBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0085");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext4 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo5 = defaultLoginContext4.connectionInfo();
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext6 = defaultAuthManager0.login(
          strMap3, clientConnectionInfo5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(defaultLoginContext4);
    org.junit.Assert.assertNotNull(clientConnectionInfo5);
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0086");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer5 = null;
    try {
      boolean boolean6 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(100L,
          (long) (byte) 0, strConsumer5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0087");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor3, propertyCursor4,
          labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0088");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (-1L), constraintDescriptor2);
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
    io.github.onograph.config.TxFlowType txFlowType0 = io.github.onograph.config.TxFlowType.TFT_UNLMT;
    org.junit.Assert.assertTrue(
        "'" + txFlowType0 + "' != '" + io.github.onograph.config.TxFlowType.TFT_UNLMT + "'",
        txFlowType0.equals(io.github.onograph.config.TxFlowType.TFT_UNLMT));
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0090");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor1 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor2 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor3 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup4 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor1, propertyCursor2, relationTypeSchemaDescriptor3,
          tokenNameLookup4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0091");
    }
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext0 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo1 = defaultLoginContext0.connectionInfo();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = defaultLoginContext0;
    org.junit.Assert.assertNotNull(defaultLoginContext0);
    org.junit.Assert.assertNotNull(clientConnectionInfo1);
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0092");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor2,
          propertyCursor3, labelSchemaDescriptor4, tokenNameLookup5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0093");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) 6362, uniquenessConstraintDescriptor3, (long) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0094");
    }
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer0 = org.neo4j.io.pagecache.tracing.PageCacheTracer.NULL;
    org.junit.Assert.assertNotNull(pageCacheTracer0);
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0095");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.start();
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList4 = defaultAuthManager0.gepiggatgcfList();
    java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext6 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo7 = defaultLoginContext6.connectionInfo();
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext8 = defaultAuthManager0.login(
          strMap5, clientConnectionInfo7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(strMapList4);
    org.junit.Assert.assertNotNull(defaultLoginContext6);
    org.junit.Assert.assertNotNull(clientConnectionInfo7);
  }

  @Test
  public void test0096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0096");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) 6362, uniquenessConstraintDescriptor3, 10L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0097");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (byte) 0, namedDatabaseId3);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) '#', nodeKeyConstraintDescriptor3, (long) (short) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0099");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (short) 100, namedDatabaseId3);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (short) -1, uniquenessConstraintDescriptor4, 0L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0101");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (byte) -1, nodeKeyConstraintDescriptor4, 100L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0102");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject9 = securityContextEnterpriseImpl4.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl4.withMode(
        adminAccessMode10);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource12 = null;
    boolean boolean13 = securityContextEnterpriseImpl4.allowsAdminAction(adminActionOnResource12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0103");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor3 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor3,
          nodeCursor4, propertyCursor5, labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0104");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0105");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor1 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor2 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor3 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup4 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor1,
          propertyCursor2, labelSchemaDescriptor3, tokenNameLookup4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0106");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) 10, constraintDescriptor2);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor3,
          propertyCursor4, labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0108");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.storageengine.api.StorageReader storageReader3 = null;
    org.neo4j.internal.kernel.api.Read read4 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory5 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState6 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    org.neo4j.memory.MemoryTracker memoryTracker9 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor10 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader3, read4, cursorFactory5, readableTransactionState6, txStateVisitor7,
          cursorContext8, memoryTracker9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0109");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    authManager3.stop();
    authManager3.shutdown();
    authManager3.init();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0110");
    }
    org.neo4j.internal.kernel.api.security.AccessMode accessMode0 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext1 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo2 = defaultLoginContext1.connectionInfo();
    org.neo4j.internal.kernel.api.security.LoginContext loginContext3 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo2);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode0, clientConnectionInfo2,
        "Node Key constraint requires Neo4j Enterprise Edition");
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler6 = null;
    securityContext5.assertCredentialsNotExpired(securityAuthorizationHandler6);
    org.junit.Assert.assertNotNull(defaultLoginContext1);
    org.junit.Assert.assertNotNull(clientConnectionInfo2);
    org.junit.Assert.assertNotNull(loginContext3);
    org.junit.Assert.assertNotNull(securityContext5);
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0111");
    }
    java.lang.String str0 = org.neo4j.kernel.impl.constraints.StandardConstraintSemantics.ERROR_MESSAGE_EXISTS;
    org.junit.Assert.assertEquals(
        "'" + str0 + "' != '" + "Property existence constraint requires Neo4j Enterprise Edition"
            + "'", str0, "Property existence constraint requires Neo4j Enterprise Edition");
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0112");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager2 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    authManager2.start();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager2);
  }

  @Test
  public void test0113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0113");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) 2, uniquenessConstraintDescriptor4, (long) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0114");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa(10L, namedDatabaseId3);
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
    org.neo4j.internal.kernel.api.security.AccessMode accessMode0 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext1 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo2 = defaultLoginContext1.connectionInfo();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext4 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode0, clientConnectionInfo2, "neo4j");
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler5 = null;
    securityContext4.assertCredentialsNotExpired(securityAuthorizationHandler5);
    org.junit.Assert.assertNotNull(defaultLoginContext1);
    org.junit.Assert.assertNotNull(clientConnectionInfo2);
    org.junit.Assert.assertNotNull(securityContext4);
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0116");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) 100, constraintDescriptor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0117");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.config.Metrics.settingPrteeBoolean;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0118");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor2 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor2, relationshipScanCursor3, propertyCursor4,
          relationTypeSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0119");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor4, propertyCursor5,
          labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0120");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    securityProviderAuthDisabledImpl0.init();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0121");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer2 = enterpriseTracerFactory0.createDatabaseTracer(
        clock1);
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler4 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock5 = null;
    org.neo4j.logging.Log log6 = null;
    org.neo4j.configuration.Config config7 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer8 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors3, jobScheduler4, systemNanoClock5, log6, config7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseTracer2);
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0122");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor2 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor2,
          nodeCursor3, propertyCursor4, labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0123");
    }
    org.neo4j.graphdb.config.Setting<io.github.onograph.config.TxFlowType> txFlowTypeSetting0 = io.github.onograph.config.Backup.settingInmluaTxFlowType;
    org.junit.Assert.assertNotNull(txFlowTypeSetting0);
  }

  @Test
  public void test0124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0124");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor2, propertyCursor3,
          labelSchemaDescriptor4, tokenNameLookup5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0125");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor2 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor2, nodeCursor3, propertyCursor4, labelSchemaDescriptor5,
          tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0126");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor2,
          propertyCursor3, labelSchemaDescriptor4, tokenNameLookup5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0127");
    }
    io.github.onograph.config.Metrics metrics0 = new io.github.onograph.config.Metrics();
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0128");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (short) 100, namedDatabaseId6);
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
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl0.authorize(
        idLookup7, "", abstractSecurityLog9);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup11 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog13 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl14 = securityContextEnterpriseImpl10.authorize(
        idLookup11, "AUTH_DISABLED with FULL", abstractSecurityLog13);
    java.lang.Class<?> wildcardClass15 = securityContextEnterpriseImpl14.getClass();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0130");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    authManager3.stop();
    authManager3.start();
    authManager3.start();
    authManager3.init();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0131");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (short) 100, uniquenessConstraintDescriptor4, (long) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0132");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    java.lang.Class<?> wildcardClass1 = securityProviderAuthDisabledImpl0.getClass();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0133");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.storageengine.api.StorageReader storageReader2 = null;
    org.neo4j.internal.kernel.api.Read read3 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory4 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState5 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor6 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext7 = null;
    org.neo4j.memory.MemoryTracker memoryTracker8 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor9 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader2, read3, cursorFactory4, readableTransactionState5, txStateVisitor6,
          cursorContext7, memoryTracker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0134");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (-1), constraintDescriptor3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0135");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext2 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker3 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle4 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext2, componentsChecker3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0136");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    org.neo4j.monitoring.Monitors monitors1 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler2 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    org.neo4j.logging.Log log4 = null;
    org.neo4j.configuration.Config config5 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer6 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors1, jobScheduler2, systemNanoClock3, log4, config5);
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
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (short) -1, namedDatabaseId3);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          10000L, constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0139");
    }
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode0 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext1 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject2 = defaultLoginContext1.subject();
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo3 = null;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode4 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext5 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo6 = defaultLoginContext5.connectionInfo();
    java.util.Set<java.lang.String> strSet7 = defaultLoginContext5.roeSet();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = new io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl(
        adminAccessMode0, authSubject2, clientConnectionInfo3, accessMode4, strSet7, "volumetric");
    java.util.Set<java.lang.String> strSet10 = securityContextEnterpriseImpl9.roles();
    try {
      java.lang.String str11 = securityContextEnterpriseImpl9.description();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultLoginContext1);
    org.junit.Assert.assertNotNull(authSubject2);
    org.junit.Assert.assertNotNull(defaultLoginContext5);
    org.junit.Assert.assertNotNull(clientConnectionInfo6);
    org.junit.Assert.assertNotNull(strSet7);
    org.junit.Assert.assertNotNull(strSet10);
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0140");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor3, propertyCursor4,
          labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0141");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl6.authorize(
        idLookup7, "Node Key constraint requires Neo4j Enterprise Edition", abstractSecurityLog9);
    try {
      java.lang.String str11 = securityContextEnterpriseImpl6.description();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
  }

  @Test
  public void test0142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0142");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) 10, namedDatabaseId6);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa(0L, namedDatabaseId9);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          1L, nodeKeyConstraintDescriptor3, (long) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0144");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager4.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup10 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog12 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl13 = securityContextEnterpriseImpl9.authorize(
        idLookup10, "neo4j", abstractSecurityLog12);
    authManager4.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl13);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode15 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext16 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo17 = defaultLoginContext16.connectionInfo();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject18 = defaultLoginContext16.subject();
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo19 = null;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext20 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode21 = securityContext20.mode();
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext22 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    java.util.Set<java.lang.String> strSet23 = defaultLoginContext22.roeSet();
    java.util.Set<java.lang.String> strSet25 = defaultLoginContext22.roeSet();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl27 = new io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl(
        adminAccessMode15, authSubject18, clientConnectionInfo19, accessMode21, strSet25,
        ".cacheprof");
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl28 = securityContextEnterpriseImpl13.withMode(
        accessMode21);
    java.lang.String str29 = securityContextEnterpriseImpl13.database();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl13);
    org.junit.Assert.assertNotNull(defaultLoginContext16);
    org.junit.Assert.assertNotNull(clientConnectionInfo17);
    org.junit.Assert.assertNotNull(authSubject18);
    org.junit.Assert.assertNotNull(securityContext20);
    org.junit.Assert.assertTrue("'" + accessMode21 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode21.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(defaultLoginContext22);
    org.junit.Assert.assertNotNull(strSet23);
    org.junit.Assert.assertNotNull(strSet25);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl28);
    org.junit.Assert.assertNull(str29);
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0145");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor3 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor3, nodeCursor4, propertyCursor5, labelSchemaDescriptor6,
          tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0146");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext4 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo5 = defaultLoginContext4.connectionInfo();
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext6 = io.github.onograph.kernel.api.security.DefaultLoginContext.fulacsDefaultLoginContext(
        clientConnectionInfo5);
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext7 = defaultAuthManager0.login(
          strMap3, clientConnectionInfo5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(defaultLoginContext4);
    org.junit.Assert.assertNotNull(clientConnectionInfo5);
    org.junit.Assert.assertNotNull(defaultLoginContext6);
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0147");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.init();
    java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext4 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo6 = defaultLoginContext4.connectionInfo();
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext7 = defaultAuthManager0.login(
          strMap3, clientConnectionInfo6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(defaultLoginContext4);
    org.junit.Assert.assertNotNull(clientConnectionInfo6);
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0148");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext6 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo7 = defaultLoginContext6.connectionInfo();
    org.neo4j.internal.kernel.api.security.LoginContext loginContext8 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo7);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext10 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode5, clientConnectionInfo7,
        "Node Key constraint requires Neo4j Enterprise Edition");
    authManager3.log("volumetric", securityContext10);
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(defaultLoginContext6);
    org.junit.Assert.assertNotNull(clientConnectionInfo7);
    org.junit.Assert.assertNotNull(loginContext8);
    org.junit.Assert.assertNotNull(securityContext10);
  }

  @Test
  public void test0149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0149");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource9 = null;
    boolean boolean10 = securityContextEnterpriseImpl4.allowsAdminAction(adminActionOnResource9);
    java.lang.String str11 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl4;
    java.util.Set<java.lang.String> strSet13 = securityContextEnterpriseImpl4.roles();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AUTH_DISABLED with FULL" + "'", str11,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(strSet13);
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0150");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) ' ', namedDatabaseId3);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor4 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor4, relationshipScanCursor5, propertyCursor6,
          relationTypeSchemaDescriptor7, tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0152");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.claauch();
    defaultAuthManager0.claauch();
    java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext4 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo5 = defaultLoginContext4.connectionInfo();
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext6 = io.github.onograph.kernel.api.security.DefaultLoginContext.fulacsDefaultLoginContext(
        clientConnectionInfo5);
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext7 = defaultAuthManager0.login(
          strMap3, clientConnectionInfo5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(defaultLoginContext4);
    org.junit.Assert.assertNotNull(clientConnectionInfo5);
    org.junit.Assert.assertNotNull(defaultLoginContext6);
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0153");
    }
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext0 = null;
  }

  @Test
  public void test0154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0154");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor3, propertyCursor4, relationTypeSchemaDescriptor5,
          tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0155");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer5 = null;
    try {
      boolean boolean6 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (byte) 10, (long) '#', strConsumer5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0156");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          1L, constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0157");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.authManager();
    authManager6.shutdown();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(authManager6);
  }

  @Test
  public void test0158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0158");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (byte) -1, namedDatabaseId6);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor2 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor2, nodeCursor3, propertyCursor4, labelSchemaDescriptor5,
          tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0160");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    java.lang.Class<?> wildcardClass4 = authManager3.getClass();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0161");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor1 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor2 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor3 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup4 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor1, propertyCursor2,
          labelSchemaDescriptor3, tokenNameLookup4);
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
    io.github.onograph.config.Backup backup0 = new io.github.onograph.config.Backup();
    java.lang.Class<?> wildcardClass1 = backup0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0163");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager4.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup10 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog12 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl13 = securityContextEnterpriseImpl9.authorize(
        idLookup10, "neo4j", abstractSecurityLog12);
    authManager4.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl13);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource15 = null;
    boolean boolean16 = securityContextEnterpriseImpl13.allowsAdminAction(adminActionOnResource15);
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl13);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test0164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0164");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (short) 1, uniquenessConstraintDescriptor3, (long) (byte) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0165");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    securityProviderAuthDisabledImpl0.shutdown();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
  }

  @Test
  public void test0166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0166");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext6 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker7 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle8 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext6, componentsChecker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0167");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor4 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor4, nodeCursor5, propertyCursor6, labelSchemaDescriptor7,
          tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0168");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (byte) 10, nodeKeyConstraintDescriptor3, (long) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0169");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (short) -1, uniquenessConstraintDescriptor2, 10L);
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
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager2 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager2);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(authManager6);
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0171");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor1 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor1, nodeCursor2, propertyCursor3, labelSchemaDescriptor4,
          tokenNameLookup5);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (byte) 10, constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0173");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0174");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext4 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker5 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle6 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext4, componentsChecker5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0175");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer2 = enterpriseTracerFactory0.createDatabaseTracer(
        clock1);
    java.lang.Class<?> wildcardClass3 = databaseTracer2.getClass();
    org.junit.Assert.assertNotNull(databaseTracer2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0176");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str6 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str7 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext8 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker9 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle10 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext8, componentsChecker9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str6, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "pagecachewarmer" + "'", str7,
        "pagecachewarmer");
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0177");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0178");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager2 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    authManager2.shutdown();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager2);
  }

  @Test
  public void test0179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0179");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.lang.String str1 = enterpriseTracerFactory0.getName();
    org.neo4j.monitoring.Monitors monitors2 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler3 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock4 = null;
    org.neo4j.logging.Log log5 = null;
    org.neo4j.configuration.Config config6 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer7 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors2, jobScheduler3, systemNanoClock4, log5, config6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "verbose" + "'", str1, "verbose");
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0180");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.stop();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
  }

  @Test
  public void test0181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0181");
    }
    io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService defaultIOControllerService0 = new io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService();
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock2 = null;
    try {
      org.neo4j.io.pagecache.IOController iOController3 = defaultIOControllerService0.createIOController(
          config1, systemNanoClock2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0182");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor3 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor3,
          nodeCursor4, propertyCursor5, labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0183");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (short) 1, nodeKeyConstraintDescriptor3, (long) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0184");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) (short) 1);
    java.util.function.Consumer<java.lang.String> strConsumer10 = null;
    try {
      boolean boolean11 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(10000L,
          (long) '4', strConsumer10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0185");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          0L, nodeKeyConstraintDescriptor4, (long) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0186");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer5 = null;
    try {
      boolean boolean6 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 'a',
          (long) (byte) 1, strConsumer5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0187");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.checkPointHappened((-1L));
    java.util.function.Consumer<java.lang.String> strConsumer9 = null;
    try {
      boolean boolean10 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 'a',
          (long) 2, strConsumer9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0188");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          0L, uniquenessConstraintDescriptor4, (long) (byte) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0189");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) 100, constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0190");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    securityProviderAuthDisabledImpl0.shutdown();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager7 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager8 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager6);
    org.junit.Assert.assertNotNull(authManager7);
    org.junit.Assert.assertNotNull(authManager8);
  }

  @Test
  public void test0191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0191");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (-1), namedDatabaseId6);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (byte) 0, namedDatabaseId9);
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
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.initialize((long) '4');
    long long7 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) ' ');
    java.util.function.Consumer<java.lang.String> strConsumer12 = null;
    try {
      boolean boolean13 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 6362,
          (long) (byte) -1, strConsumer12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0193");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str6 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext7 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker8 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle9 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext7, componentsChecker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "pagecachewarmer" + "'", str6,
        "pagecachewarmer");
  }

  @Test
  public void test0194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0194");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0195");
    }
    org.neo4j.internal.kernel.api.security.LoginContext loginContext0 = null;
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = loginContext0;
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0196");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer8 = null;
    try {
      boolean boolean9 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (short) 10, (-1L), strConsumer8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
  }

  @Test
  public void test0197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0197");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.checkPointHappened((-1L));
    java.util.function.Consumer<java.lang.String> strConsumer9 = null;
    try {
      boolean boolean10 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (byte) 100, 1L, strConsumer9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0198");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor4, propertyCursor5, relationTypeSchemaDescriptor6,
          tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0199");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (byte) 1, constraintDescriptor2);
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
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.clneac();
    defaultAuthManager0.clneac();
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList5 = defaultAuthManager0.gepiggatgcfList();
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(strMapList5);
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0201");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.claauch();
    defaultAuthManager0.claauch();
    java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup5 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog7 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl8 = securityContextEnterpriseImpl4.authorize(
        idLookup5, "neo4j", abstractSecurityLog7);
    java.lang.String str9 = securityContextEnterpriseImpl8.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl8.withMode(
        accessMode10);
    java.lang.String str12 = securityContextEnterpriseImpl8.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject13 = securityContextEnterpriseImpl8.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode14 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = securityContextEnterpriseImpl8.withMode(
        adminAccessMode14);
    boolean boolean17 = securityContextEnterpriseImpl15.allowExecuteAdminProcedure((int) (byte) 1);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode18 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl19 = securityContextEnterpriseImpl15.withMode(
        adminAccessMode18);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo20 = securityContextEnterpriseImpl15.connectionInfo();
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext21 = defaultAuthManager0.login(
          strMap3, clientConnectionInfo20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl8);
    org.junit.Assert.assertNull(str9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AUTH_DISABLED with FULL" + "'", str12,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject13);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl19);
    org.junit.Assert.assertNotNull(clientConnectionInfo20);
  }

  @Test
  public void test0202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0202");
    }
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext0 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler1 = null;
    securityContext0.assertCredentialsNotExpired(securityAuthorizationHandler1);
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler3 = null;
    securityContext0.assertCredentialsNotExpired(securityAuthorizationHandler3);
    org.junit.Assert.assertNotNull(securityContext0);
  }

  @Test
  public void test0203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0203");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (short) -1, namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId13);
  }

  @Test
  public void test0204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0204");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.storageengine.api.StorageReader storageReader5 = null;
    org.neo4j.internal.kernel.api.Read read6 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory7 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState8 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor9 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor12 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader5, read6, cursorFactory7, readableTransactionState8, txStateVisitor9,
          cursorContext10, memoryTracker11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0205");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer2 = enterpriseTracerFactory0.createDatabaseTracer(
        clock1);
    java.time.Clock clock3 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer4 = enterpriseTracerFactory0.createDatabaseTracer(
        clock3);
    java.time.Clock clock5 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer6 = enterpriseTracerFactory0.createDatabaseTracer(
        clock5);
    java.lang.String str7 = enterpriseTracerFactory0.getName();
    org.neo4j.monitoring.Monitors monitors8 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler9 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock10 = null;
    org.neo4j.logging.Log log11 = null;
    org.neo4j.configuration.Config config12 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors8, jobScheduler9, systemNanoClock10, log11, config12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseTracer2);
    org.junit.Assert.assertNotNull(databaseTracer4);
    org.junit.Assert.assertNotNull(databaseTracer6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "verbose" + "'", str7, "verbose");
  }

  @Test
  public void test0206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0206");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext3 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker4 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle5 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext3, componentsChecker4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0207");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          1L, uniquenessConstraintDescriptor4, 10000L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0208");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.initialize((long) '4');
    long long7 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer10 = null;
    try {
      boolean boolean11 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) (-1),
          (long) 10, strConsumer10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
  }

  @Test
  public void test0209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0209");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0210");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.claauch();
    defaultAuthManager0.claauch();
    org.junit.Assert.assertNotNull(defaultAuthManager0);
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0211");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor4,
          propertyCursor5, labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0212");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor2 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor3 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor4 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup5 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor2, propertyCursor3, relationTypeSchemaDescriptor4,
          tokenNameLookup5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0213");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler5 = null;
    securityContextEnterpriseImpl4.assertCredentialsNotExpired(securityAuthorizationHandler5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0214");
    }
    org.neo4j.kernel.impl.constraints.ConstraintSemantics constraintSemantics0 = org.neo4j.kernel.impl.constraints.ConstraintSemantics.getConstraintSemantics();
    int int1 = constraintSemantics0.getPriority();
    int int2 = constraintSemantics0.getPriority();
    org.junit.Assert.assertNotNull(constraintSemantics0);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0215");
    }
    org.neo4j.kernel.api.security.AuthManager authManager0 = org.neo4j.kernel.api.security.AuthManager.NO_AUTH;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl2 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup3 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl2.authorize(
        idLookup3, "neo4j", abstractSecurityLog5);
    java.lang.String str7 = securityContextEnterpriseImpl6.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl6.withMode(
        accessMode8);
    java.lang.String str10 = securityContextEnterpriseImpl6.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl6.allowsAdminAction(adminActionOnResource11);
    java.lang.String str13 = securityContextEnterpriseImpl6.description();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    authManager0.log("AUTH_DISABLED with FULL",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    java.lang.String str17 = securityContextEnterpriseImpl6.database();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource18 = null;
    boolean boolean19 = securityContextEnterpriseImpl6.allowsAdminAction(adminActionOnResource18);
    org.junit.Assert.assertNotNull(authManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl2);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AUTH_DISABLED with FULL" + "'", str10,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AUTH_DISABLED with FULL" + "'", str13,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test0216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0216");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) 2);
    long long8 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer11 = null;
    try {
      boolean boolean12 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) ' ',
          (long) (byte) 0, strConsumer11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0217");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) 2, uniquenessConstraintDescriptor6, (long) ' ');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0218");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          1L, constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0219");
    }
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyContinuousImpl checkPointThresholdPolicyContinuousImpl0 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyContinuousImpl();
    java.lang.String str1 = checkPointThresholdPolicyContinuousImpl0.getName();
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold6 = checkPointThresholdPolicyContinuousImpl0.createThreshold(
        config2, systemNanoClock3, logPruning4, logProvider5);
    org.neo4j.configuration.Config config7 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock8 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning9 = null;
    org.neo4j.logging.LogProvider logProvider10 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold11 = checkPointThresholdPolicyContinuousImpl0.createThreshold(
        config7, systemNanoClock8, logPruning9, logProvider10);
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "continuous" + "'", str1, "continuous");
    org.junit.Assert.assertNotNull(checkPointThreshold6);
    org.junit.Assert.assertNotNull(checkPointThreshold11);
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0220");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor5, propertyCursor6, relationTypeSchemaDescriptor7,
          tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0221");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) 6362, namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (-1), namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) 'a', namedDatabaseId14);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId17 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (short) 10, namedDatabaseId17);
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0222");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (short) 0, nodeKeyConstraintDescriptor4, 0L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0223");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.storageengine.api.StorageReader storageReader4 = null;
    org.neo4j.internal.kernel.api.Read read5 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory6 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState7 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    org.neo4j.memory.MemoryTracker memoryTracker10 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor11 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader4, read5, cursorFactory6, readableTransactionState7, txStateVisitor8,
          cursorContext9, memoryTracker10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0224");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor2 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor2,
          nodeCursor3, propertyCursor4, labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0225");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.lang.String str1 = enterpriseTracerFactory0.getName();
    java.lang.String str2 = enterpriseTracerFactory0.getName();
    org.neo4j.monitoring.Monitors monitors3 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler4 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock5 = null;
    org.neo4j.logging.Log log6 = null;
    org.neo4j.configuration.Config config7 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer8 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors3, jobScheduler4, systemNanoClock5, log6, config7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "verbose" + "'", str1, "verbose");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "verbose" + "'", str2, "verbose");
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0226");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup8 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl7.authorize(
        idLookup8, "neo4j", abstractSecurityLog10);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode12 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl13 = securityContextEnterpriseImpl7.withMode(
        accessMode12);
    java.lang.String str14 = securityContextEnterpriseImpl7.database();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject15 = securityContextEnterpriseImpl7.subject();
    authManager5.log("neo4j",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl7);
    authManager5.init();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(authSubject15);
  }

  @Test
  public void test0227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0227");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) '#', nodeKeyConstraintDescriptor6, 0L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0228");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (short) 100, uniquenessConstraintDescriptor6, 10L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0229");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (byte) 1, nodeKeyConstraintDescriptor3, 0L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0230");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (short) -1, namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) 1, namedDatabaseId14);
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0231");
    }
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyVolumetricImpl checkPointThresholdPolicyVolumetricImpl0 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyVolumetricImpl();
    java.lang.String str1 = checkPointThresholdPolicyVolumetricImpl0.getName();
    java.lang.String str2 = checkPointThresholdPolicyVolumetricImpl0.getName();
    java.lang.Class<?> wildcardClass3 = checkPointThresholdPolicyVolumetricImpl0.getClass();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "volumetric" + "'", str1, "volumetric");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "volumetric" + "'", str2, "volumetric");
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0232");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor5, propertyCursor6,
          labelSchemaDescriptor7, tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0233");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) 'a', nodeKeyConstraintDescriptor5, (long) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0234");
    }
    org.neo4j.graphdb.config.Setting<java.util.List<java.lang.String>> strListSetting0 = io.github.onograph.config.MainSettings.settingDyitliList;
    java.lang.Class<?> wildcardClass1 = strListSetting0.getClass();
    org.junit.Assert.assertNotNull(strListSetting0);
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0235");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    org.neo4j.io.pagecache.IOController iOController3 = org.neo4j.io.pagecache.IOController.DISABLED;
    boolean boolean4 = cachePopulatorExtensionFactory0.equals((java.lang.Object) iOController3);
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext6 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker7 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle8 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext6, componentsChecker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(iOController3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0236");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    boolean boolean8 = securityContextEnterpriseImpl6.allowExecuteAdminProcedure(0);
    try {
      java.lang.String str9 = securityContextEnterpriseImpl6.description();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test0237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0237");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject1 = securityContextEnterpriseImpl0.subject();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl0;
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(authSubject1);
  }

  @Test
  public void test0238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0238");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          0L, constraintDescriptor6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0239");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor3,
          propertyCursor4, labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0240");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (short) 100, uniquenessConstraintDescriptor4, (long) (short) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0241");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) 1, nodeKeyConstraintDescriptor4, (long) (-1));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0242");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.claauch();
    defaultAuthManager0.start();
    org.junit.Assert.assertNotNull(defaultAuthManager0);
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0243");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor4 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor4,
          nodeCursor5, propertyCursor6, labelSchemaDescriptor7, tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0244");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager2 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager4.log("",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    authManager4.shutdown();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager2);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0245");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (-1), uniquenessConstraintDescriptor6, (long) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0246");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.checkPointHappened((-1L));
    checkPointThresholdVolumetricPolicy1.initialize((long) (short) 10);
    java.util.function.Consumer<java.lang.String> strConsumer11 = null;
    try {
      boolean boolean12 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (byte) 0, (long) 100, strConsumer11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0247");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (short) 1, nodeKeyConstraintDescriptor4, (long) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0248");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (-1L), uniquenessConstraintDescriptor6, 0L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0249");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          10000L, nodeKeyConstraintDescriptor3, (long) 6362);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0250");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (short) 0, nodeKeyConstraintDescriptor3, (long) (byte) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0251");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa(1L, namedDatabaseId11);
  }

  @Test
  public void test0252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0252");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (byte) 1, uniquenessConstraintDescriptor3, (-1L));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0253");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          0L, nodeKeyConstraintDescriptor5, (long) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0254");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    securityProviderAuthDisabledImpl0.start();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
  }

  @Test
  public void test0255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0255");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor4, propertyCursor5, relationTypeSchemaDescriptor6,
          tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0256");
    }
    io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService defaultIOControllerService0 = new io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService();
    int int1 = defaultIOControllerService0.getPriority();
    int int2 = defaultIOControllerService0.getPriority();
    int int3 = defaultIOControllerService0.getPriority();
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock5 = null;
    try {
      org.neo4j.io.pagecache.IOController iOController6 = defaultIOControllerService0.createIOController(
          config4, systemNanoClock5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0257");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.initialize((long) '4');
    java.util.function.Consumer<java.lang.String> strConsumer9 = null;
    try {
      boolean boolean10 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(0L, (long) 0,
          strConsumer9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0258");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) 0, namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId7);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (byte) -1, namedDatabaseId10);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId12 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId12);
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0259");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (short) 10, constraintDescriptor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0260");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    org.neo4j.io.pagecache.IOController iOController3 = org.neo4j.io.pagecache.IOController.DISABLED;
    boolean boolean4 = cachePopulatorExtensionFactory0.equals((java.lang.Object) iOController3);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext5 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker6 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle7 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext5, componentsChecker6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(iOController3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0261");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor4,
          propertyCursor5, labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0262");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor4 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor4, relationshipScanCursor5, propertyCursor6,
          relationTypeSchemaDescriptor7, tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0263");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject1 = securityContextEnterpriseImpl0.subject();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup2 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog4 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = securityContextEnterpriseImpl0.authorize(
        idLookup2, "localhost", abstractSecurityLog4);
    java.util.Set<java.lang.String> strSet6 = securityContextEnterpriseImpl0.roles();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(authSubject1);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(strSet6);
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0264");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) '4', namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (short) 10, namedDatabaseId14);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId17 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) 100, namedDatabaseId17);
    java.lang.Class<?> wildcardClass19 = pageCacheLoadingWatcherDefaultImpl1.getClass();
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0265");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor5 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor6 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor7 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor8 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup9 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor5, nodeCursor6, propertyCursor7, labelSchemaDescriptor8,
          tokenNameLookup9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0266");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor4, propertyCursor5,
          labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0267");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl6.authorize(
        idLookup7, "neo4j", abstractSecurityLog9);
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl10;
    try {
      java.lang.String str12 = securityContextEnterpriseImpl10.description();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0268");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup8 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl7.authorize(
        idLookup8, "neo4j", abstractSecurityLog10);
    java.lang.String str12 = securityContextEnterpriseImpl11.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode13 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl14 = securityContextEnterpriseImpl11.withMode(
        accessMode13);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource15 = null;
    boolean boolean16 = securityContextEnterpriseImpl14.allowsAdminAction(adminActionOnResource15);
    authManager5.log("localhost",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl14);
    authManager5.stop();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0269");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) '4', namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) 100, namedDatabaseId11);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0270");
    }
    io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService defaultIOControllerService0 = new io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService();
    int int1 = defaultIOControllerService0.getPriority();
    int int2 = defaultIOControllerService0.getPriority();
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock4 = null;
    try {
      org.neo4j.io.pagecache.IOController iOController5 = defaultIOControllerService0.createIOController(
          config3, systemNanoClock4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0271");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) 2);
    long long8 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    long long9 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer12 = null;
    try {
      boolean boolean13 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(100L,
          (long) 100, strConsumer12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0272");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) '4', namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId10);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId12 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId12);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId15 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 10, namedDatabaseId15);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId17 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId17);
  }

  @Test
  public void test0273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0273");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) '#', uniquenessConstraintDescriptor6, 0L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0274");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.initialize((long) '4');
    java.util.function.Consumer<java.lang.String> strConsumer9 = null;
    try {
      boolean boolean10 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (short) 1, 1L, strConsumer9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0275");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) '#', constraintDescriptor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0276");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject1 = securityContextEnterpriseImpl0.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode2 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl3 = securityContextEnterpriseImpl0.withMode(
        adminAccessMode2);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode4 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = securityContextEnterpriseImpl0.withMode(
        adminAccessMode4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(authSubject1);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl3);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0277");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.initialize((long) '4');
    java.util.function.Consumer<java.lang.String> strConsumer9 = null;
    try {
      boolean boolean10 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(0L, (long) 10,
          strConsumer9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0278");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (byte) 1, constraintDescriptor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0279");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    java.util.function.Consumer<java.lang.String> strConsumer7 = null;
    try {
      boolean boolean8 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(100L,
          (long) (short) 100, strConsumer7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0280");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (byte) 10, uniquenessConstraintDescriptor3, (long) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0281");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (byte) -1, constraintDescriptor3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0282");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor5,
          propertyCursor6, labelSchemaDescriptor7, tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0283");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor4,
          propertyCursor5, labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0284");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) '4', namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId13);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId16 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (short) 0, namedDatabaseId16);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId19 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) 'a', namedDatabaseId19);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId22 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) '#', namedDatabaseId22);
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0285");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (byte) 1, uniquenessConstraintDescriptor4, (long) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0286");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor3 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor3, relationshipScanCursor4, propertyCursor5,
          relationTypeSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0287");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) 0, constraintDescriptor3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0288");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.initialize((long) '4');
    java.util.function.Consumer<java.lang.String> strConsumer9 = null;
    try {
      boolean boolean10 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 10,
          (long) (short) 1, strConsumer9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0289");
    }
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyVolumetricImpl checkPointThresholdPolicyVolumetricImpl0 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyVolumetricImpl();
    java.lang.String str1 = checkPointThresholdPolicyVolumetricImpl0.getName();
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold6 = checkPointThresholdPolicyVolumetricImpl0.createThreshold(
        config2, systemNanoClock3, logPruning4, logProvider5);
    java.lang.String str7 = checkPointThresholdPolicyVolumetricImpl0.getName();
    java.lang.String str8 = checkPointThresholdPolicyVolumetricImpl0.getName();
    java.lang.String str9 = checkPointThresholdPolicyVolumetricImpl0.getName();
    java.lang.String str10 = checkPointThresholdPolicyVolumetricImpl0.getName();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "volumetric" + "'", str1, "volumetric");
    org.junit.Assert.assertNotNull(checkPointThreshold6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "volumetric" + "'", str7, "volumetric");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "volumetric" + "'", str8, "volumetric");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "volumetric" + "'", str9, "volumetric");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "volumetric" + "'", str10, "volumetric");
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0290");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0291");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor6 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor7 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor8 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup9 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor6,
          propertyCursor7, labelSchemaDescriptor8, tokenNameLookup9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0292");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.lock.LockTracer lockTracer2 = enterpriseTracerFactory0.createLockTracer(clock1);
    java.lang.String str3 = enterpriseTracerFactory0.getName();
    java.lang.String str4 = enterpriseTracerFactory0.getName();
    org.neo4j.monitoring.Monitors monitors5 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler6 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    org.neo4j.logging.Log log8 = null;
    org.neo4j.configuration.Config config9 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer10 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors5, jobScheduler6, systemNanoClock7, log8, config9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(lockTracer2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "verbose" + "'", str3, "verbose");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "verbose" + "'", str4, "verbose");
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0293");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor7 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor9 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) 0, uniquenessConstraintDescriptor7, (long) 2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0294");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    java.lang.Class<?> wildcardClass5 = securityProviderAuthDisabledImpl0.getClass();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0295");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          1L, uniquenessConstraintDescriptor4, 0L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0296");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (short) -1, constraintDescriptor7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0297");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor6 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor7 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor8 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor9 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup10 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor6, relationshipScanCursor7, propertyCursor8,
          relationTypeSchemaDescriptor9, tokenNameLookup10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0298");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.storageengine.api.StorageReader storageReader4 = null;
    org.neo4j.internal.kernel.api.Read read5 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory6 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState7 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    org.neo4j.memory.MemoryTracker memoryTracker10 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor11 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader4, read5, cursorFactory6, readableTransactionState7, txStateVisitor8,
          cursorContext9, memoryTracker10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0299");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    authManager6.stop();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(authManager6);
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0300");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.start();
    defaultAuthManager0.clneac();
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList5 = defaultAuthManager0.gepiggatgcfList();
    defaultAuthManager0.shutdown();
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(strMapList5);
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0301");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) 1, uniquenessConstraintDescriptor2, (long) 2);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          0L, uniquenessConstraintDescriptor4, 100L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0303");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (byte) -1, constraintDescriptor7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0304");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.toString();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl2 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup3 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl2.authorize(
        idLookup3, "neo4j", abstractSecurityLog5);
    java.lang.String str7 = securityContextEnterpriseImpl2.database();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource8 = null;
    boolean boolean9 = securityContextEnterpriseImpl2.allowsAdminAction(adminActionOnResource8);
    boolean boolean10 = cachePopulatorExtensionFactory0.equals(
        (java.lang.Object) adminActionOnResource8);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext11 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker12 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle13 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext11, componentsChecker12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals(
        "'" + str1 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str1, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl2);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0305");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) ' ', constraintDescriptor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0306");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId1);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId4 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) 0, namedDatabaseId4);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId6);
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0307");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (byte) 1, uniquenessConstraintDescriptor3, 1L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0308");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl0.authorize(
        idLookup7, "", abstractSecurityLog9);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup11 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog13 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl14 = securityContextEnterpriseImpl10.authorize(
        idLookup11, "AUTH_DISABLED with FULL", abstractSecurityLog13);
    java.lang.Class<?> wildcardClass15 = securityContextEnterpriseImpl10.getClass();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0309");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    authManager3.stop();
    authManager3.start();
    authManager3.stop();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0310");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str6 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext7 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker8 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle9 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext7, componentsChecker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str6, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0311");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor6 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor7 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor8 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor9 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup10 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor6, nodeCursor7, propertyCursor8, labelSchemaDescriptor9,
          tokenNameLookup10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0312");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer2 = enterpriseTracerFactory0.createDatabaseTracer(
        clock1);
    java.time.Clock clock3 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer4 = enterpriseTracerFactory0.createDatabaseTracer(
        clock3);
    java.time.Clock clock5 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer6 = enterpriseTracerFactory0.createDatabaseTracer(
        clock5);
    java.time.Clock clock7 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer8 = enterpriseTracerFactory0.createDatabaseTracer(
        clock7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler10 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock11 = null;
    org.neo4j.logging.Log log12 = null;
    org.neo4j.configuration.Config config13 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors9, jobScheduler10, systemNanoClock11, log12, config13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseTracer2);
    org.junit.Assert.assertNotNull(databaseTracer4);
    org.junit.Assert.assertNotNull(databaseTracer6);
    org.junit.Assert.assertNotNull(databaseTracer8);
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0313");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer2 = enterpriseTracerFactory0.createDatabaseTracer(
        clock1);
    java.time.Clock clock3 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer4 = enterpriseTracerFactory0.createDatabaseTracer(
        clock3);
    java.time.Clock clock5 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer6 = enterpriseTracerFactory0.createDatabaseTracer(
        clock5);
    java.lang.String str7 = enterpriseTracerFactory0.getName();
    java.time.Clock clock8 = null;
    org.neo4j.lock.LockTracer lockTracer9 = enterpriseTracerFactory0.createLockTracer(clock8);
    java.time.Clock clock10 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer11 = enterpriseTracerFactory0.createDatabaseTracer(
        clock10);
    java.time.Clock clock12 = null;
    org.neo4j.lock.LockTracer lockTracer13 = enterpriseTracerFactory0.createLockTracer(clock12);
    org.neo4j.monitoring.Monitors monitors14 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock16 = null;
    org.neo4j.logging.Log log17 = null;
    org.neo4j.configuration.Config config18 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer19 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors14, jobScheduler15, systemNanoClock16, log17, config18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseTracer2);
    org.junit.Assert.assertNotNull(databaseTracer4);
    org.junit.Assert.assertNotNull(databaseTracer6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "verbose" + "'", str7, "verbose");
    org.junit.Assert.assertNotNull(lockTracer9);
    org.junit.Assert.assertNotNull(databaseTracer11);
    org.junit.Assert.assertNotNull(lockTracer13);
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0314");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (byte) 100, uniquenessConstraintDescriptor5, (long) (byte) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0315");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager3 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    defaultAuthManager3.log("", securityContext5);
    boolean boolean7 = cachePopulatorExtensionFactory0.equals(
        (java.lang.Object) defaultAuthManager3);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext8 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker9 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle10 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext8, componentsChecker9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertNotNull(defaultAuthManager3);
    org.junit.Assert.assertNotNull(securityContext5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0316");
    }
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext0 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    try {
      io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = defaultLoginContext0.authorize(
          idLookup1, "enterpriseConstraints", abstractSecurityLog3);
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultLoginContext0);
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0317");
    }
    org.neo4j.kernel.api.security.AuthManager authManager0 = org.neo4j.kernel.api.security.AuthManager.NO_AUTH;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl2 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup3 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl2.authorize(
        idLookup3, "neo4j", abstractSecurityLog5);
    java.lang.String str7 = securityContextEnterpriseImpl6.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl6.withMode(
        accessMode8);
    java.lang.String str10 = securityContextEnterpriseImpl6.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl6.allowsAdminAction(adminActionOnResource11);
    java.lang.String str13 = securityContextEnterpriseImpl6.description();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    authManager0.log("AUTH_DISABLED with FULL",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    java.util.Set<java.lang.String> strSet17 = securityContextEnterpriseImpl6.roles();
    org.junit.Assert.assertNotNull(authManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl2);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AUTH_DISABLED with FULL" + "'", str10,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AUTH_DISABLED with FULL" + "'", str13,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(strSet17);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0318");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId1);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId4 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) 0, namedDatabaseId4);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (byte) 100, namedDatabaseId7);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (short) -1, namedDatabaseId10);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) 100, namedDatabaseId13);
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0319");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    securityProviderAuthDisabledImpl0.shutdown();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager7 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject10 = securityContextEnterpriseImpl9.subject();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup11 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog13 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl14 = securityContextEnterpriseImpl9.authorize(
        idLookup11, "localhost", abstractSecurityLog13);
    authManager7.log("continuous",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl14);
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject16 = securityContextEnterpriseImpl14.subject();
    java.lang.Class<?> wildcardClass17 = securityContextEnterpriseImpl14.getClass();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager6);
    org.junit.Assert.assertNotNull(authManager7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNotNull(authSubject10);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl14);
    org.junit.Assert.assertNotNull(authSubject16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0320");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    org.neo4j.io.pagecache.IOController iOController3 = org.neo4j.io.pagecache.IOController.DISABLED;
    boolean boolean4 = cachePopulatorExtensionFactory0.equals((java.lang.Object) iOController3);
    java.lang.String str5 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext6 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker7 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle8 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext6, componentsChecker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(iOController3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pagecachewarmer" + "'", str5,
        "pagecachewarmer");
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0321");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) 2);
    long long8 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    long long9 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    long long10 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer13 = null;
    try {
      boolean boolean14 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 6362,
          10000L, strConsumer13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0322");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor4 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor4, nodeCursor5, propertyCursor6, labelSchemaDescriptor7,
          tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0323");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    java.util.function.Consumer<java.lang.String> strConsumer7 = null;
    try {
      boolean boolean8 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (byte) -1, (long) 'a', strConsumer7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0324");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (byte) -1, uniquenessConstraintDescriptor5, (long) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0325");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.storageengine.api.StorageReader storageReader3 = null;
    org.neo4j.internal.kernel.api.Read read4 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory5 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState6 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    org.neo4j.memory.MemoryTracker memoryTracker9 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor10 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader3, read4, cursorFactory5, readableTransactionState6, txStateVisitor7,
          cursorContext8, memoryTracker9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0326");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(nodeCursor3,
          propertyCursor4, labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0327");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (byte) 100, namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 0, namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) '4', namedDatabaseId14);
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0328");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (-1), constraintDescriptor6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0329");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        adminAccessMode6);
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject8 = securityContextEnterpriseImpl7.subject();
    boolean boolean10 = securityContextEnterpriseImpl7.allowExecuteAdminProcedure(100);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    try {
      boolean boolean12 = securityContextEnterpriseImpl7.allowsAdminAction(adminActionOnResource11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertNotNull(authSubject8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0330");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.clneac();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl5.authorize(
        idLookup6, "neo4j", abstractSecurityLog8);
    java.lang.String str10 = securityContextEnterpriseImpl9.database();
    defaultAuthManager0.log("continuous",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl9);
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList12 = defaultAuthManager0.gepiggatgcfList();
    defaultAuthManager0.shutdown();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup16 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog18 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl19 = securityContextEnterpriseImpl15.authorize(
        idLookup16, "neo4j", abstractSecurityLog18);
    java.lang.String str20 = securityContextEnterpriseImpl19.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode21 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl22 = securityContextEnterpriseImpl19.withMode(
        accessMode21);
    java.lang.String str23 = securityContextEnterpriseImpl19.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource24 = null;
    boolean boolean25 = securityContextEnterpriseImpl19.allowsAdminAction(adminActionOnResource24);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource26 = null;
    boolean boolean27 = securityContextEnterpriseImpl19.allowsAdminAction(adminActionOnResource26);
    defaultAuthManager0.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl19);
    defaultAuthManager0.clneac();
    java.util.Map<java.lang.String, java.lang.Object> strMap30 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl31 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup32 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog34 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl35 = securityContextEnterpriseImpl31.authorize(
        idLookup32, "neo4j", abstractSecurityLog34);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode36 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl37 = securityContextEnterpriseImpl31.withMode(
        accessMode36);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup38 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog40 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl41 = securityContextEnterpriseImpl31.authorize(
        idLookup38, "", abstractSecurityLog40);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup42 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog44 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl45 = securityContextEnterpriseImpl41.authorize(
        idLookup42, "AUTH_DISABLED with FULL", abstractSecurityLog44);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup46 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog48 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl49 = securityContextEnterpriseImpl45.authorize(
        idLookup46, "", abstractSecurityLog48);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo50 = securityContextEnterpriseImpl45.connectionInfo();
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext51 = defaultAuthManager0.login(
          strMap30, clientConnectionInfo50);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strMapList12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl19);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl22);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AUTH_DISABLED with FULL" + "'", str23,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl31);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl35);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl37);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl41);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl45);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl49);
    org.junit.Assert.assertNotNull(clientConnectionInfo50);
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0331");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) '#', constraintDescriptor6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0332");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.storageengine.api.StorageReader storageReader5 = null;
    org.neo4j.internal.kernel.api.Read read6 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory7 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState8 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor9 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor12 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader5, read6, cursorFactory7, readableTransactionState8, txStateVisitor9,
          cursorContext10, memoryTracker11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0333");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa(100L, namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId13);
  }

  @Test
  public void test0334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0334");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (byte) 100, namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId10);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId12 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId12);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId15 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa(10000L, namedDatabaseId15);
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0335");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory4 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock5 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer6 = enterpriseTracerFactory4.createDatabaseTracer(
        clock5);
    java.time.Clock clock7 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer8 = enterpriseTracerFactory4.createDatabaseTracer(
        clock7);
    java.time.Clock clock9 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer10 = enterpriseTracerFactory4.createDatabaseTracer(
        clock9);
    java.lang.String str11 = enterpriseTracerFactory4.getName();
    java.time.Clock clock12 = null;
    org.neo4j.lock.LockTracer lockTracer13 = enterpriseTracerFactory4.createLockTracer(clock12);
    java.time.Clock clock14 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer15 = enterpriseTracerFactory4.createDatabaseTracer(
        clock14);
    java.time.Clock clock16 = null;
    org.neo4j.lock.LockTracer lockTracer17 = enterpriseTracerFactory4.createLockTracer(clock16);
    boolean boolean18 = cachePopulatorExtensionFactory0.equals((java.lang.Object) lockTracer17);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext19 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker20 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle21 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext19, componentsChecker20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertNotNull(databaseTracer6);
    org.junit.Assert.assertNotNull(databaseTracer8);
    org.junit.Assert.assertNotNull(databaseTracer10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "verbose" + "'", str11, "verbose");
    org.junit.Assert.assertNotNull(lockTracer13);
    org.junit.Assert.assertNotNull(databaseTracer15);
    org.junit.Assert.assertNotNull(lockTracer17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0336");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl0.authorize(
        idLookup7, "", abstractSecurityLog9);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl0.allowsAdminAction(adminActionOnResource11);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0337");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa(10000L, namedDatabaseId6);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) -1, namedDatabaseId9);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId12 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (byte) -1, namedDatabaseId12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0338");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.clneac();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl5.authorize(
        idLookup6, "neo4j", abstractSecurityLog8);
    java.lang.String str10 = securityContextEnterpriseImpl9.database();
    defaultAuthManager0.log("continuous",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl9);
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList12 = defaultAuthManager0.gepiggatgcfList();
    defaultAuthManager0.shutdown();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup16 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog18 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl19 = securityContextEnterpriseImpl15.authorize(
        idLookup16, "neo4j", abstractSecurityLog18);
    java.lang.String str20 = securityContextEnterpriseImpl19.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode21 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl22 = securityContextEnterpriseImpl19.withMode(
        accessMode21);
    java.lang.String str23 = securityContextEnterpriseImpl19.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource24 = null;
    boolean boolean25 = securityContextEnterpriseImpl19.allowsAdminAction(adminActionOnResource24);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource26 = null;
    boolean boolean27 = securityContextEnterpriseImpl19.allowsAdminAction(adminActionOnResource26);
    defaultAuthManager0.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl19);
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList29 = defaultAuthManager0.gepiggatgcfList();
    java.util.Map<java.lang.String, java.lang.Object> strMap30 = null;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext31 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo32 = securityContext31.connectionInfo();
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext33 = defaultAuthManager0.login(
          strMap30, clientConnectionInfo32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strMapList12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl19);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl22);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AUTH_DISABLED with FULL" + "'", str23,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(strMapList29);
    org.junit.Assert.assertNotNull(securityContext31);
    org.junit.Assert.assertNotNull(clientConnectionInfo32);
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0339");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str5 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext6 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker7 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle8 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext6, componentsChecker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "pagecachewarmer" + "'", str4,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pagecachewarmer" + "'", str5,
        "pagecachewarmer");
  }

  @Test
  public void test0340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0340");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          1L, nodeKeyConstraintDescriptor5, (long) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0341");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer2 = enterpriseTracerFactory0.createDatabaseTracer(
        clock1);
    java.time.Clock clock3 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer4 = enterpriseTracerFactory0.createDatabaseTracer(
        clock3);
    org.neo4j.monitoring.Monitors monitors5 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler6 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    org.neo4j.logging.Log log8 = null;
    org.neo4j.configuration.Config config9 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer10 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors5, jobScheduler6, systemNanoClock7, log8, config9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseTracer2);
    org.junit.Assert.assertNotNull(databaseTracer4);
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0342");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager7 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(authManager6);
    org.junit.Assert.assertNotNull(authManager7);
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0343");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer2 = enterpriseTracerFactory0.createDatabaseTracer(
        clock1);
    java.time.Clock clock3 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer4 = enterpriseTracerFactory0.createDatabaseTracer(
        clock3);
    java.time.Clock clock5 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer6 = enterpriseTracerFactory0.createDatabaseTracer(
        clock5);
    java.lang.String str7 = enterpriseTracerFactory0.getName();
    java.time.Clock clock8 = null;
    org.neo4j.lock.LockTracer lockTracer9 = enterpriseTracerFactory0.createLockTracer(clock8);
    org.neo4j.monitoring.Monitors monitors10 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler11 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock12 = null;
    org.neo4j.logging.Log log13 = null;
    org.neo4j.configuration.Config config14 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer15 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors10, jobScheduler11, systemNanoClock12, log13, config14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(databaseTracer2);
    org.junit.Assert.assertNotNull(databaseTracer4);
    org.junit.Assert.assertNotNull(databaseTracer6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "verbose" + "'", str7, "verbose");
    org.junit.Assert.assertNotNull(lockTracer9);
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0344");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager4.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup10 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog12 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl13 = securityContextEnterpriseImpl9.authorize(
        idLookup10, "neo4j", abstractSecurityLog12);
    authManager4.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl13);
    java.lang.String str15 = securityContextEnterpriseImpl13.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource16 = null;
    boolean boolean17 = securityContextEnterpriseImpl13.allowsAdminAction(adminActionOnResource16);
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AUTH_DISABLED with FULL" + "'", str15,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0345");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (short) 10, uniquenessConstraintDescriptor3, (-1L));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0346");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl4.authorize(
        idLookup6, "localhost", abstractSecurityLog8);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo10 = securityContextEnterpriseImpl4.connectionInfo();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl4.allowsAdminAction(adminActionOnResource11);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNotNull(clientConnectionInfo10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0347");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    org.neo4j.io.pagecache.IOController iOController3 = org.neo4j.io.pagecache.IOController.DISABLED;
    boolean boolean4 = cachePopulatorExtensionFactory0.equals((java.lang.Object) iOController3);
    java.lang.String str5 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str6 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext7 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker8 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle9 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext7, componentsChecker8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(iOController3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pagecachewarmer" + "'", str5,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str6, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0348");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource9 = null;
    boolean boolean10 = securityContextEnterpriseImpl4.allowsAdminAction(adminActionOnResource9);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl4.allowsAdminAction(adminActionOnResource11);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo13 = securityContextEnterpriseImpl4.connectionInfo();
    org.neo4j.internal.kernel.api.security.LoginContext loginContext14 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo13);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(clientConnectionInfo13);
    org.junit.Assert.assertNotNull(loginContext14);
  }

  @Test
  public void test0349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0349");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) 10, uniquenessConstraintDescriptor5, (long) (short) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0350");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          10L, uniquenessConstraintDescriptor6, (long) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0351");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager2 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    authManager3.init();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl6.authorize(
        idLookup7, "neo4j", abstractSecurityLog9);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode11 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl12 = securityContextEnterpriseImpl6.withMode(
        accessMode11);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup13 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog15 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl16 = securityContextEnterpriseImpl6.authorize(
        idLookup13, "", abstractSecurityLog15);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup17 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog19 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl20 = securityContextEnterpriseImpl16.authorize(
        idLookup17, "AUTH_DISABLED with FULL", abstractSecurityLog19);
    authManager3.log("Property existence constraint requires Neo4j Enterprise Edition",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl16);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource22 = null;
    boolean boolean23 = securityContextEnterpriseImpl16.allowsAdminAction(adminActionOnResource22);
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager2);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl16);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl20);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0352");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    securityProviderAuthDisabledImpl0.shutdown();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.authManager();
    authManager6.shutdown();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager6);
  }

  @Test
  public void test0353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0353");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock1 = null;
    org.neo4j.lock.LockTracer lockTracer2 = enterpriseTracerFactory0.createLockTracer(clock1);
    java.lang.String str3 = enterpriseTracerFactory0.getName();
    java.lang.String str4 = enterpriseTracerFactory0.getName();
    java.time.Clock clock5 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer6 = enterpriseTracerFactory0.createDatabaseTracer(
        clock5);
    java.time.Clock clock7 = null;
    org.neo4j.lock.LockTracer lockTracer8 = enterpriseTracerFactory0.createLockTracer(clock7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler10 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock11 = null;
    org.neo4j.logging.Log log12 = null;
    org.neo4j.configuration.Config config13 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer14 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors9, jobScheduler10, systemNanoClock11, log12, config13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(lockTracer2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "verbose" + "'", str3, "verbose");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "verbose" + "'", str4, "verbose");
    org.junit.Assert.assertNotNull(databaseTracer6);
    org.junit.Assert.assertNotNull(lockTracer8);
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0354");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    securityProviderAuthDisabledImpl0.shutdown();
    securityProviderAuthDisabledImpl0.shutdown();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager5);
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0355");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) 2, nodeKeyConstraintDescriptor5, (long) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0356");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId7);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId9);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId13);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId15 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId15);
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0357");
    }
    io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService defaultIOControllerService0 = new io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService();
    int int1 = defaultIOControllerService0.getPriority();
    int int2 = defaultIOControllerService0.getPriority();
    int int3 = defaultIOControllerService0.getPriority();
    int int4 = defaultIOControllerService0.getPriority();
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock6 = null;
    try {
      org.neo4j.io.pagecache.IOController iOController7 = defaultIOControllerService0.createIOController(
          config5, systemNanoClock6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0358");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) 10, namedDatabaseId6);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa(1L, namedDatabaseId9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0359");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource9 = null;
    boolean boolean10 = securityContextEnterpriseImpl4.allowsAdminAction(adminActionOnResource9);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode11 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl12 = securityContextEnterpriseImpl4.withMode(
        adminAccessMode11);
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler13 = null;
    securityContextEnterpriseImpl12.assertCredentialsNotExpired(securityAuthorizationHandler13);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl12);
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0360");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) '4', namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa(10L, namedDatabaseId14);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId16 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId16);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId18 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId18);
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0361");
    }
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyContinuousImpl checkPointThresholdPolicyContinuousImpl0 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyContinuousImpl();
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock2 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning3 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold5 = checkPointThresholdPolicyContinuousImpl0.createThreshold(
        config1, systemNanoClock2, logPruning3, logProvider4);
    java.lang.String str6 = checkPointThresholdPolicyContinuousImpl0.getName();
    java.lang.String str7 = checkPointThresholdPolicyContinuousImpl0.getName();
    java.lang.String str8 = checkPointThresholdPolicyContinuousImpl0.getName();
    org.neo4j.configuration.Config config9 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock10 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning11 = null;
    org.neo4j.logging.LogProvider logProvider12 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold13 = checkPointThresholdPolicyContinuousImpl0.createThreshold(
        config9, systemNanoClock10, logPruning11, logProvider12);
    java.lang.String str14 = checkPointThresholdPolicyContinuousImpl0.getName();
    java.lang.String str15 = checkPointThresholdPolicyContinuousImpl0.getName();
    org.junit.Assert.assertNotNull(checkPointThreshold5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "continuous" + "'", str6, "continuous");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "continuous" + "'", str7, "continuous");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "continuous" + "'", str8, "continuous");
    org.junit.Assert.assertNotNull(checkPointThreshold13);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "continuous" + "'", str14, "continuous");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "continuous" + "'", str15, "continuous");
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0362");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource9 = null;
    boolean boolean10 = securityContextEnterpriseImpl4.allowsAdminAction(adminActionOnResource9);
    java.lang.String str11 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl4;
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl4;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo14 = securityContextEnterpriseImpl4.connectionInfo();
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext15 = io.github.onograph.kernel.api.security.DefaultLoginContext.fulacsDefaultLoginContext(
        clientConnectionInfo14);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode16 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext17 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo18 = null;
    org.neo4j.internal.kernel.api.security.LoginContext loginContext19 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo18);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext21 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode16, clientConnectionInfo18,
        "Node Key constraint requires Neo4j Enterprise Edition");
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext22 = io.github.onograph.kernel.api.security.DefaultLoginContext.fulacsDefaultLoginContext(
        clientConnectionInfo18);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext23 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode24 = securityContext23.mode();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl26 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.auhdslSecurityContextEnterpriseImpl(
        clientConnectionInfo18, accessMode24, "hi!");
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl28 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.auhdslSecurityContextEnterpriseImpl(
        clientConnectionInfo14, accessMode24, "PageCacheProfileLoader");
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AUTH_DISABLED with FULL" + "'", str11,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(clientConnectionInfo14);
    org.junit.Assert.assertNotNull(defaultLoginContext15);
    org.junit.Assert.assertNotNull(loginContext19);
    org.junit.Assert.assertNotNull(securityContext21);
    org.junit.Assert.assertNotNull(defaultLoginContext22);
    org.junit.Assert.assertNotNull(securityContext23);
    org.junit.Assert.assertTrue("'" + accessMode24 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode24.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl26);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl28);
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0363");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (short) 1, nodeKeyConstraintDescriptor5, (long) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0364");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.init();
    defaultAuthManager0.claauch();
    defaultAuthManager0.claauch();
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList5 = defaultAuthManager0.gepiggatgcfList();
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(strMapList5);
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0365");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) 10, nodeKeyConstraintDescriptor6, 1L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0366");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa(10L, namedDatabaseId6);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) 10, namedDatabaseId9);
  }

  @Test
  public void test0367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0367");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) (short) 0, uniquenessConstraintDescriptor4, (long) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0368");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa(10L, namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa(10L, namedDatabaseId14);
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0369");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory4 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.time.Clock clock5 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer6 = enterpriseTracerFactory4.createDatabaseTracer(
        clock5);
    java.time.Clock clock7 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer8 = enterpriseTracerFactory4.createDatabaseTracer(
        clock7);
    java.time.Clock clock9 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer10 = enterpriseTracerFactory4.createDatabaseTracer(
        clock9);
    java.lang.String str11 = enterpriseTracerFactory4.getName();
    java.time.Clock clock12 = null;
    org.neo4j.lock.LockTracer lockTracer13 = enterpriseTracerFactory4.createLockTracer(clock12);
    java.time.Clock clock14 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer15 = enterpriseTracerFactory4.createDatabaseTracer(
        clock14);
    java.time.Clock clock16 = null;
    org.neo4j.lock.LockTracer lockTracer17 = enterpriseTracerFactory4.createLockTracer(clock16);
    boolean boolean18 = cachePopulatorExtensionFactory0.equals((java.lang.Object) lockTracer17);
    java.lang.String str19 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext20 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker21 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle22 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext20, componentsChecker21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertNotNull(databaseTracer6);
    org.junit.Assert.assertNotNull(databaseTracer8);
    org.junit.Assert.assertNotNull(databaseTracer10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "verbose" + "'", str11, "verbose");
    org.junit.Assert.assertNotNull(lockTracer13);
    org.junit.Assert.assertNotNull(databaseTracer15);
    org.junit.Assert.assertNotNull(lockTracer17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "pagecachewarmer" + "'", str19,
        "pagecachewarmer");
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0370");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.storageengine.api.StorageReader storageReader6 = null;
    org.neo4j.internal.kernel.api.Read read7 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory8 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState9 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor10 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext11 = null;
    org.neo4j.memory.MemoryTracker memoryTracker12 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor13 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader6, read7, cursorFactory8, readableTransactionState9, txStateVisitor10,
          cursorContext11, memoryTracker12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0371");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    boolean boolean8 = securityContextEnterpriseImpl6.allowExecuteAdminProcedure(0);
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo10 = securityContextEnterpriseImpl6.connectionInfo();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject11 = securityContextEnterpriseImpl6.subject();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertNotNull(clientConnectionInfo10);
    org.junit.Assert.assertNotNull(authSubject11);
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0372");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor4 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor4, nodeCursor5, propertyCursor6, labelSchemaDescriptor7,
          tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0373");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    authManager3.stop();
    authManager3.shutdown();
    authManager3.stop();
    authManager3.shutdown();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
  }

  @Test
  public void test0374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0374");
    }
    org.neo4j.internal.kernel.api.security.AccessMode accessMode0 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext1 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo2 = null;
    org.neo4j.internal.kernel.api.security.LoginContext loginContext3 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo2);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext5 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode0, clientConnectionInfo2,
        "Node Key constraint requires Neo4j Enterprise Edition");
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext6 = io.github.onograph.kernel.api.security.DefaultLoginContext.fulacsDefaultLoginContext(
        clientConnectionInfo2);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext7 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode8 = securityContext7.mode();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.auhdslSecurityContextEnterpriseImpl(
        clientConnectionInfo2, accessMode8, "hi!");
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl10.allowsAdminAction(adminActionOnResource11);
    org.junit.Assert.assertNotNull(loginContext3);
    org.junit.Assert.assertNotNull(securityContext5);
    org.junit.Assert.assertNotNull(defaultLoginContext6);
    org.junit.Assert.assertNotNull(securityContext7);
    org.junit.Assert.assertTrue(
        "'" + accessMode8 + "' != '" + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL
            + "'",
        accessMode8.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
  }

  @Test
  public void test0375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0375");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor3, propertyCursor4,
          labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0376");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject1 = securityContextEnterpriseImpl0.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode2 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl3 = securityContextEnterpriseImpl0.withMode(
        adminAccessMode2);
    java.lang.String str4 = securityContextEnterpriseImpl0.database();
    java.lang.String str5 = securityContextEnterpriseImpl0.description();
    java.lang.String str6 = securityContextEnterpriseImpl0.database();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource7 = null;
    boolean boolean8 = securityContextEnterpriseImpl0.allowsAdminAction(adminActionOnResource7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(authSubject1);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl3);
    org.junit.Assert.assertNull(str4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AUTH_DISABLED with FULL" + "'", str5,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNull(str6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0377");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) 6362, namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) 6362, namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId10);
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0378");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          0L, uniquenessConstraintDescriptor4, (-1L));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0379");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.init();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
  }

  @Test
  public void test0380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0380");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor4 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor4,
          nodeCursor5, propertyCursor6, labelSchemaDescriptor7, tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0381");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor4, propertyCursor5, relationTypeSchemaDescriptor6,
          tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0382");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor4, propertyCursor5,
          labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0383");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          10000L, nodeKeyConstraintDescriptor6, 1L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0384");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    org.neo4j.io.pagecache.IOController iOController3 = org.neo4j.io.pagecache.IOController.DISABLED;
    boolean boolean4 = cachePopulatorExtensionFactory0.equals((java.lang.Object) iOController3);
    java.lang.String str5 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str6 = cachePopulatorExtensionFactory0.getName();
    java.lang.Object obj7 = null;
    boolean boolean8 = cachePopulatorExtensionFactory0.equals(obj7);
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext9 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker10 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle11 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext9, componentsChecker10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(iOController3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pagecachewarmer" + "'", str5,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "pagecachewarmer" + "'", str6,
        "pagecachewarmer");
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0385");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str6 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning7 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy8 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning7);
    checkPointThresholdVolumetricPolicy8.initialize((long) (short) 100);
    boolean boolean11 = cachePopulatorExtensionFactory0.equals(
        (java.lang.Object) checkPointThresholdVolumetricPolicy8);
    checkPointThresholdVolumetricPolicy8.initialize(0L);
    checkPointThresholdVolumetricPolicy8.initialize((long) '#');
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str6, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0386");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str6 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str7 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str8 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext9 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker10 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle11 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext9, componentsChecker10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str6, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "pagecachewarmer" + "'", str7,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str8, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0387");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.init();
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList3 = defaultAuthManager0.gepiggatgcfList();
    defaultAuthManager0.init();
    defaultAuthManager0.init();
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(strMapList3);
  }

  @Test
  public void test0388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0388");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) 2);
    long long8 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    long long9 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    long long10 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened(0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0389");
    }
    io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService defaultIOControllerService0 = new io.github.onograph.kernel.srv.pagecache.DefaultIOControllerService();
    int int1 = defaultIOControllerService0.getPriority();
    int int2 = defaultIOControllerService0.getPriority();
    int int3 = defaultIOControllerService0.getPriority();
    int int4 = defaultIOControllerService0.getPriority();
    int int5 = defaultIOControllerService0.getPriority();
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    try {
      org.neo4j.io.pagecache.IOController iOController8 = defaultIOControllerService0.createIOController(
          config6, systemNanoClock7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
  }

  @Test
  public void test0390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0390");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) '4', namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa(10L, namedDatabaseId14);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId16 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId16);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId18 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId18);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId21 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) '#', namedDatabaseId21);
  }

  @Test
  public void test0391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0391");
    }
    org.neo4j.kernel.api.security.AuthManager authManager0 = org.neo4j.kernel.api.security.AuthManager.NO_AUTH;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl2 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup3 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl2.authorize(
        idLookup3, "neo4j", abstractSecurityLog5);
    java.lang.String str7 = securityContextEnterpriseImpl6.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl6.withMode(
        accessMode8);
    java.lang.String str10 = securityContextEnterpriseImpl6.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl6.allowsAdminAction(adminActionOnResource11);
    java.lang.String str13 = securityContextEnterpriseImpl6.description();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    authManager0.log("AUTH_DISABLED with FULL",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode19 = securityContext18.mode();
    java.lang.String str20 = securityContext18.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode21 = securityContext18.mode();
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler22 = null;
    securityContext18.assertCredentialsNotExpired(securityAuthorizationHandler22);
    authManager0.log("hi!", securityContext18);
    org.junit.Assert.assertNotNull(authManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl2);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AUTH_DISABLED with FULL" + "'", str10,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AUTH_DISABLED with FULL" + "'", str13,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(securityContext18);
    org.junit.Assert.assertTrue("'" + accessMode19 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode19.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertTrue("'" + accessMode21 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode21.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0392");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.initialize((long) '4');
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) 'a');
    checkPointThresholdVolumetricPolicy1.initialize((long) (byte) -1);
    java.util.function.Consumer<java.lang.String> strConsumer13 = null;
    try {
      boolean boolean14 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 2,
          (long) 1, strConsumer13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0393");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.clneac();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl5.authorize(
        idLookup6, "neo4j", abstractSecurityLog8);
    java.lang.String str10 = securityContextEnterpriseImpl9.database();
    defaultAuthManager0.log("continuous",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl9);
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList12 = defaultAuthManager0.gepiggatgcfList();
    defaultAuthManager0.start();
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strMapList12);
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0394");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager7 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    authManager7.init();
    authManager7.shutdown();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(authManager6);
    org.junit.Assert.assertNotNull(authManager7);
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0395");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject9 = securityContextEnterpriseImpl4.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl4.withMode(
        adminAccessMode10);
    boolean boolean13 = securityContextEnterpriseImpl11.allowExecuteAdminProcedure((int) (byte) 1);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode14 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = securityContextEnterpriseImpl11.withMode(
        adminAccessMode14);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode16 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl17 = securityContextEnterpriseImpl15.withMode(
        adminAccessMode16);
    java.lang.String str18 = securityContextEnterpriseImpl15.description();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup19 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog21 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl22 = securityContextEnterpriseImpl15.authorize(
        idLookup19, "PageCacheProfileLoader", abstractSecurityLog21);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource23 = null;
    try {
      boolean boolean24 = securityContextEnterpriseImpl22.allowsAdminAction(
          adminActionOnResource23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "user '' with FULL" + "'", str18,
        "user '' with FULL");
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl22);
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0396");
    }
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext0 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo1 = null;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject2 = null;
    java.lang.Class<?> wildcardClass3 = null;
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0397");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) '#', uniquenessConstraintDescriptor3, 10L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0398");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (-1), nodeKeyConstraintDescriptor6, 10000L);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0399");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.checkPointHappened((-1L));
    checkPointThresholdVolumetricPolicy1.checkPointHappened((-1L));
    checkPointThresholdVolumetricPolicy1.initialize((long) (short) 0);
    java.util.function.Consumer<java.lang.String> strConsumer13 = null;
    try {
      boolean boolean14 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (short) 1, (long) (byte) 100, strConsumer13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0400");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl0.authorize(
        idLookup7, "", abstractSecurityLog9);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup11 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog13 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl14 = securityContextEnterpriseImpl10.authorize(
        idLookup11, "AUTH_DISABLED with FULL", abstractSecurityLog13);
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl10;
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl14);
  }

  @Test
  public void test0401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0401");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.logging.Log log4 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl5 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log4);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    pageCacheLoadingWatcherDefaultImpl5.prlcpdForNa((long) (short) 1, namedDatabaseId7);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    pageCacheLoadingWatcherDefaultImpl5.wamsrdForNa(namedDatabaseId9);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId12 = null;
    pageCacheLoadingWatcherDefaultImpl5.wapclForNa((long) (-1), namedDatabaseId12);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId15 = null;
    pageCacheLoadingWatcherDefaultImpl5.prlcpdForNa((long) '4', namedDatabaseId15);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId17 = null;
    pageCacheLoadingWatcherDefaultImpl5.wamsrdForNa(namedDatabaseId17);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId20 = null;
    pageCacheLoadingWatcherDefaultImpl5.wapclForNa((long) (short) 0, namedDatabaseId20);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId22 = null;
    pageCacheLoadingWatcherDefaultImpl5.wamsrdForNa(namedDatabaseId22);
    boolean boolean24 = cachePopulatorExtensionFactory0.equals(
        (java.lang.Object) namedDatabaseId22);
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str3, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0402");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId7);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 10, namedDatabaseId10);
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0403");
    }
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext0 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    java.util.Set<java.lang.String> strSet1 = null;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup2 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog4 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = null;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = null;
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler10 = null;
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0404");
    }
    io.github.onograph.kernel.trace.EnterpriseTracerFactory enterpriseTracerFactory0 = new io.github.onograph.kernel.trace.EnterpriseTracerFactory();
    java.lang.String str1 = enterpriseTracerFactory0.getName();
    java.time.Clock clock2 = null;
    org.neo4j.lock.LockTracer lockTracer3 = enterpriseTracerFactory0.createLockTracer(clock2);
    java.time.Clock clock4 = null;
    org.neo4j.kernel.impl.transaction.tracing.DatabaseTracer databaseTracer5 = enterpriseTracerFactory0.createDatabaseTracer(
        clock4);
    org.neo4j.monitoring.Monitors monitors6 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler7 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock8 = null;
    org.neo4j.logging.Log log9 = null;
    org.neo4j.configuration.Config config10 = null;
    try {
      org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer11 = enterpriseTracerFactory0.createPageCacheTracer(
          monitors6, jobScheduler7, systemNanoClock8, log9, config10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "verbose" + "'", str1, "verbose");
    org.junit.Assert.assertNotNull(lockTracer3);
    org.junit.Assert.assertNotNull(databaseTracer5);
  }

  @Test
  public void test0405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0405");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager2 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    authManager3.init();
    authManager3.start();
    authManager3.shutdown();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager2);
    org.junit.Assert.assertNotNull(authManager3);
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0406");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor5 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor6 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor7 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor8 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup9 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor5,
          nodeCursor6, propertyCursor7, labelSchemaDescriptor8, tokenNameLookup9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0407");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext6 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker7 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle8 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext6, componentsChecker7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "pagecachewarmer" + "'", str4,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0408");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.clneac();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl5.authorize(
        idLookup6, "neo4j", abstractSecurityLog8);
    java.lang.String str10 = securityContextEnterpriseImpl9.database();
    defaultAuthManager0.log("continuous",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl9);
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList12 = defaultAuthManager0.gepiggatgcfList();
    defaultAuthManager0.shutdown();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup16 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog18 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl19 = securityContextEnterpriseImpl15.authorize(
        idLookup16, "neo4j", abstractSecurityLog18);
    java.lang.String str20 = securityContextEnterpriseImpl19.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode21 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl22 = securityContextEnterpriseImpl19.withMode(
        accessMode21);
    java.lang.String str23 = securityContextEnterpriseImpl19.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource24 = null;
    boolean boolean25 = securityContextEnterpriseImpl19.allowsAdminAction(adminActionOnResource24);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource26 = null;
    boolean boolean27 = securityContextEnterpriseImpl19.allowsAdminAction(adminActionOnResource26);
    defaultAuthManager0.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl19);
    defaultAuthManager0.stop();
    java.util.Map<java.lang.String, java.lang.Object> strMap30 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl31 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup32 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog34 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl35 = securityContextEnterpriseImpl31.authorize(
        idLookup32, "neo4j", abstractSecurityLog34);
    java.lang.String str36 = securityContextEnterpriseImpl35.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode37 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl38 = securityContextEnterpriseImpl35.withMode(
        accessMode37);
    java.lang.String str39 = securityContextEnterpriseImpl35.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject40 = securityContextEnterpriseImpl35.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode41 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl42 = securityContextEnterpriseImpl35.withMode(
        adminAccessMode41);
    boolean boolean44 = securityContextEnterpriseImpl42.allowExecuteAdminProcedure((int) (byte) 1);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode45 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl46 = securityContextEnterpriseImpl42.withMode(
        adminAccessMode45);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode47 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl48 = securityContextEnterpriseImpl46.withMode(
        adminAccessMode47);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo49 = securityContextEnterpriseImpl46.connectionInfo();
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext50 = io.github.onograph.kernel.api.security.DefaultLoginContext.fulacsDefaultLoginContext(
        clientConnectionInfo49);
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext51 = defaultAuthManager0.login(
          strMap30, clientConnectionInfo49);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strMapList12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl19);
    org.junit.Assert.assertNull(str20);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl22);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AUTH_DISABLED with FULL" + "'", str23,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl31);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl35);
    org.junit.Assert.assertNull(str36);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl38);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "AUTH_DISABLED with FULL" + "'", str39,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject40);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl42);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl46);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl48);
    org.junit.Assert.assertNotNull(clientConnectionInfo49);
    org.junit.Assert.assertNotNull(defaultLoginContext50);
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0409");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    securityProviderAuthDisabledImpl0.stop();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
  }

  @Test
  public void test0410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0410");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor4 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeLabelIndexCursor4,
          nodeCursor5, propertyCursor6, labelSchemaDescriptor7, tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0411");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor3 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor3, nodeCursor4, propertyCursor5, labelSchemaDescriptor6,
          tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0412");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager6 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    authManager6.start();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(authManager6);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0413");
    }
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext0 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode1 = securityContext0.mode();
    java.lang.String str2 = securityContext0.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode3 = securityContext0.mode();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject4 = securityContext0.subject();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContext0;
    org.junit.Assert.assertNotNull(securityContext0);
    org.junit.Assert.assertTrue(
        "'" + accessMode1 + "' != '" + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL
            + "'",
        accessMode1.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNull(str2);
    org.junit.Assert.assertTrue(
        "'" + accessMode3 + "' != '" + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL
            + "'",
        accessMode3.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(authSubject4);
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0414");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor4, propertyCursor5,
          labelSchemaDescriptor6, tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0415");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) 2);
    long long8 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    long long9 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long12 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer15 = null;
    try {
      boolean boolean16 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((-1L), (-1L),
          strConsumer15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10000L + "'", long12 == 10000L);
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0416");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (byte) 0, namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) '#', namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId13);
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0417");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) (byte) 1, nodeKeyConstraintDescriptor5, (long) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0418");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) 6362, namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (short) -1, namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    basePageCacheLoadingWatcher0.wapclForNa(10000L, namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId13);
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0419");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.stop();
    java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl5.authorize(
        idLookup6, "neo4j", abstractSecurityLog8);
    java.lang.String str10 = securityContextEnterpriseImpl5.database();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl5.allowsAdminAction(adminActionOnResource11);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo13 = securityContextEnterpriseImpl5.connectionInfo();
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext14 = defaultAuthManager0.login(
          strMap4, clientConnectionInfo13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertNotNull(clientConnectionInfo13);
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0420");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) 0, namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId7 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId7);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId10 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (byte) -1, namedDatabaseId10);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (short) 0, namedDatabaseId13);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId16 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) (byte) 1, namedDatabaseId16);
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0421");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.stop();
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList4 = defaultAuthManager0.gepiggatgcfList();
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList5 = defaultAuthManager0.gepiggatgcfList();
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(strMapList4);
    org.junit.Assert.assertNotNull(strMapList5);
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0422");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup8 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl7.authorize(
        idLookup8, "neo4j", abstractSecurityLog10);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode12 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl13 = securityContextEnterpriseImpl7.withMode(
        accessMode12);
    java.lang.String str14 = securityContextEnterpriseImpl7.database();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject15 = securityContextEnterpriseImpl7.subject();
    authManager5.log("neo4j",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl7);
    org.neo4j.kernel.api.security.AuthManager authManager18 = org.neo4j.kernel.api.security.AuthManager.NO_AUTH;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl20 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup21 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog23 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl24 = securityContextEnterpriseImpl20.authorize(
        idLookup21, "neo4j", abstractSecurityLog23);
    java.lang.String str25 = securityContextEnterpriseImpl24.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode26 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl27 = securityContextEnterpriseImpl24.withMode(
        accessMode26);
    java.lang.String str28 = securityContextEnterpriseImpl24.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource29 = null;
    boolean boolean30 = securityContextEnterpriseImpl24.allowsAdminAction(adminActionOnResource29);
    java.lang.String str31 = securityContextEnterpriseImpl24.description();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl24;
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl24;
    authManager18.log("AUTH_DISABLED with FULL",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl24);
    authManager5.log("verbose",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl24);
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl24;
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(authSubject15);
    org.junit.Assert.assertNotNull(authManager18);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl20);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl24);
    org.junit.Assert.assertNull(str25);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl27);
    org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AUTH_DISABLED with FULL" + "'", str28,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AUTH_DISABLED with FULL" + "'", str31,
        "AUTH_DISABLED with FULL");
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0423");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.checkPointHappened((-1L));
    checkPointThresholdVolumetricPolicy1.initialize((long) (short) 0);
    java.util.function.Consumer<java.lang.String> strConsumer11 = null;
    try {
      boolean boolean12 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 6362,
          (long) 10, strConsumer11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
  }

  @Test
  public void test0424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0424");
    }
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode0 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl1 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup2 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog4 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = securityContextEnterpriseImpl1.authorize(
        idLookup2, "neo4j", abstractSecurityLog4);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl1.withMode(
        accessMode6);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup8 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl1.authorize(
        idLookup8, "", abstractSecurityLog10);
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject12 = securityContextEnterpriseImpl1.subject();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode13 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext14 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo15 = null;
    org.neo4j.internal.kernel.api.security.LoginContext loginContext16 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo15);
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext18 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode13, clientConnectionInfo15,
        "Node Key constraint requires Neo4j Enterprise Edition");
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl19 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl19.start();
    securityProviderAuthDisabledImpl19.stop();
    org.neo4j.kernel.api.security.AuthManager authManager22 = securityProviderAuthDisabledImpl19.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager23 = securityProviderAuthDisabledImpl19.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl25 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager23.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl25);
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl28 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup29 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog31 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl32 = securityContextEnterpriseImpl28.authorize(
        idLookup29, "neo4j", abstractSecurityLog31);
    authManager23.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl32);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode34 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext35 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo36 = null;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject37 = null;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo38 = null;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext39 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode40 = securityContext39.mode();
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext41 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    java.util.Set<java.lang.String> strSet42 = null;
    java.util.Set<java.lang.String> strSet44 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl46 = new io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl(
        adminAccessMode34, authSubject37, clientConnectionInfo38, accessMode40, strSet44,
        ".cacheprof");
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl47 = securityContextEnterpriseImpl32.withMode(
        accessMode40);
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl48 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup49 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog51 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl52 = securityContextEnterpriseImpl48.authorize(
        idLookup49, "neo4j", abstractSecurityLog51);
    java.lang.String str53 = securityContextEnterpriseImpl52.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode54 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl55 = securityContextEnterpriseImpl52.withMode(
        accessMode54);
    java.lang.String str56 = securityContextEnterpriseImpl52.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource57 = null;
    boolean boolean58 = securityContextEnterpriseImpl52.allowsAdminAction(adminActionOnResource57);
    java.lang.String str59 = securityContextEnterpriseImpl52.description();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode60 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl61 = securityContextEnterpriseImpl52.withMode(
        adminAccessMode60);
    java.util.Set<java.lang.String> strSet62 = securityContextEnterpriseImpl61.roles();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl64 = new io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl(
        adminAccessMode0, authSubject12, clientConnectionInfo15, accessMode40, strSet62, "verbose");
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource65 = null;
    try {
      boolean boolean66 = securityContextEnterpriseImpl64.allowsAdminAction(
          adminActionOnResource65);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl1);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertNotNull(authSubject12);
    org.junit.Assert.assertNotNull(loginContext16);
    org.junit.Assert.assertNotNull(securityContext18);
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl19);
    org.junit.Assert.assertNotNull(authManager22);
    org.junit.Assert.assertNotNull(authManager23);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl25);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl28);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl32);
    org.junit.Assert.assertNotNull(securityContext39);
    org.junit.Assert.assertTrue("'" + accessMode40 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode40.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl47);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl48);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl52);
    org.junit.Assert.assertNull(str53);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl55);
    org.junit.Assert.assertEquals("'" + str56 + "' != '" + "AUTH_DISABLED with FULL" + "'", str56,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    org.junit.Assert.assertEquals("'" + str59 + "' != '" + "AUTH_DISABLED with FULL" + "'", str59,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl61);
    org.junit.Assert.assertNotNull(strSet62);
  }

  @Test
  public void test0425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0425");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          10L, uniquenessConstraintDescriptor3, (long) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0426");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl0.authorize(
        idLookup7, "", abstractSecurityLog9);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup11 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog13 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl14 = securityContextEnterpriseImpl10.authorize(
        idLookup11, "AUTH_DISABLED with FULL", abstractSecurityLog13);
    java.lang.String str15 = securityContextEnterpriseImpl10.description();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode16 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl17 = securityContextEnterpriseImpl10.withMode(
        adminAccessMode16);
    java.lang.String str18 = securityContextEnterpriseImpl17.database();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource19 = null;
    try {
      boolean boolean20 = securityContextEnterpriseImpl17.allowsAdminAction(
          adminActionOnResource19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl14);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AUTH_DISABLED with FULL" + "'", str15,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl17);
    org.junit.Assert.assertNull(str18);
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0427");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          0L, constraintDescriptor7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0428");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    int int4 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor5 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor6 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor7 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor8 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup9 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor5, relationshipScanCursor6, propertyCursor7,
          relationTypeSchemaDescriptor8, tokenNameLookup9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0429");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    java.util.function.Consumer<java.lang.String> strConsumer8 = null;
    try {
      boolean boolean9 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 6362, 1L,
          strConsumer8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0430");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.getName();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl5.authorize(
        idLookup6, "neo4j", abstractSecurityLog8);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl5.withMode(
        accessMode10);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup12 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog14 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = securityContextEnterpriseImpl11.authorize(
        idLookup12, "Node Key constraint requires Neo4j Enterprise Edition", abstractSecurityLog14);
    boolean boolean17 = securityContextEnterpriseImpl15.allowExecuteAdminProcedure(
        (int) (short) 10);
    boolean boolean18 = cachePopulatorExtensionFactory0.equals((java.lang.Object) (short) 10);
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "pagecachewarmer" + "'", str4,
        "pagecachewarmer");
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0431");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (byte) 0, constraintDescriptor3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0432");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    authManager5.stop();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager5);
  }

  @Test
  public void test0433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0433");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject9 = securityContextEnterpriseImpl4.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl4.withMode(
        adminAccessMode10);
    boolean boolean13 = securityContextEnterpriseImpl11.allowExecuteAdminProcedure((int) (byte) 1);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode14 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = securityContextEnterpriseImpl11.withMode(
        adminAccessMode14);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo16 = securityContextEnterpriseImpl11.connectionInfo();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode17 = securityContextEnterpriseImpl11.mode();
    java.lang.Class<?> wildcardClass18 = securityContextEnterpriseImpl11.getClass();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertNotNull(clientConnectionInfo16);
    org.junit.Assert.assertTrue("'" + accessMode17 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode17.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0434");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) 2);
    long long8 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened(0L);
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    java.util.function.Consumer<java.lang.String> strConsumer15 = null;
    try {
      boolean boolean16 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded((long) 'a',
          (long) '4', strConsumer15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0435");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode7 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl8 = securityContextEnterpriseImpl6.withMode(
        adminAccessMode7);
    try {
      boolean boolean10 = securityContextEnterpriseImpl8.allowExecuteAdminProcedure(
          (int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl8);
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0436");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo9 = securityContextEnterpriseImpl4.connectionInfo();
    java.util.Set<java.lang.String> strSet10 = securityContextEnterpriseImpl4.roles();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(clientConnectionInfo9);
    org.junit.Assert.assertNotNull(strSet10);
  }

  @Test
  public void test0437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0437");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor3 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) 100, constraintDescriptor2);
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
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0439");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    org.neo4j.kernel.api.security.AuthManager authManager2 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager4.log("",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    authManager4.start();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager2);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
  }

  @Test
  public void test0440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0440");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    securityProviderAuthDisabledImpl0.shutdown();
    org.neo4j.kernel.api.security.AuthManager authManager7 = securityProviderAuthDisabledImpl0.authManager();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(authManager7);
  }

  @Test
  public void test0441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0441");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.storageengine.api.StorageReader storageReader6 = null;
    org.neo4j.internal.kernel.api.Read read7 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory8 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState9 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor10 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext11 = null;
    org.neo4j.memory.MemoryTracker memoryTracker12 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor13 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader6, read7, cursorFactory8, readableTransactionState9, txStateVisitor10,
          cursorContext11, memoryTracker12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0442");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) '4', constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0443");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor2 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          10L, nodeKeyConstraintDescriptor2, 0L);
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
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str6 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning7 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy8 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning7);
    checkPointThresholdVolumetricPolicy8.initialize((long) (short) 100);
    boolean boolean11 = cachePopulatorExtensionFactory0.equals(
        (java.lang.Object) checkPointThresholdVolumetricPolicy8);
    checkPointThresholdVolumetricPolicy8.initialize(0L);
    java.util.function.Consumer<java.lang.String> strConsumer16 = null;
    try {
      boolean boolean17 = checkPointThresholdVolumetricPolicy8.isCheckPointingNeeded(
          (long) (byte) -1, (long) ' ', strConsumer16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str6, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0445");
    }
    org.neo4j.kernel.api.security.AuthManager authManager0 = org.neo4j.kernel.api.security.AuthManager.NO_AUTH;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl2 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup3 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl2.authorize(
        idLookup3, "neo4j", abstractSecurityLog5);
    java.lang.String str7 = securityContextEnterpriseImpl6.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl6.withMode(
        accessMode8);
    java.lang.String str10 = securityContextEnterpriseImpl6.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource11 = null;
    boolean boolean12 = securityContextEnterpriseImpl6.allowsAdminAction(adminActionOnResource11);
    java.lang.String str13 = securityContextEnterpriseImpl6.description();
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl6;
    authManager0.log("AUTH_DISABLED with FULL",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    java.lang.String str17 = securityContextEnterpriseImpl6.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode18 = securityContextEnterpriseImpl6.mode();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl19 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup20 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog22 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl23 = securityContextEnterpriseImpl19.authorize(
        idLookup20, "neo4j", abstractSecurityLog22);
    java.lang.String str24 = securityContextEnterpriseImpl23.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode25 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl26 = securityContextEnterpriseImpl23.withMode(
        accessMode25);
    java.lang.String str27 = securityContextEnterpriseImpl23.description();
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo28 = securityContextEnterpriseImpl23.connectionInfo();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext30 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode18, clientConnectionInfo28, "volumetric");
    org.neo4j.internal.kernel.api.security.LoginContext loginContext31 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo28);
    org.junit.Assert.assertNotNull(authManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl2);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNull(str7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AUTH_DISABLED with FULL" + "'", str10,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AUTH_DISABLED with FULL" + "'", str13,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNull(str17);
    org.junit.Assert.assertTrue("'" + accessMode18 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode18.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl19);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl23);
    org.junit.Assert.assertNull(str24);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl26);
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AUTH_DISABLED with FULL" + "'", str27,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(clientConnectionInfo28);
    org.junit.Assert.assertNotNull(securityContext30);
    org.junit.Assert.assertNotNull(loginContext31);
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0446");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    securityProviderAuthDisabledImpl0.shutdown();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.inClusterAuthManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup8 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl7.authorize(
        idLookup8, "neo4j", abstractSecurityLog10);
    java.lang.String str12 = securityContextEnterpriseImpl11.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode13 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl14 = securityContextEnterpriseImpl11.withMode(
        accessMode13);
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler15 = null;
    securityContextEnterpriseImpl11.assertCredentialsNotExpired(securityAuthorizationHandler15);
    authManager5.log("pagecachewarmer",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl11);
    boolean boolean19 = securityContextEnterpriseImpl11.allowExecuteAdminProcedure(
        (int) (short) -1);
    boolean boolean21 = securityContextEnterpriseImpl11.allowExecuteAdminProcedure(
        (int) (short) 10);
    java.lang.String str22 = securityContextEnterpriseImpl11.database();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup23 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog25 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl26 = securityContextEnterpriseImpl11.authorize(
        idLookup23, "volumetric", abstractSecurityLog25);
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl14);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    org.junit.Assert.assertNull(str22);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl26);
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0447");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor4 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor5 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor6 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup7 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor4, propertyCursor5, relationTypeSchemaDescriptor6,
          tokenNameLookup7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0448");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject9 = securityContextEnterpriseImpl4.subject();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode10 = securityContextEnterpriseImpl4.mode();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject11 = securityContextEnterpriseImpl4.subject();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup12 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog14 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = securityContextEnterpriseImpl4.authorize(
        idLookup12, "neo4j", abstractSecurityLog14);
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl4;
    java.lang.String str17 = securityContextEnterpriseImpl4.description();
    java.lang.String str18 = securityContextEnterpriseImpl4.database();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject9);
    org.junit.Assert.assertTrue("'" + accessMode10 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode10.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(authSubject11);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AUTH_DISABLED with FULL" + "'", str17,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNull(str18);
  }

  @Test
  public void test0449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0449");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject9 = securityContextEnterpriseImpl4.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl4.withMode(
        adminAccessMode10);
    boolean boolean13 = securityContextEnterpriseImpl11.allowExecuteAdminProcedure((int) (byte) 1);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode14 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = securityContextEnterpriseImpl11.withMode(
        adminAccessMode14);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode16 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl17 = securityContextEnterpriseImpl15.withMode(
        adminAccessMode16);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo18 = securityContextEnterpriseImpl15.connectionInfo();
    org.neo4j.internal.kernel.api.security.LoginContext loginContext19 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo18);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject9);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl17);
    org.junit.Assert.assertNotNull(clientConnectionInfo18);
    org.junit.Assert.assertNotNull(loginContext19);
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0450");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject1 = securityContextEnterpriseImpl0.subject();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup2 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog4 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = securityContextEnterpriseImpl0.authorize(
        idLookup2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]",
        abstractSecurityLog4);
    java.lang.String str6 = securityContextEnterpriseImpl0.description();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(authSubject1);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AUTH_DISABLED with FULL" + "'", str6,
        "AUTH_DISABLED with FULL");
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0451");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode7 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl8 = securityContextEnterpriseImpl6.withMode(
        adminAccessMode7);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode9 = securityContextEnterpriseImpl8.mode();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl8);
    org.junit.Assert.assertNull(accessMode9);
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0452");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int4 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = constraintSemanticsEnterpriseImpl0.readConstraint(
          constraintDescriptor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0453");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) 2);
    long long8 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened(0L);
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    java.util.function.Consumer<java.lang.String> strConsumer15 = null;
    try {
      boolean boolean16 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(0L,
          (long) (byte) 10, strConsumer15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0454");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor relationshipTypeIndexCursor5 = null;
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor6 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor7 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor8 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup9 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipTypeIndexCursor5, relationshipScanCursor6, propertyCursor7,
          relationTypeSchemaDescriptor8, tokenNameLookup9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0455");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str6 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning7 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy8 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning7);
    checkPointThresholdVolumetricPolicy8.initialize((long) (short) 100);
    boolean boolean11 = cachePopulatorExtensionFactory0.equals(
        (java.lang.Object) checkPointThresholdVolumetricPolicy8);
    checkPointThresholdVolumetricPolicy8.initialize(0L);
    java.util.function.Consumer<java.lang.String> strConsumer16 = null;
    try {
      boolean boolean17 = checkPointThresholdVolumetricPolicy8.isCheckPointingNeeded(100L,
          (long) '4', strConsumer16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str6, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0456");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.UniquenessConstraintDescriptor uniquenessConstraintDescriptor5 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createUniquenessConstraintRule(
          (long) 6362, uniquenessConstraintDescriptor5, (long) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
  }

  @Test
  public void test0457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0457");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) 6362, namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (short) -1, namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    basePageCacheLoadingWatcher0.wapclForNa(10000L, namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) ' ', namedDatabaseId14);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId17 = null;
    basePageCacheLoadingWatcher0.wapclForNa(100L, namedDatabaseId17);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId20 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) (byte) 0, namedDatabaseId20);
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0458");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup8 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog10 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = securityContextEnterpriseImpl7.authorize(
        idLookup8, "neo4j", abstractSecurityLog10);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode12 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl13 = securityContextEnterpriseImpl7.withMode(
        accessMode12);
    java.lang.String str14 = securityContextEnterpriseImpl7.database();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject15 = securityContextEnterpriseImpl7.subject();
    authManager5.log("neo4j",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl7);
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject17 = securityContextEnterpriseImpl7.subject();
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo18 = securityContextEnterpriseImpl7.connectionInfo();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode19 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext20 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo21 = null;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject22 = null;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo23 = null;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext24 = org.neo4j.internal.kernel.api.security.SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode25 = securityContext24.mode();
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext26 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    java.util.Set<java.lang.String> strSet27 = null;
    java.util.Set<java.lang.String> strSet29 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl31 = new io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl(
        adminAccessMode19, authSubject22, clientConnectionInfo23, accessMode25, strSet29,
        ".cacheprof");
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl32 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup33 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog35 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl36 = securityContextEnterpriseImpl32.authorize(
        idLookup33, "neo4j", abstractSecurityLog35);
    java.lang.String str37 = securityContextEnterpriseImpl36.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode38 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl39 = securityContextEnterpriseImpl36.withMode(
        accessMode38);
    java.lang.String str40 = securityContextEnterpriseImpl36.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject41 = securityContextEnterpriseImpl36.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode42 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl43 = securityContextEnterpriseImpl36.withMode(
        adminAccessMode42);
    boolean boolean45 = securityContextEnterpriseImpl43.allowExecuteAdminProcedure((int) (byte) 1);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode46 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl47 = securityContextEnterpriseImpl43.withMode(
        adminAccessMode46);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo48 = securityContextEnterpriseImpl43.connectionInfo();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext50 = org.neo4j.internal.kernel.api.security.SecurityContext.authDisabled(
        accessMode25, clientConnectionInfo48, "localhost");
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl52 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.auhdslSecurityContextEnterpriseImpl(
        clientConnectionInfo18, accessMode25, "pagecachewarmer");
    boolean boolean54 = securityContextEnterpriseImpl52.allowExecuteAdminProcedure((int) (byte) -1);
    java.util.Set<java.lang.String> strSet55 = securityContextEnterpriseImpl52.roles();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl13);
    org.junit.Assert.assertNull(str14);
    org.junit.Assert.assertNotNull(authSubject15);
    org.junit.Assert.assertNotNull(authSubject17);
    org.junit.Assert.assertNotNull(clientConnectionInfo18);
    org.junit.Assert.assertNotNull(securityContext24);
    org.junit.Assert.assertTrue("'" + accessMode25 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode25.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl32);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl36);
    org.junit.Assert.assertNull(str37);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl39);
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AUTH_DISABLED with FULL" + "'", str40,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject41);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl43);
    org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl47);
    org.junit.Assert.assertNotNull(clientConnectionInfo48);
    org.junit.Assert.assertNotNull(securityContext50);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl52);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    org.junit.Assert.assertNotNull(strSet55);
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0459");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor8 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          0L, nodeKeyConstraintDescriptor6, (long) ' ');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0460");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    long long5 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) 2);
    long long8 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    long long9 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    long long10 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize(100L);
    checkPointThresholdVolumetricPolicy1.initialize(10000L);
    java.util.function.Consumer<java.lang.String> strConsumer17 = null;
    try {
      boolean boolean18 = checkPointThresholdVolumetricPolicy1.isCheckPointingNeeded(
          (long) (byte) 1, (long) 10, strConsumer17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10000L + "'", long5 == 10000L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10000L + "'", long8 == 10000L);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10000L + "'", long9 == 10000L);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0461");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (byte) 100, namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((-1L), namedDatabaseId14);
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0462");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) 6362, namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    basePageCacheLoadingWatcher0.wapclForNa((long) (-1), namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId14 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) (byte) 100, namedDatabaseId14);
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0463");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.loopbackAuthManager();
    authManager5.stop();
    authManager5.stop();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0464");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.stop();
    java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext5 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo7 = null;
    org.neo4j.internal.kernel.api.security.LoginContext loginContext8 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo7);
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext9 = defaultAuthManager0.login(
          strMap4, clientConnectionInfo7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(loginContext8);
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0465");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId2 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) '4', namedDatabaseId2);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa((long) 6362, namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa(0L, namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    basePageCacheLoadingWatcher0.prlcpdForNa(10000L, namedDatabaseId11);
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0466");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager4.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    java.util.Set<java.lang.String> strSet8 = securityContextEnterpriseImpl6.roles();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(strSet8);
  }

  @Test
  public void test0467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0467");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor3, propertyCursor4, relationTypeSchemaDescriptor5,
          tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0468");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.shutdown();
    defaultAuthManager0.clneac();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl5 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl5.authorize(
        idLookup6, "neo4j", abstractSecurityLog8);
    java.lang.String str10 = securityContextEnterpriseImpl9.database();
    defaultAuthManager0.log("continuous",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl9);
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> strMapList12 = defaultAuthManager0.gepiggatgcfList();
    defaultAuthManager0.clneac();
    java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode15 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl16 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup17 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog19 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl20 = securityContextEnterpriseImpl16.authorize(
        idLookup17, "neo4j", abstractSecurityLog19);
    java.lang.String str21 = securityContextEnterpriseImpl20.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode22 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl23 = securityContextEnterpriseImpl20.withMode(
        accessMode22);
    java.lang.String str24 = securityContextEnterpriseImpl20.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject25 = securityContextEnterpriseImpl20.subject();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl26 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup27 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog29 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl30 = securityContextEnterpriseImpl26.authorize(
        idLookup27, "neo4j", abstractSecurityLog29);
    java.lang.String str31 = securityContextEnterpriseImpl30.database();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode32 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl33 = securityContextEnterpriseImpl30.withMode(
        adminAccessMode32);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo34 = securityContextEnterpriseImpl33.connectionInfo();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl35 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup36 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog38 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl39 = securityContextEnterpriseImpl35.authorize(
        idLookup36, "neo4j", abstractSecurityLog38);
    java.lang.String str40 = securityContextEnterpriseImpl39.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode41 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl42 = securityContextEnterpriseImpl39.withMode(
        accessMode41);
    java.lang.String str43 = securityContextEnterpriseImpl39.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject44 = securityContextEnterpriseImpl39.subject();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode45 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl46 = securityContextEnterpriseImpl39.withMode(
        adminAccessMode45);
    boolean boolean48 = securityContextEnterpriseImpl46.allowExecuteAdminProcedure((int) (byte) 1);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode49 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl50 = securityContextEnterpriseImpl46.withMode(
        adminAccessMode49);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode51 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl52 = securityContextEnterpriseImpl50.withMode(
        adminAccessMode51);
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo53 = securityContextEnterpriseImpl50.connectionInfo();
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl54 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl54.start();
    org.neo4j.kernel.api.security.AuthManager authManager56 = securityProviderAuthDisabledImpl54.loopbackAuthManager();
    securityProviderAuthDisabledImpl54.stop();
    org.neo4j.kernel.api.security.AuthManager authManager58 = securityProviderAuthDisabledImpl54.loopbackAuthManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl60 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager58.log("",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl60);
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl63 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup64 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog66 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl67 = securityContextEnterpriseImpl63.authorize(
        idLookup64, "neo4j", abstractSecurityLog66);
    java.lang.String str68 = securityContextEnterpriseImpl67.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode69 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl70 = securityContextEnterpriseImpl67.withMode(
        accessMode69);
    java.lang.String str71 = securityContextEnterpriseImpl67.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource72 = null;
    boolean boolean73 = securityContextEnterpriseImpl67.allowsAdminAction(adminActionOnResource72);
    authManager58.log("Extension:CachePopulatorExtensionFactory[pagecachewarmer]",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl67);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode75 = securityContextEnterpriseImpl67.mode();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl77 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.auhdslSecurityContextEnterpriseImpl(
        clientConnectionInfo53, accessMode75, "neo4j");
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode78 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext79 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject80 = null;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo81 = null;
    org.neo4j.internal.kernel.api.security.AccessMode accessMode82 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext83 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo84 = null;
    java.util.Set<java.lang.String> strSet85 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl87 = new io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl(
        adminAccessMode78, authSubject80, clientConnectionInfo81, accessMode82, strSet85,
        "volumetric");
    java.util.Set<java.lang.String> strSet88 = securityContextEnterpriseImpl87.roles();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl90 = new io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl(
        adminAccessMode15, authSubject25, clientConnectionInfo34, accessMode75, strSet88,
        "pagecachewarmer");
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext91 = defaultAuthManager0.login(
          strMap14, clientConnectionInfo34);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertNull(str10);
    org.junit.Assert.assertNotNull(strMapList12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl16);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl20);
    org.junit.Assert.assertNull(str21);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl23);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AUTH_DISABLED with FULL" + "'", str24,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject25);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl26);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl30);
    org.junit.Assert.assertNull(str31);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl33);
    org.junit.Assert.assertNotNull(clientConnectionInfo34);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl35);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl39);
    org.junit.Assert.assertNull(str40);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl42);
    org.junit.Assert.assertEquals("'" + str43 + "' != '" + "AUTH_DISABLED with FULL" + "'", str43,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject44);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl46);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl50);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl52);
    org.junit.Assert.assertNotNull(clientConnectionInfo53);
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl54);
    org.junit.Assert.assertNotNull(authManager56);
    org.junit.Assert.assertNotNull(authManager58);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl60);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl63);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl67);
    org.junit.Assert.assertNull(str68);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl70);
    org.junit.Assert.assertEquals("'" + str71 + "' != '" + "AUTH_DISABLED with FULL" + "'", str71,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    org.junit.Assert.assertTrue("'" + accessMode75 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode75.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl77);
  }

  @Test
  public void test0469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0469");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    java.lang.String str1 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str2 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str3 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext4 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker5 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle6 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext4, componentsChecker5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pagecachewarmer" + "'", str1,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str2 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str2, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str3, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0470");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    int int4 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor5 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor6 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor7 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup8 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor5, propertyCursor6,
          labelSchemaDescriptor7, tokenNameLookup8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0471");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager5 = securityProviderAuthDisabledImpl0.authManager();
    authManager5.init();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(authManager5);
  }

  @Test
  public void test0472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0472");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.storageengine.api.StorageReader storageReader3 = null;
    org.neo4j.internal.kernel.api.Read read4 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory5 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState6 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    org.neo4j.memory.MemoryTracker memoryTracker9 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor10 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader3, read4, cursorFactory5, readableTransactionState6, txStateVisitor7,
          cursorContext8, memoryTracker9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0473");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) 0, constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0474");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.storageengine.api.StorageReader storageReader4 = null;
    org.neo4j.internal.kernel.api.Read read5 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory6 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState7 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    org.neo4j.memory.MemoryTracker memoryTracker10 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor11 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader4, read5, cursorFactory6, readableTransactionState7, txStateVisitor8,
          cursorContext9, memoryTracker10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0475");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    java.lang.String str2 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor4 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (short) 10, constraintDescriptor4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enterpriseConstraints" + "'", str2,
        "enterpriseConstraints");
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0476");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId5 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId5);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId8 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) (-1), namedDatabaseId8);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId11 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa(10L, namedDatabaseId11);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId13 = null;
    pageCacheLoadingWatcherDefaultImpl1.wamsrdForNa(namedDatabaseId13);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId16 = null;
    pageCacheLoadingWatcherDefaultImpl1.wapclForNa((long) '4', namedDatabaseId16);
  }

  @Test
  public void test0477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0477");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    int int4 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str5 = constraintSemanticsEnterpriseImpl0.getName();
    org.neo4j.storageengine.api.StorageReader storageReader6 = null;
    org.neo4j.internal.kernel.api.Read read7 = null;
    org.neo4j.internal.kernel.api.CursorFactory cursorFactory8 = null;
    org.neo4j.storageengine.api.txstate.ReadableTransactionState readableTransactionState9 = null;
    org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor10 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext11 = null;
    org.neo4j.memory.MemoryTracker memoryTracker12 = null;
    try {
      org.neo4j.storageengine.api.txstate.TxStateVisitor txStateVisitor13 = constraintSemanticsEnterpriseImpl0.decorateTxStateVisitor(
          storageReader6, read7, cursorFactory8, readableTransactionState9, txStateVisitor10,
          cursorContext11, memoryTracker12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "enterpriseConstraints" + "'", str5,
        "enterpriseConstraints");
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0478");
    }
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext0 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo2 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext3 = io.github.onograph.kernel.api.security.DefaultLoginContext.fulacsDefaultLoginContext(
        clientConnectionInfo2);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup4 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = defaultLoginContext3.authorize(
        idLookup4, ".cacheprof", abstractSecurityLog6);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl7.withMode(
        adminAccessMode8);
    org.junit.Assert.assertNotNull(defaultLoginContext3);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0479");
    }
    org.neo4j.logging.Log log0 = null;
    io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl1 = new io.github.onograph.kernel.srv.pagecache.PageCacheLoadingWatcherDefaultImpl(
        log0);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (short) 1, namedDatabaseId3);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId6 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa((long) (-1), namedDatabaseId6);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId9 = null;
    pageCacheLoadingWatcherDefaultImpl1.prlcpdForNa(1L, namedDatabaseId9);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId12 = null;
    try {
      pageCacheLoadingWatcherDefaultImpl1.wapclForNa((-1L), namedDatabaseId12);
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
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.getName();
    org.neo4j.kernel.extension.context.ExtensionContext extensionContext5 = null;
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory.ComponentsChecker componentsChecker6 = null;
    try {
      org.neo4j.kernel.lifecycle.Lifecycle lifecycle7 = cachePopulatorExtensionFactory0.newInstance(
          extensionContext5, componentsChecker6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "pagecachewarmer" + "'", str4,
        "pagecachewarmer");
  }

  @Test
  public void test0481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0481");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    org.neo4j.io.pagecache.IOController iOController3 = org.neo4j.io.pagecache.IOController.DISABLED;
    boolean boolean4 = cachePopulatorExtensionFactory0.equals((java.lang.Object) iOController3);
    java.lang.String str5 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str6 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str7 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str8 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str9 = cachePopulatorExtensionFactory0.toString();
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNotNull(iOController3);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pagecachewarmer" + "'", str5,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "pagecachewarmer" + "'", str6,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "pagecachewarmer" + "'", str7,
        "pagecachewarmer");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "pagecachewarmer" + "'", str8,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str9, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0482");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int3 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str4 = constraintSemanticsEnterpriseImpl0.getName();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeLabelIndexCursor nodeLabelIndexCursor6 = null;
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor7 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor8 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor9 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup10 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodePropertyExistenceConstraint(
          nodeLabelIndexCursor6, nodeCursor7, propertyCursor8, labelSchemaDescriptor9,
          tokenNameLookup10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "enterpriseConstraints" + "'", str4,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0483");
    }
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyContinuousImpl checkPointThresholdPolicyContinuousImpl0 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyContinuousImpl();
    java.lang.String str1 = checkPointThresholdPolicyContinuousImpl0.getName();
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold6 = checkPointThresholdPolicyContinuousImpl0.createThreshold(
        config2, systemNanoClock3, logPruning4, logProvider5);
    java.lang.String str7 = checkPointThresholdPolicyContinuousImpl0.getName();
    java.lang.String str8 = checkPointThresholdPolicyContinuousImpl0.getName();
    org.neo4j.configuration.Config config9 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock10 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning11 = null;
    org.neo4j.logging.LogProvider logProvider12 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold13 = checkPointThresholdPolicyContinuousImpl0.createThreshold(
        config9, systemNanoClock10, logPruning11, logProvider12);
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "continuous" + "'", str1, "continuous");
    org.junit.Assert.assertNotNull(checkPointThreshold6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "continuous" + "'", str7, "continuous");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "continuous" + "'", str8, "continuous");
    org.junit.Assert.assertNotNull(checkPointThreshold13);
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0484");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup7 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog9 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = securityContextEnterpriseImpl6.authorize(
        idLookup7, "Node Key constraint requires Neo4j Enterprise Edition", abstractSecurityLog9);
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl11 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject12 = securityContextEnterpriseImpl11.subject();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup13 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog15 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl16 = securityContextEnterpriseImpl11.authorize(
        idLookup13, "localhost", abstractSecurityLog15);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource17 = null;
    boolean boolean18 = securityContextEnterpriseImpl11.allowsAdminAction(adminActionOnResource17);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode19 = securityContextEnterpriseImpl11.mode();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl20 = securityContextEnterpriseImpl10.withMode(
        accessMode19);
    try {
      java.lang.String str21 = securityContextEnterpriseImpl10.description();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl11);
    org.junit.Assert.assertNotNull(authSubject12);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + accessMode19 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode19.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl20);
  }

  @Test
  public void test0485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0485");
    }
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager0 = io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
    defaultAuthManager0.stop();
    defaultAuthManager0.init();
    defaultAuthManager0.claauch();
    java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
    io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext5 = io.github.onograph.kernel.api.security.DefaultLoginContext.AUHSL_DEFAULT_LOGIN_CONTEXT;
    org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo clientConnectionInfo6 = null;
    org.neo4j.internal.kernel.api.security.LoginContext loginContext7 = org.neo4j.internal.kernel.api.security.LoginContext.fullAccess(
        clientConnectionInfo6);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl10 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.auhdslSecurityContextEnterpriseImpl(
        clientConnectionInfo6, accessMode8, "hi!");
    try {
      io.github.onograph.kernel.api.security.DefaultLoginContext defaultLoginContext11 = defaultAuthManager0.login(
          strMap4, clientConnectionInfo6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(defaultAuthManager0);
    org.junit.Assert.assertNotNull(loginContext7);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl10);
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0486");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    int int4 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int5 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.RelationshipScanCursor relationshipScanCursor6 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor7 = null;
    org.neo4j.internal.schema.RelationTypeSchemaDescriptor relationTypeSchemaDescriptor8 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup9 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateRelationshipPropertyExistenceConstraint(
          relationshipScanCursor6, propertyCursor7, relationTypeSchemaDescriptor8,
          tokenNameLookup9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0487");
    }
    io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl securityProviderAuthDisabledImpl0 = io.github.onograph.kernel.api.security.SecurityProviderAuthDisabledImpl.IT;
    securityProviderAuthDisabledImpl0.start();
    securityProviderAuthDisabledImpl0.stop();
    org.neo4j.kernel.api.security.AuthManager authManager3 = securityProviderAuthDisabledImpl0.authManager();
    org.neo4j.kernel.api.security.AuthManager authManager4 = securityProviderAuthDisabledImpl0.authManager();
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    authManager4.log("volumetric",
        (org.neo4j.internal.kernel.api.security.SecurityContext) securityContextEnterpriseImpl6);
    authManager4.init();
    authManager4.shutdown();
    org.junit.Assert.assertNotNull(securityProviderAuthDisabledImpl0);
    org.junit.Assert.assertNotNull(authManager3);
    org.junit.Assert.assertNotNull(authManager4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0488");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    java.lang.String str3 = constraintSemanticsEnterpriseImpl0.getName();
    int int4 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor6 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor7 = constraintSemanticsEnterpriseImpl0.createExistenceConstraint(
          (long) (short) 100, constraintDescriptor6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enterpriseConstraints" + "'", str3,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0489");
    }
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning0 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy1 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning0);
    long long2 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.checkPointHappened((long) (byte) -1);
    checkPointThresholdVolumetricPolicy1.initialize((long) '4');
    long long7 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    checkPointThresholdVolumetricPolicy1.initialize((long) ' ');
    long long10 = checkPointThresholdVolumetricPolicy1.checkFrequencyMillis();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10000L + "'", long7 == 10000L);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10000L + "'", long10 == 10000L);
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0490");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl6 = securityContextEnterpriseImpl0.withMode(
        accessMode5);
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode7 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl8 = securityContextEnterpriseImpl6.withMode(
        adminAccessMode7);
    org.neo4j.internal.kernel.api.security.LoginContext.AUTH_DISABLED = securityContextEnterpriseImpl8;
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl6);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl8);
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0491");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource9 = null;
    boolean boolean10 = securityContextEnterpriseImpl4.allowsAdminAction(adminActionOnResource9);
    java.lang.String str11 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode12 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl13 = securityContextEnterpriseImpl4.withMode(
        adminAccessMode12);
    java.util.Set<java.lang.String> strSet14 = securityContextEnterpriseImpl13.roles();
    org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler securityAuthorizationHandler15 = null;
    securityContextEnterpriseImpl13.assertCredentialsNotExpired(securityAuthorizationHandler15);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AUTH_DISABLED with FULL" + "'", str11,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl13);
    org.junit.Assert.assertNotNull(strSet14);
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0492");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AdminAccessMode adminAccessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        adminAccessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0493");
    }
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyVolumetricImpl checkPointThresholdPolicyVolumetricImpl0 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyVolumetricImpl();
    java.lang.String str1 = checkPointThresholdPolicyVolumetricImpl0.getName();
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold6 = checkPointThresholdPolicyVolumetricImpl0.createThreshold(
        config2, systemNanoClock3, logPruning4, logProvider5);
    java.lang.String str7 = checkPointThresholdPolicyVolumetricImpl0.getName();
    org.neo4j.configuration.Config config8 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock9 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning10 = null;
    org.neo4j.logging.LogProvider logProvider11 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold12 = checkPointThresholdPolicyVolumetricImpl0.createThreshold(
        config8, systemNanoClock9, logPruning10, logProvider11);
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock14 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning15 = null;
    org.neo4j.logging.LogProvider logProvider16 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold17 = checkPointThresholdPolicyVolumetricImpl0.createThreshold(
        config13, systemNanoClock14, logPruning15, logProvider16);
    java.lang.String str18 = checkPointThresholdPolicyVolumetricImpl0.getName();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "volumetric" + "'", str1, "volumetric");
    org.junit.Assert.assertNotNull(checkPointThreshold6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "volumetric" + "'", str7, "volumetric");
    org.junit.Assert.assertNotNull(checkPointThreshold12);
    org.junit.Assert.assertNotNull(checkPointThreshold17);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "volumetric" + "'", str18, "volumetric");
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0494");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    int int1 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.schema.constraints.NodeKeyConstraintDescriptor nodeKeyConstraintDescriptor3 = null;
    try {
      org.neo4j.internal.schema.ConstraintDescriptor constraintDescriptor5 = constraintSemanticsEnterpriseImpl0.createNodeKeyConstraintRule(
          (long) 1, nodeKeyConstraintDescriptor3, (long) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0495");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    java.lang.String str5 = securityContextEnterpriseImpl4.database();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode6 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl7 = securityContextEnterpriseImpl4.withMode(
        accessMode6);
    java.lang.String str8 = securityContextEnterpriseImpl4.description();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject9 = securityContextEnterpriseImpl4.subject();
    org.neo4j.internal.kernel.api.security.AccessMode accessMode10 = securityContextEnterpriseImpl4.mode();
    org.neo4j.internal.kernel.api.security.AuthSubject authSubject11 = securityContextEnterpriseImpl4.subject();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup12 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog14 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl15 = securityContextEnterpriseImpl4.authorize(
        idLookup12, "neo4j", abstractSecurityLog14);
    boolean boolean17 = securityContextEnterpriseImpl4.allowExecuteAdminProcedure((int) (byte) 0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertNull(str5);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUTH_DISABLED with FULL" + "'", str8,
        "AUTH_DISABLED with FULL");
    org.junit.Assert.assertNotNull(authSubject9);
    org.junit.Assert.assertTrue("'" + accessMode10 + "' != '"
            + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL + "'",
        accessMode10.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(authSubject11);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0496");
    }
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyVolumetricImpl checkPointThresholdPolicyVolumetricImpl0 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdPolicyVolumetricImpl();
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock2 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning3 = null;
    org.neo4j.logging.LogProvider logProvider4 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold5 = checkPointThresholdPolicyVolumetricImpl0.createThreshold(
        config1, systemNanoClock2, logPruning3, logProvider4);
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning8 = null;
    org.neo4j.logging.LogProvider logProvider9 = null;
    org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointThreshold checkPointThreshold10 = checkPointThresholdPolicyVolumetricImpl0.createThreshold(
        config6, systemNanoClock7, logPruning8, logProvider9);
    java.lang.String str11 = checkPointThresholdPolicyVolumetricImpl0.getName();
    org.junit.Assert.assertNotNull(checkPointThreshold5);
    org.junit.Assert.assertNotNull(checkPointThreshold10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "volumetric" + "'", str11, "volumetric");
  }

  @Test
  public void test0497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0497");
    }
    io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher basePageCacheLoadingWatcher0 = new io.github.onograph.kernel.srv.pagecache.BasePageCacheLoadingWatcher();
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId1 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId1);
    org.neo4j.kernel.database.NamedDatabaseId namedDatabaseId3 = null;
    basePageCacheLoadingWatcher0.wamsrdForNa(namedDatabaseId3);
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0498");
    }
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl0 = io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl.AUHSL_SECURITY_CONTEXT_ENTERPRISE_IMPL;
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup1 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog3 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl4 = securityContextEnterpriseImpl0.authorize(
        idLookup1, "neo4j", abstractSecurityLog3);
    org.neo4j.internal.kernel.api.security.AccessMode accessMode5 = securityContextEnterpriseImpl0.mode();
    org.neo4j.internal.kernel.api.security.LoginContext.IdLookup idLookup6 = null;
    org.neo4j.internal.kernel.api.security.AbstractSecurityLog abstractSecurityLog8 = null;
    io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl securityContextEnterpriseImpl9 = securityContextEnterpriseImpl0.authorize(
        idLookup6, "Property existence constraint requires Neo4j Enterprise Edition",
        abstractSecurityLog8);
    org.neo4j.internal.kernel.api.security.AdminActionOnResource adminActionOnResource10 = null;
    boolean boolean11 = securityContextEnterpriseImpl0.allowsAdminAction(adminActionOnResource10);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl0);
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl4);
    org.junit.Assert.assertTrue(
        "'" + accessMode5 + "' != '" + org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL
            + "'",
        accessMode5.equals(org.neo4j.internal.kernel.api.security.AccessMode.Static.FULL));
    org.junit.Assert.assertNotNull(securityContextEnterpriseImpl9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0499");
    }
    io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl constraintSemanticsEnterpriseImpl0 = new io.github.onograph.kernel.srv.ConstraintSemanticsEnterpriseImpl();
    java.lang.String str1 = constraintSemanticsEnterpriseImpl0.getName();
    int int2 = constraintSemanticsEnterpriseImpl0.getPriority();
    org.neo4j.internal.kernel.api.NodeCursor nodeCursor3 = null;
    org.neo4j.internal.kernel.api.PropertyCursor propertyCursor4 = null;
    org.neo4j.internal.schema.LabelSchemaDescriptor labelSchemaDescriptor5 = null;
    org.neo4j.common.TokenNameLookup tokenNameLookup6 = null;
    try {
      constraintSemanticsEnterpriseImpl0.validateNodeKeyConstraint(nodeCursor3, propertyCursor4,
          labelSchemaDescriptor5, tokenNameLookup6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "enterpriseConstraints" + "'", str1,
        "enterpriseConstraints");
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0500");
    }
    io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory cachePopulatorExtensionFactory0 = new io.github.onograph.kernel.srv.pagecache.CachePopulatorExtensionFactory();
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting1 = io.github.onograph.config.MainSettings.settingShodaBoolean;
    boolean boolean2 = cachePopulatorExtensionFactory0.equals((java.lang.Object) booleanSetting1);
    java.lang.String str3 = cachePopulatorExtensionFactory0.getName();
    java.lang.String str4 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str5 = cachePopulatorExtensionFactory0.toString();
    java.lang.String str6 = cachePopulatorExtensionFactory0.toString();
    org.neo4j.kernel.impl.transaction.log.pruning.LogPruning logPruning7 = null;
    io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy checkPointThresholdVolumetricPolicy8 = new io.github.onograph.kernel.srv.transaction.log.checkpoint.CheckPointThresholdVolumetricPolicy(
        logPruning7);
    checkPointThresholdVolumetricPolicy8.initialize((long) (short) 100);
    boolean boolean11 = cachePopulatorExtensionFactory0.equals(
        (java.lang.Object) checkPointThresholdVolumetricPolicy8);
    checkPointThresholdVolumetricPolicy8.initialize(0L);
    long long14 = checkPointThresholdVolumetricPolicy8.checkFrequencyMillis();
    long long15 = checkPointThresholdVolumetricPolicy8.checkFrequencyMillis();
    org.junit.Assert.assertNotNull(booleanSetting1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pagecachewarmer" + "'", str3,
        "pagecachewarmer");
    org.junit.Assert.assertEquals(
        "'" + str4 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str4, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str5 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str5, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "Extension:CachePopulatorExtensionFactory[pagecachewarmer]" + "'",
        str6, "Extension:CachePopulatorExtensionFactory[pagecachewarmer]");
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10000L + "'", long14 == 10000L);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10000L + "'", long15 == 10000L);
  }
}
