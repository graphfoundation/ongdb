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
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster");
  }

  @Test
  public void test0502() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0502");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("dbms/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster" + "'", str12,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dbms/cluster/cluster/cluster" + "'",
        str14, "dbms/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0503() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0503");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("uri/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("relationship/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uri/cluster/cluster/cluster" + "'",
        str14, "uri/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "relationship/cluster/cluster" + "'",
        str16, "relationship/cluster/cluster");
  }

  @Test
  public void test0504() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0504");
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
  public void test0505() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0505");
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
    java.lang.Class<?> wildcardClass13 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "node-index/cluster" + "'", str11,
        "node-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0506() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0506");
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
  public void test0507() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0507");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
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
  public void test0508() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0508");
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
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0509() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0509");
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
  public void test0510() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0510");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0511() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0511");
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
  public void test0512() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0512");
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
  public void test0513() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0513");
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
  public void test0514() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0514");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("characters");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "characters/cluster" + "'", str16,
        "characters/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0515() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0515");
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
  public void test0516() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0516");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0517() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0517");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("relationships");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationships/cluster" + "'", str11,
        "relationships/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0518() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0518");
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
    try {
      authorizationModuleEnterpriseImpl42.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0519() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0519");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test0520() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0520");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("booleans/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str6,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "booleans/cluster/cluster" + "'", str11,
        "booleans/cluster/cluster");
  }

  @Test
  public void test0521() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0521");
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
  public void test0522() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0522");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0523() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0523");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0524() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0524");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "dbms/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0525() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0525");
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
  public void test0526() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0526");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "nodes/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0527() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0527");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig8 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig8);
  }

  @Test
  public void test0528() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0528");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "index/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0529() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0529");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-index/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass14 = response13.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-index/cluster/cluster/cluster" + "'", str12,
        "relationship-index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0530() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0530");
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
  public void test0531() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0531");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str9,
        "characters/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0532() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0532");
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
    java.lang.Class<?> wildcardClass14 = response13.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer/cluster" + "'", str10,
        "integer/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster/cluster" + "'", str12,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0533() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0533");
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
  public void test0534() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0534");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster/cluster" + "'", str8,
        "/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
  }

  @Test
  public void test0535() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0535");
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
  public void test0536() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0536");
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
    java.lang.Class<?> wildcardClass18 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0537() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0537");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0538() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0538");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("node");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "node/cluster" + "'", str9,
        "node/cluster");
  }

  @Test
  public void test0539() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0539");
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
  public void test0540() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0540");
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
    java.lang.String str22 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str22, "nodes/cluster/cluster/cluster");
  }

  @Test
  public void test0541() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0541");
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
    java.lang.Class<?> wildcardClass19 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0542() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0542");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0543() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0543");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0544() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0544");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("uri");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0545() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0545");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0546() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0546");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("longs/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str12, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "longs/cluster/cluster" + "'", str15,
        "longs/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test0547() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0547");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "string/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("byte/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "byte/cluster/cluster/cluster" + "'",
        str6, "byte/cluster/cluster/cluster");
  }

  @Test
  public void test0548() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0548");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
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
  public void test0549() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0549");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0550() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0550");
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
  public void test0551() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0551");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0552() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0552");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("integers/cluster");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "integers/cluster/cluster" + "'", str18,
        "integers/cluster/cluster");
  }

  @Test
  public void test0553() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0553");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test0554() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0554");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0555() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0555");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0556() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0556");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("floats/cluster");
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "floats/cluster/cluster" + "'", str18,
        "floats/cluster/cluster");
  }

  @Test
  public void test0557() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0557");
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
  public void test0558() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0558");
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
  public void test0559() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0559");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0560() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0560");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0561() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0561");
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
  public void test0562() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0562");
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
    java.util.regex.Pattern pattern11 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray12 = new java.util.regex.Pattern[]{pattern11};
    java.util.ArrayList<java.util.regex.Pattern> patternList13 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList13, patternArray12);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider35,
        authManagerSupplier36, webServer37);
    org.neo4j.logging.LogProvider logProvider39 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier40 = null;
    org.neo4j.server.web.WebServer webServer41 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl42 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider39,
        authManagerSupplier40, webServer41);
    org.neo4j.logging.LogProvider logProvider43 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier44 = null;
    org.neo4j.server.web.WebServer webServer45 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl46 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider43,
        authManagerSupplier44, webServer45);
    org.neo4j.logging.LogProvider logProvider47 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier48 = null;
    org.neo4j.server.web.WebServer webServer49 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl50 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider47,
        authManagerSupplier48, webServer49);
    org.neo4j.logging.LogProvider logProvider51 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier52 = null;
    org.neo4j.server.web.WebServer webServer53 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl54 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider51,
        authManagerSupplier52, webServer53);
    org.neo4j.logging.LogProvider logProvider55 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier56 = null;
    org.neo4j.server.web.WebServer webServer57 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl58 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider55,
        authManagerSupplier56, webServer57);
    authorizationModuleEnterpriseImpl58.stop();
    try {
      authorizationModuleEnterpriseImpl58.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern11);
    org.junit.Assert.assertEquals(pattern11.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test0563() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0563");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
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
  public void test0564() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0564");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
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
  public void test0565() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0565");
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
  public void test0566() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0566");
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
  public void test0567() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0567");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
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
  public void test0568() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0568");
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
  public void test0569() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0569");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0570() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0570");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("plugins");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plugins/cluster" + "'", str6,
        "plugins/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
  }

  @Test
  public void test0571() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0571");
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
  public void test0572() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0572");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
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
  public void test0573() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0573");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test0574() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0574");
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
    java.lang.Class<?> wildcardClass19 = patternList5.getClass();
    org.junit.Assert.assertNotNull(pattern3);
    org.junit.Assert.assertEquals(pattern3.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0575() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0575");
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
  public void test0576() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0576");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0577() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0577");
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
    authorizationModuleEnterpriseImpl32.stop();
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
  public void test0578() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0578");
    }
    org.neo4j.server.rest.repr.Representation representation0 = org.neo4j.server.rest.repr.Representation.emptyRepresentation();
    java.lang.Class<?> wildcardClass1 = representation0.getClass();
    org.junit.Assert.assertNotNull(representation0);
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0579() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0579");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster/cluster" + "'", str9,
        "uri/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0580() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0580");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.avllResponse();
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
  }

  @Test
  public void test0581() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0581");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster/cluster" + "'", str9,
        "uri/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0582() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0582");
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
  public void test0583() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0583");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig4 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig4);
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
  public void test0584() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0584");
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
    java.lang.Class<?> wildcardClass15 = response14.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0585() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0585");
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
  public void test0586() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0586");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("dbms/cluster/cluster");
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dbms/cluster/cluster/cluster" + "'",
        str11, "dbms/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0587() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0587");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0588() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0588");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
            + "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str10,
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0589() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0589");
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
    java.util.regex.Pattern[] patternArray12 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList13 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList13, patternArray12);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider35,
        authManagerSupplier36, webServer37);
    org.neo4j.logging.LogProvider logProvider39 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier40 = null;
    org.neo4j.server.web.WebServer webServer41 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl42 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider39,
        authManagerSupplier40, webServer41);
    org.neo4j.logging.LogProvider logProvider43 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier44 = null;
    org.neo4j.server.web.WebServer webServer45 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl46 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider43,
        authManagerSupplier44, webServer45);
    org.neo4j.logging.LogProvider logProvider47 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier48 = null;
    org.neo4j.server.web.WebServer webServer49 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl50 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider47,
        authManagerSupplier48, webServer49);
    org.neo4j.logging.LogProvider logProvider51 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier52 = null;
    org.neo4j.server.web.WebServer webServer53 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl54 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider51,
        authManagerSupplier52, webServer53);
    org.neo4j.logging.LogProvider logProvider55 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier56 = null;
    org.neo4j.server.web.WebServer webServer57 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl58 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider55,
        authManagerSupplier56, webServer57);
    org.neo4j.logging.LogProvider logProvider59 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier60 = null;
    org.neo4j.server.web.WebServer webServer61 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl62 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider59,
        authManagerSupplier60, webServer61);
    try {
      authorizationModuleEnterpriseImpl62.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
  }

  @Test
  public void test0590() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0590");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "node-index/cluster", outputFormat3);
  }

  @Test
  public void test0591() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0591");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
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
  public void test0592() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0592");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str17, "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0593() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0593");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0594() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0594");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("relationship/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "relationship/cluster/cluster" + "'",
        str8, "relationship/cluster/cluster");
  }

  @Test
  public void test0595() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0595");
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
    try {
      authorizationModuleEnterpriseImpl57.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0596() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0596");
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
  public void test0597() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0597");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "graphdb/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0598() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0598");
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
  public void test0599() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0599");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("db/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    java.lang.String str20 = gdbClusterApi4.reavpaString("bytes/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "db/cluster/cluster/cluster" + "'",
        str17, "db/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "bytes/cluster/cluster/cluster/cluster" + "'", str20,
        "bytes/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0600() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0600");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass6 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0601() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0601");
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
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test0602() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0602");
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
    javax.servlet.ServletRequest servletRequest21 = null;
    javax.servlet.ServletResponse servletResponse22 = null;
    javax.servlet.FilterChain filterChain23 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest21, servletResponse22,
          filterChain23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0603() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0603");
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
  public void test0604() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0604");
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
  public void test0605() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0605");
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
    authorizationModuleEnterpriseImpl42.stop();
    try {
      authorizationModuleEnterpriseImpl42.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0606() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0606");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "characters/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str10, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "characters/cluster/cluster/cluster/cluster/cluster" + "'", str12,
        "characters/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0607() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0607");
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
  public void test0608() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0608");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "map/cluster/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0609() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0609");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "map/cluster", outputFormat3);
  }

  @Test
  public void test0610() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0610");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0611() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0611");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0612() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0612");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster" + "'", str9, "uri/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/cluster" + "'", str14, "/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0613() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0613");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0614() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0614");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
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
  public void test0615() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0615");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0616() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0616");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("byte");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster" + "'", str7,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster" + "'", str12,
        "hi!/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "byte/cluster" + "'", str15,
        "byte/cluster");
  }

  @Test
  public void test0617() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0617");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0618() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0618");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("index/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster/cluster" + "'", str8,
        "index/cluster/cluster");
  }

  @Test
  public void test0619() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0619");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("uri/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uri/cluster/cluster" + "'", str6,
        "uri/cluster/cluster");
  }

  @Test
  public void test0620() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0620");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "/cluster/cluster/cluster/cluster/cluster" + "'", str8,
        "/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0621() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0621");
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
  public void test0622() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0622");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str8,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/cluster" + "'", str12, "/cluster");
  }

  @Test
  public void test0623() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0623");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0624() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0624");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("index/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "short/cluster" + "'", str9,
        "short/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster/cluster" + "'", str11,
        "graphdb/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "index/cluster/cluster/cluster" + "'",
        str13, "index/cluster/cluster/cluster");
  }

  @Test
  public void test0625() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0625");
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
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0626() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0626");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
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
  public void test0627() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0627");
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
    java.util.regex.Pattern pattern11 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray12 = new java.util.regex.Pattern[]{pattern11};
    java.util.ArrayList<java.util.regex.Pattern> patternList13 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean14 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList13, patternArray12);
    org.neo4j.logging.LogProvider logProvider15 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier16 = null;
    org.neo4j.server.web.WebServer webServer17 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl18 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider15,
        authManagerSupplier16, webServer17);
    org.neo4j.logging.LogProvider logProvider19 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier20 = null;
    org.neo4j.server.web.WebServer webServer21 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl22 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider19,
        authManagerSupplier20, webServer21);
    org.neo4j.logging.LogProvider logProvider23 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier24 = null;
    org.neo4j.server.web.WebServer webServer25 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl26 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider23,
        authManagerSupplier24, webServer25);
    org.neo4j.logging.LogProvider logProvider27 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier28 = null;
    org.neo4j.server.web.WebServer webServer29 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl30 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider27,
        authManagerSupplier28, webServer29);
    org.neo4j.logging.LogProvider logProvider31 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier32 = null;
    org.neo4j.server.web.WebServer webServer33 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl34 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider31,
        authManagerSupplier32, webServer33);
    org.neo4j.logging.LogProvider logProvider35 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier36 = null;
    org.neo4j.server.web.WebServer webServer37 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl38 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider35,
        authManagerSupplier36, webServer37);
    org.neo4j.logging.LogProvider logProvider39 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier40 = null;
    org.neo4j.server.web.WebServer webServer41 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl42 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider39,
        authManagerSupplier40, webServer41);
    org.neo4j.logging.LogProvider logProvider43 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier44 = null;
    org.neo4j.server.web.WebServer webServer45 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl46 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider43,
        authManagerSupplier44, webServer45);
    org.neo4j.logging.LogProvider logProvider47 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier48 = null;
    org.neo4j.server.web.WebServer webServer49 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl50 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider47,
        authManagerSupplier48, webServer49);
    org.neo4j.logging.LogProvider logProvider51 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier52 = null;
    org.neo4j.server.web.WebServer webServer53 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl54 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider51,
        authManagerSupplier52, webServer53);
    org.neo4j.logging.LogProvider logProvider55 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier56 = null;
    org.neo4j.server.web.WebServer webServer57 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl58 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList13, logProvider55,
        authManagerSupplier56, webServer57);
    try {
      authorizationModuleEnterpriseImpl58.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(pattern11);
    org.junit.Assert.assertEquals(pattern11.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
  }

  @Test
  public void test0628() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0628");
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
    java.util.regex.Pattern[] patternArray14 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList15 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean16 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList15, patternArray14);
    org.neo4j.logging.LogProvider logProvider17 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier18 = null;
    org.neo4j.server.web.WebServer webServer19 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl20 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider17,
        authManagerSupplier18, webServer19);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider25,
        authManagerSupplier26, webServer27);
    org.neo4j.logging.LogProvider logProvider29 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier30 = null;
    org.neo4j.server.web.WebServer webServer31 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl32 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider29,
        authManagerSupplier30, webServer31);
    org.neo4j.logging.LogProvider logProvider33 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier34 = null;
    org.neo4j.server.web.WebServer webServer35 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl36 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider33,
        authManagerSupplier34, webServer35);
    org.neo4j.logging.LogProvider logProvider37 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier38 = null;
    org.neo4j.server.web.WebServer webServer39 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl40 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider37,
        authManagerSupplier38, webServer39);
    org.neo4j.logging.LogProvider logProvider41 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier42 = null;
    org.neo4j.server.web.WebServer webServer43 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl44 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider41,
        authManagerSupplier42, webServer43);
    org.neo4j.logging.LogProvider logProvider45 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier46 = null;
    org.neo4j.server.web.WebServer webServer47 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl48 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider45,
        authManagerSupplier46, webServer47);
    org.neo4j.logging.LogProvider logProvider49 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier50 = null;
    org.neo4j.server.web.WebServer webServer51 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl52 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider49,
        authManagerSupplier50, webServer51);
    org.neo4j.logging.LogProvider logProvider53 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier54 = null;
    org.neo4j.server.web.WebServer webServer55 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl56 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider53,
        authManagerSupplier54, webServer55);
    org.neo4j.logging.LogProvider logProvider57 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier58 = null;
    org.neo4j.server.web.WebServer webServer59 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl60 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider57,
        authManagerSupplier58, webServer59);
    org.neo4j.logging.LogProvider logProvider61 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier62 = null;
    org.neo4j.server.web.WebServer webServer63 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl64 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider61,
        authManagerSupplier62, webServer63);
    org.neo4j.logging.LogProvider logProvider65 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier66 = null;
    org.neo4j.server.web.WebServer webServer67 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl68 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider65,
        authManagerSupplier66, webServer67);
    org.neo4j.logging.LogProvider logProvider69 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier70 = null;
    org.neo4j.server.web.WebServer webServer71 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl72 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList15, logProvider69,
        authManagerSupplier70, webServer71);
    try {
      authorizationModuleEnterpriseImpl72.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray14);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
  }

  @Test
  public void test0629() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0629");
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
  public void test0630() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0630");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugins/cluster" + "'", str13,
        "plugins/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/cluster" + "'", str15, "/cluster");
  }

  @Test
  public void test0631() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0631");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0632() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0632");
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
  public void test0633() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0633");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0634() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0634");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "index/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("long");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "long/cluster" + "'", str7,
        "long/cluster");
  }

  @Test
  public void test0635() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0635");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'",
        str15, "relationship/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0636() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0636");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "node-index/cluster" + "'", str11,
        "node-index/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0637() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0637");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "characters/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster" + "'", str6,
        "relationship-type/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0638() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0638");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0639() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0639");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "characters/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass6 = response5.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0640() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0640");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "index/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0641() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0641");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("strings/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "strings/cluster/cluster" + "'", str10,
        "strings/cluster/cluster");
  }

  @Test
  public void test0642() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0642");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0643() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0643");
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
  public void test0644() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0644");
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
  public void test0645() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0645");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0646() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0646");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0647() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0647");
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
  public void test0648() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0648");
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
  public void test0649() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0649");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test0650() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0650");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("uri/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass15 = response14.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uri/cluster/cluster/cluster" + "'",
        str13, "uri/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0651() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0651");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "db/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0652() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0652");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass6 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0653() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0653");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("index/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!/cluster/cluster" + "'", str12,
        "hi!/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "index/cluster/cluster" + "'", str16,
        "index/cluster/cluster");
  }

  @Test
  public void test0654() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0654");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-index/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0655() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0655");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("relationship");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster" + "'", str8,
        "paths/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str10,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "relationship/cluster" + "'", str13,
        "relationship/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0656() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0656");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
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
  public void test0657() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0657");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri-template/cluster", outputFormat3);
  }

  @Test
  public void test0658() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0658");
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
    try {
      authorizationModuleEnterpriseImpl5.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0659() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0659");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("long/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "bytes/cluster/cluster" + "'", str12,
        "bytes/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "long/cluster/cluster" + "'", str15,
        "long/cluster/cluster");
  }

  @Test
  public void test0660() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0660");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("byte");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "byte/cluster" + "'", str12,
        "byte/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0661() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0661");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test0662() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0662");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0663() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0663");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "doubles/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0664() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0664");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0665() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0665");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster/cluster");
    java.lang.Class<?> wildcardClass18 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str17, "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0666() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0666");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("character");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass14 = response13.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "character/cluster" + "'", str12,
        "character/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0667() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0667");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "dbms/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "map/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "map/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0668() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0668");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    java.lang.String str8 = gdbClusterApi4.reavpaString("path");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0669() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0669");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0670() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0670");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
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
  public void test0671() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0671");
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
    try {
      authorizationModuleEnterpriseImpl57.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0672() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0672");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0673() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0673");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0674() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0674");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster/cluster/cluster" + "'",
        str13, "map/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "booleans/cluster" + "'", str15,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0675() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0675");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0676() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0676");
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
  public void test0677() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0677");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("long/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long/cluster/cluster/cluster" + "'",
        str6, "long/cluster/cluster/cluster");
  }

  @Test
  public void test0678() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0678");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0679() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0679");
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
  public void test0680() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0680");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
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
  public void test0681() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0681");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
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
  public void test0682() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0682");
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
  public void test0683() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0683");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "node-index/cluster" + "'", str11,
        "node-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "doubles/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str13, "doubles/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0684() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0684");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("plugins/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster/cluster" + "'",
        str9, "plugins/cluster/cluster/cluster");
  }

  @Test
  public void test0685() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0685");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster" + "'", str8,
        "paths/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str10,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0686() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0686");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString(
        "relationship-index/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship-index/cluster/cluster/cluster/cluster/cluster" + "'",
        str9, "relationship-index/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0687() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0687");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings/cluster/cluster/cluster",
        outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0688() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0688");
    }
    org.neo4j.configuration.Config config0 = null;
    org.neo4j.configuration.Config config1 = null;
    org.neo4j.configuration.Config config2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.configuration.Config config4 = null;
    org.neo4j.configuration.Config config5 = null;
    org.neo4j.configuration.Config config6 = null;
    java.util.regex.Pattern[] patternArray7 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList8 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean9 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList8, patternArray7);
    org.neo4j.logging.LogProvider logProvider10 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier11 = null;
    org.neo4j.server.web.WebServer webServer12 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl13 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider10,
        authManagerSupplier11, webServer12);
    org.neo4j.logging.LogProvider logProvider14 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier15 = null;
    org.neo4j.server.web.WebServer webServer16 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl17 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider14,
        authManagerSupplier15, webServer16);
    org.neo4j.logging.LogProvider logProvider18 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier19 = null;
    org.neo4j.server.web.WebServer webServer20 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl21 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider18,
        authManagerSupplier19, webServer20);
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier23 = null;
    org.neo4j.server.web.WebServer webServer24 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl25 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider22,
        authManagerSupplier23, webServer24);
    org.neo4j.logging.LogProvider logProvider26 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier27 = null;
    org.neo4j.server.web.WebServer webServer28 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl29 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider26,
        authManagerSupplier27, webServer28);
    org.neo4j.logging.LogProvider logProvider30 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier31 = null;
    org.neo4j.server.web.WebServer webServer32 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl33 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider30,
        authManagerSupplier31, webServer32);
    org.neo4j.logging.LogProvider logProvider34 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier35 = null;
    org.neo4j.server.web.WebServer webServer36 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl37 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList8, logProvider34,
        authManagerSupplier35, webServer36);
    authorizationModuleEnterpriseImpl37.stop();
    try {
      authorizationModuleEnterpriseImpl37.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
  }

  @Test
  public void test0689() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0689");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass17 = response16.getClass();
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
  public void test0690() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0690");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("relationship-type/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship-type/cluster/cluster" + "'", str10,
        "relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0691() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0691");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0692() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0692");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("graphdb/cluster");
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "graphdb/cluster/cluster" + "'", str14,
        "graphdb/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0693() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0693");
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
    java.lang.Class<?> wildcardClass10 = authorizationModuleEnterpriseImpl5.getClass();
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0694() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0694");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str12, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0695() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0695");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0696() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0696");
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
  public void test0697() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0697");
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
  public void test0698() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0698");
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
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0699() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0699");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0700() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0700");
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
  public void test0701() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0701");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str12, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0702() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0702");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0703() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0703");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster" + "'", str13,
        "map/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "/cluster/cluster/cluster/cluster/cluster" + "'", str17,
        "/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0704() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0704");
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
    java.lang.Class<?> wildcardClass13 = response12.getClass();
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
  public void test0705() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0705");
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
  public void test0706() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0706");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "integers/cluster/cluster/cluster" + "'",
        str13, "integers/cluster/cluster/cluster");
  }

  @Test
  public void test0707() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0707");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0708() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0708");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("doubles/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "doubles/cluster/cluster/cluster/cluster" + "'", str16,
        "doubles/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test0709() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0709");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test0710() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0710");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("character");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "character/cluster" + "'", str12,
        "character/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0711() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0711");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "map/cluster/cluster" + "'", str10,
        "map/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0712() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0712");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str11,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0713() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0713");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
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
  public void test0714() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0714");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str11,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str15, "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0715() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0715");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0716() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0716");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0717() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0717");
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
    java.lang.Class<?> wildcardClass16 = authorizationModuleEnterpriseImpl12.getClass();
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0718() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0718");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0719() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0719");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("shorts/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "shorts/cluster/cluster/cluster/cluster" + "'", str11,
        "shorts/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0720() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0720");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("boolean");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "boolean/cluster" + "'", str17,
        "boolean/cluster");
  }

  @Test
  public void test0721() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0721");
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
  public void test0722() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0722");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass15 = response14.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster/cluster/cluster" + "'",
        str13, "map/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0723() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0723");
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
  public void test0724() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0724");
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
  public void test0725() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0725");
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
  public void test0726() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0726");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0727() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0727");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0728() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0728");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("characters");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "characters/cluster" + "'", str9,
        "characters/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0729() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0729");
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
    authorizationModuleEnterpriseImpl5.stop();
    try {
      authorizationModuleEnterpriseImpl5.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0730() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0730");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0731() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0731");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test0732() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0732");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig19 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig19);
    javax.servlet.ServletRequest servletRequest21 = null;
    javax.servlet.ServletResponse servletResponse22 = null;
    javax.servlet.FilterChain filterChain23 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest21, servletResponse22,
          filterChain23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0733() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0733");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
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
  }

  @Test
  public void test0734() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0734");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("doubles");
    java.lang.String str14 = gdbClusterApi4.reavpaString("graphdb/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "doubles/cluster" + "'", str12,
        "doubles/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "graphdb/cluster/cluster/cluster/cluster" + "'", str14,
        "graphdb/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0735() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0735");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("longs/cluster");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "longs/cluster/cluster" + "'", str18,
        "longs/cluster/cluster");
  }

  @Test
  public void test0736() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0736");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("long/cluster/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "long/cluster/cluster/cluster/cluster" + "'", str16,
        "long/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test0737() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0737");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("byte/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "integers/cluster/cluster/cluster/cluster" + "'", str12,
        "integers/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "byte/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "byte/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0738() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0738");
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
  public void test0739() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0739");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "relationship-index/cluster" + "'",
        str11, "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "integers/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str16,
        "characters/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0740() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0740");
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
    javax.servlet.FilterConfig filterConfig15 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig15);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass19 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0741() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0741");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
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
  public void test0742() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0742");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str13, "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0743() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0743");
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
    javax.servlet.FilterConfig filterConfig14 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig14);
    java.lang.Class<?> wildcardClass16 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0744() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0744");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("float/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "float/cluster/cluster" + "'", str13,
        "float/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0745() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0745");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str9, "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0746() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0746");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass12 = response11.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0747() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0747");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0748() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0748");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "node-index", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0749() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0749");
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
  public void test0750() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0750");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "index/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "index/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str15, "index/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0751() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0751");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/cluster/cluster" + "'", str7,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0752() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0752");
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
  public void test0753() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0753");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("boolean/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str7,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "relationship/cluster/cluster" + "'",
        str9, "relationship/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean/cluster/cluster" + "'", str11,
        "boolean/cluster/cluster");
  }

  @Test
  public void test0754() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0754");
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
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0755() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0755");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("shorts");
    java.lang.String str14 = gdbClusterApi4.reavpaString("characters/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster" + "'", str8,
        "paths/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str10,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "shorts/cluster" + "'", str12,
        "shorts/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "characters/cluster/cluster/cluster" + "'", str14,
        "characters/cluster/cluster/cluster");
  }

  @Test
  public void test0756() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0756");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0757() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0757");
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
  public void test0758() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0758");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integer");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster" + "'", str7,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0759() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0759");
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "relationship/cluster/cluster" + "'",
        str15, "relationship/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0760() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0760");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("character/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "character/cluster/cluster/cluster" + "'", str14,
        "character/cluster/cluster/cluster");
  }

  @Test
  public void test0761() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0761");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "longs/cluster" + "'", str12,
        "longs/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0762() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0762");
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
  public void test0763() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0763");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "relationship-index/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
            + "relationship-index/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "relationship-index/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0764() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0764");
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
    java.util.regex.Pattern[] patternArray13 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList14 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean15 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList14, patternArray13);
    org.neo4j.logging.LogProvider logProvider16 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier17 = null;
    org.neo4j.server.web.WebServer webServer18 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl19 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider16,
        authManagerSupplier17, webServer18);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider40,
        authManagerSupplier41, webServer42);
    org.neo4j.logging.LogProvider logProvider44 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier45 = null;
    org.neo4j.server.web.WebServer webServer46 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl47 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider44,
        authManagerSupplier45, webServer46);
    org.neo4j.logging.LogProvider logProvider48 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier49 = null;
    org.neo4j.server.web.WebServer webServer50 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl51 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider48,
        authManagerSupplier49, webServer50);
    org.neo4j.logging.LogProvider logProvider52 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier53 = null;
    org.neo4j.server.web.WebServer webServer54 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl55 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider52,
        authManagerSupplier53, webServer54);
    org.neo4j.logging.LogProvider logProvider56 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier57 = null;
    org.neo4j.server.web.WebServer webServer58 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl59 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider56,
        authManagerSupplier57, webServer58);
    org.neo4j.logging.LogProvider logProvider60 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier61 = null;
    org.neo4j.server.web.WebServer webServer62 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl63 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider60,
        authManagerSupplier61, webServer62);
    org.neo4j.logging.LogProvider logProvider64 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier65 = null;
    org.neo4j.server.web.WebServer webServer66 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl67 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList14, logProvider64,
        authManagerSupplier65, webServer66);
    try {
      authorizationModuleEnterpriseImpl67.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test0765() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0765");
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
  public void test0766() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0766");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster/cluster" + "'", str6,
        "integers/cluster/cluster");
  }

  @Test
  public void test0767() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0767");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
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
  public void test0768() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0768");
    }
    org.neo4j.graphdb.config.Setting<java.lang.Boolean> booleanSetting0 = io.github.onograph.server.ConfigurableServerSettings.browser_retain_editor_history;
    java.lang.Class<?> wildcardClass1 = booleanSetting0.getClass();
    org.junit.Assert.assertNotNull(booleanSetting0);
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0769() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0769");
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
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
    javax.servlet.FilterConfig filterConfig20 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig20);
  }

  @Test
  public void test0770() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0770");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0771() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0771");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0772() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0772");
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
  public void test0773() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0773");
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
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!/cluster" + "'", str18,
        "hi!/cluster");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0774() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0774");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "integer/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0775() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0775");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0776() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0776");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("doubles/cluster/cluster");
    java.lang.Class<?> wildcardClass8 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str7, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0777() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0777");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    java.lang.String str19 = gdbClusterApi4.reavpaString(
        "dbms/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "dbms/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str19, "dbms/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test0778() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0778");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("uri/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uri/cluster/cluster/cluster" + "'",
        str14, "uri/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0779() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0779");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0780() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0780");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0781() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0781");
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
    authorizationModuleEnterpriseImpl32.stop();
    authorizationModuleEnterpriseImpl32.stop();
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
  public void test0782() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0782");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
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
  public void test0783() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0783");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("db/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "db/cluster/cluster/cluster/cluster" + "'", str8,
        "db/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0784() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0784");
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
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0785() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0785");
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
  public void test0786() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0786");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-type/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("byte/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "byte/cluster/cluster/cluster" + "'",
        str9, "byte/cluster/cluster/cluster");
  }

  @Test
  public void test0787() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0787");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0788() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0788");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
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
  public void test0789() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0789");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    java.lang.Class<?> wildcardClass12 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0790() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0790");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("plugins/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "plugins/cluster/cluster" + "'", str8,
        "plugins/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0791() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0791");
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
  public void test0792() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0792");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0793() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0793");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("uri-template");
    java.lang.String str8 = gdbClusterApi4.reavpaString("character");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uri-template/cluster" + "'", str6,
        "uri-template/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "character/cluster" + "'", str8,
        "character/cluster");
  }

  @Test
  public void test0794() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0794");
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
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0795() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0795");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString("string/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster" + "'", str13,
        "map/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "string/cluster/cluster" + "'", str16,
        "string/cluster/cluster");
  }

  @Test
  public void test0796() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0796");
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
  public void test0797() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0797");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass19 = response18.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0798() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0798");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("bytes/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0799() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0799");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
            + "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str15,
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0800() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0800");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0801() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0801");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0802() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0802");
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
  public void test0803() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0803");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
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
  public void test0804() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0804");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0805() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0805");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("index");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "strings/cluster/cluster" + "'", str11,
        "strings/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index/cluster" + "'", str15,
        "index/cluster");
  }

  @Test
  public void test0806() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0806");
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
    authorizationModuleEnterpriseImpl42.stop();
    authorizationModuleEnterpriseImpl42.stop();
    try {
      authorizationModuleEnterpriseImpl42.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray8);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
  }

  @Test
  public void test0807() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0807");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "index/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "index/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str12, "index/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0808() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0808");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("map/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "map/cluster/cluster/cluster" + "'",
        str15, "map/cluster/cluster/cluster");
  }

  @Test
  public void test0809() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0809");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0810() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0810");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("db/cluster/cluster");
    java.lang.String str17 = gdbClusterApi4.reavpaString("map");
    java.lang.String str19 = gdbClusterApi4.reavpaString("floats");
    java.lang.String str21 = gdbClusterApi4.reavpaString("shorts");
    java.lang.String str23 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "doubles/cluster" + "'", str13,
        "doubles/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "db/cluster/cluster/cluster" + "'",
        str15, "db/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "map/cluster" + "'", str17,
        "map/cluster");
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "floats/cluster" + "'", str19,
        "floats/cluster");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "shorts/cluster" + "'", str21,
        "shorts/cluster");
    org.junit.Assert.assertEquals(
        "'" + str23 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str23,
        "db/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0811() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0811");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0812() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0812");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("doubles");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "doubles/cluster" + "'", str14,
        "doubles/cluster");
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test0813() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0813");
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
  public void test0814() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0814");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0815() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0815");
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
  public void test0816() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0816");
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
  public void test0817() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0817");
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
  public void test0818() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0818");
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
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0819() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0819");
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
    authorizationModuleEnterpriseImpl47.stop();
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
  public void test0820() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0820");
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
    java.util.regex.Pattern[] patternArray17 = new java.util.regex.Pattern[]{};
    java.util.ArrayList<java.util.regex.Pattern> patternList18 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean19 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList18, patternArray17);
    org.neo4j.logging.LogProvider logProvider20 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier21 = null;
    org.neo4j.server.web.WebServer webServer22 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl23 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config16, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider20,
        authManagerSupplier21, webServer22);
    org.neo4j.logging.LogProvider logProvider24 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier25 = null;
    org.neo4j.server.web.WebServer webServer26 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl27 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config15, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider24,
        authManagerSupplier25, webServer26);
    org.neo4j.logging.LogProvider logProvider28 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier29 = null;
    org.neo4j.server.web.WebServer webServer30 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl31 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider28,
        authManagerSupplier29, webServer30);
    org.neo4j.logging.LogProvider logProvider32 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier33 = null;
    org.neo4j.server.web.WebServer webServer34 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl35 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider32,
        authManagerSupplier33, webServer34);
    org.neo4j.logging.LogProvider logProvider36 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier37 = null;
    org.neo4j.server.web.WebServer webServer38 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl39 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider36,
        authManagerSupplier37, webServer38);
    org.neo4j.logging.LogProvider logProvider40 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier41 = null;
    org.neo4j.server.web.WebServer webServer42 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl43 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider40,
        authManagerSupplier41, webServer42);
    org.neo4j.logging.LogProvider logProvider44 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier45 = null;
    org.neo4j.server.web.WebServer webServer46 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl47 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider44,
        authManagerSupplier45, webServer46);
    org.neo4j.logging.LogProvider logProvider48 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier49 = null;
    org.neo4j.server.web.WebServer webServer50 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl51 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider48,
        authManagerSupplier49, webServer50);
    org.neo4j.logging.LogProvider logProvider52 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier53 = null;
    org.neo4j.server.web.WebServer webServer54 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl55 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider52,
        authManagerSupplier53, webServer54);
    org.neo4j.logging.LogProvider logProvider56 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier57 = null;
    org.neo4j.server.web.WebServer webServer58 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl59 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider56,
        authManagerSupplier57, webServer58);
    org.neo4j.logging.LogProvider logProvider60 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier61 = null;
    org.neo4j.server.web.WebServer webServer62 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl63 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider60,
        authManagerSupplier61, webServer62);
    org.neo4j.logging.LogProvider logProvider64 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier65 = null;
    org.neo4j.server.web.WebServer webServer66 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl67 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider64,
        authManagerSupplier65, webServer66);
    org.neo4j.logging.LogProvider logProvider68 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier69 = null;
    org.neo4j.server.web.WebServer webServer70 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl71 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider68,
        authManagerSupplier69, webServer70);
    org.neo4j.logging.LogProvider logProvider72 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier73 = null;
    org.neo4j.server.web.WebServer webServer74 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl75 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider72,
        authManagerSupplier73, webServer74);
    org.neo4j.logging.LogProvider logProvider76 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier77 = null;
    org.neo4j.server.web.WebServer webServer78 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl79 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider76,
        authManagerSupplier77, webServer78);
    org.neo4j.logging.LogProvider logProvider80 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier81 = null;
    org.neo4j.server.web.WebServer webServer82 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl83 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider80,
        authManagerSupplier81, webServer82);
    org.neo4j.logging.LogProvider logProvider84 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier85 = null;
    org.neo4j.server.web.WebServer webServer86 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl87 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList18, logProvider84,
        authManagerSupplier85, webServer86);
    try {
      authorizationModuleEnterpriseImpl87.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
  }

  @Test
  public void test0821() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0821");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0822() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0822");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str10, "nodes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0823() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0823");
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
  public void test0824() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0824");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0825() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0825");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0826() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0826");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0827() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0827");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("shorts");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "shorts/cluster" + "'", str13,
        "shorts/cluster");
  }

  @Test
  public void test0828() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0828");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-index/cluster/cluster");
    java.lang.String str14 = gdbClusterApi4.reavpaString("relationships");
    java.lang.String str16 = gdbClusterApi4.reavpaString("integer/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-index/cluster/cluster/cluster" + "'", str12,
        "relationship-index/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "relationships/cluster" + "'", str14,
        "relationships/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "integer/cluster/cluster" + "'", str16,
        "integer/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test0829() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0829");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    java.lang.String str8 = gdbClusterApi4.reavpaString("longs");
    java.lang.String str10 = gdbClusterApi4.reavpaString("integer");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "longs/cluster" + "'", str8,
        "longs/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "integer/cluster" + "'", str10,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0830() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0830");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("relationship-index/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "nodes/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship-index/cluster/cluster" + "'", str8,
        "relationship-index/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "nodes/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str11, "nodes/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0831() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0831");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig2 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig2);
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
  public void test0832() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0832");
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
  public void test0833() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0833");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("paths/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "paths/cluster/cluster/cluster" + "'",
        str11, "paths/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0834() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0834");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("strings/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str10, "strings/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0835() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0835");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
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
  public void test0836() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0836");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "paths/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0837() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0837");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster/cluster" + "'", str8,
        "/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0838() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0838");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("plugins");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster" + "'", str9, "uri/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "plugins/cluster" + "'", str15,
        "plugins/cluster");
  }

  @Test
  public void test0839() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0839");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
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
  public void test0840() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0840");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("floats");
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "floats/cluster" + "'", str11,
        "floats/cluster");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0841() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0841");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "integers/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0842() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0842");
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
  public void test0843() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0843");
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
  public void test0844() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0844");
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
    java.lang.Class<?> wildcardClass24 = patternList6.getClass();
    org.junit.Assert.assertNotNull(pattern4);
    org.junit.Assert.assertEquals(pattern4.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(wildcardClass24);
  }

  @Test
  public void test0845() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0845");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
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
  public void test0846() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0846");
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
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
  }

  @Test
  public void test0847() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0847");
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
    javax.servlet.FilterConfig filterConfig20 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig20);
    javax.servlet.ServletRequest servletRequest22 = null;
    javax.servlet.ServletResponse servletResponse23 = null;
    javax.servlet.FilterChain filterChain24 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest22, servletResponse23,
          filterChain24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0848() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0848");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("doubles");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "doubles/cluster" + "'", str8,
        "doubles/cluster");
  }

  @Test
  public void test0849() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0849");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0850() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0850");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
    javax.servlet.FilterConfig filterConfig3 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig3);
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
  public void test0851() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0851");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0852() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0852");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0853() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0853");
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
    java.lang.Class<?> wildcardClass11 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationships/cluster/cluster/cluster" + "'", str10,
        "relationships/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0854() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0854");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0855() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0855");
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
    javax.servlet.ServletRequest servletRequest22 = null;
    javax.servlet.ServletResponse servletResponse23 = null;
    javax.servlet.FilterChain filterChain24 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest22, servletResponse23,
          filterChain24);
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
    java.lang.Class<?> wildcardClass13 = response12.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0857() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0857");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "/cluster/cluster/cluster",
        outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0858() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0858");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0859() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0859");
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
  public void test0860() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0860");
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
  public void test0861() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0861");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test0862() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0862");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "float/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0863() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0863");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("doubles/cluster");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "doubles/cluster/cluster" + "'", str18,
        "doubles/cluster/cluster");
  }

  @Test
  public void test0864() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0864");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
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
  public void test0865() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0865");
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
  public void test0866() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0866");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("shorts/cluster");
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "node/cluster" + "'", str13,
        "node/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "shorts/cluster/cluster" + "'", str15,
        "shorts/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0867() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0867");
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
  public void test0868() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0868");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
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
  public void test0869() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0869");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test0870() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0870");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("integers/cluster/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("float");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "integers/cluster/cluster/cluster/cluster" + "'", str14,
        "integers/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "float/cluster" + "'", str16,
        "float/cluster");
  }

  @Test
  public void test0871() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0871");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "relationships/cluster" + "'", str12,
        "relationships/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0872() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0872");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster" + "'", str9, "uri/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/cluster" + "'", str14, "/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0873() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0873");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("db/cluster/cluster");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.sttResponse();
    java.lang.Class<?> wildcardClass20 = response19.getClass();
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "db/cluster/cluster/cluster" + "'",
        str17, "db/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test0874() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0874");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "booleans/cluster" + "'", str17,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test0875() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0875");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("uri/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("index/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster/cluster" + "'", str9,
        "uri/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index/cluster/cluster/cluster" + "'",
        str11, "index/cluster/cluster/cluster");
  }

  @Test
  public void test0876() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0876");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("dbms/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dbms/cluster/cluster" + "'", str6,
        "dbms/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0877() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0877");
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
  public void test0878() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0878");
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
  public void test0879() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0879");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0880() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0880");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("plugins/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "plugins/cluster/cluster/cluster/cluster" + "'", str7,
        "plugins/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0881() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0881");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("bytes/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nodes/cluster" + "'", str12,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "bytes/cluster/cluster/cluster/cluster" + "'", str15,
        "bytes/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0882() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0882");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("node");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "node/cluster" + "'", str10,
        "node/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0883() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0883");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0884() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0884");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "long", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0885() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0885");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "character/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "character/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str15, "character/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0886() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0886");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0887() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0887");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("byte/cluster");
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "byte/cluster/cluster" + "'", str9,
        "byte/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0888() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0888");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("boolean");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "path/cluster" + "'", str8,
        "path/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str11,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean/cluster" + "'", str15,
        "boolean/cluster");
  }

  @Test
  public void test0889() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0889");
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
  public void test0890() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0890");
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
  public void test0891() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0891");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("node-index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "node-index/cluster/cluster/cluster/cluster" + "'", str12,
        "node-index/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0892() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0892");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("relationships/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "relationships/cluster/cluster/cluster/cluster" + "'", str18,
        "relationships/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0893() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0893");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
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
  }

  @Test
  public void test0894() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0894");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "longs", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("byte/cluster/cluster/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "byte/cluster/cluster/cluster/cluster" + "'", str6,
        "byte/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/cluster" + "'", str8, "/cluster");
  }

  @Test
  public void test0895() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0895");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster" + "'", str11, "/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0896() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0896");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0897() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0897");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("longs");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "longs/cluster" + "'", str11,
        "longs/cluster");
  }

  @Test
  public void test0898() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0898");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("uri/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uri/cluster/cluster/cluster" + "'",
        str13, "uri/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test0899() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0899");
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
  public void test0900() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0900");
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
    java.lang.String str20 = gdbClusterApi4.reavpaString("relationship-index/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "relationship-index/cluster/cluster/cluster" + "'", str20,
        "relationship-index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test0901() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0901");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0902() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0902");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0903() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0903");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "graphdb/cluster" + "'", str11,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0904() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0904");
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
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
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
  public void test0905() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0905");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "bytes/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str6, "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0906() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0906");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "relationship-index/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "relationship-index/cluster/cluster/cluster/cluster/cluster" + "'",
        str13, "relationship-index/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0907() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0907");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass10 = response9.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0908() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0908");
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
  public void test0909() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0909");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0910() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0910");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
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
  public void test0911() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0911");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass13 = response12.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster" + "'", str9, "uri/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "float/cluster/cluster" + "'", str11,
        "float/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0912() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0912");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
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
  public void test0913() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0913");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str9, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0914() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0914");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("graphdb");
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "doubles/cluster" + "'", str13,
        "doubles/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "graphdb/cluster" + "'", str15,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0915() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0915");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes/cluster");
    java.lang.Class<?> wildcardClass7 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster/cluster" + "'", str6,
        "nodes/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0916() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0916");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test0917() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0917");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster" + "'", str8,
        "paths/cluster");
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str10,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test0918() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0918");
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
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
  }

  @Test
  public void test0919() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0919");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0920() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0920");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "index", outputFormat3);
  }

  @Test
  public void test0921() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0921");
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
  public void test0922() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0922");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0923() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0923");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0924() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0924");
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
    java.lang.Class<?> wildcardClass16 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test0925() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0925");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response19 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/cluster" + "'", str18, "/cluster");
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test0926() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0926");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0927() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0927");
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
  public void test0928() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0928");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integer");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster" + "'", str7,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0929() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0929");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str7,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0930() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0930");
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
  public void test0931() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0931");
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
  public void test0932() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0932");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
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
  public void test0933() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0933");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("string/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "plugins/cluster/cluster" + "'", str9,
        "plugins/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "node-index/cluster" + "'", str11,
        "node-index/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "string/cluster/cluster/cluster/cluster" + "'", str14,
        "string/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0934() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0934");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "map/cluster" + "'", str13,
        "map/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test0935() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0935");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("strings");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "short/cluster" + "'", str10,
        "short/cluster");
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-type/cluster/cluster" + "'", str12,
        "relationship-type/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "strings/cluster" + "'", str14,
        "strings/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0936() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0936");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship-index/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship-index/cluster/cluster" + "'", str9,
        "relationship-index/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0937() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0937");
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
    javax.servlet.FilterConfig filterConfig15 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig15);
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
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
  public void test0938() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0938");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("integers/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "integers/cluster/cluster" + "'", str12,
        "integers/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/cluster" + "'", str15, "/cluster");
  }

  @Test
  public void test0939() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0939");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "path/cluster" + "'", str10,
        "path/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0940() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0940");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0941() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0941");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "map/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0942() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0942");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
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
  public void test0943() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0943");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bytes/cluster/cluster" + "'", str6,
        "bytes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "map/cluster" + "'", str8, "map/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test0944() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0944");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    java.lang.String str19 = gdbClusterApi4.reavpaString(
        "dbms/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.wraeResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '" + "dbms/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str19, "dbms/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test0945() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0945");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "integers/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0946() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0946");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
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
  public void test0947() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0947");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster" + "'", str10,
        "doubles/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test0948() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0948");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0949() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0949");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "relationship-index/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0950() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0950");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("integer/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship-type/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "integer/cluster/cluster/cluster/cluster" + "'", str9,
        "integer/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0951() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0951");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString(
        "integers/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/cluster" + "'", str11, "/cluster");
  }

  @Test
  public void test0952() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0952");
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
  public void test0953() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0953");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db/cluster/cluster" + "'", str7,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0954() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0954");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("long/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "long/cluster/cluster" + "'", str13,
        "long/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0955() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0955");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("properties");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "properties/cluster" + "'", str11,
        "properties/cluster");
  }

  @Test
  public void test0956() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0956");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("relationship-type");
    java.lang.String str8 = gdbClusterApi4.reavpaString("paths/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationships");
    java.lang.String str14 = gdbClusterApi4.reavpaString("shorts/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "relationship-type/cluster" + "'", str6,
        "relationship-type/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "paths/cluster/cluster/cluster" + "'",
        str8, "paths/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "relationships/cluster" + "'", str12,
        "relationships/cluster");
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "shorts/cluster/cluster/cluster/cluster" + "'", str14,
        "shorts/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0957() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0957");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "nodes/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test0958() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0958");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass9 = response8.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0959() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0959");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "booleans/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test0960() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0960");
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
  public void test0961() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0961");
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
  public void test0962() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0962");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "doubles/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0963() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0963");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("paths");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.Class<?> wildcardClass14 = response13.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "paths/cluster" + "'", str12,
        "paths/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0964() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0964");
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
  public void test0965() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0965");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
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
  public void test0966() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0966");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "doubles/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0967() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0967");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test0968() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0968");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0969() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0969");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test0970() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0970");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("long");
    java.lang.String str8 = gdbClusterApi4.reavpaString("bytes/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("plugin/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "long/cluster" + "'", str6,
        "long/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bytes/cluster/cluster/cluster" + "'",
        str8, "bytes/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "plugin/cluster/cluster/cluster/cluster" + "'", str11,
        "plugin/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0971() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0971");
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
    try {
      authorizationModuleEnterpriseImpl57.start();
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(patternArray11);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
  }

  @Test
  public void test0972() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0972");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
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
  public void test0973() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0973");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0974() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0974");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationships", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("integer");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster" + "'", str7,
        "integer/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test0975() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0975");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    java.lang.String str17 = gdbClusterApi4.reavpaString("hi!/cluster/cluster");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!/cluster/cluster/cluster" + "'",
        str17, "hi!/cluster/cluster/cluster");
  }

  @Test
  public void test0976() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0976");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass12 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0977() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0977");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "double", outputFormat3);
  }

  @Test
  public void test0978() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0978");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes/cluster/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0979() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0979");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test0980() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0980");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("long/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("boolean/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "long/cluster/cluster" + "'", str14,
        "long/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "boolean/cluster/cluster/cluster/cluster" + "'", str16,
        "boolean/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0981() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0981");
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
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
  public void test0982() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0982");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "booleans", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test0983() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0983");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte/cluster/cluster", outputFormat3);
    java.lang.Class<?> wildcardClass5 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0984() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0984");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integers");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("bytes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "bytes/cluster/cluster/cluster/cluster/cluster" + "'", str10,
        "bytes/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0985() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0985");
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
    authorizationModuleEnterpriseImpl82.stop();
    authorizationModuleEnterpriseImpl82.stop();
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
  public void test0986() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0986");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString("");
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster" + "'", str9, "uri/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/cluster" + "'", str14, "/cluster");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0987() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0987");
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
    javax.servlet.FilterConfig filterConfig15 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig15);
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
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
  public void test0988() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0988");
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
  public void test0989() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0989");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test0990() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0990");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "characters/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("long/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "long/cluster/cluster/cluster/cluster" + "'", str7,
        "long/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test0991() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0991");
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
    authorizationModuleEnterpriseImpl13.stop();
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
  public void test0992() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0992");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("");
    java.lang.Class<?> wildcardClass19 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/cluster" + "'", str18, "/cluster");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0993() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0993");
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
    java.lang.Class<?> wildcardClass17 = response16.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0994() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0994");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "character", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass7 = response6.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0995() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0995");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    javax.servlet.FilterConfig filterConfig1 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig1);
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
  public void test0996() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0996");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("uri/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("string/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uri/cluster/cluster/cluster" + "'",
        str13, "uri/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "string/cluster/cluster" + "'", str15,
        "string/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test0997() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0997");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "db/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test0998() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0998");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test0999() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test0999");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test1000() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest1.test1000");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
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
}

