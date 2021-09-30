package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest6 {

  public static boolean debug = false;

  @Test
  public void test3001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3001");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("graphdb");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("long/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "graphdb/cluster" + "'", str6,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster" + "'", str9,
        "long/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test3002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3002");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("plugins/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "plugins/cluster/cluster/cluster" + "'",
        str11, "plugins/cluster/cluster/cluster");
  }

  @Test
  public void test3003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3003");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    java.lang.String str9 = gdbClusterApi4.reavpaString("nodes/cluster/cluster/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("path");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "nodes/cluster/cluster/cluster/cluster" + "'", str9,
        "nodes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "path/cluster" + "'", str11,
        "path/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test3004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3004");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship/cluster/cluster/cluster" + "'", str8,
        "relationship/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test3005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3005");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("shorts/cluster/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str9,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "shorts/cluster/cluster/cluster" + "'",
        str11, "shorts/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "shorts/cluster" + "'", str13,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3006");
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
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
  }

  @Test
  public void test3007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3007");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str11,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test3008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3008");
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
  public void test3009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3009");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test3010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3010");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test3011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3011");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str8, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test3012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3012");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString("shorts");
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "shorts/cluster" + "'", str17,
        "shorts/cluster");
  }

  @Test
  public void test3013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3013");
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
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
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
  public void test3014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3014");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "relationships/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "relationships/cluster/cluster/cluster/cluster/cluster" + "'",
        str14, "relationships/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3015");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.ServletRequest servletRequest27 = null;
    javax.servlet.ServletResponse servletResponse28 = null;
    javax.servlet.FilterChain filterChain29 = null;
    try {
      authorizationDisabledFilterEnterpriseImpl0.doFilter(servletRequest27, servletResponse28,
          filterChain29);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test3016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3016");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test3017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3017");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "dbms/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test3018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3018");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("short/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "short/cluster/cluster" + "'", str14,
        "short/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test3019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3019");
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
    javax.ws.rs.core.Response response21 = gdbClusterApi4.wraeResponse();
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
  }

  @Test
  public void test3020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3020");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test3021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3021");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str11,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test3022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3022");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("graphdb");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "graphdb/cluster" + "'", str6,
        "graphdb/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test3023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3023");
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
    java.lang.Class<?> wildcardClass11 = response10.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "integer/cluster/cluster/cluster" + "'",
        str9, "integer/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test3024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3024");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.sttResponse();
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
  public void test3025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3025");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "long/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster/cluster/cluster" + "'",
        str6, "nodes/cluster/cluster/cluster");
  }

  @Test
  public void test3026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3026");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig13 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig13);
  }

  @Test
  public void test3027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3027");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("index");
    java.lang.String str10 = gdbClusterApi4.reavpaString("doubles/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str10, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test3028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3028");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "strings", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString("db/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("plugins/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.sttResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("bytes/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "db/cluster/cluster" + "'", str8,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "plugins/cluster/cluster" + "'", str11,
        "plugins/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "bytes/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "bytes/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3029");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
    javax.servlet.FilterConfig filterConfig19 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig19);
  }

  @Test
  public void test3030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3030");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("strings/cluster/cluster");
    javax.ws.rs.core.Response response14 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "strings/cluster/cluster/cluster" + "'",
        str13, "strings/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test3031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3031");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test3032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3032");
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
    java.lang.String str14 = gdbClusterApi4.reavpaString(
        "bytes/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db/cluster/cluster" + "'", str10,
        "db/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "bytes/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str14, "bytes/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3033");
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
    javax.servlet.FilterConfig filterConfig10 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig10);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test3034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3034");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("paths/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString(
        "bytes/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "doubles/cluster" + "'", str13,
        "doubles/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "paths/cluster/cluster/cluster" + "'",
        str15, "paths/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "bytes/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str18, "bytes/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3035");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test3036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3036");
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
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
  }

  @Test
  public void test3037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3037");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
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
  public void test3038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3038");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test3039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3039");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test3040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3040");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "integer/cluster/cluster" + "'", str7,
        "integer/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean/cluster/cluster/cluster" + "'",
        str10, "boolean/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "db/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "db/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3041");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.reoyResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("shorts/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "shorts/cluster/cluster" + "'", str7,
        "shorts/cluster/cluster");
  }

  @Test
  public void test3042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3042");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str10, "strings/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test3043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3043");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    javax.ws.rs.core.Response response19 = gdbClusterApi4.diceResponse();
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
        "'" + str18 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str18,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response19);
  }

  @Test
  public void test3044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3044");
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
  public void test3045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3045");
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
    authorizationModuleEnterpriseImpl12.stop();
    authorizationModuleEnterpriseImpl12.stop();
    org.junit.Assert.assertNotNull(patternArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test3046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3046");
    }
    io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl authorizationDisabledFilterEnterpriseImpl0 = new io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    authorizationDisabledFilterEnterpriseImpl0.destroy();
    javax.servlet.FilterConfig filterConfig6 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig6);
  }

  @Test
  public void test3047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3047");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("integer/cluster/cluster/cluster");
    java.lang.String str16 = gdbClusterApi4.reavpaString("doubles/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "integer/cluster/cluster/cluster/cluster" + "'", str14,
        "integer/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "doubles/cluster/cluster/cluster/cluster" + "'", str16,
        "doubles/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3048");
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
    authorizationModuleEnterpriseImpl47.stop();
    org.junit.Assert.assertNotNull(patternArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test3049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3049");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    java.lang.Class<?> wildcardClass8 = response7.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test3050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3050");
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
    java.util.regex.Pattern pattern17 = io.github.onograph.server.rest.cluster.DbmsApi.dbclrupanPattern();
    java.util.regex.Pattern[] patternArray18 = new java.util.regex.Pattern[]{pattern17};
    java.util.ArrayList<java.util.regex.Pattern> patternList19 = new java.util.ArrayList<java.util.regex.Pattern>();
    boolean boolean20 = java.util.Collections.addAll(
        (java.util.Collection<java.util.regex.Pattern>) patternList19, patternArray18);
    org.neo4j.logging.LogProvider logProvider21 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier22 = null;
    org.neo4j.server.web.WebServer webServer23 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl24 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config16, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider21,
        authManagerSupplier22, webServer23);
    org.neo4j.logging.LogProvider logProvider25 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier26 = null;
    org.neo4j.server.web.WebServer webServer27 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl28 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config15, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider25,
        authManagerSupplier26, webServer27);
    org.neo4j.logging.LogProvider logProvider29 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier30 = null;
    org.neo4j.server.web.WebServer webServer31 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl32 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config14, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider29,
        authManagerSupplier30, webServer31);
    org.neo4j.logging.LogProvider logProvider33 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier34 = null;
    org.neo4j.server.web.WebServer webServer35 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl36 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config13, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider33,
        authManagerSupplier34, webServer35);
    org.neo4j.logging.LogProvider logProvider37 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier38 = null;
    org.neo4j.server.web.WebServer webServer39 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl40 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config12, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider37,
        authManagerSupplier38, webServer39);
    org.neo4j.logging.LogProvider logProvider41 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier42 = null;
    org.neo4j.server.web.WebServer webServer43 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl44 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config11, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider41,
        authManagerSupplier42, webServer43);
    org.neo4j.logging.LogProvider logProvider45 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier46 = null;
    org.neo4j.server.web.WebServer webServer47 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl48 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config10, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider45,
        authManagerSupplier46, webServer47);
    org.neo4j.logging.LogProvider logProvider49 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier50 = null;
    org.neo4j.server.web.WebServer webServer51 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl52 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config9, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider49,
        authManagerSupplier50, webServer51);
    org.neo4j.logging.LogProvider logProvider53 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier54 = null;
    org.neo4j.server.web.WebServer webServer55 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl56 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config8, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider53,
        authManagerSupplier54, webServer55);
    org.neo4j.logging.LogProvider logProvider57 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier58 = null;
    org.neo4j.server.web.WebServer webServer59 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl60 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config7, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider57,
        authManagerSupplier58, webServer59);
    org.neo4j.logging.LogProvider logProvider61 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier62 = null;
    org.neo4j.server.web.WebServer webServer63 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl64 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config6, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider61,
        authManagerSupplier62, webServer63);
    org.neo4j.logging.LogProvider logProvider65 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier66 = null;
    org.neo4j.server.web.WebServer webServer67 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl68 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config5, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider65,
        authManagerSupplier66, webServer67);
    org.neo4j.logging.LogProvider logProvider69 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier70 = null;
    org.neo4j.server.web.WebServer webServer71 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl72 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config4, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider69,
        authManagerSupplier70, webServer71);
    org.neo4j.logging.LogProvider logProvider73 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier74 = null;
    org.neo4j.server.web.WebServer webServer75 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl76 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config3, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider73,
        authManagerSupplier74, webServer75);
    org.neo4j.logging.LogProvider logProvider77 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier78 = null;
    org.neo4j.server.web.WebServer webServer79 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl80 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config2, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider77,
        authManagerSupplier78, webServer79);
    org.neo4j.logging.LogProvider logProvider81 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier82 = null;
    org.neo4j.server.web.WebServer webServer83 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl84 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config1, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider81,
        authManagerSupplier82, webServer83);
    org.neo4j.logging.LogProvider logProvider85 = null;
    java.util.function.Supplier<org.neo4j.kernel.api.security.AuthManager> authManagerSupplier86 = null;
    org.neo4j.server.web.WebServer webServer87 = null;
    io.github.onograph.server.AuthorizationModuleEnterpriseImpl authorizationModuleEnterpriseImpl88 = new io.github.onograph.server.AuthorizationModuleEnterpriseImpl(
        config0, (java.util.List<java.util.regex.Pattern>) patternList19, logProvider85,
        authManagerSupplier86, webServer87);
    authorizationModuleEnterpriseImpl88.stop();
    authorizationModuleEnterpriseImpl88.stop();
    org.junit.Assert.assertNotNull(pattern17);
    org.junit.Assert.assertEquals(pattern17.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray18);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
  }

  @Test
  public void test3051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3051");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test3052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3052");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString(
        "boolean/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index/cluster" + "'", str8,
        "index/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "boolean/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str15, "boolean/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3053");
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
    java.lang.String str17 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster");
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
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'",
        str17, "relationship/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3054");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test3055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3055");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test3056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3056");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test3057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3057");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "boolean", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test3058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3058");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "dbms/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test3059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3059");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    java.lang.String str13 = gdbClusterApi4.reavpaString("paths/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "integers/cluster/cluster" + "'", str8,
        "integers/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "paths/cluster/cluster/cluster" + "'",
        str13, "paths/cluster/cluster/cluster");
  }

  @Test
  public void test3060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3060");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "doubles/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integers/cluster" + "'", str6,
        "integers/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "doubles/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str11, "doubles/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3061");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.wraeResponse();
    java.lang.String str22 = gdbClusterApi4.reavpaString("integer/cluster");
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
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "integer/cluster/cluster" + "'", str22,
        "integer/cluster/cluster");
  }

  @Test
  public void test3062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3062");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "doubles/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test3063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3063");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("integer/cluster/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("hi!/cluster/cluster");
    java.lang.String str10 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "integer/cluster/cluster/cluster" + "'",
        str6, "integer/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!/cluster/cluster/cluster" + "'", str8,
        "hi!/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/cluster" + "'", str10, "/cluster");
  }

  @Test
  public void test3064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3064");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "relationship-type/cluster/cluster/cluster/cluster");
    java.lang.String str18 = gdbClusterApi4.reavpaString("");
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
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "relationship-type/cluster/cluster/cluster/cluster/cluster" + "'",
        str16, "relationship-type/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/cluster" + "'", str18, "/cluster");
  }

  @Test
  public void test3065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3065");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test3066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3066");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "node/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("db/cluster/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "db/cluster/cluster/cluster" + "'", str6,
        "db/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test3067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3067");
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
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertNotNull(response15);
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test3068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3068");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass15 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/cluster" + "'", str12, "/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test3069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3069");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test3070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3070");
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
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
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
  public void test3071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3071");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte/cluster/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
  }

  @Test
  public void test3072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3072");
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
    javax.servlet.FilterConfig filterConfig17 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig17);
  }

  @Test
  public void test3073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3073");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test3074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3074");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.diceResponse();
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
  public void test3075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3075");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.reoyResponse();
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
  public void test3076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3076");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("doubles/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "doubles/cluster/cluster" + "'", str6,
        "doubles/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
  }

  @Test
  public void test3077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3077");
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
    javax.servlet.FilterConfig filterConfig12 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig12);
    authorizationDisabledFilterEnterpriseImpl0.destroy();
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
  public void test3078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3078");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("float/cluster/cluster");
    javax.ws.rs.core.Response response17 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response18 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "float/cluster/cluster/cluster" + "'",
        str16, "float/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(response18);
  }

  @Test
  public void test3079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3079");
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
    authorizationModuleEnterpriseImpl5.stop();
  }

  @Test
  public void test3080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3080");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "strings/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uri/cluster" + "'", str7, "uri/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str13, "strings/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3081");
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
  public void test3082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3082");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString(
        "dbms/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str12, "dbms/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test3083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3083");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    java.lang.String str12 = gdbClusterApi4.reavpaString("relationship-type/cluster");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals(
        "'" + str12 + "' != '" + "relationship-type/cluster/cluster" + "'", str12,
        "relationship-type/cluster/cluster");
    org.junit.Assert.assertNotNull(response13);
  }

  @Test
  public void test3084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3084");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("booleans");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.diceResponse();
    java.lang.String str9 = gdbClusterApi4.reavpaString("uri/cluster");
    java.lang.Class<?> wildcardClass10 = gdbClusterApi4.getClass();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "booleans/cluster" + "'", str6,
        "booleans/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uri/cluster/cluster" + "'", str9,
        "uri/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test3085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3085");
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
    java.lang.String str11 = gdbClusterApi4.reavpaString("paths/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "relationship-index/cluster/cluster" + "'", str8,
        "relationship-index/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "paths/cluster/cluster" + "'", str11,
        "paths/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test3086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3086");
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
    javax.ws.rs.core.Response response18 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response19 = gdbClusterApi4.wraeResponse();
    java.lang.String str21 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response22 = gdbClusterApi4.reoyResponse();
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
    org.junit.Assert.assertNotNull(response18);
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertEquals("'" + str21 + "' != '"
            + "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str21,
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response22);
  }

  @Test
  public void test3087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3087");
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
    javax.ws.rs.core.Response response13 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    java.lang.String str16 = gdbClusterApi4.reavpaString(
        "string/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!/cluster" + "'", str9, "hi!/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '" + "string/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str16, "string/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3088");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugin/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster/cluster");
    java.lang.String str8 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.reoyResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str6 + "' != '" + "dbms/cluster/cluster/cluster/cluster/cluster" + "'", str6,
        "dbms/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str8,
        "characters/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str11,
        "relationship/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3089");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass17 = gdbClusterApi4.getClass();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3090");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    java.lang.Class<?> wildcardClass17 = response16.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test3091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3091");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "double/cluster/cluster/cluster",
        outputFormat3);
  }

  @Test
  public void test3092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3092");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "doubles", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test3093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3093");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "map/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals(
        "'" + str8 + "' != '" + "map/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str8,
        "map/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
  }

  @Test
  public void test3094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3094");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship");
    java.lang.String str9 = gdbClusterApi4.reavpaString("relationship/cluster/cluster/cluster");
    javax.ws.rs.core.Response response10 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship/cluster" + "'", str7,
        "relationship/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "relationship/cluster/cluster/cluster/cluster" + "'", str9,
        "relationship/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test3095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3095");
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
    javax.ws.rs.core.Response response11 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response12 = gdbClusterApi4.wraeResponse();
    java.lang.String str14 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "string/cluster" + "'", str7,
        "string/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertEquals(
        "'" + str14 + "' != '" + "dbms/cluster/cluster/cluster/cluster/cluster" + "'", str14,
        "dbms/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test3096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3096");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("graphdb");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "path/cluster/cluster" + "'", str9,
        "path/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "graphdb/cluster" + "'", str13,
        "graphdb/cluster");
  }

  @Test
  public void test3097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3097");
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
    java.lang.String str12 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response13 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/cluster" + "'", str12, "/cluster");
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
  }

  @Test
  public void test3098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3098");
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
    javax.servlet.FilterConfig filterConfig16 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig16);
    javax.servlet.FilterConfig filterConfig18 = null;
    authorizationDisabledFilterEnterpriseImpl0.init(filterConfig18);
    java.lang.Class<?> wildcardClass20 = authorizationDisabledFilterEnterpriseImpl0.getClass();
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test3099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3099");
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
    java.lang.String str10 = gdbClusterApi4.reavpaString("double");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "relationship/cluster/cluster/cluster/cluster/cluster" + "'", str7,
        "relationship/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "double/cluster" + "'", str10,
        "double/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test3100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3100");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "shorts", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test3101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3101");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response11 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str8, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test3102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3102");
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
        "relationship-index/cluster/cluster/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
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
        "'" + str15 + "' != '" + "relationship-index/cluster/cluster/cluster/cluster" + "'", str15,
        "relationship-index/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
  }

  @Test
  public void test3103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3103");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "relationship-type/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("hi!");
    java.lang.String str9 = gdbClusterApi4.reavpaString("");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/cluster" + "'", str9, "/cluster");
  }

  @Test
  public void test3104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3104");
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
    java.lang.String str15 = gdbClusterApi4.reavpaString("relationships/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "character/cluster/cluster" + "'", str9,
        "character/cluster/cluster");
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "relationships/cluster/cluster" + "'",
        str15, "relationships/cluster/cluster");
  }

  @Test
  public void test3105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3105");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    java.lang.String str19 = gdbClusterApi4.reavpaString("");
    javax.ws.rs.core.Response response20 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response21 = gdbClusterApi4.sttResponse();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/cluster" + "'", str19, "/cluster");
    org.junit.Assert.assertNotNull(response20);
    org.junit.Assert.assertNotNull(response21);
  }

  @Test
  public void test3106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3106");
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
    javax.ws.rs.core.Response response16 = gdbClusterApi4.reoyResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString("exception/cluster");
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
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "exception/cluster/cluster" + "'", str18,
        "exception/cluster/cluster");
  }

  @Test
  public void test3107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3107");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.reoyResponse();
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
  }

  @Test
  public void test3108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3108");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "path/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test3109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3109");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "index/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.sttResponse();
    java.lang.String str8 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertEquals("'" + str8 + "' != '"
            + "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str8, "long/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3110");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "plugins", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test3111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3111");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "integers/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.diceResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("relationship-index");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.diceResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("boolean/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "relationship-index/cluster" + "'", str7,
        "relationship-index/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "boolean/cluster/cluster/cluster/cluster" + "'", str10,
        "boolean/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3112");
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
    java.lang.String str18 = gdbClusterApi4.reavpaString("path/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response19 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "path/cluster/cluster/cluster/cluster/cluster" + "'", str18,
        "path/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test3113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3113");
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
    authorizationModuleEnterpriseImpl33.stop();
    authorizationModuleEnterpriseImpl33.stop();
    authorizationModuleEnterpriseImpl33.stop();
    org.junit.Assert.assertNotNull(pattern6);
    org.junit.Assert.assertEquals(pattern6.toString(), "/dbms/cluster.*");
    org.junit.Assert.assertNotNull(patternArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
  }

  @Test
  public void test3114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3114");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "nodes", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("nodes");
    java.lang.String str8 = gdbClusterApi4.reavpaString("shorts");
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString("characters/cluster/cluster/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString("plugin/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("index/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nodes/cluster" + "'", str6,
        "nodes/cluster");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shorts/cluster" + "'", str8,
        "shorts/cluster");
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals(
        "'" + str11 + "' != '" + "characters/cluster/cluster/cluster/cluster" + "'", str11,
        "characters/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "plugin/cluster/cluster/cluster" + "'",
        str13, "plugin/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index/cluster/cluster/cluster" + "'",
        str15, "index/cluster/cluster/cluster");
  }

  @Test
  public void test3115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3115");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString("node-index/cluster/cluster");
    java.lang.Class<?> wildcardClass14 = gdbClusterApi4.getClass();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
    org.junit.Assert.assertNotNull(response11);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "node-index/cluster/cluster/cluster" + "'", str13,
        "node-index/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test3116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3116");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "paths/cluster/cluster/cluster",
        outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("paths");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "paths/cluster" + "'", str6,
        "paths/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test3117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3117");
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
    authorizationDisabledFilterEnterpriseImpl0.destroy();
  }

  @Test
  public void test3118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3118");
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
    java.lang.String str13 = gdbClusterApi4.reavpaString(
        "exception/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '" + "exception/cluster/cluster/cluster/cluster/cluster" + "'", str13,
        "exception/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3119");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "uri", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("hi!");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response9 = gdbClusterApi4.avllResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!/cluster" + "'", str7, "hi!/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str11,
        "db/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
  }

  @Test
  public void test3120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3120");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test3121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3121");
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
    authorizationModuleEnterpriseImpl38.stop();
    authorizationModuleEnterpriseImpl38.stop();
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
  public void test3122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3122");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "path/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("doubles/cluster/cluster");
    javax.ws.rs.core.Response response8 = gdbClusterApi4.wraeResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString(
        "long/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response11 = gdbClusterApi4.avllResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "doubles/cluster/cluster/cluster" + "'",
        str7, "doubles/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "long/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str10, "long/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response11);
  }

  @Test
  public void test3123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3123");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response16 = gdbClusterApi4.diceResponse();
    java.lang.String str18 = gdbClusterApi4.reavpaString(
        "relationships/cluster/cluster/cluster/cluster/cluster");
    javax.ws.rs.core.Response response19 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response20 = gdbClusterApi4.diceResponse();
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
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertEquals(
        "'" + str18 + "' != '" + "relationships/cluster/cluster/cluster/cluster/cluster/cluster"
            + "'", str18, "relationships/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response19);
    org.junit.Assert.assertNotNull(response20);
  }

  @Test
  public void test3124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3124");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "string/cluster/cluster/cluster/cluster",
        outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test3125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3125");
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
    javax.ws.rs.core.Response response9 = gdbClusterApi4.sttResponse();
    java.lang.String str11 = gdbClusterApi4.reavpaString(
        "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '"
            + "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster" + "'", str11,
        "nodes/cluster/cluster/cluster/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3126");
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
    javax.ws.rs.core.Response response17 = gdbClusterApi4.avllResponse();
    java.lang.Class<?> wildcardClass18 = response17.getClass();
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
    org.junit.Assert.assertNotNull(response17);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test3127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3127");
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
    authorizationModuleEnterpriseImpl67.stop();
    authorizationModuleEnterpriseImpl67.stop();
    authorizationModuleEnterpriseImpl67.stop();
    authorizationModuleEnterpriseImpl67.stop();
    authorizationModuleEnterpriseImpl67.stop();
    authorizationModuleEnterpriseImpl67.stop();
    authorizationModuleEnterpriseImpl67.stop();
    org.junit.Assert.assertNotNull(patternArray13);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test3128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3128");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "short", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response6 = gdbClusterApi4.reoyResponse();
    javax.ws.rs.core.Response response7 = gdbClusterApi4.sttResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.avllResponse();
    java.lang.String str10 = gdbClusterApi4.reavpaString("node/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertEquals(
        "'" + str10 + "' != '" + "node/cluster/cluster/cluster/cluster/cluster" + "'", str10,
        "node/cluster/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3129");
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
    javax.ws.rs.core.Response response12 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response13 = gdbClusterApi4.wraeResponse();
    java.lang.String str15 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "character/cluster" + "'", str11,
        "character/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str15,
        "dbms/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3130");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "integers/cluster/cluster/cluster/cluster", outputFormat3);
    java.lang.String str6 = gdbClusterApi4.reavpaString("float/cluster");
    javax.ws.rs.core.Response response7 = gdbClusterApi4.avllResponse();
    javax.ws.rs.core.Response response8 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "float/cluster/cluster" + "'", str6,
        "float/cluster/cluster");
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
  }

  @Test
  public void test3131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3131");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1,
        "shorts/cluster/cluster/cluster/cluster/cluster/cluster/cluster", outputFormat3);
  }

  @Test
  public void test3132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3132");
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
    javax.ws.rs.core.Response response14 = gdbClusterApi4.diceResponse();
    javax.ws.rs.core.Response response15 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertNotNull(response6);
    org.junit.Assert.assertNotNull(response7);
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "strings/cluster/cluster" + "'", str11,
        "strings/cluster/cluster");
    org.junit.Assert.assertNotNull(response12);
    org.junit.Assert.assertNotNull(response13);
    org.junit.Assert.assertNotNull(response14);
    org.junit.Assert.assertNotNull(response15);
  }

  @Test
  public void test3133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3133");
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
    java.lang.String str16 = gdbClusterApi4.reavpaString("uri/cluster/cluster/cluster/cluster");
    java.lang.String str18 = gdbClusterApi4.reavpaString("bytes/cluster");
    java.lang.String str20 = gdbClusterApi4.reavpaString("integers/cluster/cluster/cluster");
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
        "'" + str16 + "' != '" + "uri/cluster/cluster/cluster/cluster/cluster" + "'", str16,
        "uri/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "bytes/cluster/cluster" + "'", str18,
        "bytes/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '" + "integers/cluster/cluster/cluster/cluster" + "'", str20,
        "integers/cluster/cluster/cluster/cluster");
  }

  @Test
  public void test3134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3134");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    java.lang.String str7 = gdbClusterApi4.reavpaString("booleans/cluster/cluster/cluster");
    java.lang.String str9 = gdbClusterApi4.reavpaString("dbms/cluster/cluster/cluster");
    java.lang.String str11 = gdbClusterApi4.reavpaString("shorts/cluster/cluster");
    java.lang.String str13 = gdbClusterApi4.reavpaString("booleans/cluster/cluster");
    java.lang.String str15 = gdbClusterApi4.reavpaString("map/cluster");
    javax.ws.rs.core.Response response16 = gdbClusterApi4.wraeResponse();
    javax.ws.rs.core.Response response17 = gdbClusterApi4.reoyResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "booleans/cluster/cluster/cluster/cluster" + "'", str7,
        "booleans/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '" + "dbms/cluster/cluster/cluster/cluster" + "'", str9,
        "dbms/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "shorts/cluster/cluster/cluster" + "'",
        str11, "shorts/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "booleans/cluster/cluster/cluster" + "'",
        str13, "booleans/cluster/cluster/cluster");
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "map/cluster/cluster" + "'", str15,
        "map/cluster/cluster");
    org.junit.Assert.assertNotNull(response16);
    org.junit.Assert.assertNotNull(response17);
  }

  @Test
  public void test3135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3135");
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
    javax.ws.rs.core.Response response10 = gdbClusterApi4.wraeResponse();
    org.junit.Assert.assertNotNull(response5);
    org.junit.Assert.assertEquals(
        "'" + str7 + "' != '" + "integers/cluster/cluster/cluster/cluster/cluster/cluster" + "'",
        str7, "integers/cluster/cluster/cluster/cluster/cluster/cluster");
    org.junit.Assert.assertNotNull(response8);
    org.junit.Assert.assertNotNull(response9);
    org.junit.Assert.assertNotNull(response10);
  }

  @Test
  public void test3136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3136");
    }
    org.neo4j.dbms.api.DatabaseManagementService databaseManagementService0 = null;
    org.neo4j.dbms.DatabaseStateService databaseStateService1 = null;
    org.neo4j.server.rest.repr.OutputFormat outputFormat3 = null;
    io.github.onograph.server.rest.cluster.GdbClusterApi gdbClusterApi4 = new io.github.onograph.server.rest.cluster.GdbClusterApi(
        databaseManagementService0, databaseStateService1, "byte/cluster", outputFormat3);
    javax.ws.rs.core.Response response5 = gdbClusterApi4.sttResponse();
    org.junit.Assert.assertNotNull(response5);
  }

  @Test
  public void test3137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest6.test3137");
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
}

