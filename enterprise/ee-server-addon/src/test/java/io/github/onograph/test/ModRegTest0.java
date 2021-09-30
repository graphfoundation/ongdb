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
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.STRING_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "strings" + "'", str0, "strings");
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0002");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.INTEGER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "integer" + "'", str0, "integer");
  }

  @Test
  public void test0003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0003");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.RELATIONSHIP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "relationship" + "'", str0,
        "relationship");
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0004");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.util.regex.Pattern pattern1 = io.github.onograph.server.rest.cluster.GdbClusterApi.daacuuptPattern(
          config0);
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
    java.util.regex.Pattern pattern0 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    org.junit.Assert.assertNotNull(pattern0);
    org.junit.Assert.assertEquals(pattern0.toString(), "/dbms/cluster.*");
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0006");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.server.ConfigurableServerSettings.browser_allow_outgoing_browser_connections;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0007");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = null;
    org.neo4j.kernel.impl.factory.DbmsInfo dbmsInfo2 = null;
    org.neo4j.collection.Dependencies dependencies3 = null;
    org.neo4j.memory.MemoryPools memoryPools4 = null;
    org.neo4j.logging.LogProvider logProvider5 = null;
    try {
      io.github.onograph.server.NeoWebServerEnterpriseImpl neoWebServerEnterpriseImpl6 = new io.github.onograph.server.NeoWebServerEnterpriseImpl(
          config0, databaseManagementService1, dbmsInfo2, dependencies3, memoryPools4,
          logProvider5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0008");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.util.regex.Pattern pattern1 = io.github.onograph.server.rest.cluster.BackwardsCompatibilityRedirectService.daalgclrupanPattern(
          config0);
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
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.RELATIONSHIP_TYPE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "relationship-type" + "'", str0,
        "relationship-type");
  }

  @Test
  public void test0010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0010");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.URI_TEMPLATE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "uri-template" + "'", str0,
        "uri-template");
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0011");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.BYTE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "byte" + "'", str0, "byte");
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0012");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str1 = io.github.onograph.server.rest.cluster.DbmsApi.abudmcspaString(
          config0);
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
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.BOOLEAN_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "booleans" + "'", str0, "booleans");
  }

  @Test
  public void test0014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0014");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern[] patternArray1 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList2 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList2, patternArray1);
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier5 = null;
    org.neo4j.server.web.WebServer webServer6 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl7 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList2, logProvider4,
        authManagerSupplier5, webServer6);
    try {
      authorizationModuleEnterpriseImpl7.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0015");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    try {
      authorizationModuleEnterpriseImpl5.start();
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
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.PROPERTIES_MAP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "properties" + "'", str0, "properties");
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0017");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.NODE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "node" + "'", str0, "node");
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0018");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.server.ConfigurableServerSettings.browser_retain_connection_credentials;
    org.junit.Assert.assertNotNull(booleanSetting0);
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0019");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.DOUBLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "double" + "'", str0, "double");
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0020");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.BYTE_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bytes" + "'", str0, "bytes");
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0021");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.EXTENSION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "plugin" + "'", str0, "plugin");
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0022");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat2 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService3 = null;
    try {
      io.github.onograph.server.rest.cluster.BackwardsCompatibilityRedirectService backwardsCompatibilityRedirectService4 = new io.github.onograph.server.rest.cluster.BackwardsCompatibilityRedirectService(
          config0, databaseManagementService1, outputFormat2, databaseStateService3);
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
    java.lang.String str0 = io.github.onograph.server.rest.cluster.GdbClusterApi.K;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db/cluster" + "'", str0, "db/cluster");
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0024");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.DOUBLE_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "doubles" + "'", str0, "doubles");
  }

  @Test
  public void test0025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0025");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.NODE_INDEXES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "node-index" + "'", str0, "node-index");
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0026");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.SHORT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "short" + "'", str0, "short");
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0027");
    }
    org.neo4j.configuration.Config config0 = null;
    try {
      java.lang.String str1 = io.github.onograph.server.rest.cluster.GdbClusterApi.abudtectptString(
          config0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0028");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.EXCEPTION;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exception" + "'", str0, "exception");
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0029");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.LONG;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "long" + "'", str0, "long");
  }

  @Test
  public void test0030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0030");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.INDEX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
  }

  @Test
  public void test0031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0031");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.server.rest.cluster.ClusterDbmsStatusMeta clusterDbmsStatusMeta1 = new io.github.onograph.server.rest.cluster.ClusterDbmsStatusMeta(
        databaseManagementService0);
    java.io.OutputStream outputStream2 = null;
    try {
      clusterDbmsStatusMeta1.write(outputStream2);
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
    java.lang.String str0 = io.github.onograph.server.rest.cluster.DbmsApi.K;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dbms/cluster" + "'", str0,
        "dbms/cluster");
  }

  @Test
  public void test0033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0033");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.URI;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "uri" + "'", str0, "uri");
  }

  @Test
  public void test0034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0034");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.PATH;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "path" + "'", str0, "path");
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0035");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.FLOAT_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "floats" + "'", str0, "floats");
  }

  @Test
  public void test0036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0036");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.CHARACTER_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "characters" + "'", str0, "characters");
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0037");
    }
    java.lang.Object obj0 = new java.lang.Object();
    java.lang.Class<?> wildcardClass1 = obj0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0038");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.server.web.WebServer webServer1 = null;
    io.github.onograph.server.rest.ServerModuleManagementImpl serverModuleManagementImpl2 = new io.github.onograph.server.rest.ServerModuleManagementImpl(
        config0, webServer1);
    try {
      serverModuleManagementImpl2.stop();
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
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.EXTENSIONS_MAP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "plugins" + "'", str0, "plugins");
  }

  @Test
  public void test0040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0040");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.CHARACTER;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "character" + "'", str0, "character");
  }

  @Test
  public void test0041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0041");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.BOOLEAN;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "boolean" + "'", str0, "boolean");
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0042");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onShutdown(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0043");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.STRING;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "string" + "'", str0, "string");
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0044");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.server.web.WebServer webServer1 = null;
    try {
      io.github.onograph.server.rest.ServerModuleClusterImpl serverModuleClusterImpl2 = new io.github.onograph.server.rest.ServerModuleClusterImpl(
          config0, webServer1);
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
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.NODE_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "nodes" + "'", str0, "nodes");
  }

  @Test
  public void test0046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0046");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.GRAPHDB;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "graphdb" + "'", str0, "graphdb");
  }

  @Test
  public void test0047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0047");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0048");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.SHORT_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "shorts" + "'", str0, "shorts");
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0049");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.PATH_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "paths" + "'", str0, "paths");
  }

  @Test
  public void test0050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0050");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.RELATIONSHIP_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "relationships" + "'", str0,
        "relationships");
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0051");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.function.ThrowingAction throwingAction1 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle2 = org.neo4j.kernel.lifecycle.LifecycleAdapter.simpleLife(
        throwingAction0, throwingAction1);
    org.junit.Assert.assertNotNull(lifecycle2);
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0052");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.LONG_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "longs" + "'", str0, "longs");
  }

  @Test
  public void test0053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0053");
    }
    io.github.onograph.server.rest.cluster.RestGdbApiManager restGdbApiManager0 = new io.github.onograph.server.rest.cluster.RestGdbApiManager();
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0054");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.RELATIONSHIP_INDEXES;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "relationship-index" + "'", str0,
        "relationship-index");
  }

  @Test
  public void test0055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0055");
    }
    org.neo4j.graphdb.config.Setting<java.time.Duration> durationSetting0 = io.github.onograph.server.ConfigurableServerSettings.browser_credential_timeout;
    org.junit.Assert.assertNotNull(durationSetting0);
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0056");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.connectors.ConnectorPortRegister connectorPortRegister1 = null;
    try {
      org.neo4j.server.rest.discovery.DiscoverableURIs discoverableURIs2 = io.github.onograph.server.rest.DiscoverableURIService.enpdvlurDiscoverableURIs(
          config0, connectorPortRegister1);
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
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.INTEGER_LIST;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "integers" + "'", str0, "integers");
  }

  @Test
  public void test0058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0058");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.server.web.WebServer webServer1 = null;
    io.github.onograph.server.rest.ServerModuleManagementImpl serverModuleManagementImpl2 = new io.github.onograph.server.rest.ServerModuleManagementImpl(
        config0, webServer1);
    try {
      serverModuleManagementImpl2.start();
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
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
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
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onInit(
        throwingAction0);
    org.junit.Assert.assertNotNull(lifecycle1);
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0061");
    }
    io.github.onograph.server.rest.DiscoverableURIService discoverableURIService0 = new io.github.onograph.server.rest.DiscoverableURIService();
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0062");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.FLOAT;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "float" + "'", str0, "float");
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0063");
    }
    java.lang.String str0 = org.neo4j.server.rest.repr.Representation.MAP;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "map" + "'", str0, "map");
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0064");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.ServletRequest servletRequest1 = null;
    javax.servlet.ServletResponse servletResponse2 = null;
    javax.servlet.FilterChain filterChain3 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest1, servletResponse2,
          filterChain3);
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
    io.github.onograph.server.ConfigurableServerSettings configurableServerSettings0 = new io.github.onograph.server.ConfigurableServerSettings();
  }

  @Test
  public void test0066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0066");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onStart(
        throwingAction0);
    java.lang.Class<?> wildcardClass2 = lifecycle1.getClass();
    org.junit.Assert.assertNotNull(lifecycle1);
    org.junit.Assert.assertNotNull(wildcardClass2);
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0067");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern pattern1 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{pattern1};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    try {
      authorizationModuleEnterpriseImpl8.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern1);
    org.junit.Assert.assertEquals(pattern1.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0068");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0069");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0070");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0071");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    try {
      authorizationModuleEnterpriseImpl12.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0072");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0073");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest2 = null;
    javax.servlet.ServletResponse servletResponse3 = null;
    javax.servlet.FilterChain filterChain4 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest2, servletResponse3,
          filterChain4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0074");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest4 = null;
    javax.servlet.ServletResponse servletResponse5 = null;
    javax.servlet.FilterChain filterChain6 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest4, servletResponse5,
          filterChain6);
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
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0077");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.ServletRequest servletRequest4 = null;
    javax.servlet.ServletResponse servletResponse5 = null;
    javax.servlet.FilterChain filterChain6 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest4, servletResponse5,
          filterChain6);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.ServletRequest servletRequest5 = null;
    javax.servlet.ServletResponse servletResponse6 = null;
    javax.servlet.FilterChain filterChain7 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest5, servletResponse6,
          filterChain7);
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
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern[] patternArray1 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList2 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList2, patternArray1);
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier5 = null;
    org.neo4j.server.web.WebServer webServer6 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl7 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList2, logProvider4,
        authManagerSupplier5, webServer6);
    authorizationModuleEnterpriseImpl7.stop();
    try {
      authorizationModuleEnterpriseImpl7.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0080");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest5 = null;
    javax.servlet.ServletResponse servletResponse6 = null;
    javax.servlet.FilterChain filterChain7 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest5, servletResponse6,
          filterChain7);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest3 = null;
    javax.servlet.ServletResponse servletResponse4 = null;
    javax.servlet.FilterChain filterChain5 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest3, servletResponse4,
          filterChain5);
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
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    try {
      authorizationModuleEnterpriseImpl12.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0083");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
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
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    java.util.regex.Pattern pattern4 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray5 = new java.util.regex.Pattern[]{pattern4};
    java.util.ArrayList<java.util.regex.Pattern> patternList6 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList6, patternArray5);
    org.neo4j.logging.LogProvider logProvider8 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier9 = null;
    org.neo4j.server.web.WebServer webServer10 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl11 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider8,
        authManagerSupplier9, webServer10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider20,
        authManagerSupplier21, webServer22);
    authorizationModuleEnterpriseImpl23.stop();
    try {
      authorizationModuleEnterpriseImpl23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern4);
    org.junit.Assert.assertEquals(pattern4.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0085");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0086");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0087");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    java.util.regex.Pattern pattern4 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray5 = new java.util.regex.Pattern[]{pattern4};
    java.util.ArrayList<java.util.regex.Pattern> patternList6 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList6, patternArray5);
    org.neo4j.logging.LogProvider logProvider8 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier9 = null;
    org.neo4j.server.web.WebServer webServer10 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl11 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider8,
        authManagerSupplier9, webServer10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider20,
        authManagerSupplier21, webServer22);
    try {
      authorizationModuleEnterpriseImpl23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern4);
    org.junit.Assert.assertEquals(pattern4.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test0088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0088");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0089");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0090");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.ServletRequest servletRequest3 = null;
    javax.servlet.ServletResponse servletResponse4 = null;
    javax.servlet.FilterChain filterChain5 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest3, servletResponse4,
          filterChain5);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0092");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    java.util.regex.Pattern[] patternArray3 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList4 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList4, patternArray3);
    org.neo4j.logging.LogProvider logProvider6 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier7 = null;
    org.neo4j.server.web.WebServer webServer8 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl9 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider6,
        authManagerSupplier7, webServer8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier11 = null;
    org.neo4j.server.web.WebServer webServer12 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl13 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider10,
        authManagerSupplier11, webServer12);
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier15 = null;
    org.neo4j.server.web.WebServer webServer16 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl17 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider14,
        authManagerSupplier15, webServer16);
    authorizationModuleEnterpriseImpl17.stop();
    try {
      authorizationModuleEnterpriseImpl17.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0093");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.ServletRequest servletRequest8 = null;
    javax.servlet.ServletResponse servletResponse9 = null;
    javax.servlet.FilterChain filterChain10 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest8, servletResponse9,
          filterChain10);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("uri/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster/cluster" + "'", str9,
        "uri/cluster/cluster");
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0095");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0096");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0097");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern pattern1 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{pattern1};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    java.lang.Class<?> wildcardClass9 = patternList3.getClass();
    org.junit.Assert.assertNotNull(pattern1);
    org.junit.Assert.assertEquals(pattern1.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0098");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0099");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0100");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass15 = response14.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0101");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    try {
      authorizationModuleEnterpriseImpl12.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0102");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0103");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest14 = null;
    javax.servlet.ServletResponse servletResponse15 = null;
    javax.servlet.FilterChain filterChain16 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest14, servletResponse15,
          filterChain16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0104");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    try {
      authorizationModuleEnterpriseImpl12.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0105");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    java.lang.Class<?> wildcardClass13 = authorizationModuleEnterpriseImpl12.getClass();
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0106");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("uri");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0107");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("uri");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0108");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("path");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str11,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0109");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0110");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str8, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0111");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest6 = null;
    javax.servlet.ServletResponse servletResponse7 = null;
    javax.servlet.FilterChain filterChain8 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest6, servletResponse7,
          filterChain8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0112");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest8 = null;
    javax.servlet.ServletResponse servletResponse9 = null;
    javax.servlet.FilterChain filterChain10 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest8, servletResponse9,
          filterChain10);
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
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern pattern2 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray3 = new java.util.regex.Pattern[]{pattern2};
    java.util.ArrayList<java.util.regex.Pattern> patternList4 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList4, patternArray3);
    org.neo4j.logging.LogProvider logProvider6 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier7 = null;
    org.neo4j.server.web.WebServer webServer8 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl9 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider6,
        authManagerSupplier7, webServer8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier11 = null;
    org.neo4j.server.web.WebServer webServer12 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl13 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider10,
        authManagerSupplier11, webServer12);
    try {
      authorizationModuleEnterpriseImpl13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern2);
    org.junit.Assert.assertEquals(pattern2.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0114");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationship-index/cluster" + "'", str6,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0115");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0116");
    }
    org.neo4j.function.ThrowingAction throwingAction0 = null;
    org.neo4j.kernel.lifecycle.Lifecycle lifecycle1 = org.neo4j.kernel.lifecycle.LifecycleAdapter.onStop(
        throwingAction0);
    java.lang.Class<?> wildcardClass2 = lifecycle1.getClass();
    org.junit.Assert.assertNotNull(lifecycle1);
    org.junit.Assert.assertNotNull(wildcardClass2);
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0117");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0118");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    java.util.regex.Pattern[] patternArray3 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList4 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList4, patternArray3);
    org.neo4j.logging.LogProvider logProvider6 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier7 = null;
    org.neo4j.server.web.WebServer webServer8 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl9 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider6,
        authManagerSupplier7, webServer8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier11 = null;
    org.neo4j.server.web.WebServer webServer12 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl13 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider10,
        authManagerSupplier11, webServer12);
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier15 = null;
    org.neo4j.server.web.WebServer webServer16 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl17 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider14,
        authManagerSupplier15, webServer16);
    try {
      authorizationModuleEnterpriseImpl17.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0119");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.server.rest.cluster.DbmsApi dbmsApi1 = new io.github.onograph.server.rest.cluster.DbmsApi(
        databaseManagementService0);
    javax.ws.rs.core.Response response2 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response3 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response4 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response5 = dbmsApi1.sttResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response2);
    org.junit.Assert.assertNotNull(response3);
    org.junit.Assert.assertNotNull(response4);
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0120");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    try {
      authorizationModuleEnterpriseImpl12.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0121");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    try {
      authorizationModuleEnterpriseImpl12.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0122");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    java.util.regex.Pattern pattern5 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray6 = new java.util.regex.Pattern[]{pattern5};
    java.util.ArrayList<java.util.regex.Pattern> patternList7 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList7, patternArray6);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider9,
        authManagerSupplier10, webServer11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier14 = null;
    org.neo4j.server.web.WebServer webServer15 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl16 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider13,
        authManagerSupplier14, webServer15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier18 = null;
    org.neo4j.server.web.WebServer webServer19 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl20 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider17,
        authManagerSupplier18, webServer19);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider25,
        authManagerSupplier26, webServer27);
    try {
      authorizationModuleEnterpriseImpl28.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern5);
    org.junit.Assert.assertEquals(pattern5.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0123");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    javax.servlet.ServletRequest servletRequest7 = null;
    javax.servlet.ServletResponse servletResponse8 = null;
    javax.servlet.FilterChain filterChain9 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest7, servletResponse8,
          filterChain9);
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
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("byte/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "byte/cluster/cluster" + "'", str7,
        "byte/cluster/cluster");
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0125");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
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
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    try {
      authorizationModuleEnterpriseImpl12.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0128");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0129");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "db/cluster/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0130");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("map");
    java.lang.String str10 = gdbClusterApi4.reavpaString("strings");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "map/cluster" + "'", str8, "map/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "strings/cluster" + "'", str10,
        "strings/cluster");
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0131");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str13,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0132");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.ServletRequest servletRequest5 = null;
    javax.servlet.ServletResponse servletResponse6 = null;
    javax.servlet.FilterChain filterChain7 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest5, servletResponse6,
          filterChain7);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0135");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("bytes");
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bytes/cluster" + "'", str7,
        "bytes/cluster");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0136");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("dbms/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "dbms/cluster/cluster" + "'", str10,
        "dbms/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0137");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0138");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("db/cluster");
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0139");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0140");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("hi!");
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0141");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern pattern1 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{pattern1};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    authorizationModuleEnterpriseImpl8.stop();
    authorizationModuleEnterpriseImpl8.stop();
    try {
      authorizationModuleEnterpriseImpl8.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern1);
    org.junit.Assert.assertEquals(pattern1.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test0142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0142");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest15 = null;
    javax.servlet.ServletResponse servletResponse16 = null;
    javax.servlet.FilterChain filterChain17 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest15, servletResponse16,
          filterChain17);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    javax.servlet.ServletRequest servletRequest15 = null;
    javax.servlet.ServletResponse servletResponse16 = null;
    javax.servlet.FilterChain filterChain17 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest15, servletResponse16,
          filterChain17);
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
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0145");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0147");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern[] patternArray1 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList2 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList2, patternArray1);
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier5 = null;
    org.neo4j.server.web.WebServer webServer6 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl7 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList2, logProvider4,
        authManagerSupplier5, webServer6);
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    try {
      authorizationModuleEnterpriseImpl7.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0148");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0149");
    }
    org.neo4j.server.rest.repr.Representation representation0 = org.neo4j.server.rest.repr.Representation.emptyRepresentation();
    org.neo4j.server.rest.repr.RepresentationType representationType1 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType2 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType3 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType4 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType5 = representation0.getRepresentationType();
    java.lang.Class<?> wildcardClass6 = representation0.getClass();
    org.junit.Assert.assertNotNull(representation0);
    org.junit.Assert.assertNull(representationType1);
    org.junit.Assert.assertNull(representationType2);
    org.junit.Assert.assertNull(representationType3);
    org.junit.Assert.assertNull(representationType4);
    org.junit.Assert.assertNull(representationType5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0150");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest7 = null;
    javax.servlet.ServletResponse servletResponse8 = null;
    javax.servlet.FilterChain filterChain9 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest7, servletResponse8,
          filterChain9);
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
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    java.util.regex.Pattern[] patternArray4 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList5 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList5, patternArray4);
    org.neo4j.logging.LogProvider logProvider7 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier8 = null;
    org.neo4j.server.web.WebServer webServer9 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl10 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider7,
        authManagerSupplier8, webServer9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier12 = null;
    org.neo4j.server.web.WebServer webServer13 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl14 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider11,
        authManagerSupplier12, webServer13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider19,
        authManagerSupplier20, webServer21);
    try {
      authorizationModuleEnterpriseImpl22.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
  }

  @Test
  public void test0152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0152");
    }
    org.neo4j.server.rest.repr.Representation representation0 = org.neo4j.server.rest.repr.Representation.emptyRepresentation();
    org.neo4j.server.rest.repr.RepresentationType representationType1 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType2 = representation0.getRepresentationType();
    try {
      java.lang.Class<?> wildcardClass3 = representationType2.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(representation0);
    org.junit.Assert.assertNull(representationType1);
    org.junit.Assert.assertNull(representationType2);
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0153");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest7 = null;
    javax.servlet.ServletResponse servletResponse8 = null;
    javax.servlet.FilterChain filterChain9 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest7, servletResponse8,
          filterChain9);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "doubles/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0155");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0156");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.ServletRequest servletRequest13 = null;
    javax.servlet.ServletResponse servletResponse14 = null;
    javax.servlet.FilterChain filterChain15 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest13, servletResponse14,
          filterChain15);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
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
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0159");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    java.lang.Class<?> wildcardClass14 = authorizationModuleEnterpriseImpl12.getClass();
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0160");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass5 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0161");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0162");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0163");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0165");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    java.util.regex.Pattern pattern4 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray5 = new java.util.regex.Pattern[]{pattern4};
    java.util.ArrayList<java.util.regex.Pattern> patternList6 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList6, patternArray5);
    org.neo4j.logging.LogProvider logProvider8 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier9 = null;
    org.neo4j.server.web.WebServer webServer10 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl11 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider8,
        authManagerSupplier9, webServer10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider20,
        authManagerSupplier21, webServer22);
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    try {
      authorizationModuleEnterpriseImpl23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern4);
    org.junit.Assert.assertEquals(pattern4.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test0166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0166");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    java.lang.Class<?> wildcardClass5 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0167");
    }
    org.neo4j.server.rest.repr.Representation representation0 = org.neo4j.server.rest.repr.Representation.emptyRepresentation();
    org.neo4j.server.rest.repr.RepresentationType representationType1 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType2 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType3 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType4 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType5 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType6 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType7 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType8 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType9 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType10 = representation0.getRepresentationType();
    try {
      java.lang.Class<?> wildcardClass11 = representationType10.getClass();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(representation0);
    org.junit.Assert.assertNull(representationType1);
    org.junit.Assert.assertNull(representationType2);
    org.junit.Assert.assertNull(representationType3);
    org.junit.Assert.assertNull(representationType4);
    org.junit.Assert.assertNull(representationType5);
    org.junit.Assert.assertNull(representationType6);
    org.junit.Assert.assertNull(representationType7);
    org.junit.Assert.assertNull(representationType8);
    org.junit.Assert.assertNull(representationType9);
    org.junit.Assert.assertNull(representationType10);
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0168");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0169");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0170");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("float");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("map/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "float/cluster" + "'", str7,
        "float/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "map/cluster/cluster/cluster" + "'",
        str10, "map/cluster/cluster/cluster");
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0171");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0172");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0173");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest13 = null;
    javax.servlet.ServletResponse servletResponse14 = null;
    javax.servlet.FilterChain filterChain15 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest13, servletResponse14,
          filterChain15);
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
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    java.util.regex.Pattern pattern3 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray4 = new java.util.regex.Pattern[]{pattern3};
    java.util.ArrayList<java.util.regex.Pattern> patternList5 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList5, patternArray4);
    org.neo4j.logging.LogProvider logProvider7 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier8 = null;
    org.neo4j.server.web.WebServer webServer9 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl10 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider7,
        authManagerSupplier8, webServer9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier12 = null;
    org.neo4j.server.web.WebServer webServer13 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl14 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider11,
        authManagerSupplier12, webServer13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider15,
        authManagerSupplier16, webServer17);
    try {
      authorizationModuleEnterpriseImpl18.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern3);
    org.junit.Assert.assertEquals(pattern3.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0175");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("hi!");
    java.lang.String str20 = gdbClusterApi4.reavpaString("plugin");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!/cluster" + "'", str18,
        "hi!/cluster");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "plugin/cluster" + "'", str20,
        "plugin/cluster");
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0176");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    java.util.regex.Pattern pattern7 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray8 = new java.util.regex.Pattern[]{pattern7};
    java.util.ArrayList<java.util.regex.Pattern> patternList9 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList9, patternArray8);
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier12 = null;
    org.neo4j.server.web.WebServer webServer13 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl14 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider11,
        authManagerSupplier12, webServer13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider35,
        authManagerSupplier36, webServer37);
    try {
      authorizationModuleEnterpriseImpl38.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern7);
    org.junit.Assert.assertEquals(pattern7.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0177");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0178");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    java.lang.Class<?> wildcardClass19 = authorizationModuleEnterpriseImpl12.getClass();
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0179");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0180");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0181");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0182");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str7, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0184");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0185");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    java.util.regex.Pattern pattern4 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray5 = new java.util.regex.Pattern[]{pattern4};
    java.util.ArrayList<java.util.regex.Pattern> patternList6 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList6, patternArray5);
    org.neo4j.logging.LogProvider logProvider8 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier9 = null;
    org.neo4j.server.web.WebServer webServer10 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl11 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider8,
        authManagerSupplier9, webServer10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider20,
        authManagerSupplier21, webServer22);
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    try {
      authorizationModuleEnterpriseImpl23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern4);
    org.junit.Assert.assertEquals(pattern4.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0186");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0187");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass6 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0188");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.ServletRequest servletRequest13 = null;
    javax.servlet.ServletResponse servletResponse14 = null;
    javax.servlet.FilterChain filterChain15 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest13, servletResponse14,
          filterChain15);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0190");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    java.lang.String str12 = gdbClusterApi4.reavpaString("bytes/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("uri");
    java.lang.String str16 = gdbClusterApi4.reavpaString("shorts/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "bytes/cluster/cluster" + "'", str12,
        "bytes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uri/cluster" + "'", str14,
        "uri/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "shorts/cluster/cluster/cluster" + "'",
        str16, "shorts/cluster/cluster/cluster");
  }

  @Test
  public void test0191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0191");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    javax.servlet.ServletRequest servletRequest12 = null;
    javax.servlet.ServletResponse servletResponse13 = null;
    javax.servlet.FilterChain filterChain14 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest12, servletResponse13,
          filterChain14);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest8 = null;
    javax.servlet.ServletResponse servletResponse9 = null;
    javax.servlet.FilterChain filterChain10 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest8, servletResponse9,
          filterChain10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0193");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0194");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0195");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    java.util.regex.Pattern pattern3 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray4 = new java.util.regex.Pattern[]{pattern3};
    java.util.ArrayList<java.util.regex.Pattern> patternList5 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList5, patternArray4);
    org.neo4j.logging.LogProvider logProvider7 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier8 = null;
    org.neo4j.server.web.WebServer webServer9 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl10 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider7,
        authManagerSupplier8, webServer9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier12 = null;
    org.neo4j.server.web.WebServer webServer13 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl14 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider11,
        authManagerSupplier12, webServer13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList5, logProvider15,
        authManagerSupplier16, webServer17);
    authorizationModuleEnterpriseImpl18.stop();
    try {
      authorizationModuleEnterpriseImpl18.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern3);
    org.junit.Assert.assertEquals(pattern3.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0196");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    javax.servlet.ServletRequest servletRequest6 = null;
    javax.servlet.ServletResponse servletResponse7 = null;
    javax.servlet.FilterChain filterChain8 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest6, servletResponse7,
          filterChain8);
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
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0198");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/cluster/cluster/cluster" + "'", str6,
        "/cluster/cluster/cluster");
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0199");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest12 = null;
    javax.servlet.ServletResponse servletResponse13 = null;
    javax.servlet.FilterChain filterChain14 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest12, servletResponse13,
          filterChain14);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0201");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    javax.servlet.ServletRequest servletRequest7 = null;
    javax.servlet.ServletResponse servletResponse8 = null;
    javax.servlet.FilterChain filterChain9 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest7, servletResponse8,
          filterChain9);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0203");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
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
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    java.util.regex.Pattern pattern8 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray9 = new java.util.regex.Pattern[]{pattern8};
    java.util.ArrayList<java.util.regex.Pattern> patternList10 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList10, patternArray9);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider40,
        authManagerSupplier41, webServer42);
    try {
      authorizationModuleEnterpriseImpl43.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern8);
    org.junit.Assert.assertEquals(pattern8.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0205");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest14 = null;
    javax.servlet.ServletResponse servletResponse15 = null;
    javax.servlet.FilterChain filterChain16 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest14, servletResponse15,
          filterChain16);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "relationship/cluster/cluster" + "'",
        str9, "relationship/cluster/cluster");
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0207");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("graphdb");
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0208");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest8 = null;
    javax.servlet.ServletResponse servletResponse9 = null;
    javax.servlet.FilterChain filterChain10 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest8, servletResponse9,
          filterChain10);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0210");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0211");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    java.lang.String str18 = gdbClusterApi4.reavpaString("long/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str13,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str16,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "long/cluster/cluster/cluster/cluster" + "'", str18,
        "long/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0212");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    java.lang.Class<?> wildcardClass13 = patternList3.getClass();
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0213");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    java.lang.Class<?> wildcardClass7 = authorizationModuleEnterpriseImpl5.getClass();
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0214");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("dbms/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plugins/cluster" + "'", str6,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbms/cluster/cluster" + "'", str9,
        "dbms/cluster/cluster");
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0215");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest13 = null;
    javax.servlet.ServletResponse servletResponse14 = null;
    javax.servlet.FilterChain filterChain15 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest13, servletResponse14,
          filterChain15);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0217");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("character/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("paths/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "paths/cluster/cluster" + "'", str13,
        "paths/cluster/cluster");
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0218");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("booleans/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster" + "'", str9,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0219");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0220");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0221");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern pattern1 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{pattern1};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    authorizationModuleEnterpriseImpl8.stop();
    try {
      authorizationModuleEnterpriseImpl8.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern1);
    org.junit.Assert.assertEquals(pattern1.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0222");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("path");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0223");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0224");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0225");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("strings/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str12, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str14, "strings/cluster/cluster/cluster");
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0226");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("character/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0227");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0228");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    javax.servlet.ServletRequest servletRequest12 = null;
    javax.servlet.ServletResponse servletResponse13 = null;
    javax.servlet.FilterChain filterChain14 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest12, servletResponse13,
          filterChain14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0229");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
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
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0231");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "doubles/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0232");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0233");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("uri");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0234");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0235");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0236");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0238");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0239");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes/cluster", outputFormat3);
  }

  @Test
  public void test0240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0240");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "doubles/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0241");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("path");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str11,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0242");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern pattern2 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray3 = new java.util.regex.Pattern[]{pattern2};
    java.util.ArrayList<java.util.regex.Pattern> patternList4 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean5 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList4, patternArray3);
    org.neo4j.logging.LogProvider logProvider6 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier7 = null;
    org.neo4j.server.web.WebServer webServer8 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl9 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider6,
        authManagerSupplier7, webServer8);
    org.neo4j.logging.LogProvider logProvider10 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier11 = null;
    org.neo4j.server.web.WebServer webServer12 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl13 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList4, logProvider10,
        authManagerSupplier11, webServer12);
    authorizationModuleEnterpriseImpl13.stop();
    try {
      authorizationModuleEnterpriseImpl13.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern2);
    org.junit.Assert.assertEquals(pattern2.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0243");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("doubles");
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0244");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0245");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.server.rest.cluster.DbmsApi dbmsApi1 = new io.github.onograph.server.rest.cluster.DbmsApi(
        databaseManagementService0);
    java.lang.Class<?> wildcardClass2 = dbmsApi1.getClass();
    org.junit.Assert.assertNotNull(wildcardClass2);
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0246");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    java.util.regex.Pattern pattern5 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray6 = new java.util.regex.Pattern[]{pattern5};
    java.util.ArrayList<java.util.regex.Pattern> patternList7 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList7, patternArray6);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider9,
        authManagerSupplier10, webServer11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier14 = null;
    org.neo4j.server.web.WebServer webServer15 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl16 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider13,
        authManagerSupplier14, webServer15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier18 = null;
    org.neo4j.server.web.WebServer webServer19 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl20 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider17,
        authManagerSupplier18, webServer19);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider25,
        authManagerSupplier26, webServer27);
    authorizationModuleEnterpriseImpl28.stop();
    try {
      authorizationModuleEnterpriseImpl28.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern5);
    org.junit.Assert.assertEquals(pattern5.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0247");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    javax.servlet.ServletRequest servletRequest15 = null;
    javax.servlet.ServletResponse servletResponse16 = null;
    javax.servlet.FilterChain filterChain17 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest15, servletResponse16,
          filterChain17);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
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
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("map");
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "map/cluster" + "'", str8, "map/cluster");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0250");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0251");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
    javax.servlet.ServletRequest servletRequest14 = null;
    javax.servlet.ServletResponse servletResponse15 = null;
    javax.servlet.FilterChain filterChain16 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest14, servletResponse15,
          filterChain16);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest8 = null;
    javax.servlet.ServletResponse servletResponse9 = null;
    javax.servlet.FilterChain filterChain10 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest8, servletResponse9,
          filterChain10);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0254");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0255");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0256");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    javax.servlet.ServletRequest servletRequest16 = null;
    javax.servlet.ServletResponse servletResponse17 = null;
    javax.servlet.FilterChain filterChain18 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest16, servletResponse17,
          filterChain18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0257");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    javax.servlet.ServletRequest servletRequest12 = null;
    javax.servlet.ServletResponse servletResponse13 = null;
    javax.servlet.FilterChain filterChain14 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest12, servletResponse13,
          filterChain14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0258");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0259");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0260");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster/cluster",
        outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0261");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
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
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
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
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("paths/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str13,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "paths/cluster/cluster/cluster" + "'",
        str15, "paths/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0264");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest14 = null;
    javax.servlet.ServletResponse servletResponse15 = null;
    javax.servlet.FilterChain filterChain16 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest14, servletResponse15,
          filterChain16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0265");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str13,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0266");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0267");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("hi!/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass15 = response14.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster" + "'", str12,
        "hi!/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0268");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0269");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.server.web.WebServer webServer1 = null;
    io.github.onograph.server.rest.ServerModuleManagementImpl serverModuleManagementImpl2 = new io.github.onograph.server.rest.ServerModuleManagementImpl(
        config0, webServer1);
    java.lang.Class<?> wildcardClass3 = serverModuleManagementImpl2.getClass();
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0270");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0271");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern[] patternArray1 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList2 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList2, patternArray1);
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier5 = null;
    org.neo4j.server.web.WebServer webServer6 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl7 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList2, logProvider4,
        authManagerSupplier5, webServer6);
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    try {
      authorizationModuleEnterpriseImpl7.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0272");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plugins/cluster" + "'", str6,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0273");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("dbms/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dbms/cluster/cluster" + "'", str6,
        "dbms/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0274");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.ServletRequest servletRequest13 = null;
    javax.servlet.ServletResponse servletResponse14 = null;
    javax.servlet.FilterChain filterChain15 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest13, servletResponse14,
          filterChain15);
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
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    java.util.regex.Pattern[] patternArray5 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList6 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList6, patternArray5);
    org.neo4j.logging.LogProvider logProvider8 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier9 = null;
    org.neo4j.server.web.WebServer webServer10 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl11 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider8,
        authManagerSupplier9, webServer10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider24,
        authManagerSupplier25, webServer26);
    try {
      authorizationModuleEnterpriseImpl27.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0276");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "index/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0277");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0278");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("map");
    java.lang.String str15 = gdbClusterApi4.reavpaString("map/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass17 = response16.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster" + "'", str13,
        "map/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "map/cluster/cluster" + "'", str15,
        "map/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0279");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    java.util.regex.Pattern pattern6 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray7 = new java.util.regex.Pattern[]{pattern6};
    java.util.ArrayList<java.util.regex.Pattern> patternList8 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList8, patternArray7);
    org.neo4j.logging.LogProvider logProvider10 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier11 = null;
    org.neo4j.server.web.WebServer webServer12 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl13 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider10,
        authManagerSupplier11, webServer12);
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier15 = null;
    org.neo4j.server.web.WebServer webServer16 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl17 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider14,
        authManagerSupplier15, webServer16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier19 = null;
    org.neo4j.server.web.WebServer webServer20 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl21 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider18,
        authManagerSupplier19, webServer20);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider30,
        authManagerSupplier31, webServer32);
    try {
      authorizationModuleEnterpriseImpl33.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern6);
    org.junit.Assert.assertEquals(pattern6.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0280");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0281");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("integers/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "integers/cluster/cluster" + "'", str11,
        "integers/cluster/cluster");
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0282");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("shorts/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "shorts/cluster/cluster/cluster" + "'",
        str14, "shorts/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0283");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("map");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "map/cluster" + "'", str8, "map/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0284");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest13 = null;
    javax.servlet.ServletResponse servletResponse14 = null;
    javax.servlet.FilterChain filterChain15 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest13, servletResponse14,
          filterChain15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0285");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0286");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0287");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("byte/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "byte/cluster/cluster/cluster" + "'",
        str10, "byte/cluster/cluster/cluster");
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0288");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-index/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0289");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0290");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0291");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "characters/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0292");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    java.lang.String str18 = gdbClusterApi4.reavpaString("paths");
    javax.ws.rs.core.Response response19 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str13,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str16,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "paths/cluster" + "'", str18,
        "paths/cluster");
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0293");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0294");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0295");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0297");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest7 = null;
    javax.servlet.ServletResponse servletResponse8 = null;
    javax.servlet.FilterChain filterChain9 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest7, servletResponse8,
          filterChain9);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0299");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str6,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0300");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "long/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0301");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0302");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "index/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster" + "'", str7, "/cluster");
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0303");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0304");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0305");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("integer/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integer/cluster/cluster" + "'", str12,
        "integer/cluster/cluster");
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0306");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0307");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest6 = null;
    javax.servlet.ServletResponse servletResponse7 = null;
    javax.servlet.FilterChain filterChain8 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest6, servletResponse7,
          filterChain8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0308");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "doubles/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0309");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0310");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    java.util.regex.Pattern pattern4 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray5 = new java.util.regex.Pattern[]{pattern4};
    java.util.ArrayList<java.util.regex.Pattern> patternList6 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList6, patternArray5);
    org.neo4j.logging.LogProvider logProvider8 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier9 = null;
    org.neo4j.server.web.WebServer webServer10 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl11 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider8,
        authManagerSupplier9, webServer10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider20,
        authManagerSupplier21, webServer22);
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    try {
      authorizationModuleEnterpriseImpl23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern4);
    org.junit.Assert.assertEquals(pattern4.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0311");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.ServletRequest servletRequest8 = null;
    javax.servlet.ServletResponse servletResponse9 = null;
    javax.servlet.FilterChain filterChain10 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest8, servletResponse9,
          filterChain10);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0313");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster" + "'", str7, "/cluster");
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0314");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern[] patternArray1 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList2 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList2, patternArray1);
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier5 = null;
    org.neo4j.server.web.WebServer webServer6 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl7 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList2, logProvider4,
        authManagerSupplier5, webServer6);
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    try {
      authorizationModuleEnterpriseImpl7.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0315");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    javax.servlet.ServletRequest servletRequest15 = null;
    javax.servlet.ServletResponse servletResponse16 = null;
    javax.servlet.FilterChain filterChain17 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest15, servletResponse16,
          filterChain17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0316");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0317");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0318");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0319");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0320");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0321");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    java.lang.String str10 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("db/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str10, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "db/cluster/cluster/cluster" + "'",
        str14, "db/cluster/cluster/cluster");
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0322");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0323");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("hi!");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!/cluster" + "'", str13,
        "hi!/cluster");
  }

  @Test
  public void test0324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0324");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest12 = null;
    javax.servlet.ServletResponse servletResponse13 = null;
    javax.servlet.FilterChain filterChain14 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest12, servletResponse13,
          filterChain14);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "node-index", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0327");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    javax.servlet.ServletRequest servletRequest16 = null;
    javax.servlet.ServletResponse servletResponse17 = null;
    javax.servlet.FilterChain filterChain18 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest16, servletResponse17,
          filterChain18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0328");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0329");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    java.util.regex.Pattern[] patternArray2 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList3 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean4 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList3, patternArray2);
    org.neo4j.logging.LogProvider logProvider5 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier6 = null;
    org.neo4j.server.web.WebServer webServer7 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl8 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider5,
        authManagerSupplier6, webServer7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList3, logProvider9,
        authManagerSupplier10, webServer11);
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    try {
      authorizationModuleEnterpriseImpl12.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0330");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.List<java.util.regex.Pattern> patternList1 = null;
    org.neo4j.logging.LogProvider logProvider2 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier3 = null;
    org.neo4j.server.web.WebServer webServer4 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl5 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, patternList1, logProvider2, authManagerSupplier3, webServer4);
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0331");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0332");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0333");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster/cluster" + "'", str8,
        "/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0334");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "dbms/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0335");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("");
    java.lang.String str17 = gdbClusterApi4.reavpaString("long/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/cluster" + "'", str15, "/cluster");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "long/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0336");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0337");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    javax.servlet.ServletRequest servletRequest18 = null;
    javax.servlet.ServletResponse servletResponse19 = null;
    javax.servlet.FilterChain filterChain20 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest18, servletResponse19,
          filterChain20);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    java.lang.Class<?> wildcardClass13 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0339");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster/cluster" + "'", str7,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0340");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
  }

  @Test
  public void test0341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0341");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    java.lang.String str8 = gdbClusterApi4.reavpaString("path");
    java.lang.String str10 = gdbClusterApi4.reavpaString("character/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "character/cluster/cluster" + "'", str10,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0342");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugins");
    java.lang.String str15 = gdbClusterApi4.reavpaString("relationship/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("character/cluster/cluster");
    javax.ws.rs.core.Response response19 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "relationship/cluster/cluster" + "'",
        str15, "relationship/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "character/cluster/cluster/cluster" + "'", str18,
        "character/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0343");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
    javax.servlet.ServletRequest servletRequest14 = null;
    javax.servlet.ServletResponse servletResponse15 = null;
    javax.servlet.FilterChain filterChain16 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest14, servletResponse15,
          filterChain16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0344");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass15 = response14.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0345");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    java.util.regex.Pattern pattern5 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray6 = new java.util.regex.Pattern[]{pattern5};
    java.util.ArrayList<java.util.regex.Pattern> patternList7 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList7, patternArray6);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider9,
        authManagerSupplier10, webServer11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier14 = null;
    org.neo4j.server.web.WebServer webServer15 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl16 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider13,
        authManagerSupplier14, webServer15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier18 = null;
    org.neo4j.server.web.WebServer webServer19 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl20 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider17,
        authManagerSupplier18, webServer19);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider25,
        authManagerSupplier26, webServer27);
    java.lang.Class<?> wildcardClass29 = authorizationModuleEnterpriseImpl28.getClass();
    org.junit.Assert.assertNotNull(pattern5);
    org.junit.Assert.assertEquals(pattern5.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertNotNull(wildcardClass29);
  }

  @Test
  public void test0346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0346");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("dbms/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dbms/cluster/cluster" + "'", str6,
        "dbms/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0347");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0348");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    javax.servlet.ServletRequest servletRequest15 = null;
    javax.servlet.ServletResponse servletResponse16 = null;
    javax.servlet.FilterChain filterChain17 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest15, servletResponse16,
          filterChain17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0349");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0350");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0351");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0352");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0353");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest8 = null;
    javax.servlet.ServletResponse servletResponse9 = null;
    javax.servlet.FilterChain filterChain10 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest8, servletResponse9,
          filterChain10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0354");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0355");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("longs/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "longs/cluster/cluster" + "'", str11,
        "longs/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0356");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0357");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("map/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("byte/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass17 = response16.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster/cluster/cluster" + "'",
        str13, "map/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "byte/cluster/cluster/cluster" + "'",
        str15, "byte/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0358");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0359");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("character");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "character/cluster" + "'", str15,
        "character/cluster");
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0360");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0361");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("strings/cluster/cluster");
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str9, "strings/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0362");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0363");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    java.util.regex.Pattern pattern8 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray9 = new java.util.regex.Pattern[]{pattern8};
    java.util.ArrayList<java.util.regex.Pattern> patternList10 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList10, patternArray9);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider40,
        authManagerSupplier41, webServer42);
    authorizationModuleEnterpriseImpl43.stop();
    try {
      authorizationModuleEnterpriseImpl43.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern8);
    org.junit.Assert.assertEquals(pattern8.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0364");
    }
    org.neo4j.configuration.Config config0 = null;
    java.util.regex.Pattern[] patternArray1 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList2 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean3 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList2, patternArray1);
    org.neo4j.logging.LogProvider logProvider4 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier5 = null;
    org.neo4j.server.web.WebServer webServer6 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl7 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList2, logProvider4,
        authManagerSupplier5, webServer6);
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    authorizationModuleEnterpriseImpl7.stop();
    try {
      authorizationModuleEnterpriseImpl7.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0365");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0366");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0367");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "relationship-index/cluster" + "'",
        str17, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0368");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0369");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    org.neo4j.configuration.Config config8 = null;
    java.util.regex.Pattern pattern9 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray10 = new java.util.regex.Pattern[]{pattern9};
    java.util.ArrayList<java.util.regex.Pattern> patternList11 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList11, patternArray10);
    org.neo4j.logging.LogProvider logProvider13 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier14 = null;
    org.neo4j.server.web.WebServer webServer15 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl16 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider13,
        authManagerSupplier14, webServer15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier18 = null;
    org.neo4j.server.web.WebServer webServer19 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl20 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider17,
        authManagerSupplier18, webServer19);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider25,
        authManagerSupplier26, webServer27);
    org.neo4j.logging.LogProvider logProvider29 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier30 = null;
    org.neo4j.server.web.WebServer webServer31 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl32 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider29,
        authManagerSupplier30, webServer31);
    org.neo4j.logging.LogProvider logProvider33 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier34 = null;
    org.neo4j.server.web.WebServer webServer35 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl36 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider33,
        authManagerSupplier34, webServer35);
    org.neo4j.logging.LogProvider logProvider37 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier38 = null;
    org.neo4j.server.web.WebServer webServer39 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl40 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider37,
        authManagerSupplier38, webServer39);
    org.neo4j.logging.LogProvider logProvider41 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier42 = null;
    org.neo4j.server.web.WebServer webServer43 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl44 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider41,
        authManagerSupplier42, webServer43);
    org.neo4j.logging.LogProvider logProvider45 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier46 = null;
    org.neo4j.server.web.WebServer webServer47 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl48 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider45,
        authManagerSupplier46, webServer47);
    authorizationModuleEnterpriseImpl48.stop();
    try {
      authorizationModuleEnterpriseImpl48.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern9);
    org.junit.Assert.assertEquals(pattern9.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0370");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str16,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0371");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0372");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    java.lang.Class<?> wildcardClass12 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0373");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("graphdb");
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "graphdb/cluster" + "'", str6,
        "graphdb/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster/cluster" + "'", str8,
        "/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0374");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest6 = null;
    javax.servlet.ServletResponse servletResponse7 = null;
    javax.servlet.FilterChain filterChain8 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest6, servletResponse7,
          filterChain8);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0376");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integer/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integer/cluster/cluster/cluster" + "'",
        str6, "integer/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0377");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    java.util.regex.Pattern pattern7 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray8 = new java.util.regex.Pattern[]{pattern7};
    java.util.ArrayList<java.util.regex.Pattern> patternList9 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList9, patternArray8);
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier12 = null;
    org.neo4j.server.web.WebServer webServer13 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl14 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider11,
        authManagerSupplier12, webServer13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider35,
        authManagerSupplier36, webServer37);
    authorizationModuleEnterpriseImpl38.stop();
    try {
      authorizationModuleEnterpriseImpl38.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern7);
    org.junit.Assert.assertEquals(pattern7.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0378");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    java.lang.String str9 = gdbClusterApi4.reavpaString("uri");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster" + "'", str9, "uri/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0379");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "characters/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship-index/cluster/cluster");
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship-index/cluster/cluster/cluster" + "'", str6,
        "relationship-index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0380");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    java.util.regex.Pattern[] patternArray6 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList7 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean8 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList7, patternArray6);
    org.neo4j.logging.LogProvider logProvider9 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier10 = null;
    org.neo4j.server.web.WebServer webServer11 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl12 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider9,
        authManagerSupplier10, webServer11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier14 = null;
    org.neo4j.server.web.WebServer webServer15 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl16 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider13,
        authManagerSupplier14, webServer15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier18 = null;
    org.neo4j.server.web.WebServer webServer19 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl20 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider17,
        authManagerSupplier18, webServer19);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider25,
        authManagerSupplier26, webServer27);
    org.neo4j.logging.LogProvider logProvider29 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier30 = null;
    org.neo4j.server.web.WebServer webServer31 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl32 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList7, logProvider29,
        authManagerSupplier30, webServer31);
    authorizationModuleEnterpriseImpl32.stop();
    try {
      authorizationModuleEnterpriseImpl32.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0381");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest16 = null;
    javax.servlet.ServletResponse servletResponse17 = null;
    javax.servlet.FilterChain filterChain18 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest16, servletResponse17,
          filterChain18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0382");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0383");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    javax.servlet.ServletRequest servletRequest15 = null;
    javax.servlet.ServletResponse servletResponse16 = null;
    javax.servlet.FilterChain filterChain17 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest15, servletResponse16,
          filterChain17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0384");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("longs");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "longs/cluster" + "'", str12,
        "longs/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0385");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0386");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("float/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "float/cluster/cluster" + "'", str9,
        "float/cluster/cluster");
  }

  @Test
  public void test0387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0387");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0388");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("hi!");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!/cluster" + "'", str10,
        "hi!/cluster");
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0389");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "db/cluster/cluster" + "'", str8,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0390");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("longs/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "longs/cluster/cluster" + "'", str11,
        "longs/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str13, "relationship/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0391");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    java.util.regex.Pattern pattern7 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray8 = new java.util.regex.Pattern[]{pattern7};
    java.util.ArrayList<java.util.regex.Pattern> patternList9 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList9, patternArray8);
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier12 = null;
    org.neo4j.server.web.WebServer webServer13 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl14 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider11,
        authManagerSupplier12, webServer13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider35,
        authManagerSupplier36, webServer37);
    authorizationModuleEnterpriseImpl38.stop();
    java.lang.Class<?> wildcardClass40 = authorizationModuleEnterpriseImpl38.getClass();
    org.junit.Assert.assertNotNull(pattern7);
    org.junit.Assert.assertEquals(pattern7.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    org.junit.Assert.assertNotNull(wildcardClass40);
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0392");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0393");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("long");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long/cluster" + "'", str6,
        "long/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0394");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0395");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    javax.servlet.ServletRequest servletRequest12 = null;
    javax.servlet.ServletResponse servletResponse13 = null;
    javax.servlet.FilterChain filterChain14 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest12, servletResponse13,
          filterChain14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0396");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    org.neo4j.configuration.Config config8 = null;
    java.util.regex.Pattern[] patternArray9 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList10 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList10, patternArray9);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider40,
        authManagerSupplier41, webServer42);
    org.neo4j.logging.LogProvider logProvider44 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier45 = null;
    org.neo4j.server.web.WebServer webServer46 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl47 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider44,
        authManagerSupplier45, webServer46);
    try {
      authorizationModuleEnterpriseImpl47.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0397");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("plugin/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "plugin/cluster/cluster" + "'", str10,
        "plugin/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0398");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest7 = null;
    javax.servlet.ServletResponse servletResponse8 = null;
    javax.servlet.FilterChain filterChain9 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest7, servletResponse8,
          filterChain9);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0400");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass18 = response17.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0401");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    java.lang.String str10 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str10, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0402");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0403");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0404");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    javax.servlet.ServletRequest servletRequest16 = null;
    javax.servlet.ServletResponse servletResponse17 = null;
    javax.servlet.FilterChain filterChain18 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest16, servletResponse17,
          filterChain18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0405");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    java.lang.Class<?> wildcardClass7 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0406");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship-type");
    java.lang.String str8 = gdbClusterApi4.reavpaString("paths/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationship-type/cluster" + "'", str6,
        "relationship-type/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster/cluster/cluster" + "'",
        str8, "paths/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0407");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers/cluster/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("relationship-index/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "integers/cluster/cluster/cluster/cluster" + "'", str12,
        "integers/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "relationship-index/cluster/cluster" + "'", str14,
        "relationship-index/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0408");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0409");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str8,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0410");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0411");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0413");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster" + "'", str12,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0414");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugin/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0415");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass10 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0416");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("dbms/cluster");
    java.lang.String str18 = gdbClusterApi4.reavpaString("booleans");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "integers/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dbms/cluster/cluster" + "'", str16,
        "dbms/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "booleans/cluster" + "'", str18,
        "booleans/cluster");
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0417");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0418");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0419");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("map/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "map/cluster/cluster" + "'", str10,
        "map/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0420");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0421");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str13 = gdbClusterApi4.reavpaString("dbms/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "dbms/cluster/cluster/cluster" + "'",
        str13, "dbms/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0422");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0423");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0424");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0425");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0426");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0427");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0428");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    java.util.regex.Pattern pattern8 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray9 = new java.util.regex.Pattern[]{pattern8};
    java.util.ArrayList<java.util.regex.Pattern> patternList10 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean11 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList10, patternArray9);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList10, logProvider40,
        authManagerSupplier41, webServer42);
    authorizationModuleEnterpriseImpl43.stop();
    authorizationModuleEnterpriseImpl43.stop();
    try {
      authorizationModuleEnterpriseImpl43.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern8);
    org.junit.Assert.assertEquals(pattern8.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0429");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0430");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("");
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster" + "'", str7, "/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster");
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0431");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0432");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("paths");
    java.lang.String str10 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("floats");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster" + "'", str8,
        "paths/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str10,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "floats/cluster" + "'", str13,
        "floats/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0433");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    java.lang.String str8 = gdbClusterApi4.reavpaString("path");
    java.lang.String str10 = gdbClusterApi4.reavpaString("character/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "character/cluster/cluster" + "'", str10,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0434");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("bytes/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("hi!/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "bytes/cluster/cluster" + "'", str10,
        "bytes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster/cluster" + "'",
        str12, "hi!/cluster/cluster/cluster");
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0435");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0436");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0437");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0439");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    org.neo4j.configuration.Config config8 = null;
    org.neo4j.configuration.Config config9 = null;
    java.util.regex.Pattern[] patternArray10 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList11 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean12 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList11, patternArray10);
    org.neo4j.logging.LogProvider logProvider13 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier14 = null;
    org.neo4j.server.web.WebServer webServer15 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl16 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider13,
        authManagerSupplier14, webServer15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier18 = null;
    org.neo4j.server.web.WebServer webServer19 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl20 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider17,
        authManagerSupplier18, webServer19);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider25,
        authManagerSupplier26, webServer27);
    org.neo4j.logging.LogProvider logProvider29 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier30 = null;
    org.neo4j.server.web.WebServer webServer31 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl32 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider29,
        authManagerSupplier30, webServer31);
    org.neo4j.logging.LogProvider logProvider33 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier34 = null;
    org.neo4j.server.web.WebServer webServer35 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl36 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider33,
        authManagerSupplier34, webServer35);
    org.neo4j.logging.LogProvider logProvider37 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier38 = null;
    org.neo4j.server.web.WebServer webServer39 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl40 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider37,
        authManagerSupplier38, webServer39);
    org.neo4j.logging.LogProvider logProvider41 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier42 = null;
    org.neo4j.server.web.WebServer webServer43 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl44 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider41,
        authManagerSupplier42, webServer43);
    org.neo4j.logging.LogProvider logProvider45 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier46 = null;
    org.neo4j.server.web.WebServer webServer47 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl48 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider45,
        authManagerSupplier46, webServer47);
    org.neo4j.logging.LogProvider logProvider49 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier50 = null;
    org.neo4j.server.web.WebServer webServer51 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl52 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList11, logProvider49,
        authManagerSupplier50, webServer51);
    try {
      authorizationModuleEnterpriseImpl52.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray10);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test0440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0440");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0441");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("index/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "index/cluster/cluster/cluster" + "'",
        str13, "index/cluster/cluster/cluster");
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0442");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integer/cluster/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integer/cluster/cluster/cluster" + "'",
        str6, "integer/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str8, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0443");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("byte/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str10, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "byte/cluster/cluster/cluster" + "'",
        str12, "byte/cluster/cluster/cluster");
  }

  @Test
  public void test0444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0444");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest9 = null;
    javax.servlet.ServletResponse servletResponse10 = null;
    javax.servlet.FilterChain filterChain11 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest9, servletResponse10,
          filterChain11);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "properties/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0446");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0447");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest13 = null;
    javax.servlet.ServletResponse servletResponse14 = null;
    javax.servlet.FilterChain filterChain15 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest13, servletResponse14,
          filterChain15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0448");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship-type/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship-type/cluster/cluster" + "'", str11,
        "relationship-type/cluster/cluster");
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0450");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("short");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("node-index/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "node-index/cluster/cluster" + "'",
        str13, "node-index/cluster/cluster");
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0451");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0452");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integer/cluster/cluster");
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integer/cluster/cluster/cluster" + "'",
        str6, "integer/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0453");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("node-index/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "node-index/cluster/cluster" + "'",
        str12, "node-index/cluster/cluster");
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0454");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.ServletRequest servletRequest13 = null;
    javax.servlet.ServletResponse servletResponse14 = null;
    javax.servlet.FilterChain filterChain15 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest13, servletResponse14,
          filterChain15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0455");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("plugins/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("node-index");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "node-index/cluster" + "'", str11,
        "node-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0456");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig15 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig15);
    javax.servlet.ServletRequest servletRequest17 = null;
    javax.servlet.ServletResponse servletResponse18 = null;
    javax.servlet.FilterChain filterChain19 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest17, servletResponse18,
          filterChain19);
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
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0458");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0459");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str14,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0460");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    javax.servlet.FilterConfig filterConfig15 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig15);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest18 = null;
    javax.servlet.ServletResponse servletResponse19 = null;
    javax.servlet.FilterChain filterChain20 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest18, servletResponse19,
          filterChain20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0461");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("character");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("strings/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("shorts/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "strings/cluster/cluster" + "'", str14,
        "strings/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "shorts/cluster/cluster" + "'", str16,
        "shorts/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0462");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster" + "'", str6,
        "bytes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0463");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest10 = null;
    javax.servlet.ServletResponse servletResponse11 = null;
    javax.servlet.FilterChain filterChain12 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest10, servletResponse11,
          filterChain12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0464");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("hi!/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster" + "'", str12,
        "hi!/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0465");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("doubles");
    java.lang.String str12 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str14 = gdbClusterApi4.reavpaString("shorts/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass16 = response15.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster" + "'", str12,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "shorts/cluster/cluster/cluster" + "'",
        str14, "shorts/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0466");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integer/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0467");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("strings/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str8, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster" + "'", str10,
        "strings/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0468");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("byte");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "byte/cluster" + "'", str8,
        "byte/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0469");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "nodes/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0470");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0471");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0472");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0473");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("uri/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster/cluster" + "'", str9,
        "uri/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0474");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0475");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("map");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "map/cluster" + "'", str8, "map/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0476");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    org.neo4j.configuration.Config config8 = null;
    org.neo4j.configuration.Config config9 = null;
    java.util.regex.Pattern pattern10 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray11 = new java.util.regex.Pattern[]{pattern10};
    java.util.ArrayList<java.util.regex.Pattern> patternList12 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList12, patternArray11);
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier15 = null;
    org.neo4j.server.web.WebServer webServer16 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl17 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider14,
        authManagerSupplier15, webServer16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier19 = null;
    org.neo4j.server.web.WebServer webServer20 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl21 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider18,
        authManagerSupplier19, webServer20);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider50,
        authManagerSupplier51, webServer52);
    authorizationModuleEnterpriseImpl53.stop();
    try {
      authorizationModuleEnterpriseImpl53.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern10);
    org.junit.Assert.assertEquals(pattern10.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test0477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0477");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str7, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0478");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "characters", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0479");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest6 = null;
    javax.servlet.ServletResponse servletResponse7 = null;
    javax.servlet.FilterChain filterChain8 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest6, servletResponse7,
          filterChain8);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0481");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("short");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0482");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("shorts/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "shorts/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "shorts/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0483");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    org.neo4j.configuration.Config config8 = null;
    org.neo4j.configuration.Config config9 = null;
    java.util.regex.Pattern pattern10 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray11 = new java.util.regex.Pattern[]{pattern10};
    java.util.ArrayList<java.util.regex.Pattern> patternList12 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList12, patternArray11);
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier15 = null;
    org.neo4j.server.web.WebServer webServer16 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl17 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider14,
        authManagerSupplier15, webServer16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier19 = null;
    org.neo4j.server.web.WebServer webServer20 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl21 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider18,
        authManagerSupplier19, webServer20);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider50,
        authManagerSupplier51, webServer52);
    try {
      authorizationModuleEnterpriseImpl53.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern10);
    org.junit.Assert.assertEquals(pattern10.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0484");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest11 = null;
    javax.servlet.ServletResponse servletResponse12 = null;
    javax.servlet.FilterChain filterChain13 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest11, servletResponse12,
          filterChain13);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0485");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0486");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str10, "strings/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0487");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest5 = null;
    javax.servlet.ServletResponse servletResponse6 = null;
    javax.servlet.FilterChain filterChain7 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest5, servletResponse6,
          filterChain7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0488");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("relationship-type");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "relationship-type/cluster" + "'", str14,
        "relationship-type/cluster");
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0489");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugin", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0490");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str7, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0491");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0492");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest17 = null;
    javax.servlet.ServletResponse servletResponse18 = null;
    javax.servlet.FilterChain filterChain19 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest17, servletResponse18,
          filterChain19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0493");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0494");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("byte/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "byte/cluster/cluster/cluster/cluster" + "'", str6,
        "byte/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0495");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    java.util.regex.Pattern pattern7 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray8 = new java.util.regex.Pattern[]{pattern7};
    java.util.ArrayList<java.util.regex.Pattern> patternList9 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList9, patternArray8);
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier12 = null;
    org.neo4j.server.web.WebServer webServer13 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl14 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider11,
        authManagerSupplier12, webServer13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider35,
        authManagerSupplier36, webServer37);
    authorizationModuleEnterpriseImpl38.stop();
    authorizationModuleEnterpriseImpl38.stop();
    try {
      authorizationModuleEnterpriseImpl38.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern7);
    org.junit.Assert.assertEquals(pattern7.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0496");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    org.neo4j.configuration.Config config8 = null;
    org.neo4j.configuration.Config config9 = null;
    java.util.regex.Pattern pattern10 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray11 = new java.util.regex.Pattern[]{pattern10};
    java.util.ArrayList<java.util.regex.Pattern> patternList12 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList12, patternArray11);
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier15 = null;
    org.neo4j.server.web.WebServer webServer16 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl17 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider14,
        authManagerSupplier15, webServer16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier19 = null;
    org.neo4j.server.web.WebServer webServer20 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl21 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider18,
        authManagerSupplier19, webServer20);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider50,
        authManagerSupplier51, webServer52);
    authorizationModuleEnterpriseImpl53.stop();
    authorizationModuleEnterpriseImpl53.stop();
    authorizationModuleEnterpriseImpl53.stop();
    try {
      authorizationModuleEnterpriseImpl53.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern10);
    org.junit.Assert.assertEquals(pattern10.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
  }

  @Test
  public void test0497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0497");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("path/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "path/cluster/cluster/cluster" + "'",
        str6, "path/cluster/cluster/cluster");
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0498");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("characters");
    java.lang.String str11 = gdbClusterApi4.reavpaString("db/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "characters/cluster" + "'", str9,
        "characters/cluster");
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster" + "'", str11,
        "db/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0499");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    java.util.regex.Pattern pattern4 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray5 = new java.util.regex.Pattern[]{pattern4};
    java.util.ArrayList<java.util.regex.Pattern> patternList6 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean7 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList6, patternArray5);
    org.neo4j.logging.LogProvider logProvider8 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier9 = null;
    org.neo4j.server.web.WebServer webServer10 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl11 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider8,
        authManagerSupplier9, webServer10);
    org.neo4j.logging.LogProvider logProvider12 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier13 = null;
    org.neo4j.server.web.WebServer webServer14 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl15 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider12,
        authManagerSupplier13, webServer14);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList6, logProvider20,
        authManagerSupplier21, webServer22);
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    authorizationModuleEnterpriseImpl23.stop();
    try {
      authorizationModuleEnterpriseImpl23.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern4);
    org.junit.Assert.assertEquals(pattern4.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0500");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest12 = null;
    javax.servlet.ServletResponse servletResponse13 = null;
    javax.servlet.FilterChain filterChain14 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest12, servletResponse13,
          filterChain14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }
}

