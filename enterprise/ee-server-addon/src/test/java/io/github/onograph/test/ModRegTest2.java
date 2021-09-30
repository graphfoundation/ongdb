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
  public void test1002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1002");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    java.util.regex.Pattern pattern12 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray13 = new java.util.regex.Pattern[]{pattern12};
    java.util.ArrayList<java.util.regex.Pattern> patternList14 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList14, patternArray13);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider40,
        authManagerSupplier41, webServer42);
    org.neo4j.logging.LogProvider logProvider44 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier45 = null;
    org.neo4j.server.web.WebServer webServer46 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl47 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider44,
        authManagerSupplier45, webServer46);
    org.neo4j.logging.LogProvider logProvider48 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier49 = null;
    org.neo4j.server.web.WebServer webServer50 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl51 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider48,
        authManagerSupplier49, webServer50);
    org.neo4j.logging.LogProvider logProvider52 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier53 = null;
    org.neo4j.server.web.WebServer webServer54 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl55 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider52,
        authManagerSupplier53, webServer54);
    org.neo4j.logging.LogProvider logProvider56 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier57 = null;
    org.neo4j.server.web.WebServer webServer58 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl59 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider56,
        authManagerSupplier57, webServer58);
    org.neo4j.logging.LogProvider logProvider60 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier61 = null;
    org.neo4j.server.web.WebServer webServer62 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl63 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider60,
        authManagerSupplier61, webServer62);
    authorizationModuleEnterpriseImpl63.stop();
    try {
      authorizationModuleEnterpriseImpl63.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern12);
    org.junit.Assert.assertEquals(pattern12.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test1003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1003");
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
  public void test1004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1004");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1005");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
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
  public void test1006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1006");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1007");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString(
        "relationships/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "relationships/cluster/cluster/cluster/cluster/cluster" + "'",
        str18, "relationships/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1008");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("hi!");
    java.lang.String str9 = gdbClusterApi4.reavpaString("exception/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "exception/cluster/cluster" + "'", str9,
        "exception/cluster/cluster");
  }

  @Test
  public void test1009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1009");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "dbms/cluster/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster/cluster" + "'",
        str6, "relationship-type/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1010");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test1011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1011");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "string/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test1012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1012");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "map/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test1013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1013");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "byte/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test1014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1014");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "properties", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("characters/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "characters/cluster/cluster/cluster" + "'", str7,
        "characters/cluster/cluster/cluster");
  }

  @Test
  public void test1015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1015");
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
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    java.lang.Class<?> wildcardClass16 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test1016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1016");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("hi!");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!/cluster" + "'", str18,
        "hi!/cluster");
  }

  @Test
  public void test1017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1017");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str9,
        "/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1018");
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
  public void test1019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1019");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "exception", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1020");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str15, "relationship/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1021");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1022");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str16, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1023");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/cluster" + "'", str17, "/cluster");
  }

  @Test
  public void test1024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1024");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("booleans");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster/cluster" + "'", str8,
        "/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "booleans/cluster" + "'", str10,
        "booleans/cluster");
  }

  @Test
  public void test1025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1025");
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
    java.lang.String str19 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.wraeResponse();
    java.lang.String str22 = gdbClusterApi4.reavpaString("floats");
    javax.ws.rs.core.Response response23 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "nodes/cluster/cluster" + "'", str19,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response20);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "floats/cluster" + "'", str22,
        "floats/cluster");
    org.junit.Assert.assertNotNull(response23);
  }

  @Test
  public void test1026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1026");
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
    authorizationModuleEnterpriseImpl48.stop();
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
  public void test1027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1027");
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
  public void test1028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1028");
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
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass23 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test1029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1029");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1030");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("strings/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "strings/cluster/cluster" + "'", str11,
        "strings/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1031");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("path/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "path/cluster/cluster/cluster" + "'",
        str17, "path/cluster/cluster/cluster");
  }

  @Test
  public void test1032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1032");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.configuration.Config config14 = null;
    java.util.regex.Pattern pattern15 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray16 = new java.util.regex.Pattern[]{pattern15};
    java.util.ArrayList<java.util.regex.Pattern> patternList17 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList17, patternArray16);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider35,
        authManagerSupplier36, webServer37);
    org.neo4j.logging.LogProvider logProvider39 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier40 = null;
    org.neo4j.server.web.WebServer webServer41 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl42 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider39,
        authManagerSupplier40, webServer41);
    org.neo4j.logging.LogProvider logProvider43 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier44 = null;
    org.neo4j.server.web.WebServer webServer45 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl46 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider43,
        authManagerSupplier44, webServer45);
    org.neo4j.logging.LogProvider logProvider47 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier48 = null;
    org.neo4j.server.web.WebServer webServer49 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl50 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider47,
        authManagerSupplier48, webServer49);
    org.neo4j.logging.LogProvider logProvider51 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier52 = null;
    org.neo4j.server.web.WebServer webServer53 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl54 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider51,
        authManagerSupplier52, webServer53);
    org.neo4j.logging.LogProvider logProvider55 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier56 = null;
    org.neo4j.server.web.WebServer webServer57 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl58 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider55,
        authManagerSupplier56, webServer57);
    org.neo4j.logging.LogProvider logProvider59 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier60 = null;
    org.neo4j.server.web.WebServer webServer61 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl62 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider59,
        authManagerSupplier60, webServer61);
    org.neo4j.logging.LogProvider logProvider63 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier64 = null;
    org.neo4j.server.web.WebServer webServer65 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl66 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider63,
        authManagerSupplier64, webServer65);
    org.neo4j.logging.LogProvider logProvider67 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier68 = null;
    org.neo4j.server.web.WebServer webServer69 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl70 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider67,
        authManagerSupplier68, webServer69);
    org.neo4j.logging.LogProvider logProvider71 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier72 = null;
    org.neo4j.server.web.WebServer webServer73 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl74 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider71,
        authManagerSupplier72, webServer73);
    org.neo4j.logging.LogProvider logProvider75 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier76 = null;
    org.neo4j.server.web.WebServer webServer77 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl78 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider75,
        authManagerSupplier76, webServer77);
    try {
      authorizationModuleEnterpriseImpl78.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern15);
    org.junit.Assert.assertEquals(pattern15.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
  }

  @Test
  public void test1033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1033");
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
    authorizationModuleEnterpriseImpl28.stop();
    authorizationModuleEnterpriseImpl28.stop();
    authorizationModuleEnterpriseImpl28.stop();
    authorizationModuleEnterpriseImpl28.stop();
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
  public void test1034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1034");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("node");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "node/cluster" + "'", str13,
        "node/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test1035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1035");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings/cluster", outputFormat3);
  }

  @Test
  public void test1036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1036");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1037");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1038");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("db/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("short");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "short/cluster" + "'", str9,
        "short/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1039");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("uri/cluster/cluster/cluster/cluster");
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
        "'" + str16 + "' != '" + "uri/cluster/cluster/cluster/cluster/cluster" + "'", str16,
        "uri/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1040");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1041");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1042");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1043");
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
  public void test1044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1044");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1045");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-type/cluster/cluster/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1046");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    java.lang.String str19 = gdbClusterApi4.reavpaString("/cluster/cluster");
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
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/cluster/cluster/cluster" + "'", str19,
        "/cluster/cluster/cluster");
  }

  @Test
  public void test1047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1047");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass16 = response15.getClass();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test1048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1048");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1049");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1050");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1051");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("node-index/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "node-index/cluster/cluster/cluster" + "'", str9,
        "node-index/cluster/cluster/cluster");
  }

  @Test
  public void test1052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1052");
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
    authorizationModuleEnterpriseImpl17.stop();
    authorizationModuleEnterpriseImpl17.stop();
    authorizationModuleEnterpriseImpl17.stop();
    org.junit.Assert.assertNotNull(patternArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test1053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1053");
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
  public void test1054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1054");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
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
  public void test1055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1055");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("floats");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "floats/cluster" + "'", str7,
        "floats/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1056");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("paths/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("hi!/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "paths/cluster/cluster" + "'", str7,
        "paths/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "hi!/cluster/cluster/cluster/cluster" + "'", str9,
        "hi!/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1057");
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
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
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
  public void test1058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1058");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "dbms/cluster/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1059");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test1060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1060");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1061");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("long/cluster/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "map/cluster/cluster" + "'", str10,
        "map/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "long/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test1062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1062");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString(
        "character/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "character/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str9, "character/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1063");
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
  public void test1064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1064");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test1065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1065");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
  }

  @Test
  public void test1066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1066");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("short");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "short/cluster" + "'", str9,
        "short/cluster");
  }

  @Test
  public void test1067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1067");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test1068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1068");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("doubles");
    java.lang.String str15 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "doubles/cluster" + "'", str13,
        "doubles/cluster");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "graphdb/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "graphdb/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1069");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1070");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster/cluster");
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster/cluster" + "'", str8,
        "/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1071");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("long/cluster/cluster");
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster/cluster/cluster" + "'",
        str13, "map/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "long/cluster/cluster/cluster" + "'",
        str15, "long/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test1072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1072");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("relationships/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "character/cluster/cluster" + "'", str10,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "relationships/cluster/cluster/cluster" + "'", str14,
        "relationships/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1073");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1074");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("float/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "float/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "float/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1075");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1076");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster/cluster" + "'", str6,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1077");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("paths/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster/cluster" + "'", str8,
        "paths/cluster/cluster");
  }

  @Test
  public void test1078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1078");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    java.util.regex.Pattern pattern13 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray14 = new java.util.regex.Pattern[]{pattern13};
    java.util.ArrayList<java.util.regex.Pattern> patternList15 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList15, patternArray14);
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier18 = null;
    org.neo4j.server.web.WebServer webServer19 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl20 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider17,
        authManagerSupplier18, webServer19);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider25,
        authManagerSupplier26, webServer27);
    org.neo4j.logging.LogProvider logProvider29 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier30 = null;
    org.neo4j.server.web.WebServer webServer31 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl32 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider29,
        authManagerSupplier30, webServer31);
    org.neo4j.logging.LogProvider logProvider33 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier34 = null;
    org.neo4j.server.web.WebServer webServer35 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl36 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider33,
        authManagerSupplier34, webServer35);
    org.neo4j.logging.LogProvider logProvider37 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier38 = null;
    org.neo4j.server.web.WebServer webServer39 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl40 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider37,
        authManagerSupplier38, webServer39);
    org.neo4j.logging.LogProvider logProvider41 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier42 = null;
    org.neo4j.server.web.WebServer webServer43 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl44 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider41,
        authManagerSupplier42, webServer43);
    org.neo4j.logging.LogProvider logProvider45 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier46 = null;
    org.neo4j.server.web.WebServer webServer47 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl48 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider45,
        authManagerSupplier46, webServer47);
    org.neo4j.logging.LogProvider logProvider49 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier50 = null;
    org.neo4j.server.web.WebServer webServer51 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl52 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider49,
        authManagerSupplier50, webServer51);
    org.neo4j.logging.LogProvider logProvider53 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier54 = null;
    org.neo4j.server.web.WebServer webServer55 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl56 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider53,
        authManagerSupplier54, webServer55);
    org.neo4j.logging.LogProvider logProvider57 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier58 = null;
    org.neo4j.server.web.WebServer webServer59 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl60 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider57,
        authManagerSupplier58, webServer59);
    org.neo4j.logging.LogProvider logProvider61 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier62 = null;
    org.neo4j.server.web.WebServer webServer63 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl64 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider61,
        authManagerSupplier62, webServer63);
    org.neo4j.logging.LogProvider logProvider65 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier66 = null;
    org.neo4j.server.web.WebServer webServer67 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl68 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider65,
        authManagerSupplier66, webServer67);
    authorizationModuleEnterpriseImpl68.stop();
    try {
      authorizationModuleEnterpriseImpl68.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern13);
    org.junit.Assert.assertEquals(pattern13.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test1079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1079");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test1080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1080");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1081");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str8,
        "long/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1082");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "longs/cluster" + "'", str12,
        "longs/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str15, "nodes/cluster/cluster/cluster");
  }

  @Test
  public void test1083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1083");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("uri/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uri/cluster/cluster/cluster" + "'", str6,
        "uri/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1084");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
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
  public void test1085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1085");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("relationship-index");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "relationship-index/cluster" + "'", str8,
        "relationship-index/cluster");
  }

  @Test
  public void test1086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1086");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("index/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "index/cluster/cluster/cluster" + "'",
        str12, "index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1087");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    io.github.onograph.server.rest.cluster.DbmsApi dbmsApi1 = new io.github.onograph.server.rest.cluster.DbmsApi(
        databaseManagementService0);
    javax.ws.rs.core.Response response2 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response3 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response4 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response5 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response6 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response7 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response8 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response9 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response10 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response11 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response12 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response13 = dbmsApi1.sttResponse();
    javax.ws.rs.core.Response response14 = dbmsApi1.sttResponse();
    java.lang.Class<?> wildcardClass15 = dbmsApi1.getClass();
    org.junit.Assert.assertNotNull(response2);
    org.junit.Assert.assertNotNull(response3);
    org.junit.Assert.assertNotNull(response4);
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
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test1088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1088");
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
  public void test1089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1089");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str7,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "shorts/cluster" + "'", str10,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1090");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("uri");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uri/cluster" + "'", str13,
        "uri/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1091");
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
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
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
  public void test1092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1092");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1093");
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
  public void test1094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1094");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("long");
    java.lang.String str8 = gdbClusterApi4.reavpaString("bytes/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("exception/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long/cluster" + "'", str6,
        "long/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bytes/cluster/cluster/cluster" + "'",
        str8, "bytes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "exception/cluster/cluster" + "'", str11,
        "exception/cluster/cluster");
  }

  @Test
  public void test1095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1095");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("db/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("short");
    java.lang.String str11 = gdbClusterApi4.reavpaString("graphdb/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString("hi!/cluster/cluster/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "short/cluster" + "'", str9,
        "short/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster/cluster" + "'", str11,
        "graphdb/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "hi!/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "hi!/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str15, "booleans/cluster/cluster/cluster");
  }

  @Test
  public void test1096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1096");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("map/cluster/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "map/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1097");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("character/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plugins/cluster" + "'", str6,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "character/cluster/cluster/cluster/cluster" + "'", str9,
        "character/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1098");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1099");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship-type");
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationship-type/cluster" + "'", str6,
        "relationship-type/cluster");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1100");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test1101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1101");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1102");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1103");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'",
        str16, "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test1104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1104");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("dbms/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("properties");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dbms/cluster/cluster" + "'", str6,
        "dbms/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "properties/cluster" + "'", str9,
        "properties/cluster");
  }

  @Test
  public void test1105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1105");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "string/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("long/cluster/cluster/cluster/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "long/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster" + "'", str8,
        "nodes/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1106");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("map/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "map/cluster/cluster" + "'", str7,
        "map/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1107");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1108");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("map/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "map/cluster/cluster/cluster" + "'",
        str14, "map/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1109");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test1110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1110");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster" + "'", str12,
        "hi!/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1111");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("characters");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "characters/cluster" + "'", str15,
        "characters/cluster");
  }

  @Test
  public void test1112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1112");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("bytes");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString(
        "integer/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "bytes/cluster" + "'", str15,
        "bytes/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "integer/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str18, "integer/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1113");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("uri");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uri/cluster" + "'", str13,
        "uri/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1114");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1115");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
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
  public void test1116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1116");
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
    org.neo4j.server.rest.repr.RepresentationType representationType11 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType12 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType13 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType14 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType15 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType16 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType17 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType18 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType19 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType20 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType21 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType22 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType23 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType24 = representation0.getRepresentationType();
    java.lang.Class<?> wildcardClass25 = representation0.getClass();
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
    org.junit.Assert.assertNull(representationType11);
    org.junit.Assert.assertNull(representationType12);
    org.junit.Assert.assertNull(representationType13);
    org.junit.Assert.assertNull(representationType14);
    org.junit.Assert.assertNull(representationType15);
    org.junit.Assert.assertNull(representationType16);
    org.junit.Assert.assertNull(representationType17);
    org.junit.Assert.assertNull(representationType18);
    org.junit.Assert.assertNull(representationType19);
    org.junit.Assert.assertNull(representationType20);
    org.junit.Assert.assertNull(representationType21);
    org.junit.Assert.assertNull(representationType22);
    org.junit.Assert.assertNull(representationType23);
    org.junit.Assert.assertNull(representationType24);
    org.junit.Assert.assertNotNull(wildcardClass25);
  }

  @Test
  public void test1117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1117");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("bytes/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bytes/cluster/cluster/cluster" + "'",
        str8, "bytes/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str10, "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1118");
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
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
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
  public void test1119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1119");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("path/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "path/cluster/cluster" + "'", str15,
        "path/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1120");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1121");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("integer/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "integer/cluster/cluster/cluster/cluster" + "'", str12,
        "integer/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1122");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str11, "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1123");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("shorts/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "shorts/cluster/cluster/cluster" + "'",
        str12, "shorts/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1124");
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
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass20 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test1125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1125");
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
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster/cluster" + "'", str9,
        "uri/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test1126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1126");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("graphdb");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "graphdb/cluster" + "'", str6,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1127");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("longs");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "longs/cluster" + "'", str16,
        "longs/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test1128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1128");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1129");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "character/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test1130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1130");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1131");
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
  public void test1132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1132");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1133");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("longs");
    java.lang.String str14 = gdbClusterApi4.reavpaString("character");
    java.lang.String str16 = gdbClusterApi4.reavpaString("plugins");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "longs/cluster" + "'", str12,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "character/cluster" + "'", str14,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "plugins/cluster" + "'", str16,
        "plugins/cluster");
  }

  @Test
  public void test1134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1134");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("uri/cluster/cluster/cluster");
    javax.ws.rs.core.Response response19 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "uri/cluster/cluster/cluster/cluster" + "'", str18,
        "uri/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test1135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1135");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integer");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    java.lang.String str12 = gdbClusterApi4.reavpaString("uri/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster" + "'", str7,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uri/cluster/cluster" + "'", str12,
        "uri/cluster/cluster");
  }

  @Test
  public void test1136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1136");
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
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
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
  public void test1137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1137");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1138");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("strings/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str8, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "strings/cluster/cluster" + "'", str10,
        "strings/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1139");
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
    org.neo4j.server.rest.repr.RepresentationType representationType11 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType12 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType13 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType14 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType15 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType16 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType17 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType18 = representation0.getRepresentationType();
    org.neo4j.server.rest.repr.RepresentationType representationType19 = representation0.getRepresentationType();
    java.lang.Class<?> wildcardClass20 = representation0.getClass();
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
    org.junit.Assert.assertNull(representationType11);
    org.junit.Assert.assertNull(representationType12);
    org.junit.Assert.assertNull(representationType13);
    org.junit.Assert.assertNull(representationType14);
    org.junit.Assert.assertNull(representationType15);
    org.junit.Assert.assertNull(representationType16);
    org.junit.Assert.assertNull(representationType17);
    org.junit.Assert.assertNull(representationType18);
    org.junit.Assert.assertNull(representationType19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test1140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1140");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test1141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1141");
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
  public void test1142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1142");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("nodes/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("index/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster" + "'", str10,
        "nodes/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "index/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "index/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1143");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster" + "'", str6,
        "bytes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1144");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("path");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "path/cluster" + "'", str13,
        "path/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1145");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1146");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str8,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1147");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test1148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1148");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationship-type/cluster/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString("byte/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("boolean/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship-type/cluster/cluster/cluster" + "'", str11,
        "relationship-type/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "byte/cluster/cluster/cluster" + "'",
        str13, "byte/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "boolean/cluster/cluster/cluster/cluster" + "'", str15,
        "boolean/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1149");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test1150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1150");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1151");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("characters/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "characters/cluster/cluster" + "'", str6,
        "characters/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1152");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
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
  public void test1153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1153");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("properties");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "properties/cluster" + "'", str6,
        "properties/cluster");
  }

  @Test
  public void test1154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1154");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("string/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("paths");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "string/cluster/cluster/cluster" + "'",
        str8, "string/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "paths/cluster" + "'", str11,
        "paths/cluster");
  }

  @Test
  public void test1155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1155");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "map", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationships");
    java.lang.String str8 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationships/cluster" + "'", str6,
        "relationships/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str8, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1156");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("db/cluster/cluster");
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster/cluster" + "'",
        str10, "db/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test1157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1157");
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
  public void test1158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1158");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
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
  }

  @Test
  public void test1159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1159");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("characters");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "characters/cluster" + "'", str11,
        "characters/cluster");
  }

  @Test
  public void test1160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1160");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'",
        str16, "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test1161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1161");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("hi!/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!/cluster/cluster/cluster" + "'", str6,
        "hi!/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1162");
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
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster" + "'", str12,
        "hi!/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test1163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1163");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("shorts/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "shorts/cluster/cluster/cluster" + "'",
        str6, "shorts/cluster/cluster/cluster");
  }

  @Test
  public void test1164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1164");
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
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1165");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig5 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig5);
    javax.servlet.FilterConfig filterConfig7 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig7);
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1166");
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
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
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
  public void test1167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1167");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("path");
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationships/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "path/cluster" + "'", str10,
        "path/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationships/cluster/cluster/cluster" + "'", str12,
        "relationships/cluster/cluster/cluster");
  }

  @Test
  public void test1168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1168");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("node-index");
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "node-index/cluster" + "'", str14,
        "node-index/cluster");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test1169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1169");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("string/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "string/cluster/cluster/cluster/cluster" + "'", str10,
        "string/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1170");
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
  public void test1171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1171");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1172");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
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
  public void test1173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1173");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test1174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1174");
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
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
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
  public void test1175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1175");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
    javax.servlet.FilterConfig filterConfig20 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig20);
    javax.servlet.FilterConfig filterConfig22 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig22);
    javax.servlet.ServletRequest servletRequest24 = null;
    javax.servlet.ServletResponse servletResponse25 = null;
    javax.servlet.FilterChain filterChain26 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest24, servletResponse25,
          filterChain26);
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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str7, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1177");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("bytes/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "uri/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bytes/cluster/cluster" + "'", str14,
        "bytes/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "uri/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str16, "uri/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1178");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str8,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1179");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1180");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
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
  public void test1181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1181");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test1182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1182");
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
    authorizationModuleEnterpriseImpl33.stop();
    authorizationModuleEnterpriseImpl33.stop();
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
  public void test1183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1183");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1184");
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
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
  public void test1185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1185");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster" + "'", str6,
        "bytes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1186");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("characters/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "characters/cluster/cluster/cluster" + "'", str7,
        "characters/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1187");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1188");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1189");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1190");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
    java.lang.Class<?> wildcardClass10 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1191");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test1192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1192");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test1193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1193");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster" + "'", str13,
        "map/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str16, "/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1194");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "dbms/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "dbms/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1195");
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
  public void test1196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1196");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("exception/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "exception/cluster/cluster/cluster/cluster" + "'", str12,
        "exception/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1197");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.configuration.Config config13 = null;
    java.util.regex.Pattern pattern14 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray15 = new java.util.regex.Pattern[]{pattern14};
    java.util.ArrayList<java.util.regex.Pattern> patternList16 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList16, patternArray15);
    org.neo4j.logging.LogProvider logProvider18 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier19 = null;
    org.neo4j.server.web.WebServer webServer20 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl21 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider18,
        authManagerSupplier19, webServer20);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider50,
        authManagerSupplier51, webServer52);
    org.neo4j.logging.LogProvider logProvider54 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier55 = null;
    org.neo4j.server.web.WebServer webServer56 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl57 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider54,
        authManagerSupplier55, webServer56);
    org.neo4j.logging.LogProvider logProvider58 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier59 = null;
    org.neo4j.server.web.WebServer webServer60 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl61 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider58,
        authManagerSupplier59, webServer60);
    org.neo4j.logging.LogProvider logProvider62 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier63 = null;
    org.neo4j.server.web.WebServer webServer64 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl65 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider62,
        authManagerSupplier63, webServer64);
    org.neo4j.logging.LogProvider logProvider66 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier67 = null;
    org.neo4j.server.web.WebServer webServer68 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl69 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider66,
        authManagerSupplier67, webServer68);
    org.neo4j.logging.LogProvider logProvider70 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier71 = null;
    org.neo4j.server.web.WebServer webServer72 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl73 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList16, logProvider70,
        authManagerSupplier71, webServer72);
    try {
      authorizationModuleEnterpriseImpl73.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern14);
    org.junit.Assert.assertEquals(pattern14.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
  }

  @Test
  public void test1198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1198");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1199");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1200");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integer/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("boolean/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster/cluster" + "'", str7,
        "integer/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean/cluster/cluster/cluster" + "'",
        str10, "boolean/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1201");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("strings/cluster/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str9, "strings/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "nodes/cluster/cluster" + "'", str11,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1202");
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
  public void test1203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1203");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1204");
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
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
    javax.servlet.ServletRequest servletRequest20 = null;
    javax.servlet.ServletResponse servletResponse21 = null;
    javax.servlet.FilterChain filterChain22 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest20, servletResponse21,
          filterChain22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1205");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("paths/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "paths/cluster/cluster" + "'", str13,
        "paths/cluster/cluster");
  }

  @Test
  public void test1206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1206");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test1207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1207");
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
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
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
  public void test1208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1208");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
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
  }

  @Test
  public void test1209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1209");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster" + "'", str10,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1210");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
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
  public void test1211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1211");
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
  public void test1212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1212");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster/cluster" + "'", str8,
        "/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1213");
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
  public void test1214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1214");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integers/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "integers/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1215");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("path/cluster");
    java.lang.String str17 = gdbClusterApi4.reavpaString("strings/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "path/cluster/cluster" + "'", str15,
        "path/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "strings/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1216");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "nodes/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str6, "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1217");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-type/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-type/cluster/cluster" + "'",
        str7, "relationship-type/cluster/cluster");
  }

  @Test
  public void test1218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1218");
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
    javax.servlet.FilterConfig filterConfig11 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig11);
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1219");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("shorts/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "shorts/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "shorts/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1220");
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
  public void test1221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1221");
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
  public void test1222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1222");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test1223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1223");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.configuration.Config config14 = null;
    org.neo4j.configuration.Config config15 = null;
    java.util.regex.Pattern pattern16 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray17 = new java.util.regex.Pattern[]{pattern16};
    java.util.ArrayList<java.util.regex.Pattern> patternList18 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList18, patternArray17);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config15, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider40,
        authManagerSupplier41, webServer42);
    org.neo4j.logging.LogProvider logProvider44 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier45 = null;
    org.neo4j.server.web.WebServer webServer46 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl47 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider44,
        authManagerSupplier45, webServer46);
    org.neo4j.logging.LogProvider logProvider48 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier49 = null;
    org.neo4j.server.web.WebServer webServer50 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl51 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider48,
        authManagerSupplier49, webServer50);
    org.neo4j.logging.LogProvider logProvider52 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier53 = null;
    org.neo4j.server.web.WebServer webServer54 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl55 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider52,
        authManagerSupplier53, webServer54);
    org.neo4j.logging.LogProvider logProvider56 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier57 = null;
    org.neo4j.server.web.WebServer webServer58 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl59 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider56,
        authManagerSupplier57, webServer58);
    org.neo4j.logging.LogProvider logProvider60 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier61 = null;
    org.neo4j.server.web.WebServer webServer62 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl63 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider60,
        authManagerSupplier61, webServer62);
    org.neo4j.logging.LogProvider logProvider64 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier65 = null;
    org.neo4j.server.web.WebServer webServer66 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl67 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider64,
        authManagerSupplier65, webServer66);
    org.neo4j.logging.LogProvider logProvider68 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier69 = null;
    org.neo4j.server.web.WebServer webServer70 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl71 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider68,
        authManagerSupplier69, webServer70);
    org.neo4j.logging.LogProvider logProvider72 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier73 = null;
    org.neo4j.server.web.WebServer webServer74 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl75 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider72,
        authManagerSupplier73, webServer74);
    org.neo4j.logging.LogProvider logProvider76 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier77 = null;
    org.neo4j.server.web.WebServer webServer78 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl79 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider76,
        authManagerSupplier77, webServer78);
    org.neo4j.logging.LogProvider logProvider80 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier81 = null;
    org.neo4j.server.web.WebServer webServer82 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl83 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider80,
        authManagerSupplier81, webServer82);
    try {
      authorizationModuleEnterpriseImpl83.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern16);
    org.junit.Assert.assertEquals(pattern16.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test1224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1224");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("plugins");
    java.lang.String str16 = gdbClusterApi4.reavpaString("boolean/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "plugins/cluster" + "'", str14,
        "plugins/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "boolean/cluster/cluster/cluster/cluster" + "'", str16,
        "boolean/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1225");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1226");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("character/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "character/cluster/cluster/cluster/cluster" + "'", str12,
        "character/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1227");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("path/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "path/cluster/cluster/cluster" + "'",
        str7, "path/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1228");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1229");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("plugins/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster" + "'", str11, "/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str14, "nodes/cluster/cluster/cluster");
  }

  @Test
  public void test1230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1230");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster" + "'", str13,
        "map/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str16, "strings/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1231");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1232");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "relationship/cluster/cluster" + "'",
        str12, "relationship/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1233");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.configuration.Config config14 = null;
    org.neo4j.configuration.Config config15 = null;
    org.neo4j.configuration.Config config16 = null;
    org.neo4j.configuration.Config config17 = null;
    java.util.regex.Pattern[] patternArray18 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList19 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList19, patternArray18);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config17, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config16, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider25,
        authManagerSupplier26, webServer27);
    org.neo4j.logging.LogProvider logProvider29 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier30 = null;
    org.neo4j.server.web.WebServer webServer31 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl32 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config15, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider29,
        authManagerSupplier30, webServer31);
    org.neo4j.logging.LogProvider logProvider33 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier34 = null;
    org.neo4j.server.web.WebServer webServer35 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl36 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider33,
        authManagerSupplier34, webServer35);
    org.neo4j.logging.LogProvider logProvider37 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier38 = null;
    org.neo4j.server.web.WebServer webServer39 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl40 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider37,
        authManagerSupplier38, webServer39);
    org.neo4j.logging.LogProvider logProvider41 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier42 = null;
    org.neo4j.server.web.WebServer webServer43 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl44 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider41,
        authManagerSupplier42, webServer43);
    org.neo4j.logging.LogProvider logProvider45 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier46 = null;
    org.neo4j.server.web.WebServer webServer47 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl48 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider45,
        authManagerSupplier46, webServer47);
    org.neo4j.logging.LogProvider logProvider49 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier50 = null;
    org.neo4j.server.web.WebServer webServer51 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl52 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider49,
        authManagerSupplier50, webServer51);
    org.neo4j.logging.LogProvider logProvider53 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier54 = null;
    org.neo4j.server.web.WebServer webServer55 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl56 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider53,
        authManagerSupplier54, webServer55);
    org.neo4j.logging.LogProvider logProvider57 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier58 = null;
    org.neo4j.server.web.WebServer webServer59 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl60 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider57,
        authManagerSupplier58, webServer59);
    org.neo4j.logging.LogProvider logProvider61 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier62 = null;
    org.neo4j.server.web.WebServer webServer63 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl64 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider61,
        authManagerSupplier62, webServer63);
    org.neo4j.logging.LogProvider logProvider65 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier66 = null;
    org.neo4j.server.web.WebServer webServer67 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl68 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider65,
        authManagerSupplier66, webServer67);
    org.neo4j.logging.LogProvider logProvider69 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier70 = null;
    org.neo4j.server.web.WebServer webServer71 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl72 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider69,
        authManagerSupplier70, webServer71);
    org.neo4j.logging.LogProvider logProvider73 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier74 = null;
    org.neo4j.server.web.WebServer webServer75 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl76 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider73,
        authManagerSupplier74, webServer75);
    org.neo4j.logging.LogProvider logProvider77 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier78 = null;
    org.neo4j.server.web.WebServer webServer79 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl80 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider77,
        authManagerSupplier78, webServer79);
    org.neo4j.logging.LogProvider logProvider81 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier82 = null;
    org.neo4j.server.web.WebServer webServer83 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl84 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider81,
        authManagerSupplier82, webServer83);
    org.neo4j.logging.LogProvider logProvider85 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier86 = null;
    org.neo4j.server.web.WebServer webServer87 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl88 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider85,
        authManagerSupplier86, webServer87);
    org.neo4j.logging.LogProvider logProvider89 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier90 = null;
    org.neo4j.server.web.WebServer webServer91 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl92 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider89,
        authManagerSupplier90, webServer91);
    try {
      authorizationModuleEnterpriseImpl92.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
  }

  @Test
  public void test1234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1234");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1235");
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
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
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
  public void test1236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1236");
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
  public void test1237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1237");
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
  public void test1238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1238");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test1239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1239");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "uri/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test1240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1240");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test1241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1241");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("longs/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("floats");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "longs/cluster/cluster" + "'", str14,
        "longs/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "floats/cluster" + "'", str17,
        "floats/cluster");
  }

  @Test
  public void test1242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1242");
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
  public void test1243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1243");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("path/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "path/cluster/cluster" + "'", str15,
        "path/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1244");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
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
  public void test1245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1245");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
  }

  @Test
  public void test1246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1246");
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
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1247");
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
  public void test1248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1248");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("db/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("short");
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "short/cluster" + "'", str9,
        "short/cluster");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1249");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
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
  public void test1250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1250");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1251");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1252");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("dbms/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str17 = gdbClusterApi4.reavpaString("long/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.diceResponse();
    java.lang.String str20 = gdbClusterApi4.reavpaString("byte/cluster");
    javax.ws.rs.core.Response response21 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "dbms/cluster/cluster/cluster" + "'",
        str13, "dbms/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str15, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long/cluster/cluster/cluster" + "'",
        str17, "long/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "byte/cluster/cluster" + "'", str20,
        "byte/cluster/cluster");
    org.junit.Assert.assertNotNull(response21);
  }

  @Test
  public void test1253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1253");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("paths/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("index/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "paths/cluster/cluster/cluster/cluster" + "'", str8,
        "paths/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index/cluster/cluster/cluster" + "'",
        str11, "index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1254");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
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
  public void test1255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1255");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("character/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("hi!/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "character/cluster/cluster" + "'", str8,
        "character/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!/cluster/cluster/cluster" + "'",
        str10, "hi!/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster" + "'", str12,
        "integers/cluster");
  }

  @Test
  public void test1256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1256");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/cluster" + "'", str15, "/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1257");
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
  public void test1258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1258");
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
    authorizationModuleEnterpriseImpl52.stop();
    authorizationModuleEnterpriseImpl52.stop();
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
  public void test1259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1259");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1260");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("byte/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "byte/cluster/cluster/cluster/cluster" + "'", str16,
        "byte/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1261");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-type/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-type/cluster/cluster" + "'", str12,
        "relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1262");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1263");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str11,
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1264");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
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
  public void test1265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1265");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1266");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "index/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1267");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str16, "integers/cluster/cluster/cluster");
  }

  @Test
  public void test1268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1268");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString("relationships/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("characters");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationships/cluster/cluster/cluster" + "'", str10,
        "relationships/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "characters/cluster" + "'", str12,
        "characters/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1269");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "db/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test1270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1270");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster" + "'", str10,
        "nodes/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1271");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "floats/cluster/cluster", outputFormat3);
  }

  @Test
  public void test1272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1272");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
  }

  @Test
  public void test1273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1273");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "index/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1274");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("integer/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "integer/cluster/cluster/cluster" + "'",
        str9, "integer/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1275");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
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
  public void test1276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1276");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str6, "relationship/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1277");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "uri/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "uri/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str14, "uri/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1278");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test1279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1279");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("exception/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster/cluster" + "'", str7,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "exception/cluster/cluster" + "'", str11,
        "exception/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1280");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "uri/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "uri/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "uri/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1281");
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
    java.lang.Class<?> wildcardClass10 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1282");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1283");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test1284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1284");
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
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1285");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test1286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1286");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "hi!/cluster/cluster/cluster",
        outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1287");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "hi!/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
  }

  @Test
  public void test1288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1288");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-type/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-type/cluster/cluster" + "'", str12,
        "relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1289");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1290");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str16, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1291");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("shorts/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "shorts/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "shorts/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1292");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "integer/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1293");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "shorts/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test1294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1294");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("float");
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "float/cluster" + "'", str10,
        "float/cluster");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test1295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1295");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1296");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "map/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("plugins/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plugins/cluster/cluster" + "'", str6,
        "plugins/cluster/cluster");
  }

  @Test
  public void test1297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1297");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "db/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1298");
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
    javax.ws.rs.core.Response response19 = gdbClusterApi4.avllResponse();
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
  public void test1299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1299");
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
  public void test1300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1300");
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
    authorizationModuleEnterpriseImpl28.stop();
    authorizationModuleEnterpriseImpl28.stop();
    authorizationModuleEnterpriseImpl28.stop();
    authorizationModuleEnterpriseImpl28.stop();
    authorizationModuleEnterpriseImpl28.stop();
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
  public void test1301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1301");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
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
  public void test1302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1302");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster/cluster" + "'", str6,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1303");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "nodes/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1304");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "string/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '"
            + "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1305");
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
  public void test1306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1306");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationships/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationships/cluster/cluster" + "'",
        str6, "relationships/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test1307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1307");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str6,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1308");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("strings/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("exception/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str8, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "strings/cluster/cluster" + "'", str10,
        "strings/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "exception/cluster/cluster/cluster/cluster" + "'", str12,
        "exception/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1309");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test1310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1310");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("properties");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "properties/cluster" + "'", str14,
        "properties/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1311");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
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
  public void test1312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1312");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    java.util.regex.Pattern pattern12 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray13 = new java.util.regex.Pattern[]{pattern12};
    java.util.ArrayList<java.util.regex.Pattern> patternList14 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList14, patternArray13);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider40,
        authManagerSupplier41, webServer42);
    org.neo4j.logging.LogProvider logProvider44 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier45 = null;
    org.neo4j.server.web.WebServer webServer46 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl47 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider44,
        authManagerSupplier45, webServer46);
    org.neo4j.logging.LogProvider logProvider48 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier49 = null;
    org.neo4j.server.web.WebServer webServer50 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl51 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider48,
        authManagerSupplier49, webServer50);
    org.neo4j.logging.LogProvider logProvider52 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier53 = null;
    org.neo4j.server.web.WebServer webServer54 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl55 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider52,
        authManagerSupplier53, webServer54);
    org.neo4j.logging.LogProvider logProvider56 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier57 = null;
    org.neo4j.server.web.WebServer webServer58 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl59 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider56,
        authManagerSupplier57, webServer58);
    org.neo4j.logging.LogProvider logProvider60 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier61 = null;
    org.neo4j.server.web.WebServer webServer62 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl63 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider60,
        authManagerSupplier61, webServer62);
    authorizationModuleEnterpriseImpl63.stop();
    authorizationModuleEnterpriseImpl63.stop();
    try {
      authorizationModuleEnterpriseImpl63.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern12);
    org.junit.Assert.assertEquals(pattern12.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
  }

  @Test
  public void test1313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1313");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("shorts/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "shorts/cluster/cluster/cluster/cluster" + "'", str13,
        "shorts/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1314");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    java.lang.String str10 = gdbClusterApi4.reavpaString("integer");
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("hi!/cluster");
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster");
    java.lang.String str19 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer/cluster" + "'", str10,
        "integer/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster/cluster" + "'", str12,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!/cluster/cluster" + "'", str15,
        "hi!/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster" + "'", str17,
        "relationship-type/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str19 + "' != '"
            + "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str19, "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test1315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1315");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "nodes/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str13, "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1316");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1317");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest19 = null;
    javax.servlet.ServletResponse servletResponse20 = null;
    javax.servlet.FilterChain filterChain21 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest19, servletResponse20,
          filterChain21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1318");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str8,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1319");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1320");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1321");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    java.lang.String str19 = gdbClusterApi4.reavpaString("long/cluster");
    java.lang.String str21 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response22 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str17,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "long/cluster/cluster" + "'", str19,
        "long/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "plugins/cluster" + "'", str21,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response22);
  }

  @Test
  public void test1322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1322");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString("character/cluster/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str6,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "character/cluster/cluster/cluster/cluster" + "'", str10,
        "character/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1323");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("strings/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString("relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "strings/cluster/cluster" + "'", str11,
        "strings/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "relationship-type/cluster/cluster/cluster" + "'", str13,
        "relationship-type/cluster/cluster/cluster");
  }

  @Test
  public void test1324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1324");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("");
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/cluster" + "'", str18, "/cluster");
  }

  @Test
  public void test1325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1325");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("plugins/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("path/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "path/cluster/cluster" + "'", str11,
        "path/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1326");
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
  public void test1327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1327");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "map/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str16, "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1328");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/cluster/cluster/cluster" + "'", str16,
        "/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1329");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1330");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integer");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    java.lang.String str12 = gdbClusterApi4.reavpaString("hi!/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass14 = response13.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster" + "'", str7,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster" + "'", str12,
        "hi!/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test1331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1331");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("path/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "path/cluster/cluster" + "'", str9,
        "path/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str13,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "graphdb/cluster/cluster/cluster/cluster/cluster" + "'", str18,
        "graphdb/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1332");
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
  public void test1333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1333");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1334");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "doubles/cluster/cluster" + "'", str11,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1335");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    java.lang.String str10 = gdbClusterApi4.reavpaString("integer");
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("hi!/cluster");
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer/cluster" + "'", str10,
        "integer/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster/cluster" + "'", str12,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!/cluster/cluster" + "'", str15,
        "hi!/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster" + "'", str17,
        "relationship-type/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test1336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1336");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster/cluster" + "'",
        str17, "relationship-type/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1337");
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
  public void test1338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1338");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri-template", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("byte/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "byte/cluster/cluster/cluster/cluster" + "'", str8,
        "byte/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1339");
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
  public void test1340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1340");
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
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1341");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("dbms/cluster/cluster");
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
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dbms/cluster/cluster/cluster" + "'",
        str16, "dbms/cluster/cluster/cluster");
  }

  @Test
  public void test1342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1342");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationships/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationships/cluster/cluster" + "'",
        str6, "relationships/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1343");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "hi!/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1344");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test1345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1345");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test1346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1346");
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
    org.neo4j.configuration.Config config10 = null;
    java.util.regex.Pattern[] patternArray11 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList12 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean13 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList12, patternArray11);
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier15 = null;
    org.neo4j.server.web.WebServer webServer16 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl17 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider14,
        authManagerSupplier15, webServer16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier19 = null;
    org.neo4j.server.web.WebServer webServer20 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl21 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider18,
        authManagerSupplier19, webServer20);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider50,
        authManagerSupplier51, webServer52);
    org.neo4j.logging.LogProvider logProvider54 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier55 = null;
    org.neo4j.server.web.WebServer webServer56 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl57 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList12, logProvider54,
        authManagerSupplier55, webServer56);
    authorizationModuleEnterpriseImpl57.stop();
    authorizationModuleEnterpriseImpl57.stop();
    authorizationModuleEnterpriseImpl57.stop();
    java.lang.Class<?> wildcardClass61 = authorizationModuleEnterpriseImpl57.getClass();
    org.junit.Assert.assertNotNull(patternArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(wildcardClass61);
  }

  @Test
  public void test1347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1347");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("graphdb");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "graphdb/cluster" + "'", str13,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1348");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str13, "/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1349");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1350");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("dbms/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dbms/cluster/cluster" + "'", str14,
        "dbms/cluster/cluster");
  }

  @Test
  public void test1351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1351");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("doubles");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test1352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1352");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
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
  public void test1353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1353");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1354");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationships");
    java.lang.String str14 = gdbClusterApi4.reavpaString("string/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "relationships/cluster" + "'", str12,
        "relationships/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "string/cluster/cluster" + "'", str14,
        "string/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1355");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str7, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster/cluster" + "'", str11,
        "/cluster/cluster");
  }

  @Test
  public void test1356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1356");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass16 = response15.getClass();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test1357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1357");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass20 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test1358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1358");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("doubles/cluster/cluster");
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str15, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test1359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1359");
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
  public void test1360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1360");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
  }

  @Test
  public void test1361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1361");
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
    authorizationModuleEnterpriseImpl52.stop();
    authorizationModuleEnterpriseImpl52.stop();
    authorizationModuleEnterpriseImpl52.stop();
    authorizationModuleEnterpriseImpl52.stop();
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
  public void test1362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1362");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1363");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1364");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1365");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "properties/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("path/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "path/cluster/cluster/cluster/cluster" + "'", str6,
        "path/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1366");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1367");
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
  public void test1368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1368");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str11,
        "characters/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1369");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "relationship-index/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship-index/cluster/cluster/cluster/cluster/cluster" + "'",
        str10, "relationship-index/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1370");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test1371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1371");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test1372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1372");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("character/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "character/cluster/cluster/cluster" + "'", str12,
        "character/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1373");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster/cluster" + "'", str12,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1374");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("integer/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "integer/cluster/cluster/cluster/cluster" + "'", str10,
        "integer/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1375");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1376");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("byte/cluster");
    java.lang.String str20 = gdbClusterApi4.reavpaString("uri/cluster");
    java.lang.String str22 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/cluster/cluster" + "'", str15,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "byte/cluster/cluster" + "'", str18,
        "byte/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "uri/cluster/cluster" + "'", str20,
        "uri/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str22,
        "relationship/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1377");
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
    authorizationModuleEnterpriseImpl43.stop();
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
  public void test1378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1378");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1379");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("string");
    java.lang.String str9 = gdbClusterApi4.reavpaString("uri");
    java.lang.String str11 = gdbClusterApi4.reavpaString("float/cluster");
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster" + "'", str9, "uri/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "float/cluster/cluster" + "'", str11,
        "float/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test1380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1380");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
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
  public void test1381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1381");
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
  public void test1382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1382");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1383");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("long/cluster");
    java.lang.String str20 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response21 = gdbClusterApi4.reoyResponse();
    java.lang.String str23 = gdbClusterApi4.reavpaString("plugin");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "long/cluster/cluster" + "'", str18,
        "long/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str20, "long/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response21);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "plugin/cluster" + "'", str23,
        "plugin/cluster");
  }

  @Test
  public void test1384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1384");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("dbms/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dbms/cluster/cluster/cluster" + "'",
        str14, "dbms/cluster/cluster/cluster");
  }

  @Test
  public void test1385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1385");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest19 = null;
    javax.servlet.ServletResponse servletResponse20 = null;
    javax.servlet.FilterChain filterChain21 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest19, servletResponse20,
          filterChain21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1386");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster" + "'", str7, "/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1387");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1388");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/cluster" + "'", str14, "/cluster");
  }

  @Test
  public void test1389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1389");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString("bytes");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "bytes/cluster" + "'", str10,
        "bytes/cluster");
  }

  @Test
  public void test1390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1390");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str12, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
            + "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1391");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("byte/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "byte/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "byte/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1392");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.configuration.Config config14 = null;
    org.neo4j.configuration.Config config15 = null;
    org.neo4j.configuration.Config config16 = null;
    org.neo4j.configuration.Config config17 = null;
    org.neo4j.configuration.Config config18 = null;
    java.util.regex.Pattern[] patternArray19 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList20 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean21 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList20, patternArray19);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config18, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config17, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config16, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config15, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider50,
        authManagerSupplier51, webServer52);
    org.neo4j.logging.LogProvider logProvider54 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier55 = null;
    org.neo4j.server.web.WebServer webServer56 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl57 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider54,
        authManagerSupplier55, webServer56);
    org.neo4j.logging.LogProvider logProvider58 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier59 = null;
    org.neo4j.server.web.WebServer webServer60 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl61 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider58,
        authManagerSupplier59, webServer60);
    org.neo4j.logging.LogProvider logProvider62 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier63 = null;
    org.neo4j.server.web.WebServer webServer64 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl65 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider62,
        authManagerSupplier63, webServer64);
    org.neo4j.logging.LogProvider logProvider66 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier67 = null;
    org.neo4j.server.web.WebServer webServer68 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl69 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider66,
        authManagerSupplier67, webServer68);
    org.neo4j.logging.LogProvider logProvider70 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier71 = null;
    org.neo4j.server.web.WebServer webServer72 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl73 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider70,
        authManagerSupplier71, webServer72);
    org.neo4j.logging.LogProvider logProvider74 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier75 = null;
    org.neo4j.server.web.WebServer webServer76 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl77 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider74,
        authManagerSupplier75, webServer76);
    org.neo4j.logging.LogProvider logProvider78 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier79 = null;
    org.neo4j.server.web.WebServer webServer80 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl81 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider78,
        authManagerSupplier79, webServer80);
    org.neo4j.logging.LogProvider logProvider82 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier83 = null;
    org.neo4j.server.web.WebServer webServer84 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl85 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider82,
        authManagerSupplier83, webServer84);
    org.neo4j.logging.LogProvider logProvider86 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier87 = null;
    org.neo4j.server.web.WebServer webServer88 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl89 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider86,
        authManagerSupplier87, webServer88);
    org.neo4j.logging.LogProvider logProvider90 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier91 = null;
    org.neo4j.server.web.WebServer webServer92 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl93 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider90,
        authManagerSupplier91, webServer92);
    org.neo4j.logging.LogProvider logProvider94 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier95 = null;
    org.neo4j.server.web.WebServer webServer96 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl97 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider94,
        authManagerSupplier95, webServer96);
    try {
      authorizationModuleEnterpriseImpl97.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test1393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1393");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test1394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1394");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1395");
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
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1396");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1397");
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
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1398");
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
    java.lang.String str19 = gdbClusterApi4.reavpaString("nodes/cluster");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response21 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response22 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "nodes/cluster/cluster" + "'", str19,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(response20);
    org.junit.Assert.assertNotNull(response21);
    org.junit.Assert.assertNotNull(response22);
  }

  @Test
  public void test1399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1399");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-type/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-type/cluster/cluster" + "'", str12,
        "relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1400");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
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
  public void test1401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1401");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1402");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("float/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "float/cluster/cluster" + "'", str13,
        "float/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1403");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "floats/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test1404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1404");
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
    authorizationModuleEnterpriseImpl52.stop();
    authorizationModuleEnterpriseImpl52.stop();
    authorizationModuleEnterpriseImpl52.stop();
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
  public void test1405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1405");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("node-index/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "node-index/cluster/cluster" + "'",
        str11, "node-index/cluster/cluster");
  }

  @Test
  public void test1406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1406");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str10, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1407");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("longs/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "longs/cluster/cluster/cluster" + "'",
        str12, "longs/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1408");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.configuration.Config config14 = null;
    org.neo4j.configuration.Config config15 = null;
    org.neo4j.configuration.Config config16 = null;
    org.neo4j.configuration.Config config17 = null;
    org.neo4j.configuration.Config config18 = null;
    java.util.regex.Pattern[] patternArray19 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList20 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean21 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList20, patternArray19);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config18, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config17, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config16, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config15, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider50,
        authManagerSupplier51, webServer52);
    org.neo4j.logging.LogProvider logProvider54 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier55 = null;
    org.neo4j.server.web.WebServer webServer56 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl57 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider54,
        authManagerSupplier55, webServer56);
    org.neo4j.logging.LogProvider logProvider58 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier59 = null;
    org.neo4j.server.web.WebServer webServer60 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl61 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider58,
        authManagerSupplier59, webServer60);
    org.neo4j.logging.LogProvider logProvider62 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier63 = null;
    org.neo4j.server.web.WebServer webServer64 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl65 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider62,
        authManagerSupplier63, webServer64);
    org.neo4j.logging.LogProvider logProvider66 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier67 = null;
    org.neo4j.server.web.WebServer webServer68 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl69 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider66,
        authManagerSupplier67, webServer68);
    org.neo4j.logging.LogProvider logProvider70 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier71 = null;
    org.neo4j.server.web.WebServer webServer72 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl73 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider70,
        authManagerSupplier71, webServer72);
    org.neo4j.logging.LogProvider logProvider74 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier75 = null;
    org.neo4j.server.web.WebServer webServer76 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl77 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider74,
        authManagerSupplier75, webServer76);
    org.neo4j.logging.LogProvider logProvider78 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier79 = null;
    org.neo4j.server.web.WebServer webServer80 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl81 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider78,
        authManagerSupplier79, webServer80);
    org.neo4j.logging.LogProvider logProvider82 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier83 = null;
    org.neo4j.server.web.WebServer webServer84 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl85 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider82,
        authManagerSupplier83, webServer84);
    org.neo4j.logging.LogProvider logProvider86 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier87 = null;
    org.neo4j.server.web.WebServer webServer88 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl89 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider86,
        authManagerSupplier87, webServer88);
    org.neo4j.logging.LogProvider logProvider90 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier91 = null;
    org.neo4j.server.web.WebServer webServer92 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl93 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider90,
        authManagerSupplier91, webServer92);
    org.neo4j.logging.LogProvider logProvider94 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier95 = null;
    org.neo4j.server.web.WebServer webServer96 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl97 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider94,
        authManagerSupplier95, webServer96);
    java.lang.Class<?> wildcardClass98 = patternList20.getClass();
    org.junit.Assert.assertNotNull(patternArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertNotNull(wildcardClass98);
  }

  @Test
  public void test1409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1409");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str7,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1410");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test1411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1411");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1412");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("dbms/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dbms/cluster/cluster" + "'", str15,
        "dbms/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test1413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1413");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("long/cluster");
    java.lang.String str20 = gdbClusterApi4.reavpaString("characters");
    javax.ws.rs.core.Response response21 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response22 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "long/cluster/cluster" + "'", str18,
        "long/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "characters/cluster" + "'", str20,
        "characters/cluster");
    org.junit.Assert.assertNotNull(response21);
    org.junit.Assert.assertNotNull(response22);
  }

  @Test
  public void test1414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1414");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "map/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1415");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1416");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str8, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str10, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test1417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1417");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    java.lang.String str10 = gdbClusterApi4.reavpaString("integer");
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer/cluster" + "'", str10,
        "integer/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster/cluster" + "'", str12,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
            + "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str16,
        "map/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1418");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("path/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass17 = response16.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "path/cluster/cluster" + "'", str15,
        "path/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test1419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1419");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1420");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("long/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str7,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "long/cluster/cluster" + "'", str10,
        "long/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
            + "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "relationship-type/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1421");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1422");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-type/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1423");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test1424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1424");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1425");
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
  public void test1426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1426");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test1427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1427");
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
    java.lang.String str20 = gdbClusterApi4.reavpaString(
        "integer/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "integer/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str20, "integer/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1428");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-index/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test1429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1429");
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
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1430");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
    javax.servlet.ServletRequest servletRequest20 = null;
    javax.servlet.ServletResponse servletResponse21 = null;
    javax.servlet.FilterChain filterChain22 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest20, servletResponse21,
          filterChain22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test1431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1431");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1432");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1433");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1434");
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
  public void test1435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1435");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "paths/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1436");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "exception/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1437");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("integers/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "path/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "path/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str12, "path/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1438");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
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
  public void test1439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1439");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("doubles");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass15 = response14.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test1440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1440");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1441");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("strings/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str8, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "strings/cluster/cluster" + "'", str10,
        "strings/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test1442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1442");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1443");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("longs");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
    java.lang.String str19 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "longs/cluster" + "'", str16,
        "longs/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str19, "strings/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1444");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1445");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("double/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "double/cluster/cluster" + "'", str12,
        "double/cluster/cluster");
  }

  @Test
  public void test1446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1446");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("paths/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "paths/cluster/cluster" + "'", str16,
        "paths/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test1447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1447");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("node-index");
    java.lang.String str19 = gdbClusterApi4.reavpaString("shorts/cluster");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "node-index/cluster" + "'", str17,
        "node-index/cluster");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "shorts/cluster/cluster" + "'", str19,
        "shorts/cluster/cluster");
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test1448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1448");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    org.neo4j.configuration.Config config7 = null;
    java.util.regex.Pattern[] patternArray8 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList9 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean10 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList9, patternArray8);
    org.neo4j.logging.LogProvider logProvider11 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier12 = null;
    org.neo4j.server.web.WebServer webServer13 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl14 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider11,
        authManagerSupplier12, webServer13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider35,
        authManagerSupplier36, webServer37);
    org.neo4j.logging.LogProvider logProvider39 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier40 = null;
    org.neo4j.server.web.WebServer webServer41 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl42 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList9, logProvider39,
        authManagerSupplier40, webServer41);
    java.lang.Class<?> wildcardClass43 = authorizationModuleEnterpriseImpl42.getClass();
    org.junit.Assert.assertNotNull(patternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(wildcardClass43);
  }

  @Test
  public void test1449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1449");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str10,
        "characters/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-type/cluster/cluster/cluster" + "'", str12,
        "relationship-type/cluster/cluster/cluster");
  }

  @Test
  public void test1450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1450");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString(
        "relationships/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "relationships/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str18, "relationships/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1451");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test1452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1452");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("doubles/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str8, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster" + "'", str11, "/cluster");
  }

  @Test
  public void test1453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1453");
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
    javax.servlet.FilterConfig filterConfig9 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig9);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
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
  public void test1454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1454");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str7,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "shorts/cluster" + "'", str10,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1455");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
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
  public void test1456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1456");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "booleans/cluster/cluster/cluster/cluster");
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
        "'" + str16 + "' != '" + "booleans/cluster/cluster/cluster/cluster/cluster" + "'", str16,
        "booleans/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1457");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "graphdb/cluster/cluster/cluster" + "'",
        str8, "graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1458");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "string/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1459");
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
    javax.ws.rs.core.Response response20 = gdbClusterApi4.diceResponse();
    java.lang.String str22 = gdbClusterApi4.reavpaString("node/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '" + "node/cluster/cluster/cluster/cluster/cluster" + "'", str22,
        "node/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1460");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-type/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1461");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str12, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1462");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("double");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugin/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "double/cluster" + "'", str11,
        "double/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugin/cluster/cluster/cluster" + "'",
        str13, "plugin/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1463");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
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
  public void test1464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1464");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test1465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1465");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
    java.lang.String str19 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integers/cluster/cluster" + "'", str10,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str14, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str16, "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str19, "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1466");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-type/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass15 = response14.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-type/cluster/cluster" + "'", str12,
        "relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test1467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1467");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1468");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("doubles/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "doubles/cluster/cluster" + "'", str11,
        "doubles/cluster/cluster");
  }

  @Test
  public void test1469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1469");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test1470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1470");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("node-index/cluster");
    java.lang.String str18 = gdbClusterApi4.reavpaString("double/cluster");
    java.lang.String str20 = gdbClusterApi4.reavpaString("relationship-index");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str14, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "node-index/cluster/cluster" + "'",
        str16, "node-index/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "double/cluster/cluster" + "'", str18,
        "double/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "relationship-index/cluster" + "'",
        str20, "relationship-index/cluster");
  }

  @Test
  public void test1471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1471");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass19 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/cluster/cluster" + "'", str15,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test1472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1472");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("plugins");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("character/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plugins/cluster" + "'", str6,
        "plugins/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "character/cluster/cluster/cluster/cluster" + "'", str9,
        "character/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test1473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1473");
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
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
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
  public void test1474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1474");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("strings");
    java.lang.String str19 = gdbClusterApi4.reavpaString("float/cluster");
    java.lang.String str21 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass22 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "strings/cluster" + "'", str17,
        "strings/cluster");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "float/cluster/cluster" + "'", str19,
        "float/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str21 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str21,
        "db/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass22);
  }

  @Test
  public void test1475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1475");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str13, "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1476");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "booleans/cluster" + "'", str8,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "relationship/cluster/cluster" + "'",
        str12, "relationship/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test1477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1477");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "uri/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("index/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "uri/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "uri/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "index/cluster/cluster/cluster" + "'",
        str18, "index/cluster/cluster/cluster");
  }

  @Test
  public void test1478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1478");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    java.lang.String str10 = gdbClusterApi4.reavpaString("integer");
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("hi!/cluster");
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass20 = response19.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer/cluster" + "'", str10,
        "integer/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster/cluster" + "'", str12,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!/cluster/cluster" + "'", str15,
        "hi!/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster" + "'", str17,
        "relationship-type/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test1479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1479");
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
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
  }

  @Test
  public void test1480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1480");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugin/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "plugin/cluster/cluster/cluster/cluster" + "'", str13,
        "plugin/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test1481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1481");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "string/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test1482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1482");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster" + "'", str7, "/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1483");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("uri/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("plugins/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uri/cluster/cluster/cluster" + "'",
        str12, "uri/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "plugins/cluster/cluster/cluster" + "'",
        str14, "plugins/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1484");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "booleans/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test1485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1485");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.configuration.Config config14 = null;
    org.neo4j.configuration.Config config15 = null;
    org.neo4j.configuration.Config config16 = null;
    org.neo4j.configuration.Config config17 = null;
    org.neo4j.configuration.Config config18 = null;
    java.util.regex.Pattern[] patternArray19 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList20 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean21 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList20, patternArray19);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config18, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config17, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config16, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config15, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider34,
        authManagerSupplier35, webServer36);
    org.neo4j.logging.LogProvider logProvider38 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier39 = null;
    org.neo4j.server.web.WebServer webServer40 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl41 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider38,
        authManagerSupplier39, webServer40);
    org.neo4j.logging.LogProvider logProvider42 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier43 = null;
    org.neo4j.server.web.WebServer webServer44 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl45 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider42,
        authManagerSupplier43, webServer44);
    org.neo4j.logging.LogProvider logProvider46 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier47 = null;
    org.neo4j.server.web.WebServer webServer48 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl49 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider46,
        authManagerSupplier47, webServer48);
    org.neo4j.logging.LogProvider logProvider50 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier51 = null;
    org.neo4j.server.web.WebServer webServer52 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl53 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider50,
        authManagerSupplier51, webServer52);
    org.neo4j.logging.LogProvider logProvider54 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier55 = null;
    org.neo4j.server.web.WebServer webServer56 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl57 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider54,
        authManagerSupplier55, webServer56);
    org.neo4j.logging.LogProvider logProvider58 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier59 = null;
    org.neo4j.server.web.WebServer webServer60 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl61 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider58,
        authManagerSupplier59, webServer60);
    org.neo4j.logging.LogProvider logProvider62 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier63 = null;
    org.neo4j.server.web.WebServer webServer64 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl65 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider62,
        authManagerSupplier63, webServer64);
    org.neo4j.logging.LogProvider logProvider66 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier67 = null;
    org.neo4j.server.web.WebServer webServer68 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl69 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider66,
        authManagerSupplier67, webServer68);
    org.neo4j.logging.LogProvider logProvider70 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier71 = null;
    org.neo4j.server.web.WebServer webServer72 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl73 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider70,
        authManagerSupplier71, webServer72);
    org.neo4j.logging.LogProvider logProvider74 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier75 = null;
    org.neo4j.server.web.WebServer webServer76 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl77 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider74,
        authManagerSupplier75, webServer76);
    org.neo4j.logging.LogProvider logProvider78 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier79 = null;
    org.neo4j.server.web.WebServer webServer80 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl81 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider78,
        authManagerSupplier79, webServer80);
    org.neo4j.logging.LogProvider logProvider82 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier83 = null;
    org.neo4j.server.web.WebServer webServer84 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl85 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider82,
        authManagerSupplier83, webServer84);
    org.neo4j.logging.LogProvider logProvider86 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier87 = null;
    org.neo4j.server.web.WebServer webServer88 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl89 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider86,
        authManagerSupplier87, webServer88);
    org.neo4j.logging.LogProvider logProvider90 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier91 = null;
    org.neo4j.server.web.WebServer webServer92 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl93 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider90,
        authManagerSupplier91, webServer92);
    org.neo4j.logging.LogProvider logProvider94 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier95 = null;
    org.neo4j.server.web.WebServer webServer96 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl97 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList20, logProvider94,
        authManagerSupplier95, webServer96);
    authorizationModuleEnterpriseImpl97.stop();
    org.junit.Assert.assertNotNull(patternArray19);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test1486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1486");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
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
  public void test1487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1487");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integer");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    java.lang.String str12 = gdbClusterApi4.reavpaString("paths");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster" + "'", str7,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "paths/cluster" + "'", str12,
        "paths/cluster");
  }

  @Test
  public void test1488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1488");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("string/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "string/cluster/cluster" + "'", str14,
        "string/cluster/cluster");
  }

  @Test
  public void test1489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1489");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plugins/cluster/cluster/cluster" + "'",
        str6, "plugins/cluster/cluster/cluster");
  }

  @Test
  public void test1490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1490");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("path/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "path/cluster/cluster" + "'", str6,
        "path/cluster/cluster");
  }

  @Test
  public void test1491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1491");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("shorts/cluster");
    java.lang.String str20 = gdbClusterApi4.reavpaString("booleans");
    java.lang.Class<?> wildcardClass21 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "shorts/cluster/cluster" + "'", str18,
        "shorts/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "booleans/cluster" + "'", str20,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test1492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1492");
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
  public void test1493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1493");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass14 = response13.getClass();
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
  public void test1494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1494");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str7, "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1495");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("longs/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str13, "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "longs/cluster/cluster/cluster" + "'",
        str15, "longs/cluster/cluster/cluster");
  }

  @Test
  public void test1496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1496");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test1497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1497");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("dbms/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str17 = gdbClusterApi4.reavpaString("long/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "dbms/cluster/cluster/cluster" + "'",
        str13, "dbms/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str15, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "long/cluster/cluster/cluster" + "'",
        str17, "long/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test1498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1498");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("doubles");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test1499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1499");
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
    org.neo4j.configuration.Config config10 = null;
    org.neo4j.configuration.Config config11 = null;
    org.neo4j.configuration.Config config12 = null;
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.configuration.Config config14 = null;
    org.neo4j.configuration.Config config15 = null;
    java.util.regex.Pattern[] patternArray16 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList17 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean18 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList17, patternArray16);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config15, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider35,
        authManagerSupplier36, webServer37);
    org.neo4j.logging.LogProvider logProvider39 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier40 = null;
    org.neo4j.server.web.WebServer webServer41 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl42 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider39,
        authManagerSupplier40, webServer41);
    org.neo4j.logging.LogProvider logProvider43 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier44 = null;
    org.neo4j.server.web.WebServer webServer45 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl46 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider43,
        authManagerSupplier44, webServer45);
    org.neo4j.logging.LogProvider logProvider47 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier48 = null;
    org.neo4j.server.web.WebServer webServer49 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl50 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider47,
        authManagerSupplier48, webServer49);
    org.neo4j.logging.LogProvider logProvider51 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier52 = null;
    org.neo4j.server.web.WebServer webServer53 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl54 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider51,
        authManagerSupplier52, webServer53);
    org.neo4j.logging.LogProvider logProvider55 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier56 = null;
    org.neo4j.server.web.WebServer webServer57 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl58 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider55,
        authManagerSupplier56, webServer57);
    org.neo4j.logging.LogProvider logProvider59 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier60 = null;
    org.neo4j.server.web.WebServer webServer61 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl62 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider59,
        authManagerSupplier60, webServer61);
    org.neo4j.logging.LogProvider logProvider63 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier64 = null;
    org.neo4j.server.web.WebServer webServer65 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl66 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider63,
        authManagerSupplier64, webServer65);
    org.neo4j.logging.LogProvider logProvider67 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier68 = null;
    org.neo4j.server.web.WebServer webServer69 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl70 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider67,
        authManagerSupplier68, webServer69);
    org.neo4j.logging.LogProvider logProvider71 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier72 = null;
    org.neo4j.server.web.WebServer webServer73 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl74 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider71,
        authManagerSupplier72, webServer73);
    org.neo4j.logging.LogProvider logProvider75 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier76 = null;
    org.neo4j.server.web.WebServer webServer77 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl78 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider75,
        authManagerSupplier76, webServer77);
    org.neo4j.logging.LogProvider logProvider79 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier80 = null;
    org.neo4j.server.web.WebServer webServer81 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl82 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList17, logProvider79,
        authManagerSupplier80, webServer81);
    try {
      authorizationModuleEnterpriseImpl82.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test1500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1500");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("map/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("string/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "map/cluster/cluster/cluster" + "'",
        str14, "map/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "string/cluster/cluster/cluster" + "'",
        str16, "string/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }
}

